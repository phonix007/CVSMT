/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Duration
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.rpc;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

public interface RetryInfoOrBuilder
extends MessageLiteOrBuilder {
    public Duration getRetryDelay();

    public boolean hasRetryDelay();
}

