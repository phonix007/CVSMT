/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ListCollectionIdsResponseOrBuilder
extends MessageLiteOrBuilder {
    public String getCollectionIds(int var1);

    public ByteString getCollectionIdsBytes(int var1);

    public int getCollectionIdsCount();

    public List<String> getCollectionIdsList();

    public String getNextPageToken();

    public ByteString getNextPageTokenBytes();
}

