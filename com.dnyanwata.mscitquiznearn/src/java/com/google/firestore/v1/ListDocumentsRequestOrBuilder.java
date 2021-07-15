/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentMask
 *  com.google.firestore.v1.ListDocumentsRequest
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface ListDocumentsRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getCollectionId();

    public ByteString getCollectionIdBytes();

    public ListDocumentsRequest.ConsistencySelectorCase getConsistencySelectorCase();

    public DocumentMask getMask();

    public String getOrderBy();

    public ByteString getOrderByBytes();

    public int getPageSize();

    public String getPageToken();

    public ByteString getPageTokenBytes();

    public String getParent();

    public ByteString getParentBytes();

    public Timestamp getReadTime();

    public boolean getShowMissing();

    public ByteString getTransaction();

    public boolean hasMask();

    public boolean hasReadTime();
}

