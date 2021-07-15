package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbre extends zzbpo<Integer> implements zzbrk<Integer>, zzbsx, RandomAccess {
    private static final zzbre zzfqp;
    private int size;
    private int[] zzfqq;

    public static zzbre zzanb() {
        return zzfqp;
    }

    zzbre() {
        this(new int[10], 0);
    }

    private zzbre(int[] iArr, int i) {
        this.zzfqq = iArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzakk();
        if (i2 >= i) {
            System.arraycopy(this.zzfqq, i2, this.zzfqq, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbre)) {
            return super.equals(obj);
        }
        zzbre zzbre = (zzbre) obj;
        if (this.size != zzbre.size) {
            return false;
        }
        int[] iArr = zzbre.zzfqq;
        for (int i = 0; i < this.size; i++) {
            if (this.zzfqq[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzfqq[i2];
        }
        return i;
    }

    public final int getInt(int i) {
        zzej(i);
        return this.zzfqq[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzfo(int i) {
        zzah(this.size, i);
    }

    private final void zzah(int i, int i2) {
        zzakk();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzek(i));
        }
        if (this.size < this.zzfqq.length) {
            System.arraycopy(this.zzfqq, i, this.zzfqq, i + 1, this.size - i);
        } else {
            int[] iArr = new int[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzfqq, 0, iArr, 0, i);
            System.arraycopy(this.zzfqq, i, iArr, i + 1, this.size - i);
            this.zzfqq = iArr;
        }
        this.zzfqq[i] = i2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzakk();
        zzbrf.checkNotNull(collection);
        if (!(collection instanceof zzbre)) {
            return super.addAll(collection);
        }
        zzbre zzbre = (zzbre) collection;
        if (zzbre.size == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.size >= zzbre.size) {
            int i = this.size + zzbre.size;
            if (i > this.zzfqq.length) {
                this.zzfqq = Arrays.copyOf(this.zzfqq, i);
            }
            System.arraycopy(zzbre.zzfqq, 0, this.zzfqq, this.size, zzbre.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzakk();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzfqq[i]))) {
                System.arraycopy(this.zzfqq, i + 1, this.zzfqq, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzej(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzek(i));
        }
    }

    private final String zzek(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzakk();
        zzej(i);
        int i2 = this.zzfqq[i];
        this.zzfqq[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        zzakk();
        zzej(i);
        int i2 = this.zzfqq[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzfqq, i + 1, this.zzfqq, i, this.size - i);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzah(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ zzbrk zzel(int i) {
        if (i >= this.size) {
            return new zzbre(Arrays.copyOf(this.zzfqq, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzbre zzbre = new zzbre();
        zzfqp = zzbre;
        zzbre.zzakj();
    }
}
