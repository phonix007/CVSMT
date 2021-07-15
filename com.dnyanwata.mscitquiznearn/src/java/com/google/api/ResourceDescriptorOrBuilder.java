/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.ResourceDescriptor
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.ResourceDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ResourceDescriptorOrBuilder
extends MessageLiteOrBuilder {
    public ResourceDescriptor.History getHistory();

    public int getHistoryValue();

    public String getNameField();

    public ByteString getNameFieldBytes();

    public String getPattern(int var1);

    public ByteString getPatternBytes(int var1);

    public int getPatternCount();

    public List<String> getPatternList();

    public String getPlural();

    public ByteString getPluralBytes();

    public String getSingular();

    public ByteString getSingularBytes();

    public String getType();

    public ByteString getTypeBytes();
}

