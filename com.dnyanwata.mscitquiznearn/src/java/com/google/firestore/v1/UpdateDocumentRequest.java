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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.firestore.v1.UpdateDocumentRequestOrBuilder;
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

public final class UpdateDocumentRequest
extends GeneratedMessageLite<UpdateDocumentRequest, Builder>
implements UpdateDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UpdateDocumentRequest DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile Parser<UpdateDocumentRequest> PARSER;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private Precondition currentDocument_;
    private Document document_;
    private DocumentMask mask_;
    private DocumentMask updateMask_;

    static {
        UpdateDocumentRequest updateDocumentRequest;
        DEFAULT_INSTANCE = updateDocumentRequest = new UpdateDocumentRequest();
        GeneratedMessageLite.registerDefaultInstance(UpdateDocumentRequest.class, (GeneratedMessageLite)updateDocumentRequest);
    }

    private UpdateDocumentRequest() {
    }

    private void clearCurrentDocument() {
        this.currentDocument_ = null;
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearUpdateMask() {
        this.updateMask_ = null;
    }

    public static UpdateDocumentRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCurrentDocument(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.currentDocument_;
        if (precondition2 != null && precondition2 != Precondition.getDefaultInstance()) {
            this.currentDocument_ = (Precondition)((Precondition.Builder)Precondition.newBuilder(this.currentDocument_).mergeFrom((GeneratedMessageLite)precondition)).buildPartial();
            return;
        }
        this.currentDocument_ = precondition;
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

    private void mergeUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.updateMask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.updateMask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.updateMask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.updateMask_ = documentMask;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UpdateDocumentRequest updateDocumentRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)updateDocumentRequest);
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest)UpdateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)UpdateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static UpdateDocumentRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static UpdateDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<UpdateDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCurrentDocument(Precondition precondition) {
        precondition.getClass();
        this.currentDocument_ = precondition;
    }

    private void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
    }

    private void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
    }

    private void setUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.updateMask_ = documentMask;
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
                Parser<UpdateDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<UpdateDocumentRequest> class_ = UpdateDocumentRequest.class;
                synchronized (UpdateDocumentRequest.class) {
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
                Object[] arrobject = new Object[]{"document_", "updateMask_", "mask_", "currentDocument_"};
                return UpdateDocumentRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new UpdateDocumentRequest();
    }

    @Override
    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        if (precondition == null) {
            precondition = Precondition.getDefaultInstance();
        }
        return precondition;
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
    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    @Override
    public DocumentMask getUpdateMask() {
        DocumentMask documentMask = this.updateMask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    @Override
    public boolean hasCurrentDocument() {
        return this.currentDocument_ != null;
    }

    @Override
    public boolean hasDocument() {
        return this.document_ != null;
    }

    @Override
    public boolean hasMask() {
        return this.mask_ != null;
    }

    @Override
    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<UpdateDocumentRequest, Builder>
    implements UpdateDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrentDocument() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearDocument();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearUpdateMask() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearUpdateMask();
            return this;
        }

        @Override
        public Precondition getCurrentDocument() {
            return ((UpdateDocumentRequest)this.instance).getCurrentDocument();
        }

        @Override
        public Document getDocument() {
            return ((UpdateDocumentRequest)this.instance).getDocument();
        }

        @Override
        public DocumentMask getMask() {
            return ((UpdateDocumentRequest)this.instance).getMask();
        }

        @Override
        public DocumentMask getUpdateMask() {
            return ((UpdateDocumentRequest)this.instance).getUpdateMask();
        }

        @Override
        public boolean hasCurrentDocument() {
            return ((UpdateDocumentRequest)this.instance).hasCurrentDocument();
        }

        @Override
        public boolean hasDocument() {
            return ((UpdateDocumentRequest)this.instance).hasDocument();
        }

        @Override
        public boolean hasMask() {
            return ((UpdateDocumentRequest)this.instance).hasMask();
        }

        @Override
        public boolean hasUpdateMask() {
            return ((UpdateDocumentRequest)this.instance).hasUpdateMask();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeUpdateMask(documentMask);
            return this;
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setCurrentDocument((Precondition)builder.build());
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setDocument((Document)builder.build());
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setDocument(document);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setUpdateMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setUpdateMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setUpdateMask(documentMask);
            return this;
        }
    }

}

