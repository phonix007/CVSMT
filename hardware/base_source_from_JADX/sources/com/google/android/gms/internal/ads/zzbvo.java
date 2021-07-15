package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbvo extends zzbut<zzbvo> {
    public String zzegh = null;

    public zzbvo() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzegh != null) {
            zzbur.zzf(1, this.zzegh);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        return this.zzegh != null ? zzt + zzbur.zzg(1, this.zzegh) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.zzegh = zzbuq.readString();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
