/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface MetricRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsMetricCosts(String var1);

    @Deprecated
    public Map<String, Long> getMetricCosts();

    public int getMetricCostsCount();

    public Map<String, Long> getMetricCostsMap();

    public long getMetricCostsOrDefault(String var1, long var2);

    public long getMetricCostsOrThrow(String var1);

    public String getSelector();

    public ByteString getSelectorBytes();
}

