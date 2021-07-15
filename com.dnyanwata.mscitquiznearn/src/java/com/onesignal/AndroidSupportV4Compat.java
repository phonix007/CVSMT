/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.util.Log
 *  androidx.core.app.ActivityCompat
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.util.Log;

class AndroidSupportV4Compat {
    AndroidSupportV4Compat() {
    }

    static class ActivityCompat {
        ActivityCompat() {
        }

        static void requestPermissions(Activity activity, String[] arrstring, int n) {
            ActivityCompatApi23.requestPermissions(activity, arrstring, n);
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String string) {
            return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, string);
        }
    }

    static class ActivityCompatApi23 {
        ActivityCompatApi23() {
        }

        static void requestPermissions(Activity activity, String[] arrstring, int n) {
            if (activity instanceof RequestPermissionsRequestCodeValidator) {
                ((RequestPermissionsRequestCodeValidator)activity).validateRequestPermissionsRequestCode(n);
            }
            activity.requestPermissions(arrstring, n);
        }

        static boolean shouldShowRequestPermissionRationale(Activity activity, String string) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale((Activity)activity, (String)string);
        }
    }

    static class ContextCompat {
        ContextCompat() {
        }

        static int checkSelfPermission(Context context, String string) {
            try {
                int n = context.checkPermission(string, Process.myPid(), Process.myUid());
                return n;
            }
            catch (Throwable throwable) {
                Log.e((String)"OneSignal", (String)"checkSelfPermission failed, returning PERMISSION_DENIED");
                return -1;
            }
        }

        static int getColor(Context context, int n) {
            if (Build.VERSION.SDK_INT > 22) {
                return context.getColor(n);
            }
            return context.getResources().getColor(n);
        }
    }

    static interface RequestPermissionsRequestCodeValidator {
        public void validateRequestPermissionsRequestCode(int var1);
    }

}

