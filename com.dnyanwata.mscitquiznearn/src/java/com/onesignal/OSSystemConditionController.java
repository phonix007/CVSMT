/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.fragment.app.DialogFragment
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
 *  com.onesignal.ActivityLifecycleHandler$KeyboardListener
 *  com.onesignal.ActivityLifecycleListener
 *  java.lang.NoClassDefFoundError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.List
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSViewUtils;
import com.onesignal.OneSignal;
import java.lang.ref.WeakReference;
import java.util.List;

class OSSystemConditionController {
    private static final String TAG = "com.onesignal.OSSystemConditionController";
    private final OSSystemConditionObserver systemConditionObserver;

    OSSystemConditionController(OSSystemConditionObserver oSSystemConditionObserver) {
        this.systemConditionObserver = oSSystemConditionObserver;
    }

    static /* synthetic */ OSSystemConditionObserver access$000(OSSystemConditionController oSSystemConditionController) {
        return oSSystemConditionController.systemConditionObserver;
    }

    boolean isDialogFragmentShowing(Context context) throws NoClassDefFoundError {
        boolean bl = context instanceof AppCompatActivity;
        boolean bl2 = false;
        if (bl) {
            FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
            fragmentManager.registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks(this, fragmentManager){
                final /* synthetic */ OSSystemConditionController this$0;
                final /* synthetic */ FragmentManager val$manager;
                {
                    this.this$0 = oSSystemConditionController;
                    this.val$manager = fragmentManager;
                }

                public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                    super.onFragmentDetached(fragmentManager, fragment);
                    if (fragment instanceof DialogFragment) {
                        this.val$manager.unregisterFragmentLifecycleCallbacks((FragmentManager.FragmentLifecycleCallbacks)this);
                        OSSystemConditionController.access$000(this.this$0).systemConditionChanged();
                    }
                }
            }, true);
            List list = fragmentManager.getFragments();
            int n = list.size();
            bl2 = false;
            if (n > 0) {
                Fragment fragment = (Fragment)list.get(n - 1);
                boolean bl3 = fragment.isVisible();
                bl2 = false;
                if (bl3) {
                    boolean bl4 = fragment instanceof DialogFragment;
                    bl2 = false;
                    if (bl4) {
                        bl2 = true;
                    }
                }
            }
        }
        return bl2;
    }

    boolean systemConditionsAvailable() {
        if (OneSignal.getCurrentActivity() == null) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver curActivity null");
            return false;
        }
        try {
            if (this.isDialogFragmentShowing((Context)OneSignal.getCurrentActivity())) {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver dialog fragment detected");
                return false;
            }
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: ");
            stringBuilder.append((Object)noClassDefFoundError);
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        }
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        boolean bl = OSViewUtils.isKeyboardUp((WeakReference<Activity>)new WeakReference((Object)OneSignal.getCurrentActivity()));
        if (bl && activityLifecycleHandler != null) {
            activityLifecycleHandler.addSystemConditionObserver(TAG, this.systemConditionObserver);
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "OSSystemConditionObserver keyboard up detected");
        }
        return bl ^ true;
    }

    static interface OSSystemConditionHandler {
        public void removeSystemConditionObserver(String var1, ActivityLifecycleHandler.KeyboardListener var2);
    }

    static interface OSSystemConditionObserver {
        public void systemConditionChanged();
    }

}

