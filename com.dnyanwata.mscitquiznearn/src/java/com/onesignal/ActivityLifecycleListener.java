/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.ComponentCallbacks
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  java.lang.Object
 */
package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import com.onesignal.ActivityLifecycleHandler;

class ActivityLifecycleListener
implements Application.ActivityLifecycleCallbacks {
    private static ActivityLifecycleHandler activityLifecycleHandler;
    private static ComponentCallbacks configuration;
    private static ActivityLifecycleListener instance;

    ActivityLifecycleListener() {
    }

    public static ActivityLifecycleHandler getActivityLifecycleHandler() {
        return activityLifecycleHandler;
    }

    static void registerActivityLifecycleCallbacks(Application application) {
        if (instance == null) {
            ActivityLifecycleListener activityLifecycleListener;
            instance = activityLifecycleListener = new ActivityLifecycleListener();
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)activityLifecycleListener);
        }
        if (activityLifecycleHandler == null) {
            activityLifecycleHandler = new ActivityLifecycleHandler();
        }
        if (configuration == null) {
            ComponentCallbacks componentCallbacks;
            configuration = componentCallbacks = new ComponentCallbacks(){

                public void onConfigurationChanged(Configuration configuration) {
                    activityLifecycleHandler.onConfigurationChanged(configuration, activityLifecycleHandler.getCurActivity());
                }

                public void onLowMemory() {
                }
            };
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityCreated(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.activityLifecycleHandler;
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.onActivityStopped(activity);
        }
    }

}

