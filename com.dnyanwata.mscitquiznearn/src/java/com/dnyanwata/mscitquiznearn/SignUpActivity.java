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
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.text.Editable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.AuthResult
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.FirebaseFirestore
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 */
package com.dnyanwata.mscitquiznearn;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dnyanwata.mscitquiznearn.LoginActivity;
import com.dnyanwata.mscitquiznearn.MainActivity;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;

public class SignUpActivity
extends AppCompatActivity {
    FirebaseAuth auth;
    ActivitySignUpBinding binding;
    FirebaseFirestore database;
    ProgressDialog dialog;

    protected void onCreate(Bundle bundle) {
        ProgressDialog progressDialog;
        ActivitySignUpBinding activitySignUpBinding;
        super.onCreate(bundle);
        this.binding = activitySignUpBinding = ActivitySignUpBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activitySignUpBinding.getRoot());
        this.auth = FirebaseAuth.getInstance();
        this.database = FirebaseFirestore.getInstance();
        this.dialog = progressDialog = new ProgressDialog((Context)this);
        progressDialog.setMessage((CharSequence)"\u0906\u092a\u0932\u0947 \u0905\u0915\u093e\u090a\u0902\u091f \u0924\u092f\u093e\u0930 \u0939\u094b\u0924 \u0906\u0939\u0947...");
        this.binding.btnRegister.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String string2 = SignUpActivity.this.binding.edtName.getText().toString();
                String string3 = SignUpActivity.this.binding.edtName2.getText().toString();
                String string4 = SignUpActivity.this.binding.edtEmail.getText().toString();
                String string5 = SignUpActivity.this.binding.edtMobile.getText().toString();
                String string6 = SignUpActivity.this.binding.edtPass.getText().toString();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                stringBuilder.append(string3);
                String string7 = stringBuilder.toString();
                final UserModel userModel = new UserModel(string7, string4, string5, string6, "1.7");
                if (string2.isEmpty()) {
                    SignUpActivity.this.binding.edtName.setError((CharSequence)"\u0906\u092a\u0932\u0947 \u0928\u093e\u0935 \u0932\u093f\u0939\u093e");
                    SignUpActivity.this.binding.edtName.requestFocus();
                    return;
                }
                if (string3.isEmpty()) {
                    SignUpActivity.this.binding.edtName2.setError((CharSequence)"\u0906\u092a\u0932\u0947 \u0906\u0921\u0928\u093e\u0935 \u0932\u093f\u0939\u093e");
                    SignUpActivity.this.binding.edtName2.requestFocus();
                    return;
                }
                if (string4.isEmpty()) {
                    SignUpActivity.this.binding.edtEmail.setError((CharSequence)"\u0905\u091a\u0942\u0915 Email ID \u091f\u093e\u0915\u093e");
                    SignUpActivity.this.binding.edtEmail.requestFocus();
                    return;
                }
                if (string5.length() < 10) {
                    SignUpActivity.this.binding.edtMobile.setError((CharSequence)"\u092e\u094b\u092c\u093e\u0907\u0932 \u0928\u0902\u092c\u0930 10 \u0905\u0902\u0915\u0940 \u092a\u093e\u0939\u093f\u091c\u0947");
                    SignUpActivity.this.binding.edtMobile.requestFocus();
                    return;
                }
                if (string6.length() < 6) {
                    SignUpActivity.this.binding.edtPass.setError((CharSequence)"\u092a\u093e\u0938\u0935\u0930\u094d\u0921 \u0939\u093e \u0915\u093f\u092e\u093e\u0928 6 \u0905\u0915\u094d\u0937\u0930\u0940 \u0924\u0938\u0947\u091a \u0905\u0902\u0915 \u0915\u093f\u0902\u0935\u093e \u0905\u0915\u094d\u0937\u0930\u093e\u0902\u091a\u0947 \u092e\u093f\u0936\u094d\u0930\u0923 \u0905\u0938\u0932\u0947\u0932\u093e \u0939\u0935\u093e");
                    SignUpActivity.this.binding.edtPass.requestFocus();
                    return;
                }
                SignUpActivity.this.dialog.show();
                SignUpActivity.this.auth.createUserWithEmailAndPassword(string4, string6).addOnCompleteListener((OnCompleteListener)new OnCompleteListener<AuthResult>(){

                    public void onComplete(Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            String string2 = ((AuthResult)task.getResult()).getUser().getUid();
                            SignUpActivity.this.database.collection("users").document(string2).set((Object)userModel).addOnCompleteListener((OnCompleteListener)new OnCompleteListener<Void>(){

                                public void onComplete(Task<Void> task) {
                                    SignUpActivity.this.dialog.dismiss();
                                    if (task.isSuccessful()) {
                                        SignUpActivity.this.startActivity(new Intent((Context)SignUpActivity.this, MainActivity.class));
                                        SignUpActivity.this.finish();
                                        Toasty.success((Context)SignUpActivity.this, "\u0906\u092a\u0932\u0940 \u0928\u094b\u0902\u0926\u0923\u0940 \u092f\u0936\u0938\u094d\u0935\u0940 \u091d\u093e\u0932\u0940.", 0).show();
                                        return;
                                    }
                                    Toasty.error((Context)SignUpActivity.this, task.getException().getLocalizedMessage(), 0).show();
                                }
                            });
                            return;
                        }
                        SignUpActivity.this.dialog.dismiss();
                        Toasty.error((Context)SignUpActivity.this, task.getException().getLocalizedMessage(), 0).show();
                    }

                });
            }

        });
        this.binding.txtGoLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                SignUpActivity.this.startActivity(new Intent((Context)SignUpActivity.this, LoginActivity.class));
                SignUpActivity.this.finish();
            }
        });
        this.binding.txtTnC.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)SignUpActivity.this);
                WebView webView = new WebView((Context)SignUpActivity.this);
                webView.loadUrl(SignUpActivity.this.getString(2131886252));
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
                        alertDialog.getButton(-2).setTextColor(SignUpActivity.this.getResources().getColor(2131099922));
                        alertDialog.getButton(-2).setBackgroundColor(SignUpActivity.this.getResources().getColor(2131099887));
                    }
                });
                alertDialog.show();
            }

        });
    }

}

