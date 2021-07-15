/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.appcompat.widget.Toolbar
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.core.content.ContextCompat
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentManager
 *  androidx.fragment.app.FragmentTransaction
 *  androidx.lifecycle.Lifecycle
 *  com.google.android.gms.ads.MobileAds
 *  com.google.android.gms.ads.initialization.InitializationStatus
 *  com.google.android.gms.ads.initialization.OnInitializationCompleteListener
 *  com.google.android.play.core.appupdate.AppUpdateInfo
 *  com.google.android.play.core.appupdate.AppUpdateManager
 *  com.google.android.play.core.appupdate.AppUpdateManagerFactory
 *  com.google.android.play.core.review.ReviewInfo
 *  com.google.android.play.core.review.ReviewManager
 *  com.google.android.play.core.review.ReviewManagerFactory
 *  com.google.android.play.core.tasks.OnCompleteListener
 *  com.google.android.play.core.tasks.OnSuccessListener
 *  com.google.android.play.core.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Void
 *  me.ibrahimsn.lib.OnItemSelectedListener
 *  me.ibrahimsn.lib.SmoothBottomBar
 *  org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback
 *  org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal
 *  org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal
 *  org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal$Builder
 */
package com.dnyanwata.mscitquiznearn;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.dnyanwata.mscitquiznearn.-$$Lambda$MainActivity$SnlFFpEd3EPDclw90f898hKH2cQ;
import com.dnyanwata.mscitquiznearn.Fragment.HomeFragment;
import com.dnyanwata.mscitquiznearn.Fragment.LeaderBoardFragment;
import com.dnyanwata.mscitquiznearn.Fragment.ProfileFragment;
import com.dnyanwata.mscitquiznearn.Fragment.WalletFragment;
import com.dnyanwata.mscitquiznearn.LoginActivity;
import com.dnyanwata.mscitquiznearn.databinding.ActivityMainBinding;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.onesignal.OneSignal;
import es.dmoral.toasty.Toasty;
import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;
import org.imaginativeworld.oopsnointernet.callbacks.ConnectionCallback;
import org.imaginativeworld.oopsnointernet.dialogs.signal.DialogPropertiesSignal;
import org.imaginativeworld.oopsnointernet.dialogs.signal.NoInternetDialogSignal;

