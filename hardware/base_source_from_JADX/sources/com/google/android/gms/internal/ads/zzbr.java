package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbr extends zzbut<zzbr> {
    public String zzdv = null;

    public zzbr() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzdv != null) {
            zzbur.zzf(1, this.zzdv);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        return this.zzdv != null ? zzt + zzbur.zzg(1, this.zzdv) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzdv = zzbuq.readString();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
