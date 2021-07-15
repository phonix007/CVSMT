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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.rpc.ErrorInfo$1
 *  com.google.rpc.ErrorInfo$MetadataDefaultEntryHolder
 *  com.google.rpc.ErrorInfoOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.ErrorInfo;
import com.google.rpc.ErrorInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class ErrorInfo
extends GeneratedMessageLite<ErrorInfo, Builder>
implements ErrorInfoOrBuilder {
    private static final ErrorInfo DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<ErrorInfo> PARSER;
    public static final int REASON_FIELD_NUMBER = 1;
    private String domain_ = "";
    private MapFieldLite<String, String> metadata_ = MapFieldLite.emptyMapField();
    private String reason_ = "";

    static {
        ErrorInfo errorInfo;
        DEFAULT_INSTANCE = errorInfo = new ErrorInfo();
        GeneratedMessageLite.registerDefaultInstance(ErrorInfo.class, (GeneratedMessageLite)errorInfo);
    }

    private ErrorInfo() {
    }

    private void clearDomain() {
        this.domain_ = ErrorInfo.getDefaultInstance().getDomain();
    }

    private void clearReason() {
        this.reason_ = ErrorInfo.getDefaultInstance().getReason();
    }

    public static ErrorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableMetadataMap() {
        return this.internalGetMutableMetadata();
    }

    private MapFieldLite<String, String> internalGetMetadata() {
        return this.metadata_;
    }

    private MapFieldLite<String, String> internalGetMutableMetadata() {
        if (!this.metadata_.isMutable()) {
            this.metadata_ = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ErrorInfo errorInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)errorInfo);
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ErrorInfo)ErrorInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorInfo)ErrorInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ErrorInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(InputStream inputStream) throws IOException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ErrorInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ErrorInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ErrorInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDomain(String string) {
        string.getClass();
        this.domain_ = string;
    }

    private void setDomainBytes(ByteString byteString) {
        ErrorInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.domain_ = byteString.toStringUtf8();
    }

    private void setReason(String string) {
        string.getClass();
        this.reason_ = string;
    }

    private void setReasonBytes(ByteString byteString) {
        ErrorInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.reason_ = byteString.toStringUtf8();
    }

    public boolean containsMetadata(String string) {
        string.getClass();
        return this.internalGetMetadata().containsKey((Object)string);
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
                Parser<ErrorInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ErrorInfo> class_ = ErrorInfo.class;
                synchronized (ErrorInfo.class) {
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
                Object[] arrobject = new Object[]{"reason_", "domain_", "metadata_", MetadataDefaultEntryHolder.defaultEntry};
                return ErrorInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u00032", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ErrorInfo();
    }

    public String getDomain() {
        return this.domain_;
    }

    public ByteString getDomainBytes() {
        return ByteString.copyFromUtf8((String)this.domain_);
    }

    @Deprecated
    public Map<String, String> getMetadata() {
        return this.getMetadataMap();
    }

    public int getMetadataCount() {
        return this.internalGetMetadata().size();
    }

    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(this.internalGetMetadata());
    }

    public String getMetadataOrDefault(String string, String string2) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetMetadata();
        if (mapFieldLite.containsKey((Object)string)) {
            string2 = (String)mapFieldLite.get((Object)string);
        }
        return string2;
    }

    public String getMetadataOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetMetadata();
        if (mapFieldLite.containsKey((Object)string)) {
            return (String)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    public String getReason() {
        return this.reason_;
    }

    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8((String)this.reason_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ErrorInfo, Builder>
    implements ErrorInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDomain() {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).clearDomain();
            return this;
        }

        public Builder clearMetadata() {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).getMutableMetadataMap().clear();
            return this;
        }

        public Builder clearReason() {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).clearReason();
            return this;
        }

        public boolean containsMetadata(String string) {
            string.getClass();
            return ((ErrorInfo)this.instance).getMetadataMap().containsKey((Object)string);
        }

        public String getDomain() {
            return ((ErrorInfo)this.instance).getDomain();
        }

        public ByteString getDomainBytes() {
            return ((ErrorInfo)this.instance).getDomainBytes();
        }

        @Deprecated
        public Map<String, String> getMetadata() {
            return this.getMetadataMap();
        }

        public int getMetadataCount() {
            return ((ErrorInfo)this.instance).getMetadataMap().size();
        }

        public Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ErrorInfo)this.instance).getMetadataMap());
        }

        public String getMetadataOrDefault(String string, String string2) {
            string.getClass();
            Map<String, String> map = ((ErrorInfo)this.instance).getMetadataMap();
            if (map.containsKey((Object)string)) {
                string2 = (String)map.get((Object)string);
            }
            return string2;
        }

        public String getMetadataOrThrow(String string) {
            string.getClass();
            Map<String, String> map = ((ErrorInfo)this.instance).getMetadataMap();
            if (map.containsKey((Object)string)) {
                return (String)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public String getReason() {
            return ((ErrorInfo)this.instance).getReason();
        }

        public ByteString getReasonBytes() {
            return ((ErrorInfo)this.instance).getReasonBytes();
        }

        public Builder putAllMetadata(Map<String, String> map) {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).getMutableMetadataMap().putAll(map);
            return this;
        }

        public Builder putMetadata(String string, String string2) {
            string.getClass();
            string2.getClass();
            this.copyOnWrite();
            ((ErrorInfo)this.instance).getMutableMetadataMap().put((Object)string, (Object)string2);
            return this;
        }

        public Builder removeMetadata(String string) {
            string.getClass();
            this.copyOnWrite();
            ((ErrorInfo)this.instance).getMutableMetadataMap().remove((Object)string);
            return this;
        }

        public Builder setDomain(String string) {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).setDomain(string);
            return this;
        }

        public Builder setDomainBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).setDomainBytes(byteString);
            return this;
        }

        public Builder setReason(String string) {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).setReason(string);
            return this;
        }

        public Builder setReasonBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ErrorInfo)this.instance).setReasonBytes(byteString);
            return this;
        }
    }

}

