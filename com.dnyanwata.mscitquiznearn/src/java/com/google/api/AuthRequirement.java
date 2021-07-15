/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirementOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AuthRequirement
extends GeneratedMessageLite<AuthRequirement, Builder>
implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE;
    private static volatile Parser<AuthRequirement> PARSER;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_ = "";
    private String providerId_ = "";

    static {
        AuthRequirement authRequirement;
        DEFAULT_INSTANCE = authRequirement = new AuthRequirement();
        GeneratedMessageLite.registerDefaultInstance(AuthRequirement.class, (GeneratedMessageLite)authRequirement);
    }

    private AuthRequirement() {
    }

    private void clearAudiences() {
        this.audiences_ = AuthRequirement.getDefaultInstance().getAudiences();
    }

    private void clearProviderId() {
        this.providerId_ = AuthRequirement.getDefaultInstance().getProviderId();
    }

    public static AuthRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthRequirement authRequirement) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authRequirement);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement)AuthRequirement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)AuthRequirement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthRequirement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthRequirement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AuthRequirement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthRequirement parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthRequirement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAudiences(String string) {
        string.getClass();
        this.audiences_ = string;
    }

    private void setAudiencesBytes(ByteString byteString) {
        AuthRequirement.checkByteStringIsUtf8((ByteString)byteString);
        this.audiences_ = byteString.toStringUtf8();
    }

    private void setProviderId(String string) {
        string.getClass();
        this.providerId_ = string;
    }

    private void setProviderIdBytes(ByteString byteString) {
        AuthRequirement.checkByteStringIsUtf8((ByteString)byteString);
        this.providerId_ = byteString.toStringUtf8();
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
                Parser<AuthRequirement> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AuthRequirement> class_ = AuthRequirement.class;
                synchronized (AuthRequirement.class) {
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
                Object[] arrobject = new Object[]{"providerId_", "audiences_"};
                return AuthRequirement.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AuthRequirement();
    }

    @Override
    public String getAudiences() {
        return this.audiences_;
    }

    @Override
    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8((String)this.audiences_);
    }

    @Override
    public String getProviderId() {
        return this.providerId_;
    }

    @Override
    public ByteString getProviderIdBytes() {
        return ByteString.copyFromUtf8((String)this.providerId_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthRequirement, Builder>
    implements AuthRequirementOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAudiences() {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).clearAudiences();
            return this;
        }

        public Builder clearProviderId() {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).clearProviderId();
            return this;
        }

        @Override
        public String getAudiences() {
            return ((AuthRequirement)this.instance).getAudiences();
        }

        @Override
        public ByteString getAudiencesBytes() {
            return ((AuthRequirement)this.instance).getAudiencesBytes();
        }

        @Override
        public String getProviderId() {
            return ((AuthRequirement)this.instance).getProviderId();
        }

        @Override
        public ByteString getProviderIdBytes() {
            return ((AuthRequirement)this.instance).getProviderIdBytes();
        }

        public Builder setAudiences(String string) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setAudiences(string);
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setAudiencesBytes(byteString);
            return this;
        }

        public Builder setProviderId(String string) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setProviderId(string);
            return this;
        }

        public Builder setProviderIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setProviderIdBytes(byteString);
            return this;
        }
    }

}

