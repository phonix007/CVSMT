package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvr extends zzbut<zzvr> {
    private static volatile zzvr[] zzcib;
    private zzuw.zzr zzcic = null;
    private zzuw.zzt zzcid = null;
    private zzuw.zzu zzcie = null;
    private zzuw.zzv zzcif = null;
    private zzuw.zzp zzcig = null;
    private zzuw.zzs zzcih = null;
    private zzvs zzcii = null;
    private Integer zzcij = null;
    private Integer zzcik = null;
    private zzuw.zzn zzcil = null;
    private Integer zzcim = null;
    private Integer zzcin = null;
    private Integer zzcio = null;
    private Integer zzcip = null;
    private Integer zzciq = null;
    private Long zzcir = null;

    public static zzvr[] zzpl() {
        if (zzcib == null) {
            synchronized (zzbux.zzfws) {
                if (zzcib == null) {
                    zzcib = new zzvr[0];
                }
            }
        }
        return zzcib;
    }

    public zzvr() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzcic != null) {
            zzbur.zze(5, this.zzcic);
        }
        if (this.zzcid != null) {
            zzbur.zze(6, this.zzcid);
        }
        if (this.zzcie != null) {
            zzbur.zze(7, this.zzcie);
        }
        if (this.zzcif != null) {
            zzbur.zze(8, this.zzcif);
        }
        if (this.zzcig != null) {
            zzbur.zze(9, this.zzcig);
        }
        if (this.zzcih != null) {
            zzbur.zze(10, this.zzcih);
        }
        if (this.zzcii != null) {
            zzbur.zza(11, (zzbuz) this.zzcii);
        }
        if (this.zzcij != null) {
            zzbur.zzv(12, this.zzcij.intValue());
        }
        if (this.zzcik != null) {
            zzbur.zzv(13, this.zzcik.intValue());
        }
        if (this.zzcil != null) {
            zzbur.zze(14, this.zzcil);
        }
        if (this.zzcim != null) {
            zzbur.zzv(15, this.zzcim.intValue());
        }
        if (this.zzcin != null) {
            zzbur.zzv(16, this.zzcin.intValue());
        }
        if (this.zzcio != null) {
            zzbur.zzv(17, this.zzcio.intValue());
        }
        if (this.zzcip != null) {
            zzbur.zzv(18, this.zzcip.intValue());
        }
        if (this.zzciq != null) {
            zzbur.zzv(19, this.zzciq.intValue());
        }
        if (this.zzcir != null) {
            zzbur.zzj(20, this.zzcir.longValue());
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzcic != null) {
            zzt += zzbqk.zzc(5, (zzbsl) this.zzcic);
        }
        if (this.zzcid != null) {
            zzt += zzbqk.zzc(6, (zzbsl) this.zzcid);
        }
        if (this.zzcie != null) {
            zzt += zzbqk.zzc(7, (zzbsl) this.zzcie);
        }
        if (this.zzcif != null) {
            zzt += zzbqk.zzc(8, (zzbsl) this.zzcif);
        }
        if (this.zzcig != null) {
            zzt += zzbqk.zzc(9, (zzbsl) this.zzcig);
        }
        if (this.zzcih != null) {
            zzt += zzbqk.zzc(10, (zzbsl) this.zzcih);
        }
        if (this.zzcii != null) {
            zzt += zzbur.zzb(11, (zzbuz) this.zzcii);
        }
        if (this.zzcij != null) {
            zzt += zzbur.zzz(12, this.zzcij.intValue());
        }
        if (this.zzcik != null) {
            zzt += zzbur.zzz(13, this.zzcik.intValue());
        }
        if (this.zzcil != null) {
            zzt += zzbqk.zzc(14, (zzbsl) this.zzcil);
        }
        if (this.zzcim != null) {
            zzt += zzbur.zzz(15, this.zzcim.intValue());
        }
        if (this.zzcin != null) {
            zzt += zzbur.zzz(16, this.zzcin.intValue());
        }
        if (this.zzcio != null) {
            zzt += zzbur.zzz(17, this.zzcio.intValue());
        }
        if (this.zzcip != null) {
            zzt += zzbur.zzz(18, this.zzcip.intValue());
        }
        if (this.zzciq != null) {
            zzt += zzbur.zzz(19, this.zzciq.intValue());
        }
        return this.zzcir != null ? zzt + zzbur.zzn(20, this.zzcir.longValue()) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 42:
                    this.zzcic = (zzuw.zzr) zzbuq.zza(zzuw.zzr.zzon());
                    break;
                case 50:
                    this.zzcid = (zzuw.zzt) zzbuq.zza(zzuw.zzt.zzon());
                    break;
                case 58:
                    this.zzcie = (zzuw.zzu) zzbuq.zza(zzuw.zzu.zzon());
                    break;
                case 66:
                    this.zzcif = (zzuw.zzv) zzbuq.zza(zzuw.zzv.zzon());
                    break;
                case 74:
                    this.zzcig = (zzuw.zzp) zzbuq.zza(zzuw.zzp.zzon());
                    break;
                case 82:
                    this.zzcih = (zzuw.zzs) zzbuq.zza(zzuw.zzs.zzon());
                    break;
                case 90:
                    if (this.zzcii == null) {
                        this.zzcii = new zzvs();
                    }
                    zzbuq.zza((zzbuz) this.zzcii);
                    break;
                case 96:
                    this.zzcij = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 104:
                    this.zzcik = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 114:
                    this.zzcil = (zzuw.zzn) zzbuq.zza(zzuw.zzn.zzon());
                    break;
                case 120:
                    this.zzcim = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 128:
                    this.zzcin = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 136:
                    this.zzcio = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 144:
                    this.zzcip = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 152:
                    this.zzciq = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 160:
                    this.zzcir = Long.valueOf(zzbuq.zzaln());
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
