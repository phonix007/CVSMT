package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

@zzark
@ParametersAreNonnullByDefault
@VisibleForTesting
final class zzbib extends zzbig implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzaic, zzbgg {
    private final zzv zzbly;
    private final zzbbi zzbob;
    private zzbas zzbuf;
    private final WindowManager zzbuv;
    @Nullable
    private final zzcu zzdcf;
    private int zzdqf = -1;
    private int zzdqg = -1;
    private int zzdqi = -1;
    private int zzdqj = -1;
    @GuardedBy("this")
    private String zzetu = BuildConfig.FLAVOR;
    private zzaay zzetv;
    private final zzbo zzezg;
    @GuardedBy("this")
    private zzd zzezl;
    @GuardedBy("this")
    private zzbht zzezn;
    @GuardedBy("this")
    private boolean zzezo;
    @GuardedBy("this")
    private boolean zzezp;
    @GuardedBy("this")
    private boolean zzezq;
    @GuardedBy("this")
    private int zzezr;
    @GuardedBy("this")
    private boolean zzezs = true;
    @GuardedBy("this")
    private boolean zzezt = false;
    @GuardedBy("this")
    private zzbgw zzezu;
    @GuardedBy("this")
    private boolean zzezv;
    @GuardedBy("this")
    private boolean zzezw;
    @GuardedBy("this")
    private zzacb zzezx;
    @GuardedBy("this")
    private int zzezy;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public int zzezz;
    private zzaay zzfaa;
    private zzaay zzfab;
    private zzaaz zzfac;
    private WeakReference<View.OnClickListener> zzfad;
    @GuardedBy("this")
    private zzd zzfae;
    private Map<String, zzbfk> zzfag;
    private final zzbhs zzfaz;
    private final zzbhu zzfba;
    private final AtomicReference<IObjectWrapper> zzfbb = new AtomicReference<>();
    private float zzfbc;
    @GuardedBy("this")
    private String zzvv;

