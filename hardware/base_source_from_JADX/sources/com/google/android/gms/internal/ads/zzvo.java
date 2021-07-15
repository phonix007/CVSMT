package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvo extends zzbut<zzvo> {
    private zzuw.zzd.zzb zzchk = null;
    private zzvq zzchl = null;
    private String zzchm = null;
    private String zzchn = null;

    public zzvo() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (!(this.zzchk == null || this.zzchk == null)) {
            zzbur.zzv(5, this.zzchk.zzom());
        }
        if (this.zzchl != null) {
            zzbur.zza(6, (zzbuz) this.zzchl);
        }
        if (this.zzchm != null) {
            zzbur.zzf(7, this.zzchm);
        }
        if (this.zzchn != null) {
            zzbur.zzf(8, this.zzchn);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (!(this.zzchk == null || this.zzchk == null)) {
            zzt += zzbur.zzz(5, this.zzchk.zzom());
        }
        if (this.zzchl != null) {
            zzt += zzbur.zzb(6, (zzbuz) this.zzchl);
        }
        if (this.zzchm != null) {
            zzt += zzbur.zzg(7, this.zzchm);
        }
        return this.zzchn != null ? zzt + zzbur.zzg(8, this.zzchn) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku != 0) {
                if (zzaku == 40) {
                    int position = zzbuq.getPosition();
                    int zzalm = zzbuq.zzalm();
                    switch (zzalm) {
                        case 0:
                        case 1:
                        case 2:
                            this.zzchk = zzuw.zzd.zzb.zzcc(zzalm);
                            break;
                        default:
                            zzbuq.zzgc(position);
                            zza(zzbuq, zzaku);
                            break;
                    }
                } else if (zzaku == 50) {
                    if (this.zzchl == null) {
                        this.zzchl = new zzvq();
                    }
                    zzbuq.zza((zzbuz) this.zzchl);
                } else if (zzaku == 58) {
                    this.zzchm = zzbuq.readString();
                } else if (zzaku == 66) {
                    this.zzchn = zzbuq.readString();
                } else if (!super.zza(zzbuq, zzaku)) {
                    return this;
                }
            } else {
                return this;
            }
        }
    }
}
