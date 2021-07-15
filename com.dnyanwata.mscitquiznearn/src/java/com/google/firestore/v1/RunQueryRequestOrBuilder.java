/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.RunQueryRequest
 *  com.google.firestore.v1.StructuredQuery
 *  com.google.firestore.v1.TransactionOptions
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface RunQueryRequestOrBuilder
extends MessageLiteOrBuilder {
    public RunQueryRequest.ConsistencySelectorCase getConsistencySelectorCase();

    public TransactionOptions getNewTransaction();

    public String getParent();

    public ByteString getParentBytes();

    public RunQueryRequest.QueryTypeCase getQueryTypeCase();

    public Timestamp getReadTime();

    public StructuredQuery getStructuredQuery();

    public ByteString getTransaction();

    public boolean hasNewTransaction();

    public boolean hasReadTime();

    public boolean hasStructuredQuery();
}

