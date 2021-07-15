/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.WriteResult
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.WriteResult;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface CommitResponseOrBuilder
extends MessageLiteOrBuilder {
    public Timestamp getCommitTime();

    public WriteResult getWriteResults(int var1);

    public int getWriteResultsCount();

    public List<WriteResult> getWriteResultsList();

    public boolean hasCommitTime();
}

