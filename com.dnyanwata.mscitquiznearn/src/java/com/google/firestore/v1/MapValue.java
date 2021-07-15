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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.MapValueOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class MapValue
extends GeneratedMessageLite<MapValue, Builder>
implements MapValueOrBuilder {
    private static final MapValue DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<MapValue> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();

    static {
        MapValue mapValue;
        DEFAULT_INSTANCE = mapValue = new MapValue();
        GeneratedMessageLite.registerDefaultInstance(MapValue.class, (GeneratedMessageLite)mapValue);
    }

    private MapValue() {
    }

    public static MapValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Value> getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(MapValue mapValue) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)mapValue);
    }

    public static MapValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MapValue)MapValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MapValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)MapValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MapValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MapValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(InputStream inputStream) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MapValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static MapValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MapValue parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MapValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public boolean containsFields(String string) {
        string.getClass();
        return this.internalGetFields().containsKey((Object)string);
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
                Parser<MapValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<MapValue> class_ = MapValue.class;
                synchronized (MapValue.class) {
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
                Object[] arrobject = new Object[]{"fields_", FieldsDefaultEntryHolder.defaultEntry};
                return MapValue.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new MapValue();
    }

    @Deprecated
    @Override
    public Map<String, Value> getFields() {
        return this.getFieldsMap();
    }

    @Override
    public int getFieldsCount() {
        return this.internalGetFields().size();
    }

    @Override
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.internalGetFields());
    }

    @Override
    public Value getFieldsOrDefault(String string, Value value) {
        string.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
        if (mapFieldLite.containsKey((Object)string)) {
            value = (Value)mapFieldLite.get((Object)string);
        }
        return value;
    }

    @Override
    public Value getFieldsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
        if (mapFieldLite.containsKey((Object)string)) {
            return (Value)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MapValue, Builder>
    implements MapValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        @Override
        public boolean containsFields(String string) {
            string.getClass();
            return ((MapValue)this.instance).getFieldsMap().containsKey((Object)string);
        }

        @Deprecated
        @Override
        public Map<String, Value> getFields() {
            return this.getFieldsMap();
        }

        @Override
        public int getFieldsCount() {
            return ((MapValue)this.instance).getFieldsMap().size();
        }

        @Override
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((MapValue)this.instance).getFieldsMap());
        }

        @Override
        public Value getFieldsOrDefault(String string, Value value) {
            string.getClass();
            Map<String, Value> map = ((MapValue)this.instance).getFieldsMap();
            if (map.containsKey((Object)string)) {
                value = (Value)map.get((Object)string);
            }
            return value;
        }

        @Override
        public Value getFieldsOrThrow(String string) {
            string.getClass();
            Map<String, Value> map = ((MapValue)this.instance).getFieldsMap();
            if (map.containsKey((Object)string)) {
                return (Value)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFields(Map<String, Value> map) {
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }

        public Builder putFields(String string, Value value) {
            string.getClass();
            value.getClass();
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().put((Object)string, (Object)value);
            return this;
        }

        public Builder removeFields(String string) {
            string.getClass();
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().remove((Object)string);
            return this;
        }
    }

}

