/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  com.onesignal.ActivityLifecycleHandler$1
 *  com.onesignal.ActivityLifecycleHandler$ActivityAvailableListener
 *  com.onesignal.ActivityLifecycleHandler$AppFocusRunnable
 *  com.onesignal.ActivityLifecycleHandler$KeyboardListener
 *  com.onesignal.ActivityLifecycleListener
 *  com.onesignal.OSSystemConditionController
 *  com.onesignal.OSSystemConditionController$OSSystemConditionHandler
 *  com.onesignal.OSSystemConditionController$OSSystemConditionObserver
 *  com.onesignal.OSUtils
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSFocusDelaySync;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
class ActivityLifecycleHandler
implements OSSystemConditionController.OSSystemConditionHandler {
    private static final String FOCUS_LOST_WORKER_TAG = "FOCUS_LOST_WORKER_TAG";
    private static final Object SYNC_LOCK;
    private static AppFocusRunnable appFocusRunnable;
    private static final Map<String, ActivityAvailableListener> sActivityAvailableListeners;
    private static final Map<String, KeyboardListener> sKeyboardListeners;
    private static final Map<String, OSSystemConditionController.OSSystemConditionObserver> sSystemConditionObservers;
    private Activity curActivity;
    private boolean nextResumeIsFirstActivity;

    static {
        SYNC_LOCK = new Object();
        sActivityAvailableListeners = new ConcurrentHashMap();
        sSystemConditionObservers = new ConcurrentHashMap();
        sKeyboardListeners = new ConcurrentHashMap();
    }

    ActivityLifecycleHandler() {
        this.curActivity = null;
        this.nextResumeIsFirstActivity = false;
    }

    static /* synthetic */ Map access$300() {
        return sActivityAvailableListeners;
    }

    private void handleFocus() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityLifecycleHandler handleFocus, with runnable: ");
        stringBuilder.append((Object)appFocusRunnable);
        stringBuilder.append(" nextResumeIsFirstActivity: ");
        stringBuilder.append(this.nextResumeIsFirstActivity);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (!this.hasBackgrounded() && !this.nextResumeIsFirstActivity) {
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"ActivityLifecycleHandler cancel background lost focus sync task");
            OSFocusDelaySync.getInstance().cancelBackgroundSyncTask(OneSignal.appContext);
            return;
        }
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"ActivityLifecycleHandler reset background state, call app focus");
        this.nextResumeIsFirstActivity = false;
        this.resetBackgroundState();
        OneSignal.onAppFocus();
    }

    private void handleLostFocus() {
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"ActivityLifecycleHandler Handling lost focus");
        AppFocusRunnable appFocusRunnable = ActivityLifecycleHandler.appFocusRunnable;
        if (appFocusRunnable != null && AppFocusRunnable.access$100(appFocusRunnable) && !AppFocusRunnable.access$200(ActivityLifecycleHandler.appFocusRunnable)) {
            return;
        }
        OneSignal.getFocusTimeController().appStopped();
        OSFocusDelaySync.getInstance().scheduleSyncTask(OneSignal.appContext);
    }

    private void logCurActivity() {
        String string;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("curActivity is NOW: ");
        if (this.curActivity != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(this.curActivity.getClass().getName());
            stringBuilder2.append(":");
            stringBuilder2.append((Object)this.curActivity);
            string = stringBuilder2.toString();
        } else {
            string = "null";
        }
        stringBuilder.append(string);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
    }

    private void logOrientationChange(int n, Activity activity) {
        if (n == 2) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration Orientation Change: LANDSCAPE (");
            stringBuilder.append(n);
            stringBuilder.append(") on activity: ");
            stringBuilder.append((Object)activity);
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            return;
        }
        if (n == 1) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Configuration Orientation Change: PORTRAIT (");
            stringBuilder.append(n);
            stringBuilder.append(") on activity: ");
            stringBuilder.append((Object)activity);
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        }
    }

    private void onOrientationChanged(Activity activity) {
        this.handleLostFocus();
        Iterator iterator = sActivityAvailableListeners.entrySet().iterator();
        while (iterator.hasNext()) {
            (((Map.Entry)iterator.next()).getValue()).stopped(activity);
        }
        Iterator iterator2 = sActivityAvailableListeners.entrySet().iterator();
        while (iterator2.hasNext()) {
            (((Map.Entry)iterator2.next()).getValue()).available(this.curActivity);
        }
        ViewTreeObserver viewTreeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry entry : sSystemConditionObservers.entrySet()) {
            KeyboardListener keyboardListener = new /* Unavailable Anonymous Inner Class!! */;
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
            sKeyboardListeners.put(entry.getKey(), (Object)keyboardListener);
        }
        this.handleFocus();
    }

    static void runLostFocusLogic(Context context) {
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"ActivityLifecycleHandler runLostFocusLogic");
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler == null || activityLifecycleHandler.curActivity == null) {
            OneSignal.setInForeground((boolean)false);
        }
        appFocusRunnable = new /* Unavailable Anonymous Inner Class!! */;
        OSFocusDelaySync.getInstance().doBackgroundSync(context, (Runnable)appFocusRunnable);
    }

    void addActivityAvailableListener(String string, ActivityAvailableListener activityAvailableListener) {
        sActivityAvailableListeners.put((Object)string, (Object)activityAvailableListener);
        Activity activity = this.curActivity;
        if (activity != null) {
            activityAvailableListener.available(activity);
        }
    }

    void addSystemConditionObserver(String string, OSSystemConditionController.OSSystemConditionObserver oSSystemConditionObserver) {
        Activity activity = this.curActivity;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            KeyboardListener keyboardListener = new /* Unavailable Anonymous Inner Class!! */;
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
            sKeyboardListeners.put((Object)string, (Object)keyboardListener);
        }
        sSystemConditionObservers.put((Object)string, (Object)oSSystemConditionObserver);
    }

    public Activity getCurActivity() {
        return this.curActivity;
    }

    boolean hasBackgrounded() {
        AppFocusRunnable appFocusRunnable = ActivityLifecycleHandler.appFocusRunnable;
        return appFocusRunnable != null && AppFocusRunnable.access$100(appFocusRunnable);
    }

    void onActivityCreated(Activity activity) {
    }

    void onActivityDestroyed(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityDestroyed: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        sKeyboardListeners.clear();
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        this.logCurActivity();
    }

    void onActivityPaused(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityPaused: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        this.logCurActivity();
    }

    void onActivityResumed(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityResumed: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.setCurActivity(activity);
        this.logCurActivity();
        this.handleFocus();
    }

    void onActivityStarted(Activity activity) {
    }

    void onActivityStopped(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onActivityStopped: ");
        stringBuilder.append((Object)activity);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (activity == this.curActivity) {
            this.curActivity = null;
            this.handleLostFocus();
        }
        Iterator iterator = sActivityAvailableListeners.entrySet().iterator();
        while (iterator.hasNext()) {
            (((Map.Entry)iterator.next()).getValue()).stopped(activity);
        }
        this.logCurActivity();
    }

    void onConfigurationChanged(Configuration configuration, Activity activity) {
        Activity activity2 = this.curActivity;
        if (activity2 != null && OSUtils.hasConfigChangeFlag((Activity)activity2, (int)128)) {
            this.logOrientationChange(configuration.orientation, activity);
            this.onOrientationChanged(activity);
        }
    }

    void removeActivityAvailableListener(String string) {
        sActivityAvailableListeners.remove((Object)string);
    }

    public void removeSystemConditionObserver(String string, KeyboardListener keyboardListener) {
        Activity activity = this.curActivity;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (Build.VERSION.SDK_INT < 16) {
                viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
            } else {
                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
            }
        }
        sKeyboardListeners.remove((Object)string);
        sSystemConditionObservers.remove((Object)string);
    }

    void resetBackgroundState() {
        AppFocusRunnable appFocusRunnable = ActivityLifecycleHandler.appFocusRunnable;
        if (appFocusRunnable != null) {
            AppFocusRunnable.access$102(appFocusRunnable, (boolean)false);
        }
    }

    public void setCurActivity(Activity activity) {
        this.curActivity = activity;
        Iterator iterator = sActivityAvailableListeners.entrySet().iterator();
        while (iterator.hasNext()) {
            (((Map.Entry)iterator.next()).getValue()).available(this.curActivity);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.curActivity.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : sSystemConditionObservers.entrySet()) {
                KeyboardListener keyboardListener = new /* Unavailable Anonymous Inner Class!! */;
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)keyboardListener);
                sKeyboardListeners.put(entry.getKey(), (Object)keyboardListener);
            }
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
        }
    }

    void setNextResumeIsFirstActivity(boolean bl) {
        this.nextResumeIsFirstActivity = bl;
    }
}

