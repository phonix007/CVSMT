/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.JwtLocation
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface JwtLocationOrBuilder
extends MessageLiteOrBuilder {
    public String getHeader();

    public ByteString getHeaderBytes();

    public JwtLocation.InCase getInCase();

    public String getQuery();

    public ByteString getQueryBytes();

    public String getValuePrefix();

    public ByteString getValuePrefixBytes();
}

