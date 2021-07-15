/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSInAppMessagePrompt
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$OSPromptActionCompletionCallback
 *  java.lang.String
 */
package com.onesignal;

import com.onesignal.OSInAppMessagePrompt;
import com.onesignal.OneSignal;

class OSInAppMessageLocationPrompt
extends OSInAppMessagePrompt {
    static final String LOCATION_PROMPT_KEY = "location";

    OSInAppMessageLocationPrompt() {
    }

    String getPromptKey() {
        return LOCATION_PROMPT_KEY;
    }

    void handlePrompt(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback) {
        OneSignal.promptLocation((OneSignal.OSPromptActionCompletionCallback)oSPromptActionCompletionCallback, (boolean)true);
    }
}

