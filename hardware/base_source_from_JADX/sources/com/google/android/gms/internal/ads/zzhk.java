package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class zzhk {

    /* renamed from: iv */
    public byte[] f46iv;
    private byte[] key;
    private int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    private int numSubSamples;
    private int zzagb;
    private int zzagc;
    private final MediaCodec.CryptoInfo zzagd;
    private final zzhm zzage;

    public zzhk() {
        this.zzagd = zzqe.SDK_INT >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzage = zzqe.SDK_INT >= 24 ? new zzhm(this.zzagd) : null;
    }

    public final void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.f46iv = bArr2;
        this.mode = i2;
        this.zzagb = 0;
        this.zzagc = 0;
        if (zzqe.SDK_INT >= 16) {
            this.zzagd.numSubSamples = this.numSubSamples;
            this.zzagd.numBytesOfClearData = this.numBytesOfClearData;
            this.zzagd.numBytesOfEncryptedData = this.numBytesOfEncryptedData;
            this.zzagd.key = this.key;
            this.zzagd.iv = this.f46iv;
            this.zzagd.mode = this.mode;
            if (zzqe.SDK_INT >= 24) {
                this.zzage.set(0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo zzdr() {
        return this.zzagd;
    }
}
