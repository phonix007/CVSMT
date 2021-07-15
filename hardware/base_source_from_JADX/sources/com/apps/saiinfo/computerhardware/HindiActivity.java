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

public class HindiActivity extends AppCompatActivity {
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
        setContentView((int) C0508R.layout.activity_hindi);
        this.intro = (CardView) findViewById(C0508R.C0510id.intro);
        this.intro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HIntroActivity.class));
            }
        });
        this.key = (CardView) findViewById(C0508R.C0510id.key);
        this.key.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HKeyActivity.class));
            }
        });
        this.mouse = (CardView) findViewById(C0508R.C0510id.mouse);
        this.mouse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HMouseActivity.class));
            }
        });
        this.scan = (CardView) findViewById(C0508R.C0510id.scan);
        this.scan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HScannerActivity.class));
            }
        });
        this.micro = (CardView) findViewById(C0508R.C0510id.micro);
        this.micro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HMicroActivity.class));
            }
        });
        this.mon = (CardView) findViewById(C0508R.C0510id.mon);
        this.mon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HMonitorActivity.class));
            }
        });
        this.printer = (CardView) findViewById(C0508R.C0510id.printer);
        this.printer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HPrinterActivity.class));
            }
        });
        this.ram = (CardView) findViewById(C0508R.C0510id.ram);
        this.ram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HRamActivity.class));
            }
        });
        this.hard = (CardView) findViewById(C0508R.C0510id.hard);
        this.hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HHardActivity.class));
            }
        });
        this.board = (CardView) findViewById(C0508R.C0510id.board);
        this.board.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HMotherActivity.class));
            }
        });
        this.smps = (CardView) findViewById(C0508R.C0510id.smps);
        this.smps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HPowerActivity.class));
            }
        });
        this.back = (CardView) findViewById(C0508R.C0510id.back);
        this.back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HBackActivity.class));
            }
        });
        this.wire = (CardView) findViewById(C0508R.C0510id.wire);
        this.wire.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, HWireActivity.class));
            }
        });
        this.forms = (CardView) findViewById(C0508R.C0510id.forms);
        this.forms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HindiActivity.this.startActivity(new Intent(HindiActivity.this, FFormsActivity.class));
            }
        });
        ((AdView) findViewById(C0508R.C0510id.adView)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0508R.C0511menu.menu_hindi, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0508R.C0510id.action_share) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "डाऊनलोड करें कंप्युटर हार्डवेअर अॅप प्ले स्टोर से अभी। और बढाएं अपना कंप्युटर ज्ञान।");
            intent.putExtra("android.intent.extra.TEXT", "डाऊनलोड करें कंप्युटर हार्डवेअर अॅप प्ले स्टोर से अभी। और बढाएं अपना कंप्युटर ज्ञान। लिंक: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
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
            startActivity(new Intent(getApplicationContext(), HAboutActivity.class));
            return true;
        }
    }
}
