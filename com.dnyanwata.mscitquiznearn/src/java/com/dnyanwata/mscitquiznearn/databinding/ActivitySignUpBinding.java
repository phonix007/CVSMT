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

public final class ActivitySignUpBinding
implements ViewBinding {
    public final TextView btnRegister;
    public final EditText edtEmail;
    public final EditText edtMobile;
    public final EditText edtName;
    public final EditText edtName2;
    public final EditText edtPass;
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView textView2;
    public final TextView txtGoLogin;
    public final TextView txtTnC;
    public final View view3;

    private ActivitySignUpBinding(ConstraintLayout constraintLayout, TextView textView, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.rootView = constraintLayout;
        this.btnRegister = textView;
        this.edtEmail = editText;
        this.edtMobile = editText2;
        this.edtName = editText3;
        this.edtName2 = editText4;
        this.edtPass = editText5;
        this.imageView = imageView;
        this.textView2 = textView2;
        this.txtGoLogin = textView3;
        this.txtTnC = textView4;
        this.view3 = view;
    }

    public static ActivitySignUpBinding bind(View view) {
        EditText editText;
        TextView textView;
        EditText editText2;
        ImageView imageView;
        TextView textView2;
        EditText editText3;
        EditText editText4;
        View view2;
        EditText editText5;
        TextView textView3;
        int n = 2131361893;
        TextView textView4 = (TextView)view.findViewById(n);
        if (textView4 != null && (editText = (EditText)view.findViewById(n = 2131361978)) != null && (editText4 = (EditText)view.findViewById(n = 2131361979)) != null && (editText5 = (EditText)view.findViewById(n = 2131361980)) != null && (editText2 = (EditText)view.findViewById(n = 2131361981)) != null && (editText3 = (EditText)view.findViewById(n = 2131361984)) != null && (imageView = (ImageView)view.findViewById(n = 2131362031)) != null && (textView2 = (TextView)view.findViewById(n = 2131362250)) != null && (textView3 = (TextView)view.findViewById(n = 2131362308)) != null && (textView = (TextView)view.findViewById(n = 2131362322)) != null && (view2 = view.findViewById(n = 2131362331)) != null) {
            ActivitySignUpBinding activitySignUpBinding = new ActivitySignUpBinding((ConstraintLayout)view, textView4, editText, editText4, editText5, editText2, editText3, imageView, textView2, textView3, textView, view2);
            return activitySignUpBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivitySignUpBinding inflate(LayoutInflater layoutInflater) {
        return ActivitySignUpBinding.inflate(layoutInflater, null, false);
    }

    public static ActivitySignUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558432, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivitySignUpBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

