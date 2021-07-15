/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.AuthProvider
 *  com.google.api.AuthenticationRule
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthenticationRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationOrBuilder
extends MessageLiteOrBuilder {
    public AuthProvider getProviders(int var1);

    public int getProvidersCount();

    public List<AuthProvider> getProvidersList();

    public AuthenticationRule getRules(int var1);

    public int getRulesCount();

    public List<AuthenticationRule> getRulesList();
}

