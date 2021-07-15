package com.apps.saiinfo.computerhardware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.support.p003v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AppsActivity extends AppCompatActivity {
    CardView all;
    CardView ppt;
    CardView shorts;
    CardView word;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0508R.layout.activity_apps);
        this.all = (CardView) findViewById(C0508R.C0510id.all);
        this.all.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.apps.saiinfo.allaboutcomputer&hl=en")));
            }
        });
        this.shorts = (CardView) findViewById(C0508R.C0510id.shorts);
        this.shorts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.apps.saiinfo.computershortcutkeys&hl=en")));
            }
        });
        this.word = (CardView) findViewById(C0508R.C0510id.word);
        this.word.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.apps.saiinfo.learnmsword&hl=en")));
            }
        });
        this.ppt = (CardView) findViewById(C0508R.C0510id.ppt);
        this.ppt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AppsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.apps.saiinfo.learnmspowerpoint&hl=en")));
            }
        });
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
