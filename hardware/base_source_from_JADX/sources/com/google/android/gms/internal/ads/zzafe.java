package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

@zzark
public final class zzafe extends zzaei {
    private final NativeCustomTemplateAd.OnCustomClickListener zzdej;

    public zzafe(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzdej = onCustomClickListener;
    }

    public final void zzb(zzadx zzadx, String str) {
        this.zzdej.onCustomClick(zzaea.zza(zzadx), str);
    }
}
