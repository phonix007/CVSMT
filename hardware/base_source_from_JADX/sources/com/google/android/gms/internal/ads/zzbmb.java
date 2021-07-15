package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbmb extends zzbrd<zzbmb, zza> implements zzbsn {
    private static volatile zzbsw<zzbmb> zzcas;
    /* access modifiers changed from: private */
    public static final zzbmb zzffe = new zzbmb();
    private zzbmd zzffd;

    private zzbmb() {
    }

    public static final class zza extends zzbrd.zza<zzbmb, zza> implements zzbsn {
        private zza() {
            super(zzbmb.zzffe);
        }

        /* synthetic */ zza(zzbmc zzbmc) {
            this();
        }
    }

    public final zzbmd zzahc() {
        return this.zzffd == null ? zzbmd.zzahh() : this.zzffd;
    }

    public static zzbmb zzw(zzbpu zzbpu) throws zzbrl {
        return (zzbmb) zzbrd.zza(zzffe, zzbpu);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbmc.zzcaq[i - 1]) {
            case 1:
                return new zzbmb();
            case 2:
                return new zza((zzbmc) null);
            case 3:
                return zza((zzbsl) zzffe, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzffd"});
            case 4:
                return zzffe;
            case 5:
                zzbsw<zzbmb> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbmb.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzffe);
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
        zzbrd.zza(zzbmb.class, zzffe);
    }
}
