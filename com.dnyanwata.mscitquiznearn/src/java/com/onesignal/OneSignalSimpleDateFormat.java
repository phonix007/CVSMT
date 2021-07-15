/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 */
package com.onesignal;

import java.text.SimpleDateFormat;
import java.util.Locale;

class OneSignalSimpleDateFormat {
    OneSignalSimpleDateFormat() {
    }

    static SimpleDateFormat iso8601Format() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}

