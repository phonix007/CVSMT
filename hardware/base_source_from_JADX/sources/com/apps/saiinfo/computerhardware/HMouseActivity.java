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

public class HMouseActivity extends AppCompatActivity {
    CardView one;
    CardView three;
    CardView two;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0508R.layout.activity_hmouse);
        this.one = (CardView) findViewById(C0508R.C0510id.one);
        this.one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HMouseActivity.this.startActivity(new Intent(HMouseActivity.this, HMActivity.class));
            }
        });
        this.two = (CardView) findViewById(C0508R.C0510id.two);
        this.two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HMouseActivity.this.startActivity(new Intent(HMouseActivity.this, HTypesActivity.class));
            }
        });
        this.three = (CardView) findViewById(C0508R.C0510id.three);
        this.three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HMouseActivity.this.startActivity(new Intent(HMouseActivity.this, HConnectActivity.class));
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
