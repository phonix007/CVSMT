package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class zzjn implements zzhz, zzig {
    private static final zzic zzahq = new zzjo();
    private static final int zzasf = zzqe.zzam("qt  ");
    private long zzaan;
    private final zzpx zzahx = new zzpx(zzpu.zzbhi);
    private final zzpx zzahy = new zzpx(4);
    private int zzajm;
    private int zzajn;
    private zzib zzajq;
    private final zzpx zzaqa = new zzpx(16);
    private final Stack<zziw> zzaqc = new Stack<>();
    private int zzaqe;
    private int zzaqf;
    private long zzaqg;
    private int zzaqh;
    private zzpx zzaqi;
    private zzjp[] zzasg;
    private boolean zzash;

    public final void release() {
    }

    public final boolean zzdw() {
        return true;
    }

    public final boolean zza(zzia zzia) throws IOException, InterruptedException {
        return zzjr.zze(zzia);
    }

    public final void zza(zzib zzib) {
        this.zzajq = zzib;
    }

    public final void zzc(long j, long j2) {
        this.zzaqc.clear();
        this.zzaqh = 0;
        this.zzajn = 0;
        this.zzajm = 0;
        if (j == 0) {
            zzei();
        } else if (this.zzasg != null) {
            for (zzjp zzjp : this.zzasg) {
                zzjv zzjv = zzjp.zzasi;
                int zzu = zzjv.zzu(j2);
                if (zzu == -1) {
                    zzu = zzjv.zzv(j2);
                }
                zzjp.zzapm = zzu;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzia r25, com.google.android.gms.internal.ads.zzif r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
        L_0x0006:
            int r3 = r0.zzaqe
            r5 = 262144(0x40000, double:1.295163E-318)
            r8 = -1
            r9 = 8
            r10 = 1
            switch(r3) {
                case 0: goto L_0x01a0;
                case 1: goto L_0x0119;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0018:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r9 = -1
        L_0x001f:
            com.google.android.gms.internal.ads.zzjp[] r14 = r0.zzasg
            int r14 = r14.length
            if (r3 >= r14) goto L_0x003f
            com.google.android.gms.internal.ads.zzjp[] r14 = r0.zzasg
            r14 = r14[r3]
            int r15 = r14.zzapm
            com.google.android.gms.internal.ads.zzjv r7 = r14.zzasi
            int r7 = r7.zzapk
            if (r15 == r7) goto L_0x003c
            com.google.android.gms.internal.ads.zzjv r7 = r14.zzasi
            long[] r7 = r7.zzagu
            r14 = r7[r15]
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r9 = r3
            r12 = r14
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x003f:
            if (r9 != r8) goto L_0x0042
            return r8
        L_0x0042:
            com.google.android.gms.internal.ads.zzjp[] r3 = r0.zzasg
            r3 = r3[r9]
            com.google.android.gms.internal.ads.zzii r7 = r3.zzasj
            int r8 = r3.zzapm
            com.google.android.gms.internal.ads.zzjv r9 = r3.zzasi
            long[] r9 = r9.zzagu
            r12 = r9[r8]
            com.google.android.gms.internal.ads.zzjv r9 = r3.zzasi
            int[] r9 = r9.zzagt
            r9 = r9[r8]
            com.google.android.gms.internal.ads.zzjs r14 = r3.zzaqu
            int r14 = r14.zzasm
            if (r14 != r10) goto L_0x0061
            r14 = 8
            long r12 = r12 + r14
            int r9 = r9 + -8
        L_0x0061:
            long r14 = r25.getPosition()
            long r14 = r12 - r14
            int r4 = r0.zzajn
            long r10 = (long) r4
            long r14 = r14 + r10
            r10 = 0
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0115
            int r4 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0077
            goto L_0x0115
        L_0x0077:
            int r2 = (int) r14
            r1.zzw(r2)
            com.google.android.gms.internal.ads.zzjs r2 = r3.zzaqu
            int r2 = r2.zzakx
            if (r2 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzahy
            byte[] r2 = r2.data
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r5 = 2
            r2[r5] = r4
            com.google.android.gms.internal.ads.zzjs r2 = r3.zzaqu
            int r2 = r2.zzakx
            com.google.android.gms.internal.ads.zzjs r4 = r3.zzaqu
            int r4 = r4.zzakx
            r5 = 4
            int r4 = 4 - r4
        L_0x0099:
            int r5 = r0.zzajn
            if (r5 >= r9) goto L_0x00f2
            int r5 = r0.zzajm
            if (r5 != 0) goto L_0x00c8
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzahy
            byte[] r5 = r5.data
            r1.readFully(r5, r4, r2)
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzahy
            r6 = 0
            r5.setPosition(r6)
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzahy
            int r5 = r5.zzhg()
            r0.zzajm = r5
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzahx
            r5.setPosition(r6)
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzahx
            r10 = 4
            r7.zza(r5, r10)
            int r5 = r0.zzajn
            int r5 = r5 + r10
            r0.zzajn = r5
            int r9 = r9 + r4
            goto L_0x0099
        L_0x00c8:
            r6 = 0
            int r5 = r0.zzajm
            int r5 = r7.zza(r1, r5, r6)
            int r6 = r0.zzajn
            int r6 = r6 + r5
            r0.zzajn = r6
            int r6 = r0.zzajm
            int r6 = r6 - r5
            r0.zzajm = r6
            goto L_0x0099
        L_0x00da:
            int r2 = r0.zzajn
            if (r2 >= r9) goto L_0x00f2
            int r2 = r0.zzajn
            int r2 = r9 - r2
            r4 = 0
            int r2 = r7.zza(r1, r2, r4)
            int r4 = r0.zzajn
            int r4 = r4 + r2
            r0.zzajn = r4
            int r4 = r0.zzajm
            int r4 = r4 - r2
            r0.zzajm = r4
            goto L_0x00da
        L_0x00f2:
            r20 = r9
            com.google.android.gms.internal.ads.zzjv r1 = r3.zzasi
            long[] r1 = r1.zzatl
            r17 = r1[r8]
            com.google.android.gms.internal.ads.zzjv r1 = r3.zzasi
            int[] r1 = r1.zzapr
            r19 = r1[r8]
            r21 = 0
            r22 = 0
            r16 = r7
            r16.zza(r17, r19, r20, r21, r22)
            int r1 = r3.zzapm
            r4 = 1
            int r1 = r1 + r4
            r3.zzapm = r1
            r1 = 0
            r0.zzajn = r1
            r0.zzajm = r1
            return r1
        L_0x0115:
            r4 = 1
            r2.zzaha = r12
            return r4
        L_0x0119:
            long r3 = r0.zzaqg
            int r7 = r0.zzaqh
            long r7 = (long) r7
            long r3 = r3 - r7
            long r7 = r25.getPosition()
            long r7 = r7 + r3
            com.google.android.gms.internal.ads.zzpx r10 = r0.zzaqi
            if (r10 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzaqi
            byte[] r5 = r5.data
            int r6 = r0.zzaqh
            int r3 = (int) r3
            r1.readFully(r5, r6, r3)
            int r3 = r0.zzaqf
            int r4 = com.google.android.gms.internal.ads.zziv.zzala
            if (r3 != r4) goto L_0x015e
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqi
            r3.setPosition(r9)
            int r4 = r3.readInt()
            int r5 = zzasf
            if (r4 != r5) goto L_0x0147
        L_0x0145:
            r3 = 1
            goto L_0x015b
        L_0x0147:
            r4 = 4
            r3.zzbl(r4)
        L_0x014b:
            int r4 = r3.zzhb()
            if (r4 <= 0) goto L_0x015a
            int r4 = r3.readInt()
            int r5 = zzasf
            if (r4 != r5) goto L_0x014b
            goto L_0x0145
        L_0x015a:
            r3 = 0
        L_0x015b:
            r0.zzash = r3
            goto L_0x0183
        L_0x015e:
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r3 = r0.zzaqc
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0183
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r3 = r0.zzaqc
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zziw r3 = (com.google.android.gms.internal.ads.zziw) r3
            com.google.android.gms.internal.ads.zzix r4 = new com.google.android.gms.internal.ads.zzix
            int r5 = r0.zzaqf
            com.google.android.gms.internal.ads.zzpx r6 = r0.zzaqi
            r4.<init>(r5, r6)
            r3.zza((com.google.android.gms.internal.ads.zzix) r4)
            goto L_0x0183
        L_0x017b:
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0185
            int r3 = (int) r3
            r1.zzw(r3)
        L_0x0183:
            r3 = 0
            goto L_0x018d
        L_0x0185:
            long r5 = r25.getPosition()
            long r5 = r5 + r3
            r2.zzaha = r5
            r3 = 1
        L_0x018d:
            r0.zzt(r7)
            if (r3 == 0) goto L_0x019a
            int r3 = r0.zzaqe
            r4 = 2
            if (r3 == r4) goto L_0x019a
            r23 = 1
            goto L_0x019c
        L_0x019a:
            r23 = 0
        L_0x019c:
            if (r23 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x01a0:
            r3 = 1
            int r4 = r0.zzaqh
            if (r4 != 0) goto L_0x01ca
            com.google.android.gms.internal.ads.zzpx r4 = r0.zzaqa
            byte[] r4 = r4.data
            r5 = 0
            boolean r4 = r1.zza(r4, r5, r9, r3)
            if (r4 != 0) goto L_0x01b3
            r3 = 0
            goto L_0x02b1
        L_0x01b3:
            r0.zzaqh = r9
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            r3.setPosition(r5)
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            long r3 = r3.zzhd()
            r0.zzaqg = r3
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            int r3 = r3.readInt()
            r0.zzaqf = r3
        L_0x01ca:
            long r3 = r0.zzaqg
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01e6
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            byte[] r3 = r3.data
            r1.readFully(r3, r9, r9)
            int r3 = r0.zzaqh
            int r3 = r3 + r9
            r0.zzaqh = r3
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            long r3 = r3.zzhh()
            r0.zzaqg = r3
        L_0x01e6:
            int r3 = r0.zzaqf
            int r4 = com.google.android.gms.internal.ads.zziv.zzamb
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.zziv.zzamd
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.zziv.zzame
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.zziv.zzamf
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.zziv.zzamg
            if (r3 == r4) goto L_0x0203
            int r4 = com.google.android.gms.internal.ads.zziv.zzamp
            if (r3 != r4) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            r3 = 0
            goto L_0x0204
        L_0x0203:
            r3 = 1
        L_0x0204:
            if (r3 == 0) goto L_0x0230
            long r3 = r25.getPosition()
            long r5 = r0.zzaqg
            long r3 = r3 + r5
            int r5 = r0.zzaqh
            long r5 = (long) r5
            long r3 = r3 - r5
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r5 = r0.zzaqc
            com.google.android.gms.internal.ads.zziw r6 = new com.google.android.gms.internal.ads.zziw
            int r7 = r0.zzaqf
            r6.<init>(r7, r3)
            r5.add(r6)
            long r5 = r0.zzaqg
            int r7 = r0.zzaqh
            long r9 = (long) r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x022c
            r0.zzt(r3)
        L_0x0229:
            r3 = 1
            goto L_0x02b1
        L_0x022c:
            r24.zzei()
            goto L_0x0229
        L_0x0230:
            int r3 = r0.zzaqf
            int r4 = com.google.android.gms.internal.ads.zziv.zzamr
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzamc
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzams
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzamt
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzanm
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzann
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzano
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzamq
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzanp
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzanq
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzanr
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzans
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzant
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzamo
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzala
            if (r3 == r4) goto L_0x0275
            int r4 = com.google.android.gms.internal.ads.zziv.zzaoa
            if (r3 != r4) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            r3 = 0
            goto L_0x0276
        L_0x0275:
            r3 = 1
        L_0x0276:
            if (r3 == 0) goto L_0x02ab
            int r3 = r0.zzaqh
            if (r3 != r9) goto L_0x027e
            r3 = 1
            goto L_0x027f
        L_0x027e:
            r3 = 0
        L_0x027f:
            com.google.android.gms.internal.ads.zzpo.checkState(r3)
            long r3 = r0.zzaqg
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x028d
            r3 = 1
            goto L_0x028e
        L_0x028d:
            r3 = 0
        L_0x028e:
            com.google.android.gms.internal.ads.zzpo.checkState(r3)
            com.google.android.gms.internal.ads.zzpx r3 = new com.google.android.gms.internal.ads.zzpx
            long r4 = r0.zzaqg
            int r4 = (int) r4
            r3.<init>((int) r4)
            r0.zzaqi = r3
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqa
            byte[] r3 = r3.data
            com.google.android.gms.internal.ads.zzpx r4 = r0.zzaqi
            byte[] r4 = r4.data
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r9)
            r3 = 1
            r0.zzaqe = r3
            goto L_0x02b1
        L_0x02ab:
            r3 = 1
            r4 = 0
            r0.zzaqi = r4
            r0.zzaqe = r3
        L_0x02b1:
            if (r3 != 0) goto L_0x0006
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjn.zza(com.google.android.gms.internal.ads.zzia, com.google.android.gms.internal.ads.zzif):int");
    }

    public final long getDurationUs() {
        return this.zzaan;
    }

    public final long zzr(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzjp zzjp : this.zzasg) {
            zzjv zzjv = zzjp.zzasi;
            int zzu = zzjv.zzu(j);
            if (zzu == -1) {
                zzu = zzjv.zzv(j);
            }
            long j3 = zzjv.zzagu[zzu];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzei() {
        this.zzaqe = 0;
        this.zzaqh = 0;
    }

    private final void zzt(long j) throws zzfx {
        zzjs zza;
        while (!this.zzaqc.isEmpty() && this.zzaqc.peek().zzaop == j) {
            zziw pop = this.zzaqc.pop();
            if (pop.type == zziv.zzamb) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzki zzki = null;
                zzid zzid = new zzid();
                zzix zzai = pop.zzai(zziv.zzaoa);
                if (!(zzai == null || (zzki = zziy.zza(zzai, this.zzash)) == null)) {
                    zzid.zzb(zzki);
                }
                for (int i = 0; i < pop.zzaor.size(); i++) {
                    zziw zziw = pop.zzaor.get(i);
                    if (zziw.type == zziv.zzamd && (zza = zziy.zza(zziw, pop.zzai(zziv.zzamc), -9223372036854775807L, (zzhp) null, this.zzash)) != null) {
                        zzjv zza2 = zziy.zza(zza, zziw.zzaj(zziv.zzame).zzaj(zziv.zzamf).zzaj(zziv.zzamg), zzid);
                        if (zza2.zzapk != 0) {
                            zzjp zzjp = new zzjp(zza, zza2, this.zzajq.zzb(i, zza.type));
                            zzfs zzj = zza.zzaad.zzj(zza2.zzapp + 30);
                            if (zza.type == 1) {
                                if (zzid.zzea()) {
                                    zzj = zzj.zza(zzid.zzzw, zzid.zzzx);
                                }
                                if (zzki != null) {
                                    zzj = zzj.zza(zzki);
                                }
                            }
                            zzjp.zzasj.zzf(zzj);
                            j2 = Math.max(j2, zza.zzaan);
                            arrayList.add(zzjp);
                        }
                    }
                }
                this.zzaan = j2;
                this.zzasg = (zzjp[]) arrayList.toArray(new zzjp[arrayList.size()]);
                this.zzajq.zzdy();
                this.zzajq.zza(this);
                this.zzaqc.clear();
                this.zzaqe = 2;
            } else if (!this.zzaqc.isEmpty()) {
                this.zzaqc.peek().zza(pop);
            }
        }
        if (this.zzaqe != 2) {
            zzei();
        }
    }
}
