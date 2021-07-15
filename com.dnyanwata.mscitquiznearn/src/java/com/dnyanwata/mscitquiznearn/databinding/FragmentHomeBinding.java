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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

public final class FragmentHomeBinding
implements ViewBinding {
    public final RecyclerView catList;
    public final ImageView imageView3;
    private final ConstraintLayout rootView;
    public final TextView textView;
    public final TextView textView1;
    public final TextView textView2;
    public final TextView textView3;
    public final TextView txtInstructions;
    public final View view;
    public final View view2;

    private FragmentHomeBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, View view2) {
        this.rootView = constraintLayout;
        this.catList = recyclerView;
        this.imageView3 = imageView;
        this.textView = textView;
        this.textView1 = textView2;
        this.textView2 = textView3;
        this.textView3 = textView4;
        this.txtInstructions = textView5;
        this.view = view;
        this.view2 = view2;
    }

    public static FragmentHomeBinding bind(View view) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        TextView textView3;
        View view2;
        TextView textView4;
        View view3;
        TextView textView5;
        int n = 2131361910;
        RecyclerView recyclerView = (RecyclerView)view.findViewById(n);
        if (recyclerView != null && (imageView = (ImageView)view.findViewById(n = 2131362034)) != null && (textView2 = (TextView)view.findViewById(n = 2131362248)) != null && (textView4 = (TextView)view.findViewById(n = 2131362249)) != null && (textView5 = (TextView)view.findViewById(n = 2131362250)) != null && (textView3 = (TextView)view.findViewById(n = 2131362251)) != null && (textView = (TextView)view.findViewById(n = 2131362309)) != null && (view2 = view.findViewById(n = 2131362329)) != null && (view3 = view.findViewById(n = 2131362330)) != null) {
            FragmentHomeBinding fragmentHomeBinding = new FragmentHomeBinding((ConstraintLayout)view, recyclerView, imageView, textView2, textView4, textView5, textView3, textView, view2, view3);
            return fragmentHomeBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentHomeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558456, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return FragmentHomeBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

