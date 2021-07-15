/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationOpenedProcessor;

public class NotificationOpenedReceiver
extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationOpenedProcessor.processFromContext((Context)this, this.getIntent());
        this.finish();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        NotificationOpenedProcessor.processFromContext((Context)this, this.getIntent());
        this.finish();
    }
}

