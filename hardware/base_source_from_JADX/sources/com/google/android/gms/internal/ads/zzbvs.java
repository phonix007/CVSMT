package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbvs extends zzbut<zzbvs> {
    public String mimeType = null;
    public Integer zzgar = null;
    public byte[] zzgbs = null;

    public zzbvs() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzgar != null) {
            zzbur.zzv(1, this.zzgar.intValue());
        }
        if (this.mimeType != null) {
            zzbur.zzf(2, this.mimeType);
        }
        if (this.zzgbs != null) {
            zzbur.zza(3, this.zzgbs);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzgar != null) {
            zzt += zzbur.zzz(1, this.zzgar.intValue());
        }
        if (this.mimeType != null) {
            zzt += zzbur.zzg(2, this.mimeType);
        }
        return this.zzgbs != null ? zzt + zzbur.zzb(3, this.zzgbs) : zzt;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzg */
    public final zzbvs zza(zzbuq zzbuq) throws IOException {
        int zzakx;
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 8) {
                try {
                    zzakx = zzbuq.zzakx();
                    if (zzakx < 0 || zzakx > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(zzakx);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.zzgar = Integer.valueOf(zzakx);
                    }
                } catch (IllegalArgumentException unused) {
                    zzbuq.zzgc(zzbuq.getPosition());
                    zza(zzbuq, zzaku);
                }
            } else if (zzaku == 18) {
                this.mimeType = zzbuq.readString();
            } else if (zzaku == 26) {
                this.zzgbs = zzbuq.readBytes();
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(zzakx);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }
}
