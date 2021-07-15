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

import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
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

public final class WriteResult
extends GeneratedMessageLite<WriteResult, Builder>
implements WriteResultOrBuilder {
    private static final WriteResult DEFAULT_INSTANCE;
    private static volatile Parser<WriteResult> PARSER;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> transformResults_ = WriteResult.emptyProtobufList();
    private Timestamp updateTime_;

    static {
        WriteResult writeResult;
        DEFAULT_INSTANCE = writeResult = new WriteResult();
        GeneratedMessageLite.registerDefaultInstance(WriteResult.class, (GeneratedMessageLite)writeResult);
    }

    private WriteResult() {
    }

    private void addAllTransformResults(Iterable<? extends Value> iterable) {
        this.ensureTransformResultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.transformResults_);
    }

    private void addTransformResults(int n, Value value) {
        value.getClass();
        this.ensureTransformResultsIsMutable();
        this.transformResults_.add(n, (Object)value);
    }

    private void addTransformResults(Value value) {
        value.getClass();
        this.ensureTransformResultsIsMutable();
        this.transformResults_.add((Object)value);
    }

    private void clearTransformResults() {
        this.transformResults_ = WriteResult.emptyProtobufList();
    }

    private void clearUpdateTime() {
        this.updateTime_ = null;
    }

    private void ensureTransformResultsIsMutable() {
        Internal.ProtobufList<Value> protobufList = this.transformResults_;
        if (!protobufList.isModifiable()) {
            this.transformResults_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static WriteResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.updateTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.updateTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.updateTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(WriteResult writeResult) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)writeResult);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResult)WriteResult.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)WriteResult.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(InputStream inputStream) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteResult parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeTransformResults(int n) {
        this.ensureTransformResultsIsMutable();
        this.transformResults_.remove(n);
    }

    private void setTransformResults(int n, Value value) {
        value.getClass();
        this.ensureTransformResultsIsMutable();
        this.transformResults_.set(n, (Object)value);
    }

    private void setUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.updateTime_ = timestamp;
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
                Parser<WriteResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<WriteResult> class_ = WriteResult.class;
                synchronized (WriteResult.class) {
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
                Object[] arrobject = new Object[]{"updateTime_", "transformResults_", Value.class};
                return WriteResult.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new WriteResult();
    }

    @Override
    public Value getTransformResults(int n) {
        return (Value)this.transformResults_.get(n);
    }

    @Override
    public int getTransformResultsCount() {
        return this.transformResults_.size();
    }

    @Override
    public List<Value> getTransformResultsList() {
        return this.transformResults_;
    }

    public ValueOrBuilder getTransformResultsOrBuilder(int n) {
        return (ValueOrBuilder)this.transformResults_.get(n);
    }

    public List<? extends ValueOrBuilder> getTransformResultsOrBuilderList() {
        return this.transformResults_;
    }

    @Override
    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public boolean hasUpdateTime() {
        return this.updateTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<WriteResult, Builder>
    implements WriteResultOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllTransformResults(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addAllTransformResults((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addTransformResults(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(n, (Value)builder.build());
            return this;
        }

        public Builder addTransformResults(int n, Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(n, value);
            return this;
        }

        public Builder addTransformResults(Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults((Value)builder.build());
            return this;
        }

        public Builder addTransformResults(Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(value);
            return this;
        }

        public Builder clearTransformResults() {
            this.copyOnWrite();
            ((WriteResult)this.instance).clearTransformResults();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((WriteResult)this.instance).clearUpdateTime();
            return this;
        }

        @Override
        public Value getTransformResults(int n) {
            return ((WriteResult)this.instance).getTransformResults(n);
        }

        @Override
        public int getTransformResultsCount() {
            return ((WriteResult)this.instance).getTransformResultsCount();
        }

        @Override
        public List<Value> getTransformResultsList() {
            return Collections.unmodifiableList(((WriteResult)this.instance).getTransformResultsList());
        }

        @Override
        public Timestamp getUpdateTime() {
            return ((WriteResult)this.instance).getUpdateTime();
        }

        @Override
        public boolean hasUpdateTime() {
            return ((WriteResult)this.instance).hasUpdateTime();
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResult)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder removeTransformResults(int n) {
            this.copyOnWrite();
            ((WriteResult)this.instance).removeTransformResults(n);
            return this;
        }

        public Builder setTransformResults(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setTransformResults(n, (Value)builder.build());
            return this;
        }

        public Builder setTransformResults(int n, Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setTransformResults(n, value);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setUpdateTime((Timestamp)builder.build());
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

