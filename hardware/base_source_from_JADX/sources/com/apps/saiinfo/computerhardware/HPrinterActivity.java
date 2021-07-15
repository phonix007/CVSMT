package com.apps.saiinfo.computerhardware;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class HPrinterActivity extends AppCompatActivity {
    CardView one;
    CardView three;
    CardView two;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0508R.layout.activity_hprinter);
        this.one = (CardView) findViewById(C0508R.C0510id.one);
        this.one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HPrinterActivity.this.startActivity(new Intent(HPrinterActivity.this, HPrintsActivity.class));
            }
        });
        this.two = (CardView) findViewById(C0508R.C0510id.two);
        this.two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HPrinterActivity.this.startActivity(new Intent(HPrinterActivity.this, HPrintInActivity.class));
            }
        });
        this.three = (CardView) findViewById(C0508R.C0510id.three);
        this.three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HPrinterActivity.this.startActivity(new Intent(HPrinterActivity.this, HPrintActivity.class));
            }
        });
        ((AdView) findViewById(C0508R.C0510id.adView)).loadAd(new AdRequest.Builder().build());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0508R.C0511menu.menu_share, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C0508R.C0510id.action_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Download Computer Hardware App from play store.");
        intent.putExtra("android.intent.extra.TEXT", "Download Computer Hardware App from play store. link: https://play.google.com/store/apps/developer?id=Sai%20Info&hl=en");
        startActivity(Intent.createChooser(intent, "Share Using"));
        return true;
    }
}
