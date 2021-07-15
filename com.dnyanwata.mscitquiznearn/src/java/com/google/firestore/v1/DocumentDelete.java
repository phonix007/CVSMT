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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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

import com.google.firestore.v1.DocumentDelete;
import com.google.firestore.v1.DocumentDeleteOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DocumentDelete
extends GeneratedMessageLite<DocumentDelete, Builder>
implements DocumentDeleteOrBuilder {
    private static final DocumentDelete DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentDelete> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    private String document_ = "";
    private Timestamp readTime_;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private Internal.IntList removedTargetIds_ = DocumentDelete.emptyIntList();

    static {
        DocumentDelete documentDelete;
        DEFAULT_INSTANCE = documentDelete = new DocumentDelete();
        GeneratedMessageLite.registerDefaultInstance(DocumentDelete.class, (GeneratedMessageLite)documentDelete);
    }

    private DocumentDelete() {
    }

    private void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureRemovedTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (List)this.removedTargetIds_);
    }

    private void addRemovedTargetIds(int n) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(n);
    }

    private void clearDocument() {
        this.document_ = DocumentDelete.getDefaultInstance().getDocument();
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearRemovedTargetIds() {
        this.removedTargetIds_ = DocumentDelete.emptyIntList();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        Internal.IntList intList = this.removedTargetIds_;
        if (!intList.isModifiable()) {
            this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)intList);
        }
    }

    public static DocumentDelete getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.readTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.readTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.readTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DocumentDelete documentDelete) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentDelete);
    }

    public static DocumentDelete parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentDelete)DocumentDelete.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentDelete parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentDelete)DocumentDelete.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentDelete parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentDelete parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentDelete parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentDelete parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentDelete parseFrom(InputStream inputStream) throws IOException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentDelete parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentDelete parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DocumentDelete parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentDelete parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentDelete parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentDelete)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentDelete> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(String string) {
        string.getClass();
        this.document_ = string;
    }

    private void setDocumentBytes(ByteString byteString) {
        DocumentDelete.checkByteStringIsUtf8((ByteString)byteString);
        this.document_ = byteString.toStringUtf8();
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
    }

    private void setRemovedTargetIds(int n, int n2) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(n, n2);
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
                Parser<DocumentDelete> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DocumentDelete> class_ = DocumentDelete.class;
                synchronized (DocumentDelete.class) {
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
                Object[] arrobject = new Object[]{"document_", "readTime_", "removedTargetIds_"};
                return DocumentDelete.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u0208\u0004\t\u0006'", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DocumentDelete();
    }

    @Override
    public String getDocument() {
        return this.document_;
    }

    @Override
    public ByteString getDocumentBytes() {
        return ByteString.copyFromUtf8((String)this.document_);
    }

    @Override
    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
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
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentDelete, Builder>
    implements DocumentDeleteOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).addAllRemovedTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addRemovedTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).addRemovedTargetIds(n);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).clearDocument();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).clearReadTime();
            return this;
        }

        public Builder clearRemovedTargetIds() {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).clearRemovedTargetIds();
            return this;
        }

        @Override
        public String getDocument() {
            return ((DocumentDelete)this.instance).getDocument();
        }

        @Override
        public ByteString getDocumentBytes() {
            return ((DocumentDelete)this.instance).getDocumentBytes();
        }

        @Override
        public Timestamp getReadTime() {
            return ((DocumentDelete)this.instance).getReadTime();
        }

        @Override
        public int getRemovedTargetIds(int n) {
            return ((DocumentDelete)this.instance).getRemovedTargetIds(n);
        }

        @Override
        public int getRemovedTargetIdsCount() {
            return ((DocumentDelete)this.instance).getRemovedTargetIdsCount();
        }

        @Override
        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((DocumentDelete)this.instance).getRemovedTargetIdsList());
        }

        @Override
        public boolean hasReadTime() {
            return ((DocumentDelete)this.instance).hasReadTime();
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocument(String string) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).setDocument(string);
            return this;
        }

        public Builder setDocumentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).setDocumentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setRemovedTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentDelete)this.instance).setRemovedTargetIds(n, n2);
            return this;
        }
    }

}

