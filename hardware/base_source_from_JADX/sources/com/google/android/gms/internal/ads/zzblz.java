package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzblz extends zzbrd<zzblz, zza> implements zzbsn {
    private static volatile zzbsw<zzblz> zzcas;
    /* access modifiers changed from: private */
    public static final zzblz zzffc = new zzblz();
    private zzbna zzffb;

    private zzblz() {
    }

    public static final class zza extends zzbrd.zza<zzblz, zza> implements zzbsn {
        private zza() {
            super(zzblz.zzffc);
        }

        /* synthetic */ zza(zzbma zzbma) {
            this();
        }
    }

    public final zzbna zzagz() {
        return this.zzffb == null ? zzbna.zzaim() : this.zzffb;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbma.zzcaq[i - 1]) {
            case 1:
                return new zzblz();
            case 2:
                return new zza((zzbma) null);
            case 3:
                return zza((zzbsl) zzffc, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzffb"});
            case 4:
                return zzffc;
            case 5:
                zzbsw<zzblz> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzblz.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzffc);
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

    public static zzblz zzaha() {
        return zzffc;
    }

    static {
        zzbrd.zza(zzblz.class, zzffc);
    }
}
