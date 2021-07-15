package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.List;

final class zzbqi implements zzbtb {
    private int tag;
    private final zzbqf zzfma;
    private int zzfmb;
    private int zzfmc = 0;

    public static zzbqi zza(zzbqf zzbqf) {
        if (zzbqf.zzflt != null) {
            return zzbqf.zzflt;
        }
        return new zzbqi(zzbqf);
    }

    private zzbqi(zzbqf zzbqf) {
        this.zzfma = (zzbqf) zzbrf.zza(zzbqf, "input");
        this.zzfma.zzflt = this;
    }

    public final int zzals() throws IOException {
        if (this.zzfmc != 0) {
            this.tag = this.zzfmc;
            this.zzfmc = 0;
        } else {
            this.tag = this.zzfma.zzaku();
        }
        return (this.tag == 0 || this.tag == this.zzfmb) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : this.tag >>> 3;
    }

    public final int getTag() {
        return this.tag;
    }

    public final boolean zzalt() throws IOException {
        if (this.zzfma.zzalk() || this.tag == this.zzfmb) {
            return false;
        }
        return this.zzfma.zzep(this.tag);
    }

    private final void zzev(int i) throws IOException {
        if ((this.tag & 7) != i) {
            throw zzbrl.zzanh();
        }
    }

    public final double readDouble() throws IOException {
        zzev(1);
        return this.zzfma.readDouble();
    }

    public final float readFloat() throws IOException {
        zzev(5);
        return this.zzfma.readFloat();
    }

    public final long zzakv() throws IOException {
        zzev(0);
        return this.zzfma.zzakv();
    }

    public final long zzakw() throws IOException {
        zzev(0);
        return this.zzfma.zzakw();
    }

    public final int zzakx() throws IOException {
        zzev(0);
        return this.zzfma.zzakx();
    }

    public final long zzaky() throws IOException {
        zzev(1);
        return this.zzfma.zzaky();
    }

    public final int zzakz() throws IOException {
        zzev(5);
        return this.zzfma.zzakz();
    }

    public final boolean zzala() throws IOException {
        zzev(0);
        return this.zzfma.zzala();
    }

    public final String readString() throws IOException {
        zzev(2);
        return this.zzfma.readString();
    }

    public final String zzalb() throws IOException {
        zzev(2);
        return this.zzfma.zzalb();
    }

    public final <T> T zza(zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        zzev(2);
        return zzc(zzbtc, zzbqq);
    }

    public final <T> T zzb(zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        zzev(3);
        return zzd(zzbtc, zzbqq);
    }

    private final <T> T zzc(zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        int zzald = this.zzfma.zzald();
        if (this.zzfma.zzflq < this.zzfma.zzflr) {
            int zzer = this.zzfma.zzer(zzald);
            T newInstance = zzbtc.newInstance();
            this.zzfma.zzflq++;
            zzbtc.zza(newInstance, this, zzbqq);
            zzbtc.zzs(newInstance);
            this.zzfma.zzeo(0);
            zzbqf zzbqf = this.zzfma;
            zzbqf.zzflq--;
            this.zzfma.zzes(zzer);
            return newInstance;
        }
        throw zzbrl.zzani();
    }

    private final <T> T zzd(zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        int i = this.zzfmb;
        this.zzfmb = ((this.tag >>> 3) << 3) | 4;
        try {
            T newInstance = zzbtc.newInstance();
            zzbtc.zza(newInstance, this, zzbqq);
            zzbtc.zzs(newInstance);
            if (this.tag == this.zzfmb) {
                return newInstance;
            }
            throw zzbrl.zzanj();
        } finally {
            this.zzfmb = i;
        }
    }

    public final zzbpu zzalc() throws IOException {
        zzev(2);
        return this.zzfma.zzalc();
    }

    public final int zzald() throws IOException {
        zzev(0);
        return this.zzfma.zzald();
    }

    public final int zzale() throws IOException {
        zzev(0);
        return this.zzfma.zzale();
    }

    public final int zzalf() throws IOException {
        zzev(5);
        return this.zzfma.zzalf();
    }

    public final long zzalg() throws IOException {
        zzev(1);
        return this.zzfma.zzalg();
    }

    public final int zzalh() throws IOException {
        zzev(0);
        return this.zzfma.zzalh();
    }

    public final long zzali() throws IOException {
        zzev(0);
        return this.zzfma.zzali();
    }

