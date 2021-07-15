package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
public final class zzqs {
    private final zzqt zzbjy;
    private final boolean zzbjz;
    private final long zzbka;
    private final long zzbkb;
    private long zzbkc;
    private long zzbkd;
    private long zzbke;
    private boolean zzbkf;
    private long zzbkg;
    private long zzbkh;
    private long zzbki;

    public zzqs() {
        this(-1.0d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqs(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqs.<init>(android.content.Context):void");
    }

    private zzqs(double d) {
        this.zzbjz = d != -1.0d;
        if (this.zzbjz) {
            this.zzbjy = zzqt.zzhv();
            this.zzbka = (long) (1.0E9d / d);
            this.zzbkb = (this.zzbka * 80) / 100;
            return;
        }
        this.zzbjy = null;
        this.zzbka = -1;
        this.zzbkb = -1;
    }

    public final void enable() {
        this.zzbkf = false;
        if (this.zzbjz) {
            this.zzbjy.zzhw();
        }
    }

    public final void disable() {
        if (this.zzbjz) {
            this.zzbjy.zzhx();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzh(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.zzbkf
            if (r2 == 0) goto L_0x0044
            long r2 = r11.zzbkc
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.zzbki
            r4 = 1
            long r2 = r2 + r4
            r11.zzbki = r2
            long r2 = r11.zzbke
            r11.zzbkd = r2
        L_0x0019:
            long r2 = r11.zzbki
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            long r2 = r11.zzbkh
            long r2 = r0 - r2
            long r4 = r11.zzbki
            long r2 = r2 / r4
            long r4 = r11.zzbkd
            long r2 = r2 + r4
            boolean r4 = r11.zzi(r2, r14)
            if (r4 == 0) goto L_0x0035
            r11.zzbkf = r6
            goto L_0x0044
        L_0x0035:
            long r4 = r11.zzbkg
            long r4 = r4 + r2
            long r6 = r11.zzbkh
            long r4 = r4 - r6
            goto L_0x0046
        L_0x003c:
            boolean r2 = r11.zzi(r0, r14)
            if (r2 == 0) goto L_0x0044
            r11.zzbkf = r6
        L_0x0044:
            r4 = r14
            r2 = r0
        L_0x0046:
            boolean r6 = r11.zzbkf
            r7 = 0
            if (r6 != 0) goto L_0x0055
            r11.zzbkh = r0
            r11.zzbkg = r14
            r11.zzbki = r7
            r14 = 1
            r11.zzbkf = r14
        L_0x0055:
            r11.zzbkc = r12
            r11.zzbke = r2
            com.google.android.gms.internal.ads.zzqt r12 = r11.zzbjy
            if (r12 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.zzqt r12 = r11.zzbjy
            long r12 = r12.zzbkj
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            com.google.android.gms.internal.ads.zzqt r12 = r11.zzbjy
            long r12 = r12.zzbkj
            long r14 = r11.zzbka
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            long r14 = r12 - r14
            goto L_0x007e
        L_0x0079:
            r0 = 0
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x007e:
            r0 = 0
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r12 = r14
        L_0x0088:
            long r14 = r11.zzbkb
            long r12 = r12 - r14
            return r12
        L_0x008c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqs.zzh(long, long):long");
    }

    private final boolean zzi(long j, long j2) {
        return Math.abs((j2 - this.zzbkg) - (j - this.zzbkh)) > 20000000;
    }
}
