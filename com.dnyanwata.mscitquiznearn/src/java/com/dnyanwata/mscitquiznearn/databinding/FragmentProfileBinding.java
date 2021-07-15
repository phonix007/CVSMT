/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.ads.AdView;

public final class FragmentProfileBinding
implements ViewBinding {
    public final AdView adView;
    public final TextView btnUpdate;
    public final EditText edtNewMobile;
    public final EditText edtNewName;
    public final ImageView imageView2;
    private final ConstraintLayout rootView;
    public final TextView txtEmailAddress;
    public final TextView txtMobile;
    public final TextView txtTnC;
    public final TextView txtUserName;
    public final View view;
    public final View view2;

    private FragmentProfileBinding(ConstraintLayout constraintLayout, AdView adView, TextView textView, EditText editText, EditText editText2, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view, View view2) {
        this.rootView = constraintLayout;
        this.adView = adView;
        this.btnUpdate = textView;
        this.edtNewMobile = editText;
        this.edtNewName = editText2;
        this.imageView2 = imageView;
        this.txtEmailAddress = textView2;
        this.txtMobile = textView3;
        this.txtTnC = textView4;
        this.txtUserName = textView5;
        this.view = view;
        this.view2 = view2;
    }

    public static FragmentProfileBinding bind(View view) {
        View view2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        ImageView imageView;
        EditText editText;
        View view3;
        EditText editText2;
        TextView textView5;
        int n = 2131361860;
        AdView adView = (AdView)view.findViewById(n);
        if (adView != null && (textView2 = (TextView)view.findViewById(n = 2131361900)) != null && (editText = (EditText)view.findViewById(n = 2131361982)) != null && (editText2 = (EditText)view.findViewById(n = 2131361983)) != null && (imageView = (ImageView)view.findViewById(n = 2131362033)) != null && (textView = (TextView)view.findViewById(n = 2131362307)) != null && (textView4 = (TextView)view.findViewById(n = 2131362311)) != null && (textView3 = (TextView)view.findViewById(n = 2131362322)) != null && (textView5 = (TextView)view.findViewById(n = 2131362323)) != null && (view2 = view.findViewById(n = 2131362329)) != null && (view3 = view.findViewById(n = 2131362330)) != null) {
            FragmentProfileBinding fragmentProfileBinding = new FragmentProfileBinding((ConstraintLayout)view, adView, textView2, editText, editText2, imageView, textView, textView4, textView3, textView5, view2, view3);
            return fragmentProfileBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return FragmentProfileBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558458, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return FragmentProfileBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

