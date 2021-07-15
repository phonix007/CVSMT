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
 *  com.google.rpc.BadRequest$1
 *  com.google.rpc.BadRequest$FieldViolationOrBuilder
 *  com.google.rpc.BadRequestOrBuilder
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
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.BadRequest;
import com.google.rpc.BadRequestOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class BadRequest
extends GeneratedMessageLite<BadRequest, Builder>
implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE;
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<BadRequest> PARSER;
    private Internal.ProtobufList<FieldViolation> fieldViolations_ = BadRequest.emptyProtobufList();

    static {
        BadRequest badRequest;
        DEFAULT_INSTANCE = badRequest = new BadRequest();
        GeneratedMessageLite.registerDefaultInstance(BadRequest.class, (GeneratedMessageLite)badRequest);
    }

    private BadRequest() {
    }

    private void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        this.ensureFieldViolationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldViolations_);
    }

    private void addFieldViolations(int n, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(n, (Object)fieldViolation);
    }

    private void addFieldViolations(FieldViolation fieldViolation) {
        fieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add((Object)fieldViolation);
    }

    private void clearFieldViolations() {
        this.fieldViolations_ = BadRequest.emptyProtobufList();
    }

    private void ensureFieldViolationsIsMutable() {
        Internal.ProtobufList<FieldViolation> protobufList = this.fieldViolations_;
        if (!protobufList.isModifiable()) {
            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BadRequest badRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest)BadRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)BadRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BadRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BadRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldViolations(int n) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(n);
    }

    private void setFieldViolations(int n, FieldViolation fieldViolation) {
        fieldViolation.getClass();
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(n, (Object)fieldViolation);
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
                Parser<BadRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BadRequest> class_ = BadRequest.class;
                synchronized (BadRequest.class) {
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
                Object[] arrobject = new Object[]{"fieldViolations_", FieldViolation.class};
                return BadRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BadRequest();
    }

    public FieldViolation getFieldViolations(int n) {
        return (FieldViolation)((Object)this.fieldViolations_.get(n));
    }

    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public FieldViolationOrBuilder getFieldViolationsOrBuilder(int n) {
        return this.fieldViolations_.get(n);
    }

    public List<? extends FieldViolationOrBuilder> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BadRequest, Builder>
    implements BadRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addAllFieldViolations((Iterable<? extends FieldViolation>)iterable);
            return this;
        }

        public Builder addFieldViolations(int n, FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(n, (FieldViolation)builder.build());
            return this;
        }

        public Builder addFieldViolations(int n, FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(n, fieldViolation);
            return this;
        }

        public Builder addFieldViolations(FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations((FieldViolation)builder.build());
            return this;
        }

        public Builder addFieldViolations(FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(fieldViolation);
            return this;
        }

        public Builder clearFieldViolations() {
            this.copyOnWrite();
            ((BadRequest)this.instance).clearFieldViolations();
            return this;
        }

        public FieldViolation getFieldViolations(int n) {
            return ((BadRequest)this.instance).getFieldViolations(n);
        }

        public int getFieldViolationsCount() {
            return ((BadRequest)this.instance).getFieldViolationsCount();
        }

        public List<FieldViolation> getFieldViolationsList() {
            return Collections.unmodifiableList(((BadRequest)this.instance).getFieldViolationsList());
        }

        public Builder removeFieldViolations(int n) {
            this.copyOnWrite();
            ((BadRequest)this.instance).removeFieldViolations(n);
            return this;
        }

        public Builder setFieldViolations(int n, FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).setFieldViolations(n, (FieldViolation)builder.build());
            return this;
        }

        public Builder setFieldViolations(int n, FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).setFieldViolations(n, fieldViolation);
            return this;
        }
    }

    public static final class FieldViolation
    extends GeneratedMessageLite<FieldViolation, Builder>
    implements FieldViolationOrBuilder {
        private static final FieldViolation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<FieldViolation> PARSER;
        private String description_ = "";
        private String field_ = "";

        static {
            FieldViolation fieldViolation;
            DEFAULT_INSTANCE = fieldViolation = new FieldViolation();
            GeneratedMessageLite.registerDefaultInstance(FieldViolation.class, (GeneratedMessageLite)fieldViolation);
        }

        private FieldViolation() {
        }

        private void clearDescription() {
            this.description_ = FieldViolation.getDefaultInstance().getDescription();
        }

        private void clearField() {
            this.field_ = FieldViolation.getDefaultInstance().getField();
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldViolation fieldViolation) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)fieldViolation);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation)FieldViolation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)FieldViolation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldViolation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static FieldViolation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldViolation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldViolation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDescription(String string) {
            string.getClass();
            this.description_ = string;
        }

        private void setDescriptionBytes(ByteString byteString) {
            FieldViolation.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
        }

        private void setField(String string) {
            string.getClass();
            this.field_ = string;
        }

        private void setFieldBytes(ByteString byteString) {
            FieldViolation.checkByteStringIsUtf8((ByteString)byteString);
            this.field_ = byteString.toStringUtf8();
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
                    Parser<FieldViolation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<FieldViolation> class_ = FieldViolation.class;
                    synchronized (FieldViolation.class) {
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
                    Object[] arrobject = new Object[]{"field_", "description_"};
                    return FieldViolation.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new FieldViolation();
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8((String)this.description_);
        }

        public String getField() {
            return this.field_;
        }

        public ByteString getFieldBytes() {
            return ByteString.copyFromUtf8((String)this.field_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldViolation, Builder>
        implements FieldViolationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((FieldViolation)this.instance).clearDescription();
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((FieldViolation)this.instance).clearField();
                return this;
            }

            public String getDescription() {
                return ((FieldViolation)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((FieldViolation)this.instance).getDescriptionBytes();
            }

            public String getField() {
                return ((FieldViolation)this.instance).getField();
            }

            public ByteString getFieldBytes() {
                return ((FieldViolation)this.instance).getFieldBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setField(String string) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setField(string);
                return this;
            }

            public Builder setFieldBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setFieldBytes(byteString);
                return this;
            }
        }

    }

}

