/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.PendingIntent
 *  android.app.PendingIntent$CanceledException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  com.google.android.gms.common.GoogleApiAvailability
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GoogleApiAvailability;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;

class GooglePlayServicesUpgradePrompt {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    GooglePlayServicesUpgradePrompt() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void OpenPlayStoreToApp(Activity activity) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        PendingIntent pendingIntent = googleApiAvailability.getErrorResolutionPendingIntent((Context)activity, googleApiAvailability.isGooglePlayServicesAvailable(OneSignal.appContext), 9000);
        if (pendingIntent == null) return;
        try {
            pendingIntent.send();
            return;
        }
        catch (PendingIntent.CanceledException canceledException) {
            canceledException.printStackTrace();
        }
    }

    private static boolean isGooglePlayStoreInstalled() {
        boolean bl;
        try {
            PackageManager packageManager = OneSignal.appContext.getPackageManager();
            bl = ((String)packageManager.getPackageInfo((String)"com.google.android.gms", (int)128).applicationInfo.loadLabel(packageManager)).equals((Object)"Market");
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
        return bl ^ true;
    }

    static void showUpdateGPSDialog() {
        if (OSUtils.isAndroidDeviceType()) {
            if (!GooglePlayServicesUpgradePrompt.isGooglePlayStoreInstalled()) {
                return;
            }
            if (OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
                return;
            }
            OSUtils.runOnMainUIThread(new Runnable(){

                public void run() {
                    final Activity activity = OneSignal.getCurrentActivity();
                    if (activity == null) {
                        return;
                    }
                    String string2 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                    String string3 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_update", "Update");
                    String string4 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_skip", "Skip");
                    String string5 = OSUtils.getResourceString((Context)activity, "onesignal_gms_missing_alert_button_close", "Close");
                    new AlertDialog.Builder((Context)activity).setMessage((CharSequence)string2).setPositiveButton((CharSequence)string3, new DialogInterface.OnClickListener(){

                        public void onClick(DialogInterface dialogInterface, int n) {
                            GooglePlayServicesUpgradePrompt.OpenPlayStoreToApp(activity);
                        }
                    }).setNegativeButton((CharSequence)string4, new DialogInterface.OnClickListener(){

                        public void onClick(DialogInterface dialogInterface, int n) {
                            OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_DO_NOT_SHOW_MISSING_GPS", true);
                        }
                    }).setNeutralButton((CharSequence)string5, null).create().show();
                }

            });
        }
    }

}

