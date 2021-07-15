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
package com.google.firestore.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentMaskOrBuilder
extends MessageLiteOrBuilder {
    public String getFieldPaths(int var1);

    public ByteString getFieldPathsBytes(int var1);

    public int getFieldPathsCount();

    public List<String> getFieldPathsList();
}

