package com.google.android.gms.internal.measurement;

import android.support.p003v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;

final class zzvc implements zzxt {
    private int tag;
    private final zzuz zzbvm;
    private int zzbvn;
    private int zzbvo = 0;

    public static zzvc zza(zzuz zzuz) {
        if (zzuz.zzbvf != null) {
            return zzuz.zzbvf;
        }
        return new zzvc(zzuz);
    }

    private zzvc(zzuz zzuz) {
        this.zzbvm = (zzuz) zzvz.zza(zzuz, "input");
        this.zzbvm.zzbvf = this;
    }

    public final int zzvo() throws IOException {
        if (this.zzbvo != 0) {
            this.tag = this.zzbvo;
            this.zzbvo = 0;
        } else {
            this.tag = this.zzbvm.zzuq();
        }
        return (this.tag == 0 || this.tag == this.zzbvn) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.tag >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzvp() throws IOException {
        if (this.zzbvm.zzvg() || this.tag == this.zzbvn) {
            return false;
        }
        return this.zzbvm.zzap(this.tag);
    }

    private final void zzau(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzwe.zzxb();
        }
    }

    public final double readDouble() throws IOException {
        zzau(1);
        return this.zzbvm.readDouble();
    }

    public final float readFloat() throws IOException {
        zzau(5);
        return this.zzbvm.readFloat();
    }

    public final long zzur() throws IOException {
        zzau(0);
        return this.zzbvm.zzur();
    }

    public final long zzus() throws IOException {
        zzau(0);
        return this.zzbvm.zzus();
    }

    public final int zzut() throws IOException {
        zzau(0);
        return this.zzbvm.zzut();
    }

    public final long zzuu() throws IOException {
        zzau(1);
        return this.zzbvm.zzuu();
    }

    public final int zzuv() throws IOException {
        zzau(5);
        return this.zzbvm.zzuv();
    }

    public final boolean zzuw() throws IOException {
        zzau(0);
        return this.zzbvm.zzuw();
    }

    public final String readString() throws IOException {
        zzau(2);
        return this.zzbvm.readString();
    }

    public final String zzux() throws IOException {
        zzau(2);
        return this.zzbvm.zzux();
    }

    public final <T> T zza(zzxu<T> zzxu, zzvk zzvk) throws IOException {
        zzau(2);
        return zzc(zzxu, zzvk);
    }

    public final <T> T zzb(zzxu<T> zzxu, zzvk zzvk) throws IOException {
        zzau(3);
        return zzd(zzxu, zzvk);
    }

    private final <T> T zzc(zzxu<T> zzxu, zzvk zzvk) throws IOException {
        int zzuz = this.zzbvm.zzuz();
        if (this.zzbvm.zzbvc < this.zzbvm.zzbvd) {
            int zzar = this.zzbvm.zzar(zzuz);
            T newInstance = zzxu.newInstance();
            this.zzbvm.zzbvc++;
            zzxu.zza(newInstance, this, zzvk);
            zzxu.zzy(newInstance);
            this.zzbvm.zzao(0);
            zzuz zzuz2 = this.zzbvm;
            zzuz2.zzbvc--;
            this.zzbvm.zzas(zzar);
            return newInstance;
        }
        throw zzwe.zzxc();
    }

