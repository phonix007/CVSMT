/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.ContextRule
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.ContextRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ContextOrBuilder
extends MessageLiteOrBuilder {
    public ContextRule getRules(int var1);

    public int getRulesCount();

    public List<ContextRule> getRulesList();
}

