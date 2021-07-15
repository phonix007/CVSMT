/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.bundle.BundledQuery
 *  com.google.firestore.v1.StructuredQuery
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundledQuery;
import com.google.firestore.v1.StructuredQuery;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BundledQueryOrBuilder
extends MessageLiteOrBuilder {
    public BundledQuery.LimitType getLimitType();

    public int getLimitTypeValue();

    public String getParent();

    public ByteString getParentBytes();

    public BundledQuery.QueryTypeCase getQueryTypeCase();

    public StructuredQuery getStructuredQuery();

    public boolean hasStructuredQuery();
}

