/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
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
 *  java.lang.Class
 *  java.lang.String
 */
package com.apps.saiinfo.computerhardware;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.apps.saiinfo.computerhardware.HAboutActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class HScanUseActivity
extends AppCompatActivity {
    InterstitialAd mInterstitialAd;

    public void onBackPressed() {
        this.showInterstitial();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296327);
        ((AdView)this.findViewById(2131165327)).loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd = new InterstitialAd((Context)this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2393065895339578/9975897998");
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd.setAdListener(new AdListener(){

            public void onAdClosed() {
                super.onAdClosed();
                HScanUseActivity.this.finish();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.getMenuInflater().inflate(2131361792, menu2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n = menuItem.getItemId();
        if (n == 2131165211) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "\u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u0947\u0902 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0905\u0945\u092a \u092a\u094d\u0932\u0947 \u0938\u094d\u091f\u094b\u0930 \u0938\u0947 \u0905\u092d\u0940\u0964 \u0914\u0930 \u092c\u0922\u093e\u090f\u0902 \u0905\u092a\u0928\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u091c\u094d\u091e\u093e\u0928\u0964");
            intent.putExtra("android.intent.extra.TEXT", "\u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u0947\u0902 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0905\u0945\u092a \u092a\u094d\u0932\u0947 \u0938\u094d\u091f\u094b\u0930 \u0938\u0947 \u0905\u092d\u0940\u0964 \u0914\u0930 \u092c\u0922\u093e\u090f\u0902 \u0905\u092a\u0928\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u091c\u094d\u091e\u093e\u0928\u0964 \u0932\u093f\u0902\u0915: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
            this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share Using"));
            return true;
        }
        if (n == 2131165208) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en")));
            return true;
        }
        if (n == 2131165210) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.computerhardware&hl=en")));
            return true;
        }
        if (n == 2131165191) {
            this.startActivity(new Intent(this.getApplicationContext(), HAboutActivity.class));
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

