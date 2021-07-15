/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DebugInfoOrBuilder
extends MessageLiteOrBuilder {
    public String getDetail();

    public ByteString getDetailBytes();

    public String getStackEntries(int var1);

    public ByteString getStackEntriesBytes(int var1);

    public int getStackEntriesCount();

    public List<String> getStackEntriesList();
}

