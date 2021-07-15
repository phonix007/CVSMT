package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbo extends zzbut<zzbo> {
    private Long zzhh = null;
    private Integer zzhi = null;
    private Boolean zzhj = null;
    private int[] zzhk = zzbvc.zzfsg;
    private Long zzhl = null;

    public zzbo() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzhh != null) {
            zzbur.zzr(1, this.zzhh.longValue());
        }
        if (this.zzhi != null) {
            zzbur.zzv(2, this.zzhi.intValue());
        }
        if (this.zzhj != null) {
            zzbur.zzj(3, this.zzhj.booleanValue());
        }
        if (this.zzhk != null && this.zzhk.length > 0) {
            for (int zzv : this.zzhk) {
                zzbur.zzv(4, zzv);
            }
        }
        if (this.zzhl != null) {
            zzbur.zzj(5, this.zzhl.longValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzhh != null) {
            zzt += zzbur.zzm(1, this.zzhh.longValue());
        }
        if (this.zzhi != null) {
            zzt += zzbur.zzz(2, this.zzhi.intValue());
        }
        if (this.zzhj != null) {
            this.zzhj.booleanValue();
            zzt += zzbur.zzfd(3) + 1;
        }
        if (this.zzhk != null && this.zzhk.length > 0) {
            int i = 0;
            for (int zzfe : this.zzhk) {
                i += zzbur.zzfe(zzfe);
            }
            zzt = zzt + i + (this.zzhk.length * 1);
        }
        return this.zzhl != null ? zzt + zzbur.zzn(5, this.zzhl.longValue()) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 8) {
                this.zzhh = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 16) {
                this.zzhi = Integer.valueOf(zzbuq.zzalm());
            } else if (zzaku == 24) {
                this.zzhj = Boolean.valueOf(zzbuq.zzala());
            } else if (zzaku == 32) {
                int zzb = zzbvc.zzb(zzbuq, 32);
                int length = this.zzhk == null ? 0 : this.zzhk.length;
                int[] iArr = new int[(zzb + length)];
                if (length != 0) {
                    System.arraycopy(this.zzhk, 0, iArr, 0, length);
                }
                while (length < iArr.length - 1) {
                    iArr[length] = zzbuq.zzalm();
                    zzbuq.zzaku();
                    length++;
                }
                iArr[length] = zzbuq.zzalm();
                this.zzhk = iArr;
            } else if (zzaku == 34) {
                int zzer = zzbuq.zzer(zzbuq.zzalm());
                int position = zzbuq.getPosition();
                int i = 0;
                while (zzbuq.zzapl() > 0) {
                    zzbuq.zzalm();
                    i++;
                }
                zzbuq.zzgc(position);
                int length2 = this.zzhk == null ? 0 : this.zzhk.length;
                int[] iArr2 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.zzhk, 0, iArr2, 0, length2);
                }
                while (length2 < iArr2.length) {
                    iArr2[length2] = zzbuq.zzalm();
                    length2++;
                }
                this.zzhk = iArr2;
                zzbuq.zzes(zzer);
            } else if (zzaku == 40) {
                this.zzhl = Long.valueOf(zzbuq.zzaln());
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
