package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;

public final class zzblf extends zzbrd<zzblf, zza> implements zzbsn {
    private static volatile zzbsw<zzblf> zzcas;
    /* access modifiers changed from: private */
    public static final zzblf zzfej = new zzblf();
    private int zzfea;
    private zzblj zzfeh;
    private zzbpu zzfei = zzbpu.zzfli;

    private zzblf() {
    }

    public static final class zza extends zzbrd.zza<zzblf, zza> implements zzbsn {
        private zza() {
            super(zzblf.zzfej);
        }

        public final zza zzdl(int i) {
            zzamw();
            ((zzblf) this.zzfpy).setVersion(0);
            return this;
        }

        public final zza zzc(zzblj zzblj) {
            zzamw();
            ((zzblf) this.zzfpy).zzb(zzblj);
            return this;
        }

        public final zza zzm(zzbpu zzbpu) {
            zzamw();
            ((zzblf) this.zzfpy).zzk(zzbpu);
            return this;
        }

        /* synthetic */ zza(zzblg zzblg) {
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

    public final zzblj zzage() {
        return this.zzfeh == null ? zzblj.zzagm() : this.zzfeh;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzblj zzblj) {
        if (zzblj != null) {
            this.zzfeh = zzblj;
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

    public static zzblf zzl(zzbpu zzbpu) throws zzbrl {
        return (zzblf) zzbrd.zza(zzfej, zzbpu);
    }

    public static zza zzagg() {
        return (zza) ((zzbrd.zza) zzfej.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzblg.zzcaq[i - 1]) {
            case 1:
                return new zzblf();
            case 2:
                return new zza((zzblg) null);
            case 3:
                return zza((zzbsl) zzfej, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzfea", "zzfeh", "zzfei"});
            case 4:
                return zzfej;
            case 5:
                zzbsw<zzblf> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzblf.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfej);
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

    public static zzblf zzagh() {
        return zzfej;
    }

    static {
        zzbrd.zza(zzblf.class, zzfej);
    }
}
