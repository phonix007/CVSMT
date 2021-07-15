/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface OAuthRequirementsOrBuilder
extends MessageLiteOrBuilder {
    public String getCanonicalScopes();

    public ByteString getCanonicalScopesBytes();
}

