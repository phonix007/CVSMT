/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.FieldValue
 *  com.google.firebase.firestore.FirebaseFirestore
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Random
 */
package com.dnyanwata.mscitquiznearn;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dnyanwata.mscitquiznearn.SpinWheel.LuckyWheelView;
import com.dnyanwata.mscitquiznearn.SpinWheel.model.LuckyItem;
import com.dnyanwata.mscitquiznearn.databinding.ActivitySpinnerBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpinnerActivity
extends AppCompatActivity {
    ActivitySpinnerBinding binding;
    long coin = 0L;

    protected void onCreate(Bundle bundle) {
        ActivitySpinnerBinding activitySpinnerBinding;
        super.onCreate(bundle);
        this.binding = activitySpinnerBinding = ActivitySpinnerBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activitySpinnerBinding.getRoot());
        AdRequest adRequest = new AdRequest.Builder().build();
        this.binding.adView.loadAd(adRequest);
        ArrayList arrayList = new ArrayList();
        LuckyItem luckyItem = new LuckyItem();
        luckyItem.topText = "5";
        luckyItem.secondaryText = "coins";
        luckyItem.color = Color.parseColor((String)"#FFFFFF");
        luckyItem.textColor = Color.parseColor((String)"#000000");
        arrayList.add((Object)luckyItem);
        LuckyItem luckyItem2 = new LuckyItem();
        luckyItem2.topText = "0";
        luckyItem2.secondaryText = "coins";
        luckyItem2.color = Color.parseColor((String)"#539e1b");
        luckyItem2.textColor = Color.parseColor((String)"#FFFFFF");
        arrayList.add((Object)luckyItem2);
        LuckyItem luckyItem3 = new LuckyItem();
        luckyItem3.topText = "8";
        luckyItem3.secondaryText = "coins";
        luckyItem3.color = Color.parseColor((String)"#FFFFFF");
        luckyItem3.textColor = Color.parseColor((String)"#000000");
        arrayList.add((Object)luckyItem3);
        LuckyItem luckyItem4 = new LuckyItem();
        luckyItem4.topText = "18";
        luckyItem4.secondaryText = "coins";
        luckyItem4.color = Color.parseColor((String)"#2e377c");
        luckyItem4.textColor = Color.parseColor((String)"#FFFFFF");
        arrayList.add((Object)luckyItem4);
        LuckyItem luckyItem5 = new LuckyItem();
        luckyItem5.topText = "20";
        luckyItem5.secondaryText = "coins";
        luckyItem5.color = Color.parseColor((String)"#FFFFFF");
        luckyItem5.textColor = Color.parseColor((String)"#000000");
        arrayList.add((Object)luckyItem5);
        LuckyItem luckyItem6 = new LuckyItem();
        luckyItem6.topText = "0";
        luckyItem6.secondaryText = "coins";
        luckyItem6.color = Color.parseColor((String)"#000000");
        luckyItem6.textColor = Color.parseColor((String)"#FFFFFF");
        arrayList.add((Object)luckyItem6);
        LuckyItem luckyItem7 = new LuckyItem();
        luckyItem7.topText = "11";
        luckyItem7.secondaryText = "coins";
        luckyItem7.color = Color.parseColor((String)"#FFFFFF");
        luckyItem7.textColor = Color.parseColor((String)"#000000");
        arrayList.add((Object)luckyItem7);
        LuckyItem luckyItem8 = new LuckyItem();
        luckyItem8.topText = "15";
        luckyItem8.secondaryText = "coins";
        luckyItem8.color = Color.parseColor((String)"#c51928");
        luckyItem8.textColor = Color.parseColor((String)"#FFFFFF");
        arrayList.add((Object)luckyItem8);
        this.binding.luckWheelView.setData((List<LuckyItem>)arrayList);
        this.binding.luckWheelView.setRound(8);
        this.binding.btnSpin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                int n = new Random().nextInt(8);
                SpinnerActivity.this.binding.luckWheelView.startLuckyWheelWithTargetIndex(n);
            }
        });
        this.binding.luckWheelView.setLuckyRoundItemSelectedListener(new LuckyWheelView.LuckyRoundItemSelectedListener(){

            @Override
            public void LuckyRoundItemSelected(int n) {
                SpinnerActivity.this.updateCoins(n);
            }
        });
    }

    void updateCoins(int n) {
        switch (n) {
            default: {
                break;
            }
            case 7: {
                this.coin = 15L;
                break;
            }
            case 6: {
                this.coin = 11L;
                break;
            }
            case 4: {
                this.coin = 20L;
                break;
            }
            case 3: {
                this.coin = 18L;
                break;
            }
            case 2: {
                this.coin = 8L;
                break;
            }
            case 1: 
            case 5: {
                this.coin = 0L;
                break;
            }
            case 0: {
                this.coin = 5L;
            }
        }
        FirebaseFirestore.getInstance().collection("users").document(FirebaseAuth.getInstance().getUid()).update("coins", (Object)FieldValue.increment((long)this.coin), new Object[0]).addOnSuccessListener((OnSuccessListener)new OnSuccessListener<Void>(){

            public void onSuccess(Void void_) {
                if (SpinnerActivity.this.coin == 0L) {
                    SpinnerActivity spinnerActivity = SpinnerActivity.this;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(SpinnerActivity.this.coin);
                    stringBuilder.append(" Coins ! \u092a\u0941\u0922\u091a\u094d\u092f\u093e \u0935\u0947\u0933\u0940 \u092a\u094d\u0930\u092f\u0924\u094d\u0928 \u0915\u0930\u093e.");
                    Toasty.normal((Context)spinnerActivity, (CharSequence)stringBuilder.toString(), 0).show();
                } else {
                    SpinnerActivity spinnerActivity = SpinnerActivity.this;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(SpinnerActivity.this.coin);
                    stringBuilder.append(" Coins \u0906\u092a\u0932\u094d\u092f\u093e \u0916\u093e\u0924\u094d\u092f\u093e\u0924 \u091c\u092e\u093e \u0939\u094b\u0924 \u0906\u0939\u0947\u0924.");
                    Toasty.success((Context)spinnerActivity, stringBuilder.toString(), 0).show();
                }
                SpinnerActivity.this.finish();
            }
        });
    }

}

