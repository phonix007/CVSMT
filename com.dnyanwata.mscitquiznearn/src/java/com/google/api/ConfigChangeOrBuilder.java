/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Advice
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.Advice;
import com.google.api.ChangeType;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ConfigChangeOrBuilder
extends MessageLiteOrBuilder {
    public Advice getAdvices(int var1);

    public int getAdvicesCount();

    public List<Advice> getAdvicesList();

    public ChangeType getChangeType();

    public int getChangeTypeValue();

    public String getElement();

    public ByteString getElementBytes();

    public String getNewValue();

    public ByteString getNewValueBytes();

    public String getOldValue();

    public ByteString getOldValueBytes();
}

