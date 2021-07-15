/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.TextView
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.OnUserEarnedRewardListener
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.ads.rewarded.RewardedAd
 *  com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.DocumentSnapshot
 *  com.google.firebase.firestore.FieldValue
 *  com.google.firebase.firestore.FirebaseFirestore
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.text.DecimalFormat
 */
package com.dnyanwata.mscitquiznearn.Fragment;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.dnyanwata.mscitquiznearn.MainActivity;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.Model.WithdrawalModel;
import com.dnyanwata.mscitquiznearn.SpinnerActivity;
import com.dnyanwata.mscitquiznearn.databinding.FragmentWalletBinding;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;
import java.text.DecimalFormat;

public class WalletFragment
extends Fragment {
    private final String TAG = "--AdMob";
    FragmentWalletBinding binding;
    FirebaseFirestore database;
    ProgressDialog dialog;
    private RewardedAd mRewardedAd;
    UserModel user;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FirebaseFirestore firebaseFirestore;
        ProgressDialog progressDialog;
        this.binding = FragmentWalletBinding.inflate(layoutInflater, viewGroup, false);
        AdRequest adRequest = new AdRequest.Builder().build();
        this.binding.adView.loadAd(adRequest);
        RewardedAd.load((Context)this.getActivity(), (String)this.getString(2131886262), (AdRequest)adRequest, (RewardedAdLoadCallback)new RewardedAdLoadCallback(){

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                WalletFragment.this.mRewardedAd = null;
            }

            public void onAdLoaded(RewardedAd rewardedAd) {
                WalletFragment.this.mRewardedAd = rewardedAd;
                WalletFragment.this.mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback(){

                    public void onAdDismissedFullScreenContent() {
                        Intent intent = new Intent((Context)WalletFragment.this.getActivity(), SpinnerActivity.class);
                        WalletFragment.this.startActivity(intent);
                    }

                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                    }

                    public void onAdShowedFullScreenContent() {
                        WalletFragment.this.mRewardedAd = null;
                    }
                });
            }

        });
        this.dialog = progressDialog = new ProgressDialog(this.getContext());
        progressDialog.setMessage((CharSequence)"In Progress...");
        this.database = firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseFirestore.collection("users").document(FirebaseAuth.getInstance().getUid()).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<DocumentSnapshot>(){

            public void onSuccess(DocumentSnapshot documentSnapshot) {
                WalletFragment.this.user = (UserModel)documentSnapshot.toObject(UserModel.class);
                String string2 = new DecimalFormat("#,##,###").format(WalletFragment.this.user.getCoins());
                WalletFragment.this.binding.txtCoins.setText((CharSequence)string2);
            }
        });
        this.binding.btnRequest.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String string2 = FirebaseAuth.getInstance().getUid();
                String string3 = WalletFragment.this.binding.edtUpiId.getText().toString();
                WalletFragment.this.dialog.show();
                WithdrawalModel withdrawalModel = new WithdrawalModel(string2, WalletFragment.this.user.getMobile(), WalletFragment.this.user.getName(), string3);
                if (TextUtils.isEmpty((CharSequence)string3)) {
                    WalletFragment.this.dialog.dismiss();
                    Toasty.error(WalletFragment.this.getContext(), 2131886284, 1).show();
                    return;
                }
                if (WalletFragment.this.user.getCoins() > 5000L) {
                    WalletFragment.this.database.collection("withdrawals").document(string2).set((Object)withdrawalModel).addOnSuccessListener((OnSuccessListener)new OnSuccessListener<Void>(){

                        public void onSuccess(Void void_) {
                            WalletFragment.this.dialog.dismiss();
                            WalletFragment.this.database.collection("users").document(FirebaseAuth.getInstance().getUid()).update("coins", (Object)FieldValue.increment((long)-5000L), new Object[0]);
                            Toasty.success(WalletFragment.this.getContext(), 2131886257, 0).show();
                            Intent intent = new Intent((Context)WalletFragment.this.getActivity(), MainActivity.class);
                            WalletFragment.this.startActivity(intent);
                        }
                    });
                    return;
                }
                WalletFragment.this.dialog.dismiss();
                Toasty.warning(WalletFragment.this.getContext(), 2131886279, 0).show();
            }

        });
        this.binding.btnSpinWheel.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (WalletFragment.this.mRewardedAd != null) {
                    FragmentActivity fragmentActivity = WalletFragment.this.getActivity();
                    WalletFragment.this.mRewardedAd.show((Activity)fragmentActivity, new OnUserEarnedRewardListener(){

                        public void onUserEarnedReward(RewardItem rewardItem) {
                            WalletFragment.this.mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback(){

                                public void onAdDismissedFullScreenContent() {
                                    Intent intent = new Intent((Context)WalletFragment.this.getActivity(), SpinnerActivity.class);
                                    WalletFragment.this.startActivity(intent);
                                }

                                public void onAdFailedToShowFullScreenContent(AdError adError) {
                                }

                                public void onAdShowedFullScreenContent() {
                                    WalletFragment.this.mRewardedAd = null;
                                }
                            });
                        }

                    });
                    return;
                }
                Toasty.error(WalletFragment.this.getContext(), 2131886281, 0).show();
            }

        });
        this.binding.btnShareSms.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(WalletFragment.this.getString(2131886110));
                stringBuilder.append(" \u0939\u0947 APP \u0935\u093e\u092a\u0930\u0942\u0928 \u092e\u0940 \u092e\u093e\u091d\u094d\u092f\u093e \u0938\u094d\u0915\u093f\u0932 \u092e\u0927\u094d\u092f\u0947 \u0938\u0941\u0927\u093e\u0930\u0923\u093e \u0915\u0947\u0932\u094d\u092f\u093e \u0935 \u092a\u0948\u0938\u0947 \u0938\u0941\u0926\u094d\u0927\u093e \u0915\u092e\u0935\u0924 \u0906\u0939\u0947. \u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u093e : https://bit.ly/3ndo2HY");
                intent.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
                intent.setType("text/plain");
                WalletFragment.this.startActivity(intent);
            }
        });
        return this.binding.getRoot();
    }

}

