/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface OperationInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getMetadataType();

    public ByteString getMetadataTypeBytes();

    public String getResponseType();

    public ByteString getResponseTypeBytes();
}

