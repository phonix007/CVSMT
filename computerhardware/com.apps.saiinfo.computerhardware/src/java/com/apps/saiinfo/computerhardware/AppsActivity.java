/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.apps.saiinfo.computerhardware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class AppsActivity
extends AppCompatActivity {
    CardView all;
    CardView ppt;
    CardView shorts;
    CardView word;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296285);
        this.all = (CardView)this.findViewById(2131165330);
        this.all.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.allaboutcomputer&hl=en")));
            }
        });
        this.shorts = (CardView)this.findViewById(2131165451);
        this.shorts.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.computershortcutkeys&hl=en")));
            }
        });
        this.word = (CardView)this.findViewById(2131165489);
        this.word.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.learnmsword&hl=en")));
            }
        });
        this.ppt = (CardView)this.findViewById(2131165424);
        this.ppt.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/details?id=com.apps.saiinfo.learnmspowerpoint&hl=en")));
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

}

