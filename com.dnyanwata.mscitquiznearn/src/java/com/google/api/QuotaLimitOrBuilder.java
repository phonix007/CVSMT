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

public interface QuotaLimitOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsValues(String var1);

    public long getDefaultLimit();

    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getDisplayName();

    public ByteString getDisplayNameBytes();

    public String getDuration();

    public ByteString getDurationBytes();

    public long getFreeTier();

    public long getMaxLimit();

    public String getMetric();

    public ByteString getMetricBytes();

    public String getName();

    public ByteString getNameBytes();

    public String getUnit();

    public ByteString getUnitBytes();

    @Deprecated
    public Map<String, Long> getValues();

    public int getValuesCount();

    public Map<String, Long> getValuesMap();

    public long getValuesOrDefault(String var1, long var2);

    public long getValuesOrThrow(String var1);
}

