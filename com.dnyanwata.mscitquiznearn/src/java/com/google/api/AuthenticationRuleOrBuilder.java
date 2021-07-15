/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.AuthRequirement
 *  com.google.api.OAuthRequirements
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.OAuthRequirements;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface AuthenticationRuleOrBuilder
extends MessageLiteOrBuilder {
    public boolean getAllowWithoutCredential();

    public OAuthRequirements getOauth();

    public AuthRequirement getRequirements(int var1);

    public int getRequirementsCount();

    public List<AuthRequirement> getRequirementsList();

    public String getSelector();

    public ByteString getSelectorBytes();

    public boolean hasOauth();
}

