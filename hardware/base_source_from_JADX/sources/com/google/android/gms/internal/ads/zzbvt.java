package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzbvt extends zzbut<zzbvt> {
    private static volatile zzbvt[] zzgbt;
    public String url = null;
    public Integer zzgbu = null;
    public zzbvq zzgbv = null;
    private zzbvr zzgbw = null;
    private Integer zzgbx = null;
    private int[] zzgby = zzbvc.zzfsg;
    private String zzgbz = null;
    public Integer zzgca = null;
    public String[] zzgcb = zzbvc.zzfxc;

    public static zzbvt[] zzaqe() {
        if (zzgbt == null) {
            synchronized (zzbux.zzfws) {
                if (zzgbt == null) {
                    zzgbt = new zzbvt[0];
                }
            }
        }
        return zzgbt;
    }

    public zzbvt() {
        this.zzfwk = null;
        this.zzfwt = -1;
    }

    public final void zza(zzbur zzbur) throws IOException {
        zzbur.zzv(1, this.zzgbu.intValue());
        if (this.url != null) {
            zzbur.zzf(2, this.url);
        }
        if (this.zzgbv != null) {
            zzbur.zza(3, (zzbuz) this.zzgbv);
        }
        if (this.zzgbw != null) {
            zzbur.zza(4, (zzbuz) this.zzgbw);
        }
        if (this.zzgbx != null) {
            zzbur.zzv(5, this.zzgbx.intValue());
        }
        if (this.zzgby != null && this.zzgby.length > 0) {
            for (int zzv : this.zzgby) {
                zzbur.zzv(6, zzv);
            }
        }
        if (this.zzgbz != null) {
            zzbur.zzf(7, this.zzgbz);
        }
        if (this.zzgca != null) {
            zzbur.zzv(8, this.zzgca.intValue());
        }
        if (this.zzgcb != null && this.zzgcb.length > 0) {
            for (String str : this.zzgcb) {
                if (str != null) {
                    zzbur.zzf(9, str);
                }
            }
        }
        super.zza(zzbur);
    }

    /* access modifiers changed from: protected */
    public final int zzt() {
        int zzt = super.zzt() + zzbur.zzz(1, this.zzgbu.intValue());
        if (this.url != null) {
            zzt += zzbur.zzg(2, this.url);
        }
        if (this.zzgbv != null) {
            zzt += zzbur.zzb(3, (zzbuz) this.zzgbv);
        }
        if (this.zzgbw != null) {
            zzt += zzbur.zzb(4, (zzbuz) this.zzgbw);
        }
        if (this.zzgbx != null) {
            zzt += zzbur.zzz(5, this.zzgbx.intValue());
        }
        if (this.zzgby != null && this.zzgby.length > 0) {
            int i = 0;
            for (int zzfe : this.zzgby) {
                i += zzbur.zzfe(zzfe);
            }
            zzt = zzt + i + (this.zzgby.length * 1);
        }
        if (this.zzgbz != null) {
            zzt += zzbur.zzg(7, this.zzgbz);
        }
        if (this.zzgca != null) {
            zzt += zzbur.zzz(8, this.zzgca.intValue());
        }
        if (this.zzgcb == null || this.zzgcb.length <= 0) {
            return zzt;
        }
        int i2 = 0;
        int i3 = 0;
        for (String str : this.zzgcb) {
            if (str != null) {
                i3++;
                i2 += zzbur.zzfy(str);
            }
        }
        return zzt + i2 + (i3 * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzh */
    public final zzbvt zza(zzbuq zzbuq) throws IOException {
        int zzakx;
        while (true) {
            int zzaku = zzbuq.zzaku();
            switch (zzaku) {
                case 0:
                    return this;
                case 8:
                    this.zzgbu = Integer.valueOf(zzbuq.zzakx());
                    break;
                case 18:
                    this.url = zzbuq.readString();
                    break;
                case 26:
                    if (this.zzgbv == null) {
                        this.zzgbv = new zzbvq();
                    }
                    zzbuq.zza((zzbuz) this.zzgbv);
                    break;
                case 34:
                    if (this.zzgbw == null) {
                        this.zzgbw = new zzbvr();
                    }
                    zzbuq.zza((zzbuz) this.zzgbw);
                    break;
                case 40:
                    this.zzgbx = Integer.valueOf(zzbuq.zzakx());
                    break;
                case 48:
                    int zzb = zzbvc.zzb(zzbuq, 48);
                    int length = this.zzgby == null ? 0 : this.zzgby.length;
                    int[] iArr = new int[(zzb + length)];
                    if (length != 0) {
                        System.arraycopy(this.zzgby, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = zzbuq.zzakx();
                        zzbuq.zzaku();
                        length++;
                    }
                    iArr[length] = zzbuq.zzakx();
                    this.zzgby = iArr;
                    break;
                case 50:
                    int zzer = zzbuq.zzer(zzbuq.zzalm());
                    int position = zzbuq.getPosition();
                    int i = 0;
                    while (zzbuq.zzapl() > 0) {
                        zzbuq.zzakx();
                        i++;
                    }
                    zzbuq.zzgc(position);
                    int length2 = this.zzgby == null ? 0 : this.zzgby.length;
                    int[] iArr2 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.zzgby, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = zzbuq.zzakx();
                        length2++;
                    }
                    this.zzgby = iArr2;
                    zzbuq.zzes(zzer);
                    break;
                case 58:
                    this.zzgbz = zzbuq.readString();
                    break;
                case 64:
                    try {
                        zzakx = zzbuq.zzakx();
                        if (zzakx >= 0 && zzakx <= 3) {
                            this.zzgca = Integer.valueOf(zzakx);
                            break;
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(zzakx);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        zzbuq.zzgc(zzbuq.getPosition());
                        zza(zzbuq, zzaku);
                        break;
                    }
                case 74:
                    int zzb2 = zzbvc.zzb(zzbuq, 74);
                    int length3 = this.zzgcb == null ? 0 : this.zzgcb.length;
                    String[] strArr = new String[(zzb2 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.zzgcb, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = zzbuq.readString();
                        zzbuq.zzaku();
                        length3++;
                    }
                    strArr[length3] = zzbuq.readString();
                    this.zzgcb = strArr;
                    break;
                default:
                    if (super.zza(zzbuq, zzaku)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(zzakx);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
