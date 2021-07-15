package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhm;

@zzark
@TargetApi(17)
public final class zzbgz<WebViewT extends zzbhc & zzbhk & zzbhm> {
    private final zzbhb zzfaq;
    private final WebViewT zzfar;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzbhb, com.google.android.gms.internal.ads.zzbha] */
    public static zzbgz<zzbgg> zzk(zzbgg zzbgg) {
        return new zzbgz<>(zzbgg, new zzbha(zzbgg));
    }

    private zzbgz(WebViewT webviewt, zzbhb zzbhb) {
        this.zzfaq = zzbhb;
        this.zzfar = webviewt;
    }
}
