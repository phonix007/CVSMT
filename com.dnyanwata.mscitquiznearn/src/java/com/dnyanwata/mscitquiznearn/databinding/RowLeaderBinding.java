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

public final class RowLeaderBinding
implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView txtCoins;
    public final TextView txtLeader;
    public final TextView txtRank;

    private RowLeaderBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.txtCoins = textView;
        this.txtLeader = textView2;
        this.txtRank = textView3;
    }

    public static RowLeaderBinding bind(View view) {
        TextView textView;
        TextView textView2;
        int n = 2131362304;
        TextView textView3 = (TextView)view.findViewById(n);
        if (textView3 != null && (textView2 = (TextView)view.findViewById(n = 2131362310)) != null && (textView = (TextView)view.findViewById(n = 2131362318)) != null) {
            return new RowLeaderBinding((ConstraintLayout)view, textView3, textView2, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static RowLeaderBinding inflate(LayoutInflater layoutInflater) {
        return RowLeaderBinding.inflate(layoutInflater, null, false);
    }

    public static RowLeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558520, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return RowLeaderBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

