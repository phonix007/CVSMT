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
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.PreconditionOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Precondition
extends GeneratedMessageLite<Precondition, Builder>
implements PreconditionOrBuilder {
    private static final Precondition DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile Parser<Precondition> PARSER;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        Precondition precondition;
        DEFAULT_INSTANCE = precondition = new Precondition();
        GeneratedMessageLite.registerDefaultInstance(Precondition.class, (GeneratedMessageLite)precondition);
    }

    private Precondition() {
    }

    private void clearConditionType() {
        this.conditionTypeCase_ = 0;
        this.conditionType_ = null;
    }

    private void clearExists() {
        if (this.conditionTypeCase_ == 1) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    private void clearUpdateTime() {
        if (this.conditionTypeCase_ == 2) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    public static Precondition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.conditionType_ = this.conditionTypeCase_ == 2 && this.conditionType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.conditionType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.conditionTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Precondition precondition) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)precondition);
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Precondition)Precondition.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)Precondition.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Precondition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Precondition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(InputStream inputStream) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Precondition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Precondition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Precondition parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Precondition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setExists(boolean bl) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = bl;
    }

    private void setUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.conditionType_ = timestamp;
        this.conditionTypeCase_ = 2;
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
                Parser<Precondition> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Precondition> class_ = Precondition.class;
                synchronized (Precondition.class) {
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
                Object[] arrobject = new Object[]{"conditionType_", "conditionTypeCase_", Timestamp.class};
                return Precondition.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Precondition();
    }

    @Override
    public ConditionTypeCase getConditionTypeCase() {
        return ConditionTypeCase.forNumber(this.conditionTypeCase_);
    }

    @Override
    public boolean getExists() {
        if (this.conditionTypeCase_ == 1) {
            return (Boolean)this.conditionType_;
        }
        return false;
    }

    @Override
    public Timestamp getUpdateTime() {
        if (this.conditionTypeCase_ == 2) {
            return (Timestamp)this.conditionType_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public boolean hasUpdateTime() {
        return this.conditionTypeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Precondition, Builder>
    implements PreconditionOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConditionType() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearConditionType();
            return this;
        }

        public Builder clearExists() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearExists();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearUpdateTime();
            return this;
        }

        @Override
        public ConditionTypeCase getConditionTypeCase() {
            return ((Precondition)this.instance).getConditionTypeCase();
        }

        @Override
        public boolean getExists() {
            return ((Precondition)this.instance).getExists();
        }

        @Override
        public Timestamp getUpdateTime() {
            return ((Precondition)this.instance).getUpdateTime();
        }

        @Override
        public boolean hasUpdateTime() {
            return ((Precondition)this.instance).hasUpdateTime();
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Precondition)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder setExists(boolean bl) {
            this.copyOnWrite();
            ((Precondition)this.instance).setExists(bl);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Precondition)this.instance).setUpdateTime((Timestamp)builder.build());
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Precondition)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

