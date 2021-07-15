package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzuw;
import java.io.IOException;

public final class zzvp extends zzbut<zzvp> {
    private Integer zzcho = null;
    public String zzchp = null;
    private Integer zzchq = null;
    private zzvc zzchr = null;
    private zzvq zzchs = null;
    public long[] zzcht = zzbvc.zzfwy;
    public zzvn zzchu = null;
    private zzvo zzchv = null;
    private zzuw.zzh zzchw = null;
    public zzvl zzchx = null;

    public zzvp() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.zzcho != null) {
            zzbur.zzv(9, this.zzcho.intValue());
        }
        if (this.zzchp != null) {
            zzbur.zzf(10, this.zzchp);
        }
        if (this.zzchq != null) {
            int intValue = this.zzchq.intValue();
            zzbur.zzu(11, 0);
            zzbur.zzge(intValue);
        }
        if (!(this.zzchr == null || this.zzchr == null)) {
            zzbur.zzv(12, this.zzchr.zzom());
        }
        if (this.zzchs != null) {
            zzbur.zza(13, (zzbuz) this.zzchs);
        }
        if (this.zzcht != null && this.zzcht.length > 0) {
            for (long zzj : this.zzcht) {
                zzbur.zzj(14, zzj);
            }
        }
        if (this.zzchu != null) {
            zzbur.zza(15, (zzbuz) this.zzchu);
        }
        if (this.zzchv != null) {
            zzbur.zza(16, (zzbuz) this.zzchv);
        }
        if (this.zzchw != null) {
            zzbur.zze(17, this.zzchw);
        }
        if (this.zzchx != null) {
            zzbur.zza(18, (zzbuz) this.zzchx);
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.zzcho != null) {
            zzt += zzbur.zzz(9, this.zzcho.intValue());
        }
        if (this.zzchp != null) {
            zzt += zzbur.zzg(10, this.zzchp);
        }
        if (this.zzchq != null) {
            zzt += zzbur.zzfd(11) + zzbur.zzfl(this.zzchq.intValue());
        }
        if (!(this.zzchr == null || this.zzchr == null)) {
            zzt += zzbur.zzz(12, this.zzchr.zzom());
        }
        if (this.zzchs != null) {
            zzt += zzbur.zzb(13, (zzbuz) this.zzchs);
        }
        if (this.zzcht != null && this.zzcht.length > 0) {
            int i = 0;
            for (long zzbl : this.zzcht) {
                i += zzbur.zzbl(zzbl);
            }
            zzt = zzt + i + (this.zzcht.length * 1);
        }
        if (this.zzchu != null) {
            zzt += zzbur.zzb(15, (zzbuz) this.zzchu);
        }
        if (this.zzchv != null) {
            zzt += zzbur.zzb(16, (zzbuz) this.zzchv);
        }
        if (this.zzchw != null) {
            zzt += zzbqk.zzc(17, (zzbsl) this.zzchw);
        }
        return this.zzchx != null ? zzt + zzbur.zzb(18, (zzbuz) this.zzchx) : zzt;
    }

    public final /* synthetic */ zzbuz zza(zzbuq zzbuq) throws IOException {
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 72:
                    this.zzcho = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 82:
                    this.zzchp = zzbuq.readString();
                    break;
                case 88:
                    this.zzchq = Integer.valueOf(zzbuq.zzalm());
                    break;
                case 96:
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
                    this.zzchr = zzvc.zzcd(zzalm);
                    break;
                case 106:
                    if (this.zzchs == null) {
                        this.zzchs = new zzvq();
                    }
                    zzbuq.zza((zzbuz) this.zzchs);
                    break;
                case 112:
                    int zzb = zzbvc.zzb(zzbuq, 112);
                    int length = this.zzcht == null ? 0 : this.zzcht.length;
                    long[] jArr = new long[(zzb + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzcht, 0, jArr, 0, length);
                    }
                    while (length < jArr.length - 1) {
                        jArr[length] = zzbuq.zzaln();
                        zzbuq.zzaku();
                        length++;
                    }
                    jArr[length] = zzbuq.zzaln();
                    this.zzcht = jArr;
                    break;
                case 114:
                    int zzer = zzbuq.zzer(zzbuq.zzalm());
                    int position2 = zzbuq.getPosition();
                    int i = 0;
                    while (zzbuq.zzapl() > 0) {
                        zzbuq.zzaln();
                        i++;
                    }
                    zzbuq.zzgc(position2);
                    int length2 = this.zzcht == null ? 0 : this.zzcht.length;
                    long[] jArr2 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.zzcht, 0, jArr2, 0, length2);
                    }
                    while (length2 < jArr2.length) {
                        jArr2[length2] = zzbuq.zzaln();
                        length2++;
                    }
                    this.zzcht = jArr2;
                    zzbuq.zzes(zzer);
                    break;
                case 122:
                    if (this.zzchu == null) {
                        this.zzchu = new zzvn();
                    }
                    zzbuq.zza((zzbuz) this.zzchu);
                    break;
                case 130:
                    if (this.zzchv == null) {
                        this.zzchv = new zzvo();
                    }
                    zzbuq.zza((zzbuz) this.zzchv);
                    break;
                case 138:
                    this.zzchw = (zzuw.zzh) zzbuq.zza(zzuw.zzh.zzon());
                    break;
                case 146:
                    if (this.zzchx == null) {
                        this.zzchx = new zzvl();
                    }
                    zzbuq.zza((zzbuz) this.zzchx);
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
