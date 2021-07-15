package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.PlatformVersion;

@zzark
@TargetApi(11)
public final class zzbfy extends WebChromeClient {
    private final zzbgg zzdin;

    public zzbfy(zzbgg zzbgg) {
        this.zzdin = zzbgg;
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzw zzaea;
        try {
            if (this.zzdin == null || this.zzdin.zzadl() == null || this.zzdin.zzadl().zzaea() == null || (zzaea = this.zzdin.zzadl().zzaea()) == null || zzaea.zzju()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new zzbge(jsPromptResult, editText)).setNegativeButton(17039360, new zzbgd(jsPromptResult)).setOnCancelListener(new zzbgc(jsPromptResult)).create().show();
                } else {
                    builder.setMessage(str3).setPositiveButton(17039370, new zzbgb(jsResult)).setNegativeButton(17039360, new zzbga(jsResult)).setOnCancelListener(new zzbfz(jsResult)).create().show();
                }
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzaea.zzas(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            zzaxz.zzc("Fail to display Dialog.", e);
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzdin.zzadm() != null) {
            webView2.setWebViewClient(this.zzdin.zzadm());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzbgg)) {
            zzaxz.zzeo("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzd zzadh = ((zzbgg) webView).zzadh();
        if (zzadh == null) {
            zzaxz.zzeo("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzadh.close();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (zzbgf.zzexs[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                zzaxz.m31e(sb2);
                break;
            case 2:
                zzaxz.zzeo(sb2);
                break;
            case 3:
            case 4:
                zzaxz.zzen(sb2);
                break;
            case 5:
                zzaxz.zzdn(sb2);
                break;
            default:
                zzaxz.zzen(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(PlaybackStateCompat.ACTION_PREPARE_FROM_URI, j4), PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            } else if (j2 <= Math.min(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        zzd zzadh = this.zzdin.zzadh();
        if (zzadh == null) {
            zzaxz.zzeo("Could not get ad overlay when hiding custom view.");
        } else {
            zzadh.zzvo();
        }
    }

    private static Context zza(WebView webView) {
        if (!(webView instanceof zzbgg)) {
            return webView.getContext();
        }
        zzbgg zzbgg = (zzbgg) webView;
        Activity zzabw = zzbgg.zzabw();
        if (zzabw != null) {
            return zzabw;
        }
        return zzbgg.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzd zzadh = this.zzdin.zzadh();
        if (zzadh == null) {
            zzaxz.zzeo("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzadh.zza(view, customViewCallback);
        zzadh.setRequestedOrientation(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzbv.zzlf();
            if (!zzayh.zzn(this.zzdin.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbv.zzlf();
                if (!zzayh.zzn(this.zzdin.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.isAtLeastLollipop()) {
            if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcrf)).booleanValue()) {
                if (this.zzdin == null || this.zzdin.zzadl() == null || this.zzdin.zzadl().zzaem() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] zzb = this.zzdin.zzadl().zzaem().zzb(permissionRequest.getResources());
                if (zzb.length > 0) {
                    permissionRequest.grant(zzb);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }
}
