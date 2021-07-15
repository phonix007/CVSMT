package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvl extends zzbut<zzvl> {
    public Integer zzcgm = null;
    private zzvc zzcgn = null;
    private zzuw.zzb zzcgo = null;
    public zzvm zzcgp = null;
    private zzuw.zza[] zzcgq = new zzuw.zza[0];
    private zzuw.zzc zzcgr = null;
    private zzuw.zzj zzcgs = null;
    private zzuw.zzi zzcgt = null;
    private zzuw.zzf zzcgu = null;
    private zzuw.zzg zzcgv = null;
    private zzvr[] zzcgw = zzvr.zzpl();

    public zzvl() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzcgm != null) {
            zzbur.zzv(7, this.zzcgm.intValue());
        }
        if (!(this.zzcgn == null || this.zzcgn == null)) {
            zzbur.zzv(8, this.zzcgn.zzom());
        }
        if (this.zzcgo != null) {
            zzbur.zze(9, this.zzcgo);
        }
        if (this.zzcgp != null) {
            zzbur.zza(10, (zzbuz) this.zzcgp);
        }
        if (this.zzcgq != null && this.zzcgq.length > 0) {
            for (zzuw.zza zza : this.zzcgq) {
                if (zza != null) {
                    zzbur.zze(11, zza);
                }
            }
        }
        if (this.zzcgr != null) {
            zzbur.zze(12, this.zzcgr);
        }
        if (this.zzcgs != null) {
            zzbur.zze(13, this.zzcgs);
        }
        if (this.zzcgt != null) {
            zzbur.zze(14, this.zzcgt);
        }
        if (this.zzcgu != null) {
            zzbur.zze(15, this.zzcgu);
        }
        if (this.zzcgv != null) {
            zzbur.zze(16, this.zzcgv);
        }
        if (this.zzcgw != null && this.zzcgw.length > 0) {
            for (zzvr zzvr : this.zzcgw) {
                if (zzvr != null) {
                    zzbur.zza(17, (zzbuz) zzvr);
                }
            }
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzcgm != null) {
            zzt += zzbur.zzz(7, this.zzcgm.intValue());
        }
        if (!(this.zzcgn == null || this.zzcgn == null)) {
            zzt += zzbur.zzz(8, this.zzcgn.zzom());
        }
        if (this.zzcgo != null) {
            zzt += zzbqk.zzc(9, (zzbsl) this.zzcgo);
        }
        if (this.zzcgp != null) {
            zzt += zzbur.zzb(10, (zzbuz) this.zzcgp);
        }
        if (this.zzcgq != null && this.zzcgq.length > 0) {
            int i = zzt;
            for (zzuw.zza zza : this.zzcgq) {
                if (zza != null) {
                    i += zzbqk.zzc(11, (zzbsl) zza);
                }
            }
            zzt = i;
        }
        if (this.zzcgr != null) {
            zzt += zzbqk.zzc(12, (zzbsl) this.zzcgr);
        }
        if (this.zzcgs != null) {
            zzt += zzbqk.zzc(13, (zzbsl) this.zzcgs);
        }
        if (this.zzcgt != null) {
            zzt += zzbqk.zzc(14, (zzbsl) this.zzcgt);
        }
        if (this.zzcgu != null) {
            zzt += zzbqk.zzc(15, (zzbsl) this.zzcgu);
        }
        if (this.zzcgv != null) {
            zzt += zzbqk.zzc(16, (zzbsl) this.zzcgv);
        }
        if (this.zzcgw != null && this.zzcgw.length > 0) {
            for (zzvr zzvr : this.zzcgw) {
                if (zzvr != null) {
                    zzt += zzbur.zzb(17, (zzbuz) zzvr);
                }
            }
        }
        return zzt;
    }

    /* access modifiers changed from: private */
    /* renamed from: zze */
    public final zzvl zza(zzbuq zzbuq) throws IOException {
        int zzalm;
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 56:
                    try {
                        zzalm = zzbuq.zzalm();
                        if (zzalm >= 0 && zzalm <= 9) {
                            this.zzcgm = Integer.valueOf(zzalm);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(43);
                            sb.append(zzalm);
                            sb.append(" is not a valid enum AdInitiater");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        zzbuq.zzgc(zzbuq.getPosition());
                        zza(zzbuq, zzaku);
                        break;
                    }
                case 64:
                    int position = zzbuq.getPosition();
                    int zzalm2 = zzbuq.zzalm();
                    if (zzalm2 != 1000) {
                        switch (zzalm2) {
                            case 0:
                            case 1:
                                break;
                            default:
                                zzbuq.zzgc(position);
                                zza(zzbuq, zzaku);
                                continue;
                        }
                    }
                    this.zzcgn = zzvc.zzcd(zzalm2);
                    break;
                case 74:
                    this.zzcgo = (zzuw.zzb) zzbuq.zza(zzuw.zzb.zzon());
                    break;
                case 82:
                    if (this.zzcgp == null) {
                        this.zzcgp = new zzvm();
                    }
                    zzbuq.zza((zzbuz) this.zzcgp);
                    break;
                case 90:
                    int zzb = zzbvc.zzb(zzbuq, 90);
                    int length = this.zzcgq == null ? 0 : this.zzcgq.length;
                    zzuw.zza[] zzaArr = new zzuw.zza[(zzb + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzcgq, 0, zzaArr, 0, length);
                    }
                    while (length < zzaArr.length - 1) {
                        zzaArr[length] = (zzuw.zza) zzbuq.zza(zzuw.zza.zzon());
                        zzbuq.zzaku();
                        length++;
                    }
                    zzaArr[length] = (zzuw.zza) zzbuq.zza(zzuw.zza.zzon());
                    this.zzcgq = zzaArr;
                    break;
                case 98:
                    this.zzcgr = (zzuw.zzc) zzbuq.zza(zzuw.zzc.zzon());
                    break;
                case 106:
                    this.zzcgs = (zzuw.zzj) zzbuq.zza(zzuw.zzj.zzon());
                    break;
                case 114:
                    this.zzcgt = (zzuw.zzi) zzbuq.zza(zzuw.zzi.zzon());
                    break;
                case 122:
                    this.zzcgu = (zzuw.zzf) zzbuq.zza(zzuw.zzf.zzon());
                    break;
                case 130:
                    this.zzcgv = (zzuw.zzg) zzbuq.zza(zzuw.zzg.zzon());
                    break;
                case 138:
                    int zzb2 = zzbvc.zzb(zzbuq, 138);
                    int length2 = this.zzcgw == null ? 0 : this.zzcgw.length;
                    zzvr[] zzvrArr = new zzvr[(zzb2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.zzcgw, 0, zzvrArr, 0, length2);
                    }
                    while (length2 < zzvrArr.length - 1) {
                        zzvrArr[length2] = new zzvr();
                        zzbuq.zza((zzbuz) zzvrArr[length2]);
                        zzbuq.zzaku();
                        length2++;
                    }
                    zzvrArr[length2] = new zzvr();
                    zzbuq.zza((zzbuz) zzvrArr[length2]);
                    this.zzcgw = zzvrArr;
                    break;
                default:
                    if (super.zza(zzbuq, zzaku)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append(zzalm);
        sb2.append(" is not a valid enum AdInitiater");
        throw new IllegalArgumentException(sb2.toString());
    }
}
