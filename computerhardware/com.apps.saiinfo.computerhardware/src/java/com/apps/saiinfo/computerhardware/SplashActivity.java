/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.support.v7.app.AppCompatActivity
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.apps.saiinfo.computerhardware;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import com.apps.saiinfo.computerhardware.MainActivity;

public class SplashActivity
extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296393);
        new Handler().postDelayed(new Runnable(){

            public void run() {
                Intent intent = new Intent((Context)SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, (long)SPLASH_TIME_OUT);
    }

}

