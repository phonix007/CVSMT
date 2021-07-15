package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

final class zzms implements zzlm, zzlx<zzmj<zzmq>> {

    /* renamed from: id */
    final int f50id;
    private final int zzawn;
    private final zzot zzawq;
    private zzln zzawz;
    private final zzkt zzbah;
    private final zzmr zzbax;
    private final long zzbay;
    private final zzpk zzbaz;
    private final zzmt[] zzbba;
    private zzmj<zzmq>[] zzbbb = new zzmj[0];
    private zzla zzbbc = new zzla(this.zzbbb);
    private zznj zzbbd;
    private List<zzni> zzbbe;
    private final zzma zzxk;
    private int zzyr;

    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzms(int r22, com.google.android.gms.internal.ads.zznj r23, int r24, com.google.android.gms.internal.ads.zzmr r25, int r26, com.google.android.gms.internal.ads.zzkt r27, long r28, com.google.android.gms.internal.ads.zzpk r30, com.google.android.gms.internal.ads.zzot r31) {
        /*
            r21 = this;
            r0 = r21
            r21.<init>()
            r1 = r22
            r0.f50id = r1
            r1 = r23
            r0.zzbbd = r1
            r2 = r24
            r0.zzyr = r2
            r3 = r25
            r0.zzbax = r3
            r3 = r26
            r0.zzawn = r3
            r3 = r27
            r0.zzbah = r3
            r3 = r28
            r0.zzbay = r3
            r3 = r30
            r0.zzbaz = r3
            r3 = r31
            r0.zzawq = r3
            r3 = 0
            com.google.android.gms.internal.ads.zzmj[] r4 = new com.google.android.gms.internal.ads.zzmj[r3]
            r0.zzbbb = r4
            com.google.android.gms.internal.ads.zzla r4 = new com.google.android.gms.internal.ads.zzla
            com.google.android.gms.internal.ads.zzmj<com.google.android.gms.internal.ads.zzmq>[] r5 = r0.zzbbb
            r4.<init>(r5)
            r0.zzbbc = r4
            com.google.android.gms.internal.ads.zznn r1 = r23.zzba(r24)
            java.util.List<com.google.android.gms.internal.ads.zzni> r1 = r1.zzbbe
            r0.zzbbe = r1
            java.util.List<com.google.android.gms.internal.ads.zzni> r1 = r0.zzbbe
            int r2 = r1.size()
            android.util.SparseIntArray r4 = new android.util.SparseIntArray
            r4.<init>(r2)
            r5 = 0
        L_0x004b:
            if (r5 >= r2) goto L_0x005b
            java.lang.Object r6 = r1.get(r5)
            com.google.android.gms.internal.ads.zzni r6 = (com.google.android.gms.internal.ads.zzni) r6
            int r6 = r6.f51id
            r4.put(r6, r5)
            int r5 = r5 + 1
            goto L_0x004b
        L_0x005b:
            int[][] r5 = new int[r2][]
            boolean[] r6 = new boolean[r2]
            r7 = 0
            r8 = 0
        L_0x0061:
            r10 = 1
            if (r7 >= r2) goto L_0x00c6
            boolean r11 = r6[r7]
            if (r11 != 0) goto L_0x00c3
            r6[r7] = r10
            java.lang.Object r11 = r1.get(r7)
            com.google.android.gms.internal.ads.zzni r11 = (com.google.android.gms.internal.ads.zzni) r11
            java.util.List<com.google.android.gms.internal.ads.zznm> r11 = r11.zzbcp
            r12 = 0
        L_0x0073:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x008e
            java.lang.Object r13 = r11.get(r12)
            com.google.android.gms.internal.ads.zznm r13 = (com.google.android.gms.internal.ads.zznm) r13
            java.lang.String r14 = "urn:mpeg:dash:adaptation-set-switching:2016"
            java.lang.String r15 = r13.zzbdi
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x008b
            r9 = r13
            goto L_0x008f
        L_0x008b:
            int r12 = r12 + 1
            goto L_0x0073
        L_0x008e:
            r9 = 0
        L_0x008f:
            if (r9 != 0) goto L_0x009b
            int r9 = r8 + 1
            int[] r10 = new int[r10]
            r10[r3] = r7
            r5[r8] = r10
        L_0x0099:
            r8 = r9
            goto L_0x00c3
        L_0x009b:
            java.lang.String r9 = r9.value
            java.lang.String r11 = ","
            java.lang.String[] r9 = r9.split(r11)
            int r11 = r9.length
            int r11 = r11 + r10
            int[] r11 = new int[r11]
            r11[r3] = r7
            r12 = 0
        L_0x00aa:
            int r13 = r9.length
            if (r12 >= r13) goto L_0x00be
            r13 = r9[r12]
            int r13 = java.lang.Integer.parseInt(r13)
            int r13 = r4.get(r13)
            r6[r13] = r10
            int r12 = r12 + 1
            r11[r12] = r13
            goto L_0x00aa
        L_0x00be:
            int r9 = r8 + 1
            r5[r8] = r11
            goto L_0x0099
        L_0x00c3:
            int r7 = r7 + 1
            goto L_0x0061
        L_0x00c6:
            if (r8 >= r2) goto L_0x00cf
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r8)
            r5 = r2
            int[][] r5 = (int[][]) r5
        L_0x00cf:
            int r2 = r5.length
            boolean[] r4 = new boolean[r2]
            boolean[] r6 = new boolean[r2]
            r8 = r2
            r7 = 0
        L_0x00d6:
            if (r7 >= r2) goto L_0x0148
            r11 = r5[r7]
            int r12 = r11.length
            r13 = 0
        L_0x00dc:
            if (r13 >= r12) goto L_0x0105
            r14 = r11[r13]
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.zzni r14 = (com.google.android.gms.internal.ads.zzni) r14
            java.util.List<com.google.android.gms.internal.ads.zznp> r14 = r14.zzbcn
            r15 = 0
        L_0x00e9:
            int r9 = r14.size()
            if (r15 >= r9) goto L_0x0102
            java.lang.Object r9 = r14.get(r15)
            com.google.android.gms.internal.ads.zznp r9 = (com.google.android.gms.internal.ads.zznp) r9
            java.util.List<com.google.android.gms.internal.ads.zznm> r9 = r9.zzbdo
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00ff
            r9 = 1
            goto L_0x0106
        L_0x00ff:
            int r15 = r15 + 1
            goto L_0x00e9
        L_0x0102:
            int r13 = r13 + 1
            goto L_0x00dc
        L_0x0105:
            r9 = 0
        L_0x0106:
            if (r9 == 0) goto L_0x010c
            r4[r7] = r10
            int r8 = r8 + 1
        L_0x010c:
            r9 = r5[r7]
            int r11 = r9.length
            r12 = 0
        L_0x0110:
            if (r12 >= r11) goto L_0x013d
            r13 = r9[r12]
            java.lang.Object r13 = r1.get(r13)
            com.google.android.gms.internal.ads.zzni r13 = (com.google.android.gms.internal.ads.zzni) r13
            java.util.List<com.google.android.gms.internal.ads.zznm> r13 = r13.zzbco
            r14 = 0
        L_0x011d:
            int r15 = r13.size()
            if (r14 >= r15) goto L_0x0139
            java.lang.Object r15 = r13.get(r14)
            com.google.android.gms.internal.ads.zznm r15 = (com.google.android.gms.internal.ads.zznm) r15
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r15 = r15.zzbdi
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0135
            r3 = 1
            goto L_0x013e
        L_0x0135:
            int r14 = r14 + 1
            r3 = 0
            goto L_0x011d
        L_0x0139:
            int r12 = r12 + 1
            r3 = 0
            goto L_0x0110
        L_0x013d:
            r3 = 0
        L_0x013e:
            if (r3 == 0) goto L_0x0144
            r6[r7] = r10
            int r8 = r8 + 1
        L_0x0144:
            int r7 = r7 + 1
            r3 = 0
            goto L_0x00d6
        L_0x0148:
            com.google.android.gms.internal.ads.zzlz[] r3 = new com.google.android.gms.internal.ads.zzlz[r8]
            com.google.android.gms.internal.ads.zzmt[] r7 = new com.google.android.gms.internal.ads.zzmt[r8]
            r8 = 0
            r9 = 0
        L_0x014e:
            if (r8 >= r2) goto L_0x026b
            r11 = r5[r8]
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r11.length
            r14 = 0
        L_0x0159:
            if (r14 >= r13) goto L_0x016b
            r15 = r11[r14]
            java.lang.Object r15 = r1.get(r15)
            com.google.android.gms.internal.ads.zzni r15 = (com.google.android.gms.internal.ads.zzni) r15
            java.util.List<com.google.android.gms.internal.ads.zznp> r15 = r15.zzbcn
            r12.addAll(r15)
            int r14 = r14 + 1
            goto L_0x0159
        L_0x016b:
            int r13 = r12.size()
            com.google.android.gms.internal.ads.zzfs[] r13 = new com.google.android.gms.internal.ads.zzfs[r13]
            r14 = 0
        L_0x0172:
            int r15 = r13.length
            if (r14 >= r15) goto L_0x0182
            java.lang.Object r15 = r12.get(r14)
            com.google.android.gms.internal.ads.zznp r15 = (com.google.android.gms.internal.ads.zznp) r15
            com.google.android.gms.internal.ads.zzfs r15 = r15.zzaad
            r13[r14] = r15
            int r14 = r14 + 1
            goto L_0x0172
        L_0x0182:
            r14 = 0
            r12 = r11[r14]
            java.lang.Object r12 = r1.get(r12)
            com.google.android.gms.internal.ads.zzni r12 = (com.google.android.gms.internal.ads.zzni) r12
            boolean r14 = r4[r8]
            boolean r15 = r6[r8]
            com.google.android.gms.internal.ads.zzlz r10 = new com.google.android.gms.internal.ads.zzlz
            r10.<init>(r13)
            r3[r9] = r10
            int r10 = r9 + 1
            com.google.android.gms.internal.ads.zzmt r13 = new com.google.android.gms.internal.ads.zzmt
            r18 = r1
            int r1 = r12.type
            r19 = 1
            r22 = r13
            r23 = r1
            r24 = r11
            r25 = r9
            r26 = r19
            r27 = r14
            r28 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r9] = r13
            if (r14 == 0) goto L_0x0200
            int r1 = r12.f51id
            r13 = 16
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            r14.append(r1)
            java.lang.String r1 = ":emsg"
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            java.lang.String r13 = "application/x-emsg"
            r14 = -1
            r20 = r2
            r2 = 0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza(r1, r13, r2, r14, r2)
            com.google.android.gms.internal.ads.zzlz r13 = new com.google.android.gms.internal.ads.zzlz
            r14 = 1
            com.google.android.gms.internal.ads.zzfs[] r2 = new com.google.android.gms.internal.ads.zzfs[r14]
            r14 = 0
            r2[r14] = r1
            r13.<init>(r2)
            r3[r10] = r13
            int r1 = r10 + 1
            com.google.android.gms.internal.ads.zzmt r2 = new com.google.android.gms.internal.ads.zzmt
            r13 = 4
            r14 = 0
            r16 = 0
            r19 = 0
            r22 = r2
            r23 = r13
            r24 = r11
            r25 = r9
            r26 = r14
            r27 = r16
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r10] = r2
            r10 = r1
            goto L_0x0202
        L_0x0200:
            r20 = r2
        L_0x0202:
            if (r15 == 0) goto L_0x025f
            int r1 = r12.f51id
            r2 = 18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            r12.append(r1)
            java.lang.String r1 = ":cea608"
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            java.lang.String r2 = "application/cea-608"
            r12 = 0
            r13 = -1
            r14 = 0
            r15 = 0
            r16 = 0
            r22 = r1
            r23 = r2
            r24 = r12
            r25 = r13
            r26 = r14
            r27 = r15
            r28 = r16
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza((java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (int) r25, (int) r26, (java.lang.String) r27, (com.google.android.gms.internal.ads.zzhp) r28)
            com.google.android.gms.internal.ads.zzlz r2 = new com.google.android.gms.internal.ads.zzlz
            r12 = 1
            com.google.android.gms.internal.ads.zzfs[] r13 = new com.google.android.gms.internal.ads.zzfs[r12]
            r14 = 0
            r13[r14] = r1
            r2.<init>(r13)
            r3[r10] = r2
            int r1 = r10 + 1
            com.google.android.gms.internal.ads.zzmt r2 = new com.google.android.gms.internal.ads.zzmt
            r13 = 3
            r15 = 0
            r16 = 0
            r17 = 0
            r22 = r2
            r23 = r13
            r24 = r11
            r25 = r9
            r26 = r15
            r27 = r16
            r28 = r17
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7[r10] = r2
            r9 = r1
            goto L_0x0262
        L_0x025f:
            r12 = 1
            r14 = 0
            r9 = r10
        L_0x0262:
            int r8 = r8 + 1
            r1 = r18
            r2 = r20
            r10 = 1
            goto L_0x014e
        L_0x026b:
            com.google.android.gms.internal.ads.zzma r1 = new com.google.android.gms.internal.ads.zzma
            r1.<init>(r3)
            android.util.Pair r1 = android.util.Pair.create(r1, r7)
            java.lang.Object r2 = r1.first
            com.google.android.gms.internal.ads.zzma r2 = (com.google.android.gms.internal.ads.zzma) r2
            r0.zzxk = r2
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzmt[] r1 = (com.google.android.gms.internal.ads.zzmt[]) r1
            r0.zzbba = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzms.<init>(int, com.google.android.gms.internal.ads.zznj, int, com.google.android.gms.internal.ads.zzmr, int, com.google.android.gms.internal.ads.zzkt, long, com.google.android.gms.internal.ads.zzpk, com.google.android.gms.internal.ads.zzot):void");
    }

    public final long zzey() {
        return -9223372036854775807L;
    }

    public final void zza(zznj zznj, int i) {
        this.zzbbd = zznj;
        this.zzyr = i;
        this.zzbbe = zznj.zzba(i).zzbbe;
        if (this.zzbbb != null) {
            for (zzmj<zzmq> zzfy : this.zzbbb) {
                zzfy.zzfy().zza(zznj, i);
            }
            this.zzawz.zza(this);
        }
    }

    public final void release() {
        for (zzmj<zzmq> release : this.zzbbb) {
            release.release();
        }
    }

    public final void zza(zzln zzln, long j) {
        this.zzawz = zzln;
        zzln.zza(this);
    }

    public final void zzew() throws IOException {
        this.zzbaz.zzev();
    }

    public final zzma zzex() {
        return this.zzxk;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zza(com.google.android.gms.internal.ads.zzom[] r30, boolean[] r31, com.google.android.gms.internal.ads.zzlv[] r32, boolean[] r33, long r34) {
        /*
            r29 = this;
            r10 = r29
            r11 = r30
            r8 = r34
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r14 = 0
            r6 = 0
        L_0x000d:
            int r0 = r11.length
            r1 = 0
            r15 = 1
            if (r6 >= r0) goto L_0x00ca
            r0 = r32[r6]
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.zzmj
            if (r0 == 0) goto L_0x003e
            r0 = r32[r6]
            com.google.android.gms.internal.ads.zzmj r0 = (com.google.android.gms.internal.ads.zzmj) r0
            r2 = r11[r6]
            if (r2 == 0) goto L_0x0039
            boolean r2 = r31[r6]
            if (r2 != 0) goto L_0x0025
            goto L_0x0039
        L_0x0025:
            com.google.android.gms.internal.ads.zzma r1 = r10.zzxk
            r2 = r11[r6]
            com.google.android.gms.internal.ads.zzlz r2 = r2.zzgk()
            int r1 = r1.zza(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.put(r1, r0)
            goto L_0x003e
        L_0x0039:
            r0.release()
            r32[r6] = r1
        L_0x003e:
            r0 = r32[r6]
            if (r0 != 0) goto L_0x00c1
            r0 = r11[r6]
            if (r0 == 0) goto L_0x00c1
            com.google.android.gms.internal.ads.zzma r0 = r10.zzxk
            r1 = r11[r6]
            com.google.android.gms.internal.ads.zzlz r1 = r1.zzgk()
            int r16 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzmt[] r0 = r10.zzbba
            r0 = r0[r16]
            boolean r1 = r0.zzbbg
            if (r1 == 0) goto L_0x00c1
            r22 = r11[r6]
            r1 = 2
            int[] r2 = new int[r1]
            boolean r3 = r0.zzbbi
            if (r3 == 0) goto L_0x0068
            r4 = 4
            r2[r14] = r4
            r4 = 1
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            boolean r5 = r0.zzbbj
            if (r5 == 0) goto L_0x0074
            int r7 = r4 + 1
            r17 = 3
            r2[r4] = r17
            r4 = r7
        L_0x0074:
            if (r4 >= r1) goto L_0x007b
            int[] r1 = java.util.Arrays.copyOf(r2, r4)
            r2 = r1
        L_0x007b:
            com.google.android.gms.internal.ads.zzmr r1 = r10.zzbax
            com.google.android.gms.internal.ads.zzpk r4 = r10.zzbaz
            com.google.android.gms.internal.ads.zznj r7 = r10.zzbbd
            r28 = r6
            int r6 = r10.zzyr
            int[] r8 = r0.zzbbf
            int r9 = r0.zzwg
            long r11 = r10.zzbay
            r17 = r1
            r18 = r4
            r19 = r7
            r20 = r6
            r21 = r8
            r23 = r9
            r24 = r11
            r26 = r3
            r27 = r5
            com.google.android.gms.internal.ads.zzmq r3 = r17.zza(r18, r19, r20, r21, r22, r23, r24, r26, r27)
            com.google.android.gms.internal.ads.zzmj r11 = new com.google.android.gms.internal.ads.zzmj
            int r1 = r0.zzwg
            com.google.android.gms.internal.ads.zzot r5 = r10.zzawq
            int r8 = r10.zzawn
            com.google.android.gms.internal.ads.zzkt r9 = r10.zzbah
            r0 = r11
            r4 = r29
            r12 = r28
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r13.put(r0, r11)
            r32[r12] = r11
            r33[r12] = r15
            goto L_0x00c2
        L_0x00c1:
            r12 = r6
        L_0x00c2:
            int r6 = r12 + 1
            r8 = r34
            r11 = r30
            goto L_0x000d
        L_0x00ca:
            r0 = r30
            r2 = 0
        L_0x00cd:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0145
            r3 = r32[r2]
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzmk
            if (r3 != 0) goto L_0x00dc
            r3 = r32[r2]
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzlb
            if (r3 == 0) goto L_0x00eb
        L_0x00dc:
            r3 = r0[r2]
            if (r3 == 0) goto L_0x00e4
            boolean r4 = r31[r2]
            if (r4 != 0) goto L_0x00eb
        L_0x00e4:
            r4 = r32[r2]
            zza((com.google.android.gms.internal.ads.zzlv) r4)
            r32[r2] = r1
        L_0x00eb:
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0140
            com.google.android.gms.internal.ads.zzma r4 = r10.zzxk
            r5 = r0[r2]
            com.google.android.gms.internal.ads.zzlz r5 = r5.zzgk()
            int r4 = r4.zza(r5)
            com.google.android.gms.internal.ads.zzmt[] r5 = r10.zzbba
            r4 = r5[r4]
            boolean r5 = r4.zzbbg
            if (r5 != 0) goto L_0x0140
            int r5 = r4.zzbbh
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r13.get(r5)
            com.google.android.gms.internal.ads.zzmj r5 = (com.google.android.gms.internal.ads.zzmj) r5
            r6 = r32[r2]
            if (r5 != 0) goto L_0x0116
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzlb
            goto L_0x0124
        L_0x0116:
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzmk
            if (r7 == 0) goto L_0x0123
            r7 = r6
            com.google.android.gms.internal.ads.zzmk r7 = (com.google.android.gms.internal.ads.zzmk) r7
            com.google.android.gms.internal.ads.zzmj<T> r7 = r7.zzbap
            if (r7 != r5) goto L_0x0123
            r7 = 1
            goto L_0x0124
        L_0x0123:
            r7 = 0
        L_0x0124:
            if (r7 != 0) goto L_0x0140
            zza((com.google.android.gms.internal.ads.zzlv) r6)
            if (r5 != 0) goto L_0x0133
            com.google.android.gms.internal.ads.zzlb r4 = new com.google.android.gms.internal.ads.zzlb
            r4.<init>()
            r6 = r34
            goto L_0x013b
        L_0x0133:
            int r4 = r4.zzwg
            r6 = r34
            com.google.android.gms.internal.ads.zzmk r4 = r5.zza(r6, r4)
        L_0x013b:
            r32[r2] = r4
            r33[r2] = r15
            goto L_0x0142
        L_0x0140:
            r6 = r34
        L_0x0142:
            int r2 = r2 + 1
            goto L_0x00cd
        L_0x0145:
            r6 = r34
            int r0 = r13.size()
            com.google.android.gms.internal.ads.zzmj[] r0 = new com.google.android.gms.internal.ads.zzmj[r0]
            r10.zzbbb = r0
            java.util.Collection r0 = r13.values()
            com.google.android.gms.internal.ads.zzmj<com.google.android.gms.internal.ads.zzmq>[] r1 = r10.zzbbb
            r0.toArray(r1)
            com.google.android.gms.internal.ads.zzla r0 = new com.google.android.gms.internal.ads.zzla
            com.google.android.gms.internal.ads.zzmj<com.google.android.gms.internal.ads.zzmq>[] r1 = r10.zzbbb
            r0.<init>(r1)
            r10.zzbbc = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzms.zza(com.google.android.gms.internal.ads.zzom[], boolean[], com.google.android.gms.internal.ads.zzlv[], boolean[], long):long");
    }

    public final void zzaa(long j) {
        for (zzmj<zzmq> zzaf : this.zzbbb) {
            zzaf.zzaf(j);
        }
    }

    public final boolean zzy(long j) {
        return this.zzbbc.zzy(j);
    }

    public final long zzeu() {
        return this.zzbbc.zzeu();
    }

    public final long zzez() {
        long j = Long.MAX_VALUE;
        for (zzmj<zzmq> zzez : this.zzbbb) {
            long zzez2 = zzez.zzez();
            if (zzez2 != Long.MIN_VALUE) {
                j = Math.min(j, zzez2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzab(long j) {
        for (zzmj<zzmq> zzag : this.zzbbb) {
            zzag.zzag(j);
        }
        return j;
    }

    private static void zza(zzlv zzlv) {
        if (zzlv instanceof zzmk) {
            ((zzmk) zzlv).release();
        }
    }

    public final /* synthetic */ void zza(zzlw zzlw) {
        this.zzawz.zza(this);
    }
}
