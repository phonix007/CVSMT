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

import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitRequestOrBuilder;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CommitRequest
extends GeneratedMessageLite<CommitRequest, Builder>
implements CommitRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final CommitRequest DEFAULT_INSTANCE;
    private static volatile Parser<CommitRequest> PARSER;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private String database_ = "";
    private ByteString transaction_ = ByteString.EMPTY;
    private Internal.ProtobufList<Write> writes_ = CommitRequest.emptyProtobufList();

    static {
        CommitRequest commitRequest;
        DEFAULT_INSTANCE = commitRequest = new CommitRequest();
        GeneratedMessageLite.registerDefaultInstance(CommitRequest.class, (GeneratedMessageLite)commitRequest);
    }

    private CommitRequest() {
    }

    private void addAllWrites(Iterable<? extends Write> iterable) {
        this.ensureWritesIsMutable();
        AbstractMessageLite.addAll(iterable, this.writes_);
    }

    private void addWrites(int n, Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.add(n, (Object)write);
    }

    private void addWrites(Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.add((Object)write);
    }

    private void clearDatabase() {
        this.database_ = CommitRequest.getDefaultInstance().getDatabase();
    }

    private void clearTransaction() {
        this.transaction_ = CommitRequest.getDefaultInstance().getTransaction();
    }

    private void clearWrites() {
        this.writes_ = CommitRequest.emptyProtobufList();
    }

    private void ensureWritesIsMutable() {
        Internal.ProtobufList<Write> protobufList = this.writes_;
        if (!protobufList.isModifiable()) {
            this.writes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static CommitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CommitRequest commitRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)commitRequest);
    }

    public static CommitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommitRequest)CommitRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)CommitRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CommitRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CommitRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(InputStream inputStream) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static CommitRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CommitRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CommitRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrites(int n) {
        this.ensureWritesIsMutable();
        this.writes_.remove(n);
    }

    private void setDatabase(String string) {
        string.getClass();
        this.database_ = string;
    }

    private void setDatabaseBytes(ByteString byteString) {
        CommitRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.database_ = byteString.toStringUtf8();
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.transaction_ = byteString;
    }

    private void setWrites(int n, Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.set(n, (Object)write);
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
                Parser<CommitRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<CommitRequest> class_ = CommitRequest.class;
                synchronized (CommitRequest.class) {
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
                Object[] arrobject = new Object[]{"database_", "writes_", Write.class, "transaction_"};
                return CommitRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\n", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new CommitRequest();
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
    public ByteString getTransaction() {
        return this.transaction_;
    }

    @Override
    public Write getWrites(int n) {
        return (Write)this.writes_.get(n);
    }

    @Override
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override
    public List<Write> getWritesList() {
        return this.writes_;
    }

    public WriteOrBuilder getWritesOrBuilder(int n) {
        return (WriteOrBuilder)this.writes_.get(n);
    }

    public List<? extends WriteOrBuilder> getWritesOrBuilderList() {
        return this.writes_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CommitRequest, Builder>
    implements CommitRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWrites(Iterable<? extends Write> iterable) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addAllWrites((Iterable<? extends Write>)iterable);
            return this;
        }

        public Builder addWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(n, (Write)builder.build());
            return this;
        }

        public Builder addWrites(int n, Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(n, write);
            return this;
        }

        public Builder addWrites(Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites((Write)builder.build());
            return this;
        }

        public Builder addWrites(Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(write);
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearTransaction();
            return this;
        }

        public Builder clearWrites() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearWrites();
            return this;
        }

        @Override
        public String getDatabase() {
            return ((CommitRequest)this.instance).getDatabase();
        }

        @Override
        public ByteString getDatabaseBytes() {
            return ((CommitRequest)this.instance).getDatabaseBytes();
        }

        @Override
        public ByteString getTransaction() {
            return ((CommitRequest)this.instance).getTransaction();
        }

        @Override
        public Write getWrites(int n) {
            return ((CommitRequest)this.instance).getWrites(n);
        }

        @Override
        public int getWritesCount() {
            return ((CommitRequest)this.instance).getWritesCount();
        }

        @Override
        public List<Write> getWritesList() {
            return Collections.unmodifiableList(((CommitRequest)this.instance).getWritesList());
        }

        public Builder removeWrites(int n) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).removeWrites(n);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setTransaction(byteString);
            return this;
        }

        public Builder setWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setWrites(n, (Write)builder.build());
            return this;
        }

        public Builder setWrites(int n, Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setWrites(n, write);
            return this;
        }
    }

}

