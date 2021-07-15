/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
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
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.dnyanwata.mscitquiznearn.SpinWheel.LuckyWheelView;
import com.google.android.gms.ads.AdView;

public final class ActivitySpinnerBinding
implements ViewBinding {
    public final AdView adView;
    public final ImageView btnSpin;
    public final ImageView imageView5;
    public final ImageView imageView8;
    public final LuckyWheelView luckWheelView;
    private final ConstraintLayout rootView;

    private ActivitySpinnerBinding(ConstraintLayout constraintLayout, AdView adView, ImageView imageView, ImageView imageView2, ImageView imageView3, LuckyWheelView luckyWheelView) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.btnSpin = imageView;
        this.imageView5 = imageView2;
        this.imageView8 = imageView3;
        this.luckWheelView = luckyWheelView;
    }

    public static ActivitySpinnerBinding bind(View view) {
        ImageView imageView;
        LuckyWheelView luckyWheelView;
        ImageView imageView2;
        ImageView imageView3;
        int n = 2131361860;
        AdView adView = (AdView)view.findViewById(n);
        if (adView != null && (imageView = (ImageView)view.findViewById(n = 2131361898)) != null && (imageView2 = (ImageView)view.findViewById(n = 2131362036)) != null && (imageView3 = (ImageView)view.findViewById(n = 2131362037)) != null && (luckyWheelView = (LuckyWheelView)view.findViewById(n = 2131362066)) != null) {
            ActivitySpinnerBinding activitySpinnerBinding = new ActivitySpinnerBinding((ConstraintLayout)view, adView, imageView, imageView2, imageView3, luckyWheelView);
            return activitySpinnerBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivitySpinnerBinding inflate(LayoutInflater layoutInflater) {
        return ActivitySpinnerBinding.inflate(layoutInflater, null, false);
    }

    public static ActivitySpinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558433, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivitySpinnerBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

