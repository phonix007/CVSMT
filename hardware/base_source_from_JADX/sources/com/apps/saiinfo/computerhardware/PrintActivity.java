package com.apps.saiinfo.computerhardware;

import android.content.Intent;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class PrintActivity extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    WebView webView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0508R.layout.activity_print);
        this.webView = (WebView) findViewById(C0508R.C0510id.webView);
        this.webView.loadUrl("file:///android_asset/print.html");
        ((AdView) findViewById(C0508R.C0510id.adView)).loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd = new InterstitialAd(this);
        this.mInterstitialAd.setAdUnitId("ca-app-pub-2393065895339578/9975897998");
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
        this.mInterstitialAd.setAdListener(new AdListener() {
            public void onAdClosed() {
                super.onAdClosed();
                PrintActivity.this.finish();
            }
        });
    }

    public void showInterstitial() {
        if (this.mInterstitialAd.isLoaded()) {
            this.mInterstitialAd.show();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        showInterstitial();
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
