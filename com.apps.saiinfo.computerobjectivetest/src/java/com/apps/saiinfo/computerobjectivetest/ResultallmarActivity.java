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
import com.apps.saiinfo.computerobjectivetest.ResultallmarActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class ResultallmarActivity
extends AppCompatActivity {
    ArrayList<String> AnsList = new ArrayList();

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968744);
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        TextView textView = (TextView)this.findViewById(2131558595);
        TextView textView2 = (TextView)this.findViewById(2131558596);
        Bundle bundle2 = this.getIntent().getExtras();
        int n = bundle2.getInt("score");
        int n2 = bundle2.getInt("totalQs");
        this.AnsList = bundle2.getStringArrayList("AnsList");
        textView.setText((CharSequence)("\u0938\u094d\u0915\u094b\u0930 :- " + n2 + " \u092a\u0948\u0915\u0940 " + n + ""));
        float f = n * 100 / n2;
        if (f >= 100.0f && f <= 100.0f) {
            textView2.setText((CharSequence)"\u0905\u092d\u093f\u0928\u0902\u0926\u0928! \u0924\u0941\u092e\u094d\u0939\u0940 \u0938\u0930\u094d\u0935 \u092a\u094d\u0930\u0936\u094d\u0928 \u092c\u0930\u094b\u092c\u0930 \u0938\u094b\u0921\u0935\u093f\u0932\u0947\u0932\u0947 \u0906\u0939\u0947\u0924!");
        } else if (f >= 80.0f && f <= 99.0f) {
            textView2.setText((CharSequence)"\u0916\u0942\u092a \u091b\u093e\u0928! \u0915\u0943\u092a\u092f\u093e \u0916\u093e\u0932\u0940 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0942\u0928 \u0909\u0924\u094d\u0924\u0930\u0947 \u0924\u092a\u093e\u0938\u093e!");
        } else if (f >= 70.0f && f <= 79.0f) {
            textView2.setText((CharSequence)"\u091a\u093e\u0902\u0917\u0932\u093e \u092a\u094d\u0930\u092f\u0924\u094d\u0928! \u0915\u0943\u092a\u092f\u093e \u0916\u093e\u0932\u0940 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0942\u0928 \u0909\u0924\u094d\u0924\u0930\u0947 \u0924\u092a\u093e\u0938\u093e!");
        } else if (f >= 60.0f && f <= 69.0f) {
            textView2.setText((CharSequence)"\u0924\u0941\u092e\u091a\u093e \u0938\u094d\u0915\u094b\u0930 \u090f\u0935\u094d\u0939\u0930\u0947\u091c \u0906\u0939\u0947! \u0915\u0943\u092a\u092f\u093e \u0916\u093e\u0932\u0940 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0942\u0928 \u0909\u0924\u094d\u0924\u0930\u0947 \u0924\u092a\u093e\u0938\u093e!");
        } else if (f >= 30.0f && f <= 59.0f) {
            textView2.setText((CharSequence)"\u0924\u0941\u092e\u091a\u093e \u0938\u094d\u0915\u094b\u0930 \u0915\u092e\u0940 \u0906\u0939\u0947! \u0915\u0943\u092a\u092f\u093e \u0916\u093e\u0932\u0940 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0942\u0928 \u0909\u0924\u094d\u0924\u0930\u0947 \u0924\u092a\u093e\u0938\u093e!");
        } else {
            textView2.setText((CharSequence)"\u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u0905\u091c\u0942\u0928 \u0938\u0930\u093e\u0935\u093e\u091a\u0940 \u0917\u0930\u091c \u0906\u0939\u0947! \u0915\u0943\u092a\u092f\u093e \u0916\u093e\u0932\u0940 \u0915\u094d\u0932\u093f\u0915 \u0915\u0930\u0942\u0928 \u0909\u0924\u094d\u0924\u0930\u0947 \u0924\u092a\u093e\u0938\u093e!");
        }
        ((Button)this.findViewById(2131558598)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ResultallmarActivity this$0;
            {
                this.this$0 = resultallmarActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((android.content.Context)this.this$0, com.apps.saiinfo.computerobjectivetest.AnswersallmarActivity.class);
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

