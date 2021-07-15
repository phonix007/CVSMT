/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.WriteResult;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface WriteResponseOrBuilder
extends MessageLiteOrBuilder {
    public Timestamp getCommitTime();

    public String getStreamId();

    public ByteString getStreamIdBytes();

    public ByteString getStreamToken();

    public WriteResult getWriteResults(int var1);

    public int getWriteResultsCount();

    public List<WriteResult> getWriteResultsList();

    public boolean hasCommitTime();
}

