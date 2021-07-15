/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.NullValue
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;

public interface ValueOrBuilder
extends MessageLiteOrBuilder {
    public ArrayValue getArrayValue();

    public boolean getBooleanValue();

    public ByteString getBytesValue();

    public double getDoubleValue();

    public LatLng getGeoPointValue();

    public long getIntegerValue();

    public MapValue getMapValue();

    public NullValue getNullValue();

    public int getNullValueValue();

    public String getReferenceValue();

    public ByteString getReferenceValueBytes();

    public String getStringValue();

    public ByteString getStringValueBytes();

    public Timestamp getTimestampValue();

    public Value.ValueTypeCase getValueTypeCase();

    public boolean hasArrayValue();

    public boolean hasGeoPointValue();

    public boolean hasMapValue();

    public boolean hasTimestampValue();
}

