package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbvd;
import java.io.IOException;

public final class zzbvn extends zzbut<zzbvn> {
    public String url = null;
    public Integer zzgar = null;
    private zzbvd.zza.zzc zzgas = null;
    public String zzgat = null;
    private String zzgau = null;
    public zzbvo zzgav = null;
    public zzbvt[] zzgaw = zzbvt.zzaqe();
    public String zzgax = null;
    public zzbvs zzgay = null;
    private Boolean zzgaz = null;
    private String[] zzgba = zzbvc.zzfxc;
    private String zzgbb = null;
    private Boolean zzgbc = null;
    private Boolean zzgbd = null;
    private byte[] zzgbe = null;
    public zzbvu zzgbf = null;
    public String[] zzgbg = zzbvc.zzfxc;
    public String[] zzgbh = zzbvc.zzfxc;

    public zzbvn() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        if (this.url != null) {
            zzbur.zzf(1, this.url);
        }
        if (this.zzgat != null) {
            zzbur.zzf(2, this.zzgat);
        }
        if (this.zzgau != null) {
            zzbur.zzf(3, this.zzgau);
        }
        if (this.zzgaw != null && this.zzgaw.length > 0) {
            for (zzbvt zzbvt : this.zzgaw) {
                if (zzbvt != null) {
                    zzbur.zza(4, (zzbuz) zzbvt);
                }
            }
        }
        if (this.zzgaz != null) {
            zzbur.zzj(5, this.zzgaz.booleanValue());
        }
        if (this.zzgba != null && this.zzgba.length > 0) {
            for (String str : this.zzgba) {
                if (str != null) {
                    zzbur.zzf(6, str);
                }
            }
        }
        if (this.zzgbb != null) {
            zzbur.zzf(7, this.zzgbb);
        }
        if (this.zzgbc != null) {
            zzbur.zzj(8, this.zzgbc.booleanValue());
        }
        if (this.zzgbd != null) {
            zzbur.zzj(9, this.zzgbd.booleanValue());
        }
        if (this.zzgar != null) {
            zzbur.zzv(10, this.zzgar.intValue());
        }
        if (!(this.zzgas == null || this.zzgas == null)) {
            zzbur.zzv(11, this.zzgas.zzom());
        }
        if (this.zzgav != null) {
            zzbur.zza(12, (zzbuz) this.zzgav);
        }
        if (this.zzgax != null) {
            zzbur.zzf(13, this.zzgax);
        }
        if (this.zzgay != null) {
            zzbur.zza(14, (zzbuz) this.zzgay);
        }
        if (this.zzgbe != null) {
            zzbur.zza(15, this.zzgbe);
        }
        if (this.zzgbf != null) {
            zzbur.zza(17, (zzbuz) this.zzgbf);
        }
        if (this.zzgbg != null && this.zzgbg.length > 0) {
            for (String str2 : this.zzgbg) {
                if (str2 != null) {
                    zzbur.zzf(20, str2);
                }
            }
        }
        if (this.zzgbh != null && this.zzgbh.length > 0) {
            for (String str3 : this.zzgbh) {
                if (str3 != null) {
                    zzbur.zzf(21, str3);
                }
            }
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt();
        if (this.url != null) {
            zzt += zzbur.zzg(1, this.url);
        }
        if (this.zzgat != null) {
            zzt += zzbur.zzg(2, this.zzgat);
        }
        if (this.zzgau != null) {
            zzt += zzbur.zzg(3, this.zzgau);
        }
        if (this.zzgaw != null && this.zzgaw.length > 0) {
            int i = zzt;
            for (zzbvt zzbvt : this.zzgaw) {
                if (zzbvt != null) {
                    i += zzbur.zzb(4, (zzbuz) zzbvt);
                }
            }
            zzt = i;
        }
        if (this.zzgaz != null) {
            this.zzgaz.booleanValue();
            zzt += zzbur.zzfd(5) + 1;
        }
        if (this.zzgba != null && this.zzgba.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.zzgba) {
                if (str != null) {
                    i3++;
                    i2 += zzbur.zzfy(str);
                }
            }
            zzt = zzt + i2 + (i3 * 1);
        }
        if (this.zzgbb != null) {
            zzt += zzbur.zzg(7, this.zzgbb);
        }
        if (this.zzgbc != null) {
            this.zzgbc.booleanValue();
            zzt += zzbur.zzfd(8) + 1;
        }
        if (this.zzgbd != null) {
            this.zzgbd.booleanValue();
            zzt += zzbur.zzfd(9) + 1;
        }
        if (this.zzgar != null) {
            zzt += zzbur.zzz(10, this.zzgar.intValue());
        }
        if (!(this.zzgas == null || this.zzgas == null)) {
            zzt += zzbur.zzz(11, this.zzgas.zzom());
        }
        if (this.zzgav != null) {
            zzt += zzbur.zzb(12, (zzbuz) this.zzgav);
        }
        if (this.zzgax != null) {
            zzt += zzbur.zzg(13, this.zzgax);
        }
        if (this.zzgay != null) {
            zzt += zzbur.zzb(14, (zzbuz) this.zzgay);
        }
        if (this.zzgbe != null) {
            zzt += zzbur.zzb(15, this.zzgbe);
        }
        if (this.zzgbf != null) {
            zzt += zzbur.zzb(17, (zzbuz) this.zzgbf);
        }
        if (this.zzgbg != null && this.zzgbg.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.zzgbg) {
                if (str2 != null) {
                    i5++;
                    i4 += zzbur.zzfy(str2);
                }
            }
            zzt = zzt + i4 + (i5 * 2);
        }
        if (this.zzgbh == null || this.zzgbh.length <= 0) {
            return zzt;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.zzgbh) {
            if (str3 != null) {
                i7++;
                i6 += zzbur.zzfy(str3);
            }
        }
        return zzt + i6 + (i7 * 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzf */
    public final zzbvn zza(zzbuq zzbuq) throws IOException {
        int zzakx;
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 10:
                    this.url = zzbuq.readString();
                    break;
                case 18:
                    this.zzgat = zzbuq.readString();
                    break;
                case 26:
                    this.zzgau = zzbuq.readString();
                    break;
                case 34:
                    int zzb = zzbvc.zzb(zzbuq, 34);
                    int length = this.zzgaw == null ? 0 : this.zzgaw.length;
                    zzbvt[] zzbvtArr = new zzbvt[(zzb + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzgaw, 0, zzbvtArr, 0, length);
                    }
                    while (length < zzbvtArr.length - 1) {
                        zzbvtArr[length] = new zzbvt();
                        zzbuq.zza((zzbuz) zzbvtArr[length]);
                        zzbuq.zzaku();
                        length++;
                    }
                    zzbvtArr[length] = new zzbvt();
                    zzbuq.zza((zzbuz) zzbvtArr[length]);
                    this.zzgaw = zzbvtArr;
                    break;
                case 40:
                    this.zzgaz = Boolean.valueOf(zzbuq.zzala());
                    break;
                case 50:
                    int zzb2 = zzbvc.zzb(zzbuq, 50);
                    int length2 = this.zzgba == null ? 0 : this.zzgba.length;
                    String[] strArr = new String[(zzb2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.zzgba, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = zzbuq.readString();
                        zzbuq.zzaku();
                        length2++;
                    }
                    strArr[length2] = zzbuq.readString();
                    this.zzgba = strArr;
                    break;
                case 58:
                    this.zzgbb = zzbuq.readString();
                    break;
                case 64:
                    this.zzgbc = Boolean.valueOf(zzbuq.zzala());
                    break;
                case 72:
                    this.zzgbd = Boolean.valueOf(zzbuq.zzala());
                    break;
                case 80:
                    try {
                        zzakx = zzbuq.zzakx();
                        if (zzakx >= 0 && zzakx <= 9) {
                            this.zzgar = Integer.valueOf(zzakx);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append(zzakx);
                            sb.append(" is not a valid enum ReportType");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        zzbuq.zzgc(zzbuq.getPosition());
                        zza(zzbuq, zzaku);
                        break;
                    }
                case 88:
                    int position = zzbuq.getPosition();
                    int zzakx2 = zzbuq.zzakx();
                    switch (zzakx2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.zzgas = zzbvd.zza.zzc.zzgi(zzakx2);
                            break;
                        default:
                            zzbuq.zzgc(position);
                            zza(zzbuq, zzaku);
                            break;
                    }
                case 98:
                    if (this.zzgav == null) {
                        this.zzgav = new zzbvo();
                    }
                    zzbuq.zza((zzbuz) this.zzgav);
                    break;
                case 106:
                    this.zzgax = zzbuq.readString();
                    break;
                case 114:
                    if (this.zzgay == null) {
                        this.zzgay = new zzbvs();
                    }
                    zzbuq.zza((zzbuz) this.zzgay);
                    break;
                case 122:
                    this.zzgbe = zzbuq.readBytes();
                    break;
                case 138:
                    if (this.zzgbf == null) {
                        this.zzgbf = new zzbvu();
                    }
                    zzbuq.zza((zzbuz) this.zzgbf);
                    break;
                case 162:
                    int zzb3 = zzbvc.zzb(zzbuq, 162);
                    int length3 = this.zzgbg == null ? 0 : this.zzgbg.length;
                    String[] strArr2 = new String[(zzb3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.zzgbg, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = zzbuq.readString();
                        zzbuq.zzaku();
                        length3++;
                    }
                    strArr2[length3] = zzbuq.readString();
                    this.zzgbg = strArr2;
                    break;
                case 170:
                    int zzb4 = zzbvc.zzb(zzbuq, 170);
                    int length4 = this.zzgbh == null ? 0 : this.zzgbh.length;
                    String[] strArr3 = new String[(zzb4 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.zzgbh, 0, strArr3, 0, length4);
                    }
                    while (length4 < strArr3.length - 1) {
                        strArr3[length4] = zzbuq.readString();
                        zzbuq.zzaku();
                        length4++;
                    }
                    strArr3[length4] = zzbuq.readString();
                    this.zzgbh = strArr3;
                    break;
                default:
                    if (super.zza(zzbuq, zzaku)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append(zzakx);
        sb2.append(" is not a valid enum ReportType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
