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

import com.google.api.SystemParameter;
import com.google.api.SystemParameterOrBuilder;
import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRuleOrBuilder;
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

public final class SystemParameterRule
extends GeneratedMessageLite<SystemParameterRule, Builder>
implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser<SystemParameterRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameter> parameters_ = SystemParameterRule.emptyProtobufList();
    private String selector_ = "";

    static {
        SystemParameterRule systemParameterRule;
        DEFAULT_INSTANCE = systemParameterRule = new SystemParameterRule();
        GeneratedMessageLite.registerDefaultInstance(SystemParameterRule.class, (GeneratedMessageLite)systemParameterRule);
    }

    private SystemParameterRule() {
    }

    private void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        this.ensureParametersIsMutable();
        AbstractMessageLite.addAll(iterable, this.parameters_);
    }

    private void addParameters(int n, SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.add(n, (Object)systemParameter);
    }

    private void addParameters(SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.add((Object)systemParameter);
    }

    private void clearParameters() {
        this.parameters_ = SystemParameterRule.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = SystemParameterRule.getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        Internal.ProtobufList<SystemParameter> protobufList = this.parameters_;
        if (!protobufList.isModifiable()) {
            this.parameters_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(SystemParameterRule systemParameterRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule)SystemParameterRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)SystemParameterRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameterRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static SystemParameterRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameterRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameterRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeParameters(int n) {
        this.ensureParametersIsMutable();
        this.parameters_.remove(n);
    }

    private void setParameters(int n, SystemParameter systemParameter) {
        systemParameter.getClass();
        this.ensureParametersIsMutable();
        this.parameters_.set(n, (Object)systemParameter);
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        SystemParameterRule.checkByteStringIsUtf8((ByteString)byteString);
        this.selector_ = byteString.toStringUtf8();
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
                Parser<SystemParameterRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<SystemParameterRule> class_ = SystemParameterRule.class;
                synchronized (SystemParameterRule.class) {
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
                Object[] arrobject = new Object[]{"selector_", "parameters_", SystemParameter.class};
                return SystemParameterRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new SystemParameterRule();
    }

    @Override
    public SystemParameter getParameters(int n) {
        return (SystemParameter)this.parameters_.get(n);
    }

    @Override
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override
    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int n) {
        return (SystemParameterOrBuilder)this.parameters_.get(n);
    }

    public List<? extends SystemParameterOrBuilder> getParametersOrBuilderList() {
        return this.parameters_;
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameterRule, Builder>
    implements SystemParameterRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllParameters(Iterable<? extends SystemParameter> iterable) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addAllParameters((Iterable<? extends SystemParameter>)iterable);
            return this;
        }

        public Builder addParameters(int n, SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(n, (SystemParameter)builder.build());
            return this;
        }

        public Builder addParameters(int n, SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(n, systemParameter);
            return this;
        }

        public Builder addParameters(SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters((SystemParameter)builder.build());
            return this;
        }

        public Builder addParameters(SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(systemParameter);
            return this;
        }

        public Builder clearParameters() {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).clearParameters();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public SystemParameter getParameters(int n) {
            return ((SystemParameterRule)this.instance).getParameters(n);
        }

        @Override
        public int getParametersCount() {
            return ((SystemParameterRule)this.instance).getParametersCount();
        }

        @Override
        public List<SystemParameter> getParametersList() {
            return Collections.unmodifiableList(((SystemParameterRule)this.instance).getParametersList());
        }

        @Override
        public String getSelector() {
            return ((SystemParameterRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((SystemParameterRule)this.instance).getSelectorBytes();
        }

        public Builder removeParameters(int n) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).removeParameters(n);
            return this;
        }

        public Builder setParameters(int n, SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setParameters(n, (SystemParameter)builder.build());
            return this;
        }

        public Builder setParameters(int n, SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setParameters(n, systemParameter);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

