package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Arrays;

public abstract class zzod implements zzom {
    private final int length;
    private int zzaac;
    private final zzfs[] zzayc;
    private final zzlz zzbej;
    private final int[] zzbek;
    private final long[] zzbel;

    public zzod(zzlz zzlz, int... iArr) {
        zzpo.checkState(iArr.length > 0);
        this.zzbej = (zzlz) zzpo.checkNotNull(zzlz);
        this.length = iArr.length;
        this.zzayc = new zzfs[this.length];
        for (int i = 0; i < iArr.length; i++) {
            this.zzayc[i] = zzlz.zzat(iArr[i]);
        }
        Arrays.sort(this.zzayc, new zzof());
        this.zzbek = new int[this.length];
        for (int i2 = 0; i2 < this.length; i2++) {
            this.zzbek[i2] = zzlz.zzi(this.zzayc[i2]);
        }
        this.zzbel = new long[this.length];
    }

    public final zzlz zzgk() {
        return this.zzbej;
    }

    public final int length() {
        return this.zzbek.length;
    }

    public final zzfs zzat(int i) {
        return this.zzayc[i];
    }

    public final int zzbd(int i) {
        return this.zzbek[i];
    }

    public final int zzi(zzfs zzfs) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzayc[i] == zzfs) {
                return i;
            }
        }
        return -1;
    }

    public final zzfs zzgl() {
        return this.zzayc[zzgm()];
    }

    public final boolean zzf(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean zzg = zzg(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.length && !zzg) {
            zzg = i2 != i && !zzg(i2, elapsedRealtime);
            i2++;
        }
        if (!zzg) {
            return false;
        }
        this.zzbel[i] = Math.max(this.zzbel[i], elapsedRealtime + 60000);
        return true;
    }

    private final boolean zzg(int i, long j) {
        return this.zzbel[i] > j;
    }

    public int hashCode() {
        if (this.zzaac == 0) {
            this.zzaac = (System.identityHashCode(this.zzbej) * 31) + Arrays.hashCode(this.zzbek);
        }
        return this.zzaac;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzod zzod = (zzod) obj;
        return this.zzbej == zzod.zzbej && Arrays.equals(this.zzbek, zzod.zzbek);
    }
}
