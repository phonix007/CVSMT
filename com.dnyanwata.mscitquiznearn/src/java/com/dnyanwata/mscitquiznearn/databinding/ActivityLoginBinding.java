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

public final class ActivityLoginBinding
implements ViewBinding {
    public final TextView btnLogin;
    public final EditText edtEmail;
    public final EditText edtPass;
    public final ImageView imageView;
    private final ConstraintLayout rootView;
    public final TextView textView2;
    public final TextView txtCreateAc;
    public final TextView txtResetPass;
    public final TextView txtTnC;
    public final View view4;

    private ActivityLoginBinding(ConstraintLayout constraintLayout, TextView textView, EditText editText, EditText editText2, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.rootView = constraintLayout;
        this.btnLogin = textView;
        this.edtEmail = editText;
        this.edtPass = editText2;
        this.imageView = imageView;
        this.textView2 = textView2;
        this.txtCreateAc = textView3;
        this.txtResetPass = textView4;
        this.txtTnC = textView5;
        this.view4 = view;
    }

    public static ActivityLoginBinding bind(View view) {
        TextView textView;
        EditText editText;
        EditText editText2;
        TextView textView2;
        View view2;
        TextView textView3;
        TextView textView4;
        ImageView imageView;
        int n = 2131361890;
        TextView textView5 = (TextView)view.findViewById(n);
        if (textView5 != null && (editText2 = (EditText)view.findViewById(n = 2131361978)) != null && (editText = (EditText)view.findViewById(n = 2131361984)) != null && (imageView = (ImageView)view.findViewById(n = 2131362031)) != null && (textView3 = (TextView)view.findViewById(n = 2131362250)) != null && (textView2 = (TextView)view.findViewById(n = 2131362305)) != null && (textView = (TextView)view.findViewById(n = 2131362319)) != null && (textView4 = (TextView)view.findViewById(n = 2131362322)) != null && (view2 = view.findViewById(n = 2131362332)) != null) {
            ActivityLoginBinding activityLoginBinding = new ActivityLoginBinding((ConstraintLayout)view, textView5, editText2, editText, imageView, textView3, textView2, textView, textView4, view2);
            return activityLoginBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n)));
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater) {
        return ActivityLoginBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl) {
        View view = layoutInflater.inflate(2131558428, viewGroup, false);
        if (bl) {
            viewGroup.addView(view);
        }
        return ActivityLoginBinding.bind(view);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

