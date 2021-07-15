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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentOrBuilder;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListDocumentsResponseOrBuilder;
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

public final class ListDocumentsResponse
extends GeneratedMessageLite<ListDocumentsResponse, Builder>
implements ListDocumentsResponseOrBuilder {
    private static final ListDocumentsResponse DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListDocumentsResponse> PARSER;
    private Internal.ProtobufList<Document> documents_ = ListDocumentsResponse.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        ListDocumentsResponse listDocumentsResponse;
        DEFAULT_INSTANCE = listDocumentsResponse = new ListDocumentsResponse();
        GeneratedMessageLite.registerDefaultInstance(ListDocumentsResponse.class, (GeneratedMessageLite)listDocumentsResponse);
    }

    private ListDocumentsResponse() {
    }

    private void addAllDocuments(Iterable<? extends Document> iterable) {
        this.ensureDocumentsIsMutable();
        AbstractMessageLite.addAll(iterable, this.documents_);
    }

    private void addDocuments(int n, Document document) {
        document.getClass();
        this.ensureDocumentsIsMutable();
        this.documents_.add(n, (Object)document);
    }

    private void addDocuments(Document document) {
        document.getClass();
        this.ensureDocumentsIsMutable();
        this.documents_.add((Object)document);
    }

    private void clearDocuments() {
        this.documents_ = ListDocumentsResponse.emptyProtobufList();
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListDocumentsResponse.getDefaultInstance().getNextPageToken();
    }

    private void ensureDocumentsIsMutable() {
        Internal.ProtobufList<Document> protobufList = this.documents_;
        if (!protobufList.isModifiable()) {
            this.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ListDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListDocumentsResponse listDocumentsResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listDocumentsResponse);
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse)ListDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)ListDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListDocumentsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListDocumentsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListDocumentsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListDocumentsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDocuments(int n) {
        this.ensureDocumentsIsMutable();
        this.documents_.remove(n);
    }

    private void setDocuments(int n, Document document) {
        document.getClass();
        this.ensureDocumentsIsMutable();
        this.documents_.set(n, (Object)document);
    }

    private void setNextPageToken(String string) {
        string.getClass();
        this.nextPageToken_ = string;
    }

    private void setNextPageTokenBytes(ByteString byteString) {
        ListDocumentsResponse.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<ListDocumentsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListDocumentsResponse> class_ = ListDocumentsResponse.class;
                synchronized (ListDocumentsResponse.class) {
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
                Object[] arrobject = new Object[]{"documents_", Document.class, "nextPageToken_"};
                return ListDocumentsResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListDocumentsResponse();
    }

    @Override
    public Document getDocuments(int n) {
        return (Document)this.documents_.get(n);
    }

    @Override
    public int getDocumentsCount() {
        return this.documents_.size();
    }

    @Override
    public List<Document> getDocumentsList() {
        return this.documents_;
    }

    public DocumentOrBuilder getDocumentsOrBuilder(int n) {
        return (DocumentOrBuilder)this.documents_.get(n);
    }

    public List<? extends DocumentOrBuilder> getDocumentsOrBuilderList() {
        return this.documents_;
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
    extends GeneratedMessageLite.Builder<ListDocumentsResponse, Builder>
    implements ListDocumentsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDocuments(Iterable<? extends Document> iterable) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addAllDocuments((Iterable<? extends Document>)iterable);
            return this;
        }

        public Builder addDocuments(int n, Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(n, (Document)builder.build());
            return this;
        }

        public Builder addDocuments(int n, Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(n, document);
            return this;
        }

        public Builder addDocuments(Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments((Document)builder.build());
            return this;
        }

        public Builder addDocuments(Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(document);
            return this;
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).clearDocuments();
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).clearNextPageToken();
            return this;
        }

        @Override
        public Document getDocuments(int n) {
            return ((ListDocumentsResponse)this.instance).getDocuments(n);
        }

        @Override
        public int getDocumentsCount() {
            return ((ListDocumentsResponse)this.instance).getDocumentsCount();
        }

        @Override
        public List<Document> getDocumentsList() {
            return Collections.unmodifiableList(((ListDocumentsResponse)this.instance).getDocumentsList());
        }

        @Override
        public String getNextPageToken() {
            return ((ListDocumentsResponse)this.instance).getNextPageToken();
        }

        @Override
        public ByteString getNextPageTokenBytes() {
            return ((ListDocumentsResponse)this.instance).getNextPageTokenBytes();
        }

        public Builder removeDocuments(int n) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).removeDocuments(n);
            return this;
        }

        public Builder setDocuments(int n, Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setDocuments(n, (Document)builder.build());
            return this;
        }

        public Builder setDocuments(int n, Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setDocuments(n, document);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }
    }

}

