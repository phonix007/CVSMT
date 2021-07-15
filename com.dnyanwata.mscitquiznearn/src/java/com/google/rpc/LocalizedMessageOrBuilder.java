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

public interface LocalizedMessageOrBuilder
extends MessageLiteOrBuilder {
    public String getLocale();

    public ByteString getLocaleBytes();

    public String getMessage();

    public ByteString getMessageBytes();
}

