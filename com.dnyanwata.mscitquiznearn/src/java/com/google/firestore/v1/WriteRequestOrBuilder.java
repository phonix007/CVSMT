/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

public interface WriteRequestOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsLabels(String var1);

    public String getDatabase();

    public ByteString getDatabaseBytes();

    @Deprecated
    public Map<String, String> getLabels();

    public int getLabelsCount();

    public Map<String, String> getLabelsMap();

    public String getLabelsOrDefault(String var1, String var2);

    public String getLabelsOrThrow(String var1);

    public String getStreamId();

    public ByteString getStreamIdBytes();

    public ByteString getStreamToken();

    public Write getWrites(int var1);

    public int getWritesCount();

    public List<Write> getWritesList();
}

