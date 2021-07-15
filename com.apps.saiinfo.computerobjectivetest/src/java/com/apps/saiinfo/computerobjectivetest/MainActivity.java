/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.support.v7.app.ActionBar
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
 *  java.lang.String
 */
package com.apps.saiinfo.computerobjectivetest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.apps.saiinfo.computerobjectivetest.AboutActivity;
import com.apps.saiinfo.computerobjectivetest.MainActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity
extends AppCompatActivity {
    CardView eng1;
    CardView hin3;
    CardView mar2;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968728);
        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(2130837623);
        this.eng1 = (CardView)this.findViewById(2131558584);
        this.mar2 = (CardView)this.findViewById(2131558585);
        this.hin3 = (CardView)this.findViewById(2131558586);
        this.eng1.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = mainActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.EnglishActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.mar2.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = mainActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.MarathiActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.hin3.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = mainActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.HindiActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131623936, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n = menuItem.getItemId();
        if (n == 2131558672) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Download our Computer Objective Test App for knowledge of the computer.");
            intent.putExtra("android.intent.extra.TEXT", "Computer Objective Test");
            this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share Using"));
            return true;
        }
        if (n == 2131558671) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en")));
            return true;
        }
        if (n == 2131558670) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.computerobjectivetest")));
            return true;
        }
        if (n == 2131558673) {
            this.startActivity(new Intent(this.getApplicationContext(), AboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

