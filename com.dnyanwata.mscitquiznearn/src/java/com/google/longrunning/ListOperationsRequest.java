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

import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsRequestOrBuilder;
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

public final class ListOperationsRequest
extends GeneratedMessageLite<ListOperationsRequest, Builder>
implements ListOperationsRequestOrBuilder {
    private static final ListOperationsRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser<ListOperationsRequest> PARSER;
    private String filter_ = "";
    private String name_ = "";
    private int pageSize_;
    private String pageToken_ = "";

    static {
        ListOperationsRequest listOperationsRequest;
        DEFAULT_INSTANCE = listOperationsRequest = new ListOperationsRequest();
        GeneratedMessageLite.registerDefaultInstance(ListOperationsRequest.class, (GeneratedMessageLite)listOperationsRequest);
    }

    private ListOperationsRequest() {
    }

    private void clearFilter() {
        this.filter_ = ListOperationsRequest.getDefaultInstance().getFilter();
    }

    private void clearName() {
        this.name_ = ListOperationsRequest.getDefaultInstance().getName();
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListOperationsRequest.getDefaultInstance().getPageToken();
    }

    public static ListOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListOperationsRequest listOperationsRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listOperationsRequest);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest)ListOperationsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)ListOperationsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListOperationsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListOperationsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListOperationsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFilter(String string) {
        string.getClass();
        this.filter_ = string;
    }

    private void setFilterBytes(ByteString byteString) {
        ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.filter_ = byteString.toStringUtf8();
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setPageSize(int n) {
        this.pageSize_ = n;
    }

    private void setPageToken(String string) {
        string.getClass();
        this.pageToken_ = string;
    }

    private void setPageTokenBytes(ByteString byteString) {
        ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.pageToken_ = byteString.toStringUtf8();
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
                Parser<ListOperationsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListOperationsRequest> class_ = ListOperationsRequest.class;
                synchronized (ListOperationsRequest.class) {
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
                Object[] arrobject = new Object[]{"filter_", "pageSize_", "pageToken_", "name_"};
                return ListOperationsRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListOperationsRequest();
    }

    @Override
    public String getFilter() {
        return this.filter_;
    }

    @Override
    public ByteString getFilterBytes() {
        return ByteString.copyFromUtf8((String)this.filter_);
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

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListOperationsRequest, Builder>
    implements ListOperationsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFilter() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearFilter();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearName();
            return this;
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearPageToken();
            return this;
        }

        @Override
        public String getFilter() {
            return ((ListOperationsRequest)this.instance).getFilter();
        }

        @Override
        public ByteString getFilterBytes() {
            return ((ListOperationsRequest)this.instance).getFilterBytes();
        }

        @Override
        public String getName() {
            return ((ListOperationsRequest)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((ListOperationsRequest)this.instance).getNameBytes();
        }

        @Override
        public int getPageSize() {
            return ((ListOperationsRequest)this.instance).getPageSize();
        }

        @Override
        public String getPageToken() {
            return ((ListOperationsRequest)this.instance).getPageToken();
        }

        @Override
        public ByteString getPageTokenBytes() {
            return ((ListOperationsRequest)this.instance).getPageTokenBytes();
        }

        public Builder setFilter(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setFilter(string);
            return this;
        }

        public Builder setFilterBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setFilterBytes(byteString);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }
    }

}

