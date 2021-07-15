/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.MobileAds
 *  com.google.android.gms.ads.initialization.InitializationStatus
 *  com.google.android.gms.ads.initialization.OnInitializationCompleteListener
 *  com.google.android.gms.ads.interstitial.InterstitialAd
 *  com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.DocumentSnapshot
 *  com.google.firebase.firestore.FirebaseFirestore
 *  com.google.firebase.firestore.Query
 *  com.google.firebase.firestore.QuerySnapshot
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Random
 */
package com.dnyanwata.mscitquiznearn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dnyanwata.mscitquiznearn.Model.QuestionModel;
import com.dnyanwata.mscitquiznearn.ResultActivity;
import com.dnyanwata.mscitquiznearn.databinding.ActivityQuizBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class QuizActivity
extends AppCompatActivity {
    ActivityQuizBinding binding;
    int correctAnswers = 0;
    FirebaseFirestore database;
    int index = 0;
    private InterstitialAd mInterstitialAd;
    QuestionModel question;
    ArrayList<QuestionModel> questions;
    CountDownTimer timer;

    private void createInterstitialAd(AdRequest adRequest) {
        InterstitialAd.load((Context)this, (String)this.getString(2131886171), (AdRequest)adRequest, (InterstitialAdLoadCallback)new InterstitialAdLoadCallback(){

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                QuizActivity.this.mInterstitialAd = null;
            }

            public void onAdLoaded(InterstitialAd interstitialAd) {
                QuizActivity.this.mInterstitialAd = interstitialAd;
                QuizActivity.this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){

                    public void onAdDismissedFullScreenContent() {
                        Intent intent = new Intent((Context)QuizActivity.this, ResultActivity.class);
                        intent.putExtra("correct", QuizActivity.this.correctAnswers);
                        intent.putExtra("total", QuizActivity.this.questions.size());
                        QuizActivity.this.startActivity(intent);
                    }

                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                    }

                    public void onAdShowedFullScreenContent() {
                        QuizActivity.this.mInterstitialAd = null;
                    }
                });
            }

        });
        this.binding.adView.loadAd(adRequest);
    }

    private void createPersonalizedAds() {
        this.createInterstitialAd(new AdRequest.Builder().build());
    }

    void checkAnswer(TextView textView) {
        if (textView.getText().toString().equals((Object)this.question.getAnswer())) {
            this.correctAnswers = 1 + this.correctAnswers;
            textView.setBackground(this.getResources().getDrawable(2131230817));
            return;
        }
        this.showAnswer();
        textView.setBackground(this.getResources().getDrawable(2131230822));
    }

    public void onClick(View view) {
        int n = view.getId();
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return;
                    }
                    case 2131362312: 
                    case 2131362313: 
                    case 2131362314: 
                    case 2131362315: 
                }
                CountDownTimer countDownTimer = this.timer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                this.checkAnswer((TextView)view);
                this.binding.txtOptionA.setClickable(false);
                this.binding.txtOptionB.setClickable(false);
                this.binding.txtOptionC.setClickable(false);
                this.binding.txtOptionD.setClickable(false);
                new Handler().postDelayed(new Runnable(){

                    public void run() {
                        QuizActivity quizActivity = QuizActivity.this;
                        quizActivity.index = 1 + quizActivity.index;
                        QuizActivity.this.setNextQuestion();
                    }
                }, 1500L);
                return;
            }
            case 2131361892: {
                InterstitialAd interstitialAd = this.mInterstitialAd;
                if (interstitialAd != null) {
                    interstitialAd.show((Activity)this);
                } else {
                    Intent intent = new Intent((Context)this, ResultActivity.class);
                    intent.putExtra("correct", this.correctAnswers);
                    intent.putExtra("total", this.questions.size());
                    this.startActivity(intent);
                }
                this.finish();
                return;
            }
            case 2131361891: 
        }
        if (2 + this.index <= this.questions.size()) {
            this.index = 1 + this.index;
            this.setNextQuestion();
            return;
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show((Activity)this);
        } else {
            Intent intent = new Intent((Context)this, ResultActivity.class);
            intent.putExtra("correct", this.correctAnswers);
            intent.putExtra("total", this.questions.size());
            this.startActivity(intent);
        }
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        FirebaseFirestore firebaseFirestore;
        ActivityQuizBinding activityQuizBinding;
        super.onCreate(bundle);
        this.binding = activityQuizBinding = ActivityQuizBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activityQuizBinding.getRoot());
        MobileAds.initialize((Context)this, (OnInitializationCompleteListener)new OnInitializationCompleteListener(){

            public void onInitializationComplete(InitializationStatus initializationStatus) {
                QuizActivity.this.createPersonalizedAds();
            }
        });
        this.questions = new ArrayList();
        final String string2 = this.getIntent().getStringExtra("catId");
        final int n = new Random().nextInt(50);
        this.database = firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseFirestore.collection("categories").document(string2).collection("questions").whereGreaterThanOrEqualTo("index", (Object)n).orderBy("index").limit(20L).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<QuerySnapshot>(){

            public void onSuccess(QuerySnapshot querySnapshot) {
                if (querySnapshot.getDocuments().size() < 20) {
                    QuizActivity.this.database.collection("categories").document(string2).collection("questions").whereLessThanOrEqualTo("index", (Object)n).orderBy("index").limit(20L).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<QuerySnapshot>(){

                        public void onSuccess(QuerySnapshot querySnapshot) {
                            Iterator iterator = querySnapshot.iterator();
                            while (iterator.hasNext()) {
                                QuestionModel questionModel = (QuestionModel)((DocumentSnapshot)iterator.next()).toObject(QuestionModel.class);
                                QuizActivity.this.questions.add((Object)questionModel);
                            }
                            QuizActivity.this.setNextQuestion();
                        }
                    });
                    return;
                }
                Iterator iterator = querySnapshot.iterator();
                while (iterator.hasNext()) {
                    QuestionModel questionModel = (QuestionModel)((DocumentSnapshot)iterator.next()).toObject(QuestionModel.class);
                    QuizActivity.this.questions.add((Object)questionModel);
                }
                QuizActivity.this.setNextQuestion();
            }

        });
        this.resetTimer();
    }

    void reset() {
        this.binding.txtOptionA.setBackground(this.getResources().getDrawable(2131230818));
        this.binding.txtOptionB.setBackground(this.getResources().getDrawable(2131230818));
        this.binding.txtOptionC.setBackground(this.getResources().getDrawable(2131230818));
        this.binding.txtOptionD.setBackground(this.getResources().getDrawable(2131230818));
        this.binding.txtOptionA.setClickable(true);
        this.binding.txtOptionB.setClickable(true);
        this.binding.txtOptionC.setClickable(true);
        this.binding.txtOptionD.setClickable(true);
    }

    void resetTimer() {
        CountDownTimer countDownTimer;
        this.timer = countDownTimer = new CountDownTimer(31000L, 1000L){

            public void onFinish() {
                QuizActivity quizActivity = QuizActivity.this;
                quizActivity.index = 1 + quizActivity.index;
                QuizActivity.this.setNextQuestion();
            }

            public void onTick(long l) {
                QuizActivity.this.binding.txtTimer.setText((CharSequence)String.valueOf((long)(l / 1000L)));
            }
        };
    }

    void setNextQuestion() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer.start();
        this.reset();
        if (this.index < this.questions.size()) {
            TextView textView = this.binding.txtQuesCount;
            Object[] arrobject = new Object[]{1 + this.index, this.questions.size()};
            textView.setText((CharSequence)String.format((String)"%d/%d", (Object[])arrobject));
            this.question = (QuestionModel)this.questions.get(this.index);
            this.binding.txtQuestion.setText((CharSequence)this.question.getQuestion());
            this.binding.txtOptionA.setText((CharSequence)this.question.getOption1());
            this.binding.txtOptionB.setText((CharSequence)this.question.getOption2());
            this.binding.txtOptionC.setText((CharSequence)this.question.getOption3());
            this.binding.txtOptionD.setText((CharSequence)this.question.getOption4());
        }
    }

    void showAnswer() {
        if (this.question.getAnswer().equals((Object)this.binding.txtOptionA.getText().toString())) {
            this.binding.txtOptionA.setBackground(this.getResources().getDrawable(2131230817));
            return;
        }
        if (this.question.getAnswer().equals((Object)this.binding.txtOptionB.getText().toString())) {
            this.binding.txtOptionB.setBackground(this.getResources().getDrawable(2131230817));
            return;
        }
        if (this.question.getAnswer().equals((Object)this.binding.txtOptionC.getText().toString())) {
            this.binding.txtOptionC.setBackground(this.getResources().getDrawable(2131230817));
            return;
        }
        if (this.question.getAnswer().equals((Object)this.binding.txtOptionD.getText().toString())) {
            this.binding.txtOptionD.setBackground(this.getResources().getDrawable(2131230817));
        }
    }

}

