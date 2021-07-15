/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebView
 */
package com.onesignal;

import android.content.Context;
import android.webkit.WebView;

public class OSWebView
extends WebView {
    public OSWebView(Context context) {
        super(context);
    }

    public void computeScroll() {
    }

    public boolean overScrollBy(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        return false;
    }

    public void scrollTo(int n, int n2) {
    }
}

