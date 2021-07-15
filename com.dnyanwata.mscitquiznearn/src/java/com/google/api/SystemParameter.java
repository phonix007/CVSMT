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

import com.google.api.SystemParameter;
import com.google.api.SystemParameterOrBuilder;
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

public final class SystemParameter
extends GeneratedMessageLite<SystemParameter, Builder>
implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE;
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SystemParameter> PARSER;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_ = "";
    private String name_ = "";
    private String urlQueryParameter_ = "";

    static {
        SystemParameter systemParameter;
        DEFAULT_INSTANCE = systemParameter = new SystemParameter();
        GeneratedMessageLite.registerDefaultInstance(SystemParameter.class, (GeneratedMessageLite)systemParameter);
    }

    private SystemParameter() {
    }

    private void clearHttpHeader() {
        this.httpHeader_ = SystemParameter.getDefaultInstance().getHttpHeader();
    }

    private void clearName() {
        this.name_ = SystemParameter.getDefaultInstance().getName();
    }

    private void clearUrlQueryParameter() {
        this.urlQueryParameter_ = SystemParameter.getDefaultInstance().getUrlQueryParameter();
    }

    public static SystemParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(SystemParameter systemParameter) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)systemParameter);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameter)SystemParameter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)SystemParameter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static SystemParameter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHttpHeader(String string) {
        string.getClass();
        this.httpHeader_ = string;
    }

    private void setHttpHeaderBytes(ByteString byteString) {
        SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
        this.httpHeader_ = byteString.toStringUtf8();
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setUrlQueryParameter(String string) {
        string.getClass();
        this.urlQueryParameter_ = string;
    }

    private void setUrlQueryParameterBytes(ByteString byteString) {
        SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
        this.urlQueryParameter_ = byteString.toStringUtf8();
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
                Parser<SystemParameter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<SystemParameter> class_ = SystemParameter.class;
                synchronized (SystemParameter.class) {
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
                Object[] arrobject = new Object[]{"name_", "httpHeader_", "urlQueryParameter_"};
                return SystemParameter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new SystemParameter();
    }

    @Override
    public String getHttpHeader() {
        return this.httpHeader_;
    }

    @Override
    public ByteString getHttpHeaderBytes() {
        return ByteString.copyFromUtf8((String)this.httpHeader_);
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    @Override
    public ByteString getUrlQueryParameterBytes() {
        return ByteString.copyFromUtf8((String)this.urlQueryParameter_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameter, Builder>
    implements SystemParameterOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearHttpHeader() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearHttpHeader();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearName();
            return this;
        }

        public Builder clearUrlQueryParameter() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearUrlQueryParameter();
            return this;
        }

        @Override
        public String getHttpHeader() {
            return ((SystemParameter)this.instance).getHttpHeader();
        }

        @Override
        public ByteString getHttpHeaderBytes() {
            return ((SystemParameter)this.instance).getHttpHeaderBytes();
        }

        @Override
        public String getName() {
            return ((SystemParameter)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((SystemParameter)this.instance).getNameBytes();
        }

        @Override
        public String getUrlQueryParameter() {
            return ((SystemParameter)this.instance).getUrlQueryParameter();
        }

        @Override
        public ByteString getUrlQueryParameterBytes() {
            return ((SystemParameter)this.instance).getUrlQueryParameterBytes();
        }

        public Builder setHttpHeader(String string) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setHttpHeader(string);
            return this;
        }

        public Builder setHttpHeaderBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setHttpHeaderBytes(byteString);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUrlQueryParameter(String string) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setUrlQueryParameter(string);
            return this;
        }

        public Builder setUrlQueryParameterBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setUrlQueryParameterBytes(byteString);
            return this;
        }
    }

}

