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

public final class ActivitySplashBinding
implements ViewBinding {
    public final ImageView imageView10;
    private final ConstraintLayout rootView;
    public final TextView textView5;
    public final TextView textView6;

    private ActivitySplashBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.imageView10 = imageView;
        this.textView5 = textView;
        this.textView6 = textView2;
    }

    public static ActivitySplashBinding bind(View view) {
        TextView textView;
        TextView textView2;
        int n = 2131362032;
        ImageView imageView = (ImageView)view.findViewById(n);
        if (imageView != null && (textView2 = (TextView)view.findViewById(n = 2131362253)) != null && (textView = (TextView)view.findViewById(n = 2131362254)) != null) {
            return new ActivitySplashBinding((ConstraintLayout)view, imageView, textView2, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        return ActivitySplashBinding.inflate(layoutInflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558434, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivitySplashBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

