/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.support.design.widget.FloatingActionButton
 *  android.support.v7.app.AppCompatActivity
 *  android.support.v7.widget.CardView
 *  android.support.v7.widget.Toolbar
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.String
 */
package com.apps.saiinfo.computerobjectivetest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.apps.saiinfo.computerobjectivetest.AboutmActivity;
import com.apps.saiinfo.computerobjectivetest.MarathiActivity;

public class MarathiActivity
extends AppCompatActivity {
    CardView Input;
    CardView all;
    CardView hardware;
    CardView internet;
    CardView secondary;
    CardView system;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968729);
        this.setSupportActionBar((Toolbar)this.findViewById(2131558571));
        this.Input = (CardView)this.findViewById(2131558615);
        this.Input.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.activity_testmarathi.class);
                this.this$0.startActivity(intent);
            }
        });
        this.secondary = (CardView)this.findViewById(2131558618);
        this.secondary.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.testsecmarActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.hardware = (CardView)this.findViewById(2131558621);
        this.hardware.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.HardMarActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.system = (CardView)this.findViewById(2131558623);
        this.system.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.SystemMarActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.internet = (CardView)this.findViewById(2131558626);
        this.internet.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.InternetMarActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.all = (CardView)this.findViewById(2131558455);
        this.all.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.AllMarActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        ((FloatingActionButton)this.findViewById(2131558572)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ MarathiActivity this$0;
            {
                this.this$0 = marathiActivity;
            }

            public void onClick(View view) {
                this.this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)"https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en")));
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

