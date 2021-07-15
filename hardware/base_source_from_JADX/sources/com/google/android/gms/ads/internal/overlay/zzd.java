package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p000v4.view.ViewCompat;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaan;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaoq;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzwu;
import java.util.Collections;
import java.util.Map;

@zzark
public class zzd extends zzaoq implements zzw {
    @VisibleForTesting
    private static final int zzdqt = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;
    @VisibleForTesting
    zzbgg zzdin;
    @VisibleForTesting
    AdOverlayInfoParcel zzdqu;
    @VisibleForTesting
    private zzi zzdqv;
    @VisibleForTesting
    private zzo zzdqw;
    @VisibleForTesting
    private boolean zzdqx = false;
    @VisibleForTesting
    private FrameLayout zzdqy;
    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdqz;
    @VisibleForTesting
    private boolean zzdra = false;
    @VisibleForTesting
    private boolean zzdrb = false;
    @VisibleForTesting
    private zzh zzdrc;
    @VisibleForTesting
    private boolean zzdrd = false;
    @VisibleForTesting
    int zzdre = 0;
    private final Object zzdrf = new Object();
    private Runnable zzdrg;
    private boolean zzdrh;
    private boolean zzdri;
    private boolean zzdrj = false;
    private boolean zzdrk = false;
    private boolean zzdrl = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onRestart() {
    }

    public final void close() {
        this.zzdre = 2;
        this.mActivity.finish();
    }

    public final void zzvo() {
        if (this.zzdqu != null && this.zzdqx) {
            setRequestedOrientation(this.zzdqu.orientation);
        }
        if (this.zzdqy != null) {
            this.mActivity.setContentView(this.zzdrc);
            this.zzdri = true;
            this.zzdqy.removeAllViews();
            this.zzdqy = null;
        }
        if (this.zzdqz != null) {
            this.zzdqz.onCustomViewHidden();
            this.zzdqz = null;
        }
        this.zzdqx = false;
    }

    public final void zzvp() {
        this.zzdre = 1;
        this.mActivity.finish();
    }

    public final void onBackPressed() {
        this.zzdre = 0;
    }

