package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbn extends zzbut<zzbn> {
    private Long zzfk = null;
    private Long zzfl = null;
    public Long zzhe = null;
    public Long zzhf = null;
    public Long zzhg = null;

    public zzbn() {
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzfk != null) {
            zzbur.zzr(1, this.zzfk.longValue());
        }
        if (this.zzfl != null) {
            zzbur.zzr(2, this.zzfl.longValue());
        }
        if (this.zzhe != null) {
            zzbur.zzr(3, this.zzhe.longValue());
        }
        if (this.zzhf != null) {
            zzbur.zzr(4, this.zzhf.longValue());
        }
        if (this.zzhg != null) {
            zzbur.zzr(5, this.zzhg.longValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzfk != null) {
            zzt += zzbur.zzm(1, this.zzfk.longValue());
        }
        if (this.zzfl != null) {
            zzt += zzbur.zzm(2, this.zzfl.longValue());
        }
        if (this.zzhe != null) {
            zzt += zzbur.zzm(3, this.zzhe.longValue());
        }
        if (this.zzhf != null) {
            zzt += zzbur.zzm(4, this.zzhf.longValue());
        }
        return this.zzhg != null ? zzt + zzbur.zzm(5, this.zzhg.longValue()) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 8) {
                this.zzfk = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 16) {
                this.zzfl = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 24) {
                this.zzhe = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 32) {
                this.zzhf = Long.valueOf(zzbuq.zzaln());
            } else if (zzaku == 40) {
                this.zzhg = Long.valueOf(zzbuq.zzaln());
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
