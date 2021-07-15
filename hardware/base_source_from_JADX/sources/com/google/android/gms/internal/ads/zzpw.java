package com.google.android.gms.internal.ads;

public final class zzpw {
    private byte[] data;
    private int zzbhx;
    private int zzbhy;
    private int zzbhz;

    public zzpw() {
    }

    public zzpw(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzpw(byte[] bArr, int i) {
        this.data = bArr;
        this.zzbhz = i;
    }

    public final int zzbj(int i) {
        byte b;
        byte b2;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        int i3 = i;
        byte b3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this.zzbhy != 0) {
                b2 = ((this.data[this.zzbhx + 1] & 255) >>> (8 - this.zzbhy)) | ((this.data[this.zzbhx] & 255) << this.zzbhy);
            } else {
                b2 = this.data[this.zzbhx];
            }
            i3 -= 8;
            b3 |= (255 & b2) << i3;
            this.zzbhx++;
        }
        if (i3 > 0) {
            int i5 = this.zzbhy + i3;
            byte b4 = (byte) (255 >> (8 - i3));
            if (i5 > 8) {
                b = (b4 & (((this.data[this.zzbhx] & 255) << (i5 - 8)) | ((255 & this.data[this.zzbhx + 1]) >> (16 - i5)))) | b3;
                this.zzbhx++;
            } else {
                b = (b4 & ((this.data[this.zzbhx] & 255) >> (8 - i5))) | b3;
                if (i5 == 8) {
                    this.zzbhx++;
                }
            }
            b3 = b;
            this.zzbhy = i5 % 8;
        }
        if (this.zzbhx >= 0 && this.zzbhy >= 0 && this.zzbhy < 8 && (this.zzbhx < this.zzbhz || (this.zzbhx == this.zzbhz && this.zzbhy == 0))) {
            z = true;
        }
        zzpo.checkState(z);
        return b3;
    }
}
