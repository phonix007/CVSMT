/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface EndpointOrBuilder
extends MessageLiteOrBuilder {
    @Deprecated
    public String getAliases(int var1);

    @Deprecated
    public ByteString getAliasesBytes(int var1);

    @Deprecated
    public int getAliasesCount();

    @Deprecated
    public List<String> getAliasesList();

    public boolean getAllowCors();

    public String getFeatures(int var1);

    public ByteString getFeaturesBytes(int var1);

    public int getFeaturesCount();

    public List<String> getFeaturesList();

    public String getName();

    public ByteString getNameBytes();

    public String getTarget();

    public ByteString getTargetBytes();
}

