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
 *  androidx.recyclerview.widget.GridLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  com.google.firebase.firestore.CollectionReference
 *  com.google.firebase.firestore.DocumentSnapshot
 *  com.google.firebase.firestore.EventListener
 *  com.google.firebase.firestore.FirebaseFirestore
 *  com.google.firebase.firestore.FirebaseFirestoreException
 *  com.google.firebase.firestore.ListenerRegistration
 *  com.google.firebase.firestore.QuerySnapshot
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.dnyanwata.mscitquiznearn.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dnyanwata.mscitquiznearn.Adapter.CategoryAdapter;
import com.dnyanwata.mscitquiznearn.Model.CategoryModel;
import com.dnyanwata.mscitquiznearn.databinding.FragmentHomeBinding;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment
extends Fragment {
    FragmentHomeBinding binding;
    FirebaseFirestore database;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.binding = FragmentHomeBinding.inflate(layoutInflater, viewGroup, false);
        this.database = FirebaseFirestore.getInstance();
        final ArrayList arrayList = new ArrayList();
        final CategoryAdapter categoryAdapter = new CategoryAdapter(this.getContext(), (ArrayList<CategoryModel>)arrayList);
        this.database.collection("categories").addSnapshotListener((EventListener)new EventListener<QuerySnapshot>(){

            public void onEvent(QuerySnapshot querySnapshot, FirebaseFirestoreException firebaseFirestoreException) {
                arrayList.clear();
                for (DocumentSnapshot documentSnapshot : querySnapshot.getDocuments()) {
                    CategoryModel categoryModel = (CategoryModel)documentSnapshot.toObject(CategoryModel.class);
                    categoryModel.setCategoryId(documentSnapshot.getId());
                    arrayList.add((Object)categoryModel);
                }
                categoryAdapter.notifyDataSetChanged();
            }
        });
        this.binding.catList.setLayoutManager((RecyclerView.LayoutManager)new GridLayoutManager(this.getContext(), 2));
        this.binding.catList.setAdapter((RecyclerView.Adapter)categoryAdapter);
        return this.binding.getRoot();
    }

}

