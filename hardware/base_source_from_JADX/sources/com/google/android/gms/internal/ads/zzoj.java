package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

public abstract class zzoj extends zzop {
    private int zzaak = 0;
    private final SparseArray<Map<zzma, zzol>> zzbfa = new SparseArray<>();
    private final SparseBooleanArray zzbfb = new SparseBooleanArray();
    private zzok zzbfc;

    /* access modifiers changed from: protected */
    public abstract zzom[] zza(zzga[] zzgaArr, zzma[] zzmaArr, int[][][] iArr) throws zzff;

    public final void zzf(int i, boolean z) {
        if (this.zzbfb.get(i) != z) {
            this.zzbfb.put(i, z);
            invalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.google.android.gms.internal.ads.zzol} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzor zza(com.google.android.gms.internal.ads.zzga[] r17, com.google.android.gms.internal.ads.zzma r18) throws com.google.android.gms.internal.ads.zzff {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r1.length
            int r3 = r3 + 1
            int[] r3 = new int[r3]
            int r4 = r1.length
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.zzlz[][] r4 = new com.google.android.gms.internal.ads.zzlz[r4][]
            int r5 = r1.length
            int r5 = r5 + 1
            int[][][] r10 = new int[r5][][]
            r6 = 0
        L_0x0016:
            int r7 = r4.length
            if (r6 >= r7) goto L_0x0028
            int r7 = r2.length
            com.google.android.gms.internal.ads.zzlz[] r7 = new com.google.android.gms.internal.ads.zzlz[r7]
            r4[r6] = r7
            int r7 = r2.length
            int[][] r7 = new int[r7][]
            r10[r6] = r7
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0028:
            int r6 = r1.length
            int[] r9 = new int[r6]
            r6 = 0
        L_0x002c:
            int r7 = r9.length
            if (r6 >= r7) goto L_0x003a
            r7 = r1[r6]
            int r7 = r7.zzbl()
            r9[r6] = r7
            int r6 = r6 + 1
            goto L_0x002c
        L_0x003a:
            r6 = 0
        L_0x003b:
            int r7 = r2.length
            if (r6 >= r7) goto L_0x009e
            com.google.android.gms.internal.ads.zzlz r7 = r2.zzau(r6)
            int r8 = r1.length
            r11 = r8
            r8 = 0
            r12 = 0
        L_0x0047:
            int r13 = r1.length
            if (r8 >= r13) goto L_0x0069
            r13 = r1[r8]
            r14 = r11
            r11 = 0
        L_0x004e:
            int r15 = r7.length
            if (r11 >= r15) goto L_0x0065
            com.google.android.gms.internal.ads.zzfs r15 = r7.zzat(r11)
            int r15 = r13.zzb(r15)
            r5 = 3
            r15 = r15 & r5
            if (r15 <= r12) goto L_0x0062
            if (r15 == r5) goto L_0x006a
            r14 = r8
            r12 = r15
        L_0x0062:
            int r11 = r11 + 1
            goto L_0x004e
        L_0x0065:
            int r8 = r8 + 1
            r11 = r14
            goto L_0x0047
        L_0x0069:
            r8 = r11
        L_0x006a:
            int r5 = r1.length
            if (r8 != r5) goto L_0x0072
            int r5 = r7.length
            int[] r5 = new int[r5]
            goto L_0x008b
        L_0x0072:
            r5 = r1[r8]
            int r11 = r7.length
            int[] r11 = new int[r11]
            r12 = 0
        L_0x0079:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x008a
            com.google.android.gms.internal.ads.zzfs r13 = r7.zzat(r12)
            int r13 = r5.zzb(r13)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0079
        L_0x008a:
            r5 = r11
        L_0x008b:
            r11 = r3[r8]
            r12 = r4[r8]
            r12[r11] = r7
            r7 = r10[r8]
            r7[r11] = r5
            r5 = r3[r8]
            int r5 = r5 + 1
            r3[r8] = r5
            int r6 = r6 + 1
            goto L_0x003b
        L_0x009e:
            int r5 = r1.length
            com.google.android.gms.internal.ads.zzma[] r8 = new com.google.android.gms.internal.ads.zzma[r5]
            int r5 = r1.length
            int[] r7 = new int[r5]
            r5 = 0
        L_0x00a5:
            int r6 = r1.length
            if (r5 >= r6) goto L_0x00ce
            r6 = r3[r5]
            com.google.android.gms.internal.ads.zzma r11 = new com.google.android.gms.internal.ads.zzma
            r12 = r4[r5]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r6)
            com.google.android.gms.internal.ads.zzlz[] r12 = (com.google.android.gms.internal.ads.zzlz[]) r12
            r11.<init>(r12)
            r8[r5] = r11
            r11 = r10[r5]
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r11, r6)
            int[][] r6 = (int[][]) r6
            r10[r5] = r6
            r6 = r1[r5]
            int r6 = r6.getTrackType()
            r7[r5] = r6
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00ce:
            int r5 = r1.length
            r3 = r3[r5]
            com.google.android.gms.internal.ads.zzma r11 = new com.google.android.gms.internal.ads.zzma
            int r5 = r1.length
            r4 = r4[r5]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.google.android.gms.internal.ads.zzlz[] r3 = (com.google.android.gms.internal.ads.zzlz[]) r3
            r11.<init>(r3)
            com.google.android.gms.internal.ads.zzom[] r3 = r0.zza(r1, r8, r10)
            r4 = 0
        L_0x00e4:
            int r5 = r1.length
            r12 = 0
            if (r4 >= r5) goto L_0x0112
            android.util.SparseBooleanArray r5 = r0.zzbfb
            boolean r5 = r5.get(r4)
            if (r5 == 0) goto L_0x00f3
            r3[r4] = r12
            goto L_0x0109
        L_0x00f3:
            r5 = r8[r4]
            android.util.SparseArray<java.util.Map<com.google.android.gms.internal.ads.zzma, com.google.android.gms.internal.ads.zzol>> r6 = r0.zzbfa
            java.lang.Object r6 = r6.get(r4)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x0100
            goto L_0x0107
        L_0x0100:
            java.lang.Object r5 = r6.get(r5)
            r12 = r5
            com.google.android.gms.internal.ads.zzol r12 = (com.google.android.gms.internal.ads.zzol) r12
        L_0x0107:
            if (r12 != 0) goto L_0x010c
        L_0x0109:
            int r4 = r4 + 1
            goto L_0x00e4
        L_0x010c:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        L_0x0112:
            com.google.android.gms.internal.ads.zzok r4 = new com.google.android.gms.internal.ads.zzok
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            int r5 = r1.length
            com.google.android.gms.internal.ads.zzgb[] r5 = new com.google.android.gms.internal.ads.zzgb[r5]
            r6 = 0
        L_0x011c:
            int r7 = r1.length
            if (r6 >= r7) goto L_0x012c
            r7 = r3[r6]
            if (r7 == 0) goto L_0x0126
            com.google.android.gms.internal.ads.zzgb r7 = com.google.android.gms.internal.ads.zzgb.zzaaj
            goto L_0x0127
        L_0x0126:
            r7 = r12
        L_0x0127:
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x011c
        L_0x012c:
            com.google.android.gms.internal.ads.zzor r1 = new com.google.android.gms.internal.ads.zzor
            com.google.android.gms.internal.ads.zzoo r6 = new com.google.android.gms.internal.ads.zzoo
            r6.<init>(r3)
            r1.<init>(r2, r6, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoj.zza(com.google.android.gms.internal.ads.zzga[], com.google.android.gms.internal.ads.zzma):com.google.android.gms.internal.ads.zzor");
    }

    public final void zzd(Object obj) {
        this.zzbfc = (zzok) obj;
    }
}
