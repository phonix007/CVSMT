/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
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
package com.google.firestore.v1;

import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListCollectionIdsResponseOrBuilder;
import com.google.protobuf.AbstractMessageLite;
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

public final class ListCollectionIdsResponse
extends GeneratedMessageLite<ListCollectionIdsResponse, Builder>
implements ListCollectionIdsResponseOrBuilder {
    public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
    private static final ListCollectionIdsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListCollectionIdsResponse> PARSER;
    private Internal.ProtobufList<String> collectionIds_ = GeneratedMessageLite.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        ListCollectionIdsResponse listCollectionIdsResponse;
        DEFAULT_INSTANCE = listCollectionIdsResponse = new ListCollectionIdsResponse();
        GeneratedMessageLite.registerDefaultInstance(ListCollectionIdsResponse.class, (GeneratedMessageLite)listCollectionIdsResponse);
    }

    private ListCollectionIdsResponse() {
    }

    private void addAllCollectionIds(Iterable<String> iterable) {
        this.ensureCollectionIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.collectionIds_);
    }

    private void addCollectionIds(String string) {
        string.getClass();
        this.ensureCollectionIdsIsMutable();
        this.collectionIds_.add((Object)string);
    }

    private void addCollectionIdsBytes(ByteString byteString) {
        ListCollectionIdsResponse.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureCollectionIdsIsMutable();
        this.collectionIds_.add((Object)byteString.toStringUtf8());
    }

    private void clearCollectionIds() {
        this.collectionIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListCollectionIdsResponse.getDefaultInstance().getNextPageToken();
    }

    private void ensureCollectionIdsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.collectionIds_;
        if (!protobufList.isModifiable()) {
            this.collectionIds_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ListCollectionIdsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListCollectionIdsResponse listCollectionIdsResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listCollectionIdsResponse);
    }

    public static ListCollectionIdsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsResponse)ListCollectionIdsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)ListCollectionIdsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListCollectionIdsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListCollectionIdsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListCollectionIdsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListCollectionIdsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListCollectionIdsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionIds(int n, String string) {
        string.getClass();
        this.ensureCollectionIdsIsMutable();
        this.collectionIds_.set(n, (Object)string);
    }

    private void setNextPageToken(String string) {
        string.getClass();
        this.nextPageToken_ = string;
    }

    private void setNextPageTokenBytes(ByteString byteString) {
        ListCollectionIdsResponse.checkByteStringIsUtf8((ByteString)byteString);
        this.nextPageToken_ = byteString.toStringUtf8();
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
                Parser<ListCollectionIdsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListCollectionIdsResponse> class_ = ListCollectionIdsResponse.class;
                synchronized (ListCollectionIdsResponse.class) {
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
                Object[] arrobject = new Object[]{"collectionIds_", "nextPageToken_"};
                return ListCollectionIdsResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u021a\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListCollectionIdsResponse();
    }

    @Override
    public String getCollectionIds(int n) {
        return (String)this.collectionIds_.get(n);
    }

    @Override
    public ByteString getCollectionIdsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.collectionIds_.get(n)));
    }

    @Override
    public int getCollectionIdsCount() {
        return this.collectionIds_.size();
    }

    @Override
    public List<String> getCollectionIdsList() {
        return this.collectionIds_;
    }

    @Override
    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    @Override
    public ByteString getNextPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.nextPageToken_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListCollectionIdsResponse, Builder>
    implements ListCollectionIdsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllCollectionIds(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addAllCollectionIds((Iterable<String>)iterable);
            return this;
        }

        public Builder addCollectionIds(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addCollectionIds(string);
            return this;
        }

        public Builder addCollectionIdsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addCollectionIdsBytes(byteString);
            return this;
        }

        public Builder clearCollectionIds() {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).clearCollectionIds();
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).clearNextPageToken();
            return this;
        }

        @Override
        public String getCollectionIds(int n) {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIds(n);
        }

        @Override
        public ByteString getCollectionIdsBytes(int n) {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIdsBytes(n);
        }

        @Override
        public int getCollectionIdsCount() {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIdsCount();
        }

        @Override
        public List<String> getCollectionIdsList() {
            return Collections.unmodifiableList(((ListCollectionIdsResponse)this.instance).getCollectionIdsList());
        }

        @Override
        public String getNextPageToken() {
            return ((ListCollectionIdsResponse)this.instance).getNextPageToken();
        }

        @Override
        public ByteString getNextPageTokenBytes() {
            return ((ListCollectionIdsResponse)this.instance).getNextPageTokenBytes();
        }

        public Builder setCollectionIds(int n, String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setCollectionIds(n, string);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }
    }

}

