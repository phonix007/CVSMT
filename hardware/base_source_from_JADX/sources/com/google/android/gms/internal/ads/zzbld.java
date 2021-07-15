package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbld extends zzbrd<zzbld, zza> implements zzbsn {
    private static volatile zzbsw<zzbld> zzcas;
    /* access modifiers changed from: private */
    public static final zzbld zzfeg = new zzbld();
    private zzblh zzfee;
    private zzbmr zzfef;

    private zzbld() {
    }

    public static final class zza extends zzbrd.zza<zzbld, zza> implements zzbsn {
        private zza() {
            super(zzbld.zzfeg);
        }

        /* synthetic */ zza(zzble zzble) {
            this();
        }
    }

    public final zzblh zzagb() {
        return this.zzfee == null ? zzblh.zzagj() : this.zzfee;
    }

    public final zzbmr zzagc() {
        return this.zzfef == null ? zzbmr.zzaia() : this.zzfef;
    }

    public static zzbld zzj(zzbpu zzbpu) throws zzbrl {
        return (zzbld) zzbrd.zza(zzfeg, zzbpu);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzble.zzcaq[i - 1]) {
            case 1:
                return new zzbld();
            case 2:
                return new zza((zzble) null);
            case 3:
                return zza((zzbsl) zzfeg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzfee", "zzfef"});
            case 4:
                return zzfeg;
            case 5:
                zzbsw<zzbld> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbld.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfeg);
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
        zzbrd.zza(zzbld.class, zzfeg);
    }
}
