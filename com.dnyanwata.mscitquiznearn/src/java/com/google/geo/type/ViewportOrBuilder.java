/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.geo.type;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.LatLng;

public interface ViewportOrBuilder
extends MessageLiteOrBuilder {
    public LatLng getHigh();

    public LatLng getLow();

    public boolean hasHigh();

    public boolean hasLow();
}

