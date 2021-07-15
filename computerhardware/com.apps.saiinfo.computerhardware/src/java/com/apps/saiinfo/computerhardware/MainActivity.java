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
import com.apps.saiinfo.computerhardware.AboutActivity;
import com.apps.saiinfo.computerhardware.EnglishActivity;
import com.apps.saiinfo.computerhardware.HindiActivity;
import com.apps.saiinfo.computerhardware.MarathiActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity
extends AppCompatActivity {
    CardView eng1;
    CardView hin2;
    CardView mar3;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296338);
        this.eng1 = (CardView)this.findViewById(2131165364);
        this.mar3 = (CardView)this.findViewById(2131165408);
        this.hin2 = (CardView)this.findViewById(2131165377);
        this.eng1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, EnglishActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        this.mar3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, MarathiActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        this.hin2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MainActivity.this, HindiActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131165327)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.getMenuInflater().inflate(2131361793, menu2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n = menuItem.getItemId();
        if (n == 2131165211) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Download Computer Hardware App from play store.");
            intent.putExtra("android.intent.extra.TEXT", "Download Computer Hardware App from play store. link: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
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
            this.startActivity(new Intent(this.getApplicationContext(), AboutActivity.class));
            return true;
        }
        if (n == 2131165209) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://saiinfoapps.blogspot.com/p/privacy-policy-sai-info-built-all-apps.html")));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}

