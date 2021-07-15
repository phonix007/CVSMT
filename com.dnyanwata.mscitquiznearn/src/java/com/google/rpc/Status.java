/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
 *  com.google.protobuf.AnyOrBuilder
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
 *  com.google.rpc.Status$1
 *  com.google.rpc.StatusOrBuilder
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
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import com.google.rpc.StatusOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Status
extends GeneratedMessageLite<Status, Builder>
implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int code_;
    private Internal.ProtobufList<Any> details_ = Status.emptyProtobufList();
    private String message_ = "";

    static {
        Status status;
        DEFAULT_INSTANCE = status = new Status();
        GeneratedMessageLite.registerDefaultInstance(Status.class, (GeneratedMessageLite)status);
    }

    private Status() {
    }

    private void addAllDetails(Iterable<? extends Any> iterable) {
        this.ensureDetailsIsMutable();
        AbstractMessageLite.addAll(iterable, this.details_);
    }

    private void addDetails(int n, Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.add(n, (Object)any);
    }

    private void addDetails(Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.add((Object)any);
    }

    private void clearCode() {
        this.code_ = 0;
    }

    private void clearDetails() {
        this.details_ = Status.emptyProtobufList();
    }

    private void clearMessage() {
        this.message_ = Status.getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.details_;
        if (!protobufList.isModifiable()) {
            this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Status status) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status)Status.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)Status.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Status parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDetails(int n) {
        this.ensureDetailsIsMutable();
        this.details_.remove(n);
    }

    private void setCode(int n) {
        this.code_ = n;
    }

    private void setDetails(int n, Any any) {
        any.getClass();
        this.ensureDetailsIsMutable();
        this.details_.set(n, (Object)any);
    }

    private void setMessage(String string) {
        string.getClass();
        this.message_ = string;
    }

    private void setMessageBytes(ByteString byteString) {
        Status.checkByteStringIsUtf8((ByteString)byteString);
        this.message_ = byteString.toStringUtf8();
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
                Parser<Status> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Status> class_ = Status.class;
                synchronized (Status.class) {
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
                Object[] arrobject = new Object[]{"code_", "message_", "details_", Any.class};
                return Status.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002\u0208\u0003\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Status();
    }

    public int getCode() {
        return this.code_;
    }

    public Any getDetails(int n) {
        return (Any)this.details_.get(n);
    }

    public int getDetailsCount() {
        return this.details_.size();
    }

    public List<Any> getDetailsList() {
        return this.details_;
    }

    public AnyOrBuilder getDetailsOrBuilder(int n) {
        return (AnyOrBuilder)this.details_.get(n);
    }

    public List<? extends AnyOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8((String)this.message_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Status, Builder>
    implements StatusOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDetails(Iterable<? extends Any> iterable) {
            this.copyOnWrite();
            ((Status)this.instance).addAllDetails((Iterable<? extends Any>)iterable);
            return this;
        }

        public Builder addDetails(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(n, (Any)builder.build());
            return this;
        }

        public Builder addDetails(int n, Any any) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(n, any);
            return this;
        }

        public Builder addDetails(Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails((Any)builder.build());
            return this;
        }

        public Builder addDetails(Any any) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(any);
            return this;
        }

        public Builder clearCode() {
            this.copyOnWrite();
            ((Status)this.instance).clearCode();
            return this;
        }

        public Builder clearDetails() {
            this.copyOnWrite();
            ((Status)this.instance).clearDetails();
            return this;
        }

        public Builder clearMessage() {
            this.copyOnWrite();
            ((Status)this.instance).clearMessage();
            return this;
        }

        public int getCode() {
            return ((Status)this.instance).getCode();
        }

        public Any getDetails(int n) {
            return ((Status)this.instance).getDetails(n);
        }

        public int getDetailsCount() {
            return ((Status)this.instance).getDetailsCount();
        }

        public List<Any> getDetailsList() {
            return Collections.unmodifiableList(((Status)this.instance).getDetailsList());
        }

        public String getMessage() {
            return ((Status)this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((Status)this.instance).getMessageBytes();
        }

        public Builder removeDetails(int n) {
            this.copyOnWrite();
            ((Status)this.instance).removeDetails(n);
            return this;
        }

        public Builder setCode(int n) {
            this.copyOnWrite();
            ((Status)this.instance).setCode(n);
            return this;
        }

        public Builder setDetails(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).setDetails(n, (Any)builder.build());
            return this;
        }

        public Builder setDetails(int n, Any any) {
            this.copyOnWrite();
            ((Status)this.instance).setDetails(n, any);
            return this;
        }

        public Builder setMessage(String string) {
            this.copyOnWrite();
            ((Status)this.instance).setMessage(string);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Status)this.instance).setMessageBytes(byteString);
            return this;
        }
    }

}

