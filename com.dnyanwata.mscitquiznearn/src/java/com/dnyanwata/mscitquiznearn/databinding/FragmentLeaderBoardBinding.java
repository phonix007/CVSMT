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
 *  androidx.recyclerview.widget.RecyclerView
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.ads.AdView;

public final class FragmentLeaderBoardBinding
implements ViewBinding {
    public final AdView adView;
    public final RecyclerView leaderRecycler;
    private final ConstraintLayout rootView;
    public final TextView textView;
    public final TextView textView3;
    public final TextView textView4;

    private FragmentLeaderBoardBinding(ConstraintLayout constraintLayout, AdView adView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.leaderRecycler = recyclerView;
        this.textView = textView;
        this.textView3 = textView2;
        this.textView4 = textView3;
    }

    public static FragmentLeaderBoardBinding bind(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        RecyclerView recyclerView;
        int n = 2131361860;
        AdView adView = (AdView)view.findViewById(n);
        if (adView != null && (recyclerView = (RecyclerView)view.findViewById(n = 2131362056)) != null && (textView = (TextView)view.findViewById(n = 2131362248)) != null && (textView2 = (TextView)view.findViewById(n = 2131362251)) != null && (textView3 = (TextView)view.findViewById(n = 2131362252)) != null) {
            FragmentLeaderBoardBinding fragmentLeaderBoardBinding = new FragmentLeaderBoardBinding((ConstraintLayout)view, adView, recyclerView, textView, textView2, textView3);
            return fragmentLeaderBoardBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static FragmentLeaderBoardBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLeaderBoardBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLeaderBoardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558457, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return FragmentLeaderBoardBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

