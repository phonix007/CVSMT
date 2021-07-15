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

import com.google.api.Backend;
import com.google.api.BackendOrBuilder;
import com.google.api.BackendRule;
import com.google.api.BackendRuleOrBuilder;
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

public final class Backend
extends GeneratedMessageLite<Backend, Builder>
implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE;
    private static volatile Parser<Backend> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BackendRule> rules_ = Backend.emptyProtobufList();

    static {
        Backend backend;
        DEFAULT_INSTANCE = backend = new Backend();
        GeneratedMessageLite.registerDefaultInstance(Backend.class, (GeneratedMessageLite)backend);
    }

    private Backend() {
    }

    private void addAllRules(Iterable<? extends BackendRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)backendRule);
    }

    private void addRules(BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)backendRule);
    }

    private void clearRules() {
        this.rules_ = Backend.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<BackendRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Backend backend) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)backend);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Backend)Backend.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)Backend.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Backend parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Backend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setRules(int n, BackendRule backendRule) {
        backendRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)backendRule);
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
                Parser<Backend> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Backend> class_ = Backend.class;
                synchronized (Backend.class) {
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
                Object[] arrobject = new Object[]{"rules_", BackendRule.class};
                return Backend.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Backend();
    }

    @Override
    public BackendRule getRules(int n) {
        return (BackendRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int n) {
        return (BackendRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Backend, Builder>
    implements BackendOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
            this.copyOnWrite();
            ((Backend)this.instance).addAllRules((Iterable<? extends BackendRule>)iterable);
            return this;
        }

        public Builder addRules(int n, BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(n, (BackendRule)builder.build());
            return this;
        }

        public Builder addRules(int n, BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(n, backendRule);
            return this;
        }

        public Builder addRules(BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules((BackendRule)builder.build());
            return this;
        }

        public Builder addRules(BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(backendRule);
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Backend)this.instance).clearRules();
            return this;
        }

        @Override
        public BackendRule getRules(int n) {
            return ((Backend)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Backend)this.instance).getRulesCount();
        }

        @Override
        public List<BackendRule> getRulesList() {
            return Collections.unmodifiableList(((Backend)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Backend)this.instance).removeRules(n);
            return this;
        }

        public Builder setRules(int n, BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).setRules(n, (BackendRule)builder.build());
            return this;
        }

        public Builder setRules(int n, BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).setRules(n, backendRule);
            return this;
        }
    }

}

