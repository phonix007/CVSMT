/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Document
 *  com.google.firestore.v1.DocumentMask
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface CreateDocumentRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getCollectionId();

    public ByteString getCollectionIdBytes();

    public Document getDocument();

    public String getDocumentId();

    public ByteString getDocumentIdBytes();

    public DocumentMask getMask();

    public String getParent();

    public ByteString getParentBytes();

    public boolean hasDocument();

    public boolean hasMask();
}

