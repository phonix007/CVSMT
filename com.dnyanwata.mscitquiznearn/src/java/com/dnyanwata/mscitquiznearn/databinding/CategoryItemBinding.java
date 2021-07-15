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

public final class CategoryItemBinding
implements ViewBinding {
    public final ImageView imgCat;
    private final ConstraintLayout rootView;
    public final TextView txtCatName;

    private CategoryItemBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgCat = imageView;
        this.txtCatName = textView;
    }

    public static CategoryItemBinding bind(View view) {
        TextView textView;
        int n = 2131362039;
        ImageView imageView = (ImageView)view.findViewById(n);
        if (imageView != null && (textView = (TextView)view.findViewById(n = 2131362303)) != null) {
            return new CategoryItemBinding((ConstraintLayout)view, imageView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static CategoryItemBinding inflate(LayoutInflater layoutInflater) {
        return CategoryItemBinding.inflate(layoutInflater, null, false);
    }

    public static CategoryItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558437, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return CategoryItemBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

