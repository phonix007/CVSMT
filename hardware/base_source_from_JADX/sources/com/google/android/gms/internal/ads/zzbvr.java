package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbvd;
import java.io.IOException;

public final class zzbvr extends zzbut<zzbvr> {
    private zzbvp[] zzgbm = zzbvp.zzaqd();
    private byte[] zzgbn = null;
    private byte[] zzgbo = null;
    private Integer zzgbp = null;
    private zzbvd.zzb.zze.C0534zzb zzgbq = null;
    private byte[] zzgbr = null;

    public zzbvr() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzgbq != null) {
            zzbur.zze(1, this.zzgbq);
        }
        if (this.zzgbm != null && this.zzgbm.length > 0) {
            for (zzbvp zzbvp : this.zzgbm) {
                if (zzbvp != null) {
                    zzbur.zza(2, (zzbuz) zzbvp);
                }
            }
        }
        if (this.zzgbn != null) {
            zzbur.zza(3, this.zzgbn);
        }
        if (this.zzgbo != null) {
            zzbur.zza(4, this.zzgbo);
        }
        if (this.zzgbp != null) {
            zzbur.zzv(5, this.zzgbp.intValue());
        }
        if (this.zzgbr != null) {
            zzbur.zza(6, this.zzgbr);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzgbq != null) {
            zzt += zzbqk.zzc(1, (zzbsl) this.zzgbq);
        }
        if (this.zzgbm != null && this.zzgbm.length > 0) {
            for (zzbvp zzbvp : this.zzgbm) {
                if (zzbvp != null) {
                    zzt += zzbur.zzb(2, (zzbuz) zzbvp);
                }
            }
        }
        if (this.zzgbn != null) {
            zzt += zzbur.zzb(3, this.zzgbn);
        }
        if (this.zzgbo != null) {
            zzt += zzbur.zzb(4, this.zzgbo);
        }
        if (this.zzgbp != null) {
            zzt += zzbur.zzz(5, this.zzgbp.intValue());
        }
        return this.zzgbr != null ? zzt + zzbur.zzb(6, this.zzgbr) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzgbq = (zzbvd.zzb.zze.C0534zzb) zzbuq.zza(zzbvd.zzb.zze.C0534zzb.zzon());
            } else if (zzaku == 18) {
                int zzb = zzbvc.zzb(zzbuq, 18);
                int length = this.zzgbm == null ? 0 : this.zzgbm.length;
                zzbvp[] zzbvpArr = new zzbvp[(zzb + length)];
                if (length != 0) {
                    System.arraycopy(this.zzgbm, 0, zzbvpArr, 0, length);
                }
                while (length < zzbvpArr.length - 1) {
                    zzbvpArr[length] = new zzbvp();
                    zzbuq.zza((zzbuz) zzbvpArr[length]);
                    zzbuq.zzaku();
                    length++;
                }
                zzbvpArr[length] = new zzbvp();
                zzbuq.zza((zzbuz) zzbvpArr[length]);
                this.zzgbm = zzbvpArr;
            } else if (zzaku == 26) {
                this.zzgbn = zzbuq.readBytes();
            } else if (zzaku == 34) {
                this.zzgbo = zzbuq.readBytes();
            } else if (zzaku == 40) {
                this.zzgbp = Integer.valueOf(zzbuq.zzakx());
            } else if (zzaku == 50) {
                this.zzgbr = zzbuq.readBytes();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
