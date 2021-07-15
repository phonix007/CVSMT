/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Value
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Value;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface MapValueOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsFields(String var1);

    @Deprecated
    public Map<String, Value> getFields();

    public int getFieldsCount();

    public Map<String, Value> getFieldsMap();

    public Value getFieldsOrDefault(String var1, Value var2);

    public Value getFieldsOrThrow(String var1);
}

