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
package com.google.longrunning;

import com.google.longrunning.OperationInfo;
import com.google.longrunning.OperationInfoOrBuilder;
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

public final class OperationInfo
extends GeneratedMessageLite<OperationInfo, Builder>
implements OperationInfoOrBuilder {
    private static final OperationInfo DEFAULT_INSTANCE;
    public static final int METADATA_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<OperationInfo> PARSER;
    public static final int RESPONSE_TYPE_FIELD_NUMBER = 1;
    private String metadataType_ = "";
    private String responseType_ = "";

    static {
        OperationInfo operationInfo;
        DEFAULT_INSTANCE = operationInfo = new OperationInfo();
        GeneratedMessageLite.registerDefaultInstance(OperationInfo.class, (GeneratedMessageLite)operationInfo);
    }

    private OperationInfo() {
    }

    private void clearMetadataType() {
        this.metadataType_ = OperationInfo.getDefaultInstance().getMetadataType();
    }

    private void clearResponseType() {
        this.responseType_ = OperationInfo.getDefaultInstance().getResponseType();
    }

    public static OperationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(OperationInfo operationInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)operationInfo);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OperationInfo)OperationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static OperationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationInfo)OperationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static OperationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static OperationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static OperationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static OperationInfo parseFrom(InputStream inputStream) throws IOException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static OperationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static OperationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static OperationInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static OperationInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OperationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<OperationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMetadataType(String string) {
        string.getClass();
        this.metadataType_ = string;
    }

    private void setMetadataTypeBytes(ByteString byteString) {
        OperationInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.metadataType_ = byteString.toStringUtf8();
    }

    private void setResponseType(String string) {
        string.getClass();
        this.responseType_ = string;
    }

    private void setResponseTypeBytes(ByteString byteString) {
        OperationInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.responseType_ = byteString.toStringUtf8();
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
                Parser<OperationInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<OperationInfo> class_ = OperationInfo.class;
                synchronized (OperationInfo.class) {
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
                Object[] arrobject = new Object[]{"responseType_", "metadataType_"};
                return OperationInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new OperationInfo();
    }

    @Override
    public String getMetadataType() {
        return this.metadataType_;
    }

    @Override
    public ByteString getMetadataTypeBytes() {
        return ByteString.copyFromUtf8((String)this.metadataType_);
    }

    @Override
    public String getResponseType() {
        return this.responseType_;
    }

    @Override
    public ByteString getResponseTypeBytes() {
        return ByteString.copyFromUtf8((String)this.responseType_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<OperationInfo, Builder>
    implements OperationInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearMetadataType() {
            this.copyOnWrite();
            ((OperationInfo)this.instance).clearMetadataType();
            return this;
        }

        public Builder clearResponseType() {
            this.copyOnWrite();
            ((OperationInfo)this.instance).clearResponseType();
            return this;
        }

        @Override
        public String getMetadataType() {
            return ((OperationInfo)this.instance).getMetadataType();
        }

        @Override
        public ByteString getMetadataTypeBytes() {
            return ((OperationInfo)this.instance).getMetadataTypeBytes();
        }

        @Override
        public String getResponseType() {
            return ((OperationInfo)this.instance).getResponseType();
        }

        @Override
        public ByteString getResponseTypeBytes() {
            return ((OperationInfo)this.instance).getResponseTypeBytes();
        }

        public Builder setMetadataType(String string) {
            this.copyOnWrite();
            ((OperationInfo)this.instance).setMetadataType(string);
            return this;
        }

        public Builder setMetadataTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((OperationInfo)this.instance).setMetadataTypeBytes(byteString);
            return this;
        }

        public Builder setResponseType(String string) {
            this.copyOnWrite();
            ((OperationInfo)this.instance).setResponseType(string);
            return this;
        }

        public Builder setResponseTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((OperationInfo)this.instance).setResponseTypeBytes(byteString);
            return this;
        }
    }

}

