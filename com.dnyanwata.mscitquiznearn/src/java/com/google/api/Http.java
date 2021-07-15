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

import com.google.api.Http;
import com.google.api.HttpOrBuilder;
import com.google.api.HttpRule;
import com.google.api.HttpRuleOrBuilder;
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

public final class Http
extends GeneratedMessageLite<Http, Builder>
implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE;
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser<Http> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private boolean fullyDecodeReservedExpansion_;
    private Internal.ProtobufList<HttpRule> rules_ = Http.emptyProtobufList();

    static {
        Http http;
        DEFAULT_INSTANCE = http = new Http();
        GeneratedMessageLite.registerDefaultInstance(Http.class, (GeneratedMessageLite)http);
    }

    private Http() {
    }

    private void addAllRules(Iterable<? extends HttpRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)httpRule);
    }

    private void addRules(HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)httpRule);
    }

    private void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    private void clearRules() {
        this.rules_ = Http.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<HttpRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Http http) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Http)Http.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)Http.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Http parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Http parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Http> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setFullyDecodeReservedExpansion(boolean bl) {
        this.fullyDecodeReservedExpansion_ = bl;
    }

    private void setRules(int n, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)httpRule);
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
                Parser<Http> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Http> class_ = Http.class;
                synchronized (Http.class) {
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
                Object[] arrobject = new Object[]{"rules_", HttpRule.class, "fullyDecodeReservedExpansion_"};
                return Http.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Http();
    }

    @Override
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    @Override
    public HttpRule getRules(int n) {
        return (HttpRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int n) {
        return (HttpRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Http, Builder>
    implements HttpOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
            this.copyOnWrite();
            ((Http)this.instance).addAllRules((Iterable<? extends HttpRule>)iterable);
            return this;
        }

        public Builder addRules(int n, HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(n, (HttpRule)builder.build());
            return this;
        }

        public Builder addRules(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(n, httpRule);
            return this;
        }

        public Builder addRules(HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).addRules((HttpRule)builder.build());
            return this;
        }

        public Builder addRules(HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(httpRule);
            return this;
        }

        public Builder clearFullyDecodeReservedExpansion() {
            this.copyOnWrite();
            ((Http)this.instance).clearFullyDecodeReservedExpansion();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Http)this.instance).clearRules();
            return this;
        }

        @Override
        public boolean getFullyDecodeReservedExpansion() {
            return ((Http)this.instance).getFullyDecodeReservedExpansion();
        }

        @Override
        public HttpRule getRules(int n) {
            return ((Http)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Http)this.instance).getRulesCount();
        }

        @Override
        public List<HttpRule> getRulesList() {
            return Collections.unmodifiableList(((Http)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Http)this.instance).removeRules(n);
            return this;
        }

        public Builder setFullyDecodeReservedExpansion(boolean bl) {
            this.copyOnWrite();
            ((Http)this.instance).setFullyDecodeReservedExpansion(bl);
            return this;
        }

        public Builder setRules(int n, HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).setRules(n, (HttpRule)builder.build());
            return this;
        }

        public Builder setRules(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).setRules(n, httpRule);
            return this;
        }
    }

}

