/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.HttpRule
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface HttpOrBuilder
extends MessageLiteOrBuilder {
    public boolean getFullyDecodeReservedExpansion();

    public HttpRule getRules(int var1);

    public int getRulesCount();

    public List<HttpRule> getRulesList();
}

