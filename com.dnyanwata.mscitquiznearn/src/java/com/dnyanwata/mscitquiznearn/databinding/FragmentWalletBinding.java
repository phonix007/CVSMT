/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.TextView
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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.ads.AdView;

public final class FragmentWalletBinding
implements ViewBinding {
    public final AdView adView;
    public final ImageButton btnRequest;
    public final TextView btnShareSms;
    public final TextView btnSpinWheel;
    public final EditText edtUpiId;
    private final ConstraintLayout rootView;
    public final TextView txtCoins;
    public final TextView txtMobile;
    public final TextView txtUserName;
    public final View view;
    public final View view2;

    private FragmentWalletBinding(ConstraintLayout constraintLayout, AdView adView, ImageButton imageButton, TextView textView, TextView textView2, EditText editText, TextView textView3, TextView textView4, TextView textView5, View view, View view2) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.btnRequest = imageButton;
        this.btnShareSms = textView;
        this.btnSpinWheel = textView2;
        this.edtUpiId = editText;
        this.txtCoins = textView3;
        this.txtMobile = textView4;
        this.txtUserName = textView5;
        this.view = view;
        this.view2 = view2;
    }

    public static FragmentWalletBinding bind(View view) {
        View view2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageButton imageButton;
        EditText editText;
        TextView textView4;
        View view3;
        TextView textView5;
        int n = 2131361860;
        AdView adView = (AdView)view.findViewById(n);
        if (adView != null && (imageButton = (ImageButton)view.findViewById(n = 2131361894)) != null && (textView2 = (TextView)view.findViewById(n = 2131361897)) != null && (textView4 = (TextView)view.findViewById(n = 2131361899)) != null && (editText = (EditText)view.findViewById(n = 2131361985)) != null && (textView3 = (TextView)view.findViewById(n = 2131362304)) != null && (textView = (TextView)view.findViewById(n = 2131362311)) != null && (textView5 = (TextView)view.findViewById(n = 2131362323)) != null && (view3 = view.findViewById(n = 2131362329)) != null && (view2 = view.findViewById(n = 2131362330)) != null) {
            FragmentWalletBinding fragmentWalletBinding = new FragmentWalletBinding((ConstraintLayout)view, adView, imageButton, textView2, textView4, editText, textView3, textView, textView5, view3, view2);
            return fragmentWalletBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater) {
        return FragmentWalletBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558459, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return FragmentWalletBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

