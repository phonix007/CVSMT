package com.google.android.gms.internal.ads;

import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.internal.ads.zzbrd;

public final class zzbno extends zzbrd<zzbno, zza> implements zzbsn {
    private static volatile zzbsw<zzbno> zzcas;
    /* access modifiers changed from: private */
    public static final zzbno zzfia = new zzbno();
    private String zzfhy = BuildConfig.FLAVOR;
    private zzbna zzfhz;

    private zzbno() {
    }

    public static final class zza extends zzbrd.zza<zzbno, zza> implements zzbsn {
        private zza() {
            super(zzbno.zzfia);
        }

        /* synthetic */ zza(zzbnp zzbnp) {
            this();
        }
    }

    public final String zzajr() {
        return this.zzfhy;
    }

    public final zzbna zzajs() {
        return this.zzfhz == null ? zzbna.zzaim() : this.zzfhz;
    }

    public static zzbno zzam(zzbpu zzbpu) throws zzbrl {
        return (zzbno) zzbrd.zza(zzfia, zzbpu);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbnp.zzcaq[i - 1]) {
            case 1:
                return new zzbno();
            case 2:
                return new zza((zzbnp) null);
            case 3:
                return zza((zzbsl) zzfia, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzfhy", "zzfhz"});
            case 4:
                return zzfia;
            case 5:
                zzbsw<zzbno> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbno.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfia);
                            zzcas = zzbsw;
                        }
                    }
                }
                return zzbsw;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzbno zzajt() {
        return zzfia;
    }

    static {
        zzbrd.zza(zzbno.class, zzfia);
    }
}
