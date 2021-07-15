package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbp extends zzbut<zzbp> {
    public byte[] data = null;
    public byte[] zzhm = null;
    public byte[] zzhn = null;
    public byte[] zzho = null;

    public zzbp() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.data != null) {
            zzbur.zza(1, this.data);
        }
        if (this.zzhm != null) {
            zzbur.zza(2, this.zzhm);
        }
        if (this.zzhn != null) {
            zzbur.zza(3, this.zzhn);
        }
        if (this.zzho != null) {
            zzbur.zza(4, this.zzho);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.data != null) {
            zzt += zzbur.zzb(1, this.data);
        }
        if (this.zzhm != null) {
            zzt += zzbur.zzb(2, this.zzhm);
        }
        if (this.zzhn != null) {
            zzt += zzbur.zzb(3, this.zzhn);
        }
        return this.zzho != null ? zzt + zzbur.zzb(4, this.zzho) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                this.data = zzbuq.readBytes();
            } else if (zzaku == 18) {
                this.zzhm = zzbuq.readBytes();
            } else if (zzaku == 26) {
                this.zzhn = zzbuq.readBytes();
            } else if (zzaku == 34) {
                this.zzho = zzbuq.readBytes();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