public class MainActivity
extends AppCompatActivity {
    private static final String ONESIGNAL_APP_ID = "bb8a42d7-3e68-40fb-a78b-3486d0740114";
    private int REQUEST_CODE = 11;
    FirebaseAuth auth;
    private long backPressedTime = 0L;
    ActivityMainBinding binding;
    ReviewManager rManager;
    ReviewInfo reviewInfo = null;

    private void initReviewInfo() {
        ReviewManager reviewManager;
        this.rManager = reviewManager = ReviewManagerFactory.create((Context)this);
        reviewManager.requestReviewFlow().addOnCompleteListener((OnCompleteListener)new -$$Lambda$MainActivity$SnlFFpEd3EPDclw90f898hKH2cQ(this));
    }

    private void openReview() {
        ReviewInfo reviewInfo = this.reviewInfo;
        if (reviewInfo != null) {
            this.rManager.launchReviewFlow((Activity)this, reviewInfo).addOnCompleteListener((OnCompleteListener)new OnCompleteListener<Void>(){

                public void onComplete(Task<Void> task) {
                }
            });
        }
    }

    private void showHelpPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setView(this.getLayoutInflater().inflate(2131558460, null));
        builder.setNegativeButton((CharSequence)"OK", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.setOnShowListener(new DialogInterface.OnShowListener(){

            public void onShow(DialogInterface dialogInterface) {
                alertDialog.getButton(-2).setTextColor(MainActivity.this.getResources().getColor(2131099922));
                alertDialog.getButton(-2).setBackgroundColor(MainActivity.this.getResources().getColor(2131099887));
            }
        });
        alertDialog.show();
    }

    private void showLogoutPopup() {
        TextView textView = new TextView((Context)this);
        textView.setText((CharSequence)"\u0932\u0949\u0917\u0906\u0909\u091f \u0915\u0930\u093e\u092f\u091a\u0947 \u0906\u0939\u0947 \u0915\u093e?");
        textView.setGravity(17);
        textView.setPadding(20, 20, 20, 20);
        textView.setTextSize(20.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setBackgroundColor(ContextCompat.getColor((Context)this, (int)2131099922));
        textView.setTextColor(ContextCompat.getColor((Context)this, (int)2131099898));
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this, 3);
        builder.setCustomTitle((View)textView).setMessage((CharSequence)"\u0924\u0941\u092e\u094d\u0939\u0940 \u0932\u0949\u0917\u0906\u0909\u091f \u091d\u093e\u0932\u093e \u0924\u0930\u0940\u0938\u0941\u0926\u094d\u0927\u093e \u092a\u0930\u0924 \u0932\u0949\u0917\u093f\u0928 \u0915\u0930\u0942 \u0936\u0915\u0924\u093e.").setPositiveButton((CharSequence)"\u0932\u0949\u0917\u0906\u0909\u091f", new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n) {
                MainActivity.this.auth.signOut();
                MainActivity.this.startActivity(new Intent((Context)MainActivity.this, LoginActivity.class));
                MainActivity.this.finish();
            }
        }).setNegativeButton((CharSequence)"\u0928\u093e\u0939\u0940", null);
        builder.show();
    }

    public /* synthetic */ void lambda$initReviewInfo$0$MainActivity(Task task) {
        if (task.isSuccessful()) {
            this.reviewInfo = (ReviewInfo)task.getResult();
        }
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == this.REQUEST_CODE) {
            Toasty.info((Context)this, "Start Download", 0).show();
            if (n != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Update Failed");
                stringBuilder.append(n2);
                Log.d((String)"TAG", (String)stringBuilder.toString());
            }
        }
    }

    public void onBackPressed() {
        this.openReview();
        long l = System.currentTimeMillis();
        if (l - this.backPressedTime > 2000L) {
            this.backPressedTime = l;
            Toasty.info((Context)this, "\u092c\u0902\u0926 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u092a\u0930\u0924 \u092c\u0945\u0915 \u0915\u0930\u093e", 0).show();
        } else {
            super.onBackPressed();
        }
        this.finish();
    }

    protected void onCreate(Bundle bundle) {
        ActivityMainBinding activityMainBinding;
        super.onCreate(bundle);
        this.binding = activityMainBinding = ActivityMainBinding.inflate(this.getLayoutInflater());
        this.setContentView((View)activityMainBinding.getRoot());
        this.auth = FirebaseAuth.getInstance();
        this.setSupportActionBar(this.binding.toolbar);
        this.binding.toolbar.setTitleTextColor(-1);
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext((Context)this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
        MobileAds.initialize((Context)this, (OnInitializationCompleteListener)new OnInitializationCompleteListener(){

            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        final AppUpdateManager appUpdateManager = AppUpdateManagerFactory.create((Context)this);
        appUpdateManager.getAppUpdateInfo().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<AppUpdateInfo>(){

            public void onSuccess(AppUpdateInfo appUpdateInfo) {
                if (appUpdateInfo.updateAvailability() == 2) {
                    appUpdateInfo.isUpdateTypeAllowed(0);
                }
                try {
                    AppUpdateManager appUpdateManager2 = appUpdateManager;
                    MainActivity mainActivity = MainActivity.this;
                    appUpdateManager2.startUpdateFlowForResult(appUpdateInfo, 0, (Activity)mainActivity, mainActivity.REQUEST_CODE);
                    return;
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    sendIntentException.printStackTrace();
                    return;
                }
            }
        });
        FragmentTransaction fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(2131362067, (Fragment)new HomeFragment());
        fragmentTransaction.commit();
        this.binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener(){

            public boolean onItemSelect(int n) {
                FragmentTransaction fragmentTransaction = MainActivity.this.getSupportFragmentManager().beginTransaction();
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n == 3) {
                                fragmentTransaction.replace(2131362067, (Fragment)new ProfileFragment());
                                fragmentTransaction.commit();
                            }
                        } else {
                            fragmentTransaction.replace(2131362067, (Fragment)new WalletFragment());
                            fragmentTransaction.commit();
                        }
                    } else {
                        fragmentTransaction.replace(2131362067, (Fragment)new LeaderBoardFragment());
                        fragmentTransaction.commit();
                    }
                } else {
                    fragmentTransaction.replace(2131362067, (Fragment)new HomeFragment());
                    fragmentTransaction.commit();
                }
                return false;
            }
        });
        this.initReviewInfo();
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        this.getMenuInflater().inflate(2131623937, menu2);
        return super.onCreateOptionsMenu(menu2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362065) {
            this.showLogoutPopup();
        } else if (menuItem.getItemId() == 2131362019) {
            this.showHelpPopup();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        NoInternetDialogSignal.Builder builder = new NoInternetDialogSignal.Builder((Activity)this, this.getLifecycle());
        DialogPropertiesSignal dialogPropertiesSignal = builder.getDialogProperties();
        dialogPropertiesSignal.setConnectionCallback(new ConnectionCallback(){

            public void hasActiveConnection(boolean bl) {
            }
        });
        dialogPropertiesSignal.setCancelable(false);
        dialogPropertiesSignal.setNoInternetConnectionTitle("\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0938\u0941\u0930\u0942 \u0928\u093e\u0939\u0940");
        dialogPropertiesSignal.setNoInternetConnectionMessage("APP \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u0907\u0902\u091f\u0930\u0928\u0947\u091f\u091a\u0940 \u0917\u0930\u091c \u0906\u0939\u0947.");
        dialogPropertiesSignal.setShowInternetOnButtons(true);
        dialogPropertiesSignal.setPleaseTurnOnText("\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0938\u0941\u0930\u0942 \u0915\u0930\u093e");
        dialogPropertiesSignal.setWifiOnButtonText("Wifi");
        dialogPropertiesSignal.setMobileDataOnButtonText("Mobile data");
        dialogPropertiesSignal.setOnAirplaneModeTitle("\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0938\u0941\u0930\u0942 \u0928\u093e\u0939\u0940");
        dialogPropertiesSignal.setOnAirplaneModeMessage("\u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u090f\u092f\u0930\u092a\u094d\u0932\u0947\u0928 \u092e\u094b\u0921 \u092c\u0902\u0926 \u0915\u0930\u093e\u0935\u093e \u0932\u093e\u0917\u0947\u0932.");
        dialogPropertiesSignal.setPleaseTurnOffText("\u090f\u092f\u0930\u092a\u094d\u0932\u0947\u0928 \u092e\u094b\u0921 \u092c\u0902\u0926 \u0915\u0930\u093e");
        dialogPropertiesSignal.setAirplaneModeOffButtonText("Airplane mode");
        dialogPropertiesSignal.setShowAirplaneModeOffButtons(true);
        builder.build();
    }

}

