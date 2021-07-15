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

import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.CursorOrBuilder;
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

public final class Cursor
extends GeneratedMessageLite<Cursor, Builder>
implements CursorOrBuilder {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final Cursor DEFAULT_INSTANCE;
    private static volatile Parser<Cursor> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private Internal.ProtobufList<Value> values_ = Cursor.emptyProtobufList();

    static {
        Cursor cursor;
        DEFAULT_INSTANCE = cursor = new Cursor();
        GeneratedMessageLite.registerDefaultInstance(Cursor.class, (GeneratedMessageLite)cursor);
    }

    private Cursor() {
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

    private void clearBefore() {
        this.before_ = false;
    }

    private void clearValues() {
        this.values_ = Cursor.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Value> protobufList = this.values_;
        if (!protobufList.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Cursor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Cursor cursor) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)cursor);
    }

    public static Cursor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cursor)Cursor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Cursor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)Cursor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Cursor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Cursor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(InputStream inputStream) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Cursor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Cursor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Cursor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Cursor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int n) {
        this.ensureValuesIsMutable();
        this.values_.remove(n);
    }

    private void setBefore(boolean bl) {
        this.before_ = bl;
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
                Parser<Cursor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Cursor> class_ = Cursor.class;
                synchronized (Cursor.class) {
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
                Object[] arrobject = new Object[]{"values_", Value.class, "before_"};
                return Cursor.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Cursor();
    }

    @Override
    public boolean getBefore() {
        return this.before_;
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
    extends GeneratedMessageLite.Builder<Cursor, Builder>
    implements CursorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((Cursor)this.instance).addAllValues((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(n, (Value)builder.build());
            return this;
        }

        public Builder addValues(int n, Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(n, value);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues((Value)builder.build());
            return this;
        }

        public Builder addValues(Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(value);
            return this;
        }

        public Builder clearBefore() {
            this.copyOnWrite();
            ((Cursor)this.instance).clearBefore();
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((Cursor)this.instance).clearValues();
            return this;
        }

        @Override
        public boolean getBefore() {
            return ((Cursor)this.instance).getBefore();
        }

        @Override
        public Value getValues(int n) {
            return ((Cursor)this.instance).getValues(n);
        }

        @Override
        public int getValuesCount() {
            return ((Cursor)this.instance).getValuesCount();
        }

        @Override
        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((Cursor)this.instance).getValuesList());
        }

        public Builder removeValues(int n) {
            this.copyOnWrite();
            ((Cursor)this.instance).removeValues(n);
            return this;
        }

        public Builder setBefore(boolean bl) {
            this.copyOnWrite();
            ((Cursor)this.instance).setBefore(bl);
            return this;
        }

        public Builder setValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).setValues(n, (Value)builder.build());
            return this;
        }

        public Builder setValues(int n, Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).setValues(n, value);
            return this;
        }
    }

}

