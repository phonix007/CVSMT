package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbs extends zzbut<zzbs> {
    public Integer zzfy;
    private Integer zzfz;
    public byte[] zzhm = null;
    public byte[][] zzhr = zzbvc.zzfxd;

    public zzbs() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzhr != null && this.zzhr.length > 0) {
            for (byte[] bArr : this.zzhr) {
                if (bArr != null) {
                    zzbur.zza(1, bArr);
                }
            }
        }
        if (this.zzhm != null) {
            zzbur.zza(2, this.zzhm);
        }
        if (this.zzfz != null) {
            zzbur.zzv(3, this.zzfz.intValue());
        }
        if (this.zzfy != null) {
            zzbur.zzv(4, this.zzfy.intValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzhr != null && this.zzhr.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.zzhr) {
                if (bArr != null) {
                    i2++;
                    i += zzbur.zzy(bArr);
                }
            }
            zzt = zzt + i + (i2 * 1);
        }
        if (this.zzhm != null) {
            zzt += zzbur.zzb(2, this.zzhm);
        }
        if (this.zzfz != null) {
            zzt += zzbur.zzz(3, this.zzfz.intValue());
        }
        return this.zzfy != null ? zzt + zzbur.zzz(4, this.zzfy.intValue()) : zzt;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzbs zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                int zzb = zzbvc.zzb(zzbuq, 10);
                int length = this.zzhr == null ? 0 : this.zzhr.length;
                byte[][] bArr = new byte[(zzb + length)][];
                if (length != 0) {
                    System.arraycopy(this.zzhr, 0, bArr, 0, length);
                }
                while (length < bArr.length - 1) {
                    bArr[length] = zzbuq.readBytes();
                    zzbuq.zzaku();
                    length++;
                }
                bArr[length] = zzbuq.readBytes();
                this.zzhr = bArr;
            } else if (zzaku == 18) {
                this.zzhm = zzbuq.readBytes();
            } else if (zzaku == 24) {
                int position = zzbuq.getPosition();
                try {
                    this.zzfz = Integer.valueOf(zzbk.zze(zzbuq.zzalm()));
                } catch (IllegalArgumentException unused) {
                    zzbuq.zzgc(position);
                    zza(zzbuq, zzaku);
                }
            } else if (zzaku == 32) {
                int position2 = zzbuq.getPosition();
                try {
                    this.zzfy = Integer.valueOf(zzbk.zzf(zzbuq.zzalm()));
                } catch (IllegalArgumentException unused2) {
                    zzbuq.zzgc(position2);
                    zza(zzbuq, zzaku);
                }
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
