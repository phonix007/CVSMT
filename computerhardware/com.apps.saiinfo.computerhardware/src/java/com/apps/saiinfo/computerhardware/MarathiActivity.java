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
import com.apps.saiinfo.computerhardware.FFormsActivity;
import com.apps.saiinfo.computerhardware.MAboutActivity;
import com.apps.saiinfo.computerhardware.MBackActivity;
import com.apps.saiinfo.computerhardware.MHardActivity;
import com.apps.saiinfo.computerhardware.MIntroActivity;
import com.apps.saiinfo.computerhardware.MKeyActivity;
import com.apps.saiinfo.computerhardware.MMicroActivity;
import com.apps.saiinfo.computerhardware.MMonitorActivity;
import com.apps.saiinfo.computerhardware.MMotherActivity;
import com.apps.saiinfo.computerhardware.MMouseActivity;
import com.apps.saiinfo.computerhardware.MPowerActivity;
import com.apps.saiinfo.computerhardware.MPrinterActivity;
import com.apps.saiinfo.computerhardware.MRamActivity;
import com.apps.saiinfo.computerhardware.MScannerActivity;
import com.apps.saiinfo.computerhardware.MWireActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MarathiActivity
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
        this.setContentView(2131296339);
        this.intro = (CardView)this.findViewById(2131165399);
        this.intro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MIntroActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.key = (CardView)this.findViewById(2131165401);
        this.key.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MKeyActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.mouse = (CardView)this.findViewById(2131165414);
        this.mouse.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MMouseActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.scan = (CardView)this.findViewById(2131165434);
        this.scan.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MScannerActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.micro = (CardView)this.findViewById(2131165411);
        this.micro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MMicroActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.mon = (CardView)this.findViewById(2131165413);
        this.mon.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MMonitorActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.printer = (CardView)this.findViewById(2131165425);
        this.printer.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MPrinterActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.ram = (CardView)this.findViewById(2131165430);
        this.ram.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MRamActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.hard = (CardView)this.findViewById(2131165375);
        this.hard.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MHardActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.board = (CardView)this.findViewById(2131165336);
        this.board.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MMotherActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.smps = (CardView)this.findViewById(2131165455);
        this.smps.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MPowerActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.back = (CardView)this.findViewById(2131165333);
        this.back.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MBackActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.wire = (CardView)this.findViewById(2131165487);
        this.wire.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, MWireActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        this.forms = (CardView)this.findViewById(2131165372);
        this.forms.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)MarathiActivity.this, FFormsActivity.class);
                MarathiActivity.this.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131165327)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.getMenuInflater().inflate(2131361794, menu2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n = menuItem.getItemId();
        if (n == 2131165211) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "\u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0905\u0945\u092a \u092a\u094d\u0932\u0947 \u0938\u094d\u091f\u094b\u0930 \u092e\u0927\u0942\u0928 \u0935 \u0935\u093e\u0922\u0935\u093e \u0906\u092a\u0932\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u091c\u094d\u091e\u093e\u0928.");
            intent.putExtra("android.intent.extra.TEXT", "\u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0905\u0945\u092a \u092a\u094d\u0932\u0947 \u0938\u094d\u091f\u094b\u0930 \u092e\u0927\u0942\u0928 \u0935 \u0935\u093e\u0922\u0935\u093e \u0906\u092a\u0932\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u091c\u094d\u091e\u093e\u0928. \u0932\u093f\u0902\u0915: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
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
            this.startActivity(new Intent(this.getApplicationContext(), MAboutActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}

