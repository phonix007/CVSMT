/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ListCollectionIdsRequestOrBuilder
extends MessageLiteOrBuilder {
    public int getPageSize();

    public String getPageToken();

    public ByteString getPageTokenBytes();

    public String getParent();

    public ByteString getParentBytes();
}

