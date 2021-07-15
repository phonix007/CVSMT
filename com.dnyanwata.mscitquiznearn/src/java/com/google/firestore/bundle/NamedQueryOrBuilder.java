/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.bundle.BundledQuery
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundledQuery;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface NamedQueryOrBuilder
extends MessageLiteOrBuilder {
    public BundledQuery getBundledQuery();

    public String getName();

    public ByteString getNameBytes();

    public Timestamp getReadTime();

    public boolean hasBundledQuery();

    public boolean hasReadTime();
}

