/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.SystemParameterRule
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.SystemParameterRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SystemParametersOrBuilder
extends MessageLiteOrBuilder {
    public SystemParameterRule getRules(int var1);

    public int getRulesCount();

    public List<SystemParameterRule> getRulesList();
}

