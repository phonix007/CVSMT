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
 *  com.google.protobuf.MessageLiteOrBuilder
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

import com.google.firestore.v1.TransactionOptions;
import com.google.firestore.v1.TransactionOptionsOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TransactionOptions
extends GeneratedMessageLite<TransactionOptions, Builder>
implements TransactionOptionsOrBuilder {
    private static final TransactionOptions DEFAULT_INSTANCE;
    private static volatile Parser<TransactionOptions> PARSER;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    static {
        TransactionOptions transactionOptions;
        DEFAULT_INSTANCE = transactionOptions = new TransactionOptions();
        GeneratedMessageLite.registerDefaultInstance(TransactionOptions.class, (GeneratedMessageLite)transactionOptions);
    }

    private TransactionOptions() {
    }

    private void clearMode() {
        this.modeCase_ = 0;
        this.mode_ = null;
    }

    private void clearReadOnly() {
        if (this.modeCase_ == 2) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    private void clearReadWrite() {
        if (this.modeCase_ == 3) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    public static TransactionOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeReadOnly(ReadOnly readOnly) {
        readOnly.getClass();
        this.mode_ = this.modeCase_ == 2 && this.mode_ != ReadOnly.getDefaultInstance() ? ((ReadOnly.Builder)ReadOnly.newBuilder((ReadOnly)this.mode_).mergeFrom((GeneratedMessageLite)readOnly)).buildPartial() : readOnly;
        this.modeCase_ = 2;
    }

    private void mergeReadWrite(ReadWrite readWrite) {
        readWrite.getClass();
        this.mode_ = this.modeCase_ == 3 && this.mode_ != ReadWrite.getDefaultInstance() ? ((ReadWrite.Builder)ReadWrite.newBuilder((ReadWrite)this.mode_).mergeFrom((GeneratedMessageLite)readWrite)).buildPartial() : readWrite;
        this.modeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TransactionOptions transactionOptions) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)transactionOptions);
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions)TransactionOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)TransactionOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TransactionOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TransactionOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static TransactionOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TransactionOptions parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TransactionOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setReadOnly(ReadOnly readOnly) {
        readOnly.getClass();
        this.mode_ = readOnly;
        this.modeCase_ = 2;
    }

    private void setReadWrite(ReadWrite readWrite) {
        readWrite.getClass();
        this.mode_ = readWrite;
        this.modeCase_ = 3;
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
                Parser<TransactionOptions> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<TransactionOptions> class_ = TransactionOptions.class;
                synchronized (TransactionOptions.class) {
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
                Object[] arrobject = new Object[]{"mode_", "modeCase_", ReadOnly.class, ReadWrite.class};
                return TransactionOptions.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new TransactionOptions();
    }

    @Override
    public ModeCase getModeCase() {
        return ModeCase.forNumber(this.modeCase_);
    }

    @Override
    public ReadOnly getReadOnly() {
        if (this.modeCase_ == 2) {
            return (ReadOnly)this.mode_;
        }
        return ReadOnly.getDefaultInstance();
    }

    @Override
    public ReadWrite getReadWrite() {
        if (this.modeCase_ == 3) {
            return (ReadWrite)this.mode_;
        }
        return ReadWrite.getDefaultInstance();
    }

    @Override
    public boolean hasReadOnly() {
        return this.modeCase_ == 2;
    }

    @Override
    public boolean hasReadWrite() {
        return this.modeCase_ == 3;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TransactionOptions, Builder>
    implements TransactionOptionsOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearMode() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearMode();
            return this;
        }

        public Builder clearReadOnly() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearReadOnly();
            return this;
        }

        public Builder clearReadWrite() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearReadWrite();
            return this;
        }

        @Override
        public ModeCase getModeCase() {
            return ((TransactionOptions)this.instance).getModeCase();
        }

        @Override
        public ReadOnly getReadOnly() {
            return ((TransactionOptions)this.instance).getReadOnly();
        }

        @Override
        public ReadWrite getReadWrite() {
            return ((TransactionOptions)this.instance).getReadWrite();
        }

        @Override
        public boolean hasReadOnly() {
            return ((TransactionOptions)this.instance).hasReadOnly();
        }

        @Override
        public boolean hasReadWrite() {
            return ((TransactionOptions)this.instance).hasReadWrite();
        }

        public Builder mergeReadOnly(ReadOnly readOnly) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).mergeReadOnly(readOnly);
            return this;
        }

        public Builder mergeReadWrite(ReadWrite readWrite) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).mergeReadWrite(readWrite);
            return this;
        }

        public Builder setReadOnly(ReadOnly.Builder builder) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadOnly((ReadOnly)builder.build());
            return this;
        }

        public Builder setReadOnly(ReadOnly readOnly) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadOnly(readOnly);
            return this;
        }

        public Builder setReadWrite(ReadWrite.Builder builder) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadWrite((ReadWrite)builder.build());
            return this;
        }

        public Builder setReadWrite(ReadWrite readWrite) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadWrite(readWrite);
            return this;
        }
    }

    public static final class ReadOnly
    extends GeneratedMessageLite<ReadOnly, Builder>
    implements ReadOnlyOrBuilder {
        private static final ReadOnly DEFAULT_INSTANCE;
        private static volatile Parser<ReadOnly> PARSER;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        static {
            ReadOnly readOnly;
            DEFAULT_INSTANCE = readOnly = new ReadOnly();
            GeneratedMessageLite.registerDefaultInstance(ReadOnly.class, (GeneratedMessageLite)readOnly);
        }

        private ReadOnly() {
        }

        private void clearConsistencySelector() {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }

        private void clearReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                this.consistencySelectorCase_ = 0;
                this.consistencySelector_ = null;
            }
        }

        public static ReadOnly getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeReadTime(Timestamp timestamp) {
            timestamp.getClass();
            this.consistencySelector_ = this.consistencySelectorCase_ == 2 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
            this.consistencySelectorCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ReadOnly readOnly) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)readOnly);
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadOnly)ReadOnly.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)ReadOnly.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static ReadOnly parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(InputStream inputStream) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadOnly parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static ReadOnly parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static ReadOnly parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<ReadOnly> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setReadTime(Timestamp timestamp) {
            timestamp.getClass();
            this.consistencySelector_ = timestamp;
            this.consistencySelectorCase_ = 2;
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
                    Parser<ReadOnly> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<ReadOnly> class_ = ReadOnly.class;
                    synchronized (ReadOnly.class) {
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
                    Object[] arrobject = new Object[]{"consistencySelector_", "consistencySelectorCase_", Timestamp.class};
                    return ReadOnly.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new ReadOnly();
        }

        @Override
        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ConsistencySelectorCase.forNumber(this.consistencySelectorCase_);
        }

        @Override
        public Timestamp getReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                return (Timestamp)this.consistencySelector_;
            }
            return Timestamp.getDefaultInstance();
        }

        @Override
        public boolean hasReadTime() {
            return this.consistencySelectorCase_ == 2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<ReadOnly, Builder>
        implements ReadOnlyOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearConsistencySelector() {
                this.copyOnWrite();
                ((ReadOnly)this.instance).clearConsistencySelector();
                return this;
            }

            public Builder clearReadTime() {
                this.copyOnWrite();
                ((ReadOnly)this.instance).clearReadTime();
                return this;
            }

            @Override
            public ConsistencySelectorCase getConsistencySelectorCase() {
                return ((ReadOnly)this.instance).getConsistencySelectorCase();
            }

            @Override
            public Timestamp getReadTime() {
                return ((ReadOnly)this.instance).getReadTime();
            }

            @Override
            public boolean hasReadTime() {
                return ((ReadOnly)this.instance).hasReadTime();
            }

            public Builder mergeReadTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).mergeReadTime(timestamp);
                return this;
            }

            public Builder setReadTime(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).setReadTime((Timestamp)builder.build());
                return this;
            }

            public Builder setReadTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).setReadTime(timestamp);
                return this;
            }
        }

    }

    public static interface ReadOnlyOrBuilder
    extends MessageLiteOrBuilder {
        public ReadOnly.ConsistencySelectorCase getConsistencySelectorCase();

        public Timestamp getReadTime();

        public boolean hasReadTime();
    }

    public static final class ReadWrite
    extends GeneratedMessageLite<ReadWrite, Builder>
    implements ReadWriteOrBuilder {
        private static final ReadWrite DEFAULT_INSTANCE;
        private static volatile Parser<ReadWrite> PARSER;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString retryTransaction_ = ByteString.EMPTY;

        static {
            ReadWrite readWrite;
            DEFAULT_INSTANCE = readWrite = new ReadWrite();
            GeneratedMessageLite.registerDefaultInstance(ReadWrite.class, (GeneratedMessageLite)readWrite);
        }

        private ReadWrite() {
        }

        private void clearRetryTransaction() {
            this.retryTransaction_ = ReadWrite.getDefaultInstance().getRetryTransaction();
        }

        public static ReadWrite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ReadWrite readWrite) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)readWrite);
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadWrite)ReadWrite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)ReadWrite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static ReadWrite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(InputStream inputStream) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadWrite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static ReadWrite parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static ReadWrite parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<ReadWrite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRetryTransaction(ByteString byteString) {
            byteString.getClass();
            this.retryTransaction_ = byteString;
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
                    Parser<ReadWrite> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<ReadWrite> class_ = ReadWrite.class;
                    synchronized (ReadWrite.class) {
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
                    Object[] arrobject = new Object[]{"retryTransaction_"};
                    return ReadWrite.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new ReadWrite();
        }

        @Override
        public ByteString getRetryTransaction() {
            return this.retryTransaction_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<ReadWrite, Builder>
        implements ReadWriteOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearRetryTransaction() {
                this.copyOnWrite();
                ((ReadWrite)this.instance).clearRetryTransaction();
                return this;
            }

            @Override
            public ByteString getRetryTransaction() {
                return ((ReadWrite)this.instance).getRetryTransaction();
            }

            public Builder setRetryTransaction(ByteString byteString) {
                this.copyOnWrite();
                ((ReadWrite)this.instance).setRetryTransaction(byteString);
                return this;
            }
        }

    }

    public static interface ReadWriteOrBuilder
    extends MessageLiteOrBuilder {
        public ByteString getRetryTransaction();
    }

}

