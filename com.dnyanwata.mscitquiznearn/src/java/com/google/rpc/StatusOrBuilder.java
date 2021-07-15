/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Any
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.rpc;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface StatusOrBuilder
extends MessageLiteOrBuilder {
    public int getCode();

    public Any getDetails(int var1);

    public int getDetailsCount();

    public List<Any> getDetailsList();

    public String getMessage();

    public ByteString getMessageBytes();
}

