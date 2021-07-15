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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundledDocumentMetadata;
import com.google.firestore.bundle.BundledDocumentMetadataOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class BundledDocumentMetadata
extends GeneratedMessageLite<BundledDocumentMetadata, Builder>
implements BundledDocumentMetadataOrBuilder {
    private static final BundledDocumentMetadata DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<BundledDocumentMetadata> PARSER;
    public static final int QUERIES_FIELD_NUMBER = 4;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private boolean exists_;
    private String name_ = "";
    private Internal.ProtobufList<String> queries_ = GeneratedMessageLite.emptyProtobufList();
    private Timestamp readTime_;

    static {
        BundledDocumentMetadata bundledDocumentMetadata;
        DEFAULT_INSTANCE = bundledDocumentMetadata = new BundledDocumentMetadata();
        GeneratedMessageLite.registerDefaultInstance(BundledDocumentMetadata.class, (GeneratedMessageLite)bundledDocumentMetadata);
    }

    private BundledDocumentMetadata() {
    }

    private void addAllQueries(Iterable<String> iterable) {
        this.ensureQueriesIsMutable();
        AbstractMessageLite.addAll(iterable, this.queries_);
    }

    private void addQueries(String string) {
        string.getClass();
        this.ensureQueriesIsMutable();
        this.queries_.add((Object)string);
    }

    private void addQueriesBytes(ByteString byteString) {
        BundledDocumentMetadata.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureQueriesIsMutable();
        this.queries_.add((Object)byteString.toStringUtf8());
    }

    private void clearExists() {
        this.exists_ = false;
    }

    private void clearName() {
        this.name_ = BundledDocumentMetadata.getDefaultInstance().getName();
    }

    private void clearQueries() {
        this.queries_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void ensureQueriesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.queries_;
        if (!protobufList.isModifiable()) {
            this.queries_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static BundledDocumentMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static Builder newBuilder(BundledDocumentMetadata bundledDocumentMetadata) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundledDocumentMetadata);
    }

    public static BundledDocumentMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundledDocumentMetadata)BundledDocumentMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundledDocumentMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledDocumentMetadata)BundledDocumentMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledDocumentMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BundledDocumentMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledDocumentMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BundledDocumentMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledDocumentMetadata parseFrom(InputStream inputStream) throws IOException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundledDocumentMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledDocumentMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BundledDocumentMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundledDocumentMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BundledDocumentMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BundledDocumentMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setExists(boolean bl) {
        this.exists_ = bl;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        BundledDocumentMetadata.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setQueries(int n, String string) {
        string.getClass();
        this.ensureQueriesIsMutable();
        this.queries_.set(n, (Object)string);
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
                Parser<BundledDocumentMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BundledDocumentMetadata> class_ = BundledDocumentMetadata.class;
                synchronized (BundledDocumentMetadata.class) {
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
                Object[] arrobject = new Object[]{"name_", "readTime_", "exists_", "queries_"};
                return BundledDocumentMetadata.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\t\u0003\u0007\u0004\u021a", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BundledDocumentMetadata();
    }

    @Override
    public boolean getExists() {
        return this.exists_;
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
    public String getQueries(int n) {
        return (String)this.queries_.get(n);
    }

    @Override
    public ByteString getQueriesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.queries_.get(n)));
    }

    @Override
    public int getQueriesCount() {
        return this.queries_.size();
    }

    @Override
    public List<String> getQueriesList() {
        return this.queries_;
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
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BundledDocumentMetadata, Builder>
    implements BundledDocumentMetadataOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllQueries(Iterable<String> iterable) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).addAllQueries((Iterable<String>)iterable);
            return this;
        }

        public Builder addQueries(String string) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).addQueries(string);
            return this;
        }

        public Builder addQueriesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).addQueriesBytes(byteString);
            return this;
        }

        public Builder clearExists() {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).clearExists();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).clearName();
            return this;
        }

        public Builder clearQueries() {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).clearQueries();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).clearReadTime();
            return this;
        }

        @Override
        public boolean getExists() {
            return ((BundledDocumentMetadata)this.instance).getExists();
        }

        @Override
        public String getName() {
            return ((BundledDocumentMetadata)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((BundledDocumentMetadata)this.instance).getNameBytes();
        }

        @Override
        public String getQueries(int n) {
            return ((BundledDocumentMetadata)this.instance).getQueries(n);
        }

        @Override
        public ByteString getQueriesBytes(int n) {
            return ((BundledDocumentMetadata)this.instance).getQueriesBytes(n);
        }

        @Override
        public int getQueriesCount() {
            return ((BundledDocumentMetadata)this.instance).getQueriesCount();
        }

        @Override
        public List<String> getQueriesList() {
            return Collections.unmodifiableList(((BundledDocumentMetadata)this.instance).getQueriesList());
        }

        @Override
        public Timestamp getReadTime() {
            return ((BundledDocumentMetadata)this.instance).getReadTime();
        }

        @Override
        public boolean hasReadTime() {
            return ((BundledDocumentMetadata)this.instance).hasReadTime();
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setExists(boolean bl) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setExists(bl);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setQueries(int n, String string) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setQueries(n, string);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BundledDocumentMetadata)this.instance).setReadTime(timestamp);
            return this;
        }
    }

}

