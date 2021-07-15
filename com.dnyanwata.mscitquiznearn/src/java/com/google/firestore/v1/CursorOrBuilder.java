/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Value
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Value;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface CursorOrBuilder
extends MessageLiteOrBuilder {
    public boolean getBefore();

    public Value getValues(int var1);

    public int getValuesCount();

    public List<Value> getValuesList();
}