    public final void zzp(List<Double> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbqn) {
            zzbqn zzbqn = (zzbqn) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzald = this.zzfma.zzald();
                    zzew(zzald);
                    int zzall = this.zzfma.zzall() + zzald;
                    do {
                        zzbqn.zzd(this.zzfma.readDouble());
                    } while (this.zzfma.zzall() < zzall);
                    return;
                default:
                    throw zzbrl.zzanh();
            }
            do {
                zzbqn.zzd(this.zzfma.readDouble());
                if (!this.zzfma.zzalk()) {
                    zzaku2 = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku2 == this.tag);
            this.zzfmc = zzaku2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzald2 = this.zzfma.zzald();
                zzew(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Double.valueOf(this.zzfma.readDouble()));
                } while (this.zzfma.zzall() < zzall2);
                return;
            default:
                throw zzbrl.zzanh();
        }
        do {
            list.add(Double.valueOf(this.zzfma.readDouble()));
            if (!this.zzfma.zzalk()) {
                zzaku = this.zzfma.zzaku();
            } else {
                return;
            }
        } while (zzaku == this.tag);
        this.zzfmc = zzaku;
    }

    public final void zzq(List<Float> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbra) {
            zzbra zzbra = (zzbra) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzald = this.zzfma.zzald();
                zzex(zzald);
                int zzall = this.zzfma.zzall() + zzald;
                do {
                    zzbra.zzh(this.zzfma.readFloat());
                } while (this.zzfma.zzall() < zzall);
            } else if (i == 5) {
                do {
                    zzbra.zzh(this.zzfma.readFloat());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzald2 = this.zzfma.zzald();
                zzex(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Float.valueOf(this.zzfma.readFloat()));
                } while (this.zzfma.zzall() < zzall2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zzfma.readFloat()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzr(List<Long> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbrz) {
            zzbrz zzbrz = (zzbrz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbrz.zzbj(this.zzfma.zzakv());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbrz.zzbj(this.zzfma.zzakv());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzfma.zzakv()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Long.valueOf(this.zzfma.zzakv()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzs(List<Long> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbrz) {
            zzbrz zzbrz = (zzbrz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbrz.zzbj(this.zzfma.zzakw());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbrz.zzbj(this.zzfma.zzakw());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzfma.zzakw()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Long.valueOf(this.zzfma.zzakw()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzt(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbre.zzfo(this.zzfma.zzakx());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbre.zzfo(this.zzfma.zzakx());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzakx()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Integer.valueOf(this.zzfma.zzakx()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzu(List<Long> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbrz) {
            zzbrz zzbrz = (zzbrz) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzald = this.zzfma.zzald();
                    zzew(zzald);
                    int zzall = this.zzfma.zzall() + zzald;
                    do {
                        zzbrz.zzbj(this.zzfma.zzaky());
                    } while (this.zzfma.zzall() < zzall);
                    return;
                default:
                    throw zzbrl.zzanh();
            }
            do {
                zzbrz.zzbj(this.zzfma.zzaky());
                if (!this.zzfma.zzalk()) {
                    zzaku2 = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku2 == this.tag);
            this.zzfmc = zzaku2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzald2 = this.zzfma.zzald();
                zzew(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Long.valueOf(this.zzfma.zzaky()));
                } while (this.zzfma.zzall() < zzall2);
                return;
            default:
                throw zzbrl.zzanh();
        }
        do {
            list.add(Long.valueOf(this.zzfma.zzaky()));
            if (!this.zzfma.zzalk()) {
                zzaku = this.zzfma.zzaku();
            } else {
                return;
            }
        } while (zzaku == this.tag);
        this.zzfmc = zzaku;
    }

    public final void zzv(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzald = this.zzfma.zzald();
                zzex(zzald);
                int zzall = this.zzfma.zzall() + zzald;
                do {
                    zzbre.zzfo(this.zzfma.zzakz());
                } while (this.zzfma.zzall() < zzall);
            } else if (i == 5) {
                do {
                    zzbre.zzfo(this.zzfma.zzakz());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzald2 = this.zzfma.zzald();
                zzex(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Integer.valueOf(this.zzfma.zzakz()));
                } while (this.zzfma.zzall() < zzall2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzakz()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzw(List<Boolean> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbps) {
            zzbps zzbps = (zzbps) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbps.addBoolean(this.zzfma.zzala());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbps.addBoolean(this.zzfma.zzala());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zzfma.zzala()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Boolean.valueOf(this.zzfma.zzala()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void readStringList(List<String> list) throws IOException {
        zzb(list, false);
    }

    public final void zzx(List<String> list) throws IOException {
        zzb(list, true);
    }

    private final void zzb(List<String> list, boolean z) throws IOException {
        int zzaku;
        int zzaku2;
        if ((this.tag & 7) != 2) {
            throw zzbrl.zzanh();
        } else if (!(list instanceof zzbru) || z) {
            do {
                list.add(z ? zzalb() : readString());
                if (!this.zzfma.zzalk()) {
                    zzaku = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku == this.tag);
            this.zzfmc = zzaku;
        } else {
            zzbru zzbru = (zzbru) list;
            do {
                zzbru.zzap(zzalc());
                if (!this.zzfma.zzalk()) {
                    zzaku2 = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku2 == this.tag);
            this.zzfmc = zzaku2;
        }
    }

    public final <T> void zza(List<T> list, zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        int zzaku;
        if ((this.tag & 7) == 2) {
            int i = this.tag;
            do {
                list.add(zzc(zzbtc, zzbqq));
                if (!this.zzfma.zzalk() && this.zzfmc == 0) {
                    zzaku = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku == i);
            this.zzfmc = zzaku;
            return;
        }
        throw zzbrl.zzanh();
    }

    public final <T> void zzb(List<T> list, zzbtc<T> zzbtc, zzbqq zzbqq) throws IOException {
        int zzaku;
        if ((this.tag & 7) == 3) {
            int i = this.tag;
            do {
                list.add(zzd(zzbtc, zzbqq));
                if (!this.zzfma.zzalk() && this.zzfmc == 0) {
                    zzaku = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku == i);
            this.zzfmc = zzaku;
            return;
        }
        throw zzbrl.zzanh();
    }

    public final void zzy(List<zzbpu> list) throws IOException {
        int zzaku;
        if ((this.tag & 7) == 2) {
            do {
                list.add(zzalc());
                if (!this.zzfma.zzalk()) {
                    zzaku = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku == this.tag);
            this.zzfmc = zzaku;
            return;
        }
        throw zzbrl.zzanh();
    }

    public final void zzz(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbre.zzfo(this.zzfma.zzald());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbre.zzfo(this.zzfma.zzald());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzald()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Integer.valueOf(this.zzfma.zzald()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzaa(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbre.zzfo(this.zzfma.zzale());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbre.zzfo(this.zzfma.zzale());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzale()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Integer.valueOf(this.zzfma.zzale()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzab(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 2) {
                int zzald = this.zzfma.zzald();
                zzex(zzald);
                int zzall = this.zzfma.zzall() + zzald;
                do {
                    zzbre.zzfo(this.zzfma.zzalf());
                } while (this.zzfma.zzall() < zzall);
            } else if (i == 5) {
                do {
                    zzbre.zzfo(this.zzfma.zzalf());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 2) {
                int zzald2 = this.zzfma.zzald();
                zzex(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Integer.valueOf(this.zzfma.zzalf()));
                } while (this.zzfma.zzall() < zzall2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzalf()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzac(List<Long> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbrz) {
            zzbrz zzbrz = (zzbrz) list;
            switch (this.tag & 7) {
                case 1:
                    break;
                case 2:
                    int zzald = this.zzfma.zzald();
                    zzew(zzald);
                    int zzall = this.zzfma.zzall() + zzald;
                    do {
                        zzbrz.zzbj(this.zzfma.zzalg());
                    } while (this.zzfma.zzall() < zzall);
                    return;
                default:
                    throw zzbrl.zzanh();
            }
            do {
                zzbrz.zzbj(this.zzfma.zzalg());
                if (!this.zzfma.zzalk()) {
                    zzaku2 = this.zzfma.zzaku();
                } else {
                    return;
                }
            } while (zzaku2 == this.tag);
            this.zzfmc = zzaku2;
            return;
        }
        switch (this.tag & 7) {
            case 1:
                break;
            case 2:
                int zzald2 = this.zzfma.zzald();
                zzew(zzald2);
                int zzall2 = this.zzfma.zzall() + zzald2;
                do {
                    list.add(Long.valueOf(this.zzfma.zzalg()));
                } while (this.zzfma.zzall() < zzall2);
                return;
            default:
                throw zzbrl.zzanh();
        }
        do {
            list.add(Long.valueOf(this.zzfma.zzalg()));
            if (!this.zzfma.zzalk()) {
                zzaku = this.zzfma.zzaku();
            } else {
                return;
            }
        } while (zzaku == this.tag);
        this.zzfmc = zzaku;
    }

    public final void zzad(List<Integer> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbre) {
            zzbre zzbre = (zzbre) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbre.zzfo(this.zzfma.zzalh());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbre.zzfo(this.zzfma.zzalh());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.zzfma.zzalh()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Integer.valueOf(this.zzfma.zzalh()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    public final void zzae(List<Long> list) throws IOException {
        int zzaku;
        int zzaku2;
        if (list instanceof zzbrz) {
            zzbrz zzbrz = (zzbrz) list;
            int i = this.tag & 7;
            if (i == 0) {
                do {
                    zzbrz.zzbj(this.zzfma.zzali());
                    if (!this.zzfma.zzalk()) {
                        zzaku2 = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku2 == this.tag);
                this.zzfmc = zzaku2;
            } else if (i == 2) {
                int zzall = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    zzbrz.zzbj(this.zzfma.zzali());
                } while (this.zzfma.zzall() < zzall);
                zzey(zzall);
            } else {
                throw zzbrl.zzanh();
            }
        } else {
            int i2 = this.tag & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.zzfma.zzali()));
                    if (!this.zzfma.zzalk()) {
                        zzaku = this.zzfma.zzaku();
                    } else {
                        return;
                    }
                } while (zzaku == this.tag);
                this.zzfmc = zzaku;
            } else if (i2 == 2) {
                int zzall2 = this.zzfma.zzall() + this.zzfma.zzald();
                do {
                    list.add(Long.valueOf(this.zzfma.zzali()));
                } while (this.zzfma.zzall() < zzall2);
                zzey(zzall2);
            } else {
                throw zzbrl.zzanh();
            }
        }
    }

    private static void zzew(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzbrl.zzanj();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (zzalt() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.ads.zzbrl("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void zza(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.zzbse<K, V> r7, com.google.android.gms.internal.ads.zzbqq r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.zzev(r0)
            com.google.android.gms.internal.ads.zzbqf r0 = r5.zzfma
            int r0 = r0.zzald()
            com.google.android.gms.internal.ads.zzbqf r1 = r5.zzfma
            int r0 = r1.zzer(r0)
            K r1 = r7.zzfsa
            V r2 = r7.zzfsc
        L_0x0014:
            int r3 = r5.zzals()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.ads.zzbqf r4 = r5.zzfma     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.zzalk()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.zzalt()     // Catch:{ zzbrm -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.zzbuj r3 = r7.zzfsb     // Catch:{ zzbrm -> 0x004f }
            V r4 = r7.zzfsc     // Catch:{ zzbrm -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzbrm -> 0x004f }
            java.lang.Object r3 = r5.zza((com.google.android.gms.internal.ads.zzbuj) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.ads.zzbqq) r8)     // Catch:{ zzbrm -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.zzbuj r3 = r7.zzfrz     // Catch:{ zzbrm -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.zza((com.google.android.gms.internal.ads.zzbuj) r3, (java.lang.Class<?>) r4, (com.google.android.gms.internal.ads.zzbqq) r4)     // Catch:{ zzbrm -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.ads.zzbrl r3 = new com.google.android.gms.internal.ads.zzbrl     // Catch:{ zzbrm -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzbrm -> 0x004f }
            throw r3     // Catch:{ zzbrm -> 0x004f }
        L_0x004f:
            boolean r3 = r5.zzalt()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.ads.zzbrl r6 = new com.google.android.gms.internal.ads.zzbrl     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.ads.zzbqf r6 = r5.zzfma
            r6.zzes(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbqf r7 = r5.zzfma
            r7.zzes(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqi.zza(java.util.Map, com.google.android.gms.internal.ads.zzbse, com.google.android.gms.internal.ads.zzbqq):void");
    }

    private final Object zza(zzbuj zzbuj, Class<?> cls, zzbqq zzbqq) throws IOException {
        switch (zzbqj.zzfmd[zzbuj.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzala());
            case 2:
                return zzalc();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(zzale());
            case 5:
                return Integer.valueOf(zzakz());
            case 6:
                return Long.valueOf(zzaky());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(zzakx());
            case 9:
                return Long.valueOf(zzakw());
            case 10:
                zzev(2);
                return zzc(zzbsy.zzaog().zzf(cls), zzbqq);
            case 11:
                return Integer.valueOf(zzalf());
            case 12:
                return Long.valueOf(zzalg());
            case 13:
                return Integer.valueOf(zzalh());
            case 14:
                return Long.valueOf(zzali());
            case 15:
                return zzalb();
            case 16:
                return Integer.valueOf(zzald());
            case 17:
                return Long.valueOf(zzakv());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void zzex(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzbrl.zzanj();
        }
    }

    private final void zzey(int i) throws IOException {
        if (this.zzfma.zzall() != i) {
            throw zzbrl.zzanc();
        }
    }
}
