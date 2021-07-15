package com.google.android.gms.internal.measurement;

import android.support.p003v7.widget.ActivityChooserView;
import com.apps.saiinfo.computerhardware.BuildConfig;
import java.io.IOException;
import java.util.Arrays;

final class zzvb extends zzuz {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbvh;
    private int zzbvi;
    private int zzbvj;
    private int zzbvk;
    private int zzbvl;

    private zzvb(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzbvl = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzbvj = this.pos;
        this.zzbvh = z;
    }

    public final int zzuq() throws IOException {
        if (zzvg()) {
            this.zzbvk = 0;
            return 0;
        }
        this.zzbvk = zzvi();
        if ((this.zzbvk >>> 3) != 0) {
            return this.zzbvk;
        }
        throw new zzwe("Protocol message contained an invalid tag (zero).");
    }

    public final void zzao(int i) throws zzwe {
        if (this.zzbvk != i) {
            throw zzwe.zzxa();
        }
    }

    public final boolean zzap(int i) throws IOException {
        int zzuq;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.limit - this.pos >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.buffer;
                        int i3 = this.pos;
                        this.pos = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw zzwe.zzwz();
                }
                while (i2 < 10) {
                    if (zzvn() < 0) {
                        i2++;
                    }
                }
                throw zzwe.zzwz();
                return true;
            case 1:
                zzat(8);
                return true;
            case 2:
                zzat(zzvi());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzat(4);
                return true;
            default:
                throw zzwe.zzxb();
        }
        do {
            zzuq = zzuq();
            if (zzuq == 0 || !zzap(zzuq)) {
                zzao(((i >>> 3) << 3) | 4);
                return true;
            }
            zzuq = zzuq();
            zzao(((i >>> 3) << 3) | 4);
            return true;
        } while (!zzap(zzuq));
        zzao(((i >>> 3) << 3) | 4);
        return true;
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzvl());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzvk());
    }

    public final long zzur() throws IOException {
        return zzvj();
    }

    public final long zzus() throws IOException {
        return zzvj();
    }

    public final int zzut() throws IOException {
        return zzvi();
    }

    public final long zzuu() throws IOException {
        return zzvl();
    }

    public final int zzuv() throws IOException {
        return zzvk();
    }

    public final boolean zzuw() throws IOException {
        return zzvj() != 0;
    }

    public final String readString() throws IOException {
        int zzvi = zzvi();
        if (zzvi > 0 && zzvi <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzvi, zzvz.UTF_8);
            this.pos += zzvi;
            return str;
        } else if (zzvi == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (zzvi < 0) {
                throw zzwe.zzwy();
            }
            throw zzwe.zzwx();
        }
    }

    public final String zzux() throws IOException {
        int zzvi = zzvi();
        if (zzvi > 0 && zzvi <= this.limit - this.pos) {
            String zzh = zzyu.zzh(this.buffer, this.pos, zzvi);
            this.pos += zzvi;
            return zzh;
        } else if (zzvi == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (zzvi <= 0) {
                throw zzwe.zzwy();
            }
            throw zzwe.zzwx();
        }
    }

    public final <T extends zzxe> T zza(zzxo<T> zzxo, zzvk zzvk) throws IOException {
        int zzvi = zzvi();
        if (this.zzbvc < this.zzbvd) {
            int zzar = zzar(zzvi);
            this.zzbvc++;
            T t = (zzxe) zzxo.zza(this, zzvk);
            zzao(0);
            this.zzbvc--;
            zzas(zzar);
            return t;
        }
        throw zzwe.zzxc();
    }

    public final zzun zzuy() throws IOException {
        byte[] bArr;
        int zzvi = zzvi();
        if (zzvi > 0 && zzvi <= this.limit - this.pos) {
            zzun zzb = zzun.zzb(this.buffer, this.pos, zzvi);
            this.pos += zzvi;
            return zzb;
        } else if (zzvi == 0) {
            return zzun.zzbuu;
        } else {
            if (zzvi > 0 && zzvi <= this.limit - this.pos) {
                int i = this.pos;
                this.pos += zzvi;
                bArr = Arrays.copyOfRange(this.buffer, i, this.pos);
            } else if (zzvi > 0) {
                throw zzwe.zzwx();
            } else if (zzvi == 0) {
                bArr = zzvz.zzcae;
            } else {
                throw zzwe.zzwy();
            }
            return zzun.zzi(bArr);
        }
    }

    public final int zzuz() throws IOException {
        return zzvi();
    }

    public final int zzva() throws IOException {
        return zzvi();
    }

    public final int zzvb() throws IOException {
        return zzvk();
    }

    public final long zzvc() throws IOException {
        return zzvl();
    }

    public final int zzvd() throws IOException {
        int zzvi = zzvi();
        return (-(zzvi & 1)) ^ (zzvi >>> 1);
    }

    public final long zzve() throws IOException {
        long zzvj = zzvj();
        return (-(zzvj & 1)) ^ (zzvj >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzvi() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.buffer
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.pos = r2
            return r0
        L_0x0011:
            int r3 = r5.limit
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.pos = r3
            return r0
        L_0x006d:
            long r0 = r5.zzvf()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzvb.zzvi():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((long) r1[r0]) >= 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzvj() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.pos
            int r1 = r11.limit
            if (r1 == r0) goto L_0x00bb
            byte[] r1 = r11.buffer
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0012
            r11.pos = r2
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r3 = r11.limit
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x00bb
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0025:
            r9 = r0
            r0 = r3
        L_0x0027:
            r2 = r9
            goto L_0x00b8
        L_0x002a:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0039
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r0 = r2
            goto L_0x0027
        L_0x0039:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0048
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0025
        L_0x0048:
            long r4 = (long) r0
            int r0 = r3 + 1
            byte r2 = r1[r3]
            long r2 = (long) r2
            r6 = 28
            long r2 = r2 << r6
            long r2 = r2 ^ r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x005d
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x005d:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r2
        L_0x0070:
            r2 = r0
        L_0x0071:
            r0 = r6
            goto L_0x00b8
        L_0x0073:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 42
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0087
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r2 = r2 ^ r4
            goto L_0x00b8
        L_0x0087:
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r2 = r2 ^ r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r2
            goto L_0x0070
        L_0x009b:
            int r0 = r6 + 1
            byte r6 = r1[r6]
            long r6 = (long) r6
            r8 = 56
            long r6 = r6 << r8
            long r2 = r2 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r2 = r2 ^ r6
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b8
            int r6 = r0 + 1
            byte r0 = r1[r0]
            long r0 = (long) r0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x00bb
            goto L_0x0071
        L_0x00b8:
            r11.pos = r0
            return r2
        L_0x00bb:
            long r0 = r11.zzvf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzvb.zzvj():long");
    }

    /* access modifiers changed from: package-private */
    public final long zzvf() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzvn = zzvn();
            j |= ((long) (zzvn & Byte.MAX_VALUE)) << i;
            if ((zzvn & 128) == 0) {
                return j;
            }
        }
        throw zzwe.zzwz();
    }

    private final int zzvk() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 4) {
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzwe.zzwx();
    }

    private final long zzvl() throws IOException {
        int i = this.pos;
        if (this.limit - i >= 8) {
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzwe.zzwx();
    }

    public final int zzar(int i) throws zzwe {
        if (i >= 0) {
            int zzvh = i + zzvh();
            int i2 = this.zzbvl;
            if (zzvh <= i2) {
                this.zzbvl = zzvh;
                zzvm();
                return i2;
            }
            throw zzwe.zzwx();
        }
        throw zzwe.zzwy();
    }

    private final void zzvm() {
        this.limit += this.zzbvi;
        int i = this.limit - this.zzbvj;
        if (i > this.zzbvl) {
            this.zzbvi = i - this.zzbvl;
            this.limit -= this.zzbvi;
            return;
        }
        this.zzbvi = 0;
    }

    public final void zzas(int i) {
        this.zzbvl = i;
        zzvm();
    }

    public final boolean zzvg() throws IOException {
        return this.pos == this.limit;
    }

    public final int zzvh() {
        return this.pos - this.zzbvj;
    }

    private final byte zzvn() throws IOException {
        if (this.pos != this.limit) {
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }
        throw zzwe.zzwx();
    }

    public final void zzat(int i) throws IOException {
        if (i >= 0 && i <= this.limit - this.pos) {
            this.pos += i;
        } else if (i < 0) {
            throw zzwe.zzwy();
        } else {
            throw zzwe.zzwx();
        }
    }
}
