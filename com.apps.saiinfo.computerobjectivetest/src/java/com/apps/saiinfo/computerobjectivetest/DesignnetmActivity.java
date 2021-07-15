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
import com.apps.saiinfo.computerobjectivetest.DesignnetmActivity;
import com.apps.saiinfo.computerobjectivetest.data.Databacenetm;
import com.apps.saiinfo.computerobjectivetest.source.Questionsnetm;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class DesignnetmActivity
extends AppCompatActivity {
    ArrayList<String> AnsList;
    private TextView TotalQues;
    private int answeredQsNo = 0;
    private Button btnSubmit;
    private Questionsnetm currentQuestion;
    ImageButton dom;
    ImageButton net;
    private int obtainedScore = 0;
    ImageButton org;
    private int questionId = 0;
    private List<Questionsnetm> questionsList;
    private RadioButton radioA;
    private RadioButton radioB;
    private RadioButton radioC;
    private RadioButton radioD;
    private TextView textQuestion;

    static /* synthetic */ Questionsnetm access$000(DesignnetmActivity designnetmActivity) {
        return designnetmActivity.currentQuestion;
    }

    static /* synthetic */ Questionsnetm access$002(DesignnetmActivity designnetmActivity, Questionsnetm questionsnetm) {
        designnetmActivity.currentQuestion = questionsnetm;
        return questionsnetm;
    }

    static /* synthetic */ int access$100(DesignnetmActivity designnetmActivity) {
        return designnetmActivity.obtainedScore;
    }

    static /* synthetic */ int access$108(DesignnetmActivity designnetmActivity) {
        int n = designnetmActivity.obtainedScore;
        designnetmActivity.obtainedScore = n + 1;
        return n;
    }

    static /* synthetic */ int access$200(DesignnetmActivity designnetmActivity) {
        return designnetmActivity.questionId;
    }

    static /* synthetic */ List access$300(DesignnetmActivity designnetmActivity) {
        return designnetmActivity.questionsList;
    }

    static /* synthetic */ void access$400(DesignnetmActivity designnetmActivity) {
        designnetmActivity.setQuestionsView();
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
        this.setContentView(2130968701);
        this.net = (ImageButton)this.findViewById(2131558564);
        this.net.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetmActivity this$0;
            {
                this.this$0 = designnetmActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.NetActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.org = (ImageButton)this.findViewById(2131558565);
        this.org.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetmActivity this$0;
            {
                this.this$0 = designnetmActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.orgActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        this.dom = (ImageButton)this.findViewById(2131558566);
        this.dom.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesignnetmActivity this$0;
            {
                this.this$0 = designnetmActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.domainActivity.class);
                this.this$0.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        this.init();
        Databacenetm databacenetm = new Databacenetm((Context)this);
        this.questionsList = databacenetm.getAllQuestions();
        this.currentQuestion = (Questionsnetm)this.questionsList.get(this.questionId);
        this.setQuestionsView();
        this.btnSubmit.setOnClickListener(new View.OnClickListener(this, databacenetm){
            final /* synthetic */ DesignnetmActivity this$0;
            final /* synthetic */ Databacenetm val$databace;
            {
                this.this$0 = designnetmActivity;
                this.val$databace = databacenetm;
            }

            /*
             * Enabled aggressive block sorting
             */
            public void onClick(View view) {
                android.widget.RadioGroup radioGroup = (android.widget.RadioGroup)this.this$0.findViewById(2131558547);
                RadioButton radioButton = (RadioButton)this.this$0.findViewById(radioGroup.getCheckedRadioButtonId());
                android.util.Log.e((String)"Answer ID", (String)("Selected Positioned  value - " + radioGroup.getCheckedRadioButtonId()));
                if (radioButton != null) {
                    android.util.Log.e((String)"Answer", (String)(DesignnetmActivity.access$000(this.this$0).getANSWER() + " -- " + (Object)radioButton.getText()));
                    this.this$0.AnsList.add((Object)("" + (Object)radioButton.getText()));
                    if (DesignnetmActivity.access$000(this.this$0).getANSWER().equals((Object)radioButton.getText())) {
                        DesignnetmActivity.access$108(this.this$0);
                        android.util.Log.e((String)"comments", (String)"Correct Answer");
                        android.util.Log.d((String)"score", (String)("Obtained score " + DesignnetmActivity.access$100(this.this$0)));
                    } else {
                        android.util.Log.e((String)"comments", (String)"Wrong Answer");
                    }
                    if (DesignnetmActivity.access$200(this.this$0) < this.val$databace.rowCount()) {
                        DesignnetmActivity.access$002(this.this$0, (Questionsnetm)DesignnetmActivity.access$300(this.this$0).get(DesignnetmActivity.access$200(this.this$0)));
                        DesignnetmActivity.access$400(this.this$0);
                    } else {
                        android.content.Intent intent = new android.content.Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.ResultnetmActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("score", DesignnetmActivity.access$100(this.this$0));
                        bundle.putInt("totalQs", DesignnetmActivity.access$300(this.this$0).size());
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

