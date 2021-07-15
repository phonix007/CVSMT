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

import com.google.firestore.bundle.BundleMetadata;
import com.google.firestore.bundle.BundleMetadataOrBuilder;
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

public final class BundleMetadata
extends GeneratedMessageLite<BundleMetadata, Builder>
implements BundleMetadataOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 2;
    private static final BundleMetadata DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<BundleMetadata> PARSER;
    public static final int TOTAL_BYTES_FIELD_NUMBER = 5;
    public static final int TOTAL_DOCUMENTS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 3;
    private Timestamp createTime_;
    private String id_ = "";
    private long totalBytes_;
    private int totalDocuments_;
    private int version_;

    static {
        BundleMetadata bundleMetadata;
        DEFAULT_INSTANCE = bundleMetadata = new BundleMetadata();
        GeneratedMessageLite.registerDefaultInstance(BundleMetadata.class, (GeneratedMessageLite)bundleMetadata);
    }

    private BundleMetadata() {
    }

    private void clearCreateTime() {
        this.createTime_ = null;
    }

    private void clearId() {
        this.id_ = BundleMetadata.getDefaultInstance().getId();
    }

    private void clearTotalBytes() {
        this.totalBytes_ = 0L;
    }

    private void clearTotalDocuments() {
        this.totalDocuments_ = 0;
    }

    private void clearVersion() {
        this.version_ = 0;
    }

    public static BundleMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCreateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.createTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.createTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.createTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BundleMetadata bundleMetadata) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bundleMetadata);
    }

    public static BundleMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundleMetadata)BundleMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundleMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleMetadata)BundleMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BundleMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BundleMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleMetadata parseFrom(InputStream inputStream) throws IOException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BundleMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static BundleMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BundleMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BundleMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BundleMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BundleMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCreateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.createTime_ = timestamp;
    }

    private void setId(String string) {
        string.getClass();
        this.id_ = string;
    }

    private void setIdBytes(ByteString byteString) {
        BundleMetadata.checkByteStringIsUtf8((ByteString)byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setTotalBytes(long l) {
        this.totalBytes_ = l;
    }

    private void setTotalDocuments(int n) {
        this.totalDocuments_ = n;
    }

    private void setVersion(int n) {
        this.version_ = n;
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
                Parser<BundleMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<BundleMetadata> class_ = BundleMetadata.class;
                synchronized (BundleMetadata.class) {
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
                Object[] arrobject = new Object[]{"id_", "createTime_", "version_", "totalDocuments_", "totalBytes_"};
                return BundleMetadata.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\u000b\u0004\u000b\u0005\u0003", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new BundleMetadata();
    }

    @Override
    public Timestamp getCreateTime() {
        Timestamp timestamp = this.createTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public String getId() {
        return this.id_;
    }

    @Override
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    @Override
    public long getTotalBytes() {
        return this.totalBytes_;
    }

    @Override
    public int getTotalDocuments() {
        return this.totalDocuments_;
    }

    @Override
    public int getVersion() {
        return this.version_;
    }

    @Override
    public boolean hasCreateTime() {
        return this.createTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BundleMetadata, Builder>
    implements BundleMetadataOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCreateTime() {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).clearCreateTime();
            return this;
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).clearId();
            return this;
        }

        public Builder clearTotalBytes() {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).clearTotalBytes();
            return this;
        }

        public Builder clearTotalDocuments() {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).clearTotalDocuments();
            return this;
        }

        public Builder clearVersion() {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).clearVersion();
            return this;
        }

        @Override
        public Timestamp getCreateTime() {
            return ((BundleMetadata)this.instance).getCreateTime();
        }

        @Override
        public String getId() {
            return ((BundleMetadata)this.instance).getId();
        }

        @Override
        public ByteString getIdBytes() {
            return ((BundleMetadata)this.instance).getIdBytes();
        }

        @Override
        public long getTotalBytes() {
            return ((BundleMetadata)this.instance).getTotalBytes();
        }

        @Override
        public int getTotalDocuments() {
            return ((BundleMetadata)this.instance).getTotalDocuments();
        }

        @Override
        public int getVersion() {
            return ((BundleMetadata)this.instance).getVersion();
        }

        @Override
        public boolean hasCreateTime() {
            return ((BundleMetadata)this.instance).hasCreateTime();
        }

        public Builder mergeCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).mergeCreateTime(timestamp);
            return this;
        }

        public Builder setCreateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setCreateTime((Timestamp)builder.build());
            return this;
        }

        public Builder setCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setCreateTime(timestamp);
            return this;
        }

        public Builder setId(String string) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setId(string);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setTotalBytes(long l) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setTotalBytes(l);
            return this;
        }

        public Builder setTotalDocuments(int n) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setTotalDocuments(n);
            return this;
        }

        public Builder setVersion(int n) {
            this.copyOnWrite();
            ((BundleMetadata)this.instance).setVersion(n);
            return this;
        }
    }

}

