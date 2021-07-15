/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.bundle;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface BundleMetadataOrBuilder
extends MessageLiteOrBuilder {
    public Timestamp getCreateTime();

    public String getId();

    public ByteString getIdBytes();

    public long getTotalBytes();

    public int getTotalDocuments();

    public int getVersion();

    public boolean hasCreateTime();
}

