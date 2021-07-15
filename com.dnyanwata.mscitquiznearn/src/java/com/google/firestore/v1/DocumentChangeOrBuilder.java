/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Document
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentChangeOrBuilder
extends MessageLiteOrBuilder {
    public Document getDocument();

    public int getRemovedTargetIds(int var1);

    public int getRemovedTargetIdsCount();

    public List<Integer> getRemovedTargetIdsList();

    public int getTargetIds(int var1);

    public int getTargetIdsCount();

    public List<Integer> getTargetIdsList();

    public boolean hasDocument();
}

