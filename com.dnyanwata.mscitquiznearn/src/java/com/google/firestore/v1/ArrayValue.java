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

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.ArrayValueOrBuilder;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
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

public final class ArrayValue
extends GeneratedMessageLite<ArrayValue, Builder>
implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE;
    private static volatile Parser<ArrayValue> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = ArrayValue.emptyProtobufList();

    static {
        ArrayValue arrayValue;
        DEFAULT_INSTANCE = arrayValue = new ArrayValue();
        GeneratedMessageLite.registerDefaultInstance(ArrayValue.class, (GeneratedMessageLite)arrayValue);
    }

    private ArrayValue() {
    }

    private void addAllValues(Iterable<? extends Value> iterable) {
        this.ensureValuesIsMutable();
        AbstractMessageLite.addAll(iterable, this.values_);
    }

    private void addValues(int n, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add(n, (Object)value);
    }

    private void addValues(Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.add((Object)value);
    }

    private void clearValues() {
        this.values_ = ArrayValue.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> protobufList = this.values_;
        if (!protobufList.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ArrayValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ArrayValue arrayValue) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)arrayValue);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArrayValue)ArrayValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)ArrayValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ArrayValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(InputStream inputStream) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ArrayValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ArrayValue parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ArrayValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int n) {
        this.ensureValuesIsMutable();
        this.values_.remove(n);
    }

    private void setValues(int n, Value value) {
        value.getClass();
        this.ensureValuesIsMutable();
        this.values_.set(n, (Object)value);
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
                Parser<ArrayValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ArrayValue> class_ = ArrayValue.class;
                synchronized (ArrayValue.class) {
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
                Object[] arrobject = new Object[]{"values_", Value.class};
                return ArrayValue.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ArrayValue();
    }

    @Override
    public Value getValues(int n) {
        return (Value)this.values_.get(n);
    }

    @Override
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override
    public List<Value> getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int n) {
        return (ValueOrBuilder)this.values_.get(n);
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ArrayValue, Builder>
    implements ArrayValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addAllValues((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(n, (Value)builder.build());
            return this;
        }

        public Builder addValues(int n, Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(n, value);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues((Value)builder.build());
            return this;
        }

        public Builder addValues(Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(value);
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((ArrayValue)this.instance).clearValues();
            return this;
        }

        @Override
        public Value getValues(int n) {
            return ((ArrayValue)this.instance).getValues(n);
        }

        @Override
        public int getValuesCount() {
            return ((ArrayValue)this.instance).getValuesCount();
        }

        @Override
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ArrayValue)this.instance).getValuesList());
        }

        public Builder removeValues(int n) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).removeValues(n);
            return this;
        }

        public Builder setValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).setValues(n, (Value)builder.build());
            return this;
        }

        public Builder setValues(int n, Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).setValues(n, value);
            return this;
        }
    }

}

