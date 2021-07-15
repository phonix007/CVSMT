package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzso implements zzsp {
    private final /* synthetic */ Activity val$activity;

    zzso(zzsh zzsh, Activity activity) {
        this.val$activity = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.val$activity);
    }
}
