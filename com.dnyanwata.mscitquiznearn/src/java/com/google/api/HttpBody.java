/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
 *  com.google.protobuf.AnyOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.HttpBody;
import com.google.api.HttpBodyOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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
import java.util.Collections;
import java.util.List;

public final class HttpBody
extends GeneratedMessageLite<HttpBody, Builder>
implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE;
    public static final int EXTENSIONS_FIELD_NUMBER = 3;
    private static volatile Parser<HttpBody> PARSER;
    private String contentType_ = "";
    private ByteString data_ = ByteString.EMPTY;
    private Internal.ProtobufList<Any> extensions_ = HttpBody.emptyProtobufList();

    static {
        HttpBody httpBody;
        DEFAULT_INSTANCE = httpBody = new HttpBody();
        GeneratedMessageLite.registerDefaultInstance(HttpBody.class, (GeneratedMessageLite)httpBody);
    }

    private HttpBody() {
    }

    private void addAllExtensions(Iterable<? extends Any> iterable) {
        this.ensureExtensionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.extensions_);
    }

    private void addExtensions(int n, Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.add(n, (Object)any);
    }

    private void addExtensions(Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.add((Object)any);
    }

    private void clearContentType() {
        this.contentType_ = HttpBody.getDefaultInstance().getContentType();
    }

    private void clearData() {
        this.data_ = HttpBody.getDefaultInstance().getData();
    }

    private void clearExtensions() {
        this.extensions_ = HttpBody.emptyProtobufList();
    }

    private void ensureExtensionsIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.extensions_;
        if (!protobufList.isModifiable()) {
            this.extensions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HttpBody httpBody) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpBody)HttpBody.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)HttpBody.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static HttpBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpBody parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeExtensions(int n) {
        this.ensureExtensionsIsMutable();
        this.extensions_.remove(n);
    }

    private void setContentType(String string) {
        string.getClass();
        this.contentType_ = string;
    }

    private void setContentTypeBytes(ByteString byteString) {
        HttpBody.checkByteStringIsUtf8((ByteString)byteString);
        this.contentType_ = byteString.toStringUtf8();
    }

    private void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    private void setExtensions(int n, Any any) {
        any.getClass();
        this.ensureExtensionsIsMutable();
        this.extensions_.set(n, (Object)any);
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
                Parser<HttpBody> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<HttpBody> class_ = HttpBody.class;
                synchronized (HttpBody.class) {
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
                Object[] arrobject = new Object[]{"contentType_", "data_", "extensions_", Any.class};
                return HttpBody.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\n\u0003\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new HttpBody();
    }

    @Override
    public String getContentType() {
        return this.contentType_;
    }

    @Override
    public ByteString getContentTypeBytes() {
        return ByteString.copyFromUtf8((String)this.contentType_);
    }

    @Override
    public ByteString getData() {
        return this.data_;
    }

    @Override
    public Any getExtensions(int n) {
        return (Any)this.extensions_.get(n);
    }

    @Override
    public int getExtensionsCount() {
        return this.extensions_.size();
    }

    @Override
    public List<Any> getExtensionsList() {
        return this.extensions_;
    }

    public AnyOrBuilder getExtensionsOrBuilder(int n) {
        return (AnyOrBuilder)this.extensions_.get(n);
    }

    public List<? extends AnyOrBuilder> getExtensionsOrBuilderList() {
        return this.extensions_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpBody, Builder>
    implements HttpBodyOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllExtensions(Iterable<? extends Any> iterable) {
            this.copyOnWrite();
            ((HttpBody)this.instance).addAllExtensions((Iterable<? extends Any>)iterable);
            return this;
        }

        public Builder addExtensions(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((HttpBody)this.instance).addExtensions(n, (Any)builder.build());
            return this;
        }

        public Builder addExtensions(int n, Any any) {
            this.copyOnWrite();
            ((HttpBody)this.instance).addExtensions(n, any);
            return this;
        }

        public Builder addExtensions(Any.Builder builder) {
            this.copyOnWrite();
            ((HttpBody)this.instance).addExtensions((Any)builder.build());
            return this;
        }

        public Builder addExtensions(Any any) {
            this.copyOnWrite();
            ((HttpBody)this.instance).addExtensions(any);
            return this;
        }

        public Builder clearContentType() {
            this.copyOnWrite();
            ((HttpBody)this.instance).clearContentType();
            return this;
        }

        public Builder clearData() {
            this.copyOnWrite();
            ((HttpBody)this.instance).clearData();
            return this;
        }

        public Builder clearExtensions() {
            this.copyOnWrite();
            ((HttpBody)this.instance).clearExtensions();
            return this;
        }

        @Override
        public String getContentType() {
            return ((HttpBody)this.instance).getContentType();
        }

        @Override
        public ByteString getContentTypeBytes() {
            return ((HttpBody)this.instance).getContentTypeBytes();
        }

        @Override
        public ByteString getData() {
            return ((HttpBody)this.instance).getData();
        }

        @Override
        public Any getExtensions(int n) {
            return ((HttpBody)this.instance).getExtensions(n);
        }

        @Override
        public int getExtensionsCount() {
            return ((HttpBody)this.instance).getExtensionsCount();
        }

        @Override
        public List<Any> getExtensionsList() {
            return Collections.unmodifiableList(((HttpBody)this.instance).getExtensionsList());
        }

        public Builder removeExtensions(int n) {
            this.copyOnWrite();
            ((HttpBody)this.instance).removeExtensions(n);
            return this;
        }

        public Builder setContentType(String string) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setContentType(string);
            return this;
        }

        public Builder setContentTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setContentTypeBytes(byteString);
            return this;
        }

        public Builder setData(ByteString byteString) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setData(byteString);
            return this;
        }

        public Builder setExtensions(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setExtensions(n, (Any)builder.build());
            return this;
        }

        public Builder setExtensions(int n, Any any) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setExtensions(n, any);
            return this;
        }
    }

}

