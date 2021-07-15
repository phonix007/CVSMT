/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.request.target.ViewTarget
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.dnyanwata.mscitquiznearn.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.ViewTarget;
import com.dnyanwata.mscitquiznearn.Model.CategoryModel;
import com.dnyanwata.mscitquiznearn.QuizActivity;
import java.util.ArrayList;

public class CategoryAdapter
extends RecyclerView.Adapter<CategoryViewHolder> {
    ArrayList<CategoryModel> categoryModels;
    Context context;

    public CategoryAdapter(Context context, ArrayList<CategoryModel> arrayList) {
        this.context = context;
        this.categoryModels = arrayList;
    }

    public int getItemCount() {
        return this.categoryModels.size();
    }

    public void onBindViewHolder(CategoryViewHolder categoryViewHolder, int n) {
        final CategoryModel categoryModel = (CategoryModel)this.categoryModels.get(n);
        categoryViewHolder.textView.setText((CharSequence)categoryModel.getCategoryName());
        Glide.with((Context)this.context).load(categoryModel.getCategoryImage()).into(categoryViewHolder.imageView);
        categoryViewHolder.itemView.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent(CategoryAdapter.this.context, QuizActivity.class);
                intent.putExtra("catId", categoryModel.getCategoryId());
                CategoryAdapter.this.context.startActivity(intent);
            }
        });
    }

    public CategoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new CategoryViewHolder(LayoutInflater.from((Context)this.context).inflate(2131558437, null));
    }

    public class CategoryViewHolder
    extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public CategoryViewHolder(View view) {
            super(view);
            this.imageView = (ImageView)view.findViewById(2131362039);
            this.textView = (TextView)view.findViewById(2131362303);
        }
    }

}

