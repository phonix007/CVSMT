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

public interface MoneyOrBuilder
extends MessageLiteOrBuilder {
    public String getCurrencyCode();

    public ByteString getCurrencyCodeBytes();

    public int getNanos();

    public long getUnits();
}

