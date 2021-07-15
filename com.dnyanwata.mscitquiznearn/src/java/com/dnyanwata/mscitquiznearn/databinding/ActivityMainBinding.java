/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.appcompat.widget.Toolbar
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  me.ibrahimsn.lib.SmoothBottomBar
 */
package com.dnyanwata.mscitquiznearn.databinding;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import me.ibrahimsn.lib.SmoothBottomBar;

public final class ActivityMainBinding
implements ViewBinding {
    public final SmoothBottomBar bottomBar;
    public final FrameLayout mainContent;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;

    private ActivityMainBinding(ConstraintLayout constraintLayout, SmoothBottomBar smoothBottomBar, FrameLayout frameLayout, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.bottomBar = smoothBottomBar;
        this.mainContent = frameLayout;
        this.toolbar = toolbar;
    }

    public static ActivityMainBinding bind(View view) {
        FrameLayout frameLayout;
        Toolbar toolbar;
        int n = 2131361882;
        SmoothBottomBar smoothBottomBar = (SmoothBottomBar)view.findViewById(n);
        if (smoothBottomBar != null && (frameLayout = (FrameLayout)view.findViewById(n = 2131362067)) != null && (toolbar = (Toolbar)view.findViewById(n = 2131362275)) != null) {
            return new ActivityMainBinding((ConstraintLayout)view, smoothBottomBar, frameLayout, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return ActivityMainBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558429, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivityMainBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

