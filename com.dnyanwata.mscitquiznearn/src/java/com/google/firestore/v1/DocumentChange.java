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
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Integer
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
import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentChangeOrBuilder;
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

public final class DocumentChange
extends GeneratedMessageLite<DocumentChange, Builder>
implements DocumentChangeOrBuilder {
    private static final DocumentChange DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentChange> PARSER;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private Document document_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private Internal.IntList removedTargetIds_ = DocumentChange.emptyIntList();
    private int targetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = DocumentChange.emptyIntList();

    static {
        DocumentChange documentChange;
        DEFAULT_INSTANCE = documentChange = new DocumentChange();
        GeneratedMessageLite.registerDefaultInstance(DocumentChange.class, (GeneratedMessageLite)documentChange);
    }

    private DocumentChange() {
    }

    private void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureRemovedTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (List)this.removedTargetIds_);
    }

    private void addAllTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (List)this.targetIds_);
    }

    private void addRemovedTargetIds(int n) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(n);
    }

    private void addTargetIds(int n) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.addInt(n);
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearRemovedTargetIds() {
        this.removedTargetIds_ = DocumentChange.emptyIntList();
    }

    private void clearTargetIds() {
        this.targetIds_ = DocumentChange.emptyIntList();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        Internal.IntList intList = this.removedTargetIds_;
        if (!intList.isModifiable()) {
            this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)intList);
        }
    }

    private void ensureTargetIdsIsMutable() {
        Internal.IntList intList = this.targetIds_;
        if (!intList.isModifiable()) {
            this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)intList);
        }
    }

    public static DocumentChange getDefaultInstance() {
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

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DocumentChange documentChange) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentChange);
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentChange)DocumentChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)DocumentChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(InputStream inputStream) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DocumentChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
    }

    private void setRemovedTargetIds(int n, int n2) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(n, n2);
    }

    private void setTargetIds(int n, int n2) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.setInt(n, n2);
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
                Parser<DocumentChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DocumentChange> class_ = DocumentChange.class;
                synchronized (DocumentChange.class) {
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
                Object[] arrobject = new Object[]{"document_", "targetIds_", "removedTargetIds_"};
                return DocumentChange.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0002\u0000\u0001\t\u0005'\u0006'", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DocumentChange();
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
    public int getRemovedTargetIds(int n) {
        return this.removedTargetIds_.getInt(n);
    }

    @Override
    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    @Override
    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    @Override
    public int getTargetIds(int n) {
        return this.targetIds_.getInt(n);
    }

    @Override
    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    @Override
    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    @Override
    public boolean hasDocument() {
        return this.document_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentChange, Builder>
    implements DocumentChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addAllRemovedTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addAllTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addAllTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addRemovedTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addRemovedTargetIds(n);
            return this;
        }

        public Builder addTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addTargetIds(n);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearDocument();
            return this;
        }

        public Builder clearRemovedTargetIds() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearRemovedTargetIds();
            return this;
        }

        public Builder clearTargetIds() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearTargetIds();
            return this;
        }

        @Override
        public Document getDocument() {
            return ((DocumentChange)this.instance).getDocument();
        }

        @Override
        public int getRemovedTargetIds(int n) {
            return ((DocumentChange)this.instance).getRemovedTargetIds(n);
        }

        @Override
        public int getRemovedTargetIdsCount() {
            return ((DocumentChange)this.instance).getRemovedTargetIdsCount();
        }

        @Override
        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((DocumentChange)this.instance).getRemovedTargetIdsList());
        }

        @Override
        public int getTargetIds(int n) {
            return ((DocumentChange)this.instance).getTargetIds(n);
        }

        @Override
        public int getTargetIdsCount() {
            return ((DocumentChange)this.instance).getTargetIdsCount();
        }

        @Override
        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((DocumentChange)this.instance).getTargetIdsList());
        }

        @Override
        public boolean hasDocument() {
            return ((DocumentChange)this.instance).hasDocument();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).mergeDocument(document);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setDocument((Document)builder.build());
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setDocument(document);
            return this;
        }

        public Builder setRemovedTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setRemovedTargetIds(n, n2);
            return this;
        }

        public Builder setTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setTargetIds(n, n2);
            return this;
        }
    }

}

