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
package com.google.cloud.audit;

import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.AuthorizationInfoOrBuilder;
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

public final class AuthorizationInfo
extends GeneratedMessageLite<AuthorizationInfo, Builder>
implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE;
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<AuthorizationInfo> PARSER;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_ = "";
    private String resource_ = "";

    static {
        AuthorizationInfo authorizationInfo;
        DEFAULT_INSTANCE = authorizationInfo = new AuthorizationInfo();
        GeneratedMessageLite.registerDefaultInstance(AuthorizationInfo.class, (GeneratedMessageLite)authorizationInfo);
    }

    private AuthorizationInfo() {
    }

    private void clearGranted() {
        this.granted_ = false;
    }

    private void clearPermission() {
        this.permission_ = AuthorizationInfo.getDefaultInstance().getPermission();
    }

    private void clearResource() {
        this.resource_ = AuthorizationInfo.getDefaultInstance().getResource();
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthorizationInfo authorizationInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authorizationInfo);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo)AuthorizationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)AuthorizationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AuthorizationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthorizationInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthorizationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setGranted(boolean bl) {
        this.granted_ = bl;
    }

    private void setPermission(String string) {
        string.getClass();
        this.permission_ = string;
    }

    private void setPermissionBytes(ByteString byteString) {
        AuthorizationInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.permission_ = byteString.toStringUtf8();
    }

    private void setResource(String string) {
        string.getClass();
        this.resource_ = string;
    }

    private void setResourceBytes(ByteString byteString) {
        AuthorizationInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.resource_ = byteString.toStringUtf8();
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
                Parser<AuthorizationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AuthorizationInfo> class_ = AuthorizationInfo.class;
                synchronized (AuthorizationInfo.class) {
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
                Object[] arrobject = new Object[]{"resource_", "permission_", "granted_"};
                return AuthorizationInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AuthorizationInfo();
    }

    @Override
    public boolean getGranted() {
        return this.granted_;
    }

    @Override
    public String getPermission() {
        return this.permission_;
    }

    @Override
    public ByteString getPermissionBytes() {
        return ByteString.copyFromUtf8((String)this.permission_);
    }

    @Override
    public String getResource() {
        return this.resource_;
    }

    @Override
    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8((String)this.resource_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthorizationInfo, Builder>
    implements AuthorizationInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearGranted() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearGranted();
            return this;
        }

        public Builder clearPermission() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearPermission();
            return this;
        }

        public Builder clearResource() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearResource();
            return this;
        }

        @Override
        public boolean getGranted() {
            return ((AuthorizationInfo)this.instance).getGranted();
        }

        @Override
        public String getPermission() {
            return ((AuthorizationInfo)this.instance).getPermission();
        }

        @Override
        public ByteString getPermissionBytes() {
            return ((AuthorizationInfo)this.instance).getPermissionBytes();
        }

        @Override
        public String getResource() {
            return ((AuthorizationInfo)this.instance).getResource();
        }

        @Override
        public ByteString getResourceBytes() {
            return ((AuthorizationInfo)this.instance).getResourceBytes();
        }

        public Builder setGranted(boolean bl) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setGranted(bl);
            return this;
        }

        public Builder setPermission(String string) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setPermission(string);
            return this;
        }

        public Builder setPermissionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setPermissionBytes(byteString);
            return this;
        }

        public Builder setResource(String string) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setResource(string);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setResourceBytes(byteString);
            return this;
        }
    }

}

