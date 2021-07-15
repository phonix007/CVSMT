/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeZoneOrBuilder
extends MessageLiteOrBuilder {
    public String getId();

    public ByteString getIdBytes();

    public String getVersion();

    public ByteString getVersionBytes();
}

