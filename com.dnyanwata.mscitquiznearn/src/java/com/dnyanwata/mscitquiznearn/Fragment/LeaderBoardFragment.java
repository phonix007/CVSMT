/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.fragment.app.Fragment
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentSnapshot
 *  com.google.firebase.firestore.FirebaseFirestore
 *  com.google.firebase.firestore.Query
 *  com.google.firebase.firestore.Query$Direction
 *  com.google.firebase.firestore.QuerySnapshot
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package com.dnyanwata.mscitquiznearn.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dnyanwata.mscitquiznearn.Adapter.LeaderBoardAdapter;
import com.dnyanwata.mscitquiznearn.Model.UserModel;
import com.dnyanwata.mscitquiznearn.databinding.FragmentLeaderBoardBinding;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Iterator;

public class LeaderBoardFragment
extends Fragment {
    FragmentLeaderBoardBinding binding;
    FirebaseFirestore database;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FirebaseFirestore firebaseFirestore;
        this.binding = FragmentLeaderBoardBinding.inflate(layoutInflater, viewGroup, false);
        AdRequest adRequest = new AdRequest.Builder().build();
        this.binding.adView.loadAd(adRequest);
        final ArrayList arrayList = new ArrayList();
        final LeaderBoardAdapter leaderBoardAdapter = new LeaderBoardAdapter(this.getContext(), (ArrayList<UserModel>)arrayList);
        this.binding.leaderRecycler.setAdapter((RecyclerView.Adapter)leaderBoardAdapter);
        this.binding.leaderRecycler.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getContext()));
        this.database = firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseFirestore.collection("users").orderBy("coins", Query.Direction.DESCENDING).get().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<QuerySnapshot>(){

            public void onSuccess(QuerySnapshot querySnapshot) {
                Iterator iterator = querySnapshot.iterator();
                while (iterator.hasNext()) {
                    UserModel userModel = (UserModel)((DocumentSnapshot)iterator.next()).toObject(UserModel.class);
                    arrayList.add((Object)userModel);
                }
                leaderBoardAdapter.notifyDataSetChanged();
            }
        });
        return this.binding.getRoot();
    }

}

