/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface MetricOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsLabels(String var1);

    @Deprecated
    public Map<String, String> getLabels();

    public int getLabelsCount();

    public Map<String, String> getLabelsMap();

    public String getLabelsOrDefault(String var1, String var2);

    public String getLabelsOrThrow(String var1);

    public String getType();

    public ByteString getTypeBytes();
}

