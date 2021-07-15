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
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.AuthResult
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentReference
 *  com.google.firebase.firestore.DocumentSnapshot
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
import com.dnyanwata.mscitquiznearn.MainActivity;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.SignUpActivity;
import com.dnyanwata.mscitquiznearn.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import es.dmoral.toasty.Toasty;

public class LoginActivity
extends AppCompatActivity {
    FirebaseAuth auth;
    ActivityLoginBinding binding;
    FirebaseFirestore database;
    ProgressDialog dialog;
    String email;
    String pass;
    ProgressDialog resetDialog;
    String resetEmail;
    String vCode;

    protected void onCreate(Bundle bundle) {
        ProgressDialog progressDialog;
        ActivityLoginBinding activityLoginBinding;
        ProgressDialog progressDialog2;
        super.onCreate(bundle);
        this.binding = activityLoginBinding = ActivityLoginBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activityLoginBinding.getRoot());
        this.auth = FirebaseAuth.getInstance();
        this.database = FirebaseFirestore.getInstance();
        this.vCode = "1.7";
        this.dialog = progressDialog2 = new ProgressDialog((Context)this);
        progressDialog2.setMessage((CharSequence)this.getString(2131886254));
        this.resetDialog = progressDialog = new ProgressDialog((Context)this);
        progressDialog.setMessage((CharSequence)this.getString(2131886280));
        if (this.auth.getCurrentUser() != null) {
            this.startActivity(new Intent((Context)this, MainActivity.class));
            this.finish();
        }
        this.binding.btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.email = loginActivity.binding.edtEmail.getText().toString();
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity2.pass = loginActivity2.binding.edtPass.getText().toString();
                if (LoginActivity.this.email.isEmpty()) {
                    LoginActivity.this.binding.edtEmail.setError((CharSequence)"\u0905\u091a\u0942\u0915 Email ID \u091f\u093e\u0915\u093e");
                    LoginActivity.this.binding.edtEmail.requestFocus();
                    return;
                }
                if (LoginActivity.this.pass.length() < 6) {
                    LoginActivity.this.binding.edtPass.setError((CharSequence)"\u092a\u093e\u0938\u0935\u0930\u094d\u0921 \u0915\u093f\u092e\u093e\u0928 6 \u0905\u0915\u094d\u0937\u0930\u0940 \u092a\u093e\u0939\u093f\u091c\u0947");
                    LoginActivity.this.binding.edtPass.requestFocus();
                    return;
                }
                LoginActivity.this.dialog.show();
                LoginActivity.this.auth.signInWithEmailAndPassword(LoginActivity.this.email, LoginActivity.this.pass).addOnCompleteListener((OnCompleteListener)new OnCompleteListener<AuthResult>(){

                    public void onComplete(Task<AuthResult> task) {
                        LoginActivity.this.dialog.dismiss();
                        if (task.isSuccessful()) {
                            final String string2 = ((AuthResult)task.getResult()).getUser().getUid();
                            LoginActivity.this.startActivity(new Intent((Context)LoginActivity.this, MainActivity.class));
                            LoginActivity.this.finish();
                            LoginActivity.this.database.collection("users").document(string2).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<DocumentSnapshot>(){

                                public void onSuccess(DocumentSnapshot documentSnapshot) {
                                    UserModel userModel = (UserModel)documentSnapshot.toObject(UserModel.class);
                                    if (userModel.getvCode() != null) {
                                        LoginActivity.this.database.collection("users").document(string2).update("vCode", (Object)LoginActivity.this.vCode, new Object[0]);
                                        return;
                                    }
                                    if (userModel.getvCode() == LoginActivity.this.vCode) {
                                        LoginActivity.this.database.collection("users").document(string2).update("vCode", (Object)LoginActivity.this.vCode, new Object[0]);
                                    }
                                }
                            });
                            Toasty.success((Context)LoginActivity.this, 2131886277, 0).show();
                            return;
                        }
                        Toasty.error((Context)LoginActivity.this, task.getException().getLocalizedMessage(), 0).show();
                    }

                });
            }

        });
        this.binding.txtResetPass.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.resetEmail = loginActivity.binding.edtEmail.getText().toString();
                if (LoginActivity.this.resetEmail.isEmpty()) {
                    LoginActivity.this.binding.edtEmail.setError((CharSequence)"\u092a\u093e\u0938\u0935\u0930\u094d\u0921 \u0930\u0940\u0938\u0947\u091f \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 Email ID \u091f\u093e\u0915\u093e");
                    LoginActivity.this.binding.edtEmail.requestFocus();
                    return;
                }
                LoginActivity.this.resetDialog.show();
                LoginActivity.this.auth.sendPasswordResetEmail(LoginActivity.this.resetEmail).addOnCompleteListener((OnCompleteListener)new OnCompleteListener<Void>(){

                    public void onComplete(Task<Void> task) {
                        LoginActivity.this.resetDialog.dismiss();
                        if (task.isSuccessful()) {
                            LoginActivity loginActivity = LoginActivity.this;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("\u0930\u093f\u0938\u0947\u091f \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0932\u093f\u0902\u0915 ");
                            stringBuilder.append(LoginActivity.this.resetEmail);
                            stringBuilder.append(" \u092f\u093e \u0908\u092e\u0947\u0932\u0935\u0930 \u092a\u093e\u0920\u0935\u093f\u0932\u0940.");
                            Toasty.success((Context)loginActivity, stringBuilder.toString(), 1).show();
                            return;
                        }
                        Toasty.error((Context)LoginActivity.this, task.getException().getMessage(), 1).show();
                    }
                });
            }

        });
        this.binding.txtCreateAc.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                LoginActivity.this.startActivity(new Intent((Context)LoginActivity.this, SignUpActivity.class));
                LoginActivity.this.finish();
            }
        });
        this.binding.txtTnC.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)LoginActivity.this);
                WebView webView = new WebView((Context)LoginActivity.this);
                webView.loadUrl(LoginActivity.this.getString(2131886252));
                webView.setWebViewClient(new WebViewClient(){

                    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
                        webView.loadUrl(string2);
                        return true;
                    }
                });
                builder.setView((View)webView);
                builder.setNegativeButton((CharSequence)"\u092c\u0902\u0926 \u0915\u0930\u093e", new DialogInterface.OnClickListener(){

                    public void onClick(DialogInterface dialogInterface, int n) {
                    }
                });
                final AlertDialog alertDialog = builder.create();
                alertDialog.setOnShowListener(new DialogInterface.OnShowListener(){

                    public void onShow(DialogInterface dialogInterface) {
                        alertDialog.getButton(-2).setTextColor(LoginActivity.this.getResources().getColor(2131099922));
                        alertDialog.getButton(-2).setBackgroundColor(LoginActivity.this.getResources().getColor(2131099887));
                    }
                });
                alertDialog.show();
            }

        });
    }

}

