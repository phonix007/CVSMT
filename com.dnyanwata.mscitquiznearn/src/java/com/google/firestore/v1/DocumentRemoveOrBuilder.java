/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface DocumentRemoveOrBuilder
extends MessageLiteOrBuilder {
    public String getDocument();

    public ByteString getDocumentBytes();

    public Timestamp getReadTime();

    public int getRemovedTargetIds(int var1);

    public int getRemovedTargetIdsCount();

    public List<Integer> getRemovedTargetIdsList();

    public boolean hasReadTime();
}

