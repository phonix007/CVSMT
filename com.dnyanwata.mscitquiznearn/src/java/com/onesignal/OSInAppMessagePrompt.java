/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.OneSignal;

abstract class OSInAppMessagePrompt {
    private boolean prompted = false;

    OSInAppMessagePrompt() {
    }

    abstract String getPromptKey();

    abstract void handlePrompt(OneSignal.OSPromptActionCompletionCallback var1);

    boolean hasPrompted() {
        return this.prompted;
    }

    void setPrompted(boolean bl) {
        this.prompted = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessagePrompt{key=");
        stringBuilder.append(this.getPromptKey());
        stringBuilder.append(" prompted=");
        stringBuilder.append(this.prompted);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

