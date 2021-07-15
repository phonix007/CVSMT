package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzcz implements Application.ActivityLifecycleCallbacks {
    private final Application zzsg;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzsh;
    private boolean zzsi = false;

    public zzcz(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzsh = new WeakReference<>(activityLifecycleCallbacks);
        this.zzsg = application;
    }

    private final void zza(zzdh zzdh) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzsh.get();
            if (activityLifecycleCallbacks != null) {
                zzdh.zza(activityLifecycleCallbacks);
            } else if (!this.zzsi) {
                this.zzsg.unregisterActivityLifecycleCallbacks(this);
                this.zzsi = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzda(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzdb(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzdc(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzdd(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzde(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzdf(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzdg(this, activity));
    }
}
