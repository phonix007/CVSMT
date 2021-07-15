/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.MetricRule;
import com.google.api.MetricRuleOrBuilder;
import com.google.api.Quota;
import com.google.api.QuotaLimit;
import com.google.api.QuotaLimitOrBuilder;
import com.google.api.QuotaOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Quota
extends GeneratedMessageLite<Quota, Builder>
implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_ = Quota.emptyProtobufList();
    private Internal.ProtobufList<MetricRule> metricRules_ = Quota.emptyProtobufList();

    static {
        Quota quota;
        DEFAULT_INSTANCE = quota = new Quota();
        GeneratedMessageLite.registerDefaultInstance(Quota.class, (GeneratedMessageLite)quota);
    }

    private Quota() {
    }

    private void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        this.ensureLimitsIsMutable();
        AbstractMessageLite.addAll(iterable, this.limits_);
    }

    private void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        this.ensureMetricRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.metricRules_);
    }

    private void addLimits(int n, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.add(n, (Object)quotaLimit);
    }

    private void addLimits(QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.add((Object)quotaLimit);
    }

    private void addMetricRules(int n, MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add(n, (Object)metricRule);
    }

    private void addMetricRules(MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add((Object)metricRule);
    }

    private void clearLimits() {
        this.limits_ = Quota.emptyProtobufList();
    }

    private void clearMetricRules() {
        this.metricRules_ = Quota.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        Internal.ProtobufList<QuotaLimit> protobufList = this.limits_;
        if (!protobufList.isModifiable()) {
            this.limits_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureMetricRulesIsMutable() {
        Internal.ProtobufList<MetricRule> protobufList = this.metricRules_;
        if (!protobufList.isModifiable()) {
            this.metricRules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Quota quota) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota)Quota.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)Quota.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Quota parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Quota parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLimits(int n) {
        this.ensureLimitsIsMutable();
        this.limits_.remove(n);
    }

    private void removeMetricRules(int n) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.remove(n);
    }

    private void setLimits(int n, QuotaLimit quotaLimit) {
        quotaLimit.getClass();
        this.ensureLimitsIsMutable();
        this.limits_.set(n, (Object)quotaLimit);
    }

    private void setMetricRules(int n, MetricRule metricRule) {
        metricRule.getClass();
        this.ensureMetricRulesIsMutable();
        this.metricRules_.set(n, (Object)metricRule);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                Parser<Quota> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Quota> class_ = Quota.class;
                synchronized (Quota.class) {
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                    }
                    // ** MonitorExit[var8_5] (shouldn't be in output)
                    return defaultInstanceBasedParser;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                Object[] arrobject = new Object[]{"limits_", QuotaLimit.class, "metricRules_", MetricRule.class};
                return Quota.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Quota();
    }

    @Override
    public QuotaLimit getLimits(int n) {
        return (QuotaLimit)this.limits_.get(n);
    }

    @Override
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int n) {
        return (QuotaLimitOrBuilder)this.limits_.get(n);
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override
    public MetricRule getMetricRules(int n) {
        return (MetricRule)this.metricRules_.get(n);
    }

    @Override
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int n) {
        return (MetricRuleOrBuilder)this.metricRules_.get(n);
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Quota, Builder>
    implements QuotaOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            this.copyOnWrite();
            ((Quota)this.instance).addAllLimits((Iterable<? extends QuotaLimit>)iterable);
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            this.copyOnWrite();
            ((Quota)this.instance).addAllMetricRules((Iterable<? extends MetricRule>)iterable);
            return this;
        }

        public Builder addLimits(int n, QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(n, (QuotaLimit)builder.build());
            return this;
        }

        public Builder addLimits(int n, QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(n, quotaLimit);
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits((QuotaLimit)builder.build());
            return this;
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(quotaLimit);
            return this;
        }

        public Builder addMetricRules(int n, MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(n, (MetricRule)builder.build());
            return this;
        }

        public Builder addMetricRules(int n, MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(n, metricRule);
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules((MetricRule)builder.build());
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(metricRule);
            return this;
        }

        public Builder clearLimits() {
            this.copyOnWrite();
            ((Quota)this.instance).clearLimits();
            return this;
        }

        public Builder clearMetricRules() {
            this.copyOnWrite();
            ((Quota)this.instance).clearMetricRules();
            return this;
        }

        @Override
        public QuotaLimit getLimits(int n) {
            return ((Quota)this.instance).getLimits(n);
        }

        @Override
        public int getLimitsCount() {
            return ((Quota)this.instance).getLimitsCount();
        }

        @Override
        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota)this.instance).getLimitsList());
        }

        @Override
        public MetricRule getMetricRules(int n) {
            return ((Quota)this.instance).getMetricRules(n);
        }

        @Override
        public int getMetricRulesCount() {
            return ((Quota)this.instance).getMetricRulesCount();
        }

        @Override
        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota)this.instance).getMetricRulesList());
        }

        public Builder removeLimits(int n) {
            this.copyOnWrite();
            ((Quota)this.instance).removeLimits(n);
            return this;
        }

        public Builder removeMetricRules(int n) {
            this.copyOnWrite();
            ((Quota)this.instance).removeMetricRules(n);
            return this;
        }

        public Builder setLimits(int n, QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).setLimits(n, (QuotaLimit)builder.build());
            return this;
        }

        public Builder setLimits(int n, QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).setLimits(n, quotaLimit);
            return this;
        }

        public Builder setMetricRules(int n, MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).setMetricRules(n, (MetricRule)builder.build());
            return this;
        }

        public Builder setMetricRules(int n, MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).setMetricRules(n, metricRule);
            return this;
        }
    }

}

