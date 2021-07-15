/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.ads.InterstitialAd
 *  java.lang.CharSequence
 *  java.lang.String
 */
package com.apps.saiinfo.computerhardware;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class FunActivity
extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    public void onBackPressed() {
        this.showInterstitial();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296292);
        ((AdView)this.findViewById(2131165327)).loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd = new InterstitialAd((Context)this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2393065895339578/9975897998");
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd.setAdListener(new AdListener(){

            public void onAdClosed() {
                super.onAdClosed();
                FunActivity.this.finish();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.getMenuInflater().inflate(2131361795, menu2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131165211) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Download Computer Hardware App from play store.");
            intent.putExtra("android.intent.extra.TEXT", "Download Computer Hardware App from play store. link: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
            this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share Using"));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void showInterstitial() {
        if (this.mInterstitialAd.isLoaded()) {
            this.mInterstitialAd.show();
            return;
        }
        this.finish();
    }

}

