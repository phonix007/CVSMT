/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentChange
 *  com.google.firestore.v1.DocumentDelete
 *  com.google.firestore.v1.DocumentRemove
 *  com.google.firestore.v1.ExistenceFilter
 *  com.google.firestore.v1.ListenResponse
 *  com.google.firestore.v1.TargetChange
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentDelete;
import com.google.firestore.v1.DocumentRemove;
import com.google.firestore.v1.ExistenceFilter;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.TargetChange;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ListenResponseOrBuilder
extends MessageLiteOrBuilder {
    public DocumentChange getDocumentChange();

    public DocumentDelete getDocumentDelete();

    public DocumentRemove getDocumentRemove();

    public ExistenceFilter getFilter();

    public ListenResponse.ResponseTypeCase getResponseTypeCase();

    public TargetChange getTargetChange();

    public boolean hasDocumentChange();

    public boolean hasDocumentDelete();

    public boolean hasDocumentRemove();

    public boolean hasFilter();

    public boolean hasTargetChange();
}

