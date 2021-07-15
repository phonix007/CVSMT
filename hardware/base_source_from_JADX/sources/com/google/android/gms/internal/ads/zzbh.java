package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbh extends zzbut<zzbh> {
    private String stackTrace = null;
    public String zzdh = null;
    public Long zzdi = null;
    private String zzdj = null;
    private String zzdk = null;
    private Long zzdl = null;
    private Long zzdm = null;
    private String zzdn = null;
    private Long zzdo = null;
    private String zzdp = null;

    public zzbh() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzdh != null) {
            zzbur.zzf(1, this.zzdh);
        }
        if (this.zzdi != null) {
            zzbur.zzr(2, this.zzdi.longValue());
        }
        if (this.stackTrace != null) {
            zzbur.zzf(3, this.stackTrace);
        }
        if (this.zzdj != null) {
            zzbur.zzf(4, this.zzdj);
        }
        if (this.zzdk != null) {
            zzbur.zzf(5, this.zzdk);
        }
        if (this.zzdl != null) {
            zzbur.zzr(6, this.zzdl.longValue());
        }
        if (this.zzdm != null) {
            zzbur.zzr(7, this.zzdm.longValue());
        }
        if (this.zzdn != null) {
            zzbur.zzf(8, this.zzdn);
        }
        if (this.zzdo != null) {
            zzbur.zzr(9, this.zzdo.longValue());
        }
        if (this.zzdp != null) {
            zzbur.zzf(10, this.zzdp);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzdh != null) {
            zzt += zzbur.zzg(1, this.zzdh);
        }
        if (this.zzdi != null) {
            zzt += zzbur.zzm(2, this.zzdi.longValue());
        }
        if (this.stackTrace != null) {
            zzt += zzbur.zzg(3, this.stackTrace);
        }
        if (this.zzdj != null) {
            zzt += zzbur.zzg(4, this.zzdj);
        }
        if (this.zzdk != null) {
            zzt += zzbur.zzg(5, this.zzdk);
        }
        if (this.zzdl != null) {
            zzt += zzbur.zzm(6, this.zzdl.longValue());
        }
        if (this.zzdm != null) {
            zzt += zzbur.zzm(7, this.zzdm.longValue());
        }
        if (this.zzdn != null) {
            zzt += zzbur.zzg(8, this.zzdn);
        }
        if (this.zzdo != null) {
            zzt += zzbur.zzm(9, this.zzdo.longValue());
        }
        return this.zzdp != null ? zzt + zzbur.zzg(10, this.zzdp) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 10:
                    this.zzdh = zzbuq.readString();
                    break;
                case 16:
                    this.zzdi = Long.valueOf(zzbuq.zzaln());
                    break;
                case 26:
                    this.stackTrace = zzbuq.readString();
                    break;
                case 34:
                    this.zzdj = zzbuq.readString();
                    break;
                case 42:
                    this.zzdk = zzbuq.readString();
                    break;
                case 48:
                    this.zzdl = Long.valueOf(zzbuq.zzaln());
                    break;
                case 56:
                    this.zzdm = Long.valueOf(zzbuq.zzaln());
                    break;
                case 66:
                    this.zzdn = zzbuq.readString();
                    break;
                case 72:
                    this.zzdo = Long.valueOf(zzbuq.zzaln());
                    break;
                case 82:
                    this.zzdp = zzbuq.readString();
                    break;
                default:
                    if (super.zza(zzbuq, zzaku)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
