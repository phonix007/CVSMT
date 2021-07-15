/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Precondition
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Precondition;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface DeleteDocumentRequestOrBuilder
extends MessageLiteOrBuilder {
    public Precondition getCurrentDocument();

    public String getName();

    public ByteString getNameBytes();

    public boolean hasCurrentDocument();
}

