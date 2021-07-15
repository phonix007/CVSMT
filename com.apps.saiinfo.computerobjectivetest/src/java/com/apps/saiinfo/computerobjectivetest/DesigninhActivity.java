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
import com.apps.saiinfo.computerobjectivetest.DesigninhActivity;
import com.apps.saiinfo.computerobjectivetest.data.Databaceinh;
import com.apps.saiinfo.computerobjectivetest.source.Questionsinh;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;

public class DesigninhActivity
extends AppCompatActivity {
    ArrayList<String> AnsList;
    private TextView TotalQues;
    private int answeredQsNo = 0;
    private Button btnSubmit;
    private Questionsinh currentQuestion;
    ImageButton joy;
    ImageButton mon;
    ImageButton mouse;
    private int obtainedScore = 0;
    private int questionId = 0;
    private List<Questionsinh> questionsList;
    private RadioButton radioA;
    private RadioButton radioB;
    private RadioButton radioC;
    private RadioButton radioD;
    private TextView textQuestion;
    ImageButton win;

    static /* synthetic */ Questionsinh access$000(DesigninhActivity designinhActivity) {
        return designinhActivity.currentQuestion;
    }

    static /* synthetic */ Questionsinh access$002(DesigninhActivity designinhActivity, Questionsinh questionsinh) {
        designinhActivity.currentQuestion = questionsinh;
        return questionsinh;
    }

    static /* synthetic */ int access$100(DesigninhActivity designinhActivity) {
        return designinhActivity.obtainedScore;
    }

    static /* synthetic */ int access$108(DesigninhActivity designinhActivity) {
        int n = designinhActivity.obtainedScore;
        designinhActivity.obtainedScore = n + 1;
        return n;
    }

    static /* synthetic */ int access$200(DesigninhActivity designinhActivity) {
        return designinhActivity.questionId;
    }

    static /* synthetic */ List access$300(DesigninhActivity designinhActivity) {
        return designinhActivity.questionsList;
    }

    static /* synthetic */ void access$400(DesigninhActivity designinhActivity) {
        designinhActivity.setQuestionsView();
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
        this.setContentView(2130968683);
        this.mouse = (ImageButton)this.findViewById(2131558560);
        this.mouse.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesigninhActivity this$0;
            {
                this.this$0 = designinhActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.mouse.class);
                this.this$0.startActivity(intent);
            }
        });
        this.joy = (ImageButton)this.findViewById(2131558561);
        this.joy.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesigninhActivity this$0;
            {
                this.this$0 = designinhActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.joy.class);
                this.this$0.startActivity(intent);
            }
        });
        this.win = (ImageButton)this.findViewById(2131558562);
        this.win.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesigninhActivity this$0;
            {
                this.this$0 = designinhActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.win.class);
                this.this$0.startActivity(intent);
            }
        });
        this.mon = (ImageButton)this.findViewById(2131558563);
        this.mon.setOnClickListener(new View.OnClickListener(this){
            final /* synthetic */ DesigninhActivity this$0;
            {
                this.this$0 = designinhActivity;
            }

            public void onClick(View view) {
                android.content.Intent intent = new android.content.Intent(this.this$0.getApplicationContext(), com.apps.saiinfo.computerobjectivetest.mon.class);
                this.this$0.startActivity(intent);
            }
        });
        ((AdView)this.findViewById(2131558536)).loadAd(new AdRequest.Builder().build());
        this.init();
        Databaceinh databaceinh = new Databaceinh((Context)this);
        this.questionsList = databaceinh.getAllQuestions();
        this.currentQuestion = (Questionsinh)this.questionsList.get(this.questionId);
        this.setQuestionsView();
        this.btnSubmit.setOnClickListener(new View.OnClickListener(this, databaceinh){
            final /* synthetic */ DesigninhActivity this$0;
            final /* synthetic */ Databaceinh val$databaceinh;
            {
                this.this$0 = designinhActivity;
                this.val$databaceinh = databaceinh;
            }

            /*
             * Enabled aggressive block sorting
             */
            public void onClick(View view) {
                android.widget.RadioGroup radioGroup = (android.widget.RadioGroup)this.this$0.findViewById(2131558547);
                RadioButton radioButton = (RadioButton)this.this$0.findViewById(radioGroup.getCheckedRadioButtonId());
                android.util.Log.e((String)"Answer ID", (String)("Selected Positioned  value - " + radioGroup.getCheckedRadioButtonId()));
                if (radioButton != null) {
                    android.util.Log.e((String)"Answer", (String)(DesigninhActivity.access$000(this.this$0).getANSWER() + " -- " + (Object)radioButton.getText()));
                    this.this$0.AnsList.add((Object)("" + (Object)radioButton.getText()));
                    if (DesigninhActivity.access$000(this.this$0).getANSWER().equals((Object)radioButton.getText())) {
                        DesigninhActivity.access$108(this.this$0);
                        android.util.Log.e((String)"comments", (String)"Correct Answer");
                        android.util.Log.d((String)"score", (String)("Obtained score " + DesigninhActivity.access$100(this.this$0)));
                    } else {
                        android.util.Log.e((String)"comments", (String)"Wrong Answer");
                    }
                    if (DesigninhActivity.access$200(this.this$0) < this.val$databaceinh.rowCount()) {
                        DesigninhActivity.access$002(this.this$0, (Questionsinh)DesigninhActivity.access$300(this.this$0).get(DesigninhActivity.access$200(this.this$0)));
                        DesigninhActivity.access$400(this.this$0);
                    } else {
                        android.content.Intent intent = new android.content.Intent((Context)this.this$0, com.apps.saiinfo.computerobjectivetest.ResultinhActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("score", DesigninhActivity.access$100(this.this$0));
                        bundle.putInt("totalQs", DesigninhActivity.access$300(this.this$0).size());
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

