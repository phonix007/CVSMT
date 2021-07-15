/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RequestMetadataOrBuilder
extends MessageLiteOrBuilder {
    public String getCallerIp();

    public ByteString getCallerIpBytes();

    public String getCallerSuppliedUserAgent();

    public ByteString getCallerSuppliedUserAgentBytes();
}

