package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class zzbsp<T> implements zzbtc<T> {
    private static final int[] zzfsg = new int[0];
    private static final Unsafe zzfsh = zzbua.zzape();
    private final int[] zzfsi;
    private final Object[] zzfsj;
    private final int zzfsk;
    private final int zzfsl;
    private final zzbsl zzfsm;
    private final boolean zzfsn;
    private final boolean zzfso;
    private final boolean zzfsp;
    private final boolean zzfsq;
    private final int[] zzfsr;
    private final int zzfss;
    private final int zzfst;
    private final zzbst zzfsu;
    private final zzbrv zzfsv;
    private final zzbtu<?, ?> zzfsw;
    private final zzbqr<?> zzfsx;
    private final zzbsg zzfsy;

    private zzbsp(int[] iArr, Object[] objArr, int i, int i2, zzbsl zzbsl, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzbst zzbst, zzbrv zzbrv, zzbtu<?, ?> zzbtu, zzbqr<?> zzbqr, zzbsg zzbsg) {
        this.zzfsi = iArr;
        this.zzfsj = objArr;
        this.zzfsk = i;
        this.zzfsl = i2;
        this.zzfso = zzbsl instanceof zzbrd;
        this.zzfsp = z;
        this.zzfsn = zzbqr != null && zzbqr.zzh(zzbsl);
        this.zzfsq = false;
        this.zzfsr = iArr2;
        this.zzfss = i3;
        this.zzfst = i4;
        this.zzfsu = zzbst;
        this.zzfsv = zzbrv;
        this.zzfsw = zzbtu;
        this.zzfsx = zzbqr;
        this.zzfsm = zzbsl;
        this.zzfsy = zzbsg;
    }

    private static boolean zzfv(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x040e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.zzbsp<T> zza(java.lang.Class<T> r37, com.google.android.gms.internal.ads.zzbsj r38, com.google.android.gms.internal.ads.zzbst r39, com.google.android.gms.internal.ads.zzbrv r40, com.google.android.gms.internal.ads.zzbtu<?, ?> r41, com.google.android.gms.internal.ads.zzbqr<?> r42, com.google.android.gms.internal.ads.zzbsg r43) {
        /*
            r0 = r38
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzbta
            if (r1 == 0) goto L_0x0487
            com.google.android.gms.internal.ads.zzbta r0 = (com.google.android.gms.internal.ads.zzbta) r0
            int r1 = r0.zzanz()
            int r2 = com.google.android.gms.internal.ads.zzbrd.zze.zzfqk
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.zzaoi()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x002c:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x002c
        L_0x003c:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x0060
        L_0x005f:
            r12 = r8
        L_0x0060:
            if (r9 != 0) goto L_0x006e
            int[] r8 = zzfsg
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x01a1
        L_0x006e:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007a:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x007a
        L_0x008a:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008f
        L_0x008e:
            r12 = r8
        L_0x008f:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ae
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009b:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x009b
        L_0x00ab:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00af
        L_0x00ae:
            r13 = r8
        L_0x00af:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cf
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bb:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00cb
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00bb
        L_0x00cb:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00d0
        L_0x00cf:
            r14 = r8
        L_0x00d0:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ec
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00dc
        L_0x00ec:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00f1
        L_0x00f0:
            r15 = r8
        L_0x00f1:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0113
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fd:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fd
        L_0x010e:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0113:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0136
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011f:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0131
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011f
        L_0x0131:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0136:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r36 = r16
            r16 = r15
            r15 = r36
        L_0x0148:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015b
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0148
        L_0x015b:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0164
        L_0x0162:
            r3 = r16
        L_0x0164:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r36 = r16
            r16 = r3
            r3 = r36
        L_0x0176:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0189
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0176
        L_0x0189:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018f:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r36 = r15
            r15 = r10
            r10 = r12
            r12 = r16
            r16 = r36
        L_0x01a1:
            sun.misc.Unsafe r6 = zzfsh
            java.lang.Object[] r17 = r0.zzaoj()
            com.google.android.gms.internal.ads.zzbsl r18 = r0.zzaob()
            java.lang.Class r7 = r18.getClass()
            r22 = r12
            int r12 = r14 * 3
            int[] r12 = new int[r12]
            int r14 = r14 << r4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r18 = r3 + r8
            r23 = r3
            r20 = r15
            r8 = r22
            r15 = 0
            r19 = 0
            r22 = r18
        L_0x01c5:
            if (r8 >= r2) goto L_0x0459
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r4) goto L_0x01f9
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r36 = r24
            r24 = r8
            r8 = r36
        L_0x01dc:
            int r26 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r4) goto L_0x01f2
            r4 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r24 = r24 | r4
            int r25 = r25 + 13
            r8 = r26
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01dc
        L_0x01f2:
            int r4 = r8 << r25
            r8 = r24 | r4
            r4 = r26
            goto L_0x01fb
        L_0x01f9:
            r4 = r24
        L_0x01fb:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x022f
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
            r36 = r24
            r24 = r4
            r4 = r36
        L_0x0212:
            int r26 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0228
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r24 = r24 | r2
            int r25 = r25 + 13
            r4 = r26
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0212
        L_0x0228:
            int r2 = r4 << r25
            r4 = r24 | r2
            r2 = r26
            goto L_0x0231
        L_0x022f:
            r2 = r24
        L_0x0231:
            r28 = r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r29 = r11
            r11 = r4 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0240
            int r11 = r15 + 1
            r16[r15] = r19
            r15 = r11
        L_0x0240:
            com.google.android.gms.internal.ads.zzbqx r11 = com.google.android.gms.internal.ads.zzbqx.MAP
            int r11 = r11.mo10484id()
            if (r3 <= r11) goto L_0x0301
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r30 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r11) goto L_0x0278
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r24 = r2
            r2 = r30
            r25 = 13
        L_0x025d:
            int r26 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r11) goto L_0x0273
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r24 = r24 | r2
            int r25 = r25 + 13
            r2 = r26
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x025d
        L_0x0273:
            int r2 = r2 << r25
            r2 = r24 | r2
            goto L_0x027a
        L_0x0278:
            r26 = r30
        L_0x027a:
            com.google.android.gms.internal.ads.zzbqx r11 = com.google.android.gms.internal.ads.zzbqx.MESSAGE
            int r11 = r11.mo10484id()
            int r11 = r11 + 51
            if (r3 == r11) goto L_0x02b3
            com.google.android.gms.internal.ads.zzbqx r11 = com.google.android.gms.internal.ads.zzbqx.GROUP
            int r11 = r11.mo10484id()
            int r11 = r11 + 51
            if (r3 != r11) goto L_0x028f
            goto L_0x02b3
        L_0x028f:
            com.google.android.gms.internal.ads.zzbqx r11 = com.google.android.gms.internal.ads.zzbqx.ENUM
            int r11 = r11.mo10484id()
            int r11 = r11 + 51
            if (r3 != r11) goto L_0x02ad
            r11 = r5 & 1
            r31 = r15
            r15 = 1
            if (r11 != r15) goto L_0x02af
            int r11 = r19 / 3
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r15 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
            r24 = r15
            goto L_0x02b1
        L_0x02ad:
            r31 = r15
        L_0x02af:
            r24 = r20
        L_0x02b1:
            r15 = 1
            goto L_0x02c0
        L_0x02b3:
            r31 = r15
            int r11 = r19 / 3
            r15 = 1
            int r11 = r11 << r15
            int r11 = r11 + r15
            int r24 = r20 + 1
            r20 = r17[r20]
            r14[r11] = r20
        L_0x02c0:
            int r2 = r2 << r15
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02cc
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02c9:
            r32 = r10
            goto L_0x02d5
        L_0x02cc:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zza((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02c9
        L_0x02d5:
            long r10 = r6.objectFieldOffset(r11)
            int r10 = (int) r10
            int r2 = r2 + 1
            r11 = r17[r2]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x02e7
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
        L_0x02e4:
            r33 = r10
            goto L_0x02f0
        L_0x02e7:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zza((java.lang.Class<?>) r7, (java.lang.String) r11)
            r17[r2] = r11
            goto L_0x02e4
        L_0x02f0:
            long r10 = r6.objectFieldOffset(r11)
            int r2 = (int) r10
            r34 = r13
            r35 = r14
            r20 = r24
            r11 = r33
            r14 = r2
            r2 = 0
            goto L_0x0414
        L_0x0301:
            r32 = r10
            r31 = r15
            int r10 = r20 + 1
            r11 = r17[r20]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zza((java.lang.Class<?>) r7, (java.lang.String) r11)
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.MESSAGE
            int r15 = r15.mo10484id()
            if (r3 == r15) goto L_0x03a5
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.GROUP
            int r15 = r15.mo10484id()
            if (r3 != r15) goto L_0x0321
            goto L_0x03a5
        L_0x0321:
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.MESSAGE_LIST
            int r15 = r15.mo10484id()
            if (r3 == r15) goto L_0x0393
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.GROUP_LIST
            int r15 = r15.mo10484id()
            if (r3 != r15) goto L_0x0332
            goto L_0x0393
        L_0x0332:
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.ENUM
            int r15 = r15.mo10484id()
            if (r3 == r15) goto L_0x0381
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.ENUM_LIST
            int r15 = r15.mo10484id()
            if (r3 == r15) goto L_0x0381
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.ENUM_LIST_PACKED
            int r15 = r15.mo10484id()
            if (r3 != r15) goto L_0x034b
            goto L_0x0381
        L_0x034b:
            com.google.android.gms.internal.ads.zzbqx r15 = com.google.android.gms.internal.ads.zzbqx.MAP
            int r15 = r15.mo10484id()
            if (r3 != r15) goto L_0x037d
            int r15 = r23 + 1
            r16[r23] = r19
            int r20 = r19 / 3
            r23 = 1
            int r20 = r20 << 1
            int r23 = r10 + 1
            r10 = r17[r10]
            r14[r20] = r10
            r10 = r4 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0374
            int r20 = r20 + 1
            int r10 = r23 + 1
            r23 = r17[r23]
            r14[r20] = r23
            r34 = r13
            r35 = r14
            goto L_0x037a
        L_0x0374:
            r34 = r13
            r35 = r14
            r10 = r23
        L_0x037a:
            r23 = r15
            goto L_0x03b4
        L_0x037d:
            r34 = r13
            r13 = 1
            goto L_0x03b2
        L_0x0381:
            r15 = r5 & 1
            r34 = r13
            r13 = 1
            if (r15 != r13) goto L_0x03b2
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
            goto L_0x03a0
        L_0x0393:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            int r20 = r10 + 1
            r10 = r17[r10]
            r14[r15] = r10
        L_0x03a0:
            r35 = r14
            r10 = r20
            goto L_0x03b4
        L_0x03a5:
            r34 = r13
            r13 = 1
            int r15 = r19 / 3
            int r15 = r15 << r13
            int r15 = r15 + r13
            java.lang.Class r20 = r11.getType()
            r14[r15] = r20
        L_0x03b2:
            r35 = r14
        L_0x03b4:
            long r13 = r6.objectFieldOffset(r11)
            int r11 = (int) r13
            r13 = r5 & 1
            r14 = 1
            if (r13 != r14) goto L_0x040e
            com.google.android.gms.internal.ads.zzbqx r13 = com.google.android.gms.internal.ads.zzbqx.GROUP
            int r13 = r13.mo10484id()
            if (r3 > r13) goto L_0x040e
            int r13 = r2 + 1
            char r2 = r1.charAt(r2)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r14) goto L_0x03ea
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x03d5:
            int r20 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x03e6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r15
            r2 = r2 | r13
            int r15 = r15 + 13
            r13 = r20
            goto L_0x03d5
        L_0x03e6:
            int r13 = r13 << r15
            r2 = r2 | r13
            r13 = r20
        L_0x03ea:
            r15 = 1
            int r20 = r9 << 1
            int r21 = r2 / 32
            int r20 = r20 + r21
            r14 = r17[r20]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x03fa
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0402
        L_0x03fa:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = zza((java.lang.Class<?>) r7, (java.lang.String) r14)
            r17[r20] = r14
        L_0x0402:
            long r14 = r6.objectFieldOffset(r14)
            int r14 = (int) r14
            int r2 = r2 % 32
            r20 = r10
            r26 = r13
            goto L_0x0414
        L_0x040e:
            r26 = r2
            r20 = r10
            r2 = 0
            r14 = 0
        L_0x0414:
            r10 = 18
            if (r3 < r10) goto L_0x0422
            r10 = 49
            if (r3 > r10) goto L_0x0422
            int r10 = r22 + 1
            r16[r22] = r11
            r22 = r10
        L_0x0422:
            int r10 = r19 + 1
            r12[r19] = r8
            int r8 = r10 + 1
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x042f
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0430
        L_0x042f:
            r13 = 0
        L_0x0430:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0437
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0438
        L_0x0437:
            r4 = 0
        L_0x0438:
            r4 = r4 | r13
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r11
            r12[r10] = r3
            int r19 = r8 + 1
            int r2 = r2 << 20
            r2 = r2 | r14
            r12[r8] = r2
            r8 = r26
            r2 = r27
            r3 = r28
            r11 = r29
            r15 = r31
            r10 = r32
            r13 = r34
            r14 = r35
            r4 = 1
            goto L_0x01c5
        L_0x0459:
            r28 = r3
            r32 = r10
            r29 = r11
            r34 = r13
            r35 = r14
            com.google.android.gms.internal.ads.zzbsp r1 = new com.google.android.gms.internal.ads.zzbsp
            com.google.android.gms.internal.ads.zzbsl r10 = r0.zzaob()
            r0 = 0
            r5 = r1
            r6 = r12
            r7 = r35
            r8 = r32
            r9 = r34
            r12 = r0
            r13 = r16
            r14 = r28
            r15 = r18
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0487:
            com.google.android.gms.internal.ads.zzbtp r0 = (com.google.android.gms.internal.ads.zzbtp) r0
            r0.zzanz()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Class, com.google.android.gms.internal.ads.zzbsj, com.google.android.gms.internal.ads.zzbst, com.google.android.gms.internal.ads.zzbrv, com.google.android.gms.internal.ads.zzbtu, com.google.android.gms.internal.ads.zzbqr, com.google.android.gms.internal.ads.zzbsg):com.google.android.gms.internal.ads.zzbsp");
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public final T newInstance() {
        return this.zzfsu.newInstance(this.zzfsm);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.zzbte.zze(com.google.android.gms.internal.ads.zzbua.zzp(r10, r6), com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.zzbte.zze(com.google.android.gms.internal.ads.zzbua.zzp(r10, r6), com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.zzbte.zze(com.google.android.gms.internal.ads.zzbua.zzp(r10, r6), com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.zzbte.zze(com.google.android.gms.internal.ads.zzbua.zzp(r10, r6), com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzm(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzm(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019c, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzk(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01af, code lost:
        if (com.google.android.gms.internal.ads.zzbua.zzl(r10, r6) == com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.zzbte.zze(com.google.android.gms.internal.ads.zzbua.zzp(r10, r6), com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)) != false) goto L_0x01b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzfsi
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01b9
            int r4 = r9.zzft(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x019f;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b2
        L_0x001c:
            int r4 = r9.zzfu(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r4)
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r4)
            if (r8 != r4) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.zzbte.zze(r4, r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.zzbte.zze(r3, r4)
            goto L_0x01b2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.zzbte.zze(r3, r4)
            goto L_0x01b2
        L_0x0058:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.zzbte.zze(r4, r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x006e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0082:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0094:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x00a8:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00ba:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00cc:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x00de:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.zzbte.zze(r4, r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x00f4:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.zzbte.zze(r4, r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x010a:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.zzbte.zze(r4, r5)
            if (r4 != 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0120:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            boolean r4 = com.google.android.gms.internal.ads.zzbua.zzm(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.zzbua.zzm(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0132:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0144:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x0157:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x0168:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x017b:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            goto L_0x01b1
        L_0x018e:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            int r4 = com.google.android.gms.internal.ads.zzbua.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r11, r6)
            if (r4 == r5) goto L_0x01b2
            goto L_0x01b1
        L_0x019f:
            boolean r4 = r9.zzc(r10, r11, r2)
            if (r4 == 0) goto L_0x01b1
            long r4 = com.google.android.gms.internal.ads.zzbua.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.ads.zzbua.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
        L_0x01b1:
            r3 = 0
        L_0x01b2:
            if (r3 != 0) goto L_0x01b5
            return r1
        L_0x01b5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01b9:
            com.google.android.gms.internal.ads.zzbtu<?, ?> r0 = r9.zzfsw
            java.lang.Object r0 = r0.zzag(r10)
            com.google.android.gms.internal.ads.zzbtu<?, ?> r2 = r9.zzfsw
            java.lang.Object r2 = r2.zzag(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cc
            return r1
        L_0x01cc:
            boolean r0 = r9.zzfsn
            if (r0 == 0) goto L_0x01e1
            com.google.android.gms.internal.ads.zzbqr<?> r0 = r9.zzfsx
            com.google.android.gms.internal.ads.zzbqu r10 = r0.zzq(r10)
            com.google.android.gms.internal.ads.zzbqr<?> r0 = r9.zzfsx
            com.google.android.gms.internal.ads.zzbqu r11 = r0.zzq(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final int hashCode(T t) {
        int length = this.zzfsi.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzft = zzft(i2);
            int i3 = this.zzfsi[i2];
            long j = (long) (1048575 & zzft);
            int i4 = 37;
            switch ((zzft & 267386880) >>> 20) {
                case 0:
                    i = (i * 53) + zzbrf.zzbi(Double.doubleToLongBits(zzbua.zzo(t, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(zzbua.zzn(t, j));
                    break;
                case 2:
                    i = (i * 53) + zzbrf.zzbi(zzbua.zzl(t, j));
                    break;
                case 3:
                    i = (i * 53) + zzbrf.zzbi(zzbua.zzl(t, j));
                    break;
                case 4:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 5:
                    i = (i * 53) + zzbrf.zzbi(zzbua.zzl(t, j));
                    break;
                case 6:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 7:
                    i = (i * 53) + zzbrf.zzbf(zzbua.zzm(t, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) zzbua.zzp(t, j)).hashCode();
                    break;
                case 9:
                    Object zzp = zzbua.zzp(t, j);
                    if (zzp != null) {
                        i4 = zzp.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + zzbua.zzp(t, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 12:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 13:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 14:
                    i = (i * 53) + zzbrf.zzbi(zzbua.zzl(t, j));
                    break;
                case 15:
                    i = (i * 53) + zzbua.zzk(t, j);
                    break;
                case 16:
                    i = (i * 53) + zzbrf.zzbi(zzbua.zzl(t, j));
                    break;
                case 17:
                    Object zzp2 = zzbua.zzp(t, j);
                    if (zzp2 != null) {
                        i4 = zzp2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + zzbua.zzp(t, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + zzbua.zzp(t, j).hashCode();
                    break;
                case 51:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(Double.doubleToLongBits(zzf(t, j)));
                        break;
                    }
                case 52:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(zzg(t, j));
                        break;
                    }
                case 53:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(zzi(t, j));
                        break;
                    }
                case 54:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(zzi(t, j));
                        break;
                    }
                case 55:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 56:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(zzi(t, j));
                        break;
                    }
                case 57:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 58:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbf(zzj(t, j));
                        break;
                    }
                case 59:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) zzbua.zzp(t, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbua.zzp(t, j).hashCode();
                        break;
                    }
                case 61:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbua.zzp(t, j).hashCode();
                        break;
                    }
                case 62:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 63:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 64:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 65:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(zzi(t, j));
                        break;
                    }
                case 66:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzh(t, j);
                        break;
                    }
                case 67:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbrf.zzbi(zzi(t, j));
                        break;
                    }
                case 68:
                    if (!zza(t, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzbua.zzp(t, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.zzfsw.zzag(t).hashCode();
        return this.zzfsn ? (hashCode * 53) + this.zzfsx.zzq(t).hashCode() : hashCode;
    }

    public final void zzd(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.zzfsi.length; i += 3) {
                int zzft = zzft(i);
                long j = (long) (1048575 & zzft);
                int i2 = this.zzfsi[i];
                switch ((zzft & 267386880) >>> 20) {
                    case 0:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzo(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 1:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzn(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 2:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzl(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 3:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzl(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 4:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 5:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzl(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 6:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 7:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzm(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 8:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzp(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 9:
                        zza(t, t2, i);
                        break;
                    case 10:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzp(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 11:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 12:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 13:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 14:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzl(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 15:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zzb((Object) t, j, zzbua.zzk(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 16:
                        if (!zzd(t2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzl(t2, j));
                            zze(t, i);
                            break;
                        }
                    case 17:
                        zza(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzfsv.zza(t, t2, j);
                        break;
                    case 50:
                        zzbte.zza(this.zzfsy, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 60:
                        zzb(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zza(t2, i2, i)) {
                            break;
                        } else {
                            zzbua.zza((Object) t, j, zzbua.zzp(t2, j));
                            zzb(t, i2, i);
                            break;
                        }
                    case 68:
                        zzb(t, t2, i);
                        break;
                }
            }
            if (!this.zzfsp) {
                zzbte.zza(this.zzfsw, t, t2);
                if (this.zzfsn) {
                    zzbte.zza(this.zzfsx, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    private final void zza(T t, T t2, int i) {
        long zzft = (long) (zzft(i) & 1048575);
        if (zzd(t2, i)) {
            Object zzp = zzbua.zzp(t, zzft);
            Object zzp2 = zzbua.zzp(t2, zzft);
            if (zzp != null && zzp2 != null) {
                zzbua.zza((Object) t, zzft, zzbrf.zzb(zzp, zzp2));
                zze(t, i);
            } else if (zzp2 != null) {
                zzbua.zza((Object) t, zzft, zzp2);
                zze(t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzft = zzft(i);
        int i2 = this.zzfsi[i];
        long j = (long) (zzft & 1048575);
        if (zza(t2, i2, i)) {
            Object zzp = zzbua.zzp(t, j);
            Object zzp2 = zzbua.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzbua.zza((Object) t, j, zzbrf.zzb(zzp, zzp2));
                zzb(t, i2, i);
            } else if (zzp2 != null) {
                zzbua.zza((Object) t, j, zzp2);
                zzb(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09cb, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0aef, code lost:
        r3 = r3 + 3;
        r9 = r18;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzac(T r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.zzfsp
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x055f
            sun.misc.Unsafe r2 = zzfsh
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.zzfsi
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0557
            int r14 = r0.zzft(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.zzfsi
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.zzbqx r14 = com.google.android.gms.internal.ads.zzbqx.DOUBLE_LIST_PACKED
            int r14 = r14.mo10484id()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.zzbqx r14 = com.google.android.gms.internal.ads.zzbqx.SINT64_LIST_PACKED
            int r14 = r14.mo10484id()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.zzfsi
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x0544;
                case 1: goto L_0x0538;
                case 2: goto L_0x0528;
                case 3: goto L_0x0518;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fc;
                case 6: goto L_0x04f0;
                case 7: goto L_0x04e4;
                case 8: goto L_0x04c4;
                case 9: goto L_0x04af;
                case 10: goto L_0x049c;
                case 11: goto L_0x048b;
                case 12: goto L_0x047a;
                case 13: goto L_0x046d;
                case 14: goto L_0x0460;
                case 15: goto L_0x044f;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x041c;
                case 19: goto L_0x0411;
                case 20: goto L_0x0406;
                case 21: goto L_0x03fb;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03e5;
                case 24: goto L_0x03da;
                case 25: goto L_0x03cf;
                case 26: goto L_0x03c4;
                case 27: goto L_0x03b5;
                case 28: goto L_0x03aa;
                case 29: goto L_0x039f;
                case 30: goto L_0x0394;
                case 31: goto L_0x0389;
                case 32: goto L_0x037e;
                case 33: goto L_0x0373;
                case 34: goto L_0x0368;
                case 35: goto L_0x0347;
                case 36: goto L_0x0326;
                case 37: goto L_0x0305;
                case 38: goto L_0x02e4;
                case 39: goto L_0x02c3;
                case 40: goto L_0x02a2;
                case 41: goto L_0x0281;
                case 42: goto L_0x0260;
                case 43: goto L_0x023f;
                case 44: goto L_0x021e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01dc;
                case 47: goto L_0x01bb;
                case 48: goto L_0x019a;
                case 49: goto L_0x018b;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015e;
                case 53: goto L_0x014d;
                case 54: goto L_0x013c;
                case 55: goto L_0x012b;
                case 56: goto L_0x011e;
                case 57: goto L_0x0111;
                case 58: goto L_0x0104;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00cf;
                case 61: goto L_0x00bc;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009a;
                case 64: goto L_0x008d;
                case 65: goto L_0x0080;
                case 66: goto L_0x006f;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0551
        L_0x0047:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbsl r5 = (com.google.android.gms.internal.ads.zzbsl) r5
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x005e:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzo(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x006f:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzab(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0080:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzq(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x008d:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzad(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x009a:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzae(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00ab:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzaa(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00bc:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbpu r5 = (com.google.android.gms.internal.ads.zzbpu) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (com.google.android.gms.internal.ads.zzbpu) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00cf:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzc((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.zzbtc) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00e4:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzbpu r5 = (com.google.android.gms.internal.ads.zzbpu) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (com.google.android.gms.internal.ads.zzbpu) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x00fb:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzg(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0104:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzk((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0111:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzac(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x011e:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzp(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x012b:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = zzh(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzz(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x013c:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzn(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x014d:
            boolean r14 = r0.zza(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = zzi(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzm(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x015e:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzb((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x016b:
            boolean r5 = r0.zza(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (double) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x017a:
            com.google.android.gms.internal.ads.zzbsg r14 = r0.zzfsy
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            java.lang.Object r6 = r0.zzfr(r12)
            int r3 = r14.zzb(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x018b:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzd(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x019a:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzah(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x01ae
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01ae:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01bb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzal(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x01cf
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01cf:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01dc:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzan(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x01f0
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f0:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzam(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x021e:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzai(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0232
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0232:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x023f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzak(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0253
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0253:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0260:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzao(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0274
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0274:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0281:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzam(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0295
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0295:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02a2:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzan(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x02b6
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02b6:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02c3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzaj(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x02d7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02d7:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x02e4:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzag(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x02f8
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02f8:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0305:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzaf(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x0319
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0319:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0326:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzam(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x033a
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x033a:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0347:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.zzbte.zzan(r5)
            if (r5 <= 0) goto L_0x0551
            boolean r6 = r0.zzfsq
            if (r6 == 0) goto L_0x035b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x035b:
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzfd(r3)
            int r6 = com.google.android.gms.internal.ads.zzbqk.zzff(r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0368:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzq(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0373:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzu(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x037e:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzw(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0389:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzv(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0394:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzr(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x039f:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzt(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03aa:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzd(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03b5:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzc((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.ads.zzbtc) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03c4:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzc(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03cf:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzx(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03da:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzv(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03e5:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzw(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03f0:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzs(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x03fb:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzp(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0406:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzo(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0411:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzv(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x041c:
            java.util.List r5 = zze((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzw(r3, r5, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0427:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbsl r5 = (com.google.android.gms.internal.ads.zzbsl) r5
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc(r3, r5, r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x043e:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.zzbua.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzo(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x044f:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzab(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0460:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzq(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x046d:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzad(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x047a:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzae(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x048b:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzaa(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x049c:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbpu r5 = (com.google.android.gms.internal.ads.zzbpu) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (com.google.android.gms.internal.ads.zzbpu) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04af:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            com.google.android.gms.internal.ads.zzbtc r6 = r0.zzfq(r12)
            int r3 = com.google.android.gms.internal.ads.zzbte.zzc((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.zzbtc) r6)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04c4:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r6 == 0) goto L_0x04db
            com.google.android.gms.internal.ads.zzbpu r5 = (com.google.android.gms.internal.ads.zzbpu) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (com.google.android.gms.internal.ads.zzbpu) r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04db:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzg(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04e4:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzk((int) r3, (boolean) r7)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04f0:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzac(r3, r11)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x04fc:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzp(r3, r9)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0508:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            int r5 = com.google.android.gms.internal.ads.zzbua.zzk(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzz(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0518:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.zzbua.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzn(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0528:
            boolean r14 = r0.zzd(r1, (int) r12)
            if (r14 == 0) goto L_0x0551
            long r5 = com.google.android.gms.internal.ads.zzbua.zzl(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzm(r3, r5)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0538:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzb((int) r3, (float) r4)
            int r13 = r13 + r3
            goto L_0x0551
        L_0x0544:
            boolean r5 = r0.zzd(r1, (int) r12)
            if (r5 == 0) goto L_0x0551
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r3, (double) r5)
            int r13 = r13 + r3
        L_0x0551:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0557:
            com.google.android.gms.internal.ads.zzbtu<?, ?> r2 = r0.zzfsw
            int r1 = zza(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x055f:
            sun.misc.Unsafe r2 = zzfsh
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x0566:
            int[] r13 = r0.zzfsi
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0af7
            int r13 = r0.zzft(r3)
            int[] r14 = r0.zzfsi
            r14 = r14[r3]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r15
            int r15 = r16 >>> 20
            r4 = 17
            if (r15 > r4) goto L_0x0592
            int[] r4 = r0.zzfsi
            int r16 = r3 + 2
            r4 = r4[r16]
            r11 = r4 & r8
            int r16 = r4 >>> 20
            int r16 = r7 << r16
            if (r11 == r6) goto L_0x05b3
            long r9 = (long) r11
            int r12 = r2.getInt(r1, r9)
            r6 = r11
            goto L_0x05b3
        L_0x0592:
            boolean r4 = r0.zzfsq
            if (r4 == 0) goto L_0x05b0
            com.google.android.gms.internal.ads.zzbqx r4 = com.google.android.gms.internal.ads.zzbqx.DOUBLE_LIST_PACKED
            int r4 = r4.mo10484id()
            if (r15 < r4) goto L_0x05b0
            com.google.android.gms.internal.ads.zzbqx r4 = com.google.android.gms.internal.ads.zzbqx.SINT64_LIST_PACKED
            int r4 = r4.mo10484id()
            if (r15 > r4) goto L_0x05b0
            int[] r4 = r0.zzfsi
            int r9 = r3 + 2
            r4 = r4[r9]
            r11 = r4 & r8
            r4 = r11
            goto L_0x05b1
        L_0x05b0:
            r4 = 0
        L_0x05b1:
            r16 = 0
        L_0x05b3:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r15) {
                case 0: goto L_0x0ae0;
                case 1: goto L_0x0ad0;
                case 2: goto L_0x0abe;
                case 3: goto L_0x0aad;
                case 4: goto L_0x0a9c;
                case 5: goto L_0x0a8d;
                case 6: goto L_0x0a81;
                case 7: goto L_0x0a76;
                case 8: goto L_0x0a58;
                case 9: goto L_0x0a45;
                case 10: goto L_0x0a35;
                case 11: goto L_0x0a27;
                case 12: goto L_0x0a19;
                case 13: goto L_0x0a0e;
                case 14: goto L_0x0a02;
                case 15: goto L_0x09f4;
                case 16: goto L_0x09e6;
                case 17: goto L_0x09d2;
                case 18: goto L_0x09be;
                case 19: goto L_0x09b1;
                case 20: goto L_0x09a4;
                case 21: goto L_0x0997;
                case 22: goto L_0x098a;
                case 23: goto L_0x097d;
                case 24: goto L_0x0970;
                case 25: goto L_0x0963;
                case 26: goto L_0x0957;
                case 27: goto L_0x0946;
                case 28: goto L_0x0939;
                case 29: goto L_0x092b;
                case 30: goto L_0x091d;
                case 31: goto L_0x090f;
                case 32: goto L_0x0901;
                case 33: goto L_0x08f3;
                case 34: goto L_0x08e5;
                case 35: goto L_0x08c4;
                case 36: goto L_0x08a3;
                case 37: goto L_0x0882;
                case 38: goto L_0x0861;
                case 39: goto L_0x0840;
                case 40: goto L_0x081f;
                case 41: goto L_0x07fe;
                case 42: goto L_0x07dd;
                case 43: goto L_0x07bc;
                case 44: goto L_0x079b;
                case 45: goto L_0x077a;
                case 46: goto L_0x0759;
                case 47: goto L_0x0738;
                case 48: goto L_0x0717;
                case 49: goto L_0x0706;
                case 50: goto L_0x06f5;
                case 51: goto L_0x06e6;
                case 52: goto L_0x06d8;
                case 53: goto L_0x06c7;
                case 54: goto L_0x06b6;
                case 55: goto L_0x06a5;
                case 56: goto L_0x0696;
                case 57: goto L_0x0688;
                case 58: goto L_0x067b;
                case 59: goto L_0x065b;
                case 60: goto L_0x0646;
                case 61: goto L_0x0633;
                case 62: goto L_0x0622;
                case 63: goto L_0x0611;
                case 64: goto L_0x0603;
                case 65: goto L_0x05f4;
                case 66: goto L_0x05e3;
                case 67: goto L_0x05d2;
                case 68: goto L_0x05bb;
                default: goto L_0x05b9;
            }
        L_0x05b9:
            goto L_0x09ca
        L_0x05bb:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbsl r4 = (com.google.android.gms.internal.ads.zzbsl) r4
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05d2:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = zzi(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzo(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05e3:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = zzh(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzab(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x05f4:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzq(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0603:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzad(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0611:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = zzh(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzae(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0622:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = zzh(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzaa(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0633:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (com.google.android.gms.internal.ads.zzbpu) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0646:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbte.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x065b:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r9 == 0) goto L_0x0672
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (com.google.android.gms.internal.ads.zzbpu) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0672:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzg(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x067b:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzk((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0688:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzac(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0696:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzp(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06a5:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            int r4 = zzh(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzz(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06b6:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = zzi(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzn(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06c7:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            long r9 = zzi(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzm(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06d8:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzb((int) r14, (float) r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x06e6:
            boolean r4 = r0.zza(r1, (int) r14, (int) r3)
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (double) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x06f5:
            com.google.android.gms.internal.ads.zzbsg r4 = r0.zzfsy
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.zzfr(r3)
            int r4 = r4.zzb(r14, r9, r10)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0706:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbte.zzd(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0717:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzah(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x072b
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x072b:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0738:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzal(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x074c
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x074c:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0759:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzan(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x076d
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x076d:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x077a:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzam(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x078e
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x078e:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x079b:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzai(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x07af
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07af:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07bc:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzak(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x07d0
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07d0:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07dd:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzao(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x07f1
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x07f1:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x07fe:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzam(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x0812
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0812:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x081f:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzan(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x0833
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0833:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0840:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzaj(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x0854
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0854:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0861:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzag(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x0875
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0875:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0882:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzaf(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x0896
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x0896:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08a3:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzam(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x08b7
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08b7:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08c4:
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            int r9 = com.google.android.gms.internal.ads.zzbte.zzan(r9)
            if (r9 <= 0) goto L_0x09ca
            boolean r10 = r0.zzfsq
            if (r10 == 0) goto L_0x08d8
            long r10 = (long) r4
            r2.putInt(r1, r10, r9)
        L_0x08d8:
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzfd(r14)
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzff(r9)
            int r4 = r4 + r10
            int r4 = r4 + r9
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08e5:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.zzbte.zzq(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x08f3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzu(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0901:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzw(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x090f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzv(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x091d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzr(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x092b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzt(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0939:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzd(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0946:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbte.zzc((int) r14, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.zzbtc) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0957:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzc(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0963:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.zzbte.zzx(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0970:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzv(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x097d:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzw(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x098a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzs(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0997:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzp(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09a4:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzo(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09b1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzv(r14, r4, r11)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09be:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.zzbte.zzw(r14, r4, r11)
            int r5 = r5 + r4
        L_0x09ca:
            r4 = 0
        L_0x09cb:
            r9 = 0
            r10 = 0
            r18 = 0
            goto L_0x0aef
        L_0x09d2:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbsl r4 = (com.google.android.gms.internal.ads.zzbsl) r4
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc(r14, r4, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09e6:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            long r9 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzo(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x09f4:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzab(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a02:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzq(r14, r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a0e:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzad(r14, r4)
            int r5 = r5 + r9
            goto L_0x09ca
        L_0x0a19:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzae(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a27:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzaa(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a35:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (com.google.android.gms.internal.ads.zzbpu) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a45:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbtc r9 = r0.zzfq(r3)
            int r4 = com.google.android.gms.internal.ads.zzbte.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r9)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a58:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r9 == 0) goto L_0x0a6d
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (com.google.android.gms.internal.ads.zzbpu) r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a6d:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzg(r14, r4)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a76:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            int r4 = com.google.android.gms.internal.ads.zzbqk.zzk((int) r14, (boolean) r7)
            int r5 = r5 + r4
            goto L_0x09ca
        L_0x0a81:
            r4 = r12 & r16
            if (r4 == 0) goto L_0x09ca
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzac(r14, r4)
            int r5 = r5 + r9
            goto L_0x09cb
        L_0x0a8d:
            r4 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x09cb
            r9 = 0
            int r11 = com.google.android.gms.internal.ads.zzbqk.zzp(r14, r9)
            int r5 = r5 + r11
            r18 = r9
            goto L_0x0ace
        L_0x0a9c:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzz(r14, r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0aad:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzn(r14, r9)
            int r5 = r5 + r9
            goto L_0x0ace
        L_0x0abe:
            r4 = 0
            r18 = 0
            r11 = r12 & r16
            if (r11 == 0) goto L_0x0ace
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.zzbqk.zzm(r14, r9)
            int r5 = r5 + r9
        L_0x0ace:
            r9 = 0
            goto L_0x0add
        L_0x0ad0:
            r4 = 0
            r18 = 0
            r9 = r12 & r16
            if (r9 == 0) goto L_0x0ace
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.zzbqk.zzb((int) r14, (float) r9)
            int r5 = r5 + r10
        L_0x0add:
            r10 = 0
            goto L_0x0aef
        L_0x0ae0:
            r4 = 0
            r9 = 0
            r18 = 0
            r10 = r12 & r16
            if (r10 == 0) goto L_0x0add
            r10 = 0
            int r13 = com.google.android.gms.internal.ads.zzbqk.zzc((int) r14, (double) r10)
            int r5 = r5 + r13
        L_0x0aef:
            int r3 = r3 + 3
            r9 = r18
            r4 = 0
            r11 = 0
            goto L_0x0566
        L_0x0af7:
            com.google.android.gms.internal.ads.zzbtu<?, ?> r2 = r0.zzfsw
            int r2 = zza(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.zzfsn
            if (r2 == 0) goto L_0x0b0d
            com.google.android.gms.internal.ads.zzbqr<?> r2 = r0.zzfsx
            com.google.android.gms.internal.ads.zzbqu r1 = r2.zzq(r1)
            int r1 = r1.zzamj()
            int r5 = r5 + r1
        L_0x0b0d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zzac(java.lang.Object):int");
    }

    private static <UT, UB> int zza(zzbtu<UT, UB> zzbtu, T t) {
        return zzbtu.zzac(zzbtu.zzag(t));
    }

    private static <E> List<E> zze(Object obj, long j) {
        return (List) zzbua.zzp(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a27  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r14, com.google.android.gms.internal.ads.zzbup r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzaly()
            int r1 = com.google.android.gms.internal.ads.zzbrd.zze.zzfqn
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0527
            com.google.android.gms.internal.ads.zzbtu<?, ?> r0 = r13.zzfsw
            zza(r0, r14, (com.google.android.gms.internal.ads.zzbup) r15)
            boolean r0 = r13.zzfsn
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.zzbqr<?> r0 = r13.zzfsx
            com.google.android.gms.internal.ads.zzbqu r0 = r0.zzq(r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.zzfsi
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0037:
            if (r7 < 0) goto L_0x050f
            int r8 = r13.zzft(r7)
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.zzbqr<?> r10 = r13.zzfsx
            int r10 = r10.zza(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.ads.zzbqr<?> r10 = r13.zzfsx
            r10.zza((com.google.android.gms.internal.ads.zzbup) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fc;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cc;
                case 4: goto L_0x04bc;
                case 5: goto L_0x04ac;
                case 6: goto L_0x049c;
                case 7: goto L_0x048b;
                case 8: goto L_0x047a;
                case 9: goto L_0x0465;
                case 10: goto L_0x0452;
                case 11: goto L_0x0441;
                case 12: goto L_0x0430;
                case 13: goto L_0x041f;
                case 14: goto L_0x040e;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x050b
        L_0x0068:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x007d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050b
        L_0x008e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzx(r9, r8)
            goto L_0x050b
        L_0x009f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzs(r9, r10)
            goto L_0x050b
        L_0x00b0:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzaf(r9, r8)
            goto L_0x050b
        L_0x00c1:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzag(r9, r8)
            goto L_0x050b
        L_0x00d2:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzw(r9, r8)
            goto L_0x050b
        L_0x00e3:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbpu r8 = (com.google.android.gms.internal.ads.zzbpu) r8
            r15.zza((int) r9, (com.google.android.gms.internal.ads.zzbpu) r8)
            goto L_0x050b
        L_0x00f6:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x010b:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x050b
        L_0x011c:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzj(r14, r10)
            r15.zzj((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x012d:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzy(r9, r8)
            goto L_0x050b
        L_0x013e:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzl(r9, r10)
            goto L_0x050b
        L_0x014f:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzv(r9, r8)
            goto L_0x050b
        L_0x0160:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzj((int) r9, (long) r10)
            goto L_0x050b
        L_0x0171:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzr(r9, r10)
            goto L_0x050b
        L_0x0182:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzg(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050b
        L_0x0193:
            boolean r10 = r13.zza(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzf(r14, r10)
            r15.zzb((int) r9, (double) r10)
            goto L_0x050b
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            r13.zza((com.google.android.gms.internal.ads.zzbup) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050b
        L_0x01af:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x01c4:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zze(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01d5:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzj(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01e6:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzg(r9, r8, r15, r4)
            goto L_0x050b
        L_0x01f7:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzl(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0208:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzm(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0219:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzi(r9, r8, r15, r4)
            goto L_0x050b
        L_0x022a:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzn(r9, r8, r15, r4)
            goto L_0x050b
        L_0x023b:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzk(r9, r8, r15, r4)
            goto L_0x050b
        L_0x024c:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzf(r9, r8, r15, r4)
            goto L_0x050b
        L_0x025d:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzh(r9, r8, r15, r4)
            goto L_0x050b
        L_0x026e:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzd(r9, r8, r15, r4)
            goto L_0x050b
        L_0x027f:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzc(r9, r8, r15, r4)
            goto L_0x050b
        L_0x0290:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r4)
            goto L_0x050b
        L_0x02a1:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r4)
            goto L_0x050b
        L_0x02b2:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zze(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02c3:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzj(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02d4:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzg(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02e5:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzl(r9, r8, r15, r5)
            goto L_0x050b
        L_0x02f6:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzm(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0307:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzi(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0318:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzb(r9, r8, r15)
            goto L_0x050b
        L_0x0329:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x033e:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x050b
        L_0x034f:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzn(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0360:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzk(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0371:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzf(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0382:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzh(r9, r8, r15, r5)
            goto L_0x050b
        L_0x0393:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzd(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03a4:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzc(r9, r8, r15, r5)
            goto L_0x050b
        L_0x03b5:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r5)
            goto L_0x050b
        L_0x03c6:
            int[] r9 = r13.zzfsi
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r5)
            goto L_0x050b
        L_0x03d7:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x03ec:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050b
        L_0x03fd:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzx(r9, r8)
            goto L_0x050b
        L_0x040e:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r10)
            r15.zzs(r9, r10)
            goto L_0x050b
        L_0x041f:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzaf(r9, r8)
            goto L_0x050b
        L_0x0430:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzag(r9, r8)
            goto L_0x050b
        L_0x0441:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzw(r9, r8)
            goto L_0x050b
        L_0x0452:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbpu r8 = (com.google.android.gms.internal.ads.zzbpu) r8
            r15.zza((int) r9, (com.google.android.gms.internal.ads.zzbpu) r8)
            goto L_0x050b
        L_0x0465:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            com.google.android.gms.internal.ads.zzbtc r10 = r13.zzfq(r7)
            r15.zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbtc) r10)
            goto L_0x050b
        L_0x047a:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r10)
            zza((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x050b
        L_0x048b:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.zzbua.zzm(r14, r10)
            r15.zzj((int) r9, (boolean) r8)
            goto L_0x050b
        L_0x049c:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzy(r9, r8)
            goto L_0x050b
        L_0x04ac:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r10)
            r15.zzl(r9, r10)
            goto L_0x050b
        L_0x04bc:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r10)
            r15.zzv(r9, r8)
            goto L_0x050b
        L_0x04cc:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r10)
            r15.zzj((int) r9, (long) r10)
            goto L_0x050b
        L_0x04dc:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r10)
            r15.zzr(r9, r10)
            goto L_0x050b
        L_0x04ec:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.ads.zzbua.zzn(r14, r10)
            r15.zza((int) r9, (float) r8)
            goto L_0x050b
        L_0x04fc:
            boolean r10 = r13.zzd(r14, (int) r7)
            if (r10 == 0) goto L_0x050b
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.ads.zzbua.zzo(r14, r10)
            r15.zzb((int) r9, (double) r10)
        L_0x050b:
            int r7 = r7 + -3
            goto L_0x0037
        L_0x050f:
            if (r1 == 0) goto L_0x0526
            com.google.android.gms.internal.ads.zzbqr<?> r14 = r13.zzfsx
            r14.zza((com.google.android.gms.internal.ads.zzbup) r15, (java.util.Map.Entry<?, ?>) r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0524
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x050f
        L_0x0524:
            r1 = r3
            goto L_0x050f
        L_0x0526:
            return
        L_0x0527:
            boolean r0 = r13.zzfsp
            if (r0 == 0) goto L_0x0a42
            boolean r0 = r13.zzfsn
            if (r0 == 0) goto L_0x0546
            com.google.android.gms.internal.ads.zzbqr<?> r0 = r13.zzfsx
            com.google.android.gms.internal.ads.zzbqu r0 = r0.zzq(r14)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0546
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0548
        L_0x0546:
            r0 = r3
            r1 = r0
        L_0x0548:
            int[] r7 = r13.zzfsi
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x054d:
            if (r1 >= r7) goto L_0x0a25
            int r9 = r13.zzft(r1)
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
        L_0x0557:
            if (r8 == 0) goto L_0x0575
            com.google.android.gms.internal.ads.zzbqr<?> r11 = r13.zzfsx
            int r11 = r11.zza(r8)
            if (r11 > r10) goto L_0x0575
            com.google.android.gms.internal.ads.zzbqr<?> r11 = r13.zzfsx
            r11.zza((com.google.android.gms.internal.ads.zzbup) r15, (java.util.Map.Entry<?, ?>) r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0573
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0557
        L_0x0573:
            r8 = r3
            goto L_0x0557
        L_0x0575:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a12;
                case 1: goto L_0x0a02;
                case 2: goto L_0x09f2;
                case 3: goto L_0x09e2;
                case 4: goto L_0x09d2;
                case 5: goto L_0x09c2;
                case 6: goto L_0x09b2;
                case 7: goto L_0x09a1;
                case 8: goto L_0x0990;
                case 9: goto L_0x097b;
                case 10: goto L_0x0968;
                case 11: goto L_0x0957;
                case 12: goto L_0x0946;
                case 13: goto L_0x0935;
                case 14: goto L_0x0924;
                case 15: goto L_0x0913;
                case 16: goto L_0x0902;
                case 17: goto L_0x08ed;
                case 18: goto L_0x08dc;
                case 19: goto L_0x08cb;
                case 20: goto L_0x08ba;
                case 21: goto L_0x08a9;
                case 22: goto L_0x0898;
                case 23: goto L_0x0887;
                case 24: goto L_0x0876;
                case 25: goto L_0x0865;
                case 26: goto L_0x0854;
                case 27: goto L_0x083f;
                case 28: goto L_0x082e;
                case 29: goto L_0x081d;
                case 30: goto L_0x080c;
                case 31: goto L_0x07fb;
                case 32: goto L_0x07ea;
                case 33: goto L_0x07d9;
                case 34: goto L_0x07c8;
                case 35: goto L_0x07b7;
                case 36: goto L_0x07a6;
                case 37: goto L_0x0795;
                case 38: goto L_0x0784;
                case 39: goto L_0x0773;
                case 40: goto L_0x0762;
                case 41: goto L_0x0751;
                case 42: goto L_0x0740;
                case 43: goto L_0x072f;
                case 44: goto L_0x071e;
                case 45: goto L_0x070d;
                case 46: goto L_0x06fc;
                case 47: goto L_0x06eb;
                case 48: goto L_0x06da;
                case 49: goto L_0x06c5;
                case 50: goto L_0x06ba;
                case 51: goto L_0x06a9;
                case 52: goto L_0x0698;
                case 53: goto L_0x0687;
                case 54: goto L_0x0676;
                case 55: goto L_0x0665;
                case 56: goto L_0x0654;
                case 57: goto L_0x0643;
                case 58: goto L_0x0632;
                case 59: goto L_0x0621;
                case 60: goto L_0x060c;
                case 61: goto L_0x05f9;
                case 62: goto L_0x05e8;
                case 63: goto L_0x05d7;
                case 64: goto L_0x05c6;
                case 65: goto L_0x05b5;
                case 66: goto L_0x05a4;
                case 67: goto L_0x0593;
                case 68: goto L_0x057e;
                default: goto L_0x057c;
            }
        L_0x057c:
            goto L_0x0a21
        L_0x057e:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x0593:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a21
        L_0x05a4:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzx(r10, r9)
            goto L_0x0a21
        L_0x05b5:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzs(r10, r11)
            goto L_0x0a21
        L_0x05c6:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzaf(r10, r9)
            goto L_0x0a21
        L_0x05d7:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzag(r10, r9)
            goto L_0x0a21
        L_0x05e8:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzw(r10, r9)
            goto L_0x0a21
        L_0x05f9:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbpu r9 = (com.google.android.gms.internal.ads.zzbpu) r9
            r15.zza((int) r10, (com.google.android.gms.internal.ads.zzbpu) r9)
            goto L_0x0a21
        L_0x060c:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x0621:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x0a21
        L_0x0632:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzj(r14, r11)
            r15.zzj((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x0643:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzy(r10, r9)
            goto L_0x0a21
        L_0x0654:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzl(r10, r11)
            goto L_0x0a21
        L_0x0665:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzv(r10, r9)
            goto L_0x0a21
        L_0x0676:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzj((int) r10, (long) r11)
            goto L_0x0a21
        L_0x0687:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzr(r10, r11)
            goto L_0x0a21
        L_0x0698:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzg(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a21
        L_0x06a9:
            boolean r11 = r13.zza(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzf(r14, r11)
            r15.zzb((int) r10, (double) r11)
            goto L_0x0a21
        L_0x06ba:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            r13.zza((com.google.android.gms.internal.ads.zzbup) r15, (int) r10, (java.lang.Object) r9, (int) r1)
            goto L_0x0a21
        L_0x06c5:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            com.google.android.gms.internal.ads.zzbte.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x06da:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zze(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06eb:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzj(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x06fc:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzg(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x070d:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzl(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x071e:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzm(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x072f:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzi(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0740:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzn(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0751:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzk(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0762:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzf(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0773:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzh(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0784:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzd(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x0795:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzc(r10, r9, r15, r4)
            goto L_0x0a21
        L_0x07a6:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07b7:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r4)
            goto L_0x0a21
        L_0x07c8:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zze(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07d9:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzj(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07ea:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzg(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x07fb:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzl(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x080c:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzm(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x081d:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzi(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x082e:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzb(r10, r9, r15)
            goto L_0x0a21
        L_0x083f:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            com.google.android.gms.internal.ads.zzbte.zza((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x0854:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zza((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x0a21
        L_0x0865:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzn(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0876:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzk(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0887:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzf(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x0898:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzh(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08a9:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzd(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08ba:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzc(r10, r9, r15, r5)
            goto L_0x0a21
        L_0x08cb:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zzb((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08dc:
            int[] r10 = r13.zzfsi
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.zzbte.zza((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.zzbup) r15, (boolean) r5)
            goto L_0x0a21
        L_0x08ed:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x0902:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a21
        L_0x0913:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzx(r10, r9)
            goto L_0x0a21
        L_0x0924:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r11)
            r15.zzs(r10, r11)
            goto L_0x0a21
        L_0x0935:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzaf(r10, r9)
            goto L_0x0a21
        L_0x0946:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzag(r10, r9)
            goto L_0x0a21
        L_0x0957:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzw(r10, r9)
            goto L_0x0a21
        L_0x0968:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbpu r9 = (com.google.android.gms.internal.ads.zzbpu) r9
            r15.zza((int) r10, (com.google.android.gms.internal.ads.zzbpu) r9)
            goto L_0x0a21
        L_0x097b:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            com.google.android.gms.internal.ads.zzbtc r11 = r13.zzfq(r1)
            r15.zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbtc) r11)
            goto L_0x0a21
        L_0x0990:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r11)
            zza((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.ads.zzbup) r15)
            goto L_0x0a21
        L_0x09a1:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.ads.zzbua.zzm(r14, r11)
            r15.zzj((int) r10, (boolean) r9)
            goto L_0x0a21
        L_0x09b2:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzy(r10, r9)
            goto L_0x0a21
        L_0x09c2:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r11)
            r15.zzl(r10, r11)
            goto L_0x0a21
        L_0x09d2:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.ads.zzbua.zzk(r14, r11)
            r15.zzv(r10, r9)
            goto L_0x0a21
        L_0x09e2:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r11)
            r15.zzj((int) r10, (long) r11)
            goto L_0x0a21
        L_0x09f2:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.ads.zzbua.zzl(r14, r11)
            r15.zzr(r10, r11)
            goto L_0x0a21
        L_0x0a02:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.ads.zzbua.zzn(r14, r11)
            r15.zza((int) r10, (float) r9)
            goto L_0x0a21
        L_0x0a12:
            boolean r11 = r13.zzd(r14, (int) r1)
            if (r11 == 0) goto L_0x0a21
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.ads.zzbua.zzo(r14, r11)
            r15.zzb((int) r10, (double) r11)
        L_0x0a21:
            int r1 = r1 + 3
            goto L_0x054d
        L_0x0a25:
            if (r8 == 0) goto L_0x0a3c
            com.google.android.gms.internal.ads.zzbqr<?> r1 = r13.zzfsx
            r1.zza((com.google.android.gms.internal.ads.zzbup) r15, (java.util.Map.Entry<?, ?>) r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a25
        L_0x0a3a:
            r8 = r3
            goto L_0x0a25
        L_0x0a3c:
            com.google.android.gms.internal.ads.zzbtu<?, ?> r0 = r13.zzfsw
            zza(r0, r14, (com.google.android.gms.internal.ads.zzbup) r15)
            return
        L_0x0a42:
            r13.zzb(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, com.google.android.gms.internal.ads.zzbup):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzb(T r20, com.google.android.gms.internal.ads.zzbup r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.zzfsn
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzbqr<?> r3 = r0.zzfsx
            com.google.android.gms.internal.ads.zzbqu r3 = r3.zzq(r1)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.zzfsi
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzfsh
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002c:
            if (r5 >= r7) goto L_0x0525
            int r12 = r0.zzft(r5)
            int[] r13 = r0.zzfsi
            r13 = r13[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r12
            int r14 = r14 >>> 20
            boolean r15 = r0.zzfsp
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 != 0) goto L_0x0061
            r15 = 17
            if (r14 > r15) goto L_0x0061
            int[] r15 = r0.zzfsi
            int r17 = r5 + 2
            r15 = r15[r17]
            r9 = r15 & r16
            if (r9 == r6) goto L_0x0059
            r18 = r5
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
            goto L_0x005b
        L_0x0059:
            r18 = r5
        L_0x005b:
            int r4 = r15 >>> 20
            r5 = 1
            int r9 = r5 << r4
            goto L_0x0064
        L_0x0061:
            r18 = r5
            r9 = 0
        L_0x0064:
            if (r10 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.zzbqr<?> r4 = r0.zzfsx
            int r4 = r4.zza(r10)
            if (r4 > r13) goto L_0x0083
            com.google.android.gms.internal.ads.zzbqr<?> r4 = r0.zzfsx
            r4.zza((com.google.android.gms.internal.ads.zzbup) r2, (java.util.Map.Entry<?, ?>) r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0064
        L_0x0081:
            r10 = 0
            goto L_0x0064
        L_0x0083:
            r4 = r12 & r16
            long r4 = (long) r4
            switch(r14) {
                case 0: goto L_0x0514;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04b2;
                case 8: goto L_0x04a3;
                case 9: goto L_0x0490;
                case 10: goto L_0x047f;
                case 11: goto L_0x0470;
                case 12: goto L_0x0461;
                case 13: goto L_0x0452;
                case 14: goto L_0x0443;
                case 15: goto L_0x0434;
                case 16: goto L_0x0425;
                case 17: goto L_0x0412;
                case 18: goto L_0x0400;
                case 19: goto L_0x03ee;
                case 20: goto L_0x03dc;
                case 21: goto L_0x03ca;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03a6;
                case 24: goto L_0x0394;
                case 25: goto L_0x0382;
                case 26: goto L_0x0371;
                case 27: goto L_0x035c;
                case 28: goto L_0x034b;
                case 29: goto L_0x0339;
                case 30: goto L_0x0327;
                case 31: goto L_0x0315;
                case 32: goto L_0x0303;
                case 33: goto L_0x02f1;
                case 34: goto L_0x02df;
                case 35: goto L_0x02cd;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02a9;
                case 38: goto L_0x0297;
                case 39: goto L_0x0285;
                case 40: goto L_0x0273;
                case 41: goto L_0x0261;
                case 42: goto L_0x024f;
                case 43: goto L_0x023d;
                case 44: goto L_0x022b;
                case 45: goto L_0x0219;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01e3;
                case 49: goto L_0x01ce;
                case 50: goto L_0x01c3;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a1;
                case 53: goto L_0x0190;
                case 54: goto L_0x017f;
                case 55: goto L_0x016e;
                case 56: goto L_0x015d;
                case 57: goto L_0x014c;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0115;
                case 61: goto L_0x0102;
                case 62: goto L_0x00f2;
                case 63: goto L_0x00e2;
                case 64: goto L_0x00d2;
                case 65: goto L_0x00c2;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a2;
                case 68: goto L_0x008e;
                default: goto L_0x0089;
            }
        L_0x0089:
            r12 = r18
        L_0x008b:
            r14 = 0
            goto L_0x0521
        L_0x008e:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            r2.zzb((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x008b
        L_0x00a2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = zzi(r1, r4)
            r2.zzk(r13, r4)
            goto L_0x008b
        L_0x00b2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzx(r13, r4)
            goto L_0x008b
        L_0x00c2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = zzi(r1, r4)
            r2.zzs(r13, r4)
            goto L_0x008b
        L_0x00d2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzaf(r13, r4)
            goto L_0x008b
        L_0x00e2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzag(r13, r4)
            goto L_0x008b
        L_0x00f2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzw(r13, r4)
            goto L_0x008b
        L_0x0102:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            r2.zza((int) r13, (com.google.android.gms.internal.ads.zzbpu) r4)
            goto L_0x008b
        L_0x0115:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            r2.zza((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x008b
        L_0x012a:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            java.lang.Object r4 = r8.getObject(r1, r4)
            zza((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbup) r2)
            goto L_0x008b
        L_0x013b:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            boolean r4 = zzj(r1, r4)
            r2.zzj((int) r13, (boolean) r4)
            goto L_0x008b
        L_0x014c:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzy(r13, r4)
            goto L_0x008b
        L_0x015d:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = zzi(r1, r4)
            r2.zzl(r13, r4)
            goto L_0x008b
        L_0x016e:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            int r4 = zzh(r1, r4)
            r2.zzv(r13, r4)
            goto L_0x008b
        L_0x017f:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = zzi(r1, r4)
            r2.zzj((int) r13, (long) r4)
            goto L_0x008b
        L_0x0190:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            long r4 = zzi(r1, r4)
            r2.zzr(r13, r4)
            goto L_0x008b
        L_0x01a1:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            float r4 = zzg(r1, r4)
            r2.zza((int) r13, (float) r4)
            goto L_0x008b
        L_0x01b2:
            r12 = r18
            boolean r9 = r0.zza(r1, (int) r13, (int) r12)
            if (r9 == 0) goto L_0x008b
            double r4 = zzf(r1, r4)
            r2.zzb((int) r13, (double) r4)
            goto L_0x008b
        L_0x01c3:
            r12 = r18
            java.lang.Object r4 = r8.getObject(r1, r4)
            r0.zza((com.google.android.gms.internal.ads.zzbup) r2, (int) r13, (java.lang.Object) r4, (int) r12)
            goto L_0x008b
        L_0x01ce:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x008b
        L_0x01e3:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            com.google.android.gms.internal.ads.zzbte.zze(r9, r4, r2, r13)
            goto L_0x008b
        L_0x01f5:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzj(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0207:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzg(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0219:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzl(r9, r4, r2, r13)
            goto L_0x008b
        L_0x022b:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzm(r9, r4, r2, r13)
            goto L_0x008b
        L_0x023d:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzi(r9, r4, r2, r13)
            goto L_0x008b
        L_0x024f:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzn(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0261:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzk(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0273:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzf(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0285:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzh(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0297:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzd(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02a9:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzc(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02bb:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (boolean) r13)
            goto L_0x008b
        L_0x02cd:
            r12 = r18
            r13 = 1
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (boolean) r13)
            goto L_0x008b
        L_0x02df:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            com.google.android.gms.internal.ads.zzbte.zze(r9, r4, r2, r13)
            goto L_0x008b
        L_0x02f1:
            r12 = r18
            r13 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzj(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0303:
            r12 = r18
            r13 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzg(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0315:
            r12 = r18
            r13 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzl(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0327:
            r12 = r18
            r13 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzm(r9, r4, r2, r13)
            goto L_0x008b
        L_0x0339:
            r12 = r18
            r13 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzi(r9, r4, r2, r13)
            goto L_0x008b
        L_0x034b:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzb(r9, r4, r2)
            goto L_0x008b
        L_0x035c:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x008b
        L_0x0371:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.String>) r4, (com.google.android.gms.internal.ads.zzbup) r2)
            goto L_0x008b
        L_0x0382:
            r12 = r18
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            com.google.android.gms.internal.ads.zzbte.zzn(r9, r4, r2, r14)
            goto L_0x0521
        L_0x0394:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzk(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03a6:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzf(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03b8:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzh(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ca:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzd(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03dc:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzc(r9, r4, r2, r14)
            goto L_0x0521
        L_0x03ee:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zzb((int) r9, (java.util.List<java.lang.Float>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (boolean) r14)
            goto L_0x0521
        L_0x0400:
            r12 = r18
            r14 = 0
            int[] r9 = r0.zzfsi
            r9 = r9[r12]
            java.lang.Object r4 = r8.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.zzbte.zza((int) r9, (java.util.List<java.lang.Double>) r4, (com.google.android.gms.internal.ads.zzbup) r2, (boolean) r14)
            goto L_0x0521
        L_0x0412:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            r2.zzb((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x0521
        L_0x0425:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.zzk(r13, r4)
            goto L_0x0521
        L_0x0434:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzx(r13, r4)
            goto L_0x0521
        L_0x0443:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.zzs(r13, r4)
            goto L_0x0521
        L_0x0452:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzaf(r13, r4)
            goto L_0x0521
        L_0x0461:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzag(r13, r4)
            goto L_0x0521
        L_0x0470:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzw(r13, r4)
            goto L_0x0521
        L_0x047f:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbpu r4 = (com.google.android.gms.internal.ads.zzbpu) r4
            r2.zza((int) r13, (com.google.android.gms.internal.ads.zzbpu) r4)
            goto L_0x0521
        L_0x0490:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            com.google.android.gms.internal.ads.zzbtc r5 = r0.zzfq(r12)
            r2.zza((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbtc) r5)
            goto L_0x0521
        L_0x04a3:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            java.lang.Object r4 = r8.getObject(r1, r4)
            zza((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbup) r2)
            goto L_0x0521
        L_0x04b2:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            boolean r4 = com.google.android.gms.internal.ads.zzbua.zzm(r1, r4)
            r2.zzj((int) r13, (boolean) r4)
            goto L_0x0521
        L_0x04c0:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzy(r13, r4)
            goto L_0x0521
        L_0x04ce:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.zzl(r13, r4)
            goto L_0x0521
        L_0x04dc:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            int r4 = r8.getInt(r1, r4)
            r2.zzv(r13, r4)
            goto L_0x0521
        L_0x04ea:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.zzj((int) r13, (long) r4)
            goto L_0x0521
        L_0x04f8:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            long r4 = r8.getLong(r1, r4)
            r2.zzr(r13, r4)
            goto L_0x0521
        L_0x0506:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            float r4 = com.google.android.gms.internal.ads.zzbua.zzn(r1, r4)
            r2.zza((int) r13, (float) r4)
            goto L_0x0521
        L_0x0514:
            r12 = r18
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0521
            double r4 = com.google.android.gms.internal.ads.zzbua.zzo(r1, r4)
            r2.zzb((int) r13, (double) r4)
        L_0x0521:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0525:
            if (r10 == 0) goto L_0x053c
            com.google.android.gms.internal.ads.zzbqr<?> r4 = r0.zzfsx
            r4.zza((com.google.android.gms.internal.ads.zzbup) r2, (java.util.Map.Entry<?, ?>) r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0525
        L_0x053a:
            r10 = 0
            goto L_0x0525
        L_0x053c:
            com.google.android.gms.internal.ads.zzbtu<?, ?> r3 = r0.zzfsw
            zza(r3, r1, (com.google.android.gms.internal.ads.zzbup) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zzb(java.lang.Object, com.google.android.gms.internal.ads.zzbup):void");
    }

    private final <K, V> void zza(zzbup zzbup, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzbup.zza(i, this.zzfsy.zzab(zzfr(i2)), this.zzfsy.zzx(obj));
        }
    }

    private static <UT, UB> void zza(zzbtu<UT, UB> zzbtu, T t, zzbup zzbup) throws IOException {
        zzbtu.zza(zzbtu.zzag(t), zzbup);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zza(T r13, com.google.android.gms.internal.ads.zzbtb r14, com.google.android.gms.internal.ads.zzbqq r15) throws java.io.IOException {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x05e0
            com.google.android.gms.internal.ads.zzbtu<?, ?> r7 = r12.zzfsw
            com.google.android.gms.internal.ads.zzbqr<?> r8 = r12.zzfsx
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x0009:
            int r1 = r14.zzals()     // Catch:{ all -> 0x05c8 }
            int r2 = r12.zzfw(r1)     // Catch:{ all -> 0x05c8 }
            if (r2 >= 0) goto L_0x0079
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.zzfss
        L_0x001a:
            int r15 = r12.zzfst
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzfsr
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.zzg(r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.zzfsn     // Catch:{ all -> 0x05c8 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.zzbsl r2 = r12.zzfsm     // Catch:{ all -> 0x05c8 }
            java.lang.Object r1 = r8.zza(r15, r2, r1)     // Catch:{ all -> 0x05c8 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzbqu r0 = r8.zzr(r13)     // Catch:{ all -> 0x05c8 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r0 = r0.zza(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c8 }
            r10 = r0
            r0 = r11
            goto L_0x0009
        L_0x0052:
            r7.zza(r14)     // Catch:{ all -> 0x05c8 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.zzah(r13)     // Catch:{ all -> 0x05c8 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.zza(r10, (com.google.android.gms.internal.ads.zzbtb) r14)     // Catch:{ all -> 0x05c8 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.zzfss
        L_0x0064:
            int r15 = r12.zzfst
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.zzfsr
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x0078
            r7.zzg(r13, r10)
        L_0x0078:
            return
        L_0x0079:
            int r3 = r12.zzft(r2)     // Catch:{ all -> 0x05c8 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0574;
                case 1: goto L_0x0565;
                case 2: goto L_0x0556;
                case 3: goto L_0x0547;
                case 4: goto L_0x0538;
                case 5: goto L_0x0529;
                case 6: goto L_0x051a;
                case 7: goto L_0x050b;
                case 8: goto L_0x0503;
                case 9: goto L_0x04d2;
                case 10: goto L_0x04c3;
                case 11: goto L_0x04b4;
                case 12: goto L_0x0492;
                case 13: goto L_0x0483;
                case 14: goto L_0x0474;
                case 15: goto L_0x0465;
                case 16: goto L_0x0456;
                case 17: goto L_0x0425;
                case 18: goto L_0x0417;
                case 19: goto L_0x0409;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03df;
                case 23: goto L_0x03d1;
                case 24: goto L_0x03c3;
                case 25: goto L_0x03b5;
                case 26: goto L_0x0393;
                case 27: goto L_0x0381;
                case 28: goto L_0x0373;
                case 29: goto L_0x0365;
                case 30: goto L_0x034f;
                case 31: goto L_0x0341;
                case 32: goto L_0x0333;
                case 33: goto L_0x0325;
                case 34: goto L_0x0317;
                case 35: goto L_0x0309;
                case 36: goto L_0x02fb;
                case 37: goto L_0x02ed;
                case 38: goto L_0x02df;
                case 39: goto L_0x02d1;
                case 40: goto L_0x02c3;
                case 41: goto L_0x02b5;
                case 42: goto L_0x02a7;
                case 43: goto L_0x0299;
                case 44: goto L_0x0284;
                case 45: goto L_0x0276;
                case 46: goto L_0x0268;
                case 47: goto L_0x025a;
                case 48: goto L_0x024c;
                case 49: goto L_0x023a;
                case 50: goto L_0x01f8;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01c2;
                case 54: goto L_0x01b0;
                case 55: goto L_0x019e;
                case 56: goto L_0x018c;
                case 57: goto L_0x017a;
                case 58: goto L_0x0168;
                case 59: goto L_0x0160;
                case 60: goto L_0x012f;
                case 61: goto L_0x0121;
                case 62: goto L_0x010f;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00d8;
                case 65: goto L_0x00c6;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a2;
                case 68: goto L_0x0090;
                default: goto L_0x0088;
            }
        L_0x0088:
            if (r10 != 0) goto L_0x0584
            java.lang.Object r1 = r7.zzaoy()     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0583
        L_0x0090:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r5 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r5 = r14.zzb(r5, r15)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x00a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzali()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x00b4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            int r5 = r14.zzalh()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x00c6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzalg()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x00d8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            int r5 = r14.zzalf()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x00ea:
            int r4 = r14.zzale()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbri r6 = r12.zzfs(r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r6 == 0) goto L_0x0101
            boolean r6 = r6.zzcb(r4)     // Catch:{ zzbrm -> 0x05a1 }
            if (r6 == 0) goto L_0x00fb
            goto L_0x0101
        L_0x00fb:
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbte.zza((int) r1, (int) r4, r10, r7)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0362
        L_0x0101:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r5, (java.lang.Object) r3)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x010f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            int r5 = r14.zzald()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0121:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbpu r5 = r14.zzalc()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x012f:
            boolean r4 = r12.zza(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r4 == 0) goto L_0x014b
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbua.zzp(r13, r3)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r6 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r6 = r14.zza(r6, r15)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzbrf.zzb(r5, r6)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x015b
        L_0x014b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r5 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r5 = r14.zza(r5, r15)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
        L_0x015b:
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0160:
            r12.zza((java.lang.Object) r13, (int) r3, (com.google.android.gms.internal.ads.zzbtb) r14)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0168:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            boolean r5 = r14.zzala()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x017a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            int r5 = r14.zzakz()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x018c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzaky()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x019e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            int r5 = r14.zzakx()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x01b0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzakv()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x01c2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzakw()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x01d4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            float r5 = r14.readFloat()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x01e6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            double r5 = r14.readDouble()     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zzb(r13, (int) r1, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x01f8:
            java.lang.Object r1 = r12.zzfr(r2)     // Catch:{ zzbrm -> 0x05a1 }
            int r2 = r12.zzft(r2)     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.zzbua.zzp(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r4 != 0) goto L_0x0212
            com.google.android.gms.internal.ads.zzbsg r4 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r4 = r4.zzaa(r1)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r2, (java.lang.Object) r4)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0229
        L_0x0212:
            com.google.android.gms.internal.ads.zzbsg r5 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            boolean r5 = r5.zzy(r4)     // Catch:{ zzbrm -> 0x05a1 }
            if (r5 == 0) goto L_0x0229
            com.google.android.gms.internal.ads.zzbsg r5 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r5 = r5.zzaa(r1)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbsg r6 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            r6.zzc(r5, r4)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r2, (java.lang.Object) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r4 = r5
        L_0x0229:
            com.google.android.gms.internal.ads.zzbsg r2 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            java.util.Map r2 = r2.zzw(r4)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbsg r3 = r12.zzfsy     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbse r1 = r3.zzab(r1)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zza(r2, r1, (com.google.android.gms.internal.ads.zzbqq) r15)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x023a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r1 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbrv r2 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzb(r2, r1, r15)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x024c:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzae(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x025a:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzad(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0268:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzac(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0276:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzab(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0284:
            com.google.android.gms.internal.ads.zzbrv r4 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzaa(r3)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbri r2 = r12.zzfs(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbte.zza(r1, r3, r2, r10, r7)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0362
        L_0x0299:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzz(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02a7:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzw(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02b5:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzv(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02c3:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzu(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02d1:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzt(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02df:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzr(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02ed:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzs(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x02fb:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzq(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0309:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzp(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0317:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzae(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0325:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzad(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0333:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzac(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0341:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzab(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x034f:
            com.google.android.gms.internal.ads.zzbrv r4 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzaa(r3)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbri r2 = r12.zzfs(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbte.zza(r1, r3, r2, r10, r7)     // Catch:{ zzbrm -> 0x05a1 }
        L_0x0362:
            r10 = r1
            goto L_0x0009
        L_0x0365:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzz(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0373:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzy(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0381:
            com.google.android.gms.internal.ads.zzbtc r1 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbrv r4 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r2 = r4.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zza(r2, r1, (com.google.android.gms.internal.ads.zzbqq) r15)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0393:
            boolean r1 = zzfv(r3)     // Catch:{ zzbrm -> 0x05a1 }
            if (r1 == 0) goto L_0x03a7
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzx(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03a7:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.readStringList(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03b5:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzw(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03c3:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzv(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03d1:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzu(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03df:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzt(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03ed:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzr(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x03fb:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzs(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0409:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzq(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0417:
            com.google.android.gms.internal.ads.zzbrv r1 = r12.zzfsv     // Catch:{ zzbrm -> 0x05a1 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzbrm -> 0x05a1 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzbrm -> 0x05a1 }
            r14.zzp(r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0425:
            boolean r1 = r12.zzd(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r1 == 0) goto L_0x0443
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbua.zzp(r13, r3)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r2 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r2 = r14.zzb(r2, r15)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbrf.zzb(r1, r2)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0443:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r1 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = r14.zzb(r1, r15)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0456:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzali()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0465:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            int r1 = r14.zzalh()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0474:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzalg()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0483:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            int r1 = r14.zzalf()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0492:
            int r4 = r14.zzale()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbri r6 = r12.zzfs(r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r6 == 0) goto L_0x04a9
            boolean r6 = r6.zzcb(r4)     // Catch:{ zzbrm -> 0x05a1 }
            if (r6 == 0) goto L_0x04a3
            goto L_0x04a9
        L_0x04a3:
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbte.zza((int) r1, (int) r4, r10, r7)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0362
        L_0x04a9:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r5, (int) r4)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x04b4:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            int r1 = r14.zzald()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x04c3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbpu r1 = r14.zzalc()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x04d2:
            boolean r1 = r12.zzd(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            if (r1 == 0) goto L_0x04f0
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbua.zzp(r13, r3)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r2 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r2 = r14.zza(r2, r15)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbrf.zzb(r1, r2)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x04f0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbtc r1 = r12.zzfq(r2)     // Catch:{ zzbrm -> 0x05a1 }
            java.lang.Object r1 = r14.zza(r1, r15)     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0503:
            r12.zza((java.lang.Object) r13, (int) r3, (com.google.android.gms.internal.ads.zzbtb) r14)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x050b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            boolean r1 = r14.zzala()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (boolean) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x051a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            int r1 = r14.zzakz()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0529:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzaky()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0538:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            int r1 = r14.zzakx()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zzb((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0547:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzakv()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0556:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            long r5 = r14.zzakw()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0565:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            float r1 = r14.readFloat()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (float) r1)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0574:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzbrm -> 0x05a1 }
            double r5 = r14.readDouble()     // Catch:{ zzbrm -> 0x05a1 }
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r13, (long) r3, (double) r5)     // Catch:{ zzbrm -> 0x05a1 }
            r12.zze(r13, (int) r2)     // Catch:{ zzbrm -> 0x05a1 }
            goto L_0x0009
        L_0x0583:
            r10 = r1
        L_0x0584:
            boolean r1 = r7.zza(r10, (com.google.android.gms.internal.ads.zzbtb) r14)     // Catch:{ zzbrm -> 0x05a1 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.zzfss
        L_0x058c:
            int r15 = r12.zzfst
            if (r14 >= r15) goto L_0x059b
            int[] r15 = r12.zzfsr
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x058c
        L_0x059b:
            if (r10 == 0) goto L_0x05a0
            r7.zzg(r13, r10)
        L_0x05a0:
            return
        L_0x05a1:
            r7.zza(r14)     // Catch:{ all -> 0x05c8 }
            if (r10 != 0) goto L_0x05ab
            java.lang.Object r1 = r7.zzah(r13)     // Catch:{ all -> 0x05c8 }
            r10 = r1
        L_0x05ab:
            boolean r1 = r7.zza(r10, (com.google.android.gms.internal.ads.zzbtb) r14)     // Catch:{ all -> 0x05c8 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.zzfss
        L_0x05b3:
            int r15 = r12.zzfst
            if (r14 >= r15) goto L_0x05c2
            int[] r15 = r12.zzfsr
            r15 = r15[r14]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b3
        L_0x05c2:
            if (r10 == 0) goto L_0x05c7
            r7.zzg(r13, r10)
        L_0x05c7:
            return
        L_0x05c8:
            r14 = move-exception
            int r15 = r12.zzfss
        L_0x05cb:
            int r0 = r12.zzfst
            if (r15 >= r0) goto L_0x05da
            int[] r0 = r12.zzfsr
            r0 = r0[r15]
            java.lang.Object r10 = r12.zza((java.lang.Object) r13, (int) r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05cb
        L_0x05da:
            if (r10 == 0) goto L_0x05df
            r7.zzg(r13, r10)
        L_0x05df:
            throw r14
        L_0x05e0:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, com.google.android.gms.internal.ads.zzbtb, com.google.android.gms.internal.ads.zzbqq):void");
    }

    private static zzbtv zzad(Object obj) {
        zzbrd zzbrd = (zzbrd) obj;
        zzbtv zzbtv = zzbrd.zzfpu;
        if (zzbtv != zzbtv.zzaoz()) {
            return zzbtv;
        }
        zzbtv zzapa = zzbtv.zzapa();
        zzbrd.zzfpu = zzapa;
        return zzapa;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zza(com.google.android.gms.internal.ads.zzbtc r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.zzbpr r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.zzbpr) r10)
            int r8 = r10.zzfld
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzs(r9)
            r10.zzflf = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzbrl r6 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(com.google.android.gms.internal.ads.zzbtc, byte[], int, int, com.google.android.gms.internal.ads.zzbpr):int");
    }

    private static int zza(zzbtc zzbtc, byte[] bArr, int i, int i2, int i3, zzbpr zzbpr) throws IOException {
        zzbsp zzbsp = (zzbsp) zzbtc;
        Object newInstance = zzbsp.newInstance();
        int zza = zzbsp.zza(newInstance, bArr, i, i2, i3, zzbpr);
        zzbsp.zzs(newInstance);
        zzbpr.zzflf = newInstance;
        return zza;
    }

    private static int zza(zzbtc<?> zzbtc, int i, byte[] bArr, int i2, int i3, zzbrk<?> zzbrk, zzbpr zzbpr) throws IOException {
        int zza = zza((zzbtc) zzbtc, bArr, i2, i3, zzbpr);
        zzbrk.add(zzbpr.zzflf);
        while (zza < i3) {
            int zza2 = zzbpq.zza(bArr, zza, zzbpr);
            if (i != zzbpr.zzfld) {
                break;
            }
            zza = zza((zzbtc) zzbtc, bArr, zza2, i3, zzbpr);
            zzbrk.add(zzbpr.zzflf);
        }
        return zza;
    }

    private static int zza(byte[] bArr, int i, int i2, zzbuj zzbuj, Class<?> cls, zzbpr zzbpr) throws IOException {
        switch (zzbsq.zzfmd[zzbuj.ordinal()]) {
            case 1:
                int zzb = zzbpq.zzb(bArr, i, zzbpr);
                zzbpr.zzflf = Boolean.valueOf(zzbpr.zzfle != 0);
                return zzb;
            case 2:
                return zzbpq.zze(bArr, i, zzbpr);
            case 3:
                zzbpr.zzflf = Double.valueOf(zzbpq.zzi(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzbpr.zzflf = Integer.valueOf(zzbpq.zzg(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzbpr.zzflf = Long.valueOf(zzbpq.zzh(bArr, i));
                return i + 8;
            case 8:
                zzbpr.zzflf = Float.valueOf(zzbpq.zzj(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzbpq.zza(bArr, i, zzbpr);
                zzbpr.zzflf = Integer.valueOf(zzbpr.zzfld);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzbpq.zzb(bArr, i, zzbpr);
                zzbpr.zzflf = Long.valueOf(zzbpr.zzfle);
                return zzb2;
            case 14:
                return zza((zzbtc) zzbsy.zzaog().zzf(cls), bArr, i, i2, zzbpr);
            case 15:
                int zza2 = zzbpq.zza(bArr, i, zzbpr);
                zzbpr.zzflf = Integer.valueOf(zzbqf.zzeu(zzbpr.zzfld));
                return zza2;
            case 16:
                int zzb3 = zzbpq.zzb(bArr, i, zzbpr);
                zzbpr.zzflf = Long.valueOf(zzbqf.zzax(zzbpr.zzfle));
                return zzb3;
            case 17:
                return zzbpq.zzd(bArr, i, zzbpr);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzbpr zzbpr) throws IOException {
        return zzbpq.zza(i, bArr, i2, i3, zzad(obj), zzbpr);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0433 A[SYNTHETIC] */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.zzbpr r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = zzfsh
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzbrk r11 = (com.google.android.gms.internal.ads.zzbrk) r11
            boolean r12 = r11.zzaki()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.zzbrk r11 = r11.zzel(r12)
            sun.misc.Unsafe r12 = zzfsh
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03f2;
                case 19: goto L_0x03b2;
                case 20: goto L_0x0371;
                case 21: goto L_0x0371;
                case 22: goto L_0x0357;
                case 23: goto L_0x0316;
                case 24: goto L_0x02d5;
                case 25: goto L_0x027e;
                case 26: goto L_0x01c4;
                case 27: goto L_0x01aa;
                case 28: goto L_0x0151;
                case 29: goto L_0x0357;
                case 30: goto L_0x0119;
                case 31: goto L_0x02d5;
                case 32: goto L_0x0316;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03f2;
                case 36: goto L_0x03b2;
                case 37: goto L_0x0371;
                case 38: goto L_0x0371;
                case 39: goto L_0x0357;
                case 40: goto L_0x0316;
                case 41: goto L_0x02d5;
                case 42: goto L_0x027e;
                case 43: goto L_0x0357;
                case 44: goto L_0x0119;
                case 45: goto L_0x02d5;
                case 46: goto L_0x0316;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0432
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0432
            com.google.android.gms.internal.ads.zzbtc r1 = r0.zzfq(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.ads.zzbtc) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.zzbpr) r27)
            java.lang.Object r8 = r7.zzflf
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0432
            int r8 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r9 = r7.zzfld
            if (r2 != r9) goto L_0x0432
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = zza((com.google.android.gms.internal.ads.zzbtc) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.zzbpr) r27)
            java.lang.Object r8 = r7.zzflf
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r1, r7)
            long r4 = r7.zzfle
            long r4 = com.google.android.gms.internal.ads.zzbqf.zzax(r4)
            r11.zzbj(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0433
        L_0x009e:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r7)
            long r8 = r7.zzfle
            long r8 = com.google.android.gms.internal.ads.zzbqf.zzax(r8)
            r11.zzbj(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r7)
            long r8 = r7.zzfle
            long r8 = com.google.android.gms.internal.ads.zzbqf.zzax(r8)
            r11.zzbj(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.ads.zzbre r11 = (com.google.android.gms.internal.ads.zzbre) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r4 = r7.zzfld
            int r4 = com.google.android.gms.internal.ads.zzbqf.zzeu(r4)
            r11.zzfo(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0433
        L_0x00eb:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.zzbre r11 = (com.google.android.gms.internal.ads.zzbre) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            int r4 = com.google.android.gms.internal.ads.zzbqf.zzeu(r4)
            r11.zzfo(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            int r4 = com.google.android.gms.internal.ads.zzbqf.zzeu(r4)
            r11.zzfo(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.zzbrk<?>) r11, (com.google.android.gms.internal.ads.zzbpr) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0432
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzbrk<?>) r6, (com.google.android.gms.internal.ads.zzbpr) r7)
        L_0x0131:
            com.google.android.gms.internal.ads.zzbrd r1 = (com.google.android.gms.internal.ads.zzbrd) r1
            com.google.android.gms.internal.ads.zzbtv r3 = r1.zzfpu
            com.google.android.gms.internal.ads.zzbtv r4 = com.google.android.gms.internal.ads.zzbtv.zzaoz()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.ads.zzbri r4 = r0.zzfs(r8)
            com.google.android.gms.internal.ads.zzbtu<?, ?> r5 = r0.zzfsw
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbte.zza(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.zzbtv r3 = (com.google.android.gms.internal.ads.zzbtv) r3
            if (r3 == 0) goto L_0x014e
            r1.zzfpu = r3
        L_0x014e:
            r1 = r2
            goto L_0x0433
        L_0x0151:
            if (r6 != r10) goto L_0x0432
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x01a5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a0
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbpu r4 = com.google.android.gms.internal.ads.zzbpu.zzfli
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.ads.zzbpu r6 = com.google.android.gms.internal.ads.zzbpu.zzi(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x019b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0196
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.ads.zzbpu r4 = com.google.android.gms.internal.ads.zzbpu.zzfli
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.ads.zzbpu r6 = com.google.android.gms.internal.ads.zzbpu.zzi(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x016f
        L_0x0196:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x019b:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x01a0:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x01a5:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x01aa:
            if (r6 != r10) goto L_0x0432
            com.google.android.gms.internal.ads.zzbtc r1 = r0.zzfq(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = zza((com.google.android.gms.internal.ads.zzbtc<?>) r22, (int) r23, (byte[]) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.zzbrk<?>) r27, (com.google.android.gms.internal.ads.zzbpr) r28)
            goto L_0x0433
        L_0x01c4:
            if (r6 != r10) goto L_0x0432
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x021a
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x0215
            if (r4 != 0) goto L_0x01df
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x01df:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.zzbrf.UTF_8
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x01ea:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x0210
            if (r4 != 0) goto L_0x0204
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x01ea
        L_0x0204:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.ads.zzbrf.UTF_8
            r6.<init>(r3, r1, r4, r8)
            r11.add(r6)
            int r1 = r1 + r4
            goto L_0x01ea
        L_0x0210:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x021a:
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x0279
            if (r4 != 0) goto L_0x022a
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x022a:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.zzbuc.zzm(r3, r1, r6)
            if (r8 == 0) goto L_0x0274
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzbrf.UTF_8
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x023c:
            r1 = r6
        L_0x023d:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            if (r4 < 0) goto L_0x026f
            if (r4 != 0) goto L_0x0257
            java.lang.String r4 = ""
            r11.add(r4)
            goto L_0x023d
        L_0x0257:
            int r6 = r1 + r4
            boolean r8 = com.google.android.gms.internal.ads.zzbuc.zzm(r3, r1, r6)
            if (r8 == 0) goto L_0x026a
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzbrf.UTF_8
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x023c
        L_0x026a:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzank()
            throw r1
        L_0x026f:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x0274:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzank()
            throw r1
        L_0x0279:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzand()
            throw r1
        L_0x027e:
            r1 = 0
            if (r6 != r10) goto L_0x02a6
            com.google.android.gms.internal.ads.zzbps r11 = (com.google.android.gms.internal.ads.zzbps) r11
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r4 = r7.zzfld
            int r4 = r4 + r2
        L_0x028a:
            if (r2 >= r4) goto L_0x029d
            int r2 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r2, r7)
            long r5 = r7.zzfle
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0298
            r5 = 1
            goto L_0x0299
        L_0x0298:
            r5 = 0
        L_0x0299:
            r11.addBoolean(r5)
            goto L_0x028a
        L_0x029d:
            if (r2 != r4) goto L_0x02a1
            goto L_0x014e
        L_0x02a1:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x02a6:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.zzbps r11 = (com.google.android.gms.internal.ads.zzbps) r11
            int r4 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r7)
            long r8 = r7.zzfle
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02b6
            r6 = 1
            goto L_0x02b7
        L_0x02b6:
            r6 = 0
        L_0x02b7:
            r11.addBoolean(r6)
        L_0x02ba:
            if (r4 >= r5) goto L_0x0432
            int r6 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r8 = r7.zzfld
            if (r2 != r8) goto L_0x0432
            int r4 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r6, r7)
            long r8 = r7.zzfle
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            r11.addBoolean(r6)
            goto L_0x02ba
        L_0x02d5:
            if (r6 != r10) goto L_0x02f5
            com.google.android.gms.internal.ads.zzbre r11 = (com.google.android.gms.internal.ads.zzbre) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x02e0:
            if (r1 >= r2) goto L_0x02ec
            int r4 = com.google.android.gms.internal.ads.zzbpq.zzg(r3, r1)
            r11.zzfo(r4)
            int r1 = r1 + 4
            goto L_0x02e0
        L_0x02ec:
            if (r1 != r2) goto L_0x02f0
            goto L_0x0433
        L_0x02f0:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x02f5:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.zzbre r11 = (com.google.android.gms.internal.ads.zzbre) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzg(r18, r19)
            r11.zzfo(r1)
            int r1 = r4 + 4
        L_0x0302:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzg(r3, r4)
            r11.zzfo(r1)
            int r1 = r4 + 4
            goto L_0x0302
        L_0x0316:
            if (r6 != r10) goto L_0x0336
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x0321:
            if (r1 >= r2) goto L_0x032d
            long r4 = com.google.android.gms.internal.ads.zzbpq.zzh(r3, r1)
            r11.zzbj(r4)
            int r1 = r1 + 8
            goto L_0x0321
        L_0x032d:
            if (r1 != r2) goto L_0x0331
            goto L_0x0433
        L_0x0331:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x0336:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            long r8 = com.google.android.gms.internal.ads.zzbpq.zzh(r18, r19)
            r11.zzbj(r8)
            int r1 = r4 + 8
        L_0x0343:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            long r8 = com.google.android.gms.internal.ads.zzbpq.zzh(r3, r4)
            r11.zzbj(r8)
            int r1 = r4 + 8
            goto L_0x0343
        L_0x0357:
            if (r6 != r10) goto L_0x035f
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.zzbrk<?>) r11, (com.google.android.gms.internal.ads.zzbpr) r7)
            goto L_0x0433
        L_0x035f:
            if (r6 != 0) goto L_0x0432
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.ads.zzbrk<?>) r25, (com.google.android.gms.internal.ads.zzbpr) r26)
            goto L_0x0433
        L_0x0371:
            if (r6 != r10) goto L_0x0391
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x037c:
            if (r1 >= r2) goto L_0x0388
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r1, r7)
            long r4 = r7.zzfle
            r11.zzbj(r4)
            goto L_0x037c
        L_0x0388:
            if (r1 != r2) goto L_0x038c
            goto L_0x0433
        L_0x038c:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x0391:
            if (r6 != 0) goto L_0x0432
            com.google.android.gms.internal.ads.zzbrz r11 = (com.google.android.gms.internal.ads.zzbrz) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r7)
            long r8 = r7.zzfle
            r11.zzbj(r8)
        L_0x039e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r7)
            long r8 = r7.zzfle
            r11.zzbj(r8)
            goto L_0x039e
        L_0x03b2:
            if (r6 != r10) goto L_0x03d1
            com.google.android.gms.internal.ads.zzbra r11 = (com.google.android.gms.internal.ads.zzbra) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x03bd:
            if (r1 >= r2) goto L_0x03c9
            float r4 = com.google.android.gms.internal.ads.zzbpq.zzj(r3, r1)
            r11.zzh(r4)
            int r1 = r1 + 4
            goto L_0x03bd
        L_0x03c9:
            if (r1 != r2) goto L_0x03cc
            goto L_0x0433
        L_0x03cc:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x03d1:
            if (r6 != r9) goto L_0x0432
            com.google.android.gms.internal.ads.zzbra r11 = (com.google.android.gms.internal.ads.zzbra) r11
            float r1 = com.google.android.gms.internal.ads.zzbpq.zzj(r18, r19)
            r11.zzh(r1)
            int r1 = r4 + 4
        L_0x03de:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            float r1 = com.google.android.gms.internal.ads.zzbpq.zzj(r3, r4)
            r11.zzh(r1)
            int r1 = r4 + 4
            goto L_0x03de
        L_0x03f2:
            if (r6 != r10) goto L_0x0411
            com.google.android.gms.internal.ads.zzbqn r11 = (com.google.android.gms.internal.ads.zzbqn) r11
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r7)
            int r2 = r7.zzfld
            int r2 = r2 + r1
        L_0x03fd:
            if (r1 >= r2) goto L_0x0409
            double r4 = com.google.android.gms.internal.ads.zzbpq.zzi(r3, r1)
            r11.zzd(r4)
            int r1 = r1 + 8
            goto L_0x03fd
        L_0x0409:
            if (r1 != r2) goto L_0x040c
            goto L_0x0433
        L_0x040c:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r1
        L_0x0411:
            if (r6 != r13) goto L_0x0432
            com.google.android.gms.internal.ads.zzbqn r11 = (com.google.android.gms.internal.ads.zzbqn) r11
            double r8 = com.google.android.gms.internal.ads.zzbpq.zzi(r18, r19)
            r11.zzd(r8)
            int r1 = r4 + 8
        L_0x041e:
            if (r1 >= r5) goto L_0x0433
            int r4 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r1, r7)
            int r6 = r7.zzfld
            if (r2 != r6) goto L_0x0433
            double r8 = com.google.android.gms.internal.ads.zzbpq.zzi(r3, r4)
            r11.zzd(r8)
            int r1 = r4 + 8
            goto L_0x041e
        L_0x0432:
            r1 = r4
        L_0x0433:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzbpr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zza(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.zzbpr r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzfsh
            java.lang.Object r12 = r7.zzfr(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.zzbsg r2 = r7.zzfsy
            boolean r2 = r2.zzy(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzbsg r2 = r7.zzfsy
            java.lang.Object r2 = r2.zzaa(r12)
            com.google.android.gms.internal.ads.zzbsg r3 = r7.zzfsy
            r3.zzc(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.ads.zzbsg r8 = r7.zzfsy
            com.google.android.gms.internal.ads.zzbse r8 = r8.zzab(r12)
            com.google.android.gms.internal.ads.zzbsg r12 = r7.zzfsy
            java.util.Map r12 = r12.zzw(r1)
            int r10 = com.google.android.gms.internal.ads.zzbpq.zza(r9, r10, r15)
            int r13 = r15.zzfld
            if (r13 < 0) goto L_0x0094
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0094
            int r13 = r13 + r10
            K r14 = r8.zzfsa
            V r0 = r8.zzfsc
        L_0x003e:
            if (r10 >= r13) goto L_0x0089
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.ads.zzbpq.zza((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.ads.zzbpr) r15)
            int r10 = r15.zzfld
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            switch(r1) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0084
        L_0x0055:
            com.google.android.gms.internal.ads.zzbuj r1 = r8.zzfsb
            int r1 = r1.zzapk()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.zzbuj r4 = r8.zzfsb
            V r10 = r8.zzfsc
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzbuj) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzbpr) r6)
            java.lang.Object r0 = r15.zzflf
            goto L_0x003e
        L_0x006f:
            com.google.android.gms.internal.ads.zzbuj r1 = r8.zzfrz
            int r1 = r1.zzapk()
            if (r3 != r1) goto L_0x0084
            com.google.android.gms.internal.ads.zzbuj r4 = r8.zzfrz
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zza((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzbuj) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.zzbpr) r6)
            java.lang.Object r14 = r15.zzflf
            goto L_0x003e
        L_0x0084:
            int r10 = com.google.android.gms.internal.ads.zzbpq.zza(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x0089:
            if (r10 != r13) goto L_0x008f
            r12.put(r14, r0)
            return r13
        L_0x008f:
            com.google.android.gms.internal.ads.zzbrl r8 = com.google.android.gms.internal.ads.zzbrl.zzanj()
            throw r8
        L_0x0094:
            com.google.android.gms.internal.ads.zzbrl r8 = com.google.android.gms.internal.ads.zzbrl.zzanc()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.zzbpr):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a1, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.zzbpr r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzfsh
            int[] r7 = r0.zzfsi
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0191;
                case 52: goto L_0x0181;
                case 53: goto L_0x0171;
                case 54: goto L_0x0171;
                case 55: goto L_0x0161;
                case 56: goto L_0x0150;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x0161;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x0150;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a5
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a5
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.zzbtc r2 = r0.zzfq(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = zza((com.google.android.gms.internal.ads.zzbtc) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.zzbpr) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.zzflf
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0055:
            java.lang.Object r3 = r11.zzflf
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbrf.zzb(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0060:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r11)
            long r3 = r11.zzfle
            long r3 = com.google.android.gms.internal.ads.zzbqf.zzax(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0075:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r11)
            int r3 = r11.zzfld
            int r3 = com.google.android.gms.internal.ads.zzbqf.zzeu(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x008a:
            if (r5 != 0) goto L_0x01a5
            int r3 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r11)
            int r4 = r11.zzfld
            com.google.android.gms.internal.ads.zzbri r5 = r0.zzfs(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.zzcb(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.ads.zzbtv r1 = zzad(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzc(r2, r4)
            r2 = r3
            goto L_0x01a6
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01a1
        L_0x00b8:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zze(r3, r4, r11)
            java.lang.Object r3 = r11.zzflf
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x00c5:
            if (r5 != r15) goto L_0x01a5
            com.google.android.gms.internal.ads.zzbtc r2 = r0.zzfq(r6)
            r5 = r20
            int r2 = zza((com.google.android.gms.internal.ads.zzbtc) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzbpr) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.zzflf
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.zzflf
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzbrf.zzb(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x00f3:
            if (r5 != r15) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r11)
            int r4 = r11.zzfld
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.zzbuc.zzm(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.ads.zzbrl r1 = com.google.android.gms.internal.ads.zzbrl.zzank()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.zzbrf.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x0127:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r11)
            long r3 = r11.zzfle
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0140:
            if (r5 != r7) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zzg(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0150:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            long r2 = com.google.android.gms.internal.ads.zzbpq.zzh(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x01a1
        L_0x0161:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r4, r11)
            int r3 = r11.zzfld
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0171:
            if (r5 != 0) goto L_0x01a5
            int r2 = com.google.android.gms.internal.ads.zzbpq.zzb(r3, r4, r11)
            long r3 = r11.zzfle
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01a1
        L_0x0181:
            if (r5 != r7) goto L_0x01a5
            float r2 = com.google.android.gms.internal.ads.zzbpq.zzj(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x01a1
        L_0x0191:
            r2 = 1
            if (r5 != r2) goto L_0x01a5
            double r2 = com.google.android.gms.internal.ads.zzbpq.zzi(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x01a1:
            r12.putInt(r1, r13, r8)
            goto L_0x01a6
        L_0x01a5:
            r2 = r4
        L_0x01a6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.zzbpr):int");
    }

    private final zzbtc zzfq(int i) {
        int i2 = (i / 3) << 1;
        zzbtc zzbtc = (zzbtc) this.zzfsj[i2];
        if (zzbtc != null) {
            return zzbtc;
        }
        zzbtc zzf = zzbsy.zzaog().zzf((Class) this.zzfsj[i2 + 1]);
        this.zzfsj[i2] = zzf;
        return zzf;
    }

    private final Object zzfr(int i) {
        return this.zzfsj[(i / 3) << 1];
    }

    private final zzbri zzfs(int i) {
        return (zzbri) this.zzfsj[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bb, code lost:
        r20 = r6;
        r25 = r7;
        r19 = r8;
        r28 = r10;
        r2 = r11;
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035a, code lost:
        if (r0 == r15) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035e, code lost:
        r12 = r32;
        r9 = r36;
        r1 = r17;
        r2 = r19;
        r6 = r20;
        r7 = r25;
        r10 = r28;
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x039f, code lost:
        if (r0 == r15) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0215, code lost:
        r6 = r6 | r22;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0241, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x027a, code lost:
        r2 = r8;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b1, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b2, code lost:
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.ads.zzbpr r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = zzfsh
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x0404
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.zzbpr) r9)
            int r3 = r9.zzfld
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.zzai(r3, r2)
        L_0x0036:
            r2 = r1
            r1 = -1
            goto L_0x003e
        L_0x0039:
            int r1 = r15.zzfw(r3)
            goto L_0x0036
        L_0x003e:
            if (r2 != r1) goto L_0x004f
            r17 = r3
            r2 = r4
            r20 = r6
            r25 = r7
            r28 = r10
            r6 = r11
            r19 = 0
            r7 = r5
            goto L_0x03c5
        L_0x004f:
            int[] r1 = r15.zzfsi
            int r18 = r2 + 1
            r1 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r8 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r1 & r18
            long r11 = (long) r5
            r5 = 17
            r21 = r1
            if (r8 > r5) goto L_0x02c7
            int[] r5 = r15.zzfsi
            int r22 = r2 + 2
            r5 = r5[r22]
            int r22 = r5 >>> 20
            r1 = 1
            int r22 = r1 << r22
            r5 = r5 & r18
            if (r5 == r7) goto L_0x008c
            r13 = -1
            if (r7 == r13) goto L_0x0082
            r24 = r2
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
            goto L_0x0084
        L_0x0082:
            r24 = r2
        L_0x0084:
            long r1 = (long) r5
            int r1 = r10.getInt(r14, r1)
            r6 = r1
            r7 = r5
            goto L_0x008f
        L_0x008c:
            r24 = r2
            r13 = -1
        L_0x008f:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0297;
                case 1: goto L_0x027d;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x0244;
                case 5: goto L_0x021e;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01d7;
                case 8: goto L_0x01b0;
                case 9: goto L_0x0177;
                case 10: goto L_0x015b;
                case 11: goto L_0x0244;
                case 12: goto L_0x0128;
                case 13: goto L_0x01fb;
                case 14: goto L_0x021e;
                case 15: goto L_0x010c;
                case 16: goto L_0x00e9;
                case 17: goto L_0x00a0;
                default: goto L_0x0093;
            }
        L_0x0093:
            r17 = r3
            r11 = r4
            r13 = r20
            r8 = r24
        L_0x009a:
            r12 = r32
        L_0x009c:
            r18 = -1
            goto L_0x02bb
        L_0x00a0:
            r2 = 3
            if (r0 != r2) goto L_0x00e1
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r24
            com.google.android.gms.internal.ads.zzbtc r0 = r15.zzfq(r2)
            r1 = r32
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r34
            r4 = r5
            r13 = r20
            r5 = r36
            int r0 = zza((com.google.android.gms.internal.ads.zzbtc) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.zzbpr) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c8
            java.lang.Object r1 = r9.zzflf
            r10.putObject(r14, r11, r1)
            goto L_0x00d5
        L_0x00c8:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.zzflf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbrf.zzb(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d5:
            r6 = r6 | r22
            r2 = r8
            r3 = r13
            r1 = r17
            r11 = r35
            r12 = r32
            goto L_0x02b7
        L_0x00e1:
            r17 = r3
            r13 = r20
            r8 = r24
            r11 = r4
            goto L_0x009a
        L_0x00e9:
            r17 = r3
            r13 = r20
            r8 = r24
            if (r0 != 0) goto L_0x0108
            r2 = r11
            r12 = r32
            int r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r4, r9)
            long r0 = r9.zzfle
            long r4 = com.google.android.gms.internal.ads.zzbqf.zzax(r0)
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            goto L_0x027a
        L_0x0108:
            r12 = r32
            goto L_0x0174
        L_0x010c:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r4, r9)
            int r1 = r9.zzfld
            int r1 = com.google.android.gms.internal.ads.zzbqf.zzeu(r1)
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0128:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            if (r0 != 0) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r4, r9)
            int r1 = r9.zzfld
            com.google.android.gms.internal.ads.zzbri r4 = r15.zzfs(r8)
            if (r4 == 0) goto L_0x0154
            boolean r4 = r4.zzcb(r1)
            if (r4 == 0) goto L_0x0146
            goto L_0x0154
        L_0x0146:
            com.google.android.gms.internal.ads.zzbtv r2 = zzad(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzc(r13, r1)
            goto L_0x02b1
        L_0x0154:
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x015b:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.zzbpq.zze(r12, r4, r9)
            java.lang.Object r1 = r9.zzflf
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0174:
            r11 = r4
            goto L_0x009c
        L_0x0177:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r12 = r32
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.ads.zzbtc r0 = r15.zzfq(r8)
            r11 = r34
            r18 = -1
            int r0 = zza((com.google.android.gms.internal.ads.zzbtc) r0, (byte[]) r12, (int) r4, (int) r11, (com.google.android.gms.internal.ads.zzbpr) r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x0199
            java.lang.Object r1 = r9.zzflf
            r10.putObject(r14, r2, r1)
            goto L_0x01a6
        L_0x0199:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.zzflf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbrf.zzb(r1, r4)
            r10.putObject(r14, r2, r1)
        L_0x01a6:
            r6 = r6 | r22
            goto L_0x0215
        L_0x01aa:
            r11 = r34
            r18 = -1
            goto L_0x0241
        L_0x01b0:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 2
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01cb
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzc(r12, r4, r9)
            goto L_0x01cf
        L_0x01cb:
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzd(r12, r4, r9)
        L_0x01cf:
            java.lang.Object r1 = r9.zzflf
            r10.putObject(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x0215
        L_0x01d7:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != 0) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r4, r9)
            long r4 = r9.zzfle
            r19 = 0
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (boolean) r1)
            r6 = r6 | r22
            goto L_0x0215
        L_0x01fb:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzg(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r6 | r22
        L_0x0215:
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            r11 = r35
            goto L_0x0017
        L_0x021e:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r11 = r34
            r12 = r32
            r18 = -1
            if (r0 != r1) goto L_0x0241
            long r19 = com.google.android.gms.internal.ads.zzbpq.zzh(r12, r4)
            r0 = r10
            r1 = r31
            r11 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r11 + 8
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0241:
            r11 = r4
            goto L_0x02bb
        L_0x0244:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02bb
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r11, r9)
            int r1 = r9.zzfld
            r10.putInt(r14, r2, r1)
            r6 = r6 | r22
            goto L_0x02b1
        L_0x025e:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != 0) goto L_0x02bb
            int r11 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r11, r9)
            long r4 = r9.zzfle
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
        L_0x027a:
            r2 = r8
            r0 = r11
            goto L_0x02b2
        L_0x027d:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02bb
            float r0 = com.google.android.gms.internal.ads.zzbpq.zzj(r12, r11)
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r11 + 4
            r6 = r6 | r22
            goto L_0x02b1
        L_0x0297:
            r17 = r3
            r2 = r11
            r13 = r20
            r8 = r24
            r1 = 1
            r12 = r32
            r18 = -1
            r11 = r4
            if (r0 != r1) goto L_0x02bb
            double r0 = com.google.android.gms.internal.ads.zzbpq.zzi(r12, r11)
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (double) r0)
            int r0 = r11 + 8
            r6 = r6 | r22
        L_0x02b1:
            r2 = r8
        L_0x02b2:
            r3 = r13
            r1 = r17
        L_0x02b5:
            r11 = r35
        L_0x02b7:
            r13 = r34
            goto L_0x0017
        L_0x02bb:
            r20 = r6
            r25 = r7
            r19 = r8
            r28 = r10
            r2 = r11
            r7 = r13
            goto L_0x03a5
        L_0x02c7:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r20
            r12 = r32
            r18 = -1
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x0322
            r1 = 2
            if (r0 != r1) goto L_0x0315
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0
            boolean r1 = r0.zzaki()
            if (r1 != 0) goto L_0x02f7
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ee
            r1 = 10
            goto L_0x02f0
        L_0x02ee:
            int r1 = r1 << 1
        L_0x02f0:
            com.google.android.gms.internal.ads.zzbrk r0 = r0.zzel(r1)
            r10.putObject(r14, r2, r0)
        L_0x02f7:
            r8 = r0
            com.google.android.gms.internal.ads.zzbtc r0 = r15.zzfq(r5)
            r1 = r13
            r2 = r32
            r3 = r11
            r4 = r34
            r19 = r5
            r5 = r8
            r20 = r6
            r6 = r36
            int r0 = zza((com.google.android.gms.internal.ads.zzbtc<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.zzbrk<?>) r5, (com.google.android.gms.internal.ads.zzbpr) r6)
            r3 = r13
            r1 = r17
            r2 = r19
            r6 = r20
            goto L_0x02b5
        L_0x0315:
            r19 = r5
            r20 = r6
            r25 = r7
            r28 = r10
            r15 = r11
            r29 = r13
            goto L_0x03a2
        L_0x0322:
            r19 = r5
            r20 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0372
            r1 = r21
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r21 = r2
            r2 = r32
            r3 = r11
            r26 = r4
            r4 = r34
            r23 = r5
            r5 = r13
            r6 = r17
            r25 = r7
            r7 = r26
            r27 = r8
            r15 = -1
            r8 = r19
            r28 = r10
            r9 = r23
            r15 = r11
            r11 = r27
            r29 = r13
            r12 = r21
            r14 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.zzbpr) r14)
            if (r0 != r15) goto L_0x035e
        L_0x035c:
            r2 = r0
            goto L_0x03a3
        L_0x035e:
            r12 = r32
            r9 = r36
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
            r3 = r29
        L_0x036e:
            r11 = r35
            goto L_0x03e9
        L_0x0372:
            r26 = r0
            r25 = r7
            r27 = r8
            r28 = r10
            r15 = r11
            r29 = r13
            r1 = r21
            r21 = r2
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x03a8
            r7 = r26
            r0 = 2
            if (r7 != r0) goto L_0x03a2
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r21
            r8 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.zzbpr) r8)
            if (r0 != r15) goto L_0x035e
            goto L_0x035c
        L_0x03a2:
            r2 = r15
        L_0x03a3:
            r7 = r29
        L_0x03a5:
            r6 = r35
            goto L_0x03c5
        L_0x03a8:
            r7 = r26
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r29
            r6 = r17
            r10 = r21
            r12 = r19
            r13 = r36
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.zzbpr) r13)
            if (r0 != r15) goto L_0x03f1
            goto L_0x035c
        L_0x03c5:
            if (r7 != r6) goto L_0x03cc
            if (r6 != 0) goto L_0x03ca
            goto L_0x03cc
        L_0x03ca:
            r3 = r7
            goto L_0x040c
        L_0x03cc:
            r0 = r7
            r1 = r32
            r3 = r34
            r4 = r31
            r5 = r36
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbpr) r5)
            r12 = r32
            r9 = r36
            r11 = r6
            r3 = r7
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
        L_0x03e9:
            r13 = r34
            r14 = r31
            r15 = r30
            goto L_0x0017
        L_0x03f1:
            r7 = r29
            r12 = r32
            r9 = r36
            r3 = r7
            r1 = r17
            r2 = r19
            r6 = r20
            r7 = r25
            r10 = r28
            goto L_0x036e
        L_0x0404:
            r20 = r6
            r25 = r7
            r28 = r10
            r6 = r11
            r2 = r0
        L_0x040c:
            r1 = r20
            r0 = r25
            r4 = -1
            if (r0 == r4) goto L_0x041c
            long r4 = (long) r0
            r7 = r28
            r0 = r31
            r7.putInt(r0, r4, r1)
            goto L_0x041e
        L_0x041c:
            r0 = r31
        L_0x041e:
            r1 = 0
            r4 = r30
            int r5 = r4.zzfss
        L_0x0423:
            int r7 = r4.zzfst
            if (r5 >= r7) goto L_0x0436
            int[] r7 = r4.zzfsr
            r7 = r7[r5]
            com.google.android.gms.internal.ads.zzbtu<?, ?> r8 = r4.zzfsw
            java.lang.Object r1 = r4.zza((java.lang.Object) r0, (int) r7, r1, r8)
            com.google.android.gms.internal.ads.zzbtv r1 = (com.google.android.gms.internal.ads.zzbtv) r1
            int r5 = r5 + 1
            goto L_0x0423
        L_0x0436:
            if (r1 == 0) goto L_0x043d
            com.google.android.gms.internal.ads.zzbtu<?, ?> r5 = r4.zzfsw
            r5.zzg(r0, r1)
        L_0x043d:
            if (r6 != 0) goto L_0x0449
            r0 = r34
            if (r2 != r0) goto L_0x0444
            goto L_0x044f
        L_0x0444:
            com.google.android.gms.internal.ads.zzbrl r0 = com.google.android.gms.internal.ads.zzbrl.zzanj()
            throw r0
        L_0x0449:
            r0 = r34
            if (r2 > r0) goto L_0x0450
            if (r3 != r6) goto L_0x0450
        L_0x044f:
            return r2
        L_0x0450:
            com.google.android.gms.internal.ads.zzbrl r0 = com.google.android.gms.internal.ads.zzbrl.zzanj()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzbpr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0149, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016c, code lost:
        r25 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e4, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0212, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0231, code lost:
        if (r0 == r15) goto L_0x01e6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r29, byte[] r30, int r31, int r32, com.google.android.gms.internal.ads.zzbpr r33) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            boolean r0 = r15.zzfsp
            if (r0 == 0) goto L_0x025e
            sun.misc.Unsafe r9 = zzfsh
            r10 = -1
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0255
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.zzbpr) r11)
            int r3 = r11.zzfld
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.zzai(r7, r2)
        L_0x0038:
            r4 = r0
            goto L_0x003f
        L_0x003a:
            int r0 = r15.zzfw(r7)
            goto L_0x0038
        L_0x003f:
            if (r4 != r10) goto L_0x004c
            r25 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r27 = -1
            goto L_0x0234
        L_0x004c:
            int[] r0 = r15.zzfsi
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0175
            r0 = 1
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x014b;
                case 2: goto L_0x0139;
                case 3: goto L_0x0139;
                case 4: goto L_0x012b;
                case 5: goto L_0x0119;
                case 6: goto L_0x0108;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00db;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00ad;
                case 11: goto L_0x012b;
                case 12: goto L_0x009e;
                case 13: goto L_0x0108;
                case 14: goto L_0x0119;
                case 15: goto L_0x008b;
                case 16: goto L_0x0070;
                default: goto L_0x0065;
            }
        L_0x0065:
            r19 = r4
            r25 = r7
            r15 = r8
            r18 = r9
        L_0x006c:
            r27 = -1
            goto L_0x0215
        L_0x0070:
            if (r6 != 0) goto L_0x0065
            int r6 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r8, r11)
            r20 = r1
            long r0 = r11.zzfle
            long r22 = com.google.android.gms.internal.ads.zzbqf.zzax(r0)
            r0 = r9
            r2 = r20
            r1 = r29
            r10 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0149
        L_0x008b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r8, r11)
            int r1 = r11.zzfld
            int r1 = com.google.android.gms.internal.ads.zzbqf.zzeu(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x009e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r8, r11)
            int r1 = r11.zzfld
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x00ad:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.zzbpq.zze(r12, r8, r11)
            java.lang.Object r1 = r11.zzflf
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00ba:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            com.google.android.gms.internal.ads.zzbtc r0 = r15.zzfq(r4)
            int r0 = zza((com.google.android.gms.internal.ads.zzbtc) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.ads.zzbpr) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r1 = r11.zzflf
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00d1:
            java.lang.Object r5 = r11.zzflf
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzbrf.zzb(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00db:
            r2 = r1
            if (r6 != r10) goto L_0x0065
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00e8
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzc(r12, r8, r11)
            goto L_0x00ec
        L_0x00e8:
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzd(r12, r8, r11)
        L_0x00ec:
            java.lang.Object r1 = r11.zzflf
            r9.putObject(r14, r2, r1)
            goto L_0x0115
        L_0x00f2:
            r2 = r1
            if (r6 != 0) goto L_0x0065
            int r1 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r8, r11)
            long r5 = r11.zzfle
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x0115
        L_0x0108:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x0065
            int r0 = com.google.android.gms.internal.ads.zzbpq.zzg(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0115:
            r2 = r4
            r1 = r7
            goto L_0x0169
        L_0x0119:
            r2 = r1
            if (r6 != r0) goto L_0x0065
            long r5 = com.google.android.gms.internal.ads.zzbpq.zzh(r12, r8)
            r0 = r9
            r1 = r29
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0167
        L_0x012b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r0 = com.google.android.gms.internal.ads.zzbpq.zza(r12, r8, r11)
            int r1 = r11.zzfld
            r9.putInt(r14, r2, r1)
            goto L_0x0167
        L_0x0139:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016c
            int r6 = com.google.android.gms.internal.ads.zzbpq.zzb(r12, r8, r11)
            long r4 = r11.zzfle
            r0 = r9
            r1 = r29
            r0.putLong(r1, r2, r4)
        L_0x0149:
            r0 = r6
            goto L_0x0167
        L_0x014b:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x016c
            float r0 = com.google.android.gms.internal.ads.zzbpq.zzj(r12, r8)
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x0167
        L_0x015a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x016c
            double r0 = com.google.android.gms.internal.ads.zzbpq.zzi(r12, r8)
            com.google.android.gms.internal.ads.zzbua.zza((java.lang.Object) r14, (long) r2, (double) r0)
            int r0 = r8 + 8
        L_0x0167:
            r1 = r7
            r2 = r10
        L_0x0169:
            r10 = -1
            goto L_0x0017
        L_0x016c:
            r25 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x006c
        L_0x0175:
            r0 = 27
            if (r3 != r0) goto L_0x01b1
            if (r6 != r10) goto L_0x0065
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.ads.zzbrk r0 = (com.google.android.gms.internal.ads.zzbrk) r0
            boolean r3 = r0.zzaki()
            if (r3 != 0) goto L_0x0199
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0190
            r3 = 10
            goto L_0x0192
        L_0x0190:
            int r3 = r3 << 1
        L_0x0192:
            com.google.android.gms.internal.ads.zzbrk r0 = r0.zzel(r3)
            r9.putObject(r14, r1, r0)
        L_0x0199:
            r5 = r0
            com.google.android.gms.internal.ads.zzbtc r0 = r15.zzfq(r4)
            r1 = r17
            r2 = r30
            r3 = r8
            r19 = r4
            r4 = r32
            r6 = r33
            int r0 = zza((com.google.android.gms.internal.ads.zzbtc<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.zzbrk<?>) r5, (com.google.android.gms.internal.ads.zzbpr) r6)
            r1 = r7
            r2 = r19
            goto L_0x0169
        L_0x01b1:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e8
            long r4 = (long) r5
            r0 = r28
            r20 = r1
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r32
            r5 = r17
            r24 = r6
            r6 = r7
            r25 = r7
            r7 = r24
            r15 = r8
            r8 = r19
            r18 = r9
            r26 = r10
            r27 = -1
            r9 = r22
            r11 = r26
            r12 = r20
            r14 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.zzbpr) r14)
            if (r0 != r15) goto L_0x0242
        L_0x01e6:
            r2 = r0
            goto L_0x0234
        L_0x01e8:
            r20 = r1
            r26 = r3
            r24 = r6
            r25 = r7
            r15 = r8
            r18 = r9
            r27 = -1
            r0 = 50
            r9 = r26
            if (r9 != r0) goto L_0x0217
            r7 = r24
            if (r7 != r10) goto L_0x0215
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r20
            r8 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.zzbpr) r8)
            if (r0 != r15) goto L_0x0242
            goto L_0x01e6
        L_0x0215:
            r2 = r15
            goto L_0x0234
        L_0x0217:
            r7 = r24
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r8 = r5
            r5 = r17
            r6 = r25
            r10 = r20
            r12 = r19
            r13 = r33
            int r0 = r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.zzbpr) r13)
            if (r0 != r15) goto L_0x0242
            goto L_0x01e6
        L_0x0234:
            r0 = r17
            r1 = r30
            r3 = r32
            r4 = r29
            r5 = r33
            int r0 = zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.zzbpr) r5)
        L_0x0242:
            r14 = r29
            r12 = r30
            r11 = r33
            r9 = r18
            r2 = r19
            r1 = r25
            r10 = -1
            r13 = r32
            r15 = r28
            goto L_0x0017
        L_0x0255:
            r4 = r13
            if (r0 != r4) goto L_0x0259
            return
        L_0x0259:
            com.google.android.gms.internal.ads.zzbrl r0 = com.google.android.gms.internal.ads.zzbrl.zzanj()
            throw r0
        L_0x025e:
            r4 = r13
            r5 = 0
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r33
            r0.zza(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzbpr) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzbpr):void");
    }

    public final void zzs(T t) {
        for (int i = this.zzfss; i < this.zzfst; i++) {
            long zzft = (long) (zzft(this.zzfsr[i]) & 1048575);
            Object zzp = zzbua.zzp(t, zzft);
            if (zzp != null) {
                zzbua.zza((Object) t, zzft, this.zzfsy.zzz(zzp));
            }
        }
        int length = this.zzfsr.length;
        for (int i2 = this.zzfst; i2 < length; i2++) {
            this.zzfsv.zzb(t, (long) this.zzfsr[i2]);
        }
        this.zzfsw.zzs(t);
        if (this.zzfsn) {
            this.zzfsx.zzs(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzbtu<UT, UB> zzbtu) {
        zzbri zzfs;
        int i2 = this.zzfsi[i];
        Object zzp = zzbua.zzp(obj, (long) (zzft(i) & 1048575));
        if (zzp == null || (zzfs = zzfs(i)) == null) {
            return ub;
        }
        return zza(i, i2, this.zzfsy.zzw(zzp), zzfs, ub, zzbtu);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzbri zzbri, UB ub, zzbtu<UT, UB> zzbtu) {
        zzbse<?, ?> zzab = this.zzfsy.zzab(zzfr(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzbri.zzcb(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzbtu.zzaoy();
                }
                zzbqb zzen = zzbpu.zzen(zzbsd.zza(zzab, next.getKey(), next.getValue()));
                try {
                    zzbsd.zza(zzen.zzakt(), zzab, next.getKey(), next.getValue());
                    zzbtu.zza(ub, i2, zzen.zzaks());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0104, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzae(T r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = -1
            r1 = 0
            r2 = -1
            r3 = 0
        L_0x0005:
            int r4 = r13.zzfss
            r5 = 1
            if (r1 >= r4) goto L_0x0108
            int[] r4 = r13.zzfsr
            r4 = r4[r1]
            int[] r6 = r13.zzfsi
            r6 = r6[r4]
            int r7 = r13.zzft(r4)
            boolean r8 = r13.zzfsp
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x0035
            int[] r8 = r13.zzfsi
            int r10 = r4 + 2
            r8 = r8[r10]
            r10 = r8 & r9
            int r8 = r8 >>> 20
            int r8 = r5 << r8
            if (r10 == r2) goto L_0x0036
            sun.misc.Unsafe r2 = zzfsh
            long r11 = (long) r10
            int r2 = r2.getInt(r14, r11)
            r3 = r2
            r2 = r10
            goto L_0x0036
        L_0x0035:
            r8 = 0
        L_0x0036:
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r10 & r7
            if (r10 == 0) goto L_0x003d
            r10 = 1
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            if (r10 == 0) goto L_0x0047
            boolean r10 = r13.zza(r14, (int) r4, (int) r3, (int) r8)
            if (r10 != 0) goto L_0x0047
            return r0
        L_0x0047:
            r10 = 267386880(0xff00000, float:2.3665827E-29)
            r10 = r10 & r7
            int r10 = r10 >>> 20
            r11 = 9
            if (r10 == r11) goto L_0x00f3
            r11 = 17
            if (r10 == r11) goto L_0x00f3
            r8 = 27
            if (r10 == r8) goto L_0x00c7
            r8 = 60
            if (r10 == r8) goto L_0x00b6
            r8 = 68
            if (r10 == r8) goto L_0x00b6
            switch(r10) {
                case 49: goto L_0x00c7;
                case 50: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0104
        L_0x0065:
            com.google.android.gms.internal.ads.zzbsg r6 = r13.zzfsy
            r7 = r7 & r9
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r7)
            java.util.Map r6 = r6.zzx(r7)
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.lang.Object r4 = r13.zzfr(r4)
            com.google.android.gms.internal.ads.zzbsg r7 = r13.zzfsy
            com.google.android.gms.internal.ads.zzbse r4 = r7.zzab(r4)
            com.google.android.gms.internal.ads.zzbuj r4 = r4.zzfsb
            com.google.android.gms.internal.ads.zzbuo r4 = r4.zzapj()
            com.google.android.gms.internal.ads.zzbuo r7 = com.google.android.gms.internal.ads.zzbuo.MESSAGE
            if (r4 != r7) goto L_0x00b3
            r4 = 0
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            if (r4 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzbsy r4 = com.google.android.gms.internal.ads.zzbsy.zzaog()
            java.lang.Class r8 = r7.getClass()
            com.google.android.gms.internal.ads.zzbtc r4 = r4.zzf(r8)
        L_0x00ac:
            boolean r7 = r4.zzae(r7)
            if (r7 != 0) goto L_0x0094
            r5 = 0
        L_0x00b3:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00b6:
            boolean r5 = r13.zza(r14, (int) r6, (int) r4)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.zzbtc r4 = r13.zzfq(r4)
            boolean r4 = zza((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.ads.zzbtc) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x00c7:
            r6 = r7 & r9
            long r6 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzbua.zzp(r14, r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00f0
            com.google.android.gms.internal.ads.zzbtc r4 = r13.zzfq(r4)
            r7 = 0
        L_0x00db:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x00f0
            java.lang.Object r8 = r6.get(r7)
            boolean r8 = r4.zzae(r8)
            if (r8 != 0) goto L_0x00ed
            r5 = 0
            goto L_0x00f0
        L_0x00ed:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x00f0:
            if (r5 != 0) goto L_0x0104
            return r0
        L_0x00f3:
            boolean r5 = r13.zza(r14, (int) r4, (int) r3, (int) r8)
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.zzbtc r4 = r13.zzfq(r4)
            boolean r4 = zza((java.lang.Object) r14, (int) r7, (com.google.android.gms.internal.ads.zzbtc) r4)
            if (r4 != 0) goto L_0x0104
            return r0
        L_0x0104:
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0108:
            boolean r1 = r13.zzfsn
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.zzbqr<?> r1 = r13.zzfsx
            com.google.android.gms.internal.ads.zzbqu r14 = r1.zzq(r14)
            boolean r14 = r14.isInitialized()
            if (r14 != 0) goto L_0x0119
            return r0
        L_0x0119:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsp.zzae(java.lang.Object):boolean");
    }

    private static boolean zza(Object obj, int i, zzbtc zzbtc) {
        return zzbtc.zzae(zzbua.zzp(obj, (long) (i & 1048575)));
    }

    private static void zza(int i, Object obj, zzbup zzbup) throws IOException {
        if (obj instanceof String) {
            zzbup.zzf(i, (String) obj);
        } else {
            zzbup.zza(i, (zzbpu) obj);
        }
    }

    private final void zza(Object obj, int i, zzbtb zzbtb) throws IOException {
        if (zzfv(i)) {
            zzbua.zza(obj, (long) (i & 1048575), (Object) zzbtb.zzalb());
        } else if (this.zzfso) {
            zzbua.zza(obj, (long) (i & 1048575), (Object) zzbtb.readString());
        } else {
            zzbua.zza(obj, (long) (i & 1048575), (Object) zzbtb.zzalc());
        }
    }

    private final int zzft(int i) {
        return this.zzfsi[i + 1];
    }

    private final int zzfu(int i) {
        return this.zzfsi[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzbua.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzbua.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzbua.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzbua.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzbua.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzd(t, i) == zzd(t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzfsp) {
            return zzd(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zzd(T t, int i) {
        if (this.zzfsp) {
            int zzft = zzft(i);
            long j = (long) (zzft & 1048575);
            switch ((zzft & 267386880) >>> 20) {
                case 0:
                    return zzbua.zzo(t, j) != 0.0d;
                case 1:
                    return zzbua.zzn(t, j) != 0.0f;
                case 2:
                    return zzbua.zzl(t, j) != 0;
                case 3:
                    return zzbua.zzl(t, j) != 0;
                case 4:
                    return zzbua.zzk(t, j) != 0;
                case 5:
                    return zzbua.zzl(t, j) != 0;
                case 6:
                    return zzbua.zzk(t, j) != 0;
                case 7:
                    return zzbua.zzm(t, j);
                case 8:
                    Object zzp = zzbua.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzbpu) {
                        return !zzbpu.zzfli.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzbua.zzp(t, j) != null;
                case 10:
                    return !zzbpu.zzfli.equals(zzbua.zzp(t, j));
                case 11:
                    return zzbua.zzk(t, j) != 0;
                case 12:
                    return zzbua.zzk(t, j) != 0;
                case 13:
                    return zzbua.zzk(t, j) != 0;
                case 14:
                    return zzbua.zzl(t, j) != 0;
                case 15:
                    return zzbua.zzk(t, j) != 0;
                case 16:
                    return zzbua.zzl(t, j) != 0;
                case 17:
                    return zzbua.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzfu = zzfu(i);
            return (zzbua.zzk(t, (long) (zzfu & 1048575)) & (1 << (zzfu >>> 20))) != 0;
        }
    }

    private final void zze(T t, int i) {
        if (!this.zzfsp) {
            int zzfu = zzfu(i);
            long j = (long) (zzfu & 1048575);
            zzbua.zzb((Object) t, j, zzbua.zzk(t, j) | (1 << (zzfu >>> 20)));
        }
    }

    private final boolean zza(T t, int i, int i2) {
        return zzbua.zzk(t, (long) (zzfu(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzbua.zzb((Object) t, (long) (zzfu(i2) & 1048575), i);
    }

    private final int zzfw(int i) {
        if (i < this.zzfsk || i > this.zzfsl) {
            return -1;
        }
        return zzaj(i, 0);
    }

    private final int zzai(int i, int i2) {
        if (i < this.zzfsk || i > this.zzfsl) {
            return -1;
        }
        return zzaj(i, i2);
    }

    private final int zzaj(int i, int i2) {
        int length = (this.zzfsi.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzfsi[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
