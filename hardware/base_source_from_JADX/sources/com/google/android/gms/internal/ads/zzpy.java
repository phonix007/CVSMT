package com.google.android.gms.internal.ads;

public final class zzpy {
    private byte[] data;
    private int zzbhx;
    private int zzbhy = 0;
    private int zzbhz;

    public zzpy(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbhx = i;
        this.zzbhz = i2;
        zzhn();
    }

    public final void zzbn(int i) {
        int i2 = this.zzbhx;
        this.zzbhx += i / 8;
        this.zzbhy += i % 8;
        if (this.zzbhy > 7) {
            this.zzbhx++;
            this.zzbhy -= 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzbhx) {
                zzhn();
                return;
            } else if (zzbo(i2)) {
                this.zzbhx++;
                i2 += 2;
            }
        }
    }

    public final boolean zzhj() {
        return zzbj(1) == 1;
    }

    public final int zzbj(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = zzbo(this.zzbhx + 1) ? this.zzbhx + 2 : this.zzbhx + 1;
            if (this.zzbhy != 0) {
                b2 = ((this.data[i4] & 255) >>> (8 - this.zzbhy)) | ((this.data[this.zzbhx] & 255) << this.zzbhy);
            } else {
                b2 = this.data[this.zzbhx];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.zzbhx = i4;
        }
        if (i > 0) {
            int i5 = this.zzbhy + i;
            byte b4 = (byte) (255 >> (8 - i));
            int i6 = zzbo(this.zzbhx + 1) ? this.zzbhx + 2 : this.zzbhx + 1;
            if (i5 > 8) {
                b = (b4 & (((255 & this.data[i6]) >> (16 - i5)) | ((this.data[this.zzbhx] & 255) << (i5 - 8)))) | b3;
                this.zzbhx = i6;
            } else {
                b = (b4 & ((255 & this.data[this.zzbhx]) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.zzbhx = i6;
                }
            }
            b3 = b;
            this.zzbhy = i5 % 8;
        }
        zzhn();
        return b3;
    }

    public final int zzhk() {
        return zzhm();
    }

    public final int zzhl() {
        int zzhm = zzhm();
        return (zzhm % 2 == 0 ? -1 : 1) * ((zzhm + 1) / 2);
    }

    private final int zzhm() {
        int i = 0;
        int i2 = 0;
        while (!zzhj()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = zzbj(i2);
        }
        return i3 + i;
    }

    private final boolean zzbo(int i) {
        return 2 <= i && i < this.zzbhz && this.data[i] == 3 && this.data[i + -2] == 0 && this.data[i - 1] == 0;
    }

    private final void zzhn() {
        zzpo.checkState(this.zzbhx >= 0 && this.zzbhy >= 0 && this.zzbhy < 8 && (this.zzbhx < this.zzbhz || (this.zzbhx == this.zzbhz && this.zzbhy == 0)));
    }
}
