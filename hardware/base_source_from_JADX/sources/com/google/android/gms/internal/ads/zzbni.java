package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbni extends zzbrd<zzbni, zza> implements zzbsn {
    private static volatile zzbsw<zzbni> zzcas;
    /* access modifiers changed from: private */
    public static final zzbni zzfht = new zzbni();
    private int zzfea;
    private zzbnk zzfhs;

    private zzbni() {
    }

    public static final class zza extends zzbrd.zza<zzbni, zza> implements zzbsn {
        private zza() {
            super(zzbni.zzfht);
        }

        public final zza zzed(int i) {
            zzamw();
            ((zzbni) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzb(zzbnk zzbnk) {
            zzamw();
            ((zzbni) this.zzfpy).zza(zzbnk);
            return this;
        }

        /* synthetic */ zza(zzbnj zzbnj) {
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

    public final zzbnk zzaji() {
        return this.zzfhs == null ? zzbnk.zzajm() : this.zzfhs;
    }

    /* access modifiers changed from: private */
    public final void zza(zzbnk zzbnk) {
        if (zzbnk != null) {
            this.zzfhs = zzbnk;
            return;
        }
        throw new NullPointerException();
    }

    public static zzbni zzaj(zzbpu zzbpu) throws zzbrl {
        return (zzbni) zzbrd.zza(zzfht, zzbpu);
    }

    public static zza zzajj() {
        return (zza) ((zzbrd.zza) zzfht.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbnj.zzcaq[i - 1]) {
            case 1:
                return new zzbni();
            case 2:
                return new zza((zzbnj) null);
            case 3:
                return zza((zzbsl) zzfht, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzfea", "zzfhs"});
            case 4:
                return zzfht;
            case 5:
                zzbsw<zzbni> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbni.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfht);
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
        zzbrd.zza(zzbni.class, zzfht);
    }
}
