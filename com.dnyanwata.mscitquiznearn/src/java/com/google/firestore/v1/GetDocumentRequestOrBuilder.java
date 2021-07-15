/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentMask
 *  com.google.firestore.v1.GetDocumentRequest
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface GetDocumentRequestOrBuilder
extends MessageLiteOrBuilder {
    public GetDocumentRequest.ConsistencySelectorCase getConsistencySelectorCase();

    public DocumentMask getMask();

    public String getName();

    public ByteString getNameBytes();

    public Timestamp getReadTime();

    public ByteString getTransaction();

    public boolean hasMask();

    public boolean hasReadTime();
}

