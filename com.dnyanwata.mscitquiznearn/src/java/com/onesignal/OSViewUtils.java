/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  com.onesignal.ActivityLifecycleHandler$ActivityAvailableListener
 *  com.onesignal.ActivityLifecycleListener
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.OSViewUtils;
import java.lang.ref.WeakReference;

class OSViewUtils {
    private static final int MARGIN_ERROR_PX_SIZE = OSViewUtils.dpToPx(24);

    OSViewUtils() {
    }

    static void decorViewReady(Activity activity, final Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("decorViewReady:");
        stringBuilder.append((Object)runnable);
        final String string2 = stringBuilder.toString();
        activity.getWindow().getDecorView().post(new Runnable(){

            public void run() {
                ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
                if (activityLifecycleHandler != null) {
                    activityLifecycleHandler.addActivityAvailableListener(string2, new ActivityLifecycleHandler.ActivityAvailableListener(this, activityLifecycleHandler){
                        final /* synthetic */ 1 this$0;
                        final /* synthetic */ ActivityLifecycleHandler val$activityLifecycleHandler;
                        {
                            this.this$0 = var1_1;
                            this.val$activityLifecycleHandler = activityLifecycleHandler;
                        }

                        void available(Activity activity) {
                            this.val$activityLifecycleHandler.removeActivityAvailableListener(this.this$0.string2);
                            if (OSViewUtils.isActivityFullyReady(activity)) {
                                this.this$0.runnable.run();
                                return;
                            }
                            OSViewUtils.decorViewReady(activity, this.this$0.runnable);
                        }
                    });
                }
            }
        });
    }

    static int dpToPx(int n) {
        return (int)((float)n * Resources.getSystem().getDisplayMetrics().density);
    }

    private static int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    static int getWindowHeight(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return OSViewUtils.getWindowHeightAPI23Plus(activity);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return OSViewUtils.getWindowHeightLollipop(activity);
        }
        return OSViewUtils.getDisplaySizeY(activity);
    }

    private static int getWindowHeightAPI23Plus(Activity activity) {
        View view = activity.getWindow().getDecorView();
        WindowInsets windowInsets = view.getRootWindowInsets();
        if (windowInsets == null) {
            return view.getHeight();
        }
        return view.getHeight() - windowInsets.getStableInsetBottom() - windowInsets.getStableInsetTop();
    }

    private static int getWindowHeightLollipop(Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return OSViewUtils.getWindowVisibleDisplayFrame(activity).height();
        }
        return OSViewUtils.getDisplaySizeY(activity);
    }

    private static Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    static int getWindowWidth(Activity activity) {
        return OSViewUtils.getWindowVisibleDisplayFrame(activity).width();
    }

    static boolean isActivityFullyReady(Activity activity) {
        boolean bl = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return bl;
        }
        boolean bl2 = activity.getWindow().getDecorView().getRootWindowInsets() != null;
        return bl && bl2;
    }

    static boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity)weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        boolean bl = false;
        if (view != null) {
            int n = displayMetrics.heightPixels - rect.bottom;
            int n2 = MARGIN_ERROR_PX_SIZE;
            bl = false;
            if (n > n2) {
                bl = true;
            }
        }
        return bl;
    }

}

