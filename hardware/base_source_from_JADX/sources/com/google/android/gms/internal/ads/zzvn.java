package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvn extends zzbut<zzvn> {
    public String zzchc = null;
    private zzuw.zzn zzchd = null;
    private Integer zzche = null;
    public zzvq zzchf = null;
    private Integer zzchg = null;
    private zzvc zzchh = null;
    private zzvc zzchi = null;
    private zzvc zzchj = null;

    public zzvn() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzchc != null) {
            zzbur.zzf(1, this.zzchc);
        }
        if (this.zzchd != null) {
            zzbur.zze(2, this.zzchd);
        }
        if (this.zzche != null) {
            zzbur.zzv(3, this.zzche.intValue());
        }
        if (this.zzchf != null) {
            zzbur.zza(4, (zzbuz) this.zzchf);
        }
        if (this.zzchg != null) {
            zzbur.zzv(5, this.zzchg.intValue());
        }
        if (!(this.zzchh == null || this.zzchh == null)) {
            zzbur.zzv(6, this.zzchh.zzom());
        }
        if (!(this.zzchi == null || this.zzchi == null)) {
            zzbur.zzv(7, this.zzchi.zzom());
        }
        if (!(this.zzchj == null || this.zzchj == null)) {
            zzbur.zzv(8, this.zzchj.zzom());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzchc != null) {
            zzt += zzbur.zzg(1, this.zzchc);
        }
        if (this.zzchd != null) {
            zzt += zzbqk.zzc(2, (zzbsl) this.zzchd);
        }
        if (this.zzche != null) {
            zzt += zzbur.zzz(3, this.zzche.intValue());
        }
        if (this.zzchf != null) {
            zzt += zzbur.zzb(4, (zzbuz) this.zzchf);
        }
        if (this.zzchg != null) {
            zzt += zzbur.zzz(5, this.zzchg.intValue());
        }
        if (!(this.zzchh == null || this.zzchh == null)) {
            zzt += zzbur.zzz(6, this.zzchh.zzom());
        }
        if (!(this.zzchi == null || this.zzchi == null)) {
            zzt += zzbur.zzz(7, this.zzchi.zzom());
        }
        return (this.zzchj == null || this.zzchj == null) ? zzt : zzt + zzbur.zzz(8, this.zzchj.zzom());
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzchc = zzbuq.readString();
            } else if (zzaku == 18) {
                this.zzchd = (zzuw.zzn) zzbuq.zza(zzuw.zzn.zzon());
            } else if (zzaku == 24) {
                this.zzche = Integer.valueOf(zzbuq.zzalm());
            } else if (zzaku == 34) {
                if (this.zzchf == null) {
                    this.zzchf = new zzvq();
                }
                zzbuq.zza((zzbuz) this.zzchf);
            } else if (zzaku == 40) {
                this.zzchg = Integer.valueOf(zzbuq.zzalm());
            } else if (zzaku == 48) {
                int position = zzbuq.getPosition();
                int zzalm = zzbuq.zzalm();
                if (zzalm != 1000) {
                    switch (zzalm) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbuq.zzgc(position);
                            zza(zzbuq, zzaku);
                            continue;
                    }
                }
                this.zzchh = zzvc.zzcd(zzalm);
            } else if (zzaku == 56) {
                int position2 = zzbuq.getPosition();
                int zzalm2 = zzbuq.zzalm();
                if (zzalm2 != 1000) {
                    switch (zzalm2) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbuq.zzgc(position2);
                            zza(zzbuq, zzaku);
                            continue;
                    }
                }
                this.zzchi = zzvc.zzcd(zzalm2);
            } else if (zzaku == 64) {
                int position3 = zzbuq.getPosition();
                int zzalm3 = zzbuq.zzalm();
                if (zzalm3 != 1000) {
                    switch (zzalm3) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbuq.zzgc(position3);
                            zza(zzbuq, zzaku);
                            continue;
                    }
                }
                this.zzchj = zzvc.zzcd(zzalm3);
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
