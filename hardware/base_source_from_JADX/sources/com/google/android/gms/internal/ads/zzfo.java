package com.google.android.gms.internal.ads;

import android.util.Log;

final class zzfo {
    public final int index;
    private final zzfz[] zzwu;
    private final zzop zzwv;
    private final zzga[] zzxs;
    private final zzfw zzxt;
    private final zzlo zzxz;
    public final zzlm zzym;
    public final Object zzyn;
    public final zzlv[] zzyo;
    private final boolean[] zzyp;
    public final long zzyq;
    public int zzyr;
    public long zzys;
    public boolean zzyt;
    public boolean zzyu;
    public boolean zzyv;
    public zzfo zzyw;
    public zzor zzyx;
    private zzor zzyy;

    public zzfo(zzfz[] zzfzArr, zzga[] zzgaArr, long j, zzop zzop, zzfw zzfw, zzlo zzlo, Object obj, int i, int i2, boolean z, long j2) {
        this.zzwu = zzfzArr;
        this.zzxs = zzgaArr;
        this.zzyq = j;
        this.zzwv = zzop;
        this.zzxt = zzfw;
        this.zzxz = zzlo;
        this.zzyn = zzpo.checkNotNull(obj);
        this.index = i;
        this.zzyr = i2;
        this.zzyt = z;
        this.zzys = j2;
        this.zzyo = new zzlv[zzfzArr.length];
        this.zzyp = new boolean[zzfzArr.length];
        this.zzym = zzlo.zza(i2, zzfw.zzci());
    }

    public final long zzcb() {
        return this.zzyq - this.zzys;
    }

    public final void zzc(int i, boolean z) {
        this.zzyr = i;
        this.zzyt = z;
    }

    public final boolean zzcc() {
        if (this.zzyu) {
            return !this.zzyv || this.zzym.zzez() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzcd() throws com.google.android.gms.internal.ads.zzff {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzop r0 = r6.zzwv
            com.google.android.gms.internal.ads.zzga[] r1 = r6.zzxs
            com.google.android.gms.internal.ads.zzlm r2 = r6.zzym
            com.google.android.gms.internal.ads.zzma r2 = r2.zzex()
            com.google.android.gms.internal.ads.zzor r0 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzor r1 = r6.zzyy
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzoo r5 = r0.zzbfl
            int r5 = r5.length
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.zza(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.zzyx = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfo.zzcd():boolean");
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzwu.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zzoo zzoo = this.zzyx.zzbfl;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzoo.length) {
                break;
            }
            boolean[] zArr2 = this.zzyp;
            if (z || !this.zzyx.zza(this.zzyy, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzym.zza(zzoo.zzgp(), this.zzyp, this.zzyo, zArr, j);
        this.zzyy = this.zzyx;
        this.zzyv = false;
        for (int i2 = 0; i2 < this.zzyo.length; i2++) {
            if (this.zzyo[i2] != null) {
                zzpo.checkState(zzoo.zzbe(i2) != null);
                this.zzyv = true;
            } else {
                zzpo.checkState(zzoo.zzbe(i2) == null);
            }
        }
        this.zzxt.zza(this.zzwu, this.zzyx.zzbfk, zzoo);
        return zza;
    }

    public final void release() {
        try {
            this.zzxz.zzb(this.zzym);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
