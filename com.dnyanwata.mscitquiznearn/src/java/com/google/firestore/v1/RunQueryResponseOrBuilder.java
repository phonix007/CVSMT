/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Document
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface RunQueryResponseOrBuilder
extends MessageLiteOrBuilder {
    public Document getDocument();

    public Timestamp getReadTime();

    public int getSkippedResults();

    public ByteString getTransaction();

    public boolean hasDocument();

    public boolean hasReadTime();
}

