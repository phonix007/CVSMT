/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TargetChange;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import java.util.List;

public interface TargetChangeOrBuilder
extends MessageLiteOrBuilder {
    public Status getCause();

    public Timestamp getReadTime();

    public ByteString getResumeToken();

    public TargetChange.TargetChangeType getTargetChangeType();

    public int getTargetChangeTypeValue();

    public int getTargetIds(int var1);

    public int getTargetIdsCount();

    public List<Integer> getTargetIdsList();

    public boolean hasCause();

    public boolean hasReadTime();
}

