/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
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
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.longrunning.OperationOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Operation
extends GeneratedMessageLite<Operation, Builder>
implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE;
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    static {
        Operation operation;
        DEFAULT_INSTANCE = operation = new Operation();
        GeneratedMessageLite.registerDefaultInstance(Operation.class, (GeneratedMessageLite)operation);
    }

    private Operation() {
    }

    private void clearDone() {
        this.done_ = false;
    }

    private void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearMetadata() {
        this.metadata_ = null;
    }

    private void clearName() {
        this.name_ = Operation.getDefaultInstance().getName();
    }

    private void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeError(Status status) {
        status.getClass();
        this.result_ = this.resultCase_ == 4 && this.result_ != Status.getDefaultInstance() ? ((Status.Builder)Status.newBuilder((Status)this.result_).mergeFrom((GeneratedMessageLite)status)).buildPartial() : status;
        this.resultCase_ = 4;
    }

    private void mergeMetadata(Any any) {
        any.getClass();
        Any any2 = this.metadata_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.metadata_ = (Any)((Any.Builder)Any.newBuilder((Any)this.metadata_).mergeFrom((GeneratedMessageLite)any)).buildPartial();
            return;
        }
        this.metadata_ = any;
    }

    private void mergeResponse(Any any) {
        any.getClass();
        this.result_ = this.resultCase_ == 5 && this.result_ != Any.getDefaultInstance() ? ((Any.Builder)Any.newBuilder((Any)((Any)this.result_)).mergeFrom((GeneratedMessageLite)any)).buildPartial() : any;
        this.resultCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Operation operation) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation)Operation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)Operation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Operation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Operation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDone(boolean bl) {
        this.done_ = bl;
    }

    private void setError(Status status) {
        status.getClass();
        this.result_ = status;
        this.resultCase_ = 4;
    }

    private void setMetadata(Any any) {
        any.getClass();
        this.metadata_ = any;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        Operation.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setResponse(Any any) {
        any.getClass();
        this.result_ = any;
        this.resultCase_ = 5;
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
                Parser<Operation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Operation> class_ = Operation.class;
                synchronized (Operation.class) {
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
                Object[] arrobject = new Object[]{"result_", "resultCase_", "name_", "metadata_", "done_", Status.class, Any.class};
                return Operation.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\u0007\u0004<\u0000\u0005<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Operation();
    }

    @Override
    public boolean getDone() {
        return this.done_;
    }

    @Override
    public Status getError() {
        if (this.resultCase_ == 4) {
            return (Status)this.result_;
        }
        return Status.getDefaultInstance();
    }

    @Override
    public Any getMetadata() {
        Any any = this.metadata_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any)this.result_;
        }
        return Any.getDefaultInstance();
    }

    @Override
    public ResultCase getResultCase() {
        return ResultCase.forNumber(this.resultCase_);
    }

    @Override
    public boolean hasError() {
        return this.resultCase_ == 4;
    }

    @Override
    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    @Override
    public boolean hasResponse() {
        return this.resultCase_ == 5;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Operation, Builder>
    implements OperationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDone() {
            this.copyOnWrite();
            ((Operation)this.instance).clearDone();
            return this;
        }

        public Builder clearError() {
            this.copyOnWrite();
            ((Operation)this.instance).clearError();
            return this;
        }

        public Builder clearMetadata() {
            this.copyOnWrite();
            ((Operation)this.instance).clearMetadata();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Operation)this.instance).clearName();
            return this;
        }

        public Builder clearResponse() {
            this.copyOnWrite();
            ((Operation)this.instance).clearResponse();
            return this;
        }

        public Builder clearResult() {
            this.copyOnWrite();
            ((Operation)this.instance).clearResult();
            return this;
        }

        @Override
        public boolean getDone() {
            return ((Operation)this.instance).getDone();
        }

        @Override
        public Status getError() {
            return ((Operation)this.instance).getError();
        }

        @Override
        public Any getMetadata() {
            return ((Operation)this.instance).getMetadata();
        }

        @Override
        public String getName() {
            return ((Operation)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Operation)this.instance).getNameBytes();
        }

        @Override
        public Any getResponse() {
            return ((Operation)this.instance).getResponse();
        }

        @Override
        public ResultCase getResultCase() {
            return ((Operation)this.instance).getResultCase();
        }

        @Override
        public boolean hasError() {
            return ((Operation)this.instance).hasError();
        }

        @Override
        public boolean hasMetadata() {
            return ((Operation)this.instance).hasMetadata();
        }

        @Override
        public boolean hasResponse() {
            return ((Operation)this.instance).hasResponse();
        }

        public Builder mergeError(Status status) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeError(status);
            return this;
        }

        public Builder mergeMetadata(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeMetadata(any);
            return this;
        }

        public Builder mergeResponse(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeResponse(any);
            return this;
        }

        public Builder setDone(boolean bl) {
            this.copyOnWrite();
            ((Operation)this.instance).setDone(bl);
            return this;
        }

        public Builder setError(Status.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setError((Status)builder.build());
            return this;
        }

        public Builder setError(Status status) {
            this.copyOnWrite();
            ((Operation)this.instance).setError(status);
            return this;
        }

        public Builder setMetadata(Any.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setMetadata((Any)builder.build());
            return this;
        }

        public Builder setMetadata(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).setMetadata(any);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Operation)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Operation)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setResponse(Any.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setResponse((Any)builder.build());
            return this;
        }

        public Builder setResponse(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).setResponse(any);
            return this;
        }
    }

}

