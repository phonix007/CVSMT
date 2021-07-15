/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

public interface WriteResultOrBuilder
extends MessageLiteOrBuilder {
    public Value getTransformResults(int var1);

    public int getTransformResultsCount();

    public List<Value> getTransformResultsList();

    public Timestamp getUpdateTime();

    public boolean hasUpdateTime();
}

