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
import com.apps.saiinfo.computerobjectivetest.ResultehardActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class ResultehardActivity
extends AppCompatActivity {
    ArrayList<String> AnsList = new ArrayList();

    /*
     * Enabled aggressive block sorting
     */
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968756);
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        TextView textView = (TextView)this.findViewById(2131558595);
        TextView textView2 = (TextView)this.findViewById(2131558596);
        Bundle bundle2 = this.getIntent().getExtras();
        int n = bundle2.getInt("score");
        int n2 = bundle2.getInt("totalQs");
        this.AnsList = bundle2.getStringArrayList("AnsList");
        textView.setText((CharSequence)("Score :- " + n + " Out of " + n2 + ""));
        float f = n * 100 / n2;
        if (f >= 100.0f && f <= 100.0f) {
            textView2.setText((CharSequence)"Excellent job! You have solved all questions correctly!");
        } else if (f >= 80.0f && f <= 99.0f) {
            textView2.setText((CharSequence)"Well Done! Check out answers below!");
        } else if (f >= 70.0f && f <= 79.0f) {
            textView2.setText((CharSequence)"Your score is Good. Check out answers below!");
        } else if (f >= 60.0f && f <= 69.0f) {
            textView2.setText((CharSequence)"Your score is Average. Check out answers below!");
        } else if (f >= 30.0f && f <= 59.0f) {
            textView2.setText((CharSequence)"Your score is low. Check out answers below!");
        } else {
            textView2.setText((CharSequence)"You need to practice more. Please check out answers below!");
        }
        ((Button)this.findViewById(2131558598)).setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ ResultehardActivity this$0;
            {
                this.this$0 = resultehardActivity;
            }

            public void onClick(View view) {
                Intent intent = new Intent((android.content.Context)this.this$0, com.apps.saiinfo.computerobjectivetest.AnswersehardActivity.class);
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

