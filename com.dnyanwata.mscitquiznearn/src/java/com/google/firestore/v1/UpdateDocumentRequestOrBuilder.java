/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.Precondition;
import com.google.protobuf.MessageLiteOrBuilder;

public interface UpdateDocumentRequestOrBuilder
extends MessageLiteOrBuilder {
    public Precondition getCurrentDocument();

    public Document getDocument();

    public DocumentMask getMask();

    public DocumentMask getUpdateMask();

    public boolean hasCurrentDocument();

    public boolean hasDocument();

    public boolean hasMask();

    public boolean hasUpdateMask();
}

