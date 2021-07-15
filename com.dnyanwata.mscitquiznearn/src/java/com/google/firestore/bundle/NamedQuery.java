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
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundledQuery;
import com.google.firestore.bundle.NamedQuery;
import com.google.firestore.bundle.NamedQueryOrBuilder;
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

public final class NamedQuery
extends GeneratedMessageLite<NamedQuery, Builder>
implements NamedQueryOrBuilder {
    public static final int BUNDLED_QUERY_FIELD_NUMBER = 2;
    private static final NamedQuery DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<NamedQuery> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    private BundledQuery bundledQuery_;
    private String name_ = "";
    private Timestamp readTime_;

    static {
        NamedQuery namedQuery;
        DEFAULT_INSTANCE = namedQuery = new NamedQuery();
        GeneratedMessageLite.registerDefaultInstance(NamedQuery.class, (GeneratedMessageLite)namedQuery);
    }

    private NamedQuery() {
    }

    private void clearBundledQuery() {
        this.bundledQuery_ = null;
    }

    private void clearName() {
        this.name_ = NamedQuery.getDefaultInstance().getName();
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    public static NamedQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBundledQuery(BundledQuery bundledQuery) {
        bundledQuery.getClass();
        BundledQuery bundledQuery2 = this.bundledQuery_;
        if (bundledQuery2 != null && bundledQuery2 != BundledQuery.getDefaultInstance()) {
            this.bundledQuery_ = (BundledQuery)((BundledQuery.Builder)BundledQuery.newBuilder(this.bundledQuery_).mergeFrom((GeneratedMessageLite)bundledQuery)).buildPartial();
            return;
        }
        this.bundledQuery_ = bundledQuery;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.readTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.readTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.readTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NamedQuery namedQuery) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)namedQuery);
    }

    public static NamedQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NamedQuery)NamedQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static NamedQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NamedQuery)NamedQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static NamedQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static NamedQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static NamedQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static NamedQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static NamedQuery parseFrom(InputStream inputStream) throws IOException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static NamedQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static NamedQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static NamedQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static NamedQuery parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static NamedQuery parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NamedQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<NamedQuery> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBundledQuery(BundledQuery bundledQuery) {
        bundledQuery.getClass();
        this.bundledQuery_ = bundledQuery;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        NamedQuery.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
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
                Parser<NamedQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<NamedQuery> class_ = NamedQuery.class;
                synchronized (NamedQuery.class) {
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
                Object[] arrobject = new Object[]{"name_", "bundledQuery_", "readTime_"};
                return NamedQuery.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new NamedQuery();
    }

    @Override
    public BundledQuery getBundledQuery() {
        BundledQuery bundledQuery = this.bundledQuery_;
        if (bundledQuery == null) {
            bundledQuery = BundledQuery.getDefaultInstance();
        }
        return bundledQuery;
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public boolean hasBundledQuery() {
        return this.bundledQuery_ != null;
    }

    @Override
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<NamedQuery, Builder>
    implements NamedQueryOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearBundledQuery() {
            this.copyOnWrite();
            ((NamedQuery)this.instance).clearBundledQuery();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((NamedQuery)this.instance).clearName();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((NamedQuery)this.instance).clearReadTime();
            return this;
        }

        @Override
        public BundledQuery getBundledQuery() {
            return ((NamedQuery)this.instance).getBundledQuery();
        }

        @Override
        public String getName() {
            return ((NamedQuery)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((NamedQuery)this.instance).getNameBytes();
        }

        @Override
        public Timestamp getReadTime() {
            return ((NamedQuery)this.instance).getReadTime();
        }

        @Override
        public boolean hasBundledQuery() {
            return ((NamedQuery)this.instance).hasBundledQuery();
        }

        @Override
        public boolean hasReadTime() {
            return ((NamedQuery)this.instance).hasReadTime();
        }

        public Builder mergeBundledQuery(BundledQuery bundledQuery) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).mergeBundledQuery(bundledQuery);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setBundledQuery(BundledQuery.Builder builder) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setBundledQuery((BundledQuery)builder.build());
            return this;
        }

        public Builder setBundledQuery(BundledQuery bundledQuery) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setBundledQuery(bundledQuery);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((NamedQuery)this.instance).setReadTime(timestamp);
            return this;
        }
    }

}

