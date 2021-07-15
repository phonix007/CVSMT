package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvs extends zzbut<zzvs> {
    private zzvq zzcis = null;
    private zzvc zzcit = null;
    private zzuw.zzq zzciu = null;
    private zzuw.zzn zzciv = null;

    public zzvs() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzcis != null) {
            zzbur.zza(1, (zzbuz) this.zzcis);
        }
        if (!(this.zzcit == null || this.zzcit == null)) {
            zzbur.zzv(2, this.zzcit.zzom());
        }
        if (this.zzciu != null) {
            zzbur.zze(3, this.zzciu);
        }
        if (this.zzciv != null) {
            zzbur.zze(4, this.zzciv);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzcis != null) {
            zzt += zzbur.zzb(1, (zzbuz) this.zzcis);
        }
        if (!(this.zzcit == null || this.zzcit == null)) {
            zzt += zzbur.zzz(2, this.zzcit.zzom());
        }
        if (this.zzciu != null) {
            zzt += zzbqk.zzc(3, (zzbsl) this.zzciu);
        }
        return this.zzciv != null ? zzt + zzbqk.zzc(4, (zzbsl) this.zzciv) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            if (zzaku == 0) {
                return this;
            }
            if (zzaku == 10) {
                if (this.zzcis == null) {
                    this.zzcis = new zzvq();
                }
                zzbuq.zza((zzbuz) this.zzcis);
            } else if (zzaku == 16) {
                int position = zzbuq.getPosition();
                int zzalm = zzbuq.zzalm();
                if (zzalm != 1000) {
                    switch (zzalm) {
                        case 0:
                        case 1:
                            break;
                        default:
                            zzbuq.zzgc(position);
                            zza(zzbuq, zzaku);
                            continue;
                    }
                }
                this.zzcit = zzvc.zzcd(zzalm);
            } else if (zzaku == 26) {
                this.zzciu = (zzuw.zzq) zzbuq.zza(zzuw.zzq.zzon());
            } else if (zzaku == 34) {
                this.zzciv = (zzuw.zzn) zzbuq.zza(zzuw.zzn.zzon());
            } else if (!super.zza(zzbuq, zzaku)) {
                return this;
            }
        }
    }
}
