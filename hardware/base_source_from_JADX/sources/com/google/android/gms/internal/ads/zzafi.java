package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

@zzark
public final class zzafi extends zzaer {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzdep;

    public zzafi(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzdep = onUnifiedNativeAdLoadedListener;
    }

    public final void zza(zzaew zzaew) {
        this.zzdep.onUnifiedNativeAdLoaded(new zzaez(zzaew));
    }
}
