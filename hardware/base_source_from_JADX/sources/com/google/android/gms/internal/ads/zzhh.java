package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzhh {
    private float zzaag;
    private float zzaah;
    private final int zzafc;
    private final int zzafd;
    private final int zzafe;
    private final int zzaff = (this.zzafe * 2);
    private final short[] zzafg = new short[this.zzaff];
    private int zzafh = this.zzaff;
    private short[] zzafi;
    private int zzafj;
    private short[] zzafk;
    private int zzafl;
    private short[] zzafm;
    private int zzafn;
    private int zzafo;
    private int zzafp;
    private int zzafq;
    private int zzafr;
    private int zzafs;
    private int zzaft;
    private int zzafu;
    private int zzafv;
    private int zzafw;
    private final int zzzu;

    public zzhh(int i, int i2) {
        this.zzzu = i;
        this.zzafc = i2;
        this.zzafd = i / 400;
        this.zzafe = i / 65;
        this.zzafi = new short[(this.zzaff * i2)];
        this.zzafj = this.zzaff;
        this.zzafk = new short[(this.zzaff * i2)];
        this.zzafl = this.zzaff;
        this.zzafm = new short[(this.zzaff * i2)];
        this.zzafn = 0;
        this.zzafo = 0;
        this.zzaft = 0;
        this.zzaag = 1.0f;
        this.zzaah = 1.0f;
    }

    public final void setSpeed(float f) {
        this.zzaag = f;
    }

    public final void zza(float f) {
        this.zzaah = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.zzafc;
        zzp(remaining);
        shortBuffer.get(this.zzafi, this.zzafp * this.zzafc, ((this.zzafc * remaining) << 1) / 2);
        this.zzafp += remaining;
        zzdl();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzafc, this.zzafq);
        shortBuffer.put(this.zzafk, 0, this.zzafc * min);
        this.zzafq -= min;
        System.arraycopy(this.zzafk, min * this.zzafc, this.zzafk, 0, this.zzafq * this.zzafc);
    }

    public final void zzcq() {
        int i = this.zzafp;
        int i2 = this.zzafq + ((int) ((((((float) i) / (this.zzaag / this.zzaah)) + ((float) this.zzafr)) / this.zzaah) + 0.5f));
        zzp((this.zzaff * 2) + i);
        for (int i3 = 0; i3 < this.zzaff * 2 * this.zzafc; i3++) {
            this.zzafi[(this.zzafc * i) + i3] = 0;
        }
        this.zzafp += this.zzaff * 2;
        zzdl();
        if (this.zzafq > i2) {
            this.zzafq = i2;
        }
        this.zzafp = 0;
        this.zzafs = 0;
        this.zzafr = 0;
    }

    public final int zzdk() {
        return this.zzafq;
    }

    private final void zzo(int i) {
        if (this.zzafq + i > this.zzafj) {
            this.zzafj += (this.zzafj / 2) + i;
            this.zzafk = Arrays.copyOf(this.zzafk, this.zzafj * this.zzafc);
        }
    }

    private final void zzp(int i) {
        if (this.zzafp + i > this.zzafh) {
            this.zzafh += (this.zzafh / 2) + i;
            this.zzafi = Arrays.copyOf(this.zzafi, this.zzafh * this.zzafc);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzo(i2);
        System.arraycopy(sArr, i * this.zzafc, this.zzafk, this.zzafq * this.zzafc, this.zzafc * i2);
        this.zzafq += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzaff / i2;
        int i4 = this.zzafc * i2;
        int i5 = i * this.zzafc;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                i7 += sArr[(i6 * i4) + i5 + i8];
            }
            this.zzafg[i6] = (short) (i7 / i4);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzafc;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.zzafv = i5 / i6;
        this.zzafw = i7 / i8;
        return i6;
    }

    private final void zzdl() {
        int i;
        int i2;
        int i3;
        int i4 = this.zzafq;
        float f = this.zzaag / this.zzaah;
        double d = (double) f;
        int i5 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            zza(this.zzafi, 0, this.zzafp);
            this.zzafp = 0;
        } else if (this.zzafp >= this.zzaff) {
            int i6 = this.zzafp;
            int i7 = 0;
            while (true) {
                if (this.zzafs > 0) {
                    int min = Math.min(this.zzaff, this.zzafs);
                    zza(this.zzafi, i7, min);
                    this.zzafs -= min;
                    i7 += min;
                } else {
                    short[] sArr = this.zzafi;
                    int i8 = this.zzzu > 4000 ? this.zzzu / 4000 : 1;
                    if (this.zzafc == i5 && i8 == i5) {
                        i = zza(sArr, i7, this.zzafd, this.zzafe);
                    } else {
                        zzb(sArr, i7, i8);
                        int zza = zza(this.zzafg, 0, this.zzafd / i8, this.zzafe / i8);
                        if (i8 != i5) {
                            int i9 = zza * i8;
                            int i10 = i8 << 2;
                            int i11 = i9 - i10;
                            int i12 = i9 + i10;
                            if (i11 < this.zzafd) {
                                i11 = this.zzafd;
                            }
                            if (i12 > this.zzafe) {
                                i12 = this.zzafe;
                            }
                            if (this.zzafc == i5) {
                                i = zza(sArr, i7, i11, i12);
                            } else {
                                zzb(sArr, i7, i5);
                                i = zza(this.zzafg, 0, i11, i12);
                            }
                        } else {
                            i = zza;
                        }
                    }
                    int i13 = this.zzafv;
                    int i14 = i13 != 0 && this.zzaft != 0 && this.zzafw <= i13 * 3 && (i13 << 1) > this.zzafu * 3 ? this.zzaft : i;
                    this.zzafu = this.zzafv;
                    this.zzaft = i;
                    if (d > 1.0d) {
                        short[] sArr2 = this.zzafi;
                        if (f >= 2.0f) {
                            i3 = (int) (((float) i14) / (f - 1.0f));
                        } else {
                            this.zzafs = (int) ((((float) i14) * (2.0f - f)) / (f - 1.0f));
                            i3 = i14;
                        }
                        zzo(i3);
                        int i15 = i3;
                        zza(i3, this.zzafc, this.zzafk, this.zzafq, sArr2, i7, sArr2, i7 + i14);
                        this.zzafq += i15;
                        i7 += i14 + i15;
                    } else {
                        int i16 = i14;
                        int i17 = i7;
                        short[] sArr3 = this.zzafi;
                        if (f < 0.5f) {
                            i2 = (int) ((((float) i16) * f) / (1.0f - f));
                        } else {
                            this.zzafs = (int) ((((float) i16) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                            i2 = i16;
                        }
                        int i18 = i16 + i2;
                        zzo(i18);
                        System.arraycopy(sArr3, this.zzafc * i17, this.zzafk, this.zzafq * this.zzafc, this.zzafc * i16);
                        zza(i2, this.zzafc, this.zzafk, this.zzafq + i16, sArr3, i17 + i16, sArr3, i17);
                        this.zzafq += i18;
                        i7 = i17 + i2;
                    }
                }
                if (this.zzaff + i7 > i6) {
                    break;
                }
                i5 = 1;
            }
            int i19 = this.zzafp - i7;
            System.arraycopy(this.zzafi, i7 * this.zzafc, this.zzafi, 0, this.zzafc * i19);
            this.zzafp = i19;
        }
        if (this.zzaah != 1.0f) {
            float f2 = this.zzaah;
            if (this.zzafq != i4) {
                int i20 = (int) (((float) this.zzzu) / f2);
                int i21 = this.zzzu;
                while (true) {
                    if (i20 <= 16384 && i21 <= 16384) {
                        break;
                    }
                    i20 /= 2;
                    i21 /= 2;
                }
                int i22 = this.zzafq - i4;
                if (this.zzafr + i22 > this.zzafl) {
                    this.zzafl += (this.zzafl / 2) + i22;
                    this.zzafm = Arrays.copyOf(this.zzafm, this.zzafl * this.zzafc);
                }
                System.arraycopy(this.zzafk, this.zzafc * i4, this.zzafm, this.zzafr * this.zzafc, this.zzafc * i22);
                this.zzafq = i4;
                this.zzafr += i22;
                int i23 = 0;
                while (true) {
                    int i24 = 1;
                    if (i23 >= this.zzafr - 1) {
                        break;
                    }
                    while ((this.zzafn + i24) * i20 > this.zzafo * i21) {
                        zzo(i24);
                        for (int i25 = 0; i25 < this.zzafc; i25++) {
                            short[] sArr4 = this.zzafm;
                            int i26 = (this.zzafc * i23) + i25;
                            short s = sArr4[i26];
                            short s2 = sArr4[i26 + this.zzafc];
                            int i27 = (this.zzafn + 1) * i20;
                            int i28 = i27 - (this.zzafo * i21);
                            int i29 = i27 - (this.zzafn * i20);
                            this.zzafk[(this.zzafq * this.zzafc) + i25] = (short) (((s * i28) + ((i29 - i28) * s2)) / i29);
                        }
                        i24 = 1;
                        this.zzafo++;
                        this.zzafq++;
                    }
                    this.zzafn += i24;
                    if (this.zzafn == i21) {
                        this.zzafn = 0;
                        zzpo.checkState(this.zzafo == i20);
                        this.zzafo = 0;
                    }
                    i23++;
                }
                int i30 = this.zzafr - 1;
                if (i30 != 0) {
                    System.arraycopy(this.zzafm, this.zzafc * i30, this.zzafm, 0, (this.zzafr - i30) * this.zzafc);
                    this.zzafr -= i30;
                }
            }
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
