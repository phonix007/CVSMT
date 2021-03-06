package com.google.android.gms.internal.ads;

public final class zzbpk {
    private final byte[] zzfku = new byte[256];
    private int zzfkv;
    private int zzfkw;

    public zzbpk(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zzfku[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.zzfku[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.zzfku[i2];
            this.zzfku[i2] = this.zzfku[b];
            this.zzfku[b] = b2;
        }
        this.zzfkv = 0;
        this.zzfkw = 0;
    }

    public final void zzq(byte[] bArr) {
        int i = this.zzfkv;
        int i2 = this.zzfkw;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.zzfku[i]) & 255;
            byte b = this.zzfku[i];
            this.zzfku[i] = this.zzfku[i2];
            this.zzfku[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.zzfku[(this.zzfku[i] + this.zzfku[i2]) & 255]);
        }
        this.zzfkv = i;
        this.zzfkw = i2;
    }
}
