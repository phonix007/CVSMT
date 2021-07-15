/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.BackendRule
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.api.BackendRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BackendRuleOrBuilder
extends MessageLiteOrBuilder {
    public String getAddress();

    public ByteString getAddressBytes();

    public BackendRule.AuthenticationCase getAuthenticationCase();

    public double getDeadline();

    public boolean getDisableAuth();

    public String getJwtAudience();

    public ByteString getJwtAudienceBytes();

    public double getMinDeadline();

    public double getOperationDeadline();

    public BackendRule.PathTranslation getPathTranslation();

    public int getPathTranslationValue();

    public String getProtocol();

    public ByteString getProtocolBytes();

    public String getSelector();

    public ByteString getSelectorBytes();
}

