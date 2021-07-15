package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzsh implements Application.ActivityLifecycleCallbacks {
    private final Application zzbwe;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzbww;
    private boolean zzbwx = false;

    public zzsh(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzbww = new WeakReference<>(activityLifecycleCallbacks);
        this.zzbwe = application;
    }

    private final void zza(zzsp zzsp) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzbww.get();
            if (activityLifecycleCallbacks != null) {
                zzsp.zza(activityLifecycleCallbacks);
            } else if (!this.zzbwx) {
                this.zzbwe.unregisterActivityLifecycleCallbacks(this);
                this.zzbwx = true;
            }
        } catch (Exception e) {
            zzaxz.zzb("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzsi(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzsj(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzsk(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzsl(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzsm(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzsn(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzso(this, activity));
    }
}
