package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p000v4.app.NotificationCompat;
import android.support.p000v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.gmsg.zza;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzac;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.gmsg.zzc;
import com.google.android.gms.ads.internal.gmsg.zzd;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzuo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzark
@ParametersAreNonnullByDefault
@VisibleForTesting
public class zzbgh extends WebViewClient implements zzbhn {
    private static final String[] zzext = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] zzexu = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private final Object mLock;
    @Nullable
    protected zzawr zzbmx;
    @GuardedBy("mLock")
    private boolean zzbul;
    private zzvt zzciw;
    private zzb zzder;
    private zzd zzdes;
    private zzw zzdgb;
    private zzaoa zzdgc;
    private zzbgg zzdin;
    private boolean zzdzf;
    @Nullable
    private final zzum zzehw;
    private final HashMap<String, List<zzu<? super zzbgg>>> zzexv;
    private zzn zzexw;
    private zzbho zzexx;
    private zzbhp zzexy;
    private zzbhq zzexz;
    private boolean zzeya;
    @GuardedBy("mLock")
    private boolean zzeyb;
    @GuardedBy("mLock")
    private ViewTreeObserver.OnGlobalLayoutListener zzeyc;
    @GuardedBy("mLock")
    private ViewTreeObserver.OnScrollChangedListener zzeyd;
    @GuardedBy("mLock")
    private boolean zzeye;
    private zzt zzeyf;
    private final zzaoj zzeyg;
    private zzbhr zzeyh;
    private boolean zzeyi;
    private boolean zzeyj;
    private int zzeyk;
    private View.OnAttachStateChangeListener zzeyl;

    public zzbgh(zzbgg zzbgg, zzum zzum, boolean z) {
        this(zzbgg, zzum, z, new zzaoj(zzbgg, zzbgg.zzadg(), new zzzy(zzbgg.getContext())), (zzaoa) null);
    }

    @VisibleForTesting
    private zzbgh(zzbgg zzbgg, zzum zzum, boolean z, zzaoj zzaoj, zzaoa zzaoa) {
        this.zzexv = new HashMap<>();
        this.mLock = new Object();
        this.zzeya = false;
        this.zzehw = zzum;
        this.zzdin = zzbgg;
        this.zzbul = z;
        this.zzeyg = zzaoj;
        this.zzdgc = null;
    }

    public final void zza(int i, int i2, boolean z) {
        this.zzeyg.zzj(i, i2);
        if (this.zzdgc != null) {
            this.zzdgc.zza(i, i2, z);
        }
    }

    public final void zza(zzvt zzvt, zzb zzb, zzn zzn, zzd zzd, zzt zzt, boolean z, @Nullable zzy zzy, zzw zzw, zzaol zzaol, @Nullable zzawr zzawr) {
        if (zzw == null) {
            zzw = new zzw(this.zzdin.getContext(), zzawr, (zzaso) null);
        }
        this.zzdgc = new zzaoa(this.zzdin, zzaol);
        this.zzbmx = zzawr;
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcrk)).booleanValue()) {
            zza("/adMetadata", (zzu<? super zzbgg>) new zza(zzb));
        }
        zza("/appEvent", (zzu<? super zzbgg>) new zzc(zzd));
        zza("/backButton", (zzu<? super zzbgg>) zzf.zzdfc);
        zza("/refresh", (zzu<? super zzbgg>) zzf.zzdfd);
        zza("/canOpenURLs", (zzu<? super zzbgg>) zzf.zzdet);
        zza("/canOpenIntents", (zzu<? super zzbgg>) zzf.zzdeu);
        zza("/click", (zzu<? super zzbgg>) zzf.zzdev);
        zza("/close", (zzu<? super zzbgg>) zzf.zzdew);
        zza("/customClose", (zzu<? super zzbgg>) zzf.zzdex);
        zza("/instrument", (zzu<? super zzbgg>) zzf.zzdfg);
        zza("/delayPageLoaded", (zzu<? super zzbgg>) zzf.zzdfi);
        zza("/delayPageClosed", (zzu<? super zzbgg>) zzf.zzdfj);
        zza("/getLocationInfo", (zzu<? super zzbgg>) zzf.zzdfk);
        zza("/httpTrack", (zzu<? super zzbgg>) zzf.zzdey);
        zza("/log", (zzu<? super zzbgg>) zzf.zzdez);
        zza("/mraid", (zzu<? super zzbgg>) new zzab(zzw, this.zzdgc, zzaol));
        zza("/mraidLoaded", (zzu<? super zzbgg>) this.zzeyg);
        zza("/open", (zzu<? super zzbgg>) new zzac(zzw, this.zzdgc));
        zza("/precache", (zzu<? super zzbgg>) new zzbfq());
        zza("/touch", (zzu<? super zzbgg>) zzf.zzdfb);
        zza("/video", (zzu<? super zzbgg>) zzf.zzdfe);
        zza("/videoMeta", (zzu<? super zzbgg>) zzf.zzdff);
        if (zzbv.zzmf().zzv(this.zzdin.getContext())) {
            zza("/logScionEvent", (zzu<? super zzbgg>) new zzaa(this.zzdin.getContext()));
        }
        if (zzy != null) {
            zza("/setInterstitialProperties", (zzu<? super zzbgg>) new zzx(zzy));
        }
        this.zzciw = zzvt;
        this.zzexw = zzn;
        this.zzder = zzb;
        this.zzdes = zzd;
        this.zzeyf = zzt;
        this.zzdgb = zzw;
        this.zzeya = z;
    }

    public final zzw zzaea() {
        return this.zzdgb;
    }

    public final boolean zzmu() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbul;
        }
        return z;
    }

    public final boolean zzaeb() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzeyb;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzaec() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.mLock) {
            onGlobalLayoutListener = this.zzeyc;
        }
        return onGlobalLayoutListener;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzaed() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.mLock) {
            onScrollChangedListener = this.zzeyd;
        }
        return onScrollChangedListener;
    }

    public final boolean zzaee() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzeye;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.zzexy == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.zzexy.zzuc();
        r0.zzexy = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        zzaek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzeyi = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.mLock
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbgg r2 = r0.zzdin     // Catch:{ all -> 0x002b }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.zzaxz.m30v(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.zzbgg r2 = r0.zzdin     // Catch:{ all -> 0x002b }
            r2.zzadr()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.zzeyi = r1
            com.google.android.gms.internal.ads.zzbhp r1 = r0.zzexy
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.zzbhp r1 = r0.zzexy
            r1.zzuc()
            r1 = 0
            r0.zzexy = r1
        L_0x0027:
            r0.zzaek()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgh.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public final void zza(View view, zzawr zzawr, int i) {
        if (zzawr.zzxq() && i > 0) {
            zzawr.zzs(view);
            if (zzawr.zzxq()) {
                zzayh.zzelc.postDelayed(new zzbgj(this, view, zzawr, i), 100);
            }
        }
    }

    private final void zzaef() {
        if (this.zzeyl != null) {
            this.zzdin.getView().removeOnAttachStateChangeListener(this.zzeyl);
        }
    }

    public final void zzaeg() {
        zzawr zzawr = this.zzbmx;
        if (zzawr != null) {
            WebView webView = this.zzdin.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza((View) webView, zzawr, 10);
                return;
            }
            zzaef();
            this.zzeyl = new zzbgk(this, zzawr);
            this.zzdin.getView().addOnAttachStateChangeListener(this.zzeyl);
        }
    }

    public final void zzaeh() {
        synchronized (this.mLock) {
            this.zzeye = true;
        }
        this.zzeyk++;
        zzaek();
    }

    public final void zzaei() {
        this.zzeyk--;
        zzaek();
    }

    public final void zzaej() {
        this.zzeyj = true;
        zzaek();
    }

    private final void zzaek() {
        if (this.zzexx != null && ((this.zzeyi && this.zzeyk <= 0) || this.zzeyj)) {
            this.zzexx.zzp(!this.zzeyj);
            this.zzexx = null;
        }
        this.zzdin.zzadw();
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzc) {
        zzn zzn;
        boolean zzadq = this.zzdin.zzadq();
        zzvt zzvt = (!zzadq || this.zzdin.zzadj().zzafb()) ? this.zzciw : null;
        if (zzadq) {
            zzn = null;
        } else {
            zzn = this.zzexw;
        }
        zza(new AdOverlayInfoParcel(zzc, zzvt, zzn, this.zzeyf, this.zzdin.zzabz()));
    }

    public final void zzb(boolean z, int i) {
        zza(new AdOverlayInfoParcel((!this.zzdin.zzadq() || this.zzdin.zzadj().zzafb()) ? this.zzciw : null, this.zzexw, this.zzeyf, this.zzdin, z, i, this.zzdin.zzabz()));
    }

    public final void zza(boolean z, int i, String str) {
        zzbgl zzbgl;
        boolean zzadq = this.zzdin.zzadq();
        zzvt zzvt = (!zzadq || this.zzdin.zzadj().zzafb()) ? this.zzciw : null;
        if (zzadq) {
            zzbgl = null;
        } else {
            zzbgl = new zzbgl(this.zzdin, this.zzexw);
        }
        zza(new AdOverlayInfoParcel(zzvt, zzbgl, this.zzder, this.zzdes, this.zzeyf, this.zzdin, z, i, str, this.zzdin.zzabz()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzbgl zzbgl;
        boolean zzadq = this.zzdin.zzadq();
        zzvt zzvt = (!zzadq || this.zzdin.zzadj().zzafb()) ? this.zzciw : null;
        if (zzadq) {
            zzbgl = null;
        } else {
            zzbgl = new zzbgl(this.zzdin, this.zzexw);
        }
        zza(new AdOverlayInfoParcel(zzvt, zzbgl, this.zzder, this.zzdes, this.zzeyf, this.zzdin, z, i, str, str2, this.zzdin.zzabz()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean zzvm = this.zzdgc != null ? this.zzdgc.zzvm() : false;
        zzbv.zzld();
        Context context = this.zzdin.getContext();
        if (!zzvm) {
            z = true;
        }
        zzl.zza(context, adOverlayInfoParcel, z);
        if (this.zzbmx != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdrs != null) {
                str = adOverlayInfoParcel.zzdrs.url;
            }
            this.zzbmx.zzdi(str);
        }
    }

    public final void zza(String str, zzu<? super zzbgg> zzu) {
        synchronized (this.mLock) {
            List list = this.zzexv.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zzexv.put(str, list);
            }
            list.add(zzu);
        }
    }

    public final void zzb(String str, zzu<? super zzbgg> zzu) {
        synchronized (this.mLock) {
            List list = this.zzexv.get(str);
            if (list != null) {
                list.remove(zzu);
            }
        }
    }

    public final void zza(String str, Predicate<zzu<? super zzbgg>> predicate) {
        synchronized (this.mLock) {
            List<zzu> list = this.zzexv.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzu zzu : list) {
                    if (predicate.apply(zzu)) {
                        arrayList.add(zzu);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void reset() {
        if (this.zzbmx != null) {
            this.zzbmx.zzxs();
            this.zzbmx = null;
        }
        zzaef();
        synchronized (this.mLock) {
            this.zzexv.clear();
            this.zzciw = null;
            this.zzexw = null;
            this.zzexx = null;
            this.zzexy = null;
            this.zzder = null;
            this.zzdes = null;
            this.zzeya = false;
            this.zzbul = false;
            this.zzeyb = false;
            this.zzeye = false;
            this.zzeyf = null;
            this.zzexz = null;
            if (this.zzdgc != null) {
                this.zzdgc.zzx(true);
                this.zzdgc = null;
            }
        }
    }

    public final void zza(zzbho zzbho) {
        this.zzexx = zzbho;
    }

    public final void zza(zzbhp zzbhp) {
        this.zzexy = zzbhp;
    }

    public final void zza(zzbhq zzbhq) {
        this.zzexz = zzbhq;
    }

    public final void zza(zzbhr zzbhr) {
        this.zzeyh = zzbhr;
    }

    public final zzbhr zzael() {
        return this.zzeyh;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxz.m30v(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        int i2;
        if (i >= 0 || (-i) - 1 >= zzext.length) {
            str3 = String.valueOf(i);
        } else {
            str3 = zzext[i2];
        }
        zzd(this.zzdin.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= zzexu.length) {
                str = String.valueOf(primaryError);
            } else {
                str = zzexu[primaryError];
            }
            zzd(this.zzdin.getContext(), "ssl_err", str, zzbv.zzlh().zza(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    private final void zzd(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcsx)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_ERROR, str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    zzbv.zzlf().zza(context, this.zzdin.zzabz().zzdp, "gmob-apps", bundle, true);
                }
            }
            str4 = BuildConfig.FLAVOR;
            bundle.putString("host", str4);
            zzbv.zzlf().zza(context, this.zzdin.zzabz().zzdp, "gmob-apps", bundle, true);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxz.m30v(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzeya && webView == this.zzdin.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.zzciw != null) {
                        this.zzciw.onAdClicked();
                        if (this.zzbmx != null) {
                            this.zzbmx.zzdi(str);
                        }
                        this.zzciw = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzdin.getWebView().willNotDraw()) {
                try {
                    zzcu zzado = this.zzdin.zzado();
                    if (zzado != null && zzado.zzb(parse)) {
                        parse = zzado.zza(parse, this.zzdin.getContext(), this.zzdin.getView(), this.zzdin.zzabw());
                    }
                } catch (zzcv unused) {
                    String valueOf2 = String.valueOf(str);
                    zzaxz.zzeo(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                if (this.zzdgb == null || this.zzdgb.zzju()) {
                    zza(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.zzdgb.zzas(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzaxz.zzeo(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            zzi(parse);
        }
        return true;
    }

    @Nullable
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zztv zza;
        try {
            String zzb = zzawz.zzb(str, this.zzdin.getContext(), this.zzdzf);
            if (!zzb.equals(str)) {
                return zze(zzb, map);
            }
            zzty zzbb = zzty.zzbb(str);
            if (zzbb != null && (zza = zzbv.zzll().zza(zzbb)) != null && zza.zzoe()) {
                return new WebResourceResponse(BuildConfig.FLAVOR, BuildConfig.FLAVOR, zza.zzof());
            }
            if (zzbax.isEnabled()) {
                if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcso)).booleanValue()) {
                    return zze(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzbv.zzlj().zza(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    private final WebResourceResponse zze(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzbv.zzlf().zza(this.zzdin.getContext(), this.zzdin.zzabz().zzdp, false, httpURLConnection);
                    zzbax zzbax = new zzbax();
                    zzbax.zza(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzbax.zza(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzbv.zzlf();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzaxz.zzeo("Protocol is null");
                                return null;
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                zzaxz.zzdn(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzaxz.zzeo(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzbv.zzlf();
        return zzayh.zzd(httpURLConnection);
    }

    public final void zzat(boolean z) {
        this.zzeya = z;
    }

    public final zzawr zzaem() {
        return this.zzbmx;
    }

    public final void zza(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.mLock) {
            this.zzeyb = true;
            this.zzdin.zzadv();
            this.zzeyc = onGlobalLayoutListener;
            this.zzeyd = onScrollChangedListener;
        }
    }

    public final void zzvr() {
        synchronized (this.mLock) {
            this.zzeya = false;
            this.zzbul = true;
            zzbcg.zzepo.execute(new zzbgi(this));
        }
    }

    public final void zzay(boolean z) {
        this.zzdzf = z;
    }

    public final void zzi(int i, int i2) {
        if (this.zzdgc != null) {
            this.zzdgc.zzi(i, i2);
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    private final void zzi(Uri uri) {
        String path = uri.getPath();
        List<zzu> list = this.zzexv.get(path);
        if (list != null) {
            zzbv.zzlf();
            Map<String, String> zzg = zzayh.zzg(uri);
            if (zzaxz.isLoggable(2)) {
                String valueOf = String.valueOf(path);
                zzaxz.m30v(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : zzg.keySet()) {
                    String str = zzg.get(next);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length());
                    sb.append("  ");
                    sb.append(next);
                    sb.append(": ");
                    sb.append(str);
                    zzaxz.m30v(sb.toString());
                }
            }
            for (zzu zza : list) {
                zza.zza(this.zzdin, zzg);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        zzaxz.m30v(sb2.toString());
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.zzehw != null) {
            this.zzehw.zza(zzuo.zza.zzb.ANDROID_WEBVIEW_CRASH);
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaen() {
        this.zzdin.zzadv();
        com.google.android.gms.ads.internal.overlay.zzd zzadh = this.zzdin.zzadh();
        if (zzadh != null) {
            zzadh.zzvr();
        }
        if (this.zzexz != null) {
            this.zzexz.zzjx();
            this.zzexz = null;
        }
    }
}
