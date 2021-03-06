package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbmf extends zzbrd<zzbmf, zza> implements zzbsn {
    private static volatile zzbsw<zzbmf> zzcas;
    /* access modifiers changed from: private */
    public static final zzbmf zzffk = new zzbmf();
    private int zzfea;
    private zzbpu zzfei = zzbpu.zzfli;
    private zzbmh zzffj;

    private zzbmf() {
    }

    public static final class zza extends zzbrd.zza<zzbmf, zza> implements zzbsn {
        private zza() {
            super(zzbmf.zzffk);
        }

        public final zza zzdq(int i) {
            zzamw();
            ((zzbmf) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzb(zzbmh zzbmh) {
            zzamw();
            ((zzbmf) this.zzfpy).zza(zzbmh);
            return this;
        }

        public final zza zzy(zzbpu zzbpu) {
            zzamw();
            ((zzbmf) this.zzfpy).zzk(zzbpu);
            return this;
        }

        /* synthetic */ zza(zzbmg zzbmg) {
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

    public final zzbmh zzahj() {
        return this.zzffj == null ? zzbmh.zzahp() : this.zzffj;
    }

    /* access modifiers changed from: private */
    public final void zza(zzbmh zzbmh) {
        if (zzbmh != null) {
            this.zzffj = zzbmh;
            return;
        }
        throw new NullPointerException();
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

    public static zzbmf zzx(zzbpu zzbpu) throws zzbrl {
        return (zzbmf) zzbrd.zza(zzffk, zzbpu);
    }

    public static zza zzahk() {
        return (zza) ((zzbrd.zza) zzffk.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbmg.zzcaq[i - 1]) {
            case 1:
                return new zzbmf();
            case 2:
                return new zza((zzbmg) null);
            case 3:
                return zza((zzbsl) zzffk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzffj", "zzfei"});
            case 4:
                return zzffk;
            case 5:
                zzbsw<zzbmf> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbmf.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzffk);
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
        zzbrd.zza(zzbmf.class, zzffk);
    }
}
