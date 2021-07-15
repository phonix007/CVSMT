/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.MetricRule
 *  com.google.api.QuotaLimit
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.QuotaLimit;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface QuotaOrBuilder
extends MessageLiteOrBuilder {
    public QuotaLimit getLimits(int var1);

    public int getLimitsCount();

    public List<QuotaLimit> getLimitsList();

    public MetricRule getMetricRules(int var1);

    public int getMetricRulesCount();

    public List<MetricRule> getMetricRulesList();
}

