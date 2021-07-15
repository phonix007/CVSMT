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

import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryRequestOrBuilder;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.TransactionOptions;
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

public final class RunQueryRequest
extends GeneratedMessageLite<RunQueryRequest, Builder>
implements RunQueryRequestOrBuilder {
    private static final RunQueryRequest DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private String parent_ = "";
    private int queryTypeCase_ = 0;
    private Object queryType_;

    static {
        RunQueryRequest runQueryRequest;
        DEFAULT_INSTANCE = runQueryRequest = new RunQueryRequest();
        GeneratedMessageLite.registerDefaultInstance(RunQueryRequest.class, (GeneratedMessageLite)runQueryRequest);
    }

    private RunQueryRequest() {
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearParent() {
        this.parent_ = RunQueryRequest.getDefaultInstance().getParent();
    }

    private void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static RunQueryRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = this.consistencySelectorCase_ == 6 && this.consistencySelector_ != TransactionOptions.getDefaultInstance() ? ((TransactionOptions.Builder)TransactionOptions.newBuilder((TransactionOptions)this.consistencySelector_).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial() : transactionOptions;
        this.consistencySelectorCase_ = 6;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = this.consistencySelectorCase_ == 7 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 7;
    }

    private void mergeStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = this.queryTypeCase_ == 2 && this.queryType_ != StructuredQuery.getDefaultInstance() ? ((StructuredQuery.Builder)StructuredQuery.newBuilder((StructuredQuery)this.queryType_).mergeFrom((GeneratedMessageLite)structuredQuery)).buildPartial() : structuredQuery;
        this.queryTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RunQueryRequest runQueryRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)runQueryRequest);
    }

    public static RunQueryRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunQueryRequest)RunQueryRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)RunQueryRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RunQueryRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RunQueryRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(InputStream inputStream) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static RunQueryRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RunQueryRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RunQueryRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = transactionOptions;
        this.consistencySelectorCase_ = 6;
    }

    private void setParent(String string) {
        string.getClass();
        this.parent_ = string;
    }

    private void setParentBytes(ByteString byteString) {
        RunQueryRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.parent_ = byteString.toStringUtf8();
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 7;
    }

    private void setStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = structuredQuery;
        this.queryTypeCase_ = 2;
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.consistencySelectorCase_ = 5;
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
                Parser<RunQueryRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<RunQueryRequest> class_ = RunQueryRequest.class;
                synchronized (RunQueryRequest.class) {
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
                Object[] arrobject = new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", StructuredQuery.class, TransactionOptions.class, Timestamp.class};
                return RunQueryRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new RunQueryRequest();
    }

    @Override
    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber(this.consistencySelectorCase_);
    }

    @Override
    public TransactionOptions getNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            return (TransactionOptions)this.consistencySelector_;
        }
        return TransactionOptions.getDefaultInstance();
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
    public QueryTypeCase getQueryTypeCase() {
        return QueryTypeCase.forNumber(this.queryTypeCase_);
    }

    @Override
    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public StructuredQuery getStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            return (StructuredQuery)this.queryType_;
        }
        return StructuredQuery.getDefaultInstance();
    }

    @Override
    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    @Override
    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 6;
    }

    @Override
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    @Override
    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RunQueryRequest, Builder>
    implements RunQueryRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearNewTransaction() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearNewTransaction();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearParent();
            return this;
        }

        public Builder clearQueryType() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearQueryType();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearStructuredQuery() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearStructuredQuery();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearTransaction();
            return this;
        }

        @Override
        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((RunQueryRequest)this.instance).getConsistencySelectorCase();
        }

        @Override
        public TransactionOptions getNewTransaction() {
            return ((RunQueryRequest)this.instance).getNewTransaction();
        }

        @Override
        public String getParent() {
            return ((RunQueryRequest)this.instance).getParent();
        }

        @Override
        public ByteString getParentBytes() {
            return ((RunQueryRequest)this.instance).getParentBytes();
        }

        @Override
        public QueryTypeCase getQueryTypeCase() {
            return ((RunQueryRequest)this.instance).getQueryTypeCase();
        }

        @Override
        public Timestamp getReadTime() {
            return ((RunQueryRequest)this.instance).getReadTime();
        }

        @Override
        public StructuredQuery getStructuredQuery() {
            return ((RunQueryRequest)this.instance).getStructuredQuery();
        }

        @Override
        public ByteString getTransaction() {
            return ((RunQueryRequest)this.instance).getTransaction();
        }

        @Override
        public boolean hasNewTransaction() {
            return ((RunQueryRequest)this.instance).hasNewTransaction();
        }

        @Override
        public boolean hasReadTime() {
            return ((RunQueryRequest)this.instance).hasReadTime();
        }

        @Override
        public boolean hasStructuredQuery() {
            return ((RunQueryRequest)this.instance).hasStructuredQuery();
        }

        public Builder mergeNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeNewTransaction(transactionOptions);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeStructuredQuery(structuredQuery);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setNewTransaction((TransactionOptions)builder.build());
            return this;
        }

        public Builder setNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setNewTransaction(transactionOptions);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setParentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setStructuredQuery((StructuredQuery)builder.build());
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setStructuredQuery(structuredQuery);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

