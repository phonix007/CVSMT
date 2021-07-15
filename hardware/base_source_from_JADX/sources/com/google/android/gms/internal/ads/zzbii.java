package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@zzark
final class zzbii {
    @GuardedBy("InvokeJavascriptWorkaround.class")
    @VisibleForTesting
    private static Boolean zzfbi;

    private zzbii() {
    }

    @TargetApi(19)
    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzbii.class) {
            if (zzfbi == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    zzfbi = true;
                } catch (IllegalStateException unused) {
                    zzfbi = false;
                }
            }
            booleanValue = zzfbi.booleanValue();
        }
        return booleanValue;
    }

    @TargetApi(19)
    static void zza(WebView webView, String str) {
        if (!PlatformVersion.isAtLeastKitKat() || !zzb(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
