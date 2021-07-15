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

public final class LayoutHelpBinding
implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView textView2;
    public final TextView txt1;
    public final TextView txt10;
    public final TextView txt11;
    public final TextView txt12;
    public final TextView txt2;
    public final TextView txt3;
    public final TextView txt4;
    public final TextView txt5;
    public final TextView txt6;
    public final TextView txt7;
    public final TextView txt8;
    public final TextView txt9;

    private LayoutHelpBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = constraintLayout;
        this.textView2 = textView;
        this.txt1 = textView2;
        this.txt10 = textView3;
        this.txt11 = textView4;
        this.txt12 = textView5;
        this.txt2 = textView6;
        this.txt3 = textView7;
        this.txt4 = textView8;
        this.txt5 = textView9;
        this.txt6 = textView10;
        this.txt7 = textView11;
        this.txt8 = textView12;
        this.txt9 = textView13;
    }

    public static LayoutHelpBinding bind(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        int n = 2131362250;
        TextView textView13 = (TextView)view.findViewById(n);
        if (textView13 != null && (textView6 = (TextView)view.findViewById(n = 2131362291)) != null && (textView = (TextView)view.findViewById(n = 2131362292)) != null && (textView11 = (TextView)view.findViewById(n = 2131362293)) != null && (textView5 = (TextView)view.findViewById(n = 2131362294)) != null && (textView2 = (TextView)view.findViewById(n = 2131362295)) != null && (textView9 = (TextView)view.findViewById(n = 2131362296)) != null && (textView7 = (TextView)view.findViewById(n = 2131362297)) != null && (textView12 = (TextView)view.findViewById(n = 2131362298)) != null && (textView3 = (TextView)view.findViewById(n = 2131362299)) != null && (textView10 = (TextView)view.findViewById(n = 2131362300)) != null && (textView8 = (TextView)view.findViewById(n = 2131362301)) != null && (textView4 = (TextView)view.findViewById(n = 2131362302)) != null) {
            LayoutHelpBinding layoutHelpBinding = new LayoutHelpBinding((ConstraintLayout)view, textView13, textView6, textView, textView11, textView5, textView2, textView9, textView7, textView12, textView3, textView10, textView8, textView4);
            return layoutHelpBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static LayoutHelpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutHelpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558460, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return LayoutHelpBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

