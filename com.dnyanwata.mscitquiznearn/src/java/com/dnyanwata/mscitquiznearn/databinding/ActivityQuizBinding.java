/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 *  com.google.android.gms.ads.AdView
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.dnyanwata.mscitquiznearn.databinding;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.ads.AdView;

public final class ActivityQuizBinding
implements ViewBinding {
    public final AdView adView;
    public final TextView btnNext;
    public final TextView btnQuit;
    private final ConstraintLayout rootView;
    public final TextView txtOptionA;
    public final TextView txtOptionB;
    public final TextView txtOptionC;
    public final TextView txtOptionD;
    public final TextView txtQuesCount;
    public final TextView txtQuestion;
    public final TextView txtTimer;
    public final View view;
    public final View view2;

    private ActivityQuizBinding(ConstraintLayout constraintLayout, AdView adView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view, View view2) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.btnNext = textView;
        this.btnQuit = textView2;
        this.txtOptionA = textView3;
        this.txtOptionB = textView4;
        this.txtOptionC = textView5;
        this.txtOptionD = textView6;
        this.txtQuesCount = textView7;
        this.txtQuestion = textView8;
        this.txtTimer = textView9;
        this.view = view;
        this.view2 = view2;
    }

    public static ActivityQuizBinding bind(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        View view2;
        TextView textView8;
        View view3;
        TextView textView9;
        int n = 2131361860;
        AdView adView = (AdView)view.findViewById(n);
        if (adView != null && (textView5 = (TextView)view.findViewById(n = 2131361891)) != null && (textView = (TextView)view.findViewById(n = 2131361892)) != null && (textView8 = (TextView)view.findViewById(n = 2131362312)) != null && (textView4 = (TextView)view.findViewById(n = 2131362313)) != null && (textView2 = (TextView)view.findViewById(n = 2131362314)) != null && (textView7 = (TextView)view.findViewById(n = 2131362315)) != null && (textView6 = (TextView)view.findViewById(n = 2131362316)) != null && (textView9 = (TextView)view.findViewById(n = 2131362317)) != null && (textView3 = (TextView)view.findViewById(n = 2131362321)) != null && (view3 = view.findViewById(n = 2131362329)) != null && (view2 = view.findViewById(n = 2131362330)) != null) {
            ActivityQuizBinding activityQuizBinding = new ActivityQuizBinding((ConstraintLayout)view, adView, textView5, textView, textView8, textView4, textView2, textView7, textView6, textView9, textView3, view3, view2);
            return activityQuizBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivityQuizBinding inflate(LayoutInflater layoutInflater) {
        return ActivityQuizBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityQuizBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558430, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivityQuizBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

