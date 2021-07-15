package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzbmp extends zzbrd<zzbmp, zza> implements zzbsn {
    private static volatile zzbsw<zzbmp> zzcas;
    /* access modifiers changed from: private */
    public static final zzbmp zzfgf = new zzbmp();
    private int zzfea;
    private zzbpu zzfei = zzbpu.zzfli;
    private zzbmt zzfge;

    private zzbmp() {
    }

    public static final class zza extends zzbrd.zza<zzbmp, zza> implements zzbsn {
        private zza() {
            super(zzbmp.zzfgf);
        }

        public final zza zzdu(int i) {
            zzamw();
            ((zzbmp) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzc(zzbmt zzbmt) {
            zzamw();
            ((zzbmp) this.zzfpy).zzb(zzbmt);
            return this;
        }

        public final zza zzaf(zzbpu zzbpu) {
            zzamw();
            ((zzbmp) this.zzfpy).zzk(zzbpu);
            return this;
        }

        /* synthetic */ zza(zzbmq zzbmq) {
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

    public final zzbmt zzahw() {
        return this.zzfge == null ? zzbmt.zzaie() : this.zzfge;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzbmt zzbmt) {
        if (zzbmt != null) {
            this.zzfge = zzbmt;
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

    public static zzbmp zzae(zzbpu zzbpu) throws zzbrl {
        return (zzbmp) zzbrd.zza(zzfgf, zzbpu);
    }

    public static zza zzahx() {
        return (zza) ((zzbrd.zza) zzfgf.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbmq.zzcaq[i - 1]) {
            case 1:
                return new zzbmp();
            case 2:
                return new zza((zzbmq) null);
            case 3:
                return zza((zzbsl) zzfgf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfge", "zzfei"});
            case 4:
                return zzfgf;
            case 5:
                zzbsw<zzbmp> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbmp.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfgf);
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

    public static zzbmp zzahy() {
        return zzfgf;
    }

    static {
        zzbrd.zza(zzbmp.class, zzfgf);
    }
}
