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
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface ErrorInfoOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsMetadata(String var1);

    public String getDomain();

    public ByteString getDomainBytes();

    @Deprecated
    public Map<String, String> getMetadata();

    public int getMetadataCount();

    public Map<String, String> getMetadataMap();

    public String getMetadataOrDefault(String var1, String var2);

    public String getMetadataOrThrow(String var1);

    public String getReason();

    public ByteString getReasonBytes();
}

