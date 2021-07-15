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
import com.apps.saiinfo.computerhardware.HAboutActivity;
import com.apps.saiinfo.computerhardware.HBackActivity;
import com.apps.saiinfo.computerhardware.HHardActivity;
import com.apps.saiinfo.computerhardware.HIntroActivity;
import com.apps.saiinfo.computerhardware.HKeyActivity;
import com.apps.saiinfo.computerhardware.HMicroActivity;
import com.apps.saiinfo.computerhardware.HMonitorActivity;
import com.apps.saiinfo.computerhardware.HMotherActivity;
import com.apps.saiinfo.computerhardware.HMouseActivity;
import com.apps.saiinfo.computerhardware.HPowerActivity;
import com.apps.saiinfo.computerhardware.HPrinterActivity;
import com.apps.saiinfo.computerhardware.HRamActivity;
import com.apps.saiinfo.computerhardware.HScannerActivity;
import com.apps.saiinfo.computerhardware.HWireActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HindiActivity
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
        this.setContentView(2131296303);
        this.intro = (CardView)this.findViewById(2131165399);
        this.intro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HIntroActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.key = (CardView)this.findViewById(2131165401);
        this.key.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HKeyActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.mouse = (CardView)this.findViewById(2131165414);
        this.mouse.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HMouseActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.scan = (CardView)this.findViewById(2131165434);
        this.scan.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HScannerActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.micro = (CardView)this.findViewById(2131165411);
        this.micro.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HMicroActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.mon = (CardView)this.findViewById(2131165413);
        this.mon.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HMonitorActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.printer = (CardView)this.findViewById(2131165425);
        this.printer.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HPrinterActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.ram = (CardView)this.findViewById(2131165430);
        this.ram.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HRamActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.hard = (CardView)this.findViewById(2131165375);
        this.hard.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HHardActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.board = (CardView)this.findViewById(2131165336);
        this.board.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HMotherActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.smps = (CardView)this.findViewById(2131165455);
        this.smps.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HPowerActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.back = (CardView)this.findViewById(2131165333);
        this.back.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HBackActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.wire = (CardView)this.findViewById(2131165487);
        this.wire.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, HWireActivity.class);
                HindiActivity.this.startActivity(intent);
            }
        });
        this.forms = (CardView)this.findViewById(2131165372);
        this.forms.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent((Context)HindiActivity.this, FFormsActivity.class);
                HindiActivity.this.startActivity(intent);
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

