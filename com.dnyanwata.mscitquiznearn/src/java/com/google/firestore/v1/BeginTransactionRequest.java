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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionRequestOrBuilder;
import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BeginTransactionRequest
extends GeneratedMessageLite<BeginTransactionRequest, Builder>
implements BeginTransactionRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BeginTransactionRequest DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<BeginTransactionRequest> PARSER;
    private String database_ = "";
    private TransactionOptions options_;

    static {
        BeginTransactionRequest beginTransactionRequest;
        DEFAULT_INSTANCE = beginTransactionRequest = new BeginTransactionRequest();
        GeneratedMessageLite.registerDefaultInstance(BeginTransactionRequest.class, (GeneratedMessageLite)beginTransactionRequest);
    }

    private BeginTransactionRequest() {
    }

    private void clearDatabase() {
        this.database_ = BeginTransactionRequest.getDefaultInstance().getDatabase();
    }

    private void clearOptions() {
        this.options_ = null;
    }

    public static BeginTransactionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        TransactionOptions transactionOptions2 = this.options_;
        if (transactionOptions2 != null && transactionOptions2 != TransactionOptions.getDefaultInstance()) {
            this.options_ = (TransactionOptions)((TransactionOptions.Builder)TransactionOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial();
            return;
        }
        this.options_ = transactionOptions;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BeginTransactionRequest beginTransactionRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)beginTransactionRequest);
    }

    public static BeginTransactionRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionRequest)BeginTransactionRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)BeginTransactionRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BeginTransactionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BeginTransactionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BeginTransactionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BeginTransactionRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BeginTransactionRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDatabase(String string) {
        string.getClass();
        this.database_ = string;
    }

    private void setDatabaseBytes(ByteString byteString) {
        BeginTransactionRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.database_ = byteString.toStringUtf8();
    }

    private void setOptions(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.options_ = transactionOptions;
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
                Parser<BeginTransactionRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BeginTransactionRequest> class_ = BeginTransactionRequest.class;
                synchronized (BeginTransactionRequest.class) {
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
                Object[] arrobject = new Object[]{"database_", "options_"};
                return BeginTransactionRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BeginTransactionRequest();
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
    public TransactionOptions getOptions() {
        TransactionOptions transactionOptions = this.options_;
        if (transactionOptions == null) {
            transactionOptions = TransactionOptions.getDefaultInstance();
        }
        return transactionOptions;
    }

    @Override
    public boolean hasOptions() {
        return this.options_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BeginTransactionRequest, Builder>
    implements BeginTransactionRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).clearOptions();
            return this;
        }

        @Override
        public String getDatabase() {
            return ((BeginTransactionRequest)this.instance).getDatabase();
        }

        @Override
        public ByteString getDatabaseBytes() {
            return ((BeginTransactionRequest)this.instance).getDatabaseBytes();
        }

        @Override
        public TransactionOptions getOptions() {
            return ((BeginTransactionRequest)this.instance).getOptions();
        }

        @Override
        public boolean hasOptions() {
            return ((BeginTransactionRequest)this.instance).hasOptions();
        }

        public Builder mergeOptions(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).mergeOptions(transactionOptions);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setOptions(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setOptions((TransactionOptions)builder.build());
            return this;
        }

        public Builder setOptions(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setOptions(transactionOptions);
            return this;
        }
    }

}

