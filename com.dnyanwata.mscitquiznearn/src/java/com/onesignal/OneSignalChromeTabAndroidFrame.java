/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignalChromeTab
 *  com.onesignal.OneSignalRemoteParams
 *  com.onesignal.OneSignalRemoteParams$Params
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.SecureRandom
 */
package com.onesignal;

import com.onesignal.OneSignalChromeTab;
import com.onesignal.OneSignalRemoteParams;
import java.security.SecureRandom;

class OneSignalChromeTabAndroidFrame
extends OneSignalChromeTab {
    private static boolean opened;

    OneSignalChromeTabAndroidFrame() {
    }

    static void setup(String string2, String string3, String string4, OneSignalRemoteParams.Params params) {
        if (opened) {
            return;
        }
        if (params != null) {
            if (params.enterprise) {
                return;
            }
            if (string2 != null) {
                if (string3 == null) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("?app_id=");
                stringBuilder.append(string2);
                stringBuilder.append("&user_id=");
                stringBuilder.append(string3);
                String string5 = stringBuilder.toString();
                if (string4 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string5);
                    stringBuilder2.append("&ad_id=");
                    stringBuilder2.append(string4);
                    string5 = stringBuilder2.toString();
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(string5);
                stringBuilder3.append("&cbs_id=");
                stringBuilder3.append(new SecureRandom().nextInt(Integer.MAX_VALUE));
                String string6 = stringBuilder3.toString();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("https://onesignal.com/android_frame.html");
                stringBuilder4.append(string6);
                opened = OneSignalChromeTabAndroidFrame.open((String)stringBuilder4.toString(), (boolean)false);
            }
        }
    }
}

