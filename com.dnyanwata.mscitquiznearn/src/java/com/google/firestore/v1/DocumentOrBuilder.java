/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Value
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.Map;

public interface DocumentOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsFields(String var1);

    public Timestamp getCreateTime();

    @Deprecated
    public Map<String, Value> getFields();

    public int getFieldsCount();

    public Map<String, Value> getFieldsMap();

    public Value getFieldsOrDefault(String var1, Value var2);

    public Value getFieldsOrThrow(String var1);

    public String getName();

    public ByteString getNameBytes();

    public Timestamp getUpdateTime();

    public boolean hasCreateTime();

    public boolean hasUpdateTime();
}

