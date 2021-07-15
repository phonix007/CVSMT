package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbmh extends zzbrd<zzbmh, zza> implements zzbsn {
    private static volatile zzbsw<zzbmh> zzcas;
    /* access modifiers changed from: private */
    public static final zzbmh zzffn = new zzbmh();
    private int zzfea;
    private zzbmd zzffd;
    private zzbpu zzffl = zzbpu.zzfli;
    private zzbpu zzffm = zzbpu.zzfli;

    private zzbmh() {
    }

    public static final class zza extends zzbrd.zza<zzbmh, zza> implements zzbsn {
        private zza() {
            super(zzbmh.zzffn);
        }

        public final zza zzdr(int i) {
            zzamw();
            ((zzbmh) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzc(zzbmd zzbmd) {
            zzamw();
            ((zzbmh) this.zzfpy).zzb(zzbmd);
            return this;
        }

        public final zza zzac(zzbpu zzbpu) {
            zzamw();
            ((zzbmh) this.zzfpy).zzz(zzbpu);
            return this;
        }

        public final zza zzad(zzbpu zzbpu) {
            zzamw();
            ((zzbmh) this.zzfpy).zzaa(zzbpu);
            return this;
        }

        /* synthetic */ zza(zzbmi zzbmi) {
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

    public final zzbmd zzahc() {
        return this.zzffd == null ? zzbmd.zzahh() : this.zzffd;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzbmd zzbmd) {
        if (zzbmd != null) {
            this.zzffd = zzbmd;
            return;
        }
        throw new NullPointerException();
    }

    public final zzbpu zzahm() {
        return this.zzffl;
    }

    /* access modifiers changed from: private */
    public final void zzz(zzbpu zzbpu) {
        if (zzbpu != null) {
            this.zzffl = zzbpu;
            return;
        }
        throw new NullPointerException();
    }

    public final zzbpu zzahn() {
        return this.zzffm;
    }

    /* access modifiers changed from: private */
    public final void zzaa(zzbpu zzbpu) {
        if (zzbpu != null) {
            this.zzffm = zzbpu;
            return;
        }
        throw new NullPointerException();
    }

    public static zzbmh zzab(zzbpu zzbpu) throws zzbrl {
        return (zzbmh) zzbrd.zza(zzffn, zzbpu);
    }

    public static zza zzaho() {
        return (zza) ((zzbrd.zza) zzffn.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbmi.zzcaq[i - 1]) {
            case 1:
                return new zzbmh();
            case 2:
                return new zza((zzbmi) null);
            case 3:
                return zza((zzbsl) zzffn, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzfea", "zzffd", "zzffl", "zzffm"});
            case 4:
                return zzffn;
            case 5:
                zzbsw<zzbmh> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbmh.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzffn);
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

    public static zzbmh zzahp() {
        return zzffn;
    }

    static {
        zzbrd.zza(zzbmh.class, zzffn);
    }
}
