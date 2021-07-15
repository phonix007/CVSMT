/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Write
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface CommitRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getDatabase();

    public ByteString getDatabaseBytes();

    public ByteString getTransaction();

    public Write getWrites(int var1);

    public int getWritesCount();

    public List<Write> getWritesList();
}

