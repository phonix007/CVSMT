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
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
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
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.DocumentTransformOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DocumentTransform
extends GeneratedMessageLite<DocumentTransform, Builder>
implements DocumentTransformOrBuilder {
    private static final DocumentTransform DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentTransform> PARSER;
    private String document_ = "";
    private Internal.ProtobufList<FieldTransform> fieldTransforms_ = DocumentTransform.emptyProtobufList();

    static {
        DocumentTransform documentTransform;
        DEFAULT_INSTANCE = documentTransform = new DocumentTransform();
        GeneratedMessageLite.registerDefaultInstance(DocumentTransform.class, (GeneratedMessageLite)documentTransform);
    }

    private DocumentTransform() {
    }

    private void addAllFieldTransforms(Iterable<? extends FieldTransform> iterable) {
        this.ensureFieldTransformsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldTransforms_);
    }

    private void addFieldTransforms(int n, FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(n, (Object)fieldTransform);
    }

    private void addFieldTransforms(FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add((Object)fieldTransform);
    }

    private void clearDocument() {
        this.document_ = DocumentTransform.getDefaultInstance().getDocument();
    }

    private void clearFieldTransforms() {
        this.fieldTransforms_ = DocumentTransform.emptyProtobufList();
    }

    private void ensureFieldTransformsIsMutable() {
        Internal.ProtobufList<FieldTransform> protobufList = this.fieldTransforms_;
        if (!protobufList.isModifiable()) {
            this.fieldTransforms_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static DocumentTransform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DocumentTransform documentTransform) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentTransform);
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform)DocumentTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)DocumentTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentTransform parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentTransform parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DocumentTransform parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentTransform parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentTransform> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldTransforms(int n) {
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.remove(n);
    }

    private void setDocument(String string) {
        string.getClass();
        this.document_ = string;
    }

    private void setDocumentBytes(ByteString byteString) {
        DocumentTransform.checkByteStringIsUtf8((ByteString)byteString);
        this.document_ = byteString.toStringUtf8();
    }

    private void setFieldTransforms(int n, FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.set(n, (Object)fieldTransform);
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
                Parser<DocumentTransform> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DocumentTransform> class_ = DocumentTransform.class;
                synchronized (DocumentTransform.class) {
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
                Object[] arrobject = new Object[]{"document_", "fieldTransforms_", FieldTransform.class};
                return DocumentTransform.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DocumentTransform();
    }

    @Override
    public String getDocument() {
        return this.document_;
    }

    @Override
    public ByteString getDocumentBytes() {
        return ByteString.copyFromUtf8((String)this.document_);
    }

    @Override
    public FieldTransform getFieldTransforms(int n) {
        return (FieldTransform)this.fieldTransforms_.get(n);
    }

    @Override
    public int getFieldTransformsCount() {
        return this.fieldTransforms_.size();
    }

    @Override
    public List<FieldTransform> getFieldTransformsList() {
        return this.fieldTransforms_;
    }

    public FieldTransformOrBuilder getFieldTransformsOrBuilder(int n) {
        return this.fieldTransforms_.get(n);
    }

    public List<? extends FieldTransformOrBuilder> getFieldTransformsOrBuilderList() {
        return this.fieldTransforms_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentTransform, Builder>
    implements DocumentTransformOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldTransforms(Iterable<? extends FieldTransform> iterable) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addAllFieldTransforms((Iterable<? extends FieldTransform>)iterable);
            return this;
        }

        public Builder addFieldTransforms(int n, FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(n, (FieldTransform)builder.build());
            return this;
        }

        public Builder addFieldTransforms(int n, FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(n, fieldTransform);
            return this;
        }

        public Builder addFieldTransforms(FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms((FieldTransform)builder.build());
            return this;
        }

        public Builder addFieldTransforms(FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(fieldTransform);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).clearDocument();
            return this;
        }

        public Builder clearFieldTransforms() {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).clearFieldTransforms();
            return this;
        }

        @Override
        public String getDocument() {
            return ((DocumentTransform)this.instance).getDocument();
        }

        @Override
        public ByteString getDocumentBytes() {
            return ((DocumentTransform)this.instance).getDocumentBytes();
        }

        @Override
        public FieldTransform getFieldTransforms(int n) {
            return ((DocumentTransform)this.instance).getFieldTransforms(n);
        }

        @Override
        public int getFieldTransformsCount() {
            return ((DocumentTransform)this.instance).getFieldTransformsCount();
        }

        @Override
        public List<FieldTransform> getFieldTransformsList() {
            return Collections.unmodifiableList(((DocumentTransform)this.instance).getFieldTransformsList());
        }

        public Builder removeFieldTransforms(int n) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).removeFieldTransforms(n);
            return this;
        }

        public Builder setDocument(String string) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setDocument(string);
            return this;
        }

        public Builder setDocumentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setDocumentBytes(byteString);
            return this;
        }

        public Builder setFieldTransforms(int n, FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setFieldTransforms(n, (FieldTransform)builder.build());
            return this;
        }

        public Builder setFieldTransforms(int n, FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setFieldTransforms(n, fieldTransform);
            return this;
        }
    }

    public static final class FieldTransform
    extends GeneratedMessageLite<FieldTransform, Builder>
    implements FieldTransformOrBuilder {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final FieldTransform DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile Parser<FieldTransform> PARSER;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private String fieldPath_ = "";
        private int transformTypeCase_ = 0;
        private Object transformType_;

        static {
            FieldTransform fieldTransform;
            DEFAULT_INSTANCE = fieldTransform = new FieldTransform();
            GeneratedMessageLite.registerDefaultInstance(FieldTransform.class, (GeneratedMessageLite)fieldTransform);
        }

        private FieldTransform() {
        }

        private void clearAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearFieldPath() {
            this.fieldPath_ = FieldTransform.getDefaultInstance().getFieldPath();
        }

        private void clearIncrement() {
            if (this.transformTypeCase_ == 3) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearMaximum() {
            if (this.transformTypeCase_ == 4) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearMinimum() {
            if (this.transformTypeCase_ == 5) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearTransformType() {
            this.transformTypeCase_ = 0;
            this.transformType_ = null;
        }

        public static FieldTransform getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAppendMissingElements(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = this.transformTypeCase_ == 6 && this.transformType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)this.transformType_).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
            this.transformTypeCase_ = 6;
        }

        private void mergeIncrement(Value value) {
            value.getClass();
            this.transformType_ = this.transformTypeCase_ == 3 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)this.transformType_).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 3;
        }

        private void mergeMaximum(Value value) {
            value.getClass();
            this.transformType_ = this.transformTypeCase_ == 4 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)this.transformType_).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 4;
        }

        private void mergeMinimum(Value value) {
            value.getClass();
            this.transformType_ = this.transformTypeCase_ == 5 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)this.transformType_).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 5;
        }

        private void mergeRemoveAllFromArray(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = this.transformTypeCase_ == 7 && this.transformType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)this.transformType_).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
            this.transformTypeCase_ = 7;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldTransform fieldTransform) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)fieldTransform);
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldTransform)FieldTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)FieldTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldTransform parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(InputStream inputStream) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldTransform parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static FieldTransform parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldTransform parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldTransform> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppendMissingElements(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 6;
        }

        private void setFieldPath(String string) {
            string.getClass();
            this.fieldPath_ = string;
        }

        private void setFieldPathBytes(ByteString byteString) {
            FieldTransform.checkByteStringIsUtf8((ByteString)byteString);
            this.fieldPath_ = byteString.toStringUtf8();
        }

        private void setIncrement(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 3;
        }

        private void setMaximum(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 4;
        }

        private void setMinimum(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 5;
        }

        private void setRemoveAllFromArray(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 7;
        }

        private void setSetToServerValue(ServerValue serverValue) {
            this.transformType_ = serverValue.getNumber();
            this.transformTypeCase_ = 2;
        }

        private void setSetToServerValueValue(int n) {
            this.transformTypeCase_ = 2;
            this.transformType_ = n;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (com.google.firestore.v1.DocumentTransform$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
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
                    Parser<FieldTransform> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<FieldTransform> class_ = FieldTransform.class;
                    synchronized (FieldTransform.class) {
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
                    Object[] arrobject = new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", Value.class, Value.class, Value.class, ArrayValue.class, ArrayValue.class};
                    return FieldTransform.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new FieldTransform();
        }

        @Override
        public ArrayValue getAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                return (ArrayValue)this.transformType_;
            }
            return ArrayValue.getDefaultInstance();
        }

        @Override
        public String getFieldPath() {
            return this.fieldPath_;
        }

        @Override
        public ByteString getFieldPathBytes() {
            return ByteString.copyFromUtf8((String)this.fieldPath_);
        }

        @Override
        public Value getIncrement() {
            if (this.transformTypeCase_ == 3) {
                return (Value)this.transformType_;
            }
            return Value.getDefaultInstance();
        }

        @Override
        public Value getMaximum() {
            if (this.transformTypeCase_ == 4) {
                return (Value)this.transformType_;
            }
            return Value.getDefaultInstance();
        }

        @Override
        public Value getMinimum() {
            if (this.transformTypeCase_ == 5) {
                return (Value)this.transformType_;
            }
            return Value.getDefaultInstance();
        }

        @Override
        public ArrayValue getRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                return (ArrayValue)this.transformType_;
            }
            return ArrayValue.getDefaultInstance();
        }

        @Override
        public ServerValue getSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                ServerValue serverValue = ServerValue.forNumber((Integer)this.transformType_);
                if (serverValue == null) {
                    serverValue = ServerValue.UNRECOGNIZED;
                }
                return serverValue;
            }
            return ServerValue.SERVER_VALUE_UNSPECIFIED;
        }

        @Override
        public int getSetToServerValueValue() {
            if (this.transformTypeCase_ == 2) {
                return (Integer)this.transformType_;
            }
            return 0;
        }

        @Override
        public TransformTypeCase getTransformTypeCase() {
            return TransformTypeCase.forNumber(this.transformTypeCase_);
        }

        @Override
        public boolean hasAppendMissingElements() {
            return this.transformTypeCase_ == 6;
        }

        @Override
        public boolean hasIncrement() {
            return this.transformTypeCase_ == 3;
        }

        @Override
        public boolean hasMaximum() {
            return this.transformTypeCase_ == 4;
        }

        @Override
        public boolean hasMinimum() {
            return this.transformTypeCase_ == 5;
        }

        @Override
        public boolean hasRemoveAllFromArray() {
            return this.transformTypeCase_ == 7;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldTransform, Builder>
        implements FieldTransformOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAppendMissingElements() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearAppendMissingElements();
                return this;
            }

            public Builder clearFieldPath() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearFieldPath();
                return this;
            }

            public Builder clearIncrement() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearIncrement();
                return this;
            }

            public Builder clearMaximum() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearMaximum();
                return this;
            }

            public Builder clearMinimum() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearMinimum();
                return this;
            }

            public Builder clearRemoveAllFromArray() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearRemoveAllFromArray();
                return this;
            }

            public Builder clearSetToServerValue() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearSetToServerValue();
                return this;
            }

            public Builder clearTransformType() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearTransformType();
                return this;
            }

            @Override
            public ArrayValue getAppendMissingElements() {
                return ((FieldTransform)this.instance).getAppendMissingElements();
            }

            @Override
            public String getFieldPath() {
                return ((FieldTransform)this.instance).getFieldPath();
            }

            @Override
            public ByteString getFieldPathBytes() {
                return ((FieldTransform)this.instance).getFieldPathBytes();
            }

            @Override
            public Value getIncrement() {
                return ((FieldTransform)this.instance).getIncrement();
            }

            @Override
            public Value getMaximum() {
                return ((FieldTransform)this.instance).getMaximum();
            }

            @Override
            public Value getMinimum() {
                return ((FieldTransform)this.instance).getMinimum();
            }

            @Override
            public ArrayValue getRemoveAllFromArray() {
                return ((FieldTransform)this.instance).getRemoveAllFromArray();
            }

            @Override
            public ServerValue getSetToServerValue() {
                return ((FieldTransform)this.instance).getSetToServerValue();
            }

            @Override
            public int getSetToServerValueValue() {
                return ((FieldTransform)this.instance).getSetToServerValueValue();
            }

            @Override
            public TransformTypeCase getTransformTypeCase() {
                return ((FieldTransform)this.instance).getTransformTypeCase();
            }

            @Override
            public boolean hasAppendMissingElements() {
                return ((FieldTransform)this.instance).hasAppendMissingElements();
            }

            @Override
            public boolean hasIncrement() {
                return ((FieldTransform)this.instance).hasIncrement();
            }

            @Override
            public boolean hasMaximum() {
                return ((FieldTransform)this.instance).hasMaximum();
            }

            @Override
            public boolean hasMinimum() {
                return ((FieldTransform)this.instance).hasMinimum();
            }

            @Override
            public boolean hasRemoveAllFromArray() {
                return ((FieldTransform)this.instance).hasRemoveAllFromArray();
            }

            public Builder mergeAppendMissingElements(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeAppendMissingElements(arrayValue);
                return this;
            }

            public Builder mergeIncrement(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeIncrement(value);
                return this;
            }

            public Builder mergeMaximum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeMaximum(value);
                return this;
            }

            public Builder mergeMinimum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeMinimum(value);
                return this;
            }

            public Builder mergeRemoveAllFromArray(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeRemoveAllFromArray(arrayValue);
                return this;
            }

            public Builder setAppendMissingElements(ArrayValue.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setAppendMissingElements((ArrayValue)builder.build());
                return this;
            }

            public Builder setAppendMissingElements(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setAppendMissingElements(arrayValue);
                return this;
            }

            public Builder setFieldPath(String string) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setFieldPath(string);
                return this;
            }

            public Builder setFieldPathBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setFieldPathBytes(byteString);
                return this;
            }

            public Builder setIncrement(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setIncrement((Value)builder.build());
                return this;
            }

            public Builder setIncrement(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setIncrement(value);
                return this;
            }

            public Builder setMaximum(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMaximum((Value)builder.build());
                return this;
            }

            public Builder setMaximum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMaximum(value);
                return this;
            }

            public Builder setMinimum(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMinimum((Value)builder.build());
                return this;
            }

            public Builder setMinimum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMinimum(value);
                return this;
            }

            public Builder setRemoveAllFromArray(ArrayValue.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setRemoveAllFromArray((ArrayValue)builder.build());
                return this;
            }

            public Builder setRemoveAllFromArray(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setRemoveAllFromArray(arrayValue);
                return this;
            }

            public Builder setSetToServerValue(ServerValue serverValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setSetToServerValue(serverValue);
                return this;
            }

            public Builder setSetToServerValueValue(int n) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setSetToServerValueValue(n);
                return this;
            }
        }

    }

}

