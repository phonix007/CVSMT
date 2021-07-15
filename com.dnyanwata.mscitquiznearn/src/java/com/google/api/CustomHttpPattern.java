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

import com.google.api.CustomHttpPattern;
import com.google.api.CustomHttpPatternOrBuilder;
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

public final class CustomHttpPattern
extends GeneratedMessageLite<CustomHttpPattern, Builder>
implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile Parser<CustomHttpPattern> PARSER;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    static {
        CustomHttpPattern customHttpPattern;
        DEFAULT_INSTANCE = customHttpPattern = new CustomHttpPattern();
        GeneratedMessageLite.registerDefaultInstance(CustomHttpPattern.class, (GeneratedMessageLite)customHttpPattern);
    }

    private CustomHttpPattern() {
    }

    private void clearKind() {
        this.kind_ = CustomHttpPattern.getDefaultInstance().getKind();
    }

    private void clearPath() {
        this.path_ = CustomHttpPattern.getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CustomHttpPattern customHttpPattern) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern)CustomHttpPattern.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)CustomHttpPattern.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CustomHttpPattern parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CustomHttpPattern> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKind(String string) {
        string.getClass();
        this.kind_ = string;
    }

    private void setKindBytes(ByteString byteString) {
        CustomHttpPattern.checkByteStringIsUtf8((ByteString)byteString);
        this.kind_ = byteString.toStringUtf8();
    }

    private void setPath(String string) {
        string.getClass();
        this.path_ = string;
    }

    private void setPathBytes(ByteString byteString) {
        CustomHttpPattern.checkByteStringIsUtf8((ByteString)byteString);
        this.path_ = byteString.toStringUtf8();
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
                Parser<CustomHttpPattern> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<CustomHttpPattern> class_ = CustomHttpPattern.class;
                synchronized (CustomHttpPattern.class) {
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
                Object[] arrobject = new Object[]{"kind_", "path_"};
                return CustomHttpPattern.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new CustomHttpPattern();
    }

    @Override
    public String getKind() {
        return this.kind_;
    }

    @Override
    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8((String)this.kind_);
    }

    @Override
    public String getPath() {
        return this.path_;
    }

    @Override
    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8((String)this.path_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CustomHttpPattern, Builder>
    implements CustomHttpPatternOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearKind() {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).clearKind();
            return this;
        }

        public Builder clearPath() {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).clearPath();
            return this;
        }

        @Override
        public String getKind() {
            return ((CustomHttpPattern)this.instance).getKind();
        }

        @Override
        public ByteString getKindBytes() {
            return ((CustomHttpPattern)this.instance).getKindBytes();
        }

        @Override
        public String getPath() {
            return ((CustomHttpPattern)this.instance).getPath();
        }

        @Override
        public ByteString getPathBytes() {
            return ((CustomHttpPattern)this.instance).getPathBytes();
        }

        public Builder setKind(String string) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setKind(string);
            return this;
        }

        public Builder setKindBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setKindBytes(byteString);
            return this;
        }

        public Builder setPath(String string) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setPath(string);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setPathBytes(byteString);
            return this;
        }
    }

}

