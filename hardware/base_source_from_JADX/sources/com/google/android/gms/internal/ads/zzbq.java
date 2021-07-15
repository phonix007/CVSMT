package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbq extends zzbut<zzbq> {
    public Long zzhh = null;
    private String zzhp = null;
    private byte[] zzhq = null;

    public zzbq() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzhh != null) {
            zzbur.zzr(1, this.zzhh.longValue());
        }
        if (this.zzhp != null) {
            zzbur.zzf(3, this.zzhp);
        }
        if (this.zzhq != null) {
            zzbur.zza(4, this.zzhq);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzhh != null) {
            zzt += zzbur.zzm(1, this.zzhh.longValue());
        }
        if (this.zzhp != null) {
            zzt += zzbur.zzg(3, this.zzhp);
        }
        return this.zzhq != null ? zzt + zzbur.zzb(4, this.zzhq) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 8) {
                this.zzhh = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 26) {
                this.zzhp = zzbuq.readString();
            } else if (zzaku == 34) {
                this.zzhq = zzbuq.readBytes();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
