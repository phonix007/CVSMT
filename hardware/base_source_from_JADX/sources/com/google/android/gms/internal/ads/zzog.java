package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

public final class zzog extends zzoj {
    private static final int[] zzbem = new int[0];
    private final zzon zzben;
    private final AtomicReference<zzoh> zzbeo;

    public zzog() {
        this((zzon) null);
    }

    private static int zze(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    private static boolean zze(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    private zzog(zzon zzon) {
        this.zzben = null;
        this.zzbeo = new AtomicReference<>(new zzoh());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x033f, code lost:
        r37 = r1;
        r9 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03f4, code lost:
        r42 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0463, code lost:
        r4 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0465, code lost:
        r2 = r2 + 1;
        r20 = r9;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0183, code lost:
        if (r8.zzzf <= r11) goto L_0x0188;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x01e9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzom[] zza(com.google.android.gms.internal.ads.zzga[] r47, com.google.android.gms.internal.ads.zzma[] r48, int[][][] r49) throws com.google.android.gms.internal.ads.zzff {
        /*
            r46 = this;
            r0 = r47
            int r3 = r0.length
            com.google.android.gms.internal.ads.zzom[] r4 = new com.google.android.gms.internal.ads.zzom[r3]
            r5 = r46
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.internal.ads.zzoh> r6 = r5.zzbeo
            java.lang.Object r6 = r6.get()
            com.google.android.gms.internal.ads.zzoh r6 = (com.google.android.gms.internal.ads.zzoh) r6
            r8 = 0
            r9 = 0
        L_0x0011:
            r10 = 2
            if (r8 >= r3) goto L_0x0254
            r14 = r0[r8]
            int r14 = r14.getTrackType()
            if (r10 != r14) goto L_0x023e
            if (r9 != 0) goto L_0x0231
            r9 = r48[r8]
            r14 = r49[r8]
            int r15 = r6.zzbet
            int r12 = r6.zzbeu
            int r10 = r6.zzbev
            int r7 = r6.viewportWidth
            int r11 = r6.viewportHeight
            boolean r13 = r6.zzbey
            boolean r5 = r6.zzbew
            boolean r2 = r6.zzbex
            r21 = r3
            r20 = r6
            r0 = 0
            r3 = 0
            r6 = 0
            r22 = 0
            r23 = -1
            r24 = -1
        L_0x003f:
            int r1 = r9.length
            if (r6 >= r1) goto L_0x0212
            com.google.android.gms.internal.ads.zzlz r1 = r9.zzau(r6)
            r25 = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r26 = r4
            int r4 = r1.length
            r9.<init>(r4)
            r27 = r8
            r4 = 0
        L_0x0055:
            int r8 = r1.length
            if (r4 >= r8) goto L_0x0063
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r9.add(r8)
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0063:
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r4) goto L_0x0139
            if (r11 != r4) goto L_0x006c
            goto L_0x0139
        L_0x006c:
            r28 = r3
            r8 = 0
        L_0x006f:
            int r3 = r1.length
            if (r8 >= r3) goto L_0x0103
            com.google.android.gms.internal.ads.zzfs r3 = r1.zzat(r8)
            r29 = r0
            int r0 = r3.width
            if (r0 <= 0) goto L_0x00e9
            int r0 = r3.height
            if (r0 <= 0) goto L_0x00e9
            int r0 = r3.width
            r30 = r5
            int r5 = r3.height
            if (r13 == 0) goto L_0x00a3
            if (r0 <= r5) goto L_0x008f
            r31 = r13
            r13 = 1
            goto L_0x0092
        L_0x008f:
            r31 = r13
            r13 = 0
        L_0x0092:
            if (r7 <= r11) goto L_0x0098
            r32 = r7
            r7 = 1
            goto L_0x009b
        L_0x0098:
            r32 = r7
            r7 = 0
        L_0x009b:
            if (r13 == r7) goto L_0x00a7
            r13 = r11
            r33 = r13
            r7 = r32
            goto L_0x00ac
        L_0x00a3:
            r32 = r7
            r31 = r13
        L_0x00a7:
            r7 = r11
            r33 = r7
            r13 = r32
        L_0x00ac:
            int r11 = r0 * r7
            r34 = r10
            int r10 = r5 * r13
            if (r11 < r10) goto L_0x00bf
            android.graphics.Point r5 = new android.graphics.Point
            int r0 = com.google.android.gms.internal.ads.zzqe.zzf(r10, r0)
            r5.<init>(r13, r0)
            r0 = r5
            goto L_0x00c8
        L_0x00bf:
            android.graphics.Point r0 = new android.graphics.Point
            int r5 = com.google.android.gms.internal.ads.zzqe.zzf(r11, r5)
            r0.<init>(r5, r7)
        L_0x00c8:
            int r5 = r3.width
            int r7 = r3.height
            int r5 = r5 * r7
            int r7 = r3.width
            int r10 = r0.x
            float r10 = (float) r10
            r11 = 1065017672(0x3f7ae148, float:0.98)
            float r10 = r10 * r11
            int r10 = (int) r10
            if (r7 < r10) goto L_0x00f3
            int r3 = r3.height
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = r0 * r11
            int r0 = (int) r0
            if (r3 < r0) goto L_0x00f3
            if (r5 >= r4) goto L_0x00f3
            r4 = r5
            goto L_0x00f3
        L_0x00e9:
            r30 = r5
            r32 = r7
            r34 = r10
            r33 = r11
            r31 = r13
        L_0x00f3:
            int r8 = r8 + 1
            r0 = r29
            r5 = r30
            r13 = r31
            r7 = r32
            r11 = r33
            r10 = r34
            goto L_0x006f
        L_0x0103:
            r29 = r0
            r30 = r5
            r32 = r7
            r34 = r10
            r33 = r11
            r31 = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L_0x0147
            int r0 = r9.size()
            r3 = 1
            int r0 = r0 - r3
        L_0x011a:
            if (r0 < 0) goto L_0x0147
            java.lang.Object r3 = r9.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.google.android.gms.internal.ads.zzfs r3 = r1.zzat(r3)
            int r3 = r3.zzce()
            r5 = -1
            if (r3 == r5) goto L_0x0133
            if (r3 <= r4) goto L_0x0136
        L_0x0133:
            r9.remove(r0)
        L_0x0136:
            int r0 = r0 + -1
            goto L_0x011a
        L_0x0139:
            r29 = r0
            r28 = r3
            r30 = r5
            r32 = r7
            r34 = r10
            r33 = r11
            r31 = r13
        L_0x0147:
            r0 = r14[r6]
            r4 = r22
            r5 = r23
            r7 = r24
            r3 = 0
        L_0x0150:
            int r8 = r1.length
            if (r3 >= r8) goto L_0x01f3
            r8 = r0[r3]
            boolean r8 = zze((int) r8, (boolean) r2)
            if (r8 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.zzfs r8 = r1.zzat(r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x018a
            int r10 = r8.width
            r11 = -1
            if (r10 == r11) goto L_0x0173
            int r10 = r8.width
            if (r10 > r15) goto L_0x018a
        L_0x0173:
            int r10 = r8.height
            if (r10 == r11) goto L_0x017b
            int r10 = r8.height
            if (r10 > r12) goto L_0x018a
        L_0x017b:
            int r10 = r8.zzzf
            if (r10 == r11) goto L_0x0186
            int r10 = r8.zzzf
            r11 = r34
            if (r10 > r11) goto L_0x018c
            goto L_0x0188
        L_0x0186:
            r11 = r34
        L_0x0188:
            r10 = 1
            goto L_0x018d
        L_0x018a:
            r11 = r34
        L_0x018c:
            r10 = 0
        L_0x018d:
            if (r10 != 0) goto L_0x0197
            if (r30 == 0) goto L_0x0192
            goto L_0x0197
        L_0x0192:
            r36 = r0
            r35 = r1
            goto L_0x01e9
        L_0x0197:
            if (r10 == 0) goto L_0x019d
            r35 = r1
            r13 = 2
            goto L_0x01a0
        L_0x019d:
            r35 = r1
            r13 = 1
        L_0x01a0:
            r1 = r0[r3]
            r36 = r0
            r0 = 0
            boolean r1 = zze((int) r1, (boolean) r0)
            if (r1 == 0) goto L_0x01ad
            int r13 = r13 + 1000
        L_0x01ad:
            if (r13 <= r4) goto L_0x01b1
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r13 != r4) goto L_0x01d5
            int r0 = r8.zzce()
            if (r0 == r5) goto L_0x01c3
            int r0 = r8.zzce()
            int r0 = zze((int) r0, (int) r5)
            goto L_0x01c9
        L_0x01c3:
            int r0 = r8.zzzf
            int r0 = zze((int) r0, (int) r7)
        L_0x01c9:
            if (r1 == 0) goto L_0x01d0
            if (r10 == 0) goto L_0x01d0
            if (r0 <= 0) goto L_0x01d4
            goto L_0x01d2
        L_0x01d0:
            if (r0 >= 0) goto L_0x01d4
        L_0x01d2:
            r0 = 1
            goto L_0x01d5
        L_0x01d4:
            r0 = 0
        L_0x01d5:
            if (r0 == 0) goto L_0x01e9
            int r7 = r8.zzzf
            int r5 = r8.zzce()
            r28 = r3
            r4 = r13
            r29 = r35
            goto L_0x01e9
        L_0x01e3:
            r36 = r0
            r35 = r1
            r11 = r34
        L_0x01e9:
            int r3 = r3 + 1
            r34 = r11
            r1 = r35
            r0 = r36
            goto L_0x0150
        L_0x01f3:
            r11 = r34
            int r6 = r6 + 1
            r22 = r4
            r23 = r5
            r24 = r7
            r10 = r11
            r9 = r25
            r4 = r26
            r8 = r27
            r3 = r28
            r0 = r29
            r5 = r30
            r13 = r31
            r7 = r32
            r11 = r33
            goto L_0x003f
        L_0x0212:
            r29 = r0
            r28 = r3
            r26 = r4
            r27 = r8
            if (r29 != 0) goto L_0x021e
            r12 = 0
            goto L_0x0227
        L_0x021e:
            com.google.android.gms.internal.ads.zzoi r12 = new com.google.android.gms.internal.ads.zzoi
            r1 = r28
            r0 = r29
            r12.<init>(r0, r1)
        L_0x0227:
            r26[r27] = r12
            r0 = r26[r27]
            if (r0 == 0) goto L_0x022f
            r9 = 1
            goto L_0x0239
        L_0x022f:
            r9 = 0
            goto L_0x0239
        L_0x0231:
            r21 = r3
            r26 = r4
            r20 = r6
            r27 = r8
        L_0x0239:
            r1 = r48[r27]
            int r1 = r1.length
            goto L_0x0246
        L_0x023e:
            r21 = r3
            r26 = r4
            r20 = r6
            r27 = r8
        L_0x0246:
            int r8 = r27 + 1
            r6 = r20
            r3 = r21
            r4 = r26
            r0 = r47
            r5 = r46
            goto L_0x0011
        L_0x0254:
            r26 = r4
            r20 = r6
            r1 = r3
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x025c:
            if (r2 >= r1) goto L_0x046d
            r5 = r47
            r6 = r5[r2]
            int r6 = r6.getTrackType()
            switch(r6) {
                case 1: goto L_0x0347;
                case 2: goto L_0x033f;
                case 3: goto L_0x0284;
                default: goto L_0x0269;
            }
        L_0x0269:
            r37 = r1
            r42 = r4
            r9 = r20
            r4 = -1
            r12 = 0
            r17 = 2
            r1 = r5[r2]
            r1.getTrackType()
            r1 = r48[r2]
            r7 = r49[r2]
            boolean r8 = r9.zzbex
            r11 = r12
            r10 = 0
            r13 = 0
            r14 = 0
            goto L_0x03fb
        L_0x0284:
            if (r4 != 0) goto L_0x033f
            r4 = r48[r2]
            r8 = r49[r2]
            r9 = r20
            boolean r11 = r9.zzbex
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0292:
            int r7 = r4.length
            if (r12 >= r7) goto L_0x0326
            com.google.android.gms.internal.ads.zzlz r7 = r4.zzau(r12)
            r20 = r8[r12]
            r37 = r1
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = 0
        L_0x02a2:
            int r1 = r7.length
            if (r13 >= r1) goto L_0x0317
            r1 = r20[r13]
            boolean r1 = zze((int) r1, (boolean) r11)
            if (r1 == 0) goto L_0x0306
            com.google.android.gms.internal.ads.zzfs r1 = r7.zzat(r13)
            r38 = r4
            int r4 = r1.zzzz
            r19 = 1
            r4 = r4 & 1
            if (r4 == 0) goto L_0x02c0
            r39 = r7
            r4 = 1
            goto L_0x02c3
        L_0x02c0:
            r39 = r7
            r4 = 0
        L_0x02c3:
            int r7 = r1.zzzz
            r17 = 2
            r7 = r7 & 2
            if (r7 == 0) goto L_0x02d0
            r40 = r8
            r7 = 1
        L_0x02ce:
            r8 = 0
            goto L_0x02d4
        L_0x02d0:
            r40 = r8
            r7 = 0
            goto L_0x02ce
        L_0x02d4:
            boolean r21 = zza(r1, r8)
            if (r21 == 0) goto L_0x02e4
            if (r4 == 0) goto L_0x02de
            r1 = 6
            goto L_0x02f4
        L_0x02de:
            if (r7 != 0) goto L_0x02e2
            r1 = 5
            goto L_0x02f4
        L_0x02e2:
            r1 = 4
            goto L_0x02f4
        L_0x02e4:
            if (r4 == 0) goto L_0x02e8
            r1 = 3
            goto L_0x02f4
        L_0x02e8:
            if (r7 == 0) goto L_0x030e
            r4 = 0
            boolean r1 = zza(r1, r4)
            if (r1 == 0) goto L_0x02f3
            r1 = 2
            goto L_0x02f4
        L_0x02f3:
            r1 = 1
        L_0x02f4:
            r4 = r20[r13]
            r7 = 0
            boolean r4 = zze((int) r4, (boolean) r7)
            if (r4 == 0) goto L_0x02ff
            int r1 = r1 + 1000
        L_0x02ff:
            if (r1 <= r10) goto L_0x030e
            r10 = r1
            r15 = r13
            r14 = r39
            goto L_0x030e
        L_0x0306:
            r38 = r4
            r39 = r7
            r40 = r8
            r17 = 2
        L_0x030e:
            int r13 = r13 + 1
            r4 = r38
            r7 = r39
            r8 = r40
            goto L_0x02a2
        L_0x0317:
            r38 = r4
            r40 = r8
            r17 = 2
            int r12 = r12 + 1
            r13 = r14
            r14 = r15
            r1 = r37
            r15 = r10
            goto L_0x0292
        L_0x0326:
            r37 = r1
            r17 = 2
            if (r13 != 0) goto L_0x032e
            r12 = 0
            goto L_0x0333
        L_0x032e:
            com.google.android.gms.internal.ads.zzoi r12 = new com.google.android.gms.internal.ads.zzoi
            r12.<init>(r13, r14)
        L_0x0333:
            r26[r2] = r12
            r1 = r26[r2]
            if (r1 == 0) goto L_0x033b
            r1 = 1
            goto L_0x033c
        L_0x033b:
            r1 = 0
        L_0x033c:
            r4 = r1
            goto L_0x03ef
        L_0x033f:
            r37 = r1
            r9 = r20
            r17 = 2
            goto L_0x03f4
        L_0x0347:
            r37 = r1
            r9 = r20
            r17 = 2
            if (r3 != 0) goto L_0x03f4
            r1 = r48[r2]
            r3 = r49[r2]
            boolean r7 = r9.zzbex
            r8 = 0
            r10 = -1
            r11 = -1
            r12 = 0
        L_0x0359:
            int r13 = r1.length
            if (r8 >= r13) goto L_0x03d2
            com.google.android.gms.internal.ads.zzlz r13 = r1.zzau(r8)
            r14 = r3[r8]
            r41 = r3
            r15 = r12
            r12 = r11
            r11 = r10
            r10 = 0
        L_0x0369:
            int r3 = r13.length
            if (r10 >= r3) goto L_0x03c2
            r3 = r14[r10]
            boolean r3 = zze((int) r3, (boolean) r7)
            if (r3 == 0) goto L_0x03b2
            com.google.android.gms.internal.ads.zzfs r3 = r13.zzat(r10)
            r42 = r4
            r4 = r14[r10]
            r43 = r7
            int r7 = r3.zzzz
            r19 = 1
            r7 = r7 & 1
            if (r7 == 0) goto L_0x038c
            r44 = r12
            r7 = 1
        L_0x038a:
            r12 = 0
            goto L_0x0390
        L_0x038c:
            r44 = r12
            r7 = 0
            goto L_0x038a
        L_0x0390:
            boolean r3 = zza(r3, r12)
            if (r3 == 0) goto L_0x039d
            if (r7 == 0) goto L_0x039b
            r3 = 4
        L_0x0399:
            r7 = 0
            goto L_0x03a3
        L_0x039b:
            r3 = 3
            goto L_0x0399
        L_0x039d:
            if (r7 == 0) goto L_0x03a1
            r3 = 2
            goto L_0x0399
        L_0x03a1:
            r3 = 1
            goto L_0x0399
        L_0x03a3:
            boolean r4 = zze((int) r4, (boolean) r7)
            if (r4 == 0) goto L_0x03ab
            int r3 = r3 + 1000
        L_0x03ab:
            if (r3 <= r15) goto L_0x03b9
            r15 = r3
            r11 = r8
            r44 = r10
            goto L_0x03b9
        L_0x03b2:
            r42 = r4
            r43 = r7
            r44 = r12
            r12 = 0
        L_0x03b9:
            int r10 = r10 + 1
            r4 = r42
            r7 = r43
            r12 = r44
            goto L_0x0369
        L_0x03c2:
            r42 = r4
            r43 = r7
            r44 = r12
            r12 = 0
            int r8 = r8 + 1
            r10 = r11
            r12 = r15
            r3 = r41
            r11 = r44
            goto L_0x0359
        L_0x03d2:
            r42 = r4
            r4 = -1
            r12 = 0
            if (r10 != r4) goto L_0x03da
            r3 = r12
            goto L_0x03e3
        L_0x03da:
            com.google.android.gms.internal.ads.zzlz r1 = r1.zzau(r10)
            com.google.android.gms.internal.ads.zzoi r3 = new com.google.android.gms.internal.ads.zzoi
            r3.<init>(r1, r11)
        L_0x03e3:
            r26[r2] = r3
            r1 = r26[r2]
            if (r1 == 0) goto L_0x03eb
            r1 = 1
            goto L_0x03ec
        L_0x03eb:
            r1 = 0
        L_0x03ec:
            r3 = r1
            r4 = r42
        L_0x03ef:
            r1 = 0
            r18 = 1
            goto L_0x0465
        L_0x03f4:
            r42 = r4
            r1 = 0
            r18 = 1
            goto L_0x0463
        L_0x03fb:
            int r15 = r1.length
            if (r10 >= r15) goto L_0x0455
            com.google.android.gms.internal.ads.zzlz r15 = r1.zzau(r10)
            r16 = r7[r10]
            r4 = r14
            r14 = r13
            r13 = r11
            r11 = 0
        L_0x0409:
            int r12 = r15.length
            if (r11 >= r12) goto L_0x0446
            r12 = r16[r11]
            boolean r12 = zze((int) r12, (boolean) r8)
            if (r12 == 0) goto L_0x043c
            com.google.android.gms.internal.ads.zzfs r12 = r15.zzat(r11)
            int r12 = r12.zzzz
            r18 = 1
            r12 = r12 & 1
            if (r12 == 0) goto L_0x0423
            r12 = 1
            goto L_0x0424
        L_0x0423:
            r12 = 0
        L_0x0424:
            if (r12 == 0) goto L_0x0428
            r12 = 2
            goto L_0x0429
        L_0x0428:
            r12 = 1
        L_0x0429:
            r0 = r16[r11]
            r45 = r1
            r1 = 0
            boolean r0 = zze((int) r0, (boolean) r1)
            if (r0 == 0) goto L_0x0436
            int r12 = r12 + 1000
        L_0x0436:
            if (r12 <= r4) goto L_0x0441
            r14 = r11
            r4 = r12
            r13 = r15
            goto L_0x0441
        L_0x043c:
            r45 = r1
            r1 = 0
            r18 = 1
        L_0x0441:
            int r11 = r11 + 1
            r1 = r45
            goto L_0x0409
        L_0x0446:
            r45 = r1
            r1 = 0
            r18 = 1
            int r10 = r10 + 1
            r11 = r13
            r13 = r14
            r1 = r45
            r12 = 0
            r14 = r4
            r4 = -1
            goto L_0x03fb
        L_0x0455:
            r1 = 0
            r18 = 1
            if (r11 != 0) goto L_0x045c
            r12 = 0
            goto L_0x0461
        L_0x045c:
            com.google.android.gms.internal.ads.zzoi r12 = new com.google.android.gms.internal.ads.zzoi
            r12.<init>(r11, r13)
        L_0x0461:
            r26[r2] = r12
        L_0x0463:
            r4 = r42
        L_0x0465:
            int r2 = r2 + 1
            r20 = r9
            r1 = r37
            goto L_0x025c
        L_0x046d:
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzog.zza(com.google.android.gms.internal.ads.zzga[], com.google.android.gms.internal.ads.zzma[], int[][][]):com.google.android.gms.internal.ads.zzom[]");
    }

    private static boolean zza(zzfs zzfs, String str) {
        return str != null && TextUtils.equals(str, zzqe.zzai(zzfs.zzaaa));
    }
}
