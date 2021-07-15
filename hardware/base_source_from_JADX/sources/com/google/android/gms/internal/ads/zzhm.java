package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class zzhm {
    private final MediaCodec.CryptoInfo zzagd;
    private final MediaCodec.CryptoInfo.Pattern zzagf;

    private zzhm(MediaCodec.CryptoInfo cryptoInfo) {
        this.zzagd = cryptoInfo;
        this.zzagf = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    public final void set(int i, int i2) {
        this.zzagf.set(i, i2);
        this.zzagd.setPattern(this.zzagf);
    }
}