    @VisibleForTesting
    protected zzbib(zzbhs zzbhs, zzbhu zzbhu, zzbht zzbht, String str, boolean z, boolean z2, @Nullable zzcu zzcu, zzbbi zzbbi, zzaba zzaba, zzbo zzbo, zzv zzv) {
        super(zzbhs, zzbhu);
        this.zzfaz = zzbhs;
        this.zzfba = zzbhu;
        this.zzezn = zzbht;
        this.zzvv = str;
        this.zzezp = z;
        this.zzezr = -1;
        this.zzdcf = zzcu;
        this.zzbob = zzbbi;
        this.zzezg = zzbo;
        this.zzbly = zzv;
        this.zzbuv = (WindowManager) getContext().getSystemService("window");
        this.zzbuf = new zzbas(this.zzfaz.zzabw(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzbv.zzlf().zza((Context) zzbhs, zzbbi.zzdp, getSettings());
        setDownloadListener(this);
        this.zzfbc = zzbhs.getResources().getDisplayMetrics().density;
        zzaer();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbgz.zzk(this), "googleAdsJsInterface");
        }
        zzaev();
        this.zzfac = new zzaaz(new zzaba(true, "make_wv", this.zzvv));
        this.zzfac.zzrf().zzc(zzaba);
        this.zzetv = zzaat.zzb(this.zzfac.zzrf());
        this.zzfac.zza("native:view_create", this.zzetv);
        this.zzfab = null;
        this.zzfaa = null;
        zzbv.zzlh().zzaz(zzbhs);
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    public final void zza(String str, Map map) {
        zzaid.zza((zzaic) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzaid.zzb(this, str, jSONObject);
    }

    public final zzbdq zzabt() {
        return null;
    }

    public final void zzadr() {
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzaid.zza((zzaic) this, str, jSONObject);
    }

    public final void zzh(String str, String str2) {
        zzaid.zza((zzaic) this, str, str2);
    }

    public final zzv zzid() {
        return this.zzbly;
    }

    private final boolean zzaeo() {
        int i;
        int i2;
        boolean z = false;
        if (!this.zzfba.zzmu() && !this.zzfba.zzaeb()) {
            return false;
        }
        zzbv.zzlf();
        DisplayMetrics zza = zzayh.zza(this.zzbuv);
        zzwu.zzpv();
        int zzb = zzbat.zzb(zza, zza.widthPixels);
        zzwu.zzpv();
        int zzb2 = zzbat.zzb(zza, zza.heightPixels);
        Activity zzabw = this.zzfaz.zzabw();
        if (zzabw == null || zzabw.getWindow() == null) {
            i2 = zzb;
            i = zzb2;
        } else {
            zzbv.zzlf();
            int[] zzg = zzayh.zzg(zzabw);
            zzwu.zzpv();
            i2 = zzbat.zzb(zza, zzg[0]);
            zzwu.zzpv();
            i = zzbat.zzb(zza, zzg[1]);
        }
        if (this.zzdqf == zzb && this.zzdqg == zzb2 && this.zzdqi == i2 && this.zzdqj == i) {
            return false;
        }
        if (!(this.zzdqf == zzb && this.zzdqg == zzb2)) {
            z = true;
        }
        this.zzdqf = zzb;
        this.zzdqg = zzb2;
        this.zzdqi = i2;
        this.zzdqj = i;
        new zzaok(this).zza(zzb, zzb2, i2, i, zza.density, this.zzbuv.getDefaultDisplay().getRotation());
        return z;
    }

    public final synchronized void zzc(String str, String str2, @Nullable String str3) {
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcre)).booleanValue()) {
            str2 = zzbhi.zzc(str2, zzbhi.zzaex());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    public final synchronized void zzcg(String str) {
        if (!isDestroyed()) {
            super.zzcg(str);
        } else {
            zzaxz.zzeo("The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzade() {
        zzaeq();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbob.zzdp);
        zzaid.zza((zzaic) this, "onhide", (Map) hashMap);
    }

    public final void zzdh(int i) {
        if (i == 0) {
            zzaat.zza(this.zzfac.zzrf(), this.zzetv, "aebb2");
        }
        zzaeq();
        if (this.zzfac.zzrf() != null) {
            this.zzfac.zzrf().zzg("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzbob.zzdp);
        zzaid.zza((zzaic) this, "onhide", (Map) hashMap);
    }

    private final void zzaeq() {
        zzaat.zza(this.zzfac.zzrf(), this.zzetv, "aeh2");
    }

    public final void zzvv() {
        if (this.zzfaa == null) {
            zzaat.zza(this.zzfac.zzrf(), this.zzetv, "aes2");
            this.zzfaa = zzaat.zzb(this.zzfac.zzrf());
            this.zzfac.zza("native:view_show", this.zzfaa);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbob.zzdp);
        zzaid.zza((zzaic) this, "onshow", (Map) hashMap);
    }

    public final void zzadf() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzbv.zzlk().zzkk()));
        hashMap.put("app_volume", String.valueOf(zzbv.zzlk().zzkj()));
        hashMap.put("device_volume", String.valueOf(zzaza.zzbb(getContext())));
        zzaid.zza((zzaic) this, "volume", (Map) hashMap);
    }

    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zzaid.zza((zzaic) this, "onCacheAccessComplete", (Map) hashMap);
    }

    public final synchronized zzd zzadh() {
        return this.zzezl;
    }

    public final IObjectWrapper zzadp() {
        return this.zzfbb.get();
    }

    public final synchronized zzd zzadi() {
        return this.zzfae;
    }

    public final synchronized zzbht zzadj() {
        return this.zzezn;
    }

    public final synchronized String zzadk() {
        return this.zzvv;
    }

    public final WebViewClient zzadm() {
        return this.zzfba;
    }

    public final synchronized boolean zzadn() {
        return this.zzezo;
    }

    public final zzcu zzado() {
        return this.zzdcf;
    }

    public final zzbbi zzabz() {
        return this.zzbob;
    }

