package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class zzdu implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zztu = new Handler(Looper.getMainLooper());
    private final zzdl zzqo;
    private Application zzsg;
    private final Context zztv;
    private final PowerManager zztw;
    private final KeyguardManager zztx;
    private BroadcastReceiver zzty;
    private WeakReference<ViewTreeObserver> zztz;
    private WeakReference<View> zzua;
    private zzcz zzub;
    private boolean zzuc = false;
    private int zzud = -1;
    private long zzue = -3;

    public zzdu(zzdl zzdl, View view) {
        this.zzqo = zzdl;
        this.zztv = zzdl.zzsp;
        this.zztw = (PowerManager) this.zztv.getSystemService("power");
        this.zztx = (KeyguardManager) this.zztv.getSystemService("keyguard");
        if (this.zztv instanceof Application) {
            this.zzsg = (Application) this.zztv;
            this.zzub = new zzcz((Application) this.zztv, this);
        }
        zzd(view);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        View view2 = this.zzua != null ? (View) this.zzua.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzua = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.zzue = -2;
            return;
        }
        this.zzue = -3;
    }

    private final void zzap() {
        zztu.post(new zzdv(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzud = -1;
        zze(view);
        zzar();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzud = -1;
        zzar();
        zzap();
        zzf(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzua != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.zzua.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzud = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzar();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzar();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzar();
        zzap();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzar();
    }

    public final void onActivityStopped(Activity activity) {
        zzar();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzar();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzar();
    }

    public final void onGlobalLayout() {
        zzar();
    }

    public final void onScrollChanged() {
        zzar();
    }

    public final long zzaq() {
        if (this.zzue == -2 && this.zzua.get() == null) {
            this.zzue = -3;
        }
        return this.zzue;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r4 == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzar() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.zzua
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.ref.WeakReference<android.view.View> r0 = r9.zzua
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto L_0x0017
            r2 = -3
            r9.zzue = r2
            r9.zzuc = r1
            return
        L_0x0017:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r2 = r0.getGlobalVisibleRect(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r3 = r0.getLocalVisibleRect(r3)
            com.google.android.gms.internal.ads.zzdl r4 = r9.zzqo
            boolean r4 = r4.zzaj()
            r5 = 1
            if (r4 != 0) goto L_0x005d
            android.app.KeyguardManager r4 = r9.zztx
            boolean r4 = r4.inKeyguardRestrictedInputMode()
            if (r4 == 0) goto L_0x005b
            android.app.Activity r4 = com.google.android.gms.internal.ads.zzds.zzc(r0)
            if (r4 == 0) goto L_0x0057
            android.view.Window r4 = r4.getWindow()
            if (r4 != 0) goto L_0x0048
            r4 = 0
            goto L_0x004c
        L_0x0048:
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
        L_0x004c:
            if (r4 == 0) goto L_0x0057
            int r4 = r4.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r4 = 0
            goto L_0x005e
        L_0x005d:
            r4 = 1
        L_0x005e:
            int r6 = r0.getWindowVisibility()
            int r7 = r9.zzud
            r8 = -1
            if (r7 == r8) goto L_0x0069
            int r6 = r9.zzud
        L_0x0069:
            int r7 = r0.getVisibility()
            if (r7 != 0) goto L_0x0086
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0086
            android.os.PowerManager r0 = r9.zztw
            boolean r0 = r0.isScreenOn()
            if (r0 == 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            if (r3 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            r1 = 1
        L_0x0086:
            boolean r0 = r9.zzuc
            if (r0 == r1) goto L_0x0097
            if (r1 == 0) goto L_0x0091
            long r2 = android.os.SystemClock.elapsedRealtime()
            goto L_0x0093
        L_0x0091:
            r2 = -2
        L_0x0093:
            r9.zzue = r2
            r9.zzuc = r1
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdu.zzar():void");
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zztz = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzty == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzty = new zzdw(this);
            this.zztv.registerReceiver(this.zzty, intentFilter);
        }
        if (this.zzsg != null) {
            try {
                this.zzsg.registerActivityLifecycleCallbacks(this.zzub);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzf(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.zztz     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.zztz     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.zztz = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.zzty
            if (r4 == 0) goto L_0x003a
            android.content.Context r4 = r3.zztv     // Catch:{ Exception -> 0x0038 }
            android.content.BroadcastReceiver r1 = r3.zzty     // Catch:{ Exception -> 0x0038 }
            r4.unregisterReceiver(r1)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.zzty = r0
        L_0x003a:
            android.app.Application r4 = r3.zzsg
            if (r4 == 0) goto L_0x0046
            android.app.Application r4 = r3.zzsg     // Catch:{ Exception -> 0x0046 }
            com.google.android.gms.internal.ads.zzcz r0 = r3.zzub     // Catch:{ Exception -> 0x0046 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdu.zzf(android.view.View):void");
    }
}
