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

import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.CreateDocumentRequestOrBuilder;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
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

public final class CreateDocumentRequest
extends GeneratedMessageLite<CreateDocumentRequest, Builder>
implements CreateDocumentRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final CreateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_ID_FIELD_NUMBER = 3;
    public static final int MASK_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<CreateDocumentRequest> PARSER;
    private String collectionId_ = "";
    private String documentId_ = "";
    private Document document_;
    private DocumentMask mask_;
    private String parent_ = "";

    static {
        CreateDocumentRequest createDocumentRequest;
        DEFAULT_INSTANCE = createDocumentRequest = new CreateDocumentRequest();
        GeneratedMessageLite.registerDefaultInstance(CreateDocumentRequest.class, (GeneratedMessageLite)createDocumentRequest);
    }

    private CreateDocumentRequest() {
    }

    private void clearCollectionId() {
        this.collectionId_ = CreateDocumentRequest.getDefaultInstance().getCollectionId();
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearDocumentId() {
        this.documentId_ = CreateDocumentRequest.getDefaultInstance().getDocumentId();
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearParent() {
        this.parent_ = CreateDocumentRequest.getDefaultInstance().getParent();
    }

    public static CreateDocumentRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocument(Document document) {
        document.getClass();
        Document document2 = this.document_;
        if (document2 != null && document2 != Document.getDefaultInstance()) {
            this.document_ = (Document)((Document.Builder)Document.newBuilder(this.document_).mergeFrom((GeneratedMessageLite)document)).buildPartial();
            return;
        }
        this.document_ = document;
    }

    private void mergeMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CreateDocumentRequest createDocumentRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)createDocumentRequest);
    }

    public static CreateDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreateDocumentRequest)CreateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CreateDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)CreateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CreateDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CreateDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CreateDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static CreateDocumentRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CreateDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CreateDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionId(String string) {
        string.getClass();
        this.collectionId_ = string;
    }

    private void setCollectionIdBytes(ByteString byteString) {
        CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.collectionId_ = byteString.toStringUtf8();
    }

    private void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
    }

    private void setDocumentId(String string) {
        string.getClass();
        this.documentId_ = string;
    }

    private void setDocumentIdBytes(ByteString byteString) {
        CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.documentId_ = byteString.toStringUtf8();
    }

    private void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
    }

    private void setParent(String string) {
        string.getClass();
        this.parent_ = string;
    }

    private void setParentBytes(ByteString byteString) {
        CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<CreateDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<CreateDocumentRequest> class_ = CreateDocumentRequest.class;
                synchronized (CreateDocumentRequest.class) {
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
                Object[] arrobject = new Object[]{"parent_", "collectionId_", "documentId_", "document_", "mask_"};
                return CreateDocumentRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\t\u0005\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new CreateDocumentRequest();
    }

    @Override
    public String getCollectionId() {
        return this.collectionId_;
    }

    @Override
    public ByteString getCollectionIdBytes() {
        return ByteString.copyFromUtf8((String)this.collectionId_);
    }

    @Override
    public Document getDocument() {
        Document document = this.document_;
        if (document == null) {
            document = Document.getDefaultInstance();
        }
        return document;
    }

    @Override
    public String getDocumentId() {
        return this.documentId_;
    }

    @Override
    public ByteString getDocumentIdBytes() {
        return ByteString.copyFromUtf8((String)this.documentId_);
    }

    @Override
    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    @Override
    public String getParent() {
        return this.parent_;
    }

    @Override
    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
    }

    @Override
    public boolean hasDocument() {
        return this.document_ != null;
    }

    @Override
    public boolean hasMask() {
        return this.mask_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CreateDocumentRequest, Builder>
    implements CreateDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCollectionId() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearCollectionId();
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentId() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearDocumentId();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearParent();
            return this;
        }

        @Override
        public String getCollectionId() {
            return ((CreateDocumentRequest)this.instance).getCollectionId();
        }

        @Override
        public ByteString getCollectionIdBytes() {
            return ((CreateDocumentRequest)this.instance).getCollectionIdBytes();
        }

        @Override
        public Document getDocument() {
            return ((CreateDocumentRequest)this.instance).getDocument();
        }

        @Override
        public String getDocumentId() {
            return ((CreateDocumentRequest)this.instance).getDocumentId();
        }

        @Override
        public ByteString getDocumentIdBytes() {
            return ((CreateDocumentRequest)this.instance).getDocumentIdBytes();
        }

        @Override
        public DocumentMask getMask() {
            return ((CreateDocumentRequest)this.instance).getMask();
        }

        @Override
        public String getParent() {
            return ((CreateDocumentRequest)this.instance).getParent();
        }

        @Override
        public ByteString getParentBytes() {
            return ((CreateDocumentRequest)this.instance).getParentBytes();
        }

        @Override
        public boolean hasDocument() {
            return ((CreateDocumentRequest)this.instance).hasDocument();
        }

        @Override
        public boolean hasMask() {
            return ((CreateDocumentRequest)this.instance).hasMask();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder setCollectionId(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setCollectionId(string);
            return this;
        }

        public Builder setCollectionIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setCollectionIdBytes(byteString);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocument((Document)builder.build());
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocument(document);
            return this;
        }

        public Builder setDocumentId(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocumentId(string);
            return this;
        }

        public Builder setDocumentIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocumentIdBytes(byteString);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setParentBytes(byteString);
            return this;
        }
    }

}

