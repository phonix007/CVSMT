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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
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

public final class LabelDescriptor
extends GeneratedMessageLite<LabelDescriptor, Builder>
implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String key_ = "";
    private int valueType_;

    static {
        LabelDescriptor labelDescriptor;
        DEFAULT_INSTANCE = labelDescriptor = new LabelDescriptor();
        GeneratedMessageLite.registerDefaultInstance(LabelDescriptor.class, (GeneratedMessageLite)labelDescriptor);
    }

    private LabelDescriptor() {
    }

    private void clearDescription() {
        this.description_ = LabelDescriptor.getDefaultInstance().getDescription();
    }

    private void clearKey() {
        this.key_ = LabelDescriptor.getDefaultInstance().getKey();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LabelDescriptor labelDescriptor) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor)LabelDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)LabelDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LabelDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LabelDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LabelDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        LabelDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setKey(String string) {
        string.getClass();
        this.key_ = string;
    }

    private void setKeyBytes(ByteString byteString) {
        LabelDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.key_ = byteString.toStringUtf8();
    }

    private void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    private void setValueTypeValue(int n) {
        this.valueType_ = n;
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
                Parser<LabelDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<LabelDescriptor> class_ = LabelDescriptor.class;
                synchronized (LabelDescriptor.class) {
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
                Object[] arrobject = new Object[]{"key_", "valueType_", "description_"};
                return LabelDescriptor.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new LabelDescriptor();
    }

    @Override
    public String getDescription() {
        return this.description_;
    }

    @Override
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    @Override
    public String getKey() {
        return this.key_;
    }

    @Override
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8((String)this.key_);
    }

    @Override
    public ValueType getValueType() {
        ValueType valueType = ValueType.forNumber(this.valueType_);
        if (valueType == null) {
            valueType = ValueType.UNRECOGNIZED;
        }
        return valueType;
    }

    @Override
    public int getValueTypeValue() {
        return this.valueType_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LabelDescriptor, Builder>
    implements LabelDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearKey() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearKey();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearValueType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((LabelDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((LabelDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getKey() {
            return ((LabelDescriptor)this.instance).getKey();
        }

        @Override
        public ByteString getKeyBytes() {
            return ((LabelDescriptor)this.instance).getKeyBytes();
        }

        @Override
        public ValueType getValueType() {
            return ((LabelDescriptor)this.instance).getValueType();
        }

        @Override
        public int getValueTypeValue() {
            return ((LabelDescriptor)this.instance).getValueTypeValue();
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setKey(String string) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setKey(string);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int n) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setValueTypeValue(n);
            return this;
        }
    }

}

