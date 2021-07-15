package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

@zzark
public final class zzafd extends zzaef {
    private final NativeContentAd.OnContentAdLoadedListener zzdei;

    public zzafd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzdei = onContentAdLoadedListener;
    }

    public final void zza(zzadt zzadt) {
        this.zzdei.onContentAdLoaded(new zzadw(zzadt));
    }
}
