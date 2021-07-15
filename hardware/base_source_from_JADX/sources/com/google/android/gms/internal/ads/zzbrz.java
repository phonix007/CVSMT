package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbrz extends zzbpo<Long> implements zzbrk<Long>, zzbsx, RandomAccess {
    private static final zzbrz zzfru;
    private int size;
    private long[] zzfrv;

    zzbrz() {
        this(new long[10], 0);
    }

    private zzbrz(long[] jArr, int i) {
        this.zzfrv = jArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzakk();
        if (i2 >= i) {
            System.arraycopy(this.zzfrv, i2, this.zzfrv, i, this.size - i2);
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
        if (!(obj instanceof zzbrz)) {
            return super.equals(obj);
        }
        zzbrz zzbrz = (zzbrz) obj;
        if (this.size != zzbrz.size) {
            return false;
        }
        long[] jArr = zzbrz.zzfrv;
        for (int i = 0; i < this.size; i++) {
            if (this.zzfrv[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzbrf.zzbi(this.zzfrv[i2]);
        }
        return i;
    }

    public final long getLong(int i) {
        zzej(i);
        return this.zzfrv[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzbj(long j) {
        zzt(this.size, j);
    }

    private final void zzt(int i, long j) {
        zzakk();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzek(i));
        }
        if (this.size < this.zzfrv.length) {
            System.arraycopy(this.zzfrv, i, this.zzfrv, i + 1, this.size - i);
        } else {
            long[] jArr = new long[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzfrv, 0, jArr, 0, i);
            System.arraycopy(this.zzfrv, i, jArr, i + 1, this.size - i);
            this.zzfrv = jArr;
        }
        this.zzfrv[i] = j;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zzakk();
        zzbrf.checkNotNull(collection);
        if (!(collection instanceof zzbrz)) {
            return super.addAll(collection);
        }
        zzbrz zzbrz = (zzbrz) collection;
        if (zzbrz.size == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.size >= zzbrz.size) {
            int i = this.size + zzbrz.size;
            if (i > this.zzfrv.length) {
                this.zzfrv = Arrays.copyOf(this.zzfrv, i);
            }
            System.arraycopy(zzbrz.zzfrv, 0, this.zzfrv, this.size, zzbrz.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzakk();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzfrv[i]))) {
                System.arraycopy(this.zzfrv, i + 1, this.zzfrv, i, this.size - i);
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
        long longValue = ((Long) obj).longValue();
        zzakk();
        zzej(i);
        long j = this.zzfrv[i];
        this.zzfrv[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        zzakk();
        zzej(i);
        long j = this.zzfrv[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzfrv, i + 1, this.zzfrv, i, this.size - i);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzt(i, ((Long) obj).longValue());
    }

    public final /* synthetic */ zzbrk zzel(int i) {
        if (i >= this.size) {
            return new zzbrz(Arrays.copyOf(this.zzfrv, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzbrz zzbrz = new zzbrz();
        zzfru = zzbrz;
        zzbrz.zzakj();
    }
}
