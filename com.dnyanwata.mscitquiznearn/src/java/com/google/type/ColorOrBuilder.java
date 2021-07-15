/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.FloatValue
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.type;

import com.google.protobuf.FloatValue;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ColorOrBuilder
extends MessageLiteOrBuilder {
    public FloatValue getAlpha();

    public float getBlue();

    public float getGreen();

    public float getRed();

    public boolean hasAlpha();
}

