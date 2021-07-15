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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BatchGetDocumentsResponseOrBuilder;
import com.google.firestore.v1.Document;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BatchGetDocumentsResponse
extends GeneratedMessageLite<BatchGetDocumentsResponse, Builder>
implements BatchGetDocumentsResponseOrBuilder {
    private static final BatchGetDocumentsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile Parser<BatchGetDocumentsResponse> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private Timestamp readTime_;
    private int resultCase_ = 0;
    private Object result_;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        BatchGetDocumentsResponse batchGetDocumentsResponse;
        DEFAULT_INSTANCE = batchGetDocumentsResponse = new BatchGetDocumentsResponse();
        GeneratedMessageLite.registerDefaultInstance(BatchGetDocumentsResponse.class, (GeneratedMessageLite)batchGetDocumentsResponse);
    }

    private BatchGetDocumentsResponse() {
    }

    private void clearFound() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearMissing() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    private void clearTransaction() {
        this.transaction_ = BatchGetDocumentsResponse.getDefaultInstance().getTransaction();
    }

    public static BatchGetDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeFound(Document document) {
        document.getClass();
        this.result_ = this.resultCase_ == 1 && this.result_ != Document.getDefaultInstance() ? ((Document.Builder)Document.newBuilder((Document)this.result_).mergeFrom((GeneratedMessageLite)document)).buildPartial() : document;
        this.resultCase_ = 1;
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

    public static Builder newBuilder(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)batchGetDocumentsResponse);
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse)BatchGetDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)BatchGetDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BatchGetDocumentsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFound(Document document) {
        document.getClass();
        this.result_ = document;
        this.resultCase_ = 1;
    }

    private void setMissing(String string) {
        string.getClass();
        this.resultCase_ = 2;
        this.result_ = string;
    }

    private void setMissingBytes(ByteString byteString) {
        BatchGetDocumentsResponse.checkByteStringIsUtf8((ByteString)byteString);
        this.result_ = byteString.toStringUtf8();
        this.resultCase_ = 2;
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.transaction_ = byteString;
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
                Parser<BatchGetDocumentsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BatchGetDocumentsResponse> class_ = BatchGetDocumentsResponse.class;
                synchronized (BatchGetDocumentsResponse.class) {
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
                Object[] arrobject = new Object[]{"result_", "resultCase_", Document.class, "transaction_", "readTime_"};
                return BatchGetDocumentsResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002\u023b\u0000\u0003\n\u0004\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BatchGetDocumentsResponse();
    }

    @Override
    public Document getFound() {
        if (this.resultCase_ == 1) {
            return (Document)this.result_;
        }
        return Document.getDefaultInstance();
    }

    @Override
    public String getMissing() {
        if (this.resultCase_ == 2) {
            return (String)this.result_;
        }
        return "";
    }

    @Override
    public ByteString getMissingBytes() {
        String string = this.resultCase_ == 2 ? (String)this.result_ : "";
        return ByteString.copyFromUtf8((String)string);
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
    public ResultCase getResultCase() {
        return ResultCase.forNumber(this.resultCase_);
    }

    @Override
    public ByteString getTransaction() {
        return this.transaction_;
    }

    @Override
    public boolean hasFound() {
        return this.resultCase_ == 1;
    }

    @Override
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BatchGetDocumentsResponse, Builder>
    implements BatchGetDocumentsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFound() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearFound();
            return this;
        }

        public Builder clearMissing() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearMissing();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResult() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearResult();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearTransaction();
            return this;
        }

        @Override
        public Document getFound() {
            return ((BatchGetDocumentsResponse)this.instance).getFound();
        }

        @Override
        public String getMissing() {
            return ((BatchGetDocumentsResponse)this.instance).getMissing();
        }

        @Override
        public ByteString getMissingBytes() {
            return ((BatchGetDocumentsResponse)this.instance).getMissingBytes();
        }

        @Override
        public Timestamp getReadTime() {
            return ((BatchGetDocumentsResponse)this.instance).getReadTime();
        }

        @Override
        public ResultCase getResultCase() {
            return ((BatchGetDocumentsResponse)this.instance).getResultCase();
        }

        @Override
        public ByteString getTransaction() {
            return ((BatchGetDocumentsResponse)this.instance).getTransaction();
        }

        @Override
        public boolean hasFound() {
            return ((BatchGetDocumentsResponse)this.instance).hasFound();
        }

        @Override
        public boolean hasReadTime() {
            return ((BatchGetDocumentsResponse)this.instance).hasReadTime();
        }

        public Builder mergeFound(Document document) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).mergeFound(document);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setFound(Document.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setFound((Document)builder.build());
            return this;
        }

        public Builder setFound(Document document) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setFound(document);
            return this;
        }

        public Builder setMissing(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setMissing(string);
            return this;
        }

        public Builder setMissingBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setMissingBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

