/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.dnyanwata.mscitquiznearn.databinding;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

public final class ActivityResultBinding
implements ViewBinding {
    public final ImageView btnFreeCoins;
    public final TextView btnRestart;
    public final TextView btnShareResult;
    public final ImageView imageView4;
    private final ConstraintLayout rootView;
    public final TextView textView7;
    public final TextView textView8;
    public final TextView textView9;
    public final TextView txtEarnedCoins;
    public final TextView txtScore;

    private ActivityResultBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.btnFreeCoins = imageView;
        this.btnRestart = textView;
        this.btnShareResult = textView2;
        this.imageView4 = imageView2;
        this.textView7 = textView3;
        this.textView8 = textView4;
        this.textView9 = textView5;
        this.txtEarnedCoins = textView6;
        this.txtScore = textView7;
    }

    public static ActivityResultBinding bind(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        ImageView imageView;
        int n = 2131361889;
        ImageView imageView2 = (ImageView)view.findViewById(n);
        if (imageView2 != null && (textView5 = (TextView)view.findViewById(n = 2131361895)) != null && (textView2 = (TextView)view.findViewById(n = 2131361896)) != null && (imageView = (ImageView)view.findViewById(n = 2131362035)) != null && (textView4 = (TextView)view.findViewById(n = 2131362255)) != null && (textView3 = (TextView)view.findViewById(n = 2131362256)) != null && (textView = (TextView)view.findViewById(n = 2131362257)) != null && (textView6 = (TextView)view.findViewById(n = 2131362306)) != null && (textView7 = (TextView)view.findViewById(n = 2131362320)) != null) {
            ActivityResultBinding activityResultBinding = new ActivityResultBinding((ConstraintLayout)view, imageView2, textView5, textView2, imageView, textView4, textView3, textView, textView6, textView7);
            return activityResultBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivityResultBinding inflate(LayoutInflater layoutInflater) {
        return ActivityResultBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558431, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivityResultBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

