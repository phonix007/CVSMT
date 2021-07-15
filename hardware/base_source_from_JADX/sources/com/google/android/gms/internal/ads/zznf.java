package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class zznf implements zzmq {
    private final zzov zzagy;
    private final zzpk zzbaz;
    private zznj zzbbd;
    private final int[] zzbbf;
    private final long zzbbx;
    private final zzom zzbcf;
    private final zznh[] zzbcg;
    private final int zzbch;
    private IOException zzbci;
    private boolean zzbcj;
    private final int zzwg;
    private int zzyr;

    public zznf(zzpk zzpk, zznj zznj, int i, int[] iArr, zzom zzom, int i2, zzov zzov, long j, int i3, boolean z, boolean z2) {
        zzom zzom2 = zzom;
        this.zzbaz = zzpk;
        this.zzbbd = zznj;
        this.zzbbf = iArr;
        this.zzbcf = zzom2;
        this.zzwg = i2;
        this.zzagy = zzov;
        this.zzyr = i;
        this.zzbbx = j;
        this.zzbch = i3;
        long zzbb = zznj.zzbb(i);
        ArrayList<zznp> zzgf = zzgf();
        this.zzbcg = new zznh[zzom.length()];
        for (int i4 = 0; i4 < this.zzbcg.length; i4++) {
            this.zzbcg[i4] = new zznh(zzbb, zzgf.get(zzom2.zzbd(i4)), z, z2);
        }
    }

    public final void zza(zznj zznj, int i) {
        try {
            this.zzbbd = zznj;
            this.zzyr = i;
            long zzbb = this.zzbbd.zzbb(this.zzyr);
            ArrayList<zznp> zzgf = zzgf();
            for (int i2 = 0; i2 < this.zzbcg.length; i2++) {
                this.zzbcg[i2].zza(zzbb, zzgf.get(this.zzbcf.zzbd(i2)));
            }
        } catch (zzkz e) {
            this.zzbci = e;
        }
    }

    public final void zzev() throws IOException {
        if (this.zzbci == null) {
            this.zzbaz.zzev();
            return;
        }
        throw this.zzbci;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.google.android.gms.internal.ads.zzmm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.google.android.gms.internal.ads.zzmm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.google.android.gms.internal.ads.zzmp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.gms.internal.ads.zzmm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzmo r30, long r31, com.google.android.gms.internal.ads.zzmi r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r33
            java.io.IOException r5 = r0.zzbci
            if (r5 == 0) goto L_0x000d
            return
        L_0x000d:
            r5 = 0
            if (r1 == 0) goto L_0x0015
            long r7 = r1.zzazt
            long r7 = r7 - r2
            goto L_0x0016
        L_0x0015:
            r7 = r5
        L_0x0016:
            com.google.android.gms.internal.ads.zzom r9 = r0.zzbcf
            r9.zzak(r7)
            com.google.android.gms.internal.ads.zznh[] r7 = r0.zzbcg
            com.google.android.gms.internal.ads.zzom r8 = r0.zzbcf
            int r8 = r8.zzgm()
            r7 = r7[r8]
            com.google.android.gms.internal.ads.zzmf r8 = r7.zzbat
            if (r8 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zznp r8 = r7.zzbck
            com.google.android.gms.internal.ads.zzmf r9 = r7.zzbat
            com.google.android.gms.internal.ads.zzfs[] r9 = r9.zzfx()
            r10 = 0
            if (r9 != 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzno r9 = r8.zzgh()
            goto L_0x003a
        L_0x0039:
            r9 = r10
        L_0x003a:
            com.google.android.gms.internal.ads.zznd r11 = r7.zzbcl
            if (r11 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzno r10 = r8.zzgi()
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            if (r10 == 0) goto L_0x0090
        L_0x0046:
            com.google.android.gms.internal.ads.zzov r12 = r0.zzagy
            com.google.android.gms.internal.ads.zzom r1 = r0.zzbcf
            com.google.android.gms.internal.ads.zzfs r14 = r1.zzgl()
            com.google.android.gms.internal.ads.zzom r1 = r0.zzbcf
            int r15 = r1.zzgn()
            com.google.android.gms.internal.ads.zzom r1 = r0.zzbcf
            java.lang.Object r16 = r1.zzgo()
            com.google.android.gms.internal.ads.zznp r1 = r7.zzbck
            java.lang.String r1 = r1.zzbde
            if (r9 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzno r2 = r9.zza(r10, r1)
            if (r2 != 0) goto L_0x0069
            r2 = r9
            goto L_0x0069
        L_0x0068:
            r2 = r10
        L_0x0069:
            com.google.android.gms.internal.ads.zzoz r3 = new com.google.android.gms.internal.ads.zzoz
            android.net.Uri r18 = r2.zzy(r1)
            long r5 = r2.zzbdk
            long r1 = r2.zzcc
            com.google.android.gms.internal.ads.zznp r8 = r7.zzbck
            java.lang.String r23 = r8.zzf()
            r17 = r3
            r19 = r5
            r21 = r1
            r17.<init>(r18, r19, r21, r23)
            com.google.android.gms.internal.ads.zzmn r1 = new com.google.android.gms.internal.ads.zzmn
            com.google.android.gms.internal.ads.zzmf r2 = r7.zzbat
            r11 = r1
            r13 = r3
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.zzbaa = r1
            return
        L_0x0090:
            long r8 = r0.zzbbx
            r10 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00a2
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r8 = r0.zzbbx
            long r5 = r5 + r8
            long r5 = r5 * r10
            goto L_0x00a8
        L_0x00a2:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 * r10
        L_0x00a8:
            int r8 = r7.zzgg()
            r9 = 0
            r12 = 1
            if (r8 != 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zznj r1 = r0.zzbbd
            boolean r1 = r1.zzbcs
            if (r1 == 0) goto L_0x00c3
            int r1 = r0.zzyr
            com.google.android.gms.internal.ads.zznj r2 = r0.zzbbd
            int r2 = r2.zzcl()
            int r2 = r2 - r12
            if (r1 >= r2) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r12 = 0
        L_0x00c3:
            r4.zzbab = r12
            return
        L_0x00c6:
            int r13 = r7.zzgd()
            r14 = -1
            if (r8 != r14) goto L_0x0105
            com.google.android.gms.internal.ads.zznj r8 = r0.zzbbd
            long r14 = r8.zzbcq
            long r14 = r14 * r10
            long r5 = r5 - r14
            com.google.android.gms.internal.ads.zznj r8 = r0.zzbbd
            int r14 = r0.zzyr
            com.google.android.gms.internal.ads.zznn r8 = r8.zzba(r14)
            long r14 = r8.zzbdj
            long r14 = r14 * r10
            long r5 = r5 - r14
            com.google.android.gms.internal.ads.zznj r8 = r0.zzbbd
            long r14 = r8.zzbcu
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r8 == 0) goto L_0x00ff
            com.google.android.gms.internal.ads.zznj r8 = r0.zzbbd
            long r14 = r8.zzbcu
            long r14 = r14 * r10
            long r10 = r5 - r14
            int r8 = r7.zzaj(r10)
            int r8 = java.lang.Math.max(r13, r8)
            r13 = r8
        L_0x00ff:
            int r5 = r7.zzaj(r5)
            int r5 = r5 - r12
            goto L_0x0108
        L_0x0105:
            int r8 = r8 + r13
            int r5 = r8 + -1
        L_0x0108:
            if (r1 != 0) goto L_0x0114
            int r1 = r7.zzaj(r2)
            int r1 = com.google.android.gms.internal.ads.zzqe.zzd(r1, r13, r5)
        L_0x0112:
            r15 = r1
            goto L_0x0122
        L_0x0114:
            int r1 = r30.zzfz()
            if (r1 >= r13) goto L_0x0112
            com.google.android.gms.internal.ads.zzkz r1 = new com.google.android.gms.internal.ads.zzkz
            r1.<init>()
            r0.zzbci = r1
            return
        L_0x0122:
            if (r15 > r5) goto L_0x01db
            boolean r1 = r0.zzbcj
            if (r1 == 0) goto L_0x012c
            if (r15 < r5) goto L_0x012c
            goto L_0x01dd
        L_0x012c:
            int r1 = r0.zzbch
            int r5 = r5 - r15
            int r5 = r5 + r12
            int r1 = java.lang.Math.min(r1, r5)
            com.google.android.gms.internal.ads.zzov r6 = r0.zzagy
            int r2 = r0.zzwg
            com.google.android.gms.internal.ads.zzom r3 = r0.zzbcf
            com.google.android.gms.internal.ads.zzfs r3 = r3.zzgl()
            com.google.android.gms.internal.ads.zzom r5 = r0.zzbcf
            int r9 = r5.zzgn()
            com.google.android.gms.internal.ads.zzom r5 = r0.zzbcf
            java.lang.Object r10 = r5.zzgo()
            com.google.android.gms.internal.ads.zznp r5 = r7.zzbck
            long r13 = r7.zzay(r15)
            com.google.android.gms.internal.ads.zzno r8 = r7.zzax(r15)
            java.lang.String r11 = r5.zzbde
            com.google.android.gms.internal.ads.zzmf r12 = r7.zzbat
            if (r12 != 0) goto L_0x0188
            long r16 = r7.zzaz(r15)
            com.google.android.gms.internal.ads.zzoz r1 = new com.google.android.gms.internal.ads.zzoz
            android.net.Uri r19 = r8.zzy(r11)
            long r11 = r8.zzbdk
            long r7 = r8.zzcc
            java.lang.String r24 = r5.zzf()
            r18 = r1
            r20 = r11
            r22 = r7
            r18.<init>(r19, r20, r22, r24)
            com.google.android.gms.internal.ads.zzmp r18 = new com.google.android.gms.internal.ads.zzmp
            r5 = r18
            r7 = r1
            r8 = r3
            r11 = r13
            r13 = r16
            r16 = r2
            r17 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r16, r17)
            r2 = r18
            goto L_0x01d8
        L_0x0188:
            r2 = 1
            r16 = 1
        L_0x018b:
            if (r2 >= r1) goto L_0x019f
            int r12 = r15 + r2
            com.google.android.gms.internal.ads.zzno r12 = r7.zzax(r12)
            com.google.android.gms.internal.ads.zzno r12 = r8.zza(r12, r11)
            if (r12 == 0) goto L_0x019f
            int r16 = r16 + 1
            int r2 = r2 + 1
            r8 = r12
            goto L_0x018b
        L_0x019f:
            int r1 = r15 + r16
            r2 = 1
            int r1 = r1 - r2
            long r1 = r7.zzaz(r1)
            com.google.android.gms.internal.ads.zzoz r12 = new com.google.android.gms.internal.ads.zzoz
            android.net.Uri r18 = r8.zzy(r11)
            r25 = r1
            long r0 = r8.zzbdk
            r27 = r13
            long r13 = r8.zzcc
            java.lang.String r23 = r5.zzf()
            r17 = r12
            r19 = r0
            r21 = r13
            r17.<init>(r18, r19, r21, r23)
            long r0 = r5.zzbdn
            long r0 = -r0
            com.google.android.gms.internal.ads.zzmm r2 = new com.google.android.gms.internal.ads.zzmm
            com.google.android.gms.internal.ads.zzmf r13 = r7.zzbat
            r5 = r2
            r7 = r12
            r8 = r3
            r11 = r27
            r3 = r13
            r13 = r25
            r17 = r0
            r19 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r19)
        L_0x01d8:
            r4.zzbaa = r2
            return
        L_0x01db:
            r0 = r29
        L_0x01dd:
            com.google.android.gms.internal.ads.zznj r1 = r0.zzbbd
            boolean r1 = r1.zzbcs
            if (r1 == 0) goto L_0x01f2
            int r1 = r0.zzyr
            com.google.android.gms.internal.ads.zznj r2 = r0.zzbbd
            int r2 = r2.zzcl()
            r3 = 1
            int r2 = r2 - r3
            if (r1 >= r2) goto L_0x01f0
            goto L_0x01f3
        L_0x01f0:
            r3 = 0
            goto L_0x01f3
        L_0x01f2:
            r3 = 1
        L_0x01f3:
            r4.zzbab = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznf.zza(com.google.android.gms.internal.ads.zzmo, long, com.google.android.gms.internal.ads.zzmi):void");
    }

    public final void zza(zzme zzme) {
        zzig zzfw;
        if (zzme instanceof zzmn) {
            zznh zznh = this.zzbcg[this.zzbcf.zzi(((zzmn) zzme).zzazp)];
            if (zznh.zzbcl == null && (zzfw = zznh.zzbat.zzfw()) != null) {
                zznh.zzbcl = new zzne((zzhw) zzfw);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r7 = r5.zzbcg[r5.zzbcf.zzi(r6.zzazp)];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.internal.ads.zzme r6, boolean r7, java.lang.Exception r8) {
        /*
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.internal.ads.zznj r7 = r5.zzbbd
            boolean r7 = r7.zzbcs
            r1 = 404(0x194, float:5.66E-43)
            r2 = 1
            if (r7 != 0) goto L_0x0043
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.zzmo
            if (r7 == 0) goto L_0x0043
            boolean r7 = r8 instanceof com.google.android.gms.internal.ads.zzpd
            if (r7 == 0) goto L_0x0043
            r7 = r8
            com.google.android.gms.internal.ads.zzpd r7 = (com.google.android.gms.internal.ads.zzpd) r7
            int r7 = r7.responseCode
            if (r7 != r1) goto L_0x0043
            com.google.android.gms.internal.ads.zznh[] r7 = r5.zzbcg
            com.google.android.gms.internal.ads.zzom r3 = r5.zzbcf
            com.google.android.gms.internal.ads.zzfs r4 = r6.zzazp
            int r3 = r3.zzi(r4)
            r7 = r7[r3]
            int r3 = r7.zzgg()
            r4 = -1
            if (r3 == r4) goto L_0x0043
            if (r3 == 0) goto L_0x0043
            int r7 = r7.zzgd()
            int r7 = r7 + r3
            int r7 = r7 - r2
            r3 = r6
            com.google.android.gms.internal.ads.zzmo r3 = (com.google.android.gms.internal.ads.zzmo) r3
            int r3 = r3.zzfz()
            if (r3 <= r7) goto L_0x0043
            r5.zzbcj = r2
            return r2
        L_0x0043:
            com.google.android.gms.internal.ads.zzom r7 = r5.zzbcf
            com.google.android.gms.internal.ads.zzom r3 = r5.zzbcf
            com.google.android.gms.internal.ads.zzfs r6 = r6.zzazp
            int r6 = r3.zzi(r6)
            boolean r3 = r8 instanceof com.google.android.gms.internal.ads.zzpd
            if (r3 == 0) goto L_0x005d
            r3 = r8
            com.google.android.gms.internal.ads.zzpd r3 = (com.google.android.gms.internal.ads.zzpd) r3
            int r3 = r3.responseCode
            if (r3 == r1) goto L_0x005e
            r1 = 410(0x19a, float:5.75E-43)
            if (r3 != r1) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x00cf
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r0 = r7.zzf(r6, r0)
            com.google.android.gms.internal.ads.zzpd r8 = (com.google.android.gms.internal.ads.zzpd) r8
            int r8 = r8.responseCode
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = "ChunkedTrackBlacklist"
            com.google.android.gms.internal.ads.zzfs r6 = r7.zzat(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 77
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r7 = "Blacklisted: duration=60000, responseCode="
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ", format="
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r1, r6)
            goto L_0x00ce
        L_0x009e:
            java.lang.String r1 = "ChunkedTrackBlacklist"
            com.google.android.gms.internal.ads.zzfs r6 = r7.zzat(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            java.lang.String r7 = "Blacklisting failed (cannot blacklist last enabled track): responseCode="
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = ", format="
            r2.append(r7)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            android.util.Log.w(r1, r6)
        L_0x00ce:
            return r0
        L_0x00cf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznf.zza(com.google.android.gms.internal.ads.zzme, boolean, java.lang.Exception):boolean");
    }

    private final ArrayList<zznp> zzgf() {
        List<zzni> list = this.zzbbd.zzba(this.zzyr).zzbbe;
        ArrayList<zznp> arrayList = new ArrayList<>();
        for (int i : this.zzbbf) {
            arrayList.addAll(list.get(i).zzbcn);
        }
        return arrayList;
    }
}
