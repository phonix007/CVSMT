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
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.RunQueryResponseOrBuilder;
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

public final class RunQueryResponse
extends GeneratedMessageLite<RunQueryResponse, Builder>
implements RunQueryResponseOrBuilder {
    private static final RunQueryResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryResponse> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int SKIPPED_RESULTS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private Document document_;
    private Timestamp readTime_;
    private int skippedResults_;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        RunQueryResponse runQueryResponse;
        DEFAULT_INSTANCE = runQueryResponse = new RunQueryResponse();
        GeneratedMessageLite.registerDefaultInstance(RunQueryResponse.class, (GeneratedMessageLite)runQueryResponse);
    }

    private RunQueryResponse() {
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearSkippedResults() {
        this.skippedResults_ = 0;
    }

    private void clearTransaction() {
        this.transaction_ = RunQueryResponse.getDefaultInstance().getTransaction();
    }

    public static RunQueryResponse getDefaultInstance() {
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

    public static Builder newBuilder(RunQueryResponse runQueryResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)runQueryResponse);
    }

    public static RunQueryResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunQueryResponse)RunQueryResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)RunQueryResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RunQueryResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RunQueryResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(InputStream inputStream) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static RunQueryResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RunQueryResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RunQueryResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
    }

    private void setSkippedResults(int n) {
        this.skippedResults_ = n;
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
                Parser<RunQueryResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<RunQueryResponse> class_ = RunQueryResponse.class;
                synchronized (RunQueryResponse.class) {
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
                Object[] arrobject = new Object[]{"document_", "transaction_", "readTime_", "skippedResults_"};
                return RunQueryResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\n\u0003\t\u0004\u0004", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new RunQueryResponse();
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
    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public int getSkippedResults() {
        return this.skippedResults_;
    }

    @Override
    public ByteString getTransaction() {
        return this.transaction_;
    }

    @Override
    public boolean hasDocument() {
        return this.document_ != null;
    }

    @Override
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RunQueryResponse, Builder>
    implements RunQueryResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearDocument();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearReadTime();
            return this;
        }

        public Builder clearSkippedResults() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearSkippedResults();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearTransaction();
            return this;
        }

        @Override
        public Document getDocument() {
            return ((RunQueryResponse)this.instance).getDocument();
        }

        @Override
        public Timestamp getReadTime() {
            return ((RunQueryResponse)this.instance).getReadTime();
        }

        @Override
        public int getSkippedResults() {
            return ((RunQueryResponse)this.instance).getSkippedResults();
        }

        @Override
        public ByteString getTransaction() {
            return ((RunQueryResponse)this.instance).getTransaction();
        }

        @Override
        public boolean hasDocument() {
            return ((RunQueryResponse)this.instance).hasDocument();
        }

        @Override
        public boolean hasReadTime() {
            return ((RunQueryResponse)this.instance).hasReadTime();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setDocument((Document)builder.build());
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setDocument(document);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setSkippedResults(int n) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setSkippedResults(n);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

