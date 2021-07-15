package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzbsr<T> implements zzbtc<T> {
    private final zzbsl zzfsm;
    private final boolean zzfsn;
    private final zzbtu<?, ?> zzfsw;
    private final zzbqr<?> zzfsx;

    private zzbsr(zzbtu<?, ?> zzbtu, zzbqr<?> zzbqr, zzbsl zzbsl) {
        this.zzfsw = zzbtu;
        this.zzfsn = zzbqr.zzh(zzbsl);
        this.zzfsx = zzbqr;
        this.zzfsm = zzbsl;
    }

    static <T> zzbsr<T> zza(zzbtu<?, ?> zzbtu, zzbqr<?> zzbqr, zzbsl zzbsl) {
        return new zzbsr<>(zzbtu, zzbqr, zzbsl);
    }

    public final T newInstance() {
        return this.zzfsm.zzamu().zzamz();
    }

    public final boolean equals(T t, T t2) {
        if (!this.zzfsw.zzag(t).equals(this.zzfsw.zzag(t2))) {
            return false;
        }
        if (this.zzfsn) {
            return this.zzfsx.zzq(t).equals(this.zzfsx.zzq(t2));
        }
        return true;
    }

    public final int hashCode(T t) {
        int hashCode = this.zzfsw.zzag(t).hashCode();
        return this.zzfsn ? (hashCode * 53) + this.zzfsx.zzq(t).hashCode() : hashCode;
    }

    public final void zzd(T t, T t2) {
        zzbte.zza(this.zzfsw, t, t2);
        if (this.zzfsn) {
            zzbte.zza(this.zzfsx, t, t2);
        }
    }

    public final void zza(T t, zzbup zzbup) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzfsx.zzq(t).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            zzbqw zzbqw = (zzbqw) next.getKey();
            if (zzbqw.zzamm() != zzbuo.MESSAGE || zzbqw.zzamn() || zzbqw.zzamo()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzbrq) {
                zzbup.zzb(zzbqw.zzom(), (Object) ((zzbrq) next).zzann().zzakf());
            } else {
                zzbup.zzb(zzbqw.zzom(), next.getValue());
            }
        }
        zzbtu<?, ?> zzbtu = this.zzfsw;
        zzbtu.zzc(zzbtu.zzag(t), zzbup);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzbpr r11) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbrd r7 = (com.google.android.gms.internal.ads.zzbrd) r7
            com.google.android.gms.internal.ads.zzbtv r0 = r7.zzfpu
            com.google.android.gms.internal.ads.zzbtv r1 = com.google.android.gms.internal.ads.zzbtv.zzaoz()
            if (r0 != r1) goto L_0x0010
            com.google.android.gms.internal.ads.zzbtv r0 = com.google.android.gms.internal.ads.zzbtv.zzapa()
            r7.zzfpu = r0
        L_0x0010:
            r7 = r0
        L_0x0011:
            if (r9 >= r10) goto L_0x0069
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r8, r9, r11)
            int r0 = r11.zzfld
            r9 = 11
            r1 = 2
            if (r0 == r9) goto L_0x0030
            r9 = r0 & 7
            if (r9 != r1) goto L_0x002b
            r1 = r8
            r3 = r10
            r4 = r7
            r5 = r11
            int r9 = com.google.android.gms.internal.ads.zzbpq.zza((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzbtv) r4, (com.google.android.gms.internal.ads.zzbpr) r5)
            goto L_0x0011
        L_0x002b:
            int r9 = com.google.android.gms.internal.ads.zzbpq.zza(r0, r8, r2, r10, r11)
            goto L_0x0011
        L_0x0030:
            r9 = 0
            r0 = 0
        L_0x0032:
            if (r2 >= r10) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r8, r2, r11)
            int r3 = r11.zzfld
            int r4 = r3 >>> 3
            r5 = r3 & 7
            switch(r4) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0056
        L_0x0042:
            if (r5 != r1) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.zzbpq.zze(r8, r2, r11)
            java.lang.Object r0 = r11.zzflf
            com.google.android.gms.internal.ads.zzbpu r0 = (com.google.android.gms.internal.ads.zzbpu) r0
            goto L_0x0032
        L_0x004d:
            if (r5 != 0) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r8, r2, r11)
            int r9 = r11.zzfld
            goto L_0x0032
        L_0x0056:
            r4 = 12
            if (r3 == r4) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.zzbpq.zza(r3, r8, r2, r10, r11)
            goto L_0x0032
        L_0x005f:
            if (r0 == 0) goto L_0x0067
            int r9 = r9 << 3
            r9 = r9 | r1
            r7.zzc(r9, r0)
        L_0x0067:
            r9 = r2
            goto L_0x0011
        L_0x0069:
            if (r9 != r10) goto L_0x006c
            return
        L_0x006c:
            com.google.android.gms.internal.ads.zzbrl r7 = com.google.android.gms.internal.ads.zzbrl.zzanj()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsr.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzbpr):void");
    }

    public final void zza(T t, zzbtb zzbtb, zzbqq zzbqq) throws IOException {
        boolean z;
        zzbtu<?, ?> zzbtu = this.zzfsw;
        zzbqr<?> zzbqr = this.zzfsx;
        Object zzah = zzbtu.zzah(t);
        zzbqu<?> zzr = zzbqr.zzr(t);
        do {
            try {
                if (zzbtb.zzals() == Integer.MAX_VALUE) {
                    zzbtu.zzg(t, zzah);
                    return;
                }
                int tag = zzbtb.getTag();
                if (tag == 11) {
                    Object obj = null;
                    zzbpu zzbpu = null;
                    int i = 0;
                    while (zzbtb.zzals() != Integer.MAX_VALUE) {
                        int tag2 = zzbtb.getTag();
                        if (tag2 == 16) {
                            i = zzbtb.zzald();
                            obj = zzbqr.zza(zzbqq, this.zzfsm, i);
                        } else if (tag2 == 26) {
                            if (obj != null) {
                                zzbqr.zza(zzbtb, obj, zzbqq, zzr);
                            } else {
                                zzbpu = zzbtb.zzalc();
                            }
                        } else if (!zzbtb.zzalt()) {
                            break;
                        }
                    }
                    if (zzbtb.getTag() != 12) {
                        throw zzbrl.zzang();
                    } else if (zzbpu != null) {
                        if (obj != null) {
                            zzbqr.zza(zzbpu, obj, zzbqq, zzr);
                        } else {
                            zzbtu.zza(zzah, i, zzbpu);
                        }
                    }
                } else if ((tag & 7) == 2) {
                    Object zza = zzbqr.zza(zzbqq, this.zzfsm, tag >>> 3);
                    if (zza != null) {
                        zzbqr.zza(zzbtb, zza, zzbqq, zzr);
                    } else {
                        z = zzbtu.zza(zzah, zzbtb);
                        continue;
                    }
                } else {
                    z = zzbtb.zzalt();
                    continue;
                }
                z = true;
                continue;
            } finally {
                zzbtu.zzg(t, zzah);
            }
        } while (z);
    }

    public final void zzs(T t) {
        this.zzfsw.zzs(t);
        this.zzfsx.zzs(t);
    }

    public final boolean zzae(T t) {
        return this.zzfsx.zzq(t).isInitialized();
    }

    public final int zzac(T t) {
        zzbtu<?, ?> zzbtu = this.zzfsw;
        int zzai = zzbtu.zzai(zzbtu.zzag(t)) + 0;
        return this.zzfsn ? zzai + this.zzfsx.zzq(t).zzamk() : zzai;
    }
}
