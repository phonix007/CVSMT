/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.support.v7.app.AppCompatActivity
 *  java.lang.Runnable
 */
package com.apps.saiinfo.computerobjectivetest;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.apps.saiinfo.computerobjectivetest.SplashActivity;

public class SplashActivity
extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968793);
        new Handler().postDelayed(new Runnable(this){
            final /* synthetic */ SplashActivity this$0;
            {
                this.this$0 = splashActivity;
            }

            public void run() {
                android.content.Intent intent = new android.content.Intent((android.content.Context)this.this$0, com.apps.saiinfo.computerobjectivetest.MainActivity.class);
                this.this$0.startActivity(intent);
                this.this$0.finish();
            }
        }, (long)SPLASH_TIME_OUT);
    }
}

