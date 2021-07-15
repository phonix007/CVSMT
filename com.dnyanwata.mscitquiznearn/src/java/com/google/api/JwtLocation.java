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
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.JwtLocation;
import com.google.api.JwtLocationOrBuilder;
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

public final class JwtLocation
extends GeneratedMessageLite<JwtLocation, Builder>
implements JwtLocationOrBuilder {
    private static final JwtLocation DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<JwtLocation> PARSER;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_ = 0;
    private Object in_;
    private String valuePrefix_ = "";

    static {
        JwtLocation jwtLocation;
        DEFAULT_INSTANCE = jwtLocation = new JwtLocation();
        GeneratedMessageLite.registerDefaultInstance(JwtLocation.class, (GeneratedMessageLite)jwtLocation);
    }

    private JwtLocation() {
    }

    private void clearHeader() {
        if (this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    private void clearIn() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    private void clearQuery() {
        if (this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    private void clearValuePrefix() {
        this.valuePrefix_ = JwtLocation.getDefaultInstance().getValuePrefix();
    }

    public static JwtLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(JwtLocation jwtLocation) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)jwtLocation);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (JwtLocation)JwtLocation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static JwtLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation)JwtLocation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static JwtLocation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static JwtLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static JwtLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static JwtLocation parseFrom(InputStream inputStream) throws IOException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static JwtLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static JwtLocation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static JwtLocation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static JwtLocation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (JwtLocation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<JwtLocation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHeader(String string) {
        string.getClass();
        this.inCase_ = 1;
        this.in_ = string;
    }

    private void setHeaderBytes(ByteString byteString) {
        JwtLocation.checkByteStringIsUtf8((ByteString)byteString);
        this.in_ = byteString.toStringUtf8();
        this.inCase_ = 1;
    }

    private void setQuery(String string) {
        string.getClass();
        this.inCase_ = 2;
        this.in_ = string;
    }

    private void setQueryBytes(ByteString byteString) {
        JwtLocation.checkByteStringIsUtf8((ByteString)byteString);
        this.in_ = byteString.toStringUtf8();
        this.inCase_ = 2;
    }

    private void setValuePrefix(String string) {
        string.getClass();
        this.valuePrefix_ = string;
    }

    private void setValuePrefixBytes(ByteString byteString) {
        JwtLocation.checkByteStringIsUtf8((ByteString)byteString);
        this.valuePrefix_ = byteString.toStringUtf8();
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
                Parser<JwtLocation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<JwtLocation> class_ = JwtLocation.class;
                synchronized (JwtLocation.class) {
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
                Object[] arrobject = new Object[]{"in_", "inCase_", "valuePrefix_"};
                return JwtLocation.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u023b\u0000\u0002\u023b\u0000\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new JwtLocation();
    }

    @Override
    public String getHeader() {
        if (this.inCase_ == 1) {
            return (String)this.in_;
        }
        return "";
    }

    @Override
    public ByteString getHeaderBytes() {
        String string = this.inCase_ == 1 ? (String)this.in_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public InCase getInCase() {
        return InCase.forNumber(this.inCase_);
    }

    @Override
    public String getQuery() {
        if (this.inCase_ == 2) {
            return (String)this.in_;
        }
        return "";
    }

    @Override
    public ByteString getQueryBytes() {
        String string = this.inCase_ == 2 ? (String)this.in_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getValuePrefix() {
        return this.valuePrefix_;
    }

    @Override
    public ByteString getValuePrefixBytes() {
        return ByteString.copyFromUtf8((String)this.valuePrefix_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<JwtLocation, Builder>
    implements JwtLocationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearHeader() {
            this.copyOnWrite();
            ((JwtLocation)this.instance).clearHeader();
            return this;
        }

        public Builder clearIn() {
            this.copyOnWrite();
            ((JwtLocation)this.instance).clearIn();
            return this;
        }

        public Builder clearQuery() {
            this.copyOnWrite();
            ((JwtLocation)this.instance).clearQuery();
            return this;
        }

        public Builder clearValuePrefix() {
            this.copyOnWrite();
            ((JwtLocation)this.instance).clearValuePrefix();
            return this;
        }

        @Override
        public String getHeader() {
            return ((JwtLocation)this.instance).getHeader();
        }

        @Override
        public ByteString getHeaderBytes() {
            return ((JwtLocation)this.instance).getHeaderBytes();
        }

        @Override
        public InCase getInCase() {
            return ((JwtLocation)this.instance).getInCase();
        }

        @Override
        public String getQuery() {
            return ((JwtLocation)this.instance).getQuery();
        }

        @Override
        public ByteString getQueryBytes() {
            return ((JwtLocation)this.instance).getQueryBytes();
        }

        @Override
        public String getValuePrefix() {
            return ((JwtLocation)this.instance).getValuePrefix();
        }

        @Override
        public ByteString getValuePrefixBytes() {
            return ((JwtLocation)this.instance).getValuePrefixBytes();
        }

        public Builder setHeader(String string) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setHeader(string);
            return this;
        }

        public Builder setHeaderBytes(ByteString byteString) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setHeaderBytes(byteString);
            return this;
        }

        public Builder setQuery(String string) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setQuery(string);
            return this;
        }

        public Builder setQueryBytes(ByteString byteString) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setQueryBytes(byteString);
            return this;
        }

        public Builder setValuePrefix(String string) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setValuePrefix(string);
            return this;
        }

        public Builder setValuePrefixBytes(ByteString byteString) {
            this.copyOnWrite();
            ((JwtLocation)this.instance).setValuePrefixBytes(byteString);
            return this;
        }
    }

}

