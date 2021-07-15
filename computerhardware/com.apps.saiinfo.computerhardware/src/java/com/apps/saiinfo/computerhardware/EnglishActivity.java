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
import com.apps.saiinfo.computerhardware.BackActivity;
import com.apps.saiinfo.computerhardware.FFormsActivity;
import com.apps.saiinfo.computerhardware.HardActivity;
import com.apps.saiinfo.computerhardware.IntroActivity;
import com.apps.saiinfo.computerhardware.KeyActivity;
import com.apps.saiinfo.computerhardware.MicroActivity;
import com.apps.saiinfo.computerhardware.MonitorActivity;
import com.apps.saiinfo.computerhardware.MotherActivity;
import com.apps.saiinfo.computerhardware.MouseActivity;
import com.apps.saiinfo.computerhardware.PowerActivity;
import com.apps.saiinfo.computerhardware.PrinterActivity;
import com.apps.saiinfo.computerhardware.RamActivity;
import com.apps.saiinfo.computerhardware.ScannerActivity;
import com.apps.saiinfo.computerhardware.WireActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class EnglishActivity
extends AppCompatActivity {
    CardView back;
    CardView board;
    CardView forms;
    CardView hard;
    CardView intro;
    CardView key;
    CardView micro;
    CardView mon;
    CardView mouse;
    CardView printer;
    CardView ram;
    CardView scan;
    CardView smps;
    CardView wire;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131296290);
        this.intro = (CardView)this.findViewById(2131165399);
        this.intro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, IntroActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.key = (CardView)this.findViewById(2131165401);
        this.key.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, KeyActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.mouse = (CardView)this.findViewById(2131165414);
        this.mouse.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, MouseActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.scan = (CardView)this.findViewById(2131165434);
        this.scan.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, ScannerActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.micro = (CardView)this.findViewById(2131165411);
        this.micro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, MicroActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.mon = (CardView)this.findViewById(2131165413);
        this.mon.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, MonitorActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.printer = (CardView)this.findViewById(2131165425);
        this.printer.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, PrinterActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.ram = (CardView)this.findViewById(2131165430);
        this.ram.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, RamActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.hard = (CardView)this.findViewById(2131165375);
        this.hard.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, HardActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.board = (CardView)this.findViewById(2131165336);
        this.board.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, MotherActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.smps = (CardView)this.findViewById(2131165455);
        this.smps.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, PowerActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.back = (CardView)this.findViewById(2131165333);
        this.back.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, BackActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.wire = (CardView)this.findViewById(2131165487);
        this.wire.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, WireActivity.class);
                EnglishActivity.this.startActivity(intent);
            }
        });
        this.forms = (CardView)this.findViewById(2131165372);
        this.forms.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)EnglishActivity.this, FFormsActivity.class);
                EnglishActivity.this.startActivity(intent);
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
        return super.onOptionsItemSelected(menuItem);
    }

}

