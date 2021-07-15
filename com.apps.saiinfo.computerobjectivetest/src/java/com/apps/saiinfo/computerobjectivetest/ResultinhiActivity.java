/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v4.app.NavUtils
 *  android.support.v7.app.AppCompatActivity
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.TextView
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.apps.saiinfo.computerobjectivetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.apps.saiinfo.computerobjectivetest.ResultinhiActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class ResultinhiActivity
extends AppCompatActivity {
    ArrayList<String> AnsList = new ArrayList();

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968758);
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        TextView textView = (TextView)this.findViewById(2131558595);
        TextView textView2 = (TextView)this.findViewById(2131558596);
        Bundle bundle2 = this.getIntent().getExtras();
        int n = bundle2.getInt("score");
        int n2 = bundle2.getInt("totalQs");
        this.AnsList = bundle2.getStringArrayList("AnsList");
        textView.setText((CharSequence)("\u0938\u094d\u0915\u094b\u0930 :- " + n2 + " \u092e\u0947\u0902 \u0938\u0947\u0902 " + n + ""));
        float f = n * 100 / n2;
        if (f >= 100.0f && f <= 100.0f) {
            textView2.setText((CharSequence)"\u092c\u0927\u093e\u0908 \u0939\u094b! \u0906\u092a\u0928\u0947 \u0938\u092d\u0940 \u092a\u094d\u0930\u0936\u094d\u0928 \u0938\u0939\u0940 \u0939\u0932 \u0915\u093f\u092f\u0947 \u0939\u0948!");
        } else if (f >= 80.0f && f <= 99.0f) {
            textView2.setText((CharSequence)"\u092c\u0939\u0941\u0924 \u0905\u091a\u094d\u091b\u0947! \u0915\u0943\u092a\u092f\u093e \u0928\u0940\u091a\u0947 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0915\u0947 \u0938\u0939\u0940 \u091c\u0935\u093e\u092c \u0926\u0947\u0916\u0947\u0902!");
        } else if (f >= 70.0f && f <= 79.0f) {
            textView2.setText((CharSequence)"\u0905\u091a\u094d\u091b\u093e \u092a\u094d\u0930\u092f\u093e\u0938! \u0915\u0943\u092a\u092f\u093e \u0928\u0940\u091a\u0947 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0915\u0947 \u0938\u0939\u0940 \u091c\u0935\u093e\u092c \u0926\u0947\u0916\u0947\u0902!");
        } else if (f >= 60.0f && f <= 69.0f) {
            textView2.setText((CharSequence)"\u0906\u092a\u0915\u093e \u0938\u094d\u0915\u094b\u0930 \u090f\u0935\u094d\u0939\u0930\u0947\u091c \u0939\u0948\u0902! \u0915\u0943\u092a\u092f\u093e \u0928\u0940\u091a\u0947 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0915\u0947 \u0938\u0939\u0940 \u091c\u0935\u093e\u092c \u0926\u0947\u0916\u0947\u0902!");
        } else if (f >= 30.0f && f <= 59.0f) {
            textView2.setText((CharSequence)"\u0906\u092a\u0915\u093e \u0938\u094d\u0915\u094b\u0930 \u0915\u092e \u0939\u0948\u0902! \u0915\u0943\u092a\u092f\u093e \u0928\u0940\u091a\u0947 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0915\u0947 \u0938\u0939\u0940 \u091c\u0935\u093e\u092c \u0926\u0947\u0916\u0947\u0902!");
        } else {
            textView2.setText((CharSequence)"\u0906\u092a\u0915\u094b \u0914\u0930 \u092a\u094d\u0930\u0945\u0915\u094d\u091f\u093f\u0938 \u0915\u0940 \u091c\u0930\u0941\u0930\u0924 \u0939\u0948\u0902! \u0915\u0943\u092a\u092f\u093e \u0928\u0940\u091a\u0947 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0915\u0947 \u0938\u0939\u0940 \u091c\u0935\u093e\u092c \u0926\u0947\u0916\u0947\u0902!");
        }
        ((Button)this.findViewById(2131558598)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ResultinhiActivity this$0;
            {
                this.this$0 = resultinhiActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((android.content.Context)this.this$0, com.apps.saiinfo.computerobjectivetest.AnswersinhiActivity.class);
                intent.putStringArrayListExtra("AnsList", this.this$0.AnsList);
                this.this$0.startActivity(intent);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: 
        }
        NavUtils.navigateUpFromSameTask((Activity)this);
        return true;
    }
}

