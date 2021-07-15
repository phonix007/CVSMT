/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.dnyanwata.mscitquiznearn.SpinWheel.PielView;

public final class LuckyWheelLayoutBinding
implements ViewBinding {
    public final ImageView cursorView;
    public final PielView pieView;
    private final FrameLayout rootView;

    private LuckyWheelLayoutBinding(FrameLayout frameLayout, ImageView imageView, PielView pielView) {
        this.rootView = frameLayout;
        this.cursorView = imageView;
        this.pieView = pielView;
    }

    public static LuckyWheelLayoutBinding bind(View view) {
        PielView pielView;
        int n = 2131361943;
        ImageView imageView = (ImageView)view.findViewById(n);
        if (imageView != null && (pielView = (PielView)view.findViewById(n = 2131362156)) != null) {
            return new LuckyWheelLayoutBinding((FrameLayout)view, imageView, pielView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static LuckyWheelLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuckyWheelLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuckyWheelLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558461, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return LuckyWheelLayoutBinding.bind(view);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

