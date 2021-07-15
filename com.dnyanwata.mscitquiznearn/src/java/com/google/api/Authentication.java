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

import com.google.api.AuthProvider;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.Authentication;
import com.google.api.AuthenticationOrBuilder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRuleOrBuilder;
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

public final class Authentication
extends GeneratedMessageLite<Authentication, Builder>
implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE;
    private static volatile Parser<Authentication> PARSER;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthProvider> providers_ = Authentication.emptyProtobufList();
    private Internal.ProtobufList<AuthenticationRule> rules_ = Authentication.emptyProtobufList();

    static {
        Authentication authentication;
        DEFAULT_INSTANCE = authentication = new Authentication();
        GeneratedMessageLite.registerDefaultInstance(Authentication.class, (GeneratedMessageLite)authentication);
    }

    private Authentication() {
    }

    private void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        this.ensureProvidersIsMutable();
        AbstractMessageLite.addAll(iterable, this.providers_);
    }

    private void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addProviders(int n, AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.add(n, (Object)authProvider);
    }

    private void addProviders(AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.add((Object)authProvider);
    }

    private void addRules(int n, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)authenticationRule);
    }

    private void addRules(AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)authenticationRule);
    }

    private void clearProviders() {
        this.providers_ = Authentication.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Authentication.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        Internal.ProtobufList<AuthProvider> protobufList = this.providers_;
        if (!protobufList.isModifiable()) {
            this.providers_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<AuthenticationRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Authentication authentication) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication)Authentication.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)Authentication.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Authentication parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Authentication parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProviders(int n) {
        this.ensureProvidersIsMutable();
        this.providers_.remove(n);
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setProviders(int n, AuthProvider authProvider) {
        authProvider.getClass();
        this.ensureProvidersIsMutable();
        this.providers_.set(n, (Object)authProvider);
    }

    private void setRules(int n, AuthenticationRule authenticationRule) {
        authenticationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)authenticationRule);
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
                Parser<Authentication> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Authentication> class_ = Authentication.class;
                synchronized (Authentication.class) {
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
                Object[] arrobject = new Object[]{"rules_", AuthenticationRule.class, "providers_", AuthProvider.class};
                return Authentication.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Authentication();
    }

    @Override
    public AuthProvider getProviders(int n) {
        return (AuthProvider)this.providers_.get(n);
    }

    @Override
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override
    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int n) {
        return (AuthProviderOrBuilder)this.providers_.get(n);
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override
    public AuthenticationRule getRules(int n) {
        return (AuthenticationRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int n) {
        return (AuthenticationRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Authentication, Builder>
    implements AuthenticationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
            this.copyOnWrite();
            ((Authentication)this.instance).addAllProviders((Iterable<? extends AuthProvider>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
            this.copyOnWrite();
            ((Authentication)this.instance).addAllRules((Iterable<? extends AuthenticationRule>)iterable);
            return this;
        }

        public Builder addProviders(int n, AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(n, (AuthProvider)builder.build());
            return this;
        }

        public Builder addProviders(int n, AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(n, authProvider);
            return this;
        }

        public Builder addProviders(AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders((AuthProvider)builder.build());
            return this;
        }

        public Builder addProviders(AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(authProvider);
            return this;
        }

        public Builder addRules(int n, AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(n, (AuthenticationRule)builder.build());
            return this;
        }

        public Builder addRules(int n, AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(n, authenticationRule);
            return this;
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules((AuthenticationRule)builder.build());
            return this;
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(authenticationRule);
            return this;
        }

        public Builder clearProviders() {
            this.copyOnWrite();
            ((Authentication)this.instance).clearProviders();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Authentication)this.instance).clearRules();
            return this;
        }

        @Override
        public AuthProvider getProviders(int n) {
            return ((Authentication)this.instance).getProviders(n);
        }

        @Override
        public int getProvidersCount() {
            return ((Authentication)this.instance).getProvidersCount();
        }

        @Override
        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication)this.instance).getProvidersList());
        }

        @Override
        public AuthenticationRule getRules(int n) {
            return ((Authentication)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Authentication)this.instance).getRulesCount();
        }

        @Override
        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication)this.instance).getRulesList());
        }

        public Builder removeProviders(int n) {
            this.copyOnWrite();
            ((Authentication)this.instance).removeProviders(n);
            return this;
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Authentication)this.instance).removeRules(n);
            return this;
        }

        public Builder setProviders(int n, AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).setProviders(n, (AuthProvider)builder.build());
            return this;
        }

        public Builder setProviders(int n, AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).setProviders(n, authProvider);
            return this;
        }

        public Builder setRules(int n, AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).setRules(n, (AuthenticationRule)builder.build());
            return this;
        }

        public Builder setRules(int n, AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).setRules(n, authenticationRule);
            return this;
        }
    }

}

