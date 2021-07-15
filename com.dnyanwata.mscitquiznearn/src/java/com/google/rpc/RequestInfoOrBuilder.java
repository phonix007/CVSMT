/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RequestInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getRequestId();

    public ByteString getRequestIdBytes();

    public String getServingData();

    public ByteString getServingDataBytes();
}

