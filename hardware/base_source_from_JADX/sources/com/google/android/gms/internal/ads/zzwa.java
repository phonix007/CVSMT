package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

@zzark
public final class zzwa extends zzxr {
    private final AdMetadataListener zzcja;

    public zzwa(AdMetadataListener adMetadataListener) {
        this.zzcja = adMetadataListener;
    }

    public final void onAdMetadataChanged() {
        if (this.zzcja != null) {
            this.zzcja.onAdMetadataChanged();
        }
    }
}
