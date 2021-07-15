/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.TransactionOptions
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BeginTransactionRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getDatabase();

    public ByteString getDatabaseBytes();

    public TransactionOptions getOptions();

    public boolean hasOptions();
}

