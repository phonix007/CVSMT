package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzvq extends zzbut<zzvq> {
    public Integer zzchy = null;
    public Integer zzchz = null;
    public Integer zzcia = null;

    public zzvq() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzchy != null) {
            zzbur.zzv(1, this.zzchy.intValue());
        }
        if (this.zzchz != null) {
            zzbur.zzv(2, this.zzchz.intValue());
        }
        if (this.zzcia != null) {
            zzbur.zzv(3, this.zzcia.intValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzchy != null) {
            zzt += zzbur.zzz(1, this.zzchy.intValue());
        }
        if (this.zzchz != null) {
            zzt += zzbur.zzz(2, this.zzchz.intValue());
        }
        return this.zzcia != null ? zzt + zzbur.zzz(3, this.zzcia.intValue()) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 8) {
                this.zzchy = Integer.valueOf(zzbuq.zzalm());
            } else if (zzaku == 16) {
                this.zzchz = Integer.valueOf(zzbuq.zzalm());
            } else if (zzaku == 24) {
                this.zzcia = Integer.valueOf(zzbuq.zzalm());
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
