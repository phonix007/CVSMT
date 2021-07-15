package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbvu extends zzbut<zzbvu> {
    public String zzgcc = null;
    public Long zzgcd = null;
    public Boolean zzgce = null;

    public zzbvu() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzgcc != null) {
            zzbur.zzf(1, this.zzgcc);
        }
        if (this.zzgcd != null) {
            zzbur.zzr(2, this.zzgcd.longValue());
        }
        if (this.zzgce != null) {
            zzbur.zzj(3, this.zzgce.booleanValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzgcc != null) {
            zzt += zzbur.zzg(1, this.zzgcc);
        }
        if (this.zzgcd != null) {
            zzt += zzbur.zzm(2, this.zzgcd.longValue());
        }
        if (this.zzgce == null) {
            return zzt;
        }
        this.zzgce.booleanValue();
        return zzt + zzbur.zzfd(3) + 1;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzgcc = zzbuq.readString();
            } else if (zzaku == 16) {
                this.zzgcd = Long.valueOf(zzbuq.zzakw());
            } else if (zzaku == 24) {
                this.zzgce = Boolean.valueOf(zzbuq.zzala());
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
