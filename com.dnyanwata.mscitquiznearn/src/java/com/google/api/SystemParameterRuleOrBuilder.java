/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.SystemParameter
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.SystemParameter;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SystemParameterRuleOrBuilder
extends MessageLiteOrBuilder {
    public SystemParameter getParameters(int var1);

    public int getParametersCount();

    public List<SystemParameter> getParametersList();

    public String getSelector();

    public ByteString getSelectorBytes();
}