    public final boolean zzvq() {
        this.zzdre = 0;
        if (this.zzdin == null) {
            return true;
        }
        boolean zzads = this.zzdin.zzads();
        if (!zzads) {
            this.zzdin.zza("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        }
        return zzads;
    }

    public void onCreate(Bundle bundle) {
        this.mActivity.requestWindowFeature(1);
        this.zzdra = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.zzdqu = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            if (this.zzdqu != null) {
                if (this.zzdqu.zzbsp.zzeov > 7500000) {
                    this.zzdre = 3;
                }
                if (this.mActivity.getIntent() != null) {
                    this.zzdrl = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                if (this.zzdqu.zzdsc != null) {
                    this.zzdrb = this.zzdqu.zzdsc.zzbpa;
                } else {
                    this.zzdrb = false;
                }
                if (this.zzdrb && this.zzdqu.zzdsc.zzbpf != -1) {
                    new zzj(this, (zzf) null).zzyz();
                }
                if (bundle == null) {
                    if (this.zzdqu.zzdru != null && this.zzdrl) {
                        this.zzdqu.zzdru.zziw();
                    }
                    if (!(this.zzdqu.zzdsa == 1 || this.zzdqu.zzdrt == null)) {
                        this.zzdqu.zzdrt.onAdClicked();
                    }
                }
                this.zzdrc = new zzh(this.mActivity, this.zzdqu.zzdsb, this.zzdqu.zzbsp.zzdp);
                this.zzdrc.setId(1000);
                switch (this.zzdqu.zzdsa) {
                    case 1:
                        zzae(false);
                        return;
                    case 2:
                        this.zzdqv = new zzi(this.zzdqu.zzdrv);
                        zzae(false);
                        return;
                    case 3:
                        zzae(true);
                        return;
                    default:
                        throw new zzg("Could not determine ad overlay type.");
                }
            } else {
                throw new zzg("Could not get info for ad overlay.");
            }
        } catch (zzg e) {
            zzaxz.zzeo(e.getMessage());
            this.zzdre = 3;
            this.mActivity.finish();
        }
    }

    public final void onStart() {
        if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcwm)).booleanValue()) {
            return;
        }
        if (this.zzdin == null || this.zzdin.isDestroyed()) {
            zzaxz.zzeo("The webview does not exist. Ignoring action.");
            return;
        }
        zzbv.zzlh();
        zzayp.zzj(this.zzdin);
    }

    public final void onResume() {
        if (this.zzdqu.zzdru != null) {
            this.zzdqu.zzdru.onResume();
        }
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcwm)).booleanValue()) {
            return;
        }
        if (this.zzdin == null || this.zzdin.isDestroyed()) {
            zzaxz.zzeo("The webview does not exist. Ignoring action.");
            return;
        }
        zzbv.zzlh();
        zzayp.zzj(this.zzdin);
    }

    public final void onPause() {
        zzvo();
        if (this.zzdqu.zzdru != null) {
            this.zzdqu.zzdru.onPause();
        }
        if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcwm)).booleanValue() && this.zzdin != null && (!this.mActivity.isFinishing() || this.zzdqv == null)) {
            zzbv.zzlh();
            zzayp.zzi(this.zzdin);
        }
        zzvs();
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcwl)).booleanValue() && PlatformVersion.isAtLeastN()) {
            zzbv.zzlf();
            if (zzayh.zza(this.mActivity, (Configuration) ObjectWrapper.unwrap(iObjectWrapper))) {
                this.mActivity.getWindow().addFlags(1024);
                this.mActivity.getWindow().clearFlags(2048);
                return;
            }
            this.mActivity.getWindow().addFlags(2048);
            this.mActivity.getWindow().clearFlags(1024);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdra);
    }

    public final void onStop() {
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcwm)).booleanValue() && this.zzdin != null && (!this.mActivity.isFinishing() || this.zzdqv == null)) {
            zzbv.zzlh();
            zzayp.zzi(this.zzdin);
        }
        zzvs();
    }

    public final void onDestroy() {
        if (this.zzdin != null) {
            this.zzdrc.removeView(this.zzdin.getView());
        }
        zzvs();
    }

    private final void zzad(boolean z) {
        int intValue = ((Integer) zzwu.zzpz().zzd(zzaan.zzcwo)).intValue();
        zzp zzp = new zzp();
        zzp.size = 50;
        zzp.paddingLeft = z ? intValue : 0;
        zzp.paddingRight = z ? 0 : intValue;
        zzp.paddingTop = 0;
        zzp.paddingBottom = intValue;
        this.zzdqw = new zzo(this.mActivity, zzp, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdqu.zzdrx);
        this.zzdrc.addView(this.zzdqw, layoutParams);
    }

    public final void zzay() {
        this.zzdri = true;
    }

    public final void zza(boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = ((Boolean) zzwu.zzpz().zzd(zzaan.zzcrt)).booleanValue() && this.zzdqu != null && this.zzdqu.zzdsc != null && this.zzdqu.zzdsc.zzbph;
        boolean z5 = ((Boolean) zzwu.zzpz().zzd(zzaan.zzcru)).booleanValue() && this.zzdqu != null && this.zzdqu.zzdsc != null && this.zzdqu.zzdsc.zzbpi;
        if (z && z2 && z4 && !z5) {
            new zzaok(this.zzdin, "useCustomClose").zzda("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.zzdqw != null) {
            zzo zzo = this.zzdqw;
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzo.zzaf(z3);
        }
    }

    public final void zzvr() {
        this.zzdrc.removeView(this.zzdqw);
        zzad(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzwu.zzpz().zzd(zzaan.zzcyg)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzwu.zzpz().zzd(zzaan.zzcyh)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzwu.zzpz().zzd(zzaan.zzcyi)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzwu.zzpz().zzd(zzaan.zzcyj)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.mActivity.setRequestedOrientation(i);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.zzdqy = new FrameLayout(this.mActivity);
        this.zzdqy.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdqy.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzdqy);
        this.zzdri = true;
        this.zzdqz = customViewCallback;
        this.zzdqx = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126 A[SYNTHETIC, Splitter:B:58:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzae(boolean r19) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            r18 = this;
            r1 = r18
            boolean r2 = r1.zzdri
            r3 = 1
            if (r2 != 0) goto L_0x000c
            android.app.Activity r2 = r1.mActivity
            r2.requestWindowFeature(r3)
        L_0x000c:
            android.app.Activity r2 = r1.mActivity
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0265
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastN()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzaan.zzcwl
            com.google.android.gms.internal.ads.zzaak r5 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0040
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.app.Activity r4 = r1.mActivity
            android.app.Activity r5 = r1.mActivity
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            boolean r4 = com.google.android.gms.internal.ads.zzayh.zza((android.app.Activity) r4, (android.content.res.Configuration) r5)
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzdsc
            r6 = 0
            if (r5 == 0) goto L_0x0052
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r5 = r5.zzdsc
            boolean r5 = r5.zzbpb
            if (r5 == 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            boolean r7 = r1.zzdrb
            if (r7 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x007d
        L_0x0059:
            if (r4 == 0) goto L_0x007d
            r4 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r4, r4)
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            if (r4 == 0) goto L_0x007d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzdsc
            if (r4 == 0) goto L_0x007d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.ads.internal.zzaq r4 = r4.zzdsc
            boolean r4 = r4.zzbpg
            if (r4 == 0) goto L_0x007d
            android.view.View r4 = r2.getDecorView()
            r5 = 4098(0x1002, float:5.743E-42)
            r4.setSystemUiVisibility(r5)
        L_0x007d:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r4 = r4.zzdrv
            r5 = 0
            if (r4 == 0) goto L_0x008d
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r4 = r4.zzdrv
            com.google.android.gms.internal.ads.zzbhn r4 = r4.zzadl()
            goto L_0x008e
        L_0x008d:
            r4 = r5
        L_0x008e:
            if (r4 == 0) goto L_0x0095
            boolean r4 = r4.zzmu()
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            r1.zzdrd = r6
            if (r4 == 0) goto L_0x00da
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.zzdqu
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.zzayp r8 = com.google.android.gms.ads.internal.zzbv.zzlh()
            int r8 = r8.zzzw()
            if (r7 != r8) goto L_0x00ba
            android.app.Activity r7 = r1.mActivity
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            if (r7 != r3) goto L_0x00b7
            r6 = 1
        L_0x00b7:
            r1.zzdrd = r6
            goto L_0x00da
        L_0x00ba:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r1.zzdqu
            int r7 = r7.orientation
            com.google.android.gms.internal.ads.zzayp r8 = com.google.android.gms.ads.internal.zzbv.zzlh()
            int r8 = r8.zzzx()
            if (r7 != r8) goto L_0x00da
            android.app.Activity r7 = r1.mActivity
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r8 = 2
            if (r7 != r8) goto L_0x00d8
            r6 = 1
        L_0x00d8:
            r1.zzdrd = r6
        L_0x00da:
            boolean r6 = r1.zzdrd
            r7 = 46
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            java.lang.String r7 = "Delay onShow to next orientation change: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.google.android.gms.internal.ads.zzaxz.zzdn(r6)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r1.zzdqu
            int r6 = r6.orientation
            r1.setRequestedOrientation(r6)
            com.google.android.gms.internal.ads.zzayp r6 = com.google.android.gms.ads.internal.zzbv.zzlh()
            boolean r2 = r6.zza((android.view.Window) r2)
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.ads.zzaxz.zzdn(r2)
        L_0x0108:
            boolean r2 = r1.zzdrb
            if (r2 != 0) goto L_0x0114
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r6)
            goto L_0x011b
        L_0x0114:
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            int r6 = zzdqt
            r2.setBackgroundColor(r6)
        L_0x011b:
            android.app.Activity r2 = r1.mActivity
            com.google.android.gms.ads.internal.overlay.zzh r6 = r1.zzdrc
            r2.setContentView(r6)
            r1.zzdri = r3
            if (r19 == 0) goto L_0x01fc
            com.google.android.gms.ads.internal.zzbv.zzlg()     // Catch:{ Exception -> 0x01ee }
            android.app.Activity r7 = r1.mActivity     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x013b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbht r2 = r2.zzadj()     // Catch:{ Exception -> 0x01ee }
            r8 = r2
            goto L_0x013c
        L_0x013b:
            r8 = r5
        L_0x013c:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x014c
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            java.lang.String r2 = r2.zzadk()     // Catch:{ Exception -> 0x01ee }
            r9 = r2
            goto L_0x014d
        L_0x014c:
            r9 = r5
        L_0x014d:
            r10 = 1
            r12 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbbi r13 = r2.zzbsp     // Catch:{ Exception -> 0x01ee }
            r14 = 0
            r15 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            if (r2 == 0) goto L_0x0166
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.ads.internal.zzv r2 = r2.zzid()     // Catch:{ Exception -> 0x01ee }
            r16 = r2
            goto L_0x0168
        L_0x0166:
            r16 = r5
        L_0x0168:
            com.google.android.gms.internal.ads.zzum r17 = com.google.android.gms.internal.ads.zzum.zzoi()     // Catch:{ Exception -> 0x01ee }
            r11 = r4
            com.google.android.gms.internal.ads.zzbgg r2 = com.google.android.gms.internal.ads.zzbgm.zza(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x01ee }
            r1.zzdin = r2     // Catch:{ Exception -> 0x01ee }
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            com.google.android.gms.internal.ads.zzbhn r6 = r2.zzadl()
            r7 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.gmsg.zzb r8 = r2.zzdsd
            r9 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.gmsg.zzd r10 = r2.zzdrw
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.ads.internal.overlay.zzt r11 = r2.zzdrz
            r12 = 1
            r13 = 0
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            if (r2 == 0) goto L_0x019b
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            com.google.android.gms.internal.ads.zzbhn r2 = r2.zzadl()
            com.google.android.gms.ads.internal.zzw r5 = r2.zzaea()
        L_0x019b:
            r14 = r5
            r15 = 0
            r16 = 0
            r6.zza(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            com.google.android.gms.internal.ads.zzbhn r2 = r2.zzadl()
            com.google.android.gms.ads.internal.overlay.zze r5 = new com.google.android.gms.ads.internal.overlay.zze
            r5.<init>(r1)
            r2.zza((com.google.android.gms.internal.ads.zzbho) r5)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r2 = r2.url
            if (r2 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r5 = r1.zzdqu
            java.lang.String r5 = r5.url
            r2.loadUrl(r5)
            goto L_0x01d8
        L_0x01c0:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r2 = r2.zzdry
            if (r2 == 0) goto L_0x01e6
            com.google.android.gms.internal.ads.zzbgg r5 = r1.zzdin
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r6 = r2.zzbde
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            java.lang.String r7 = r2.zzdry
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "UTF-8"
            r10 = 0
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x01d8:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            if (r2 == 0) goto L_0x0209
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            r2.zzb((com.google.android.gms.ads.internal.overlay.zzd) r1)
            goto L_0x0209
        L_0x01e6:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r0.<init>(r2)
            throw r0
        L_0x01ee:
            r0 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.ads.zzaxz.zzb(r2, r0)
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r0.<init>(r2)
            throw r0
        L_0x01fc:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            r1.zzdin = r2
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            android.app.Activity r5 = r1.mActivity
            r2.zzbo(r5)
        L_0x0209:
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            r2.zza((com.google.android.gms.ads.internal.overlay.zzd) r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            if (r2 == 0) goto L_0x0221
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r1.zzdqu
            com.google.android.gms.internal.ads.zzbgg r2 = r2.zzdrv
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzadp()
            com.google.android.gms.ads.internal.overlay.zzh r5 = r1.zzdrc
            zzb(r2, r5)
        L_0x0221:
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0238
            boolean r5 = r2 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0238
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            com.google.android.gms.internal.ads.zzbgg r5 = r1.zzdin
            android.view.View r5 = r5.getView()
            r2.removeView(r5)
        L_0x0238:
            boolean r2 = r1.zzdrb
            if (r2 == 0) goto L_0x0241
            com.google.android.gms.internal.ads.zzbgg r2 = r1.zzdin
            r2.zzady()
        L_0x0241:
            com.google.android.gms.ads.internal.overlay.zzh r2 = r1.zzdrc
            com.google.android.gms.internal.ads.zzbgg r5 = r1.zzdin
            android.view.View r5 = r5.getView()
            r6 = -1
            r2.addView(r5, r6, r6)
            if (r19 != 0) goto L_0x0256
            boolean r0 = r1.zzdrd
            if (r0 != 0) goto L_0x0256
            r18.zzvv()
        L_0x0256:
            r1.zzad(r4)
            com.google.android.gms.internal.ads.zzbgg r0 = r1.zzdin
            boolean r0 = r0.zzadn()
            if (r0 == 0) goto L_0x0264
            r1.zza((boolean) r4, (boolean) r3)
        L_0x0264:
            return
        L_0x0265:
            com.google.android.gms.ads.internal.overlay.zzg r0 = new com.google.android.gms.ads.internal.overlay.zzg
            java.lang.String r2 = "Invalid activity, no window available."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.zzae(boolean):void");
    }

    private final void zzvs() {
        if (this.mActivity.isFinishing() && !this.zzdrj) {
            this.zzdrj = true;
            if (this.zzdin != null) {
                this.zzdin.zzdh(this.zzdre);
                synchronized (this.zzdrf) {
                    if (!this.zzdrh && this.zzdin.zzadu()) {
                        this.zzdrg = new zzf(this);
                        zzayh.zzelc.postDelayed(this.zzdrg, ((Long) zzwu.zzpz().zzd(zzaan.zzcrs)).longValue());
                        return;
                    }
                }
            }
            zzvt();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzvt() {
        if (!this.zzdrk) {
            this.zzdrk = true;
            if (this.zzdin != null) {
                this.zzdrc.removeView(this.zzdin.getView());
                if (this.zzdqv != null) {
                    this.zzdin.zzbo(this.zzdqv.zzsp);
                    this.zzdin.zzav(false);
                    this.zzdqv.parent.addView(this.zzdin.getView(), this.zzdqv.index, this.zzdqv.zzdrp);
                    this.zzdqv = null;
                } else if (this.mActivity.getApplicationContext() != null) {
                    this.zzdin.zzbo(this.mActivity.getApplicationContext());
                }
                this.zzdin = null;
            }
            if (!(this.zzdqu == null || this.zzdqu.zzdru == null)) {
                this.zzdqu.zzdru.zziv();
            }
            if (this.zzdqu != null && this.zzdqu.zzdrv != null) {
                zzb(this.zzdqu.zzdrv.zzadp(), this.zzdqu.zzdrv.getView());
            }
        }
    }

    private static void zzb(@Nullable IObjectWrapper iObjectWrapper, @Nullable View view) {
        if (iObjectWrapper != null && view != null) {
            zzbv.zzlw().zza(iObjectWrapper, view);
        }
    }

    public final void zzvu() {
        if (this.zzdrd) {
            this.zzdrd = false;
            zzvv();
        }
    }

    private final void zzvv() {
        this.zzdin.zzvv();
    }

    public final void zzvw() {
        this.zzdrc.zzdro = true;
    }

    public final void zzvx() {
        synchronized (this.zzdrf) {
            this.zzdrh = true;
            if (this.zzdrg != null) {
                zzayh.zzelc.removeCallbacks(this.zzdrg);
                zzayh.zzelc.post(this.zzdrg);
            }
        }
    }
}
