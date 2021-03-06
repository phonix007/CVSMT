package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzblt extends zzbrd<zzblt, zza> implements zzbsn {
    private static volatile zzbsw<zzblt> zzcas;
    /* access modifiers changed from: private */
    public static final zzblt zzfet = new zzblt();
    private int zzfek;

    private zzblt() {
    }

    public static final class zza extends zzbrd.zza<zzblt, zza> implements zzbsn {
        private zza() {
            super(zzblt.zzfet);
        }

        /* synthetic */ zza(zzblu zzblu) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzfek;
    }

    public static zzblt zzt(zzbpu zzbpu) throws zzbrl {
        return (zzblt) zzbrd.zza(zzfet, zzbpu);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzblu.zzcaq[i - 1]) {
            case 1:
                return new zzblt();
            case 2:
                return new zza((zzblu) null);
            case 3:
                return zza((zzbsl) zzfet, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzfek"});
            case 4:
                return zzfet;
            case 5:
                zzbsw<zzblt> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzblt.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfet);
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

    static {
        zzbrd.zza(zzblt.class, zzfet);
    }
}
