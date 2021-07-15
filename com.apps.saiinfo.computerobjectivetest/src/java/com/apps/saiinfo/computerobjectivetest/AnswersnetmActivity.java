/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.support.v4.app.NavUtils
 *  android.support.v7.app.AppCompatActivity
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 */
package com.apps.saiinfo.computerobjectivetest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.apps.saiinfo.computerobjectivetest.AnswersnetmActivity;
import com.apps.saiinfo.computerobjectivetest.data.Databacenetm;
import com.apps.saiinfo.computerobjectivetest.source.Questionsnetm;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnswersnetmActivity
extends AppCompatActivity {
    public static String KEY_CANS;
    public static String KEY_QUES;
    public static String KEY_YANS;
    ArrayList<String> AnsList = new ArrayList();
    private ListView QuesAns;
    private CustomAdapter adapter;
    private Questionsnetm currentQuestion;
    ArrayList<HashMap<String, Object>> originalValues = new ArrayList();
    private List<Questionsnetm> questionsList;
    HashMap<String, Object> temp = new HashMap();

    static {
        KEY_QUES = "questions";
        KEY_CANS = "canswer";
        KEY_YANS = "yanswer";
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968646);
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        this.AnsList = this.getIntent().getExtras().getStringArrayList("AnsList");
        this.QuesAns = (ListView)this.findViewById(2131558542);
        this.questionsList = new Databacenetm((Context)this).getAllQuestions();
        for (int i = 0; i < this.questionsList.size(); ++i) {
            this.currentQuestion = (Questionsnetm)this.questionsList.get(i);
            this.temp = new HashMap();
            this.temp.put((Object)KEY_QUES, (Object)this.currentQuestion.getQUESTION());
            this.temp.put((Object)KEY_CANS, (Object)this.currentQuestion.getANSWER());
            this.temp.put((Object)KEY_YANS, this.AnsList.get(i));
            this.originalValues.add(this.temp);
        }
        this.adapter = new ArrayAdapter<HashMap<String, Object>>((Context)this, 2130968837, this.originalValues){
            LayoutInflater inflater;
            ViewHolder viewHolder;
            {
                this.inflater = (LayoutInflater)context.getSystemService("layout_inflater");
            }

            /*
             * Enabled aggressive block sorting
             */
            public View getView(int n, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = this.inflater.inflate(2130968837, null);
                    this.viewHolder = new ViewHolder();
                    this.viewHolder.Ques = (TextView)view.findViewById(2131558665);
                    this.viewHolder.Correctans = (TextView)view.findViewById(2131558666);
                    this.viewHolder.Yourans = (TextView)view.findViewById(2131558667);
                    view.setTag((Object)this.viewHolder);
                } else {
                    this.viewHolder = (ViewHolder)view.getTag();
                }
                this.viewHolder.Ques.setText((CharSequence)((HashMap)AnswersnetmActivity.this.originalValues.get(n)).get((Object)AnswersnetmActivity.KEY_QUES).toString());
                this.viewHolder.Correctans.setText((CharSequence)("\u092c\u0930\u094b\u092c\u0930 \u0909\u0924\u094d\u0924\u0930: " + ((HashMap)AnswersnetmActivity.this.originalValues.get(n)).get((Object)AnswersnetmActivity.KEY_CANS).toString()));
                this.viewHolder.Yourans.setText((CharSequence)("\u0924\u0941\u092e\u091a\u0902 \u0909\u0924\u094d\u0924\u0930: " + ((HashMap)AnswersnetmActivity.this.originalValues.get(n)).get((Object)AnswersnetmActivity.KEY_YANS).toString()));
                return view;
            }

            private class ViewHolder {
                TextView Correctans;
                TextView Ques;
                TextView Yourans;

                private ViewHolder() {
                }
            }

        };
        this.QuesAns.setAdapter((ListAdapter)this.adapter);
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

