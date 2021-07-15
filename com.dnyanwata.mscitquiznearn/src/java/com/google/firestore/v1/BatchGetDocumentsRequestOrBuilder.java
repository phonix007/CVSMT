/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BatchGetDocumentsRequest
 *  com.google.firestore.v1.DocumentMask
 *  com.google.firestore.v1.TransactionOptions
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface BatchGetDocumentsRequestOrBuilder
extends MessageLiteOrBuilder {
    public BatchGetDocumentsRequest.ConsistencySelectorCase getConsistencySelectorCase();

    public String getDatabase();

    public ByteString getDatabaseBytes();

    public String getDocuments(int var1);

    public ByteString getDocumentsBytes(int var1);

    public int getDocumentsCount();

    public List<String> getDocumentsList();

    public DocumentMask getMask();

    public TransactionOptions getNewTransaction();

    public Timestamp getReadTime();

    public ByteString getTransaction();

    public boolean hasMask();

    public boolean hasNewTransaction();

    public boolean hasReadTime();
}

