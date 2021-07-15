/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.support.v4.app.NavUtils
 *  android.support.v7.app.AppCompatActivity
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageButton
 *  android.widget.RadioButton
 *  android.widget.TextView
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.apps.saiinfo.computerobjectivetest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import com.apps.saiinfo.computerobjectivetest.DesignnetActivity;
import com.apps.saiinfo.computerobjectivetest.data.Databacenet;
import com.apps.saiinfo.computerobjectivetest.source.Questionsnet;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class DesignnetActivity
extends AppCompatActivity {
    ArrayList<String> AnsList;
    private TextView TotalQues;
    private int answeredQsNo = 0;
    private Button btnSubmit;
    private Questionsnet currentQuestion;
    ImageButton dom;
    ImageButton net;
    private int obtainedScore = 0;
    ImageButton org;
    private int questionId = 0;
    private List<Questionsnet> questionsList;
    private RadioButton radioA;
    private RadioButton radioB;
    private RadioButton radioC;
    private RadioButton radioD;
    private TextView textQuestion;

    static /* synthetic */ Questionsnet access$000(DesignnetActivity designnetActivity) {
        return designnetActivity.currentQuestion;
    }

    static /* synthetic */ Questionsnet access$002(DesignnetActivity designnetActivity, Questionsnet questionsnet) {
        designnetActivity.currentQuestion = questionsnet;
        return questionsnet;
    }

    static /* synthetic */ int access$100(DesignnetActivity designnetActivity) {
        return designnetActivity.obtainedScore;
    }

    static /* synthetic */ int access$108(DesignnetActivity designnetActivity) {
        int n = designnetActivity.obtainedScore;
        designnetActivity.obtainedScore = n + 1;
        return n;
    }

    static /* synthetic */ int access$200(DesignnetActivity designnetActivity) {
        return designnetActivity.questionId;
    }

    static /* synthetic */ List access$300(DesignnetActivity designnetActivity) {
        return designnetActivity.questionsList;
    }

    static /* synthetic */ void access$400(DesignnetActivity designnetActivity) {
        designnetActivity.setQuestionsView();
    }

    private void setQuestionsView() {
        this.radioA.setChecked(false);
        this.radioB.setChecked(false);
        this.radioC.setChecked(false);
        this.radioD.setChecked(false);
        this.answeredQsNo = 1 + this.questionId;
        this.TotalQues.setText((CharSequence)("" + this.answeredQsNo + " of " + this.questionsList.size()));
        this.textQuestion.setText((CharSequence)this.currentQuestion.getQUESTION());
        this.radioA.setText((CharSequence)this.currentQuestion.getOptionA());
        this.radioB.setText((CharSequence)this.currentQuestion.getOptionB());
        this.radioC.setText((CharSequence)this.currentQuestion.getOptionC());
        this.radioD.setText((CharSequence)this.currentQuestion.getOptionD());
        this.questionId = 1 + this.questionId;
    }

    public void init() {
        this.TotalQues = (TextView)this.findViewById(2131558545);
        this.textQuestion = (TextView)this.findViewById(2131558546);
        this.radioA = (RadioButton)this.findViewById(2131558548);
        this.radioB = (RadioButton)this.findViewById(2131558549);
        this.radioC = (RadioButton)this.findViewById(2131558550);
        this.radioD = (RadioButton)this.findViewById(2131558551);
        this.btnSubmit = (Button)this.findViewById(2131558552);
        this.AnsList = new ArrayList();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968699);
        this.net = (ImageButton)this.findViewById(2131558564);
        this.net.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetActivity this$0;
            {
                this.this$0 = designnetActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.NetActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.org = (ImageButton)this.findViewById(2131558565);
        this.org.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetActivity this$0;
            {
                this.this$0 = designnetActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.orgActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.dom = (ImageButton)this.findViewById(2131558566);
        this.dom.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetActivity this$0;
            {
                this.this$0 = designnetActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.domainActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        this.init();
        Databacenet databacenet = new Databacenet((Context)this);
        this.questionsList = databacenet.getAllQuestions();
        this.currentQuestion = (Questionsnet)this.questionsList.get(this.questionId);
        this.setQuestionsView();
        this.btnSubmit.setOnClickListener(new View.OnClickListener(this, databacenet){
            final /* synthetic */ DesignnetActivity this$0;
            final /* synthetic */ Databacenet val$databace;
            {
                this.this$0 = designnetActivity;
                this.val$databace = databacenet;
            }

            /*
             * Enabled aggressive block sorting
             */
            public void onClick(View view) {
                android.widget.RadioGroup radioGroup = (android.widget.RadioGroup)this.this$0.findViewById(2131558547);
                RadioButton radioButton = (RadioButton)this.this$0.findViewById(radioGroup.getCheckedRadioButtonId());
                android.util.Log.e((String)"Answer ID", (String)("Selected Positioned  value - " + radioGroup.getCheckedRadioButtonId()));
                if (radioButton != null) {
                    android.util.Log.e((String)"Answer", (String)(DesignnetActivity.access$000(this.this$0).getANSWER() + " -- " + (Object)radioButton.getText()));
                    this.this$0.AnsList.add((Object)("" + (Object)radioButton.getText()));
                    if (DesignnetActivity.access$000(this.this$0).getANSWER().equals((Object)radioButton.getText())) {
                        DesignnetActivity.access$108(this.this$0);
                        android.util.Log.e((String)"comments", (String)"Correct Answer");
                        android.util.Log.d((String)"score", (String)("Obtained score " + DesignnetActivity.access$100(this.this$0)));
                    } else {
                        android.util.Log.e((String)"comments", (String)"Wrong Answer");
                    }
                    if (DesignnetActivity.access$200(this.this$0) < this.val$databace.rowCount()) {
                        DesignnetActivity.access$002(this.this$0, (Questionsnet)DesignnetActivity.access$300(this.this$0).get(DesignnetActivity.access$200(this.this$0)));
                        DesignnetActivity.access$400(this.this$0);
                    } else {
                        android.content.Intent intent = new android.content.Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.ResultnetActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("score", DesignnetActivity.access$100(this.this$0));
                        bundle.putInt("totalQs", DesignnetActivity.access$300(this.this$0).size());
                        bundle.putStringArrayList("AnsList", this.this$0.AnsList);
                        intent.putExtras(bundle);
                        this.this$0.startActivity(intent);
                        this.this$0.finish();
                    }
                } else {
                    android.util.Log.e((String)"comments", (String)"No Answer");
                }
                radioGroup.clearCheck();
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

