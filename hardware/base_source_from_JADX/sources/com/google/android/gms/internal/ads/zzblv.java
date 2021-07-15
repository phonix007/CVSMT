package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzblv extends zzbrd<zzblv, zza> implements zzbsn {
    private static volatile zzbsw<zzblv> zzcas;
    /* access modifiers changed from: private */
    public static final zzblv zzfeu = new zzblv();
    private int zzfea;
    private zzbpu zzfei = zzbpu.zzfli;

    private zzblv() {
    }

    public static final class zza extends zzbrd.zza<zzblv, zza> implements zzbsn {
        private zza() {
            super(zzblv.zzfeu);
        }

        public final zza zzdo(int i) {
            zzamw();
            ((zzblv) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzv(zzbpu zzbpu) {
            zzamw();
            ((zzblv) this.zzfpy).zzk(zzbpu);
            return this;
        }

        /* synthetic */ zza(zzblw zzblw) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzfea;
    }

    /* access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzfea = i;
    }

    public final zzbpu zzagf() {
        return this.zzfei;
    }

    /* access modifiers changed from: private */
    public final void zzk(zzbpu zzbpu) {
        if (zzbpu != null) {
            this.zzfei = zzbpu;
            return;
        }
        throw new NullPointerException();
    }

    public static zzblv zzu(zzbpu zzbpu) throws zzbrl {
        return (zzblv) zzbrd.zza(zzfeu, zzbpu);
    }

    public static zza zzagx() {
        return (zza) ((zzbrd.zza) zzfeu.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzblw.zzcaq[i - 1]) {
            case 1:
                return new zzblv();
            case 2:
                return new zza((zzblw) null);
            case 3:
                return zza((zzbsl) zzfeu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzfea", "zzfei"});
            case 4:
                return zzfeu;
            case 5:
                zzbsw<zzblv> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzblv.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfeu);
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
        zzbrd.zza(zzblv.class, zzfeu);
    }
}
