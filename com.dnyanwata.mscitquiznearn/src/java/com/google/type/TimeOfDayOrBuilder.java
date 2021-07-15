/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.type;

import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeOfDayOrBuilder
extends MessageLiteOrBuilder {
    public int getHours();

    public int getMinutes();

    public int getNanos();

    public int getSeconds();
}

