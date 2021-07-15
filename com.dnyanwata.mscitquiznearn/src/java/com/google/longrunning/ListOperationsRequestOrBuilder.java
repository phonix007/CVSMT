/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.longrunning;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface ListOperationsRequestOrBuilder
extends MessageLiteOrBuilder {
    public String getFilter();

    public ByteString getFilterBytes();

    public String getName();

    public ByteString getNameBytes();

    public int getPageSize();

    public String getPageToken();

    public ByteString getPageTokenBytes();
}

