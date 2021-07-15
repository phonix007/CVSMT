package com.apps.saiinfo.computerhardware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class EnglishActivity extends AppCompatActivity {
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0508R.layout.activity_english);
        this.intro = (CardView) findViewById(C0508R.C0510id.intro);
        this.intro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, IntroActivity.class));
            }
        });
        this.key = (CardView) findViewById(C0508R.C0510id.key);
        this.key.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, KeyActivity.class));
            }
        });
        this.mouse = (CardView) findViewById(C0508R.C0510id.mouse);
        this.mouse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, MouseActivity.class));
            }
        });
        this.scan = (CardView) findViewById(C0508R.C0510id.scan);
        this.scan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, ScannerActivity.class));
            }
        });
        this.micro = (CardView) findViewById(C0508R.C0510id.micro);
        this.micro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, MicroActivity.class));
            }
        });
        this.mon = (CardView) findViewById(C0508R.C0510id.mon);
        this.mon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, MonitorActivity.class));
            }
        });
        this.printer = (CardView) findViewById(C0508R.C0510id.printer);
        this.printer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, PrinterActivity.class));
            }
        });
        this.ram = (CardView) findViewById(C0508R.C0510id.ram);
        this.ram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, RamActivity.class));
            }
        });
        this.hard = (CardView) findViewById(C0508R.C0510id.hard);
        this.hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, HardActivity.class));
            }
        });
        this.board = (CardView) findViewById(C0508R.C0510id.board);
        this.board.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, MotherActivity.class));
            }
        });
        this.smps = (CardView) findViewById(C0508R.C0510id.smps);
        this.smps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, PowerActivity.class));
            }
        });
        this.back = (CardView) findViewById(C0508R.C0510id.back);
        this.back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, BackActivity.class));
            }
        });
        this.wire = (CardView) findViewById(C0508R.C0510id.wire);
        this.wire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, WireActivity.class));
            }
        });
        this.forms = (CardView) findViewById(C0508R.C0510id.forms);
        this.forms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnglishActivity.this.startActivity(new Intent(EnglishActivity.this, FFormsActivity.class));
            }
        });
        ((AdView) findViewById(C0508R.C0510id.adView)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0508R.C0511menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0508R.C0510id.action_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "Download Computer Hardware App from play store.");
            intent.putExtra("android.intent.extra.TEXT", "Download Computer Hardware App from play store. link: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
            startActivity(Intent.createChooser(intent, "Share Using"));
            return true;
        } else if (itemId == C0508R.C0510id.action_more) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en")));
            return true;
        } else if (itemId == C0508R.C0510id.action_rate) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.apps.saiinfo.computerhardware&hl=en")));
            return true;
        } else if (itemId != C0508R.C0510id.action_about) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(getApplicationContext(), AboutActivity.class));
            return true;
        }
    }
}
