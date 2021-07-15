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
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.CommitResponse;
import com.google.firestore.v1.CommitResponseOrBuilder;
import com.google.firestore.v1.WriteResult;
import com.google.firestore.v1.WriteResultOrBuilder;
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

public final class CommitResponse
extends GeneratedMessageLite<CommitResponse, Builder>
implements CommitResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final CommitResponse DEFAULT_INSTANCE;
    private static volatile Parser<CommitResponse> PARSER;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private Timestamp commitTime_;
    private Internal.ProtobufList<WriteResult> writeResults_ = CommitResponse.emptyProtobufList();

    static {
        CommitResponse commitResponse;
        DEFAULT_INSTANCE = commitResponse = new CommitResponse();
        GeneratedMessageLite.registerDefaultInstance(CommitResponse.class, (GeneratedMessageLite)commitResponse);
    }

    private CommitResponse() {
    }

    private void addAllWriteResults(Iterable<? extends WriteResult> iterable) {
        this.ensureWriteResultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.writeResults_);
    }

    private void addWriteResults(int n, WriteResult writeResult) {
        writeResult.getClass();
        this.ensureWriteResultsIsMutable();
        this.writeResults_.add(n, (Object)writeResult);
    }

    private void addWriteResults(WriteResult writeResult) {
        writeResult.getClass();
        this.ensureWriteResultsIsMutable();
        this.writeResults_.add((Object)writeResult);
    }

    private void clearCommitTime() {
        this.commitTime_ = null;
    }

    private void clearWriteResults() {
        this.writeResults_ = CommitResponse.emptyProtobufList();
    }

    private void ensureWriteResultsIsMutable() {
        Internal.ProtobufList<WriteResult> protobufList = this.writeResults_;
        if (!protobufList.isModifiable()) {
            this.writeResults_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static CommitResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCommitTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.commitTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.commitTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.commitTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.commitTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CommitResponse commitResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commitResponse);
    }

    public static CommitResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommitResponse)CommitResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitResponse)CommitResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CommitResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CommitResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitResponse parseFrom(InputStream inputStream) throws IOException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static CommitResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CommitResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CommitResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWriteResults(int n) {
        this.ensureWriteResultsIsMutable();
        this.writeResults_.remove(n);
    }

    private void setCommitTime(Timestamp timestamp) {
        timestamp.getClass();
        this.commitTime_ = timestamp;
    }

    private void setWriteResults(int n, WriteResult writeResult) {
        writeResult.getClass();
        this.ensureWriteResultsIsMutable();
        this.writeResults_.set(n, (Object)writeResult);
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
                Parser<CommitResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<CommitResponse> class_ = CommitResponse.class;
                synchronized (CommitResponse.class) {
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
                Object[] arrobject = new Object[]{"writeResults_", WriteResult.class, "commitTime_"};
                return CommitResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new CommitResponse();
    }

    @Override
    public Timestamp getCommitTime() {
        Timestamp timestamp = this.commitTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public WriteResult getWriteResults(int n) {
        return (WriteResult)this.writeResults_.get(n);
    }

    @Override
    public int getWriteResultsCount() {
        return this.writeResults_.size();
    }

    @Override
    public List<WriteResult> getWriteResultsList() {
        return this.writeResults_;
    }

    public WriteResultOrBuilder getWriteResultsOrBuilder(int n) {
        return (WriteResultOrBuilder)this.writeResults_.get(n);
    }

    public List<? extends WriteResultOrBuilder> getWriteResultsOrBuilderList() {
        return this.writeResults_;
    }

    @Override
    public boolean hasCommitTime() {
        return this.commitTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CommitResponse, Builder>
    implements CommitResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWriteResults(Iterable<? extends WriteResult> iterable) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).addAllWriteResults((Iterable<? extends WriteResult>)iterable);
            return this;
        }

        public Builder addWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).addWriteResults(n, (WriteResult)builder.build());
            return this;
        }

        public Builder addWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).addWriteResults(n, writeResult);
            return this;
        }

        public Builder addWriteResults(WriteResult.Builder builder) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).addWriteResults((WriteResult)builder.build());
            return this;
        }

        public Builder addWriteResults(WriteResult writeResult) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).addWriteResults(writeResult);
            return this;
        }

        public Builder clearCommitTime() {
            this.copyOnWrite();
            ((CommitResponse)this.instance).clearCommitTime();
            return this;
        }

        public Builder clearWriteResults() {
            this.copyOnWrite();
            ((CommitResponse)this.instance).clearWriteResults();
            return this;
        }

        @Override
        public Timestamp getCommitTime() {
            return ((CommitResponse)this.instance).getCommitTime();
        }

        @Override
        public WriteResult getWriteResults(int n) {
            return ((CommitResponse)this.instance).getWriteResults(n);
        }

        @Override
        public int getWriteResultsCount() {
            return ((CommitResponse)this.instance).getWriteResultsCount();
        }

        @Override
        public List<WriteResult> getWriteResultsList() {
            return Collections.unmodifiableList(((CommitResponse)this.instance).getWriteResultsList());
        }

        @Override
        public boolean hasCommitTime() {
            return ((CommitResponse)this.instance).hasCommitTime();
        }

        public Builder mergeCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).mergeCommitTime(timestamp);
            return this;
        }

        public Builder removeWriteResults(int n) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).removeWriteResults(n);
            return this;
        }

        public Builder setCommitTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).setCommitTime((Timestamp)builder.build());
            return this;
        }

        public Builder setCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).setCommitTime(timestamp);
            return this;
        }

        public Builder setWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).setWriteResults(n, (WriteResult)builder.build());
            return this;
        }

        public Builder setWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((CommitResponse)this.instance).setWriteResults(n, writeResult);
            return this;
        }
    }

}