    public final synchronized boolean zzadq() {
        return this.zzezp;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzbv.zzlf();
            zzayh.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzaxz.zzdn(sb.toString());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzfba.zzaeb()) {
            synchronized (this) {
                if (this.zzezx != null) {
                    this.zzezx.zzc(motionEvent);
                }
            }
        } else if (this.zzdcf != null) {
            this.zzdcf.zza(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d0 A[SYNTHETIC, Splitter:B:109:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x01e6=Splitter:B:116:0x01e6, B:64:0x00dc=Splitter:B:64:0x00dc} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01eb }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r7.zzezp     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e6
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.zzafc()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0021
            goto L_0x01e6
        L_0x0021:
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.zzafe()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.zzafd()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaan.zzcum     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbgw r0 = r7.zzabu()     // Catch:{ all -> 0x01eb }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.getAspectRatio()     // Catch:{ all -> 0x01eb }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
            float r1 = (float) r9     // Catch:{ all -> 0x01eb }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01eb }
            float r2 = (float) r8     // Catch:{ all -> 0x01eb }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01eb }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01eb }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01eb }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01eb }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01eb }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01eb }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.isFluid()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x00e1
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaan.zzcur     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR1()     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00dc
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.zzbic r1 = new com.google.android.gms.internal.ads.zzbic     // Catch:{ all -> 0x01eb }
            r1.<init>(r7)     // Catch:{ all -> 0x01eb }
            r7.zza((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.zzbgg>) r1)     // Catch:{ all -> 0x01eb }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.zzcg(r0)     // Catch:{ all -> 0x01eb }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r0 = r7.zzezz     // Catch:{ all -> 0x01eb }
            r1 = -1
            if (r0 == r1) goto L_0x00d3
            int r9 = r7.zzezz     // Catch:{ all -> 0x01eb }
            float r9 = (float) r9     // Catch:{ all -> 0x01eb }
            float r0 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01eb }
            goto L_0x00d7
        L_0x00d3:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
        L_0x00d7:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x00dc:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x00e1:
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            boolean r0 = r0.zzafb()     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x0100
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01eb }
            r8.<init>()     // Catch:{ all -> 0x01eb }
            android.view.WindowManager r9 = r7.zzbuv     // Catch:{ all -> 0x01eb }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01eb }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01eb }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01eb }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x0100:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01eb }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01eb }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01eb }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01eb }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0120
            if (r0 != r3) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0121
        L_0x0120:
            r0 = r8
        L_0x0121:
            if (r2 == r4) goto L_0x0125
            if (r2 != r3) goto L_0x0126
        L_0x0125:
            r5 = r9
        L_0x0126:
            com.google.android.gms.internal.ads.zzbht r2 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01eb }
            r3 = 1
            if (r2 > r0) goto L_0x0136
            com.google.android.gms.internal.ads.zzbht r2 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r2 = r2.heightPixels     // Catch:{ all -> 0x01eb }
            if (r2 <= r5) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r2 = 0
            goto L_0x0137
        L_0x0136:
            r2 = 1
        L_0x0137:
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzaan.zzcxk     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaak r6 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ all -> 0x01eb }
            java.lang.Object r4 = r6.zzd(r4)     // Catch:{ all -> 0x01eb }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01eb }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01eb }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzbht r4 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r4 = r4.widthPixels     // Catch:{ all -> 0x01eb }
            float r4 = (float) r4     // Catch:{ all -> 0x01eb }
            float r6 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01eb }
            float r6 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzbht r0 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x01eb }
            float r0 = (float) r0     // Catch:{ all -> 0x01eb }
            float r4 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01eb }
            float r5 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d0
            com.google.android.gms.internal.ads.zzbht r2 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r2 = r2.widthPixels     // Catch:{ all -> 0x01eb }
            float r2 = (float) r2     // Catch:{ all -> 0x01eb }
            float r3 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzbht r3 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r3 = r3.heightPixels     // Catch:{ all -> 0x01eb }
            float r3 = (float) r3     // Catch:{ all -> 0x01eb }
            float r4 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01eb }
            float r8 = (float) r8     // Catch:{ all -> 0x01eb }
            float r4 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01eb }
            float r9 = (float) r9     // Catch:{ all -> 0x01eb }
            float r4 = r7.zzfbc     // Catch:{ all -> 0x01eb }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01eb }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01eb }
            r5.<init>(r4)     // Catch:{ all -> 0x01eb }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01eb }
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            r5.append(r3)     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01eb }
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            r5.append(r9)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01eb }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzaxz.zzeo(r8)     // Catch:{ all -> 0x01eb }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01eb }
            if (r8 == r0) goto L_0x01cb
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01eb }
        L_0x01cb:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01d0:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01eb }
            if (r8 == r0) goto L_0x01d9
            r7.setVisibility(r1)     // Catch:{ all -> 0x01eb }
        L_0x01d9:
            com.google.android.gms.internal.ads.zzbht r8 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01eb }
            com.google.android.gms.internal.ads.zzbht r9 = r7.zzezn     // Catch:{ all -> 0x01eb }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01eb }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01e6:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01eb }
            monitor-exit(r7)
            return
        L_0x01eb:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbib.onMeasure(int, int):void");
    }

    public final void onGlobalLayout() {
        boolean zzaeo = zzaeo();
        zzd zzadh = zzadh();
        if (zzadh != null && zzaeo) {
            zzadh.zzvu();
        }
    }

    public final synchronized void zza(zzd zzd) {
        this.zzezl = zzd;
    }

    public final void zzaa(IObjectWrapper iObjectWrapper) {
        this.zzfbb.set(iObjectWrapper);
    }

    public final synchronized void zzb(zzd zzd) {
        this.zzfae = zzd;
    }

    public final synchronized void zza(zzbht zzbht) {
        this.zzezn = zzbht;
        requestLayout();
    }

    public final synchronized void zzav(boolean z) {
        boolean z2 = z != this.zzezp;
        this.zzezp = z;
        zzaer();
        if (z2) {
            new zzaok(this).zzdc(z ? "expanded" : "default");
        }
    }

    public final void zzadv() {
        this.zzbuf.zzaam();
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzbuf.onAttachedToWindow();
        }
        boolean z = this.zzezv;
        if (this.zzfba != null && this.zzfba.zzaeb()) {
            if (!this.zzezw) {
                ViewTreeObserver.OnGlobalLayoutListener zzaec = this.zzfba.zzaec();
                if (zzaec != null) {
                    zzbv.zzme();
                    zzbct.zza((View) this, zzaec);
                }
                ViewTreeObserver.OnScrollChangedListener zzaed = this.zzfba.zzaed();
                if (zzaed != null) {
                    zzbv.zzme();
                    zzbct.zza((View) this, zzaed);
                }
                this.zzezw = true;
            }
            zzaeo();
            z = true;
        }
        zzaz(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzbuf.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzezw && this.zzfba != null && this.zzfba.zzaeb() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener zzaec = this.zzfba.zzaec();
                if (zzaec != null) {
                    zzbv.zzlh().zza(getViewTreeObserver(), zzaec);
                }
                ViewTreeObserver.OnScrollChangedListener zzaed = this.zzfba.zzaed();
                if (zzaed != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(zzaed);
                }
                this.zzezw = false;
            }
        }
        zzaz(false);
    }

    public final void zzbo(Context context) {
        this.zzfaz.setBaseContext(context);
        this.zzbuf.zzj(this.zzfaz.zzabw());
    }

    public final synchronized void zzaf(boolean z) {
        if (this.zzezl != null) {
            this.zzezl.zza(this.zzfba.zzmu(), z);
        } else {
            this.zzezo = z;
        }
    }

    public final synchronized int getRequestedOrientation() {
        return this.zzezr;
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.zzezr = i;
        if (this.zzezl != null) {
            this.zzezl.setRequestedOrientation(this.zzezr);
        }
    }

    public final Activity zzabw() {
        return this.zzfaz.zzabw();
    }

    public final Context zzadg() {
        return this.zzfaz.zzadg();
    }

    private final synchronized void zzaer() {
        if (!this.zzezp) {
            if (!this.zzezn.zzafb()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzaxz.zzdn("Disabling hardware acceleration on an AdView.");
                    zzaes();
                    return;
                }
                zzaxz.zzdn("Enabling hardware acceleration on an AdView.");
                zzaet();
                return;
            }
        }
        zzaxz.zzdn("Enabling hardware acceleration on an overlay.");
        zzaet();
    }

    private final synchronized void zzaes() {
        if (!this.zzezq) {
            zzbv.zzlh().zzaa(this);
        }
        this.zzezq = true;
    }

    private final synchronized void zzaet() {
        if (this.zzezq) {
            zzbv.zzlh().zzz(this);
        }
        this.zzezq = false;
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzba(boolean z) {
        if (!z) {
            try {
                zzaev();
                this.zzbuf.zzaan();
                if (this.zzezl != null) {
                    this.zzezl.close();
                    this.zzezl.onDestroy();
                    this.zzezl = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzfbb.set((Object) null);
        this.zzfba.destroy();
        zzbv.zzmd();
        zzbfj.zzc(this);
        zzaeu();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (this.zzfba != null && this.zzfba.zzael() != null) {
                this.zzfba.zzael().zzjw();
            }
        }
    }

    public final void zzadw() {
        if (this.zzfab == null) {
            this.zzfab = zzaat.zzb(this.zzfac.zzrf());
            this.zzfac.zza("native:view_load", this.zzfab);
        }
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzaxz.zzb("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            zzaxz.zzb("Could not resume webview.", e);
        }
    }

    public final void zzadz() {
        zzaxz.m30v("Cannot add text view to inner AdWebView");
    }

    public final void zzay(boolean z) {
        this.zzfba.zzay(z);
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzaxz.zzb("Could not stop loading webview.", e);
        }
    }

    public final synchronized void zzaw(boolean z) {
        this.zzezs = z;
    }

    public final synchronized boolean zzads() {
        return this.zzezs;
    }

    public final synchronized boolean zzadt() {
        return this.zzezt;
    }

    public final synchronized void zzjf() {
        this.zzezt = true;
        if (this.zzezg != null) {
            this.zzezg.zzjf();
        }
    }

    public final synchronized void zzjg() {
        this.zzezt = false;
        if (this.zzezg != null) {
            this.zzezg.zzjg();
        }
    }

    private final synchronized void zzaeu() {
        if (this.zzfag != null) {
            for (zzbfk release : this.zzfag.values()) {
                release.release();
            }
        }
        this.zzfag = null;
    }

    public final synchronized void zza(String str, zzbfk zzbfk) {
        if (this.zzfag == null) {
            this.zzfag = new HashMap();
        }
        this.zzfag.put(str, zzbfk);
    }

    public final synchronized zzbfk zzet(String str) {
        if (this.zzfag == null) {
            return null;
        }
        return this.zzfag.get(str);
    }

    public final synchronized void zzfb(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.zzetu = str;
    }

    public final synchronized String zzabx() {
        return this.zzetu;
    }

    public final zzaay zzabv() {
        return this.zzetv;
    }

    public final zzaaz zzaby() {
        return this.zzfac;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzfad = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final View.OnClickListener getOnClickListener() {
        return (View.OnClickListener) this.zzfad.get();
    }

    public final synchronized void zzb(zzacb zzacb) {
        this.zzezx = zzacb;
    }

    public final synchronized zzacb zzadx() {
        return this.zzezx;
    }

    public final synchronized void zzacc() {
    }

    public final synchronized zzbgw zzabu() {
        return this.zzezu;
    }

    public final synchronized void zza(zzbgw zzbgw) {
        if (this.zzezu != null) {
            zzaxz.m31e("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzezu = zzbgw;
        }
    }

    public final synchronized boolean zzadu() {
        return this.zzezy > 0;
    }

    public final synchronized void zzax(boolean z) {
        this.zzezy += z ? 1 : -1;
        if (this.zzezy <= 0 && this.zzezl != null) {
            this.zzezl.zzvx();
        }
    }

    private final void zzaev() {
        zzaba zzrf;
        if (this.zzfac != null && (zzrf = this.zzfac.zzrf()) != null && zzbv.zzlj().zzyh() != null) {
            zzbv.zzlj().zzyh().zza(zzrf);
        }
    }

    public final void zzady() {
        setBackgroundColor(0);
    }

    public final void zzat(boolean z) {
        this.zzfba.zzat(z);
    }

    public final void zzvw() {
        zzd zzadh = zzadh();
        if (zzadh != null) {
            zzadh.zzvw();
        }
    }

    public final int zzaca() {
        return getMeasuredHeight();
    }

    public final int zzacb() {
        return getMeasuredWidth();
    }

    public final void zza(zzc zzc) {
        this.zzfba.zza(zzc);
    }

    public final void zzb(boolean z, int i) {
        this.zzfba.zzb(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzfba.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzfba.zza(z, i, str, str2);
    }

    public final void zza(zzsf zzsf) {
        synchronized (this) {
            this.zzezv = zzsf.zzuc;
        }
        zzaz(zzsf.zzuc);
    }

    private final void zzaz(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zzaid.zza((zzaic) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    public final void zza(String str, zzu<? super zzbgg> zzu) {
        if (this.zzfba != null) {
            this.zzfba.zza(str, zzu);
        }
    }

    public final void zzb(String str, zzu<? super zzbgg> zzu) {
        if (this.zzfba != null) {
            this.zzfba.zzb(str, zzu);
        }
    }

    public final void zza(String str, Predicate<zzu<? super zzbgg>> predicate) {
        if (this.zzfba != null) {
            this.zzfba.zza(str, predicate);
        }
    }

    public final /* synthetic */ zzbhn zzadl() {
        return this.zzfba;
    }
}