    private final <T> T zzd(zzxu<T> zzxu, zzvk zzvk) throws IOException {
        int i = this.zzbvn;
        this.zzbvn = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzxu.newInstance();
            zzxu.zza(newInstance, this, zzvk);
            zzxu.zzy(newInstance);
            if (this.tag == this.zzbvn) {
                return newInstance;
            }
            throw zzwe.zzxd();
        } finally {
            this.zzbvn = i;
        }
    }

    public final zzun zzuy() throws IOException {
        zzau(2);
        return this.zzbvm.zzuy();
    }

    public final int zzuz() throws IOException {
        zzau(0);
        return this.zzbvm.zzuz();
    }

    public final int zzva() throws IOException {
        zzau(0);
        return this.zzbvm.zzva();
    }

    public final int zzvb() throws IOException {
        zzau(5);
        return this.zzbvm.zzvb();
    }

    public final long zzvc() throws IOException {
        zzau(1);
        return this.zzbvm.zzvc();
    }

    public final int zzvd() throws IOException {
        zzau(0);
        return this.zzbvm.zzvd();
    }

    public final long zzve() throws IOException {
        zzau(0);
        return this.zzbvm.zzve();
    }

    public final void zzh(List<Double> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvh) {
            zzvh zzvh = (zzvh) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzuz = this.zzbvm.zzuz();
                    zzav(zzuz);
                    int zzvh2 = this.zzbvm.zzvh() + zzuz;
                    do {
                        zzvh.zzd(this.zzbvm.readDouble());
                    } while (this.zzbvm.zzvh() < zzvh2);
                    return;
                default:
                    throw zzwe.zzxb();
            }
            do {
                zzvh.zzd(this.zzbvm.readDouble());
                if (!this.zzbvm.zzvg()) {
                    zzuq2 = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq2 == this.tag);
            this.zzbvo = zzuq2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzuz2 = this.zzbvm.zzuz();
                zzav(zzuz2);
                int zzvh3 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Double.valueOf(this.zzbvm.readDouble()));
                } while (this.zzbvm.zzvh() < zzvh3);
                return;
            default:
                throw zzwe.zzxb();
        }
        do {
            list.add(Double.valueOf(this.zzbvm.readDouble()));
            if (!this.zzbvm.zzvg()) {
                zzuq = this.zzbvm.zzuq();
            } else {
                return;
            }
        } while (zzuq == this.tag);
        this.zzbvo = zzuq;
    }

    public final void zzi(List<Float> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvu) {
            zzvu zzvu = (zzvu) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzuz = this.zzbvm.zzuz();
                zzaw(zzuz);
                int zzvh = this.zzbvm.zzvh() + zzuz;
                do {
                    zzvu.zzc(this.zzbvm.readFloat());
                } while (this.zzbvm.zzvh() < zzvh);
            } else if (i == 5) {
                do {
                    zzvu.zzc(this.zzbvm.readFloat());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzuz2 = this.zzbvm.zzuz();
                zzaw(zzuz2);
                int zzvh2 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Float.valueOf(this.zzbvm.readFloat()));
                } while (this.zzbvm.zzvh() < zzvh2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zzbvm.readFloat()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzj(List<Long> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzws) {
            zzws zzws = (zzws) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzws.zzbj(this.zzbvm.zzur());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzws.zzbj(this.zzbvm.zzur());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzbvm.zzur()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Long.valueOf(this.zzbvm.zzur()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzk(List<Long> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzws) {
            zzws zzws = (zzws) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzws.zzbj(this.zzbvm.zzus());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzws.zzbj(this.zzbvm.zzus());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzbvm.zzus()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Long.valueOf(this.zzbvm.zzus()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzl(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzvy.zzbn(this.zzbvm.zzut());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzvy.zzbn(this.zzbvm.zzut());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzut()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzut()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzm(List<Long> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzws) {
            zzws zzws = (zzws) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzuz = this.zzbvm.zzuz();
                    zzav(zzuz);
                    int zzvh = this.zzbvm.zzvh() + zzuz;
                    do {
                        zzws.zzbj(this.zzbvm.zzuu());
                    } while (this.zzbvm.zzvh() < zzvh);
                    return;
                default:
                    throw zzwe.zzxb();
            }
            do {
                zzws.zzbj(this.zzbvm.zzuu());
                if (!this.zzbvm.zzvg()) {
                    zzuq2 = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq2 == this.tag);
            this.zzbvo = zzuq2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzuz2 = this.zzbvm.zzuz();
                zzav(zzuz2);
                int zzvh2 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Long.valueOf(this.zzbvm.zzuu()));
                } while (this.zzbvm.zzvh() < zzvh2);
                return;
            default:
                throw zzwe.zzxb();
        }
        do {
            list.add(Long.valueOf(this.zzbvm.zzuu()));
            if (!this.zzbvm.zzvg()) {
                zzuq = this.zzbvm.zzuq();
            } else {
                return;
            }
        } while (zzuq == this.tag);
        this.zzbvo = zzuq;
    }

    public final void zzn(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzuz = this.zzbvm.zzuz();
                zzaw(zzuz);
                int zzvh = this.zzbvm.zzvh() + zzuz;
                do {
                    zzvy.zzbn(this.zzbvm.zzuv());
                } while (this.zzbvm.zzvh() < zzvh);
            } else if (i == 5) {
                do {
                    zzvy.zzbn(this.zzbvm.zzuv());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzuz2 = this.zzbvm.zzuz();
                zzaw(zzuz2);
                int zzvh2 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzuv()));
                } while (this.zzbvm.zzvh() < zzvh2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzuv()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzo(List<Boolean> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzul) {
            zzul zzul = (zzul) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzul.addBoolean(this.zzbvm.zzuw());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzul.addBoolean(this.zzbvm.zzuw());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zzbvm.zzuw()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Boolean.valueOf(this.zzbvm.zzuw()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void readStringList(List<String> list) throws IOException {
        zza(list, false);
    }

    public final void zzp(List<String> list) throws IOException {
        zza(list, true);
    }

    private final void zza(List<String> list, boolean z) throws IOException {
        int zzuq;
        int zzuq2;
        if ((this.tag & 7) != 2) {
            throw zzwe.zzxb();
        } else if (!(list instanceof zzwn) || z) {
            do {
                list.add(z ? zzux() : readString());
                if (!this.zzbvm.zzvg()) {
                    zzuq = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq == this.tag);
            this.zzbvo = zzuq;
        } else {
            zzwn zzwn = (zzwn) list;
            do {
                zzwn.zzc(zzuy());
                if (!this.zzbvm.zzvg()) {
                    zzuq2 = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq2 == this.tag);
            this.zzbvo = zzuq2;
        }
    }

    public final <T> void zza(List<T> list, zzxu<T> zzxu, zzvk zzvk) throws IOException {
        int zzuq;
        if ((this.tag & 7) == 2) {
            int i = this.tag;
            do {
                list.add(zzc(zzxu, zzvk));
                if (!this.zzbvm.zzvg() && this.zzbvo == 0) {
                    zzuq = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq == i);
            this.zzbvo = zzuq;
            return;
        }
        throw zzwe.zzxb();
    }

    public final <T> void zzb(List<T> list, zzxu<T> zzxu, zzvk zzvk) throws IOException {
        int zzuq;
        if ((this.tag & 7) == 3) {
            int i = this.tag;
            do {
                list.add(zzd(zzxu, zzvk));
                if (!this.zzbvm.zzvg() && this.zzbvo == 0) {
                    zzuq = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq == i);
            this.zzbvo = zzuq;
            return;
        }
        throw zzwe.zzxb();
    }

    public final void zzq(List<zzun> list) throws IOException {
        int zzuq;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzuy());
                if (!this.zzbvm.zzvg()) {
                    zzuq = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq == this.tag);
            this.zzbvo = zzuq;
            return;
        }
        throw zzwe.zzxb();
    }

    public final void zzr(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzvy.zzbn(this.zzbvm.zzuz());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzvy.zzbn(this.zzbvm.zzuz());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzuz()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzuz()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzs(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzvy.zzbn(this.zzbvm.zzva());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzvy.zzbn(this.zzbvm.zzva());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzva()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzva()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzt(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzuz = this.zzbvm.zzuz();
                zzaw(zzuz);
                int zzvh = this.zzbvm.zzvh() + zzuz;
                do {
                    zzvy.zzbn(this.zzbvm.zzvb());
                } while (this.zzbvm.zzvh() < zzvh);
            } else if (i == 5) {
                do {
                    zzvy.zzbn(this.zzbvm.zzvb());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzuz2 = this.zzbvm.zzuz();
                zzaw(zzuz2);
                int zzvh2 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzvb()));
                } while (this.zzbvm.zzvh() < zzvh2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzvb()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzu(List<Long> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzws) {
            zzws zzws = (zzws) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzuz = this.zzbvm.zzuz();
                    zzav(zzuz);
                    int zzvh = this.zzbvm.zzvh() + zzuz;
                    do {
                        zzws.zzbj(this.zzbvm.zzvc());
                    } while (this.zzbvm.zzvh() < zzvh);
                    return;
                default:
                    throw zzwe.zzxb();
            }
            do {
                zzws.zzbj(this.zzbvm.zzvc());
                if (!this.zzbvm.zzvg()) {
                    zzuq2 = this.zzbvm.zzuq();
                } else {
                    return;
                }
            } while (zzuq2 == this.tag);
            this.zzbvo = zzuq2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzuz2 = this.zzbvm.zzuz();
                zzav(zzuz2);
                int zzvh2 = this.zzbvm.zzvh() + zzuz2;
                do {
                    list.add(Long.valueOf(this.zzbvm.zzvc()));
                } while (this.zzbvm.zzvh() < zzvh2);
                return;
            default:
                throw zzwe.zzxb();
        }
        do {
            list.add(Long.valueOf(this.zzbvm.zzvc()));
            if (!this.zzbvm.zzvg()) {
                zzuq = this.zzbvm.zzuq();
            } else {
                return;
            }
        } while (zzuq == this.tag);
        this.zzbvo = zzuq;
    }

    public final void zzv(List<Integer> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzvy) {
            zzvy zzvy = (zzvy) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzvy.zzbn(this.zzbvm.zzvd());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzvy.zzbn(this.zzbvm.zzvd());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzvd()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Integer.valueOf(this.zzbvm.zzvd()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    public final void zzw(List<Long> list) throws IOException {
        int zzuq;
        int zzuq2;
        if (list instanceof zzws) {
            zzws zzws = (zzws) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzws.zzbj(this.zzbvm.zzve());
                    if (!this.zzbvm.zzvg()) {
                        zzuq2 = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq2 == this.tag);
                this.zzbvo = zzuq2;
            } else if (i == 2) {
                int zzvh = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    zzws.zzbj(this.zzbvm.zzve());
                } while (this.zzbvm.zzvh() < zzvh);
                zzax(zzvh);
            } else {
                throw zzwe.zzxb();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzbvm.zzve()));
                    if (!this.zzbvm.zzvg()) {
                        zzuq = this.zzbvm.zzuq();
                    } else {
                        return;
                    }
                } while (zzuq == this.tag);
                this.zzbvo = zzuq;
            } else if (i2 == 2) {
                int zzvh2 = this.zzbvm.zzvh() + this.zzbvm.zzuz();
                do {
                    list.add(Long.valueOf(this.zzbvm.zzve()));
                } while (this.zzbvm.zzvh() < zzvh2);
                zzax(zzvh2);
            } else {
                throw zzwe.zzxb();
            }
        }
    }

    private static void zzav(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzwe.zzxd();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (zzvp() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.measurement.zzwe("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.zzwx<K, V> r7, com.google.android.gms.internal.measurement.zzvk r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.zzau(r0)
            com.google.android.gms.internal.measurement.zzuz r0 = r5.zzbvm
            int r0 = r0.zzuz()
            com.google.android.gms.internal.measurement.zzuz r1 = r5.zzbvm
            int r0 = r1.zzar(r0)
            K r1 = r7.zzcbn
            V r2 = r7.zzbsa
        L_0x0014:
            int r3 = r5.zzvo()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.measurement.zzuz r4 = r5.zzbvm     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.zzvg()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.zzvp()     // Catch:{ zzwf -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.measurement.zzzb r3 = r7.zzcbo     // Catch:{ zzwf -> 0x004f }
            V r4 = r7.zzbsa     // Catch:{ zzwf -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzwf -> 0x004f }
            java.lang.Object r3 = r5.zza((com.google.android.gms.internal.measurement.zzzb) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.measurement.zzvk) r8)     // Catch:{ zzwf -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.measurement.zzzb r3 = r7.zzcbm     // Catch:{ zzwf -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.zza((com.google.android.gms.internal.measurement.zzzb) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.measurement.zzvk) r4)     // Catch:{ zzwf -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.measurement.zzwe r3 = new com.google.android.gms.internal.measurement.zzwe     // Catch:{ zzwf -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzwf -> 0x004f }
            throw r3     // Catch:{ zzwf -> 0x004f }
        L_0x004f:
            boolean r3 = r5.zzvp()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.measurement.zzwe r6 = new com.google.android.gms.internal.measurement.zzwe     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.measurement.zzuz r6 = r5.zzbvm
            r6.zzas(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.measurement.zzuz r7 = r5.zzbvm
            r7.zzas(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzvc.zza(java.util.Map, com.google.android.gms.internal.measurement.zzwx, com.google.android.gms.internal.measurement.zzvk):void");
    }

    private final Object zza(zzzb zzzb, Class<?> cls, zzvk zzvk) throws IOException {
        switch (zzvd.zzbvp[zzzb.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzuw());
            case 2:
                return zzuy();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzva());
            case 5:
                return Integer.valueOf(zzuv());
            case 6:
                return Long.valueOf(zzuu());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzut());
            case 9:
                return Long.valueOf(zzus());
            case 10:
                zzau(2);
                return zzc(zzxq.zzya().zzi(cls), zzvk);
            case 11:
                return Integer.valueOf(zzvb());
            case 12:
                return Long.valueOf(zzvc());
            case 13:
                return Integer.valueOf(zzvd());
            case 14:
                return Long.valueOf(zzve());
            case 15:
                return zzux();
            case 16:
                return Integer.valueOf(zzuz());
            case 17:
                return Long.valueOf(zzur());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzaw(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzwe.zzxd();
        }
    }

    private final void zzax(int i) throws IOException {
        if (this.zzbvm.zzvh() != i) {
            throw zzwe.zzwx();
        }
    }
}
