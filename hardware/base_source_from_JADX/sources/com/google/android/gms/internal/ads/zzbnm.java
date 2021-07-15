package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbnm extends zzbrd<zzbnm, zza> implements zzbsn {
    private static volatile zzbsw<zzbnm> zzcas;
    /* access modifiers changed from: private */
    public static final zzbnm zzfhx = new zzbnm();
    private int zzfea;
    private zzbno zzfhw;

    private zzbnm() {
    }

    public static final class zza extends zzbrd.zza<zzbnm, zza> implements zzbsn {
        private zza() {
            super(zzbnm.zzfhx);
        }

        public final zza zzee(int i) {
            zzamw();
            ((zzbnm) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzb(zzbno zzbno) {
            zzamw();
            ((zzbnm) this.zzfpy).zza(zzbno);
            return this;
        }

        /* synthetic */ zza(zzbnn zzbnn) {
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

    public final zzbno zzajo() {
        return this.zzfhw == null ? zzbno.zzajt() : this.zzfhw;
    }

    /* access modifiers changed from: private */
    public final void zza(zzbno zzbno) {
        if (zzbno != null) {
            this.zzfhw = zzbno;
            return;
        }
        throw new NullPointerException();
    }

    public static zzbnm zzal(zzbpu zzbpu) throws zzbrl {
        return (zzbnm) zzbrd.zza(zzfhx, zzbpu);
    }

    public static zza zzajp() {
        return (zza) ((zzbrd.zza) zzfhx.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbnn.zzcaq[i - 1]) {
            case 1:
                return new zzbnm();
            case 2:
                return new zza((zzbnn) null);
            case 3:
                return zza((zzbsl) zzfhx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhw"});
            case 4:
                return zzfhx;
            case 5:
                zzbsw<zzbnm> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbnm.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfhx);
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
        zzbrd.zza(zzbnm.class, zzfhx);
    }
}
