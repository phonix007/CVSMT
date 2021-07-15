/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnShowListener
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.Editable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.DocumentSnapshot
 *  com.google.firebase.firestore.FirebaseFirestore
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 */
package com.dnyanwata.mscitquiznearn.Fragment;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.databinding.FragmentProfileBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;

public class ProfileFragment
extends Fragment {
    FragmentProfileBinding binding;
    FirebaseFirestore database;
    ProgressDialog dialog;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FirebaseFirestore firebaseFirestore;
        ProgressDialog progressDialog;
        this.binding = FragmentProfileBinding.inflate(layoutInflater, viewGroup, false);
        AdRequest adRequest = new AdRequest.Builder().build();
        this.binding.adView.loadAd(adRequest);
        this.dialog = progressDialog = new ProgressDialog(this.getContext());
        progressDialog.setMessage((CharSequence)this.getString(2131886276));
        this.database = firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseFirestore.collection("users").document(FirebaseAuth.getInstance().getUid()).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<DocumentSnapshot>(){

            public void onSuccess(DocumentSnapshot documentSnapshot) {
                UserModel userModel = (UserModel)documentSnapshot.toObject(UserModel.class);
                ProfileFragment.this.binding.txtUserName.setText((CharSequence)userModel.getName());
                String string2 = userModel.getMobile().substring(0, 6);
                TextView textView = ProfileFragment.this.binding.txtMobile;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("XXXX");
                textView.setText((CharSequence)stringBuilder.toString());
                String string3 = userModel.getEmail().replaceAll("(?<=.{3}).(?=[^@]*?.@)", "*");
                ProfileFragment.this.binding.txtEmailAddress.setText((CharSequence)string3);
                if (userModel.getStatus() != null) {
                    ProfileFragment.this.binding.edtNewName.setVisibility(8);
                    ProfileFragment.this.binding.edtNewMobile.setVisibility(8);
                    ProfileFragment.this.binding.btnUpdate.setVisibility(8);
                    return;
                }
                ProfileFragment.this.binding.edtNewName.setVisibility(0);
                ProfileFragment.this.binding.edtNewMobile.setVisibility(0);
                ProfileFragment.this.binding.btnUpdate.setVisibility(0);
            }
        });
        this.binding.btnUpdate.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String string2 = ProfileFragment.this.binding.edtNewName.getText().toString();
                String string3 = ProfileFragment.this.binding.edtNewMobile.getText().toString();
                if (string2.isEmpty()) {
                    ProfileFragment.this.binding.edtNewName.setError((CharSequence)ProfileFragment.this.getString(2131886283));
                    ProfileFragment.this.binding.edtNewName.requestFocus();
                    return;
                }
                if (string3.length() < 10) {
                    ProfileFragment.this.binding.edtNewMobile.setError((CharSequence)ProfileFragment.this.getString(2131886282));
                    ProfileFragment.this.binding.edtNewMobile.requestFocus();
                    return;
                }
                ProfileFragment.this.dialog.show();
                ProfileFragment.this.database.collection("users").document(FirebaseAuth.getInstance().getUid()).update("name", (Object)string2, new Object[]{"mobile", string3, "status", "Y"}).addOnSuccessListener((OnSuccessListener)new OnSuccessListener<Void>(){

                    public void onSuccess(Void void_) {
                        ProfileFragment.this.dialog.dismiss();
                        ProfileFragment.this.binding.edtNewName.setVisibility(8);
                        ProfileFragment.this.binding.edtNewMobile.setVisibility(8);
                        ProfileFragment.this.binding.btnUpdate.setVisibility(8);
                        Toasty.success(ProfileFragment.this.getContext(), "Success", 1).show();
                    }
                });
            }

        });
        this.binding.txtTnC.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)ProfileFragment.this.getActivity());
                WebView webView = new WebView((Context)ProfileFragment.this.getActivity());
                webView.loadUrl(ProfileFragment.this.getString(2131886252));
                webView.setWebViewClient(new WebViewClient(){

                    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
                        webView.loadUrl(string2);
                        return true;
                    }
                });
                builder.setView((View)webView);
                builder.setNegativeButton((CharSequence)"\u092c\u0902\u0926 \u0915\u0930\u093e", new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialogInterface, int n) {
                        dialogInterface.dismiss();
                    }
                });
                final AlertDialog alertDialog = builder.create();
                alertDialog.setOnShowListener(new DialogInterface.OnShowListener(){

                    public void onShow(DialogInterface dialogInterface) {
                        alertDialog.getButton(-2).setTextColor(ProfileFragment.this.getResources().getColor(2131099922));
                        alertDialog.getButton(-2).setBackgroundColor(ProfileFragment.this.getResources().getColor(2131099887));
                    }
                });
                alertDialog.show();
            }

        });
        return this.binding.getRoot();
    }

}

