package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzark
public final class zzaff extends zzael {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzdek;

    public zzaff(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzdek = onCustomTemplateAdLoadedListener;
    }

    public final void zzb(zzadx zzadx) {
        this.zzdek.onCustomTemplateAdLoaded(zzaea.zza(zzadx));
    }
}
