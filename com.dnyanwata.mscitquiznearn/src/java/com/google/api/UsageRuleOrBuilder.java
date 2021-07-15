/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface UsageRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean getAllowUnregisteredCalls();

    public String getSelector();

    public ByteString getSelectorBytes();

    public boolean getSkipServiceControl();
}

