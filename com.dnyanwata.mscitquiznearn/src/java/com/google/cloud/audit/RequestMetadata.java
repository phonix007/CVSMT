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

import com.google.cloud.audit.RequestMetadata;
import com.google.cloud.audit.RequestMetadataOrBuilder;
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

public final class RequestMetadata
extends GeneratedMessageLite<RequestMetadata, Builder>
implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile Parser<RequestMetadata> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    static {
        RequestMetadata requestMetadata;
        DEFAULT_INSTANCE = requestMetadata = new RequestMetadata();
        GeneratedMessageLite.registerDefaultInstance(RequestMetadata.class, (GeneratedMessageLite)requestMetadata);
    }

    private RequestMetadata() {
    }

    private void clearCallerIp() {
        this.callerIp_ = RequestMetadata.getDefaultInstance().getCallerIp();
    }

    private void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = RequestMetadata.getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RequestMetadata requestMetadata) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)requestMetadata);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata)RequestMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)RequestMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RequestMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RequestMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RequestMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCallerIp(String string) {
        string.getClass();
        this.callerIp_ = string;
    }

    private void setCallerIpBytes(ByteString byteString) {
        RequestMetadata.checkByteStringIsUtf8((ByteString)byteString);
        this.callerIp_ = byteString.toStringUtf8();
    }

    private void setCallerSuppliedUserAgent(String string) {
        string.getClass();
        this.callerSuppliedUserAgent_ = string;
    }

    private void setCallerSuppliedUserAgentBytes(ByteString byteString) {
        RequestMetadata.checkByteStringIsUtf8((ByteString)byteString);
        this.callerSuppliedUserAgent_ = byteString.toStringUtf8();
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
                Parser<RequestMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<RequestMetadata> class_ = RequestMetadata.class;
                synchronized (RequestMetadata.class) {
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
                Object[] arrobject = new Object[]{"callerIp_", "callerSuppliedUserAgent_"};
                return RequestMetadata.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new RequestMetadata();
    }

    @Override
    public String getCallerIp() {
        return this.callerIp_;
    }

    @Override
    public ByteString getCallerIpBytes() {
        return ByteString.copyFromUtf8((String)this.callerIp_);
    }

    @Override
    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    @Override
    public ByteString getCallerSuppliedUserAgentBytes() {
        return ByteString.copyFromUtf8((String)this.callerSuppliedUserAgent_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RequestMetadata, Builder>
    implements RequestMetadataOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCallerIp() {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).clearCallerIp();
            return this;
        }

        public Builder clearCallerSuppliedUserAgent() {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).clearCallerSuppliedUserAgent();
            return this;
        }

        @Override
        public String getCallerIp() {
            return ((RequestMetadata)this.instance).getCallerIp();
        }

        @Override
        public ByteString getCallerIpBytes() {
            return ((RequestMetadata)this.instance).getCallerIpBytes();
        }

        @Override
        public String getCallerSuppliedUserAgent() {
            return ((RequestMetadata)this.instance).getCallerSuppliedUserAgent();
        }

        @Override
        public ByteString getCallerSuppliedUserAgentBytes() {
            return ((RequestMetadata)this.instance).getCallerSuppliedUserAgentBytes();
        }

        public Builder setCallerIp(String string) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerIp(string);
            return this;
        }

        public Builder setCallerIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerIpBytes(byteString);
            return this;
        }

        public Builder setCallerSuppliedUserAgent(String string) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerSuppliedUserAgent(string);
            return this;
        }

        public Builder setCallerSuppliedUserAgentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerSuppliedUserAgentBytes(byteString);
            return this;
        }
    }

}

