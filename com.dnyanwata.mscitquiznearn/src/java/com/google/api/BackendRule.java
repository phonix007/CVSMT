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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.BackendRule;
import com.google.api.BackendRuleOrBuilder;
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

public final class BackendRule
extends GeneratedMessageLite<BackendRule, Builder>
implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser<BackendRule> PARSER;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_ = "";
    private int authenticationCase_ = 0;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_ = "";
    private String selector_ = "";

    static {
        BackendRule backendRule;
        DEFAULT_INSTANCE = backendRule = new BackendRule();
        GeneratedMessageLite.registerDefaultInstance(BackendRule.class, (GeneratedMessageLite)backendRule);
    }

    private BackendRule() {
    }

    private void clearAddress() {
        this.address_ = BackendRule.getDefaultInstance().getAddress();
    }

    private void clearAuthentication() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    private void clearDeadline() {
        this.deadline_ = 0.0;
    }

    private void clearDisableAuth() {
        if (this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    private void clearJwtAudience() {
        if (this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    private void clearMinDeadline() {
        this.minDeadline_ = 0.0;
    }

    private void clearOperationDeadline() {
        this.operationDeadline_ = 0.0;
    }

    private void clearPathTranslation() {
        this.pathTranslation_ = 0;
    }

    private void clearProtocol() {
        this.protocol_ = BackendRule.getDefaultInstance().getProtocol();
    }

    private void clearSelector() {
        this.selector_ = BackendRule.getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BackendRule backendRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackendRule)BackendRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)BackendRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BackendRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BackendRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BackendRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BackendRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddress(String string) {
        string.getClass();
        this.address_ = string;
    }

    private void setAddressBytes(ByteString byteString) {
        BackendRule.checkByteStringIsUtf8((ByteString)byteString);
        this.address_ = byteString.toStringUtf8();
    }

    private void setDeadline(double d) {
        this.deadline_ = d;
    }

    private void setDisableAuth(boolean bl) {
        this.authenticationCase_ = 8;
        this.authentication_ = bl;
    }

    private void setJwtAudience(String string) {
        string.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = string;
    }

    private void setJwtAudienceBytes(ByteString byteString) {
        BackendRule.checkByteStringIsUtf8((ByteString)byteString);
        this.authentication_ = byteString.toStringUtf8();
        this.authenticationCase_ = 7;
    }

    private void setMinDeadline(double d) {
        this.minDeadline_ = d;
    }

    private void setOperationDeadline(double d) {
        this.operationDeadline_ = d;
    }

    private void setPathTranslation(PathTranslation pathTranslation) {
        this.pathTranslation_ = pathTranslation.getNumber();
    }

    private void setPathTranslationValue(int n) {
        this.pathTranslation_ = n;
    }

    private void setProtocol(String string) {
        string.getClass();
        this.protocol_ = string;
    }

    private void setProtocolBytes(ByteString byteString) {
        BackendRule.checkByteStringIsUtf8((ByteString)byteString);
        this.protocol_ = byteString.toStringUtf8();
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        BackendRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<BackendRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BackendRule> class_ = BackendRule.class;
                synchronized (BackendRule.class) {
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
                Object[] arrobject = new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"};
                return BackendRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007\u023b\u0000\b:\u0000\t\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BackendRule();
    }

    @Override
    public String getAddress() {
        return this.address_;
    }

    @Override
    public ByteString getAddressBytes() {
        return ByteString.copyFromUtf8((String)this.address_);
    }

    @Override
    public AuthenticationCase getAuthenticationCase() {
        return AuthenticationCase.forNumber(this.authenticationCase_);
    }

    @Override
    public double getDeadline() {
        return this.deadline_;
    }

    @Override
    public boolean getDisableAuth() {
        if (this.authenticationCase_ == 8) {
            return (Boolean)this.authentication_;
        }
        return false;
    }

    @Override
    public String getJwtAudience() {
        if (this.authenticationCase_ == 7) {
            return (String)this.authentication_;
        }
        return "";
    }

    @Override
    public ByteString getJwtAudienceBytes() {
        String string = this.authenticationCase_ == 7 ? (String)this.authentication_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public double getMinDeadline() {
        return this.minDeadline_;
    }

    @Override
    public double getOperationDeadline() {
        return this.operationDeadline_;
    }

    @Override
    public PathTranslation getPathTranslation() {
        PathTranslation pathTranslation = PathTranslation.forNumber(this.pathTranslation_);
        if (pathTranslation == null) {
            pathTranslation = PathTranslation.UNRECOGNIZED;
        }
        return pathTranslation;
    }

    @Override
    public int getPathTranslationValue() {
        return this.pathTranslation_;
    }

    @Override
    public String getProtocol() {
        return this.protocol_;
    }

    @Override
    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8((String)this.protocol_);
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
    extends GeneratedMessageLite.Builder<BackendRule, Builder>
    implements BackendRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearAddress();
            return this;
        }

        public Builder clearAuthentication() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearAuthentication();
            return this;
        }

        public Builder clearDeadline() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearDeadline();
            return this;
        }

        public Builder clearDisableAuth() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearDisableAuth();
            return this;
        }

        public Builder clearJwtAudience() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearJwtAudience();
            return this;
        }

        public Builder clearMinDeadline() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearMinDeadline();
            return this;
        }

        public Builder clearOperationDeadline() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearOperationDeadline();
            return this;
        }

        public Builder clearPathTranslation() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearPathTranslation();
            return this;
        }

        public Builder clearProtocol() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearProtocol();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getAddress() {
            return ((BackendRule)this.instance).getAddress();
        }

        @Override
        public ByteString getAddressBytes() {
            return ((BackendRule)this.instance).getAddressBytes();
        }

        @Override
        public AuthenticationCase getAuthenticationCase() {
            return ((BackendRule)this.instance).getAuthenticationCase();
        }

        @Override
        public double getDeadline() {
            return ((BackendRule)this.instance).getDeadline();
        }

        @Override
        public boolean getDisableAuth() {
            return ((BackendRule)this.instance).getDisableAuth();
        }

        @Override
        public String getJwtAudience() {
            return ((BackendRule)this.instance).getJwtAudience();
        }

        @Override
        public ByteString getJwtAudienceBytes() {
            return ((BackendRule)this.instance).getJwtAudienceBytes();
        }

        @Override
        public double getMinDeadline() {
            return ((BackendRule)this.instance).getMinDeadline();
        }

        @Override
        public double getOperationDeadline() {
            return ((BackendRule)this.instance).getOperationDeadline();
        }

        @Override
        public PathTranslation getPathTranslation() {
            return ((BackendRule)this.instance).getPathTranslation();
        }

        @Override
        public int getPathTranslationValue() {
            return ((BackendRule)this.instance).getPathTranslationValue();
        }

        @Override
        public String getProtocol() {
            return ((BackendRule)this.instance).getProtocol();
        }

        @Override
        public ByteString getProtocolBytes() {
            return ((BackendRule)this.instance).getProtocolBytes();
        }

        @Override
        public String getSelector() {
            return ((BackendRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((BackendRule)this.instance).getSelectorBytes();
        }

        public Builder setAddress(String string) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setAddress(string);
            return this;
        }

        public Builder setAddressBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setAddressBytes(byteString);
            return this;
        }

        public Builder setDeadline(double d) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setDeadline(d);
            return this;
        }

        public Builder setDisableAuth(boolean bl) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setDisableAuth(bl);
            return this;
        }

        public Builder setJwtAudience(String string) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setJwtAudience(string);
            return this;
        }

        public Builder setJwtAudienceBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setJwtAudienceBytes(byteString);
            return this;
        }

        public Builder setMinDeadline(double d) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setMinDeadline(d);
            return this;
        }

        public Builder setOperationDeadline(double d) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setOperationDeadline(d);
            return this;
        }

        public Builder setPathTranslation(PathTranslation pathTranslation) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setPathTranslation(pathTranslation);
            return this;
        }

        public Builder setPathTranslationValue(int n) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setPathTranslationValue(n);
            return this;
        }

        public Builder setProtocol(String string) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setProtocol(string);
            return this;
        }

        public Builder setProtocolBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setProtocolBytes(byteString);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

