/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  androidx.browser.customtabs.CustomTabsCallback
 *  androidx.browser.customtabs.CustomTabsClient
 *  androidx.browser.customtabs.CustomTabsIntent
 *  androidx.browser.customtabs.CustomTabsIntent$Builder
 *  androidx.browser.customtabs.CustomTabsServiceConnection
 *  androidx.browser.customtabs.CustomTabsSession
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.onesignal.OneSignal;
import java.util.List;

class OneSignalChromeTab {
    OneSignalChromeTab() {
    }

    private static boolean hasChromeTabLibrary() {
        return true;
    }

    protected static boolean open(String string2, boolean bl) {
        if (!OneSignalChromeTab.hasChromeTabLibrary()) {
            return false;
        }
        CustomTabsServiceConnection customTabsServiceConnection = new CustomTabsServiceConnection(string2, bl){
            private boolean openActivity;
            private String url;
            {
                this.url = string2;
                this.openActivity = bl;
            }

            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                customTabsClient.warmup(0L);
                CustomTabsSession customTabsSession = customTabsClient.newSession(null);
                if (customTabsSession == null) {
                    return;
                }
                Uri uri = Uri.parse((String)this.url);
                customTabsSession.mayLaunchUrl(uri, null, null);
                if (this.openActivity) {
                    CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder(customTabsSession).build();
                    customTabsIntent.intent.setData(uri);
                    customTabsIntent.intent.addFlags(268435456);
                    if (Build.VERSION.SDK_INT >= 16) {
                        OneSignal.appContext.startActivity(customTabsIntent.intent, customTabsIntent.startAnimationBundle);
                        return;
                    }
                    OneSignal.appContext.startActivity(customTabsIntent.intent);
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        return CustomTabsClient.bindCustomTabsService((Context)OneSignal.appContext, (String)"com.android.chrome", (CustomTabsServiceConnection)customTabsServiceConnection);
    }

}

