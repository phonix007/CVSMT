/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.BackendRule
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface BackendOrBuilder
extends MessageLiteOrBuilder {
    public BackendRule getRules(int var1);

    public int getRulesCount();

    public List<BackendRule> getRulesList();
}

