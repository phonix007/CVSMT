/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.support.v7.app.AppCompatActivity
 *  android.support.v7.widget.CardView
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.apps.saiinfo.computerhardware;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.apps.saiinfo.computerhardware.AppsActivity;
import com.apps.saiinfo.computerhardware.HAboutActivity;
import com.apps.saiinfo.computerhardware.HFunActivity;
import com.apps.saiinfo.computerhardware.HKeyConnectActivity;
import com.apps.saiinfo.computerhardware.HKeyNameActivity;
import com.apps.saiinfo.computerhardware.HKeysActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HKeyActivity
extends AppCompatActivity {
    CardView five;
    CardView four;
    CardView one;
    CardView three;
    CardView two;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296305);
        this.one = (CardView)this.findViewById(2131165422);
        this.one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HKeyActivity.this, HKeysActivity.class);
                HKeyActivity.this.startActivity(intent);
            }
        });
        this.two = (CardView)this.findViewById(2131165482);
        this.two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HKeyActivity.this, HKeyNameActivity.class);
                HKeyActivity.this.startActivity(intent);
            }
        });
        this.three = (CardView)this.findViewById(2131165475);
        this.three.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HKeyActivity.this, HFunActivity.class);
                HKeyActivity.this.startActivity(intent);
            }
        });
        this.four = (CardView)this.findViewById(2131165373);
        this.four.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HKeyActivity.this, HKeyConnectActivity.class);
                HKeyActivity.this.startActivity(intent);
            }
        });
        this.five = (CardView)this.findViewById(2131165370);
        this.five.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HKeyActivity.this, AppsActivity.class);
                HKeyActivity.this.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131165327)).loadAd(new AdRequest.Builder().build());
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

}

