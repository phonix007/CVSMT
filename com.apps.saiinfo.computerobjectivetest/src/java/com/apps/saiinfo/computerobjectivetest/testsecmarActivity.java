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
package com.apps.saiinfo.computerobjectivetest;

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
import com.apps.saiinfo.computerobjectivetest.AboutmActivity;
import com.apps.saiinfo.computerobjectivetest.DesignsecmarActivity;
import com.apps.saiinfo.computerobjectivetest.DesignsecmarathiActivity;
import com.apps.saiinfo.computerobjectivetest.DesignsmActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class testsecmarActivity
extends AppCompatActivity {
    CardView test1;
    CardView test2;
    CardView test3;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968802);
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        this.test1 = (CardView)this.findViewById(2131558530);
        this.test2 = (CardView)this.findViewById(2131558532);
        this.test3 = (CardView)this.findViewById(2131558534);
        this.test1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)testsecmarActivity.this, DesignsmActivity.class);
                testsecmarActivity.this.startActivity(intent);
            }
        });
        this.test2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)testsecmarActivity.this, DesignsecmarathiActivity.class);
                testsecmarActivity.this.startActivity(intent);
            }
        });
        this.test3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)testsecmarActivity.this, DesignsecmarActivity.class);
                testsecmarActivity.this.startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131623938, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n = menuItem.getItemId();
        if (n == 2131558672) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "\u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0935\u093f\u0937\u092f\u0940 \u0935\u0948\u0915\u0932\u094d\u092a\u093f\u0915 \u092a\u094d\u0930\u0936\u094d\u0928\u093e\u0902\u091a\u093e \u0938\u0930\u093e\u0935 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u093e Computer Objective Test \u0905\u0945\u092a.");
            intent.putExtra("android.intent.extra.TEXT", "Computer Objective Test");
            this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share Using"));
            return true;
        }
        if (n == 2131558670) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.computerobjectivetest")));
            return true;
        }
        if (n == 2131558671) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en")));
            return true;
        }
        if (n == 2131558673) {
            this.startActivity(new Intent(this.getApplicationContext(), AboutmActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}

