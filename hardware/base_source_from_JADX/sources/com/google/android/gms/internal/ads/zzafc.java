package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

@zzark
public final class zzafc extends zzaec {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzdeh;

    public zzafc(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzdeh = onAppInstallAdLoadedListener;
    }

    public final void zza(zzadp zzadp) {
        this.zzdeh.onAppInstallAdLoaded(new zzads(zzadp));
    }
}
