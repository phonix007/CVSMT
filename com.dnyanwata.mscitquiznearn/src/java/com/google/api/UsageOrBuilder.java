/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.UsageRule
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.UsageRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface UsageOrBuilder
extends MessageLiteOrBuilder {
    public String getProducerNotificationChannel();

    public ByteString getProducerNotificationChannelBytes();

    public String getRequirements(int var1);

    public ByteString getRequirementsBytes(int var1);

    public int getRequirementsCount();

    public List<String> getRequirementsList();

    public UsageRule getRules(int var1);

    public int getRulesCount();

    public List<UsageRule> getRulesList();
}

