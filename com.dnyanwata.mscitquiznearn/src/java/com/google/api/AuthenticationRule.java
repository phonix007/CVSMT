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

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirementOrBuilder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRuleOrBuilder;
import com.google.api.OAuthRequirements;
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

public final class AuthenticationRule
extends GeneratedMessageLite<AuthenticationRule, Builder>
implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE;
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser<AuthenticationRule> PARSER;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private OAuthRequirements oauth_;
    private Internal.ProtobufList<AuthRequirement> requirements_ = AuthenticationRule.emptyProtobufList();
    private String selector_ = "";

    static {
        AuthenticationRule authenticationRule;
        DEFAULT_INSTANCE = authenticationRule = new AuthenticationRule();
        GeneratedMessageLite.registerDefaultInstance(AuthenticationRule.class, (GeneratedMessageLite)authenticationRule);
    }

    private AuthenticationRule() {
    }

    private void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        this.ensureRequirementsIsMutable();
        AbstractMessageLite.addAll(iterable, this.requirements_);
    }

    private void addRequirements(int n, AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add(n, (Object)authRequirement);
    }

    private void addRequirements(AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add((Object)authRequirement);
    }

    private void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    private void clearOauth() {
        this.oauth_ = null;
    }

    private void clearRequirements() {
        this.requirements_ = AuthenticationRule.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = AuthenticationRule.getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        Internal.ProtobufList<AuthRequirement> protobufList = this.requirements_;
        if (!protobufList.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 != null && oAuthRequirements2 != OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = (OAuthRequirements)((OAuthRequirements.Builder)OAuthRequirements.newBuilder(this.oauth_).mergeFrom((GeneratedMessageLite)oAuthRequirements)).buildPartial();
            return;
        }
        this.oauth_ = oAuthRequirements;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthenticationRule authenticationRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule)AuthenticationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)AuthenticationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthenticationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AuthenticationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthenticationRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthenticationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRequirements(int n) {
        this.ensureRequirementsIsMutable();
        this.requirements_.remove(n);
    }

    private void setAllowWithoutCredential(boolean bl) {
        this.allowWithoutCredential_ = bl;
    }

    private void setOauth(OAuthRequirements oAuthRequirements) {
        oAuthRequirements.getClass();
        this.oauth_ = oAuthRequirements;
    }

    private void setRequirements(int n, AuthRequirement authRequirement) {
        authRequirement.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.set(n, (Object)authRequirement);
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        AuthenticationRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<AuthenticationRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AuthenticationRule> class_ = AuthenticationRule.class;
                synchronized (AuthenticationRule.class) {
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
                Object[] arrobject = new Object[]{"selector_", "oauth_", "allowWithoutCredential_", "requirements_", AuthRequirement.class};
                return AuthenticationRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\u0208\u0002\t\u0005\u0007\u0007\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AuthenticationRule();
    }

    @Override
    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    @Override
    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        if (oAuthRequirements == null) {
            oAuthRequirements = OAuthRequirements.getDefaultInstance();
        }
        return oAuthRequirements;
    }

    @Override
    public AuthRequirement getRequirements(int n) {
        return (AuthRequirement)this.requirements_.get(n);
    }

    @Override
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override
    public List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public AuthRequirementOrBuilder getRequirementsOrBuilder(int n) {
        return (AuthRequirementOrBuilder)this.requirements_.get(n);
    }

    public List<? extends AuthRequirementOrBuilder> getRequirementsOrBuilderList() {
        return this.requirements_;
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    @Override
    public boolean hasOauth() {
        return this.oauth_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthenticationRule, Builder>
    implements AuthenticationRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addAllRequirements((Iterable<? extends AuthRequirement>)iterable);
            return this;
        }

        public Builder addRequirements(int n, AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(n, (AuthRequirement)builder.build());
            return this;
        }

        public Builder addRequirements(int n, AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(n, authRequirement);
            return this;
        }

        public Builder addRequirements(AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements((AuthRequirement)builder.build());
            return this;
        }

        public Builder addRequirements(AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(authRequirement);
            return this;
        }

        public Builder clearAllowWithoutCredential() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearAllowWithoutCredential();
            return this;
        }

        public Builder clearOauth() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearOauth();
            return this;
        }

        public Builder clearRequirements() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearRequirements();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public boolean getAllowWithoutCredential() {
            return ((AuthenticationRule)this.instance).getAllowWithoutCredential();
        }

        @Override
        public OAuthRequirements getOauth() {
            return ((AuthenticationRule)this.instance).getOauth();
        }

        @Override
        public AuthRequirement getRequirements(int n) {
            return ((AuthenticationRule)this.instance).getRequirements(n);
        }

        @Override
        public int getRequirementsCount() {
            return ((AuthenticationRule)this.instance).getRequirementsCount();
        }

        @Override
        public List<AuthRequirement> getRequirementsList() {
            return Collections.unmodifiableList(((AuthenticationRule)this.instance).getRequirementsList());
        }

        @Override
        public String getSelector() {
            return ((AuthenticationRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((AuthenticationRule)this.instance).getSelectorBytes();
        }

        @Override
        public boolean hasOauth() {
            return ((AuthenticationRule)this.instance).hasOauth();
        }

        public Builder mergeOauth(OAuthRequirements oAuthRequirements) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).mergeOauth(oAuthRequirements);
            return this;
        }

        public Builder removeRequirements(int n) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).removeRequirements(n);
            return this;
        }

        public Builder setAllowWithoutCredential(boolean bl) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setAllowWithoutCredential(bl);
            return this;
        }

        public Builder setOauth(OAuthRequirements.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setOauth((OAuthRequirements)builder.build());
            return this;
        }

        public Builder setOauth(OAuthRequirements oAuthRequirements) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setOauth(oAuthRequirements);
            return this;
        }

        public Builder setRequirements(int n, AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setRequirements(n, (AuthRequirement)builder.build());
            return this;
        }

        public Builder setRequirements(int n, AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setRequirements(n, authRequirement);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

