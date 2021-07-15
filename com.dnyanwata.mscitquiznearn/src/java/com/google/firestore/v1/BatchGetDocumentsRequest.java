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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsRequestOrBuilder;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.TransactionOptions;
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

public final class BatchGetDocumentsRequest
extends GeneratedMessageLite<BatchGetDocumentsRequest, Builder>
implements BatchGetDocumentsRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BatchGetDocumentsRequest DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile Parser<BatchGetDocumentsRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private String database_ = "";
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();
    private DocumentMask mask_;

    static {
        BatchGetDocumentsRequest batchGetDocumentsRequest;
        DEFAULT_INSTANCE = batchGetDocumentsRequest = new BatchGetDocumentsRequest();
        GeneratedMessageLite.registerDefaultInstance(BatchGetDocumentsRequest.class, (GeneratedMessageLite)batchGetDocumentsRequest);
    }

    private BatchGetDocumentsRequest() {
    }

    private void addAllDocuments(Iterable<String> iterable) {
        this.ensureDocumentsIsMutable();
        AbstractMessageLite.addAll(iterable, this.documents_);
    }

    private void addDocuments(String string) {
        string.getClass();
        this.ensureDocumentsIsMutable();
        this.documents_.add((Object)string);
    }

    private void addDocumentsBytes(ByteString byteString) {
        BatchGetDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureDocumentsIsMutable();
        this.documents_.add((Object)byteString.toStringUtf8());
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearDatabase() {
        this.database_ = BatchGetDocumentsRequest.getDefaultInstance().getDatabase();
    }

    private void clearDocuments() {
        this.documents_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void ensureDocumentsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.documents_;
        if (!protobufList.isModifiable()) {
            this.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static BatchGetDocumentsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    private void mergeNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = this.consistencySelectorCase_ == 5 && this.consistencySelector_ != TransactionOptions.getDefaultInstance() ? ((TransactionOptions.Builder)TransactionOptions.newBuilder((TransactionOptions)this.consistencySelector_).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial() : transactionOptions;
        this.consistencySelectorCase_ = 5;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = this.consistencySelectorCase_ == 7 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 7;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BatchGetDocumentsRequest batchGetDocumentsRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)batchGetDocumentsRequest);
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest)BatchGetDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)BatchGetDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BatchGetDocumentsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDatabase(String string) {
        string.getClass();
        this.database_ = string;
    }

    private void setDatabaseBytes(ByteString byteString) {
        BatchGetDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.database_ = byteString.toStringUtf8();
    }

    private void setDocuments(int n, String string) {
        string.getClass();
        this.ensureDocumentsIsMutable();
        this.documents_.set(n, (Object)string);
    }

    private void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
    }

    private void setNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = transactionOptions;
        this.consistencySelectorCase_ = 5;
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 7;
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.consistencySelectorCase_ = 4;
        this.consistencySelector_ = byteString;
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
                Parser<BatchGetDocumentsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BatchGetDocumentsRequest> class_ = BatchGetDocumentsRequest.class;
                synchronized (BatchGetDocumentsRequest.class) {
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
                Object[] arrobject = new Object[]{"consistencySelector_", "consistencySelectorCase_", "database_", "documents_", "mask_", TransactionOptions.class, Timestamp.class};
                return BatchGetDocumentsRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\t\u0004=\u0000\u0005<\u0000\u0007<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BatchGetDocumentsRequest();
    }

    @Override
    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber(this.consistencySelectorCase_);
    }

    @Override
    public String getDatabase() {
        return this.database_;
    }

    @Override
    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    @Override
    public String getDocuments(int n) {
        return (String)this.documents_.get(n);
    }

    @Override
    public ByteString getDocumentsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.documents_.get(n)));
    }

    @Override
    public int getDocumentsCount() {
        return this.documents_.size();
    }

    @Override
    public List<String> getDocumentsList() {
        return this.documents_;
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
    public TransactionOptions getNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            return (TransactionOptions)this.consistencySelector_;
        }
        return TransactionOptions.getDefaultInstance();
    }

    @Override
    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    @Override
    public boolean hasMask() {
        return this.mask_ != null;
    }

    @Override
    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    @Override
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BatchGetDocumentsRequest, Builder>
    implements BatchGetDocumentsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDocuments(Iterable<String> iterable) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addAllDocuments((Iterable<String>)iterable);
            return this;
        }

        public Builder addDocuments(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addDocuments(string);
            return this;
        }

        public Builder addDocumentsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addDocumentsBytes(byteString);
            return this;
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearDocuments();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearNewTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearNewTransaction();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearTransaction();
            return this;
        }

        @Override
        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((BatchGetDocumentsRequest)this.instance).getConsistencySelectorCase();
        }

        @Override
        public String getDatabase() {
            return ((BatchGetDocumentsRequest)this.instance).getDatabase();
        }

        @Override
        public ByteString getDatabaseBytes() {
            return ((BatchGetDocumentsRequest)this.instance).getDatabaseBytes();
        }

        @Override
        public String getDocuments(int n) {
            return ((BatchGetDocumentsRequest)this.instance).getDocuments(n);
        }

        @Override
        public ByteString getDocumentsBytes(int n) {
            return ((BatchGetDocumentsRequest)this.instance).getDocumentsBytes(n);
        }

        @Override
        public int getDocumentsCount() {
            return ((BatchGetDocumentsRequest)this.instance).getDocumentsCount();
        }

        @Override
        public List<String> getDocumentsList() {
            return Collections.unmodifiableList(((BatchGetDocumentsRequest)this.instance).getDocumentsList());
        }

        @Override
        public DocumentMask getMask() {
            return ((BatchGetDocumentsRequest)this.instance).getMask();
        }

        @Override
        public TransactionOptions getNewTransaction() {
            return ((BatchGetDocumentsRequest)this.instance).getNewTransaction();
        }

        @Override
        public Timestamp getReadTime() {
            return ((BatchGetDocumentsRequest)this.instance).getReadTime();
        }

        @Override
        public ByteString getTransaction() {
            return ((BatchGetDocumentsRequest)this.instance).getTransaction();
        }

        @Override
        public boolean hasMask() {
            return ((BatchGetDocumentsRequest)this.instance).hasMask();
        }

        @Override
        public boolean hasNewTransaction() {
            return ((BatchGetDocumentsRequest)this.instance).hasNewTransaction();
        }

        @Override
        public boolean hasReadTime() {
            return ((BatchGetDocumentsRequest)this.instance).hasReadTime();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeNewTransaction(transactionOptions);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setDocuments(int n, String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDocuments(n, string);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setNewTransaction((TransactionOptions)builder.build());
            return this;
        }

        public Builder setNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setNewTransaction(transactionOptions);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

