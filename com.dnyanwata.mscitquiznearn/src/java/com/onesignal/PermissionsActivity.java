/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  com.onesignal.ActivityLifecycleHandler$ActivityAvailableListener
 *  com.onesignal.ActivityLifecycleListener
 *  com.onesignal.AndroidSupportV4Compat
 *  com.onesignal.AndroidSupportV4Compat$ActivityCompat
 *  com.onesignal.LocationController
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.PermissionsActivity;
import com.onesignal.R;

public class PermissionsActivity
extends Activity {
    private static final int DELAY_TIME_CALLBACK_CALL = 500;
    private static final int REQUEST_LOCATION = 2;
    private static final int REQUEST_SETTINGS = 3;
    private static final String TAG = "com.onesignal.PermissionsActivity";
    private static ActivityLifecycleHandler.ActivityAvailableListener activityAvailableListener;
    static boolean answered;
    static boolean fallbackToSettings;
    static boolean neverAskAgainClicked;
    static boolean waiting;

    private void attemptToShowLocationPermissionSettings() {
        if (fallbackToSettings && neverAskAgainClicked && !AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)LocationController.requestPermission)) {
            this.showLocationPermissionSettings();
        }
    }

    private void requestPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            this.finish();
            this.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
            return;
        }
        if (!waiting) {
            waiting = true;
            neverAskAgainClicked = true ^ AndroidSupportV4Compat.ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)LocationController.requestPermission);
            String[] arrstring = new String[]{LocationController.requestPermission};
            AndroidSupportV4Compat.ActivityCompat.requestPermissions((Activity)this, (String[])arrstring, (int)2);
        }
    }

    private void showLocationPermissionSettings() {
        new AlertDialog.Builder((Context)OneSignal.getCurrentActivity()).setTitle(R.string.location_not_available_title).setMessage(R.string.location_not_available_open_settings_message).setPositiveButton(R.string.location_not_available_open_settings_option, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("package:");
                stringBuilder.append(PermissionsActivity.this.getPackageName());
                intent.setData(Uri.parse((String)stringBuilder.toString()));
                PermissionsActivity.this.startActivity(intent);
                LocationController.sendAndClearPromptHandlers((boolean)true, (OneSignal.PromptActionResult)OneSignal.PromptActionResult.PERMISSION_DENIED);
            }
        }).setNegativeButton(17039369, new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n) {
                LocationController.sendAndClearPromptHandlers((boolean)true, (OneSignal.PromptActionResult)OneSignal.PromptActionResult.PERMISSION_DENIED);
            }
        }).show();
    }

    static void startPrompt(boolean bl) {
        if (!waiting) {
            if (answered) {
                return;
            }
            fallbackToSettings = bl;
            activityAvailableListener = new ActivityLifecycleHandler.ActivityAvailableListener(){

                public void available(Activity activity) {
                    if (!activity.getClass().equals(PermissionsActivity.class)) {
                        Intent intent = new Intent((Context)activity, PermissionsActivity.class);
                        intent.setFlags(131072);
                        activity.startActivity(intent);
                        activity.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
                    }
                }
            };
            ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
            if (activityLifecycleHandler != null) {
                activityLifecycleHandler.addActivityAvailableListener(TAG, activityAvailableListener);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OneSignal.initWithContext((Context)this);
        if (bundle != null && bundle.getBoolean("android:hasCurrentPermissionsRequest", false)) {
            waiting = true;
            return;
        }
        this.requestPermission();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (OneSignal.isInitDone()) {
            this.requestPermission();
        }
    }

    public void onRequestPermissionsResult(int n, String[] arrstring, final int[] arrn) {
        ActivityLifecycleHandler activityLifecycleHandler;
        answered = true;
        waiting = false;
        if (n == 2) {
            new Handler().postDelayed(new Runnable(){

                public void run() {
                    int[] arrn2 = arrn;
                    int n = arrn2.length;
                    boolean bl = false;
                    if (n > 0) {
                        int n2 = arrn2[0];
                        bl = false;
                        if (n2 == 0) {
                            bl = true;
                        }
                    }
                    OneSignal.PromptActionResult promptActionResult = bl ? OneSignal.PromptActionResult.PERMISSION_GRANTED : OneSignal.PromptActionResult.PERMISSION_DENIED;
                    LocationController.sendAndClearPromptHandlers((boolean)true, (OneSignal.PromptActionResult)promptActionResult);
                    if (bl) {
                        LocationController.startGetLocation();
                        return;
                    }
                    PermissionsActivity.this.attemptToShowLocationPermissionSettings();
                    LocationController.fireFailedComplete();
                }
            }, 500L);
        }
        if ((activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler()) != null) {
            activityLifecycleHandler.removeActivityAvailableListener(TAG);
        }
        this.finish();
        this.overridePendingTransition(R.anim.onesignal_fade_in, R.anim.onesignal_fade_out);
    }

}

