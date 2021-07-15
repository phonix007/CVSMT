/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Document
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ListDocumentsResponseOrBuilder
extends MessageLiteOrBuilder {
    public Document getDocuments(int var1);

    public int getDocumentsCount();

    public List<Document> getDocumentsList();

    public String getNextPageToken();

    public ByteString getNextPageTokenBytes();
}

