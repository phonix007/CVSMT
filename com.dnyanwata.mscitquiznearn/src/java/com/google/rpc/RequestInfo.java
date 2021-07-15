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
 *  com.google.rpc.RequestInfo$1
 *  com.google.rpc.RequestInfoOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.RequestInfo;
import com.google.rpc.RequestInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RequestInfo
extends GeneratedMessageLite<RequestInfo, Builder>
implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE;
    private static volatile Parser<RequestInfo> PARSER;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    static {
        RequestInfo requestInfo;
        DEFAULT_INSTANCE = requestInfo = new RequestInfo();
        GeneratedMessageLite.registerDefaultInstance(RequestInfo.class, (GeneratedMessageLite)requestInfo);
    }

    private RequestInfo() {
    }

    private void clearRequestId() {
        this.requestId_ = RequestInfo.getDefaultInstance().getRequestId();
    }

    private void clearServingData() {
        this.servingData_ = RequestInfo.getDefaultInstance().getServingData();
    }

    public static RequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RequestInfo requestInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)requestInfo);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestInfo)RequestInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)RequestInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(InputStream inputStream) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static RequestInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RequestInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RequestInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestId(String string) {
        string.getClass();
        this.requestId_ = string;
    }

    private void setRequestIdBytes(ByteString byteString) {
        RequestInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setServingData(String string) {
        string.getClass();
        this.servingData_ = string;
    }

    private void setServingDataBytes(ByteString byteString) {
        RequestInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.servingData_ = byteString.toStringUtf8();
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
                Parser<RequestInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<RequestInfo> class_ = RequestInfo.class;
                synchronized (RequestInfo.class) {
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
                Object[] arrobject = new Object[]{"requestId_", "servingData_"};
                return RequestInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new RequestInfo();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8((String)this.requestId_);
    }

    public String getServingData() {
        return this.servingData_;
    }

    public ByteString getServingDataBytes() {
        return ByteString.copyFromUtf8((String)this.servingData_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RequestInfo, Builder>
    implements RequestInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearRequestId() {
            this.copyOnWrite();
            ((RequestInfo)this.instance).clearRequestId();
            return this;
        }

        public Builder clearServingData() {
            this.copyOnWrite();
            ((RequestInfo)this.instance).clearServingData();
            return this;
        }

        public String getRequestId() {
            return ((RequestInfo)this.instance).getRequestId();
        }

        public ByteString getRequestIdBytes() {
            return ((RequestInfo)this.instance).getRequestIdBytes();
        }

        public String getServingData() {
            return ((RequestInfo)this.instance).getServingData();
        }

        public ByteString getServingDataBytes() {
            return ((RequestInfo)this.instance).getServingDataBytes();
        }

        public Builder setRequestId(String string) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setRequestId(string);
            return this;
        }

        public Builder setRequestIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setRequestIdBytes(byteString);
            return this;
        }

        public Builder setServingData(String string) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setServingData(string);
            return this;
        }

        public Builder setServingDataBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setServingDataBytes(byteString);
            return this;
        }
    }

}

