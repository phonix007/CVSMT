/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BatchGetDocumentsResponse
 *  com.google.firestore.v1.Document
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.Document;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface BatchGetDocumentsResponseOrBuilder
extends MessageLiteOrBuilder {
    public Document getFound();

    public String getMissing();

    public ByteString getMissingBytes();

    public Timestamp getReadTime();

    public BatchGetDocumentsResponse.ResultCase getResultCase();

    public ByteString getTransaction();

    public boolean hasFound();

    public boolean hasReadTime();
}

