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

import com.google.firestore.v1.WriteResponse;
import com.google.firestore.v1.WriteResponseOrBuilder;
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

public final class WriteResponse
extends GeneratedMessageLite<WriteResponse, Builder>
implements WriteResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final WriteResponse DEFAULT_INSTANCE;
    private static volatile Parser<WriteResponse> PARSER;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private Timestamp commitTime_;
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.EMPTY;
    private Internal.ProtobufList<WriteResult> writeResults_ = WriteResponse.emptyProtobufList();

    static {
        WriteResponse writeResponse;
        DEFAULT_INSTANCE = writeResponse = new WriteResponse();
        GeneratedMessageLite.registerDefaultInstance(WriteResponse.class, (GeneratedMessageLite)writeResponse);
    }

    private WriteResponse() {
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

    private void clearStreamId() {
        this.streamId_ = WriteResponse.getDefaultInstance().getStreamId();
    }

    private void clearStreamToken() {
        this.streamToken_ = WriteResponse.getDefaultInstance().getStreamToken();
    }

    private void clearWriteResults() {
        this.writeResults_ = WriteResponse.emptyProtobufList();
    }

    private void ensureWriteResultsIsMutable() {
        Internal.ProtobufList<WriteResult> protobufList = this.writeResults_;
        if (!protobufList.isModifiable()) {
            this.writeResults_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static WriteResponse getDefaultInstance() {
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

    public static Builder newBuilder(WriteResponse writeResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)writeResponse);
    }

    public static WriteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResponse)WriteResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)WriteResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(InputStream inputStream) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static WriteResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteResponse> parser() {
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

    private void setStreamId(String string) {
        string.getClass();
        this.streamId_ = string;
    }

    private void setStreamIdBytes(ByteString byteString) {
        WriteResponse.checkByteStringIsUtf8((ByteString)byteString);
        this.streamId_ = byteString.toStringUtf8();
    }

    private void setStreamToken(ByteString byteString) {
        byteString.getClass();
        this.streamToken_ = byteString;
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
                Parser<WriteResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<WriteResponse> class_ = WriteResponse.class;
                synchronized (WriteResponse.class) {
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
                Object[] arrobject = new Object[]{"streamId_", "streamToken_", "writeResults_", WriteResult.class, "commitTime_"};
                return WriteResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\n\u0003\u001b\u0004\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new WriteResponse();
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
    public String getStreamId() {
        return this.streamId_;
    }

    @Override
    public ByteString getStreamIdBytes() {
        return ByteString.copyFromUtf8((String)this.streamId_);
    }

    @Override
    public ByteString getStreamToken() {
        return this.streamToken_;
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
    extends GeneratedMessageLite.Builder<WriteResponse, Builder>
    implements WriteResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWriteResults(Iterable<? extends WriteResult> iterable) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addAllWriteResults((Iterable<? extends WriteResult>)iterable);
            return this;
        }

        public Builder addWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(n, (WriteResult)builder.build());
            return this;
        }

        public Builder addWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(n, writeResult);
            return this;
        }

        public Builder addWriteResults(WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults((WriteResult)builder.build());
            return this;
        }

        public Builder addWriteResults(WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(writeResult);
            return this;
        }

        public Builder clearCommitTime() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearCommitTime();
            return this;
        }

        public Builder clearStreamId() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearStreamId();
            return this;
        }

        public Builder clearStreamToken() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearStreamToken();
            return this;
        }

        public Builder clearWriteResults() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearWriteResults();
            return this;
        }

        @Override
        public Timestamp getCommitTime() {
            return ((WriteResponse)this.instance).getCommitTime();
        }

        @Override
        public String getStreamId() {
            return ((WriteResponse)this.instance).getStreamId();
        }

        @Override
        public ByteString getStreamIdBytes() {
            return ((WriteResponse)this.instance).getStreamIdBytes();
        }

        @Override
        public ByteString getStreamToken() {
            return ((WriteResponse)this.instance).getStreamToken();
        }

        @Override
        public WriteResult getWriteResults(int n) {
            return ((WriteResponse)this.instance).getWriteResults(n);
        }

        @Override
        public int getWriteResultsCount() {
            return ((WriteResponse)this.instance).getWriteResultsCount();
        }

        @Override
        public List<WriteResult> getWriteResultsList() {
            return Collections.unmodifiableList(((WriteResponse)this.instance).getWriteResultsList());
        }

        @Override
        public boolean hasCommitTime() {
            return ((WriteResponse)this.instance).hasCommitTime();
        }

        public Builder mergeCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).mergeCommitTime(timestamp);
            return this;
        }

        public Builder removeWriteResults(int n) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).removeWriteResults(n);
            return this;
        }

        public Builder setCommitTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setCommitTime((Timestamp)builder.build());
            return this;
        }

        public Builder setCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setCommitTime(timestamp);
            return this;
        }

        public Builder setStreamId(String string) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamId(string);
            return this;
        }

        public Builder setStreamIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamIdBytes(byteString);
            return this;
        }

        public Builder setStreamToken(ByteString byteString) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamToken(byteString);
            return this;
        }

        public Builder setWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setWriteResults(n, (WriteResult)builder.build());
            return this;
        }

        public Builder setWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setWriteResults(n, writeResult);
            return this;
        }
    }

}

