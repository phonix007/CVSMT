package com.google.android.gms.internal.ads;

import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.internal.ads.zzbrd;

public final class zzbnc extends zzbrd<zzbnc, zza> implements zzbsn {
    private static volatile zzbsw<zzbnc> zzcas;
    /* access modifiers changed from: private */
    public static final zzbnc zzfhh = new zzbnc();
    private String zzfgk = BuildConfig.FLAVOR;
    private String zzfhd = BuildConfig.FLAVOR;
    private int zzfhe;
    private boolean zzfhf;
    private String zzfhg = BuildConfig.FLAVOR;

    private zzbnc() {
    }

    public static final class zza extends zzbrd.zza<zzbnc, zza> implements zzbsn {
        private zza() {
            super(zzbnc.zzfhh);
        }

        public final zza zzfo(String str) {
            zzamw();
            ((zzbnc) this.zzfpy).zzfm(str);
            return this;
        }

        public final zza zzfp(String str) {
            zzamw();
            ((zzbnc) this.zzfpy).zzfk(str);
            return this;
        }

        public final zza zzdy(int i) {
            zzamw();
            ((zzbnc) this.zzfpy).zzdx(0);
            return this;
        }

        public final zza zzbc(boolean z) {
            zzamw();
            ((zzbnc) this.zzfpy).zzbb(true);
            return this;
        }

        public final zza zzfq(String str) {
            zzamw();
            ((zzbnc) this.zzfpy).zzfn(str);
            return this;
        }

        /* synthetic */ zza(zzbnd zzbnd) {
            this();
        }
    }

    public final String zzaio() {
        return this.zzfhd;
    }

    /* access modifiers changed from: private */
    public final void zzfm(String str) {
        if (str != null) {
            this.zzfhd = str;
            return;
        }
        throw new NullPointerException();
    }

    public final String zzaig() {
        return this.zzfgk;
    }

    /* access modifiers changed from: private */
    public final void zzfk(String str) {
        if (str != null) {
            this.zzfgk = str;
            return;
        }
        throw new NullPointerException();
    }

    public final int zzaip() {
        return this.zzfhe;
    }

    /* access modifiers changed from: private */
    public final void zzdx(int i) {
        this.zzfhe = i;
    }

    public final boolean zzaiq() {
        return this.zzfhf;
    }

    /* access modifiers changed from: private */
    public final void zzbb(boolean z) {
        this.zzfhf = z;
    }

    public final String zzair() {
        return this.zzfhg;
    }

    /* access modifiers changed from: private */
    public final void zzfn(String str) {
        if (str != null) {
            this.zzfhg = str;
            return;
        }
        throw new NullPointerException();
    }

    public static zza zzais() {
        return (zza) ((zzbrd.zza) zzfhh.zza(zzbrd.zze.zzfqf, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbnd.zzcaq[i - 1]) {
            case 1:
                return new zzbnc();
            case 2:
                return new zza((zzbnd) null);
            case 3:
                return zza((zzbsl) zzfhh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzfhd", "zzfgk", "zzfhe", "zzfhf", "zzfhg"});
            case 4:
                return zzfhh;
            case 5:
                zzbsw<zzbnc> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbnc.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfhh);
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
        zzbrd.zza(zzbnc.class, zzfhh);
    }
}
