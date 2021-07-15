package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@zzark
@TargetApi(11)
public final class zzbhe extends zzbhf {
    public zzbhe(zzbgg zzbgg, zzum zzum, boolean z) {
        super(zzbgg, zzum, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
