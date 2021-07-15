/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationPayloadProcessorHMS;

public class NotificationOpenedActivityHMS
extends Activity {
    private void processIntent() {
        this.processOpen(this.getIntent());
        this.finish();
    }

    private void processOpen(Intent intent) {
        NotificationPayloadProcessorHMS.handleHMSNotificationOpenIntent(this, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.processIntent();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.processIntent();
    }
}

