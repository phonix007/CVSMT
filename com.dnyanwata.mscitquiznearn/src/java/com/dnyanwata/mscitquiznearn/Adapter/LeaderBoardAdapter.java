/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package com.dnyanwata.mscitquiznearn.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.databinding.RowLeaderBinding;
import java.util.ArrayList;

public class LeaderBoardAdapter
extends RecyclerView.Adapter<LeaderBoardViewHolder> {
    Context context;
    ArrayList<UserModel> users;

    public LeaderBoardAdapter(Context context, ArrayList<UserModel> arrayList) {
        this.context = context;
        this.users = arrayList;
    }

    public int getItemCount() {
        return Math.min((int)this.users.size(), (int)20);
    }

    public void onBindViewHolder(LeaderBoardViewHolder leaderBoardViewHolder, int n) {
        UserModel userModel = (UserModel)this.users.get(n);
        TextView textView = leaderBoardViewHolder.binding.txtRank;
        Object[] arrobject = new Object[]{n + 1};
        textView.setText((CharSequence)String.format((String)"%d)", (Object[])arrobject));
        String[] arrstring = userModel.getName().split("\\s");
        String string2 = userModel.getEmail().replaceAll("(?<=.{3}).(?=[^@]*?.@)", "*");
        TextView textView2 = leaderBoardViewHolder.binding.txtLeader;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arrstring[0]);
        stringBuilder.append(" *** / ");
        stringBuilder.append(string2);
        textView2.setText((CharSequence)stringBuilder.toString());
        leaderBoardViewHolder.binding.txtCoins.setText((CharSequence)String.valueOf((long)userModel.getCoins()));
    }

    public LeaderBoardViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new LeaderBoardViewHolder(LayoutInflater.from((Context)this.context).inflate(2131558520, viewGroup, false));
    }

    public class LeaderBoardViewHolder
    extends RecyclerView.ViewHolder {
        RowLeaderBinding binding;

        public LeaderBoardViewHolder(View view) {
            super(view);
            this.binding = RowLeaderBinding.bind(view);
        }
    }

}

