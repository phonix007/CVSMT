package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbln extends zzbrd<zzbln, zza> implements zzbsn {
    private static volatile zzbsw<zzbln> zzcas;
    /* access modifiers changed from: private */
    public static final zzbln zzfeq = new zzbln();
    private int zzfek;
    private zzblp zzfeo;

    private zzbln() {
    }

    public static final class zza extends zzbrd.zza<zzbln, zza> implements zzbsn {
        private zza() {
            super(zzbln.zzfeq);
        }

        /* synthetic */ zza(zzblo zzblo) {
            this();
        }
    }

    public final zzblp zzago() {
        return this.zzfeo == null ? zzblp.zzags() : this.zzfeo;
    }

    public final int getKeySize() {
        return this.zzfek;
    }

    public static zzbln zzq(zzbpu zzbpu) throws zzbrl {
        return (zzbln) zzbrd.zza(zzfeq, zzbpu);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzblo.zzcaq[i - 1]) {
            case 1:
                return new zzbln();
            case 2:
                return new zza((zzblo) null);
            case 3:
                return zza((zzbsl) zzfeq, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzfeo", "zzfek"});
            case 4:
                return zzfeq;
            case 5:
                zzbsw<zzbln> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbln.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfeq);
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
        zzbrd.zza(zzbln.class, zzfeq);
    }
}
