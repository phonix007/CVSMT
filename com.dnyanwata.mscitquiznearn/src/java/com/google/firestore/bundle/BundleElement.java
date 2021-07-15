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
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundleElement;
import com.google.firestore.bundle.BundleElementOrBuilder;
import com.google.firestore.bundle.BundleMetadata;
import com.google.firestore.bundle.BundledDocumentMetadata;
import com.google.firestore.bundle.NamedQuery;
import com.google.firestore.v1.Document;
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

public final class BundleElement
extends GeneratedMessageLite<BundleElement, Builder>
implements BundleElementOrBuilder {
    private static final BundleElement DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_METADATA_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAMED_QUERY_FIELD_NUMBER = 2;
    private static volatile Parser<BundleElement> PARSER;
    private int elementTypeCase_ = 0;
    private Object elementType_;

    static {
        BundleElement bundleElement;
        DEFAULT_INSTANCE = bundleElement = new BundleElement();
        GeneratedMessageLite.registerDefaultInstance(BundleElement.class, (GeneratedMessageLite)bundleElement);
    }

    private BundleElement() {
    }

    private void clearDocument() {
        if (this.elementTypeCase_ == 4) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    private void clearDocumentMetadata() {
        if (this.elementTypeCase_ == 3) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    private void clearElementType() {
        this.elementTypeCase_ = 0;
        this.elementType_ = null;
    }

    private void clearMetadata() {
        if (this.elementTypeCase_ == 1) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    private void clearNamedQuery() {
        if (this.elementTypeCase_ == 2) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    public static BundleElement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocument(Document document) {
        document.getClass();
        this.elementType_ = this.elementTypeCase_ == 4 && this.elementType_ != Document.getDefaultInstance() ? ((Document.Builder)Document.newBuilder((Document)this.elementType_).mergeFrom((GeneratedMessageLite)document)).buildPartial() : document;
        this.elementTypeCase_ = 4;
    }

    private void mergeDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
        bundledDocumentMetadata.getClass();
        this.elementType_ = this.elementTypeCase_ == 3 && this.elementType_ != BundledDocumentMetadata.getDefaultInstance() ? ((BundledDocumentMetadata.Builder)BundledDocumentMetadata.newBuilder((BundledDocumentMetadata)this.elementType_).mergeFrom((GeneratedMessageLite)bundledDocumentMetadata)).buildPartial() : bundledDocumentMetadata;
        this.elementTypeCase_ = 3;
    }

    private void mergeMetadata(BundleMetadata bundleMetadata) {
        bundleMetadata.getClass();
        this.elementType_ = this.elementTypeCase_ == 1 && this.elementType_ != BundleMetadata.getDefaultInstance() ? ((BundleMetadata.Builder)BundleMetadata.newBuilder((BundleMetadata)this.elementType_).mergeFrom((GeneratedMessageLite)bundleMetadata)).buildPartial() : bundleMetadata;
        this.elementTypeCase_ = 1;
    }

    private void mergeNamedQuery(NamedQuery namedQuery) {
        namedQuery.getClass();
        this.elementType_ = this.elementTypeCase_ == 2 && this.elementType_ != NamedQuery.getDefaultInstance() ? ((NamedQuery.Builder)NamedQuery.newBuilder((NamedQuery)this.elementType_).mergeFrom((GeneratedMessageLite)namedQuery)).buildPartial() : namedQuery;
        this.elementTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BundleElement bundleElement) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundleElement);
    }

    public static BundleElement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundleElement)BundleElement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundleElement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleElement)BundleElement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleElement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BundleElement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleElement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BundleElement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleElement parseFrom(InputStream inputStream) throws IOException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundleElement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleElement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BundleElement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleElement parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BundleElement parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleElement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BundleElement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(Document document) {
        document.getClass();
        this.elementType_ = document;
        this.elementTypeCase_ = 4;
    }

    private void setDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
        bundledDocumentMetadata.getClass();
        this.elementType_ = bundledDocumentMetadata;
        this.elementTypeCase_ = 3;
    }

    private void setMetadata(BundleMetadata bundleMetadata) {
        bundleMetadata.getClass();
        this.elementType_ = bundleMetadata;
        this.elementTypeCase_ = 1;
    }

    private void setNamedQuery(NamedQuery namedQuery) {
        namedQuery.getClass();
        this.elementType_ = namedQuery;
        this.elementTypeCase_ = 2;
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
                Parser<BundleElement> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BundleElement> class_ = BundleElement.class;
                synchronized (BundleElement.class) {
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
                Object[] arrobject = new Object[]{"elementType_", "elementTypeCase_", BundleMetadata.class, NamedQuery.class, BundledDocumentMetadata.class, Document.class};
                return BundleElement.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BundleElement();
    }

    @Override
    public Document getDocument() {
        if (this.elementTypeCase_ == 4) {
            return (Document)this.elementType_;
        }
        return Document.getDefaultInstance();
    }

    @Override
    public BundledDocumentMetadata getDocumentMetadata() {
        if (this.elementTypeCase_ == 3) {
            return (BundledDocumentMetadata)this.elementType_;
        }
        return BundledDocumentMetadata.getDefaultInstance();
    }

    @Override
    public ElementTypeCase getElementTypeCase() {
        return ElementTypeCase.forNumber(this.elementTypeCase_);
    }

    @Override
    public BundleMetadata getMetadata() {
        if (this.elementTypeCase_ == 1) {
            return (BundleMetadata)this.elementType_;
        }
        return BundleMetadata.getDefaultInstance();
    }

    @Override
    public NamedQuery getNamedQuery() {
        if (this.elementTypeCase_ == 2) {
            return (NamedQuery)this.elementType_;
        }
        return NamedQuery.getDefaultInstance();
    }

    @Override
    public boolean hasDocument() {
        return this.elementTypeCase_ == 4;
    }

    @Override
    public boolean hasDocumentMetadata() {
        return this.elementTypeCase_ == 3;
    }

    @Override
    public boolean hasMetadata() {
        return this.elementTypeCase_ == 1;
    }

    @Override
    public boolean hasNamedQuery() {
        return this.elementTypeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BundleElement, Builder>
    implements BundleElementOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((BundleElement)this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentMetadata() {
            this.copyOnWrite();
            ((BundleElement)this.instance).clearDocumentMetadata();
            return this;
        }

        public Builder clearElementType() {
            this.copyOnWrite();
            ((BundleElement)this.instance).clearElementType();
            return this;
        }

        public Builder clearMetadata() {
            this.copyOnWrite();
            ((BundleElement)this.instance).clearMetadata();
            return this;
        }

        public Builder clearNamedQuery() {
            this.copyOnWrite();
            ((BundleElement)this.instance).clearNamedQuery();
            return this;
        }

        @Override
        public Document getDocument() {
            return ((BundleElement)this.instance).getDocument();
        }

        @Override
        public BundledDocumentMetadata getDocumentMetadata() {
            return ((BundleElement)this.instance).getDocumentMetadata();
        }

        @Override
        public ElementTypeCase getElementTypeCase() {
            return ((BundleElement)this.instance).getElementTypeCase();
        }

        @Override
        public BundleMetadata getMetadata() {
            return ((BundleElement)this.instance).getMetadata();
        }

        @Override
        public NamedQuery getNamedQuery() {
            return ((BundleElement)this.instance).getNamedQuery();
        }

        @Override
        public boolean hasDocument() {
            return ((BundleElement)this.instance).hasDocument();
        }

        @Override
        public boolean hasDocumentMetadata() {
            return ((BundleElement)this.instance).hasDocumentMetadata();
        }

        @Override
        public boolean hasMetadata() {
            return ((BundleElement)this.instance).hasMetadata();
        }

        @Override
        public boolean hasNamedQuery() {
            return ((BundleElement)this.instance).hasNamedQuery();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((BundleElement)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
            this.copyOnWrite();
            ((BundleElement)this.instance).mergeDocumentMetadata(bundledDocumentMetadata);
            return this;
        }

        public Builder mergeMetadata(BundleMetadata bundleMetadata) {
            this.copyOnWrite();
            ((BundleElement)this.instance).mergeMetadata(bundleMetadata);
            return this;
        }

        public Builder mergeNamedQuery(NamedQuery namedQuery) {
            this.copyOnWrite();
            ((BundleElement)this.instance).mergeNamedQuery(namedQuery);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setDocument((Document)builder.build());
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setDocument(document);
            return this;
        }

        public Builder setDocumentMetadata(BundledDocumentMetadata.Builder builder) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setDocumentMetadata((BundledDocumentMetadata)builder.build());
            return this;
        }

        public Builder setDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setDocumentMetadata(bundledDocumentMetadata);
            return this;
        }

        public Builder setMetadata(BundleMetadata.Builder builder) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setMetadata((BundleMetadata)builder.build());
            return this;
        }

        public Builder setMetadata(BundleMetadata bundleMetadata) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setMetadata(bundleMetadata);
            return this;
        }

        public Builder setNamedQuery(NamedQuery.Builder builder) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setNamedQuery((NamedQuery)builder.build());
            return this;
        }

        public Builder setNamedQuery(NamedQuery namedQuery) {
            this.copyOnWrite();
            ((BundleElement)this.instance).setNamedQuery(namedQuery);
            return this;
        }
    }

}

