package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzbqn extends zzbpo<Double> implements zzbrk<Double>, zzbsx, RandomAccess {
    private static final zzbqn zzfmn;
    private int size;
    private double[] zzfmo;

    zzbqn() {
        this(new double[10], 0);
    }

    private zzbqn(double[] dArr, int i) {
        this.zzfmo = dArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzakk();
        if (i2 >= i) {
            System.arraycopy(this.zzfmo, i2, this.zzfmo, i, this.size - i2);
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
        if (!(obj instanceof zzbqn)) {
            return super.equals(obj);
        }
        zzbqn zzbqn = (zzbqn) obj;
        if (this.size != zzbqn.size) {
            return false;
        }
        double[] dArr = zzbqn.zzfmo;
        for (int i = 0; i < this.size; i++) {
            if (this.zzfmo[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzbrf.zzbi(Double.doubleToLongBits(this.zzfmo[i2]));
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzd(double d) {
        zzd(this.size, d);
    }

    private final void zzd(int i, double d) {
        zzakk();
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException(zzek(i));
        }
        if (this.size < this.zzfmo.length) {
            System.arraycopy(this.zzfmo, i, this.zzfmo, i + 1, this.size - i);
        } else {
            double[] dArr = new double[(((this.size * 3) / 2) + 1)];
            System.arraycopy(this.zzfmo, 0, dArr, 0, i);
            System.arraycopy(this.zzfmo, i, dArr, i + 1, this.size - i);
            this.zzfmo = dArr;
        }
        this.zzfmo[i] = d;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zzakk();
        zzbrf.checkNotNull(collection);
        if (!(collection instanceof zzbqn)) {
            return super.addAll(collection);
        }
        zzbqn zzbqn = (zzbqn) collection;
        if (zzbqn.size == 0) {
            return false;
        }
        if (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.size >= zzbqn.size) {
            int i = this.size + zzbqn.size;
            if (i > this.zzfmo.length) {
                this.zzfmo = Arrays.copyOf(this.zzfmo, i);
            }
            System.arraycopy(zzbqn.zzfmo, 0, this.zzfmo, this.size, zzbqn.size);
            this.size = i;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzakk();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzfmo[i]))) {
                System.arraycopy(this.zzfmo, i + 1, this.zzfmo, i, this.size - i);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzakk();
        zzej(i);
        double d = this.zzfmo[i];
        this.zzfmo[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        zzakk();
        zzej(i);
        double d = this.zzfmo[i];
        if (i < this.size - 1) {
            System.arraycopy(this.zzfmo, i + 1, this.zzfmo, i, this.size - i);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzd(i, ((Double) obj).doubleValue());
    }

    public final /* synthetic */ zzbrk zzel(int i) {
        if (i >= this.size) {
            return new zzbqn(Arrays.copyOf(this.zzfmo, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzej(i);
        return Double.valueOf(this.zzfmo[i]);
    }

    static {
        zzbqn zzbqn = new zzbqn();
        zzfmn = zzbqn;
        zzbqn.zzakj();
    }
}
