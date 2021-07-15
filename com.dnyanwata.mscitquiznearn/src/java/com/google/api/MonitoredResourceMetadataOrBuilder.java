/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Struct
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import java.util.Map;

public interface MonitoredResourceMetadataOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsUserLabels(String var1);

    public Struct getSystemLabels();

    @Deprecated
    public Map<String, String> getUserLabels();

    public int getUserLabelsCount();

    public Map<String, String> getUserLabelsMap();

    public String getUserLabelsOrDefault(String var1, String var2);

    public String getUserLabelsOrThrow(String var1);

    public boolean hasSystemLabels();
}

