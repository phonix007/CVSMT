/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  java.lang.Class
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Thread
 */
package com.dnyanwata.mscitquiznearn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dnyanwata.mscitquiznearn.LoginActivity;
import com.dnyanwata.mscitquiznearn.databinding.ActivitySplashBinding;

public class SplashActivity
extends AppCompatActivity {
    ActivitySplashBinding binding;

    protected void onCreate(Bundle bundle) {
        ActivitySplashBinding activitySplashBinding;
        super.onCreate(bundle);
        this.binding = activitySplashBinding = ActivitySplashBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activitySplashBinding.getRoot());
        new Thread(new Runnable(){

            public void run() {
                try {
                    Thread.sleep((long)2000L);
                    SplashActivity.this.startActivity(new Intent((Context)SplashActivity.this, LoginActivity.class));
                    return;
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    return;
                }
            }
        }).start();
    }

}

