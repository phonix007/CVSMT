/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.MobileAds
 *  com.google.android.gms.ads.OnUserEarnedRewardListener
 *  com.google.android.gms.ads.initialization.InitializationStatus
 *  com.google.android.gms.ads.initialization.OnInitializationCompleteListener
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.ads.rewarded.RewardedAd
 *  com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.FieldValue
 *  com.google.firebase.firestore.FirebaseFirestore
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.dnyanwata.mscitquiznearn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dnyanwata.mscitquiznearn.MainActivity;
import com.dnyanwata.mscitquiznearn.databinding.ActivityResultBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;

public class ResultActivity
extends AppCompatActivity {
    int COINS = 1;
    private final String TAG = "--ads";
    ActivityResultBinding binding;
    FirebaseFirestore database;
    private RewardedAd mRewardedAd;

    private void lodeRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load((Context)this, (String)this.getString(2131886261), (AdRequest)adRequest, (RewardedAdLoadCallback)new RewardedAdLoadCallback(){

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                ResultActivity.this.mRewardedAd = null;
            }

            public void onAdLoaded(RewardedAd rewardedAd) {
                ResultActivity.this.mRewardedAd = rewardedAd;
                ResultActivity.this.mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback(){

                    public void onAdDismissedFullScreenContent() {
                    }

                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                    }

                    public void onAdShowedFullScreenContent() {
                        ResultActivity.this.mRewardedAd = null;
                    }
                });
            }

        });
    }

    private void showRewardedAds() {
        RewardedAd rewardedAd = this.mRewardedAd;
        if (rewardedAd != null) {
            rewardedAd.show((Activity)this, new OnUserEarnedRewardListener(){

                public void onUserEarnedReward(RewardItem rewardItem) {
                    int n = rewardItem.getAmount();
                    String string2 = rewardItem.getType();
                    ResultActivity.this.database.collection("users").document(FirebaseAuth.getInstance().getUid()).update(string2, (Object)FieldValue.increment((long)n), new Object[0]);
                    Toasty.success((Context)ResultActivity.this, 2131886120, 0).show();
                }
            });
            return;
        }
        Toasty.normal((Context)this, 2131886281, 0).show();
    }

    public void onBackPressed() {
        this.startActivity(new Intent((Context)this, MainActivity.class));
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        FirebaseFirestore firebaseFirestore;
        ActivityResultBinding activityResultBinding;
        super.onCreate(bundle);
        this.binding = activityResultBinding = ActivityResultBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activityResultBinding.getRoot());
        MobileAds.initialize((Context)this, (OnInitializationCompleteListener)new OnInitializationCompleteListener(){

            public void onInitializationComplete(InitializationStatus initializationStatus) {
                ResultActivity.this.lodeRewardedAd();
            }
        });
        int n = this.getIntent().getIntExtra("correct", 0);
        int n2 = this.getIntent().getIntExtra("total", 0);
        final long l = n * this.COINS;
        TextView textView = this.binding.txtScore;
        Object[] arrobject = new Object[]{n, n2};
        textView.setText((CharSequence)String.format((String)"%d / %d", (Object[])arrobject));
        this.binding.txtEarnedCoins.setText((CharSequence)String.valueOf((long)l));
        this.database = firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseFirestore.collection("users").document(FirebaseAuth.getInstance().getUid()).update("coins", (Object)FieldValue.increment((long)l), new Object[0]);
        this.binding.btnShareResult.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(ResultActivity.this.getString(2131886110));
                stringBuilder.append(" \u0935\u093e\u092a\u0930\u0941\u0928 \u092e\u0940 \u0906\u0924\u094d\u0924\u093e\u091a ");
                stringBuilder.append(l);
                stringBuilder.append(" Coins \u0915\u092e\u0935\u093f\u0932\u0947  \u0924\u0941\u092e\u094d\u0939\u0940 \u092a\u0923 \u0921\u093e\u0909\u0928\u0932\u094b\u0921 \u0915\u0930\u093e: https://bit.ly/3ndo2HY");
                intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
                intent.setType("text/plain");
                ResultActivity.this.startActivity(intent);
            }
        });
        this.binding.btnRestart.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                ResultActivity.this.startActivity(new Intent((Context)ResultActivity.this, MainActivity.class));
                ResultActivity.this.finish();
            }
        });
        this.binding.btnFreeCoins.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                ResultActivity.this.showRewardedAds();
            }
        });
    }

}

