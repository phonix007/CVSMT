package com.google.android.gms.internal.ads;

public abstract class zzgc {
    public static final zzgc zzaal = new zzgd();

    public abstract zzge zza(int i, zzge zzge, boolean z);

    public abstract zzgf zza(int i, zzgf zzgf, boolean z, long j);

    public abstract int zzc(Object obj);

    public abstract int zzck();

    public abstract int zzcl();

    public final boolean isEmpty() {
        return zzck() == 0;
    }

    private final zzgf zza(int i, zzgf zzgf) {
        return zza(i, zzgf, false, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if ((zzck() - 1) == 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(int r3, com.google.android.gms.internal.ads.zzge r4, com.google.android.gms.internal.ads.zzgf r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.zza(r3, r4, r0)
            com.google.android.gms.internal.ads.zzgf r4 = r2.zza(r0, r5)
            int r4 = r4.zzaav
            r1 = 1
            if (r4 != r3) goto L_0x002f
            r3 = -1
            switch(r6) {
                case 0: goto L_0x0020;
                case 1: goto L_0x001e;
                case 2: goto L_0x0017;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0017:
            int r4 = r2.zzck()
            int r4 = r4 - r1
            if (r4 != 0) goto L_0x0028
        L_0x001e:
            r1 = 0
            goto L_0x0028
        L_0x0020:
            int r4 = r2.zzck()
            int r4 = r4 - r1
            if (r4 != 0) goto L_0x0028
            r1 = -1
        L_0x0028:
            if (r1 != r3) goto L_0x002b
            return r3
        L_0x002b:
            r2.zza(r1, r5)
            return r0
        L_0x002f:
            int r3 = r3 + r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgc.zza(int, com.google.android.gms.internal.ads.zzge, com.google.android.gms.internal.ads.zzgf, int):int");
    }
}
