package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzblj extends zzbrd<zzblj, zza> implements zzbsn {
    private static volatile zzbsw<zzblj> zzcas;
    /* access modifiers changed from: private */
    public static final zzblj zzfen = new zzblj();
    private int zzfem;

    private zzblj() {
    }

    public static final class zza extends zzbrd.zza<zzblj, zza> implements zzbsn {
        private zza() {
            super(zzblj.zzfen);
        }

        /* synthetic */ zza(zzblk zzblk) {
            this();
        }
    }

    public final int zzagl() {
        return this.zzfem;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzblk.zzcaq[i - 1]) {
            case 1:
                return new zzblj();
            case 2:
                return new zza((zzblk) null);
            case 3:
                return zza((zzbsl) zzfen, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzfem"});
            case 4:
                return zzfen;
            case 5:
                zzbsw<zzblj> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzblj.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfen);
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

    public static zzblj zzagm() {
        return zzfen;
    }

    static {
        zzbrd.zza(zzblj.class, zzfen);
    }
}
