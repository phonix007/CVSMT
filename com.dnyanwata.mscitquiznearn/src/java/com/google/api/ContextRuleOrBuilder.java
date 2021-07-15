/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ContextRuleOrBuilder
extends MessageLiteOrBuilder {
    public String getAllowedRequestExtensions(int var1);

    public ByteString getAllowedRequestExtensionsBytes(int var1);

    public int getAllowedRequestExtensionsCount();

    public List<String> getAllowedRequestExtensionsList();

    public String getAllowedResponseExtensions(int var1);

    public ByteString getAllowedResponseExtensionsBytes(int var1);

    public int getAllowedResponseExtensionsCount();

    public List<String> getAllowedResponseExtensionsList();

    public String getProvided(int var1);

    public ByteString getProvidedBytes(int var1);

    public int getProvidedCount();

    public List<String> getProvidedList();

    public String getRequested(int var1);

    public ByteString getRequestedBytes(int var1);

    public int getRequestedCount();

    public List<String> getRequestedList();

    public String getSelector();

    public ByteString getSelectorBytes();
}

