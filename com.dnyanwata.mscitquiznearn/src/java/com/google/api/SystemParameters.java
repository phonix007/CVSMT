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

import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRuleOrBuilder;
import com.google.api.SystemParameters;
import com.google.api.SystemParametersOrBuilder;
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

public final class SystemParameters
extends GeneratedMessageLite<SystemParameters, Builder>
implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE;
    private static volatile Parser<SystemParameters> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameterRule> rules_ = SystemParameters.emptyProtobufList();

    static {
        SystemParameters systemParameters;
        DEFAULT_INSTANCE = systemParameters = new SystemParameters();
        GeneratedMessageLite.registerDefaultInstance(SystemParameters.class, (GeneratedMessageLite)systemParameters);
    }

    private SystemParameters() {
    }

    private void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)systemParameterRule);
    }

    private void addRules(SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)systemParameterRule);
    }

    private void clearRules() {
        this.rules_ = SystemParameters.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<SystemParameterRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(SystemParameters systemParameters) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameters)SystemParameters.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)SystemParameters.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static SystemParameters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameters parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setRules(int n, SystemParameterRule systemParameterRule) {
        systemParameterRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)systemParameterRule);
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
                Parser<SystemParameters> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<SystemParameters> class_ = SystemParameters.class;
                synchronized (SystemParameters.class) {
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
                Object[] arrobject = new Object[]{"rules_", SystemParameterRule.class};
                return SystemParameters.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new SystemParameters();
    }

    @Override
    public SystemParameterRule getRules(int n) {
        return (SystemParameterRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public SystemParameterRuleOrBuilder getRulesOrBuilder(int n) {
        return (SystemParameterRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends SystemParameterRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameters, Builder>
    implements SystemParametersOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends SystemParameterRule> iterable) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addAllRules((Iterable<? extends SystemParameterRule>)iterable);
            return this;
        }

        public Builder addRules(int n, SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(n, (SystemParameterRule)builder.build());
            return this;
        }

        public Builder addRules(int n, SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(n, systemParameterRule);
            return this;
        }

        public Builder addRules(SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules((SystemParameterRule)builder.build());
            return this;
        }

        public Builder addRules(SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(systemParameterRule);
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((SystemParameters)this.instance).clearRules();
            return this;
        }

        @Override
        public SystemParameterRule getRules(int n) {
            return ((SystemParameters)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((SystemParameters)this.instance).getRulesCount();
        }

        @Override
        public List<SystemParameterRule> getRulesList() {
            return Collections.unmodifiableList(((SystemParameters)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).removeRules(n);
            return this;
        }

        public Builder setRules(int n, SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).setRules(n, (SystemParameterRule)builder.build());
            return this;
        }

        public Builder setRules(int n, SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).setRules(n, systemParameterRule);
            return this;
        }
    }

}

