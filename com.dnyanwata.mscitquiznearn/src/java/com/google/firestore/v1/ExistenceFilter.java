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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ExistenceFilter;
import com.google.firestore.v1.ExistenceFilterOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ExistenceFilter
extends GeneratedMessageLite<ExistenceFilter, Builder>
implements ExistenceFilterOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ExistenceFilter DEFAULT_INSTANCE;
    private static volatile Parser<ExistenceFilter> PARSER;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int count_;
    private int targetId_;

    static {
        ExistenceFilter existenceFilter;
        DEFAULT_INSTANCE = existenceFilter = new ExistenceFilter();
        GeneratedMessageLite.registerDefaultInstance(ExistenceFilter.class, (GeneratedMessageLite)existenceFilter);
    }

    private ExistenceFilter() {
    }

    private void clearCount() {
        this.count_ = 0;
    }

    private void clearTargetId() {
        this.targetId_ = 0;
    }

    public static ExistenceFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ExistenceFilter existenceFilter) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)existenceFilter);
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter)ExistenceFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)ExistenceFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ExistenceFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ExistenceFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ExistenceFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ExistenceFilter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCount(int n) {
        this.count_ = n;
    }

    private void setTargetId(int n) {
        this.targetId_ = n;
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
                Parser<ExistenceFilter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ExistenceFilter> class_ = ExistenceFilter.class;
                synchronized (ExistenceFilter.class) {
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
                Object[] arrobject = new Object[]{"targetId_", "count_"};
                return ExistenceFilter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ExistenceFilter();
    }

    @Override
    public int getCount() {
        return this.count_;
    }

    @Override
    public int getTargetId() {
        return this.targetId_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ExistenceFilter, Builder>
    implements ExistenceFilterOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCount() {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).clearCount();
            return this;
        }

        public Builder clearTargetId() {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).clearTargetId();
            return this;
        }

        @Override
        public int getCount() {
            return ((ExistenceFilter)this.instance).getCount();
        }

        @Override
        public int getTargetId() {
            return ((ExistenceFilter)this.instance).getTargetId();
        }

        public Builder setCount(int n) {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).setCount(n);
            return this;
        }

        public Builder setTargetId(int n) {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).setTargetId(n);
            return this;
        }
    }

}

