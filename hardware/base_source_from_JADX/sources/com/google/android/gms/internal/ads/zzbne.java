package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;
import java.util.List;

public final class zzbne extends zzbrd<zzbne, zza> implements zzbsn {
    private static volatile zzbsw<zzbne> zzcas;
    /* access modifiers changed from: private */
    public static final zzbne zzfhk = new zzbne();
    private int zzccg;
    private int zzfhi;
    private zzbrk<zzb> zzfhj = zzams();

    public static final class zzb extends zzbrd<zzb, zza> implements zzbsn {
        private static volatile zzbsw<zzb> zzcas;
        /* access modifiers changed from: private */
        public static final zzb zzfho = new zzb();
        private int zzfhb;
        private zzbmv zzfhl;
        private int zzfhm;
        private int zzfhn;

        private zzb() {
        }

        public static final class zza extends zzbrd.zza<zzb, zza> implements zzbsn {
            private zza() {
                super(zzb.zzfho);
            }

            /* synthetic */ zza(zzbnf zzbnf) {
                this();
            }
        }

        public final boolean zzaiy() {
            return this.zzfhl != null;
        }

        public final zzbmv zzaiz() {
            return this.zzfhl == null ? zzbmv.zzaik() : this.zzfhl;
        }

        public final zzbmy zzaja() {
            zzbmy zzdw = zzbmy.zzdw(this.zzfhm);
            return zzdw == null ? zzbmy.UNRECOGNIZED : zzdw;
        }

        public final int zzajb() {
            return this.zzfhn;
        }

        public final zzbnq zzajc() {
            zzbnq zzef = zzbnq.zzef(this.zzfhb);
            return zzef == null ? zzbnq.UNRECOGNIZED : zzef;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbnf.zzcaq[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzbnf) null);
                case 3:
                    return zza((zzbsl) zzfho, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzfhl", "zzfhm", "zzfhn", "zzfhb"});
                case 4:
                    return zzfho;
                case 5:
                    zzbsw<zzb> zzbsw = zzcas;
                    if (zzbsw == null) {
                        synchronized (zzb.class) {
                            zzbsw = zzcas;
                            if (zzbsw == null) {
                                zzbsw = new zzbrd.zzb<>(zzfho);
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
            zzbrd.zza(zzb.class, zzfho);
        }
    }

    private zzbne() {
    }

    public static final class zza extends zzbrd.zza<zzbne, zza> implements zzbsn {
        private zza() {
            super(zzbne.zzfhk);
        }

        /* synthetic */ zza(zzbnf zzbnf) {
            this();
        }
    }

    public final int zzaiu() {
        return this.zzfhi;
    }

    public final List<zzb> zzaiv() {
        return this.zzfhj;
    }

    public final int zzaiw() {
        return this.zzfhj.size();
    }

    public static zzbne zzm(byte[] bArr) throws zzbrl {
        return (zzbne) zzbrd.zzb(zzfhk, bArr);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzbnf.zzcaq[i - 1]) {
            case 1:
                return new zzbne();
            case 2:
                return new zza((zzbnf) null);
            case 3:
                return zza((zzbsl) zzfhk, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzccg", "zzfhi", "zzfhj", zzb.class});
            case 4:
                return zzfhk;
            case 5:
                zzbsw<zzbne> zzbsw = zzcas;
                if (zzbsw == null) {
                    synchronized (zzbne.class) {
                        zzbsw = zzcas;
                        if (zzbsw == null) {
                            zzbsw = new zzbrd.zzb<>(zzfhk);
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
        zzbrd.zza(zzbne.class, zzfhk);
    }
}
