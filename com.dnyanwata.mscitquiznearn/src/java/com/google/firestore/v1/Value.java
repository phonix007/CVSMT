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
 *  com.google.protobuf.NullValue
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value
extends GeneratedMessageLite<Value, Builder>
implements ValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<Value> PARSER;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        Value value;
        DEFAULT_INSTANCE = value = new Value();
        GeneratedMessageLite.registerDefaultInstance(Value.class, (GeneratedMessageLite)value);
    }

    private Value() {
    }

    private void clearArrayValue() {
        if (this.valueTypeCase_ == 9) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearBytesValue() {
        if (this.valueTypeCase_ == 18) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearMapValue() {
        if (this.valueTypeCase_ == 6) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearNullValue() {
        if (this.valueTypeCase_ == 11) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearReferenceValue() {
        if (this.valueTypeCase_ == 5) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearStringValue() {
        if (this.valueTypeCase_ == 17) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearValueType() {
        this.valueTypeCase_ = 0;
        this.valueType_ = null;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.valueType_ = this.valueTypeCase_ == 9 && this.valueType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)this.valueType_).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
        this.valueTypeCase_ = 9;
    }

    private void mergeGeoPointValue(LatLng latLng) {
        latLng.getClass();
        this.valueType_ = this.valueTypeCase_ == 8 && this.valueType_ != LatLng.getDefaultInstance() ? ((LatLng.Builder)LatLng.newBuilder((LatLng)this.valueType_).mergeFrom((GeneratedMessageLite)latLng)).buildPartial() : latLng;
        this.valueTypeCase_ = 8;
    }

    private void mergeMapValue(MapValue mapValue) {
        mapValue.getClass();
        this.valueType_ = this.valueTypeCase_ == 6 && this.valueType_ != MapValue.getDefaultInstance() ? ((MapValue.Builder)MapValue.newBuilder((MapValue)this.valueType_).mergeFrom((GeneratedMessageLite)mapValue)).buildPartial() : mapValue;
        this.valueTypeCase_ = 6;
    }

    private void mergeTimestampValue(Timestamp timestamp) {
        timestamp.getClass();
        this.valueType_ = this.valueTypeCase_ == 10 && this.valueType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.valueType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.valueTypeCase_ = 10;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Value value) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value)Value.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)Value.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Value parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.valueType_ = arrayValue;
        this.valueTypeCase_ = 9;
    }

    private void setBooleanValue(boolean bl) {
        this.valueTypeCase_ = 1;
        this.valueType_ = bl;
    }

    private void setBytesValue(ByteString byteString) {
        byteString.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = byteString;
    }

    private void setDoubleValue(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = d;
    }

    private void setGeoPointValue(LatLng latLng) {
        latLng.getClass();
        this.valueType_ = latLng;
        this.valueTypeCase_ = 8;
    }

    private void setIntegerValue(long l) {
        this.valueTypeCase_ = 2;
        this.valueType_ = l;
    }

    private void setMapValue(MapValue mapValue) {
        mapValue.getClass();
        this.valueType_ = mapValue;
        this.valueTypeCase_ = 6;
    }

    private void setNullValue(NullValue nullValue) {
        this.valueType_ = nullValue.getNumber();
        this.valueTypeCase_ = 11;
    }

    private void setNullValueValue(int n) {
        this.valueTypeCase_ = 11;
        this.valueType_ = n;
    }

    private void setReferenceValue(String string) {
        string.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = string;
    }

    private void setReferenceValueBytes(ByteString byteString) {
        Value.checkByteStringIsUtf8((ByteString)byteString);
        this.valueType_ = byteString.toStringUtf8();
        this.valueTypeCase_ = 5;
    }

    private void setStringValue(String string) {
        string.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = string;
    }

    private void setStringValueBytes(ByteString byteString) {
        Value.checkByteStringIsUtf8((ByteString)byteString);
        this.valueType_ = byteString.toStringUtf8();
        this.valueTypeCase_ = 17;
    }

    private void setTimestampValue(Timestamp timestamp) {
        timestamp.getClass();
        this.valueType_ = timestamp;
        this.valueTypeCase_ = 10;
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
                Parser<Value> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Value> class_ = Value.class;
                synchronized (Value.class) {
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
                Object[] arrobject = new Object[]{"valueType_", "valueTypeCase_", MapValue.class, LatLng.class, ArrayValue.class, Timestamp.class};
                return Value.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005\u023b\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011\u023b\u0000\u0012=\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Value();
    }

    @Override
    public ArrayValue getArrayValue() {
        if (this.valueTypeCase_ == 9) {
            return (ArrayValue)this.valueType_;
        }
        return ArrayValue.getDefaultInstance();
    }

    @Override
    public boolean getBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            return (Boolean)this.valueType_;
        }
        return false;
    }

    @Override
    public ByteString getBytesValue() {
        if (this.valueTypeCase_ == 18) {
            return (ByteString)this.valueType_;
        }
        return ByteString.EMPTY;
    }

    @Override
    public double getDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            return (Double)this.valueType_;
        }
        return 0.0;
    }

    @Override
    public LatLng getGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            return (LatLng)this.valueType_;
        }
        return LatLng.getDefaultInstance();
    }

    @Override
    public long getIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            return (Long)this.valueType_;
        }
        return 0L;
    }

    @Override
    public MapValue getMapValue() {
        if (this.valueTypeCase_ == 6) {
            return (MapValue)this.valueType_;
        }
        return MapValue.getDefaultInstance();
    }

    @Override
    public NullValue getNullValue() {
        if (this.valueTypeCase_ == 11) {
            NullValue nullValue = NullValue.forNumber((int)((Integer)this.valueType_));
            if (nullValue == null) {
                nullValue = NullValue.UNRECOGNIZED;
            }
            return nullValue;
        }
        return NullValue.NULL_VALUE;
    }

    @Override
    public int getNullValueValue() {
        if (this.valueTypeCase_ == 11) {
            return (Integer)this.valueType_;
        }
        return 0;
    }

    @Override
    public String getReferenceValue() {
        if (this.valueTypeCase_ == 5) {
            return (String)this.valueType_;
        }
        return "";
    }

    @Override
    public ByteString getReferenceValueBytes() {
        String string = this.valueTypeCase_ == 5 ? (String)this.valueType_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getStringValue() {
        if (this.valueTypeCase_ == 17) {
            return (String)this.valueType_;
        }
        return "";
    }

    @Override
    public ByteString getStringValueBytes() {
        String string = this.valueTypeCase_ == 17 ? (String)this.valueType_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public Timestamp getTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            return (Timestamp)this.valueType_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public ValueTypeCase getValueTypeCase() {
        return ValueTypeCase.forNumber(this.valueTypeCase_);
    }

    @Override
    public boolean hasArrayValue() {
        return this.valueTypeCase_ == 9;
    }

    @Override
    public boolean hasGeoPointValue() {
        return this.valueTypeCase_ == 8;
    }

    @Override
    public boolean hasMapValue() {
        return this.valueTypeCase_ == 6;
    }

    @Override
    public boolean hasTimestampValue() {
        return this.valueTypeCase_ == 10;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Value, Builder>
    implements ValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearArrayValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearArrayValue();
            return this;
        }

        public Builder clearBooleanValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearBooleanValue();
            return this;
        }

        public Builder clearBytesValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearBytesValue();
            return this;
        }

        public Builder clearDoubleValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearDoubleValue();
            return this;
        }

        public Builder clearGeoPointValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearGeoPointValue();
            return this;
        }

        public Builder clearIntegerValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearIntegerValue();
            return this;
        }

        public Builder clearMapValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearMapValue();
            return this;
        }

        public Builder clearNullValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearNullValue();
            return this;
        }

        public Builder clearReferenceValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearReferenceValue();
            return this;
        }

        public Builder clearStringValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearStringValue();
            return this;
        }

        public Builder clearTimestampValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearTimestampValue();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((Value)this.instance).clearValueType();
            return this;
        }

        @Override
        public ArrayValue getArrayValue() {
            return ((Value)this.instance).getArrayValue();
        }

        @Override
        public boolean getBooleanValue() {
            return ((Value)this.instance).getBooleanValue();
        }

        @Override
        public ByteString getBytesValue() {
            return ((Value)this.instance).getBytesValue();
        }

        @Override
        public double getDoubleValue() {
            return ((Value)this.instance).getDoubleValue();
        }

        @Override
        public LatLng getGeoPointValue() {
            return ((Value)this.instance).getGeoPointValue();
        }

        @Override
        public long getIntegerValue() {
            return ((Value)this.instance).getIntegerValue();
        }

        @Override
        public MapValue getMapValue() {
            return ((Value)this.instance).getMapValue();
        }

        @Override
        public NullValue getNullValue() {
            return ((Value)this.instance).getNullValue();
        }

        @Override
        public int getNullValueValue() {
            return ((Value)this.instance).getNullValueValue();
        }

        @Override
        public String getReferenceValue() {
            return ((Value)this.instance).getReferenceValue();
        }

        @Override
        public ByteString getReferenceValueBytes() {
            return ((Value)this.instance).getReferenceValueBytes();
        }

        @Override
        public String getStringValue() {
            return ((Value)this.instance).getStringValue();
        }

        @Override
        public ByteString getStringValueBytes() {
            return ((Value)this.instance).getStringValueBytes();
        }

        @Override
        public Timestamp getTimestampValue() {
            return ((Value)this.instance).getTimestampValue();
        }

        @Override
        public ValueTypeCase getValueTypeCase() {
            return ((Value)this.instance).getValueTypeCase();
        }

        @Override
        public boolean hasArrayValue() {
            return ((Value)this.instance).hasArrayValue();
        }

        @Override
        public boolean hasGeoPointValue() {
            return ((Value)this.instance).hasGeoPointValue();
        }

        @Override
        public boolean hasMapValue() {
            return ((Value)this.instance).hasMapValue();
        }

        @Override
        public boolean hasTimestampValue() {
            return ((Value)this.instance).hasTimestampValue();
        }

        public Builder mergeArrayValue(ArrayValue arrayValue) {
            this.copyOnWrite();
            ((Value)this.instance).mergeArrayValue(arrayValue);
            return this;
        }

        public Builder mergeGeoPointValue(LatLng latLng) {
            this.copyOnWrite();
            ((Value)this.instance).mergeGeoPointValue(latLng);
            return this;
        }

        public Builder mergeMapValue(MapValue mapValue) {
            this.copyOnWrite();
            ((Value)this.instance).mergeMapValue(mapValue);
            return this;
        }

        public Builder mergeTimestampValue(Timestamp timestamp) {
            this.copyOnWrite();
            ((Value)this.instance).mergeTimestampValue(timestamp);
            return this;
        }

        public Builder setArrayValue(ArrayValue.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setArrayValue((ArrayValue)builder.build());
            return this;
        }

        public Builder setArrayValue(ArrayValue arrayValue) {
            this.copyOnWrite();
            ((Value)this.instance).setArrayValue(arrayValue);
            return this;
        }

        public Builder setBooleanValue(boolean bl) {
            this.copyOnWrite();
            ((Value)this.instance).setBooleanValue(bl);
            return this;
        }

        public Builder setBytesValue(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setBytesValue(byteString);
            return this;
        }

        public Builder setDoubleValue(double d) {
            this.copyOnWrite();
            ((Value)this.instance).setDoubleValue(d);
            return this;
        }

        public Builder setGeoPointValue(LatLng.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setGeoPointValue((LatLng)builder.build());
            return this;
        }

        public Builder setGeoPointValue(LatLng latLng) {
            this.copyOnWrite();
            ((Value)this.instance).setGeoPointValue(latLng);
            return this;
        }

        public Builder setIntegerValue(long l) {
            this.copyOnWrite();
            ((Value)this.instance).setIntegerValue(l);
            return this;
        }

        public Builder setMapValue(MapValue.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setMapValue((MapValue)builder.build());
            return this;
        }

        public Builder setMapValue(MapValue mapValue) {
            this.copyOnWrite();
            ((Value)this.instance).setMapValue(mapValue);
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValue(nullValue);
            return this;
        }

        public Builder setNullValueValue(int n) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValueValue(n);
            return this;
        }

        public Builder setReferenceValue(String string) {
            this.copyOnWrite();
            ((Value)this.instance).setReferenceValue(string);
            return this;
        }

        public Builder setReferenceValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setReferenceValueBytes(byteString);
            return this;
        }

        public Builder setStringValue(String string) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValue(string);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValueBytes(byteString);
            return this;
        }

        public Builder setTimestampValue(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setTimestampValue((Timestamp)builder.build());
            return this;
        }

        public Builder setTimestampValue(Timestamp timestamp) {
            this.copyOnWrite();
            ((Value)this.instance).setTimestampValue(timestamp);
            return this;
        }
    }

}

