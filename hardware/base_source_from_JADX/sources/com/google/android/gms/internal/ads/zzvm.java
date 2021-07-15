package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvm extends zzbut<zzvm> {
    public String zzcgx = null;
    private zzuw.zza[] zzcgy = new zzuw.zza[0];
    private zzvc zzcgz = null;
    private zzvc zzcha = null;
    private zzvc zzchb = null;

    public zzvm() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzcgx != null) {
            zzbur.zzf(1, this.zzcgx);
        }
        if (this.zzcgy != null && this.zzcgy.length > 0) {
            for (zzuw.zza zza : this.zzcgy) {
                if (zza != null) {
                    zzbur.zze(2, zza);
                }
            }
        }
        if (!(this.zzcgz == null || this.zzcgz == null)) {
            zzbur.zzv(3, this.zzcgz.zzom());
        }
        if (!(this.zzcha == null || this.zzcha == null)) {
            zzbur.zzv(4, this.zzcha.zzom());
        }
        if (!(this.zzchb == null || this.zzchb == null)) {
            zzbur.zzv(5, this.zzchb.zzom());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzcgx != null) {
            zzt += zzbur.zzg(1, this.zzcgx);
        }
        if (this.zzcgy != null && this.zzcgy.length > 0) {
            for (zzuw.zza zza : this.zzcgy) {
                if (zza != null) {
                    zzt += zzbqk.zzc(2, (zzbsl) zza);
                }
            }
        }
        if (!(this.zzcgz == null || this.zzcgz == null)) {
            zzt += zzbur.zzz(3, this.zzcgz.zzom());
        }
        if (!(this.zzcha == null || this.zzcha == null)) {
            zzt += zzbur.zzz(4, this.zzcha.zzom());
        }
        return (this.zzchb == null || this.zzchb == null) ? zzt : zzt + zzbur.zzz(5, this.zzchb.zzom());
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzcgx = zzbuq.readString();
            } else if (zzaku == 18) {
                int zzb = zzbvc.zzb(zzbuq, 18);
                int length = this.zzcgy == null ? 0 : this.zzcgy.length;
                zzuw.zza[] zzaArr = new zzuw.zza[(zzb + length)];
                if (length != 0) {
                    System.arraycopy(this.zzcgy, 0, zzaArr, 0, length);
                }
                while (length < zzaArr.length - 1) {
                    zzaArr[length] = (zzuw.zza) zzbuq.zza(zzuw.zza.zzon());
                    zzbuq.zzaku();
                    length++;
                }
                zzaArr[length] = (zzuw.zza) zzbuq.zza(zzuw.zza.zzon());
                this.zzcgy = zzaArr;
            } else if (zzaku == 24) {
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
                this.zzcgz = zzvc.zzcd(zzalm);
            } else if (zzaku == 32) {
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
                this.zzcha = zzvc.zzcd(zzalm2);
            } else if (zzaku == 40) {
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
                this.zzchb = zzvc.zzcd(zzalm3);
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
