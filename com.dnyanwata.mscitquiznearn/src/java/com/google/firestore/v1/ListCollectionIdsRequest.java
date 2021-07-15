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
package com.google.firestore.v1;

import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsRequestOrBuilder;
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

public final class ListCollectionIdsRequest
extends GeneratedMessageLite<ListCollectionIdsRequest, Builder>
implements ListCollectionIdsRequestOrBuilder {
    private static final ListCollectionIdsRequest DEFAULT_INSTANCE;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListCollectionIdsRequest> PARSER;
    private int pageSize_;
    private String pageToken_ = "";
    private String parent_ = "";

    static {
        ListCollectionIdsRequest listCollectionIdsRequest;
        DEFAULT_INSTANCE = listCollectionIdsRequest = new ListCollectionIdsRequest();
        GeneratedMessageLite.registerDefaultInstance(ListCollectionIdsRequest.class, (GeneratedMessageLite)listCollectionIdsRequest);
    }

    private ListCollectionIdsRequest() {
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListCollectionIdsRequest.getDefaultInstance().getPageToken();
    }

    private void clearParent() {
        this.parent_ = ListCollectionIdsRequest.getDefaultInstance().getParent();
    }

    public static ListCollectionIdsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListCollectionIdsRequest listCollectionIdsRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listCollectionIdsRequest);
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest)ListCollectionIdsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)ListCollectionIdsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListCollectionIdsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListCollectionIdsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPageSize(int n) {
        this.pageSize_ = n;
    }

    private void setPageToken(String string) {
        string.getClass();
        this.pageToken_ = string;
    }

    private void setPageTokenBytes(ByteString byteString) {
        ListCollectionIdsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.pageToken_ = byteString.toStringUtf8();
    }

    private void setParent(String string) {
        string.getClass();
        this.parent_ = string;
    }

    private void setParentBytes(ByteString byteString) {
        ListCollectionIdsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.parent_ = byteString.toStringUtf8();
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
                Parser<ListCollectionIdsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListCollectionIdsRequest> class_ = ListCollectionIdsRequest.class;
                synchronized (ListCollectionIdsRequest.class) {
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
                Object[] arrobject = new Object[]{"parent_", "pageSize_", "pageToken_"};
                return ListCollectionIdsRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListCollectionIdsRequest();
    }

    @Override
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override
    public ByteString getPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.pageToken_);
    }

    @Override
    public String getParent() {
        return this.parent_;
    }

    @Override
    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListCollectionIdsRequest, Builder>
    implements ListCollectionIdsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearPageToken();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearParent();
            return this;
        }

        @Override
        public int getPageSize() {
            return ((ListCollectionIdsRequest)this.instance).getPageSize();
        }

        @Override
        public String getPageToken() {
            return ((ListCollectionIdsRequest)this.instance).getPageToken();
        }

        @Override
        public ByteString getPageTokenBytes() {
            return ((ListCollectionIdsRequest)this.instance).getPageTokenBytes();
        }

        @Override
        public String getParent() {
            return ((ListCollectionIdsRequest)this.instance).getParent();
        }

        @Override
        public ByteString getParentBytes() {
            return ((ListCollectionIdsRequest)this.instance).getParentBytes();
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setParentBytes(byteString);
            return this;
        }
    }

}

