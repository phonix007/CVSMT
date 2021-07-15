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
package com.google.longrunning;

import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.ListOperationsResponseOrBuilder;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationOrBuilder;
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

public final class ListOperationsResponse
extends GeneratedMessageLite<ListOperationsResponse, Builder>
implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<ListOperationsResponse> PARSER;
    private String nextPageToken_ = "";
    private Internal.ProtobufList<Operation> operations_ = ListOperationsResponse.emptyProtobufList();

    static {
        ListOperationsResponse listOperationsResponse;
        DEFAULT_INSTANCE = listOperationsResponse = new ListOperationsResponse();
        GeneratedMessageLite.registerDefaultInstance(ListOperationsResponse.class, (GeneratedMessageLite)listOperationsResponse);
    }

    private ListOperationsResponse() {
    }

    private void addAllOperations(Iterable<? extends Operation> iterable) {
        this.ensureOperationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.operations_);
    }

    private void addOperations(int n, Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.add(n, (Object)operation);
    }

    private void addOperations(Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.add((Object)operation);
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListOperationsResponse.getDefaultInstance().getNextPageToken();
    }

    private void clearOperations() {
        this.operations_ = ListOperationsResponse.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        Internal.ProtobufList<Operation> protobufList = this.operations_;
        if (!protobufList.isModifiable()) {
            this.operations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListOperationsResponse listOperationsResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse)ListOperationsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)ListOperationsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListOperationsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListOperationsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListOperationsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOperations(int n) {
        this.ensureOperationsIsMutable();
        this.operations_.remove(n);
    }

    private void setNextPageToken(String string) {
        string.getClass();
        this.nextPageToken_ = string;
    }

    private void setNextPageTokenBytes(ByteString byteString) {
        ListOperationsResponse.checkByteStringIsUtf8((ByteString)byteString);
        this.nextPageToken_ = byteString.toStringUtf8();
    }

    private void setOperations(int n, Operation operation) {
        operation.getClass();
        this.ensureOperationsIsMutable();
        this.operations_.set(n, (Object)operation);
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
                Parser<ListOperationsResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListOperationsResponse> class_ = ListOperationsResponse.class;
                synchronized (ListOperationsResponse.class) {
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
                Object[] arrobject = new Object[]{"operations_", Operation.class, "nextPageToken_"};
                return ListOperationsResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListOperationsResponse();
    }

    @Override
    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    @Override
    public ByteString getNextPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.nextPageToken_);
    }

    @Override
    public Operation getOperations(int n) {
        return (Operation)this.operations_.get(n);
    }

    @Override
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override
    public List<Operation> getOperationsList() {
        return this.operations_;
    }

    public OperationOrBuilder getOperationsOrBuilder(int n) {
        return (OperationOrBuilder)this.operations_.get(n);
    }

    public List<? extends OperationOrBuilder> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListOperationsResponse, Builder>
    implements ListOperationsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllOperations(Iterable<? extends Operation> iterable) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addAllOperations((Iterable<? extends Operation>)iterable);
            return this;
        }

        public Builder addOperations(int n, Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(n, (Operation)builder.build());
            return this;
        }

        public Builder addOperations(int n, Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(n, operation);
            return this;
        }

        public Builder addOperations(Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations((Operation)builder.build());
            return this;
        }

        public Builder addOperations(Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(operation);
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).clearNextPageToken();
            return this;
        }

        public Builder clearOperations() {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).clearOperations();
            return this;
        }

        @Override
        public String getNextPageToken() {
            return ((ListOperationsResponse)this.instance).getNextPageToken();
        }

        @Override
        public ByteString getNextPageTokenBytes() {
            return ((ListOperationsResponse)this.instance).getNextPageTokenBytes();
        }

        @Override
        public Operation getOperations(int n) {
            return ((ListOperationsResponse)this.instance).getOperations(n);
        }

        @Override
        public int getOperationsCount() {
            return ((ListOperationsResponse)this.instance).getOperationsCount();
        }

        @Override
        public List<Operation> getOperationsList() {
            return Collections.unmodifiableList(((ListOperationsResponse)this.instance).getOperationsList());
        }

        public Builder removeOperations(int n) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).removeOperations(n);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }

        public Builder setOperations(int n, Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setOperations(n, (Operation)builder.build());
            return this;
        }

        public Builder setOperations(int n, Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setOperations(n, operation);
            return this;
        }
    }

}

