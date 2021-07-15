/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.MessageLiteOrBuilder;

public interface TransactionOptionsOrBuilder
extends MessageLiteOrBuilder {
    public TransactionOptions.ModeCase getModeCase();

    public TransactionOptions.ReadOnly getReadOnly();

    public TransactionOptions.ReadWrite getReadWrite();

    public boolean hasReadOnly();

    public boolean hasReadWrite();
}

