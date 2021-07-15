/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.bundle;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface BundledDocumentMetadataOrBuilder
extends MessageLiteOrBuilder {
    public boolean getExists();

    public String getName();

    public ByteString getNameBytes();

    public String getQueries(int var1);

    public ByteString getQueriesBytes(int var1);

    public int getQueriesCount();

    public List<String> getQueriesList();

    public Timestamp getReadTime();

    public boolean hasReadTime();
}

