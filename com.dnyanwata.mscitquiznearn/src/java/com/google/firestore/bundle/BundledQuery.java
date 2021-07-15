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
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundledQuery;
import com.google.firestore.bundle.BundledQueryOrBuilder;
import com.google.firestore.v1.StructuredQuery;
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

public final class BundledQuery
extends GeneratedMessageLite<BundledQuery, Builder>
implements BundledQueryOrBuilder {
    private static final BundledQuery DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<BundledQuery> PARSER;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private String parent_ = "";
    private int queryTypeCase_ = 0;
    private Object queryType_;

    static {
        BundledQuery bundledQuery;
        DEFAULT_INSTANCE = bundledQuery = new BundledQuery();
        GeneratedMessageLite.registerDefaultInstance(BundledQuery.class, (GeneratedMessageLite)bundledQuery);
    }

    private BundledQuery() {
    }

    private void clearLimitType() {
        this.limitType_ = 0;
    }

    private void clearParent() {
        this.parent_ = BundledQuery.getDefaultInstance().getParent();
    }

    private void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    private void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    public static BundledQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = this.queryTypeCase_ == 2 && this.queryType_ != StructuredQuery.getDefaultInstance() ? ((StructuredQuery.Builder)StructuredQuery.newBuilder((StructuredQuery)this.queryType_).mergeFrom((GeneratedMessageLite)structuredQuery)).buildPartial() : structuredQuery;
        this.queryTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BundledQuery bundledQuery) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundledQuery);
    }

    public static BundledQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundledQuery)BundledQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundledQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledQuery)BundledQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BundledQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BundledQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledQuery parseFrom(InputStream inputStream) throws IOException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundledQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BundledQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledQuery parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BundledQuery parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BundledQuery> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLimitType(LimitType limitType) {
        this.limitType_ = limitType.getNumber();
    }

    private void setLimitTypeValue(int n) {
        this.limitType_ = n;
    }

    private void setParent(String string) {
        string.getClass();
        this.parent_ = string;
    }

    private void setParentBytes(ByteString byteString) {
        BundledQuery.checkByteStringIsUtf8((ByteString)byteString);
        this.parent_ = byteString.toStringUtf8();
    }

    private void setStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = structuredQuery;
        this.queryTypeCase_ = 2;
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
                Parser<BundledQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BundledQuery> class_ = BundledQuery.class;
                synchronized (BundledQuery.class) {
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
                Object[] arrobject = new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class, "limitType_"};
                return BundledQuery.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0003\f", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BundledQuery();
    }

    @Override
    public LimitType getLimitType() {
        LimitType limitType = LimitType.forNumber(this.limitType_);
        if (limitType == null) {
            limitType = LimitType.UNRECOGNIZED;
        }
        return limitType;
    }

    @Override
    public int getLimitTypeValue() {
        return this.limitType_;
    }

    @Override
    public String getParent() {
        return this.parent_;
    }

    @Override
    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
    }

    @Override
    public QueryTypeCase getQueryTypeCase() {
        return QueryTypeCase.forNumber(this.queryTypeCase_);
    }

    @Override
    public StructuredQuery getStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            return (StructuredQuery)this.queryType_;
        }
        return StructuredQuery.getDefaultInstance();
    }

    @Override
    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BundledQuery, Builder>
    implements BundledQueryOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLimitType() {
            this.copyOnWrite();
            ((BundledQuery)this.instance).clearLimitType();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((BundledQuery)this.instance).clearParent();
            return this;
        }

        public Builder clearQueryType() {
            this.copyOnWrite();
            ((BundledQuery)this.instance).clearQueryType();
            return this;
        }

        public Builder clearStructuredQuery() {
            this.copyOnWrite();
            ((BundledQuery)this.instance).clearStructuredQuery();
            return this;
        }

        @Override
        public LimitType getLimitType() {
            return ((BundledQuery)this.instance).getLimitType();
        }

        @Override
        public int getLimitTypeValue() {
            return ((BundledQuery)this.instance).getLimitTypeValue();
        }

        @Override
        public String getParent() {
            return ((BundledQuery)this.instance).getParent();
        }

        @Override
        public ByteString getParentBytes() {
            return ((BundledQuery)this.instance).getParentBytes();
        }

        @Override
        public QueryTypeCase getQueryTypeCase() {
            return ((BundledQuery)this.instance).getQueryTypeCase();
        }

        @Override
        public StructuredQuery getStructuredQuery() {
            return ((BundledQuery)this.instance).getStructuredQuery();
        }

        @Override
        public boolean hasStructuredQuery() {
            return ((BundledQuery)this.instance).hasStructuredQuery();
        }

        public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).mergeStructuredQuery(structuredQuery);
            return this;
        }

        public Builder setLimitType(LimitType limitType) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setLimitType(limitType);
            return this;
        }

        public Builder setLimitTypeValue(int n) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setLimitTypeValue(n);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setParentBytes(byteString);
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery.Builder builder) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setStructuredQuery((StructuredQuery)builder.build());
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((BundledQuery)this.instance).setStructuredQuery(structuredQuery);
            return this;
        }
    }

}

