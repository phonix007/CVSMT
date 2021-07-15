/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListenRequest
 *  com.google.firestore.v1.Target
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

public interface ListenRequestOrBuilder
extends MessageLiteOrBuilder {
    public boolean containsLabels(String var1);

    public Target getAddTarget();

    public String getDatabase();

    public ByteString getDatabaseBytes();

    @Deprecated
    public Map<String, String> getLabels();

    public int getLabelsCount();

    public Map<String, String> getLabelsMap();

    public String getLabelsOrDefault(String var1, String var2);

    public String getLabelsOrThrow(String var1);

    public int getRemoveTarget();

    public ListenRequest.TargetChangeCase getTargetChangeCase();

    public boolean hasAddTarget();
}

