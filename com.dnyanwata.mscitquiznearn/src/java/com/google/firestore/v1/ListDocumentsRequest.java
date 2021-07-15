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
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsRequestOrBuilder;
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

public final class ListDocumentsRequest
extends GeneratedMessageLite<ListDocumentsRequest, Builder>
implements ListDocumentsRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final ListDocumentsRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 7;
    public static final int ORDER_BY_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListDocumentsRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 10;
    public static final int SHOW_MISSING_FIELD_NUMBER = 12;
    public static final int TRANSACTION_FIELD_NUMBER = 8;
    private String collectionId_ = "";
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private String orderBy_ = "";
    private int pageSize_;
    private String pageToken_ = "";
    private String parent_ = "";
    private boolean showMissing_;

    static {
        ListDocumentsRequest listDocumentsRequest;
        DEFAULT_INSTANCE = listDocumentsRequest = new ListDocumentsRequest();
        GeneratedMessageLite.registerDefaultInstance(ListDocumentsRequest.class, (GeneratedMessageLite)listDocumentsRequest);
    }

    private ListDocumentsRequest() {
    }

    private void clearCollectionId() {
        this.collectionId_ = ListDocumentsRequest.getDefaultInstance().getCollectionId();
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearOrderBy() {
        this.orderBy_ = ListDocumentsRequest.getDefaultInstance().getOrderBy();
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListDocumentsRequest.getDefaultInstance().getPageToken();
    }

    private void clearParent() {
        this.parent_ = ListDocumentsRequest.getDefaultInstance().getParent();
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 10) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearShowMissing() {
        this.showMissing_ = false;
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 8) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static ListDocumentsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = this.consistencySelectorCase_ == 10 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 10;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListDocumentsRequest listDocumentsRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listDocumentsRequest);
    }

    public static ListDocumentsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsRequest)ListDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)ListDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListDocumentsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListDocumentsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListDocumentsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListDocumentsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListDocumentsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionId(String string) {
        string.getClass();
        this.collectionId_ = string;
    }

    private void setCollectionIdBytes(ByteString byteString) {
        ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.collectionId_ = byteString.toStringUtf8();
    }

    private void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
    }

    private void setOrderBy(String string) {
        string.getClass();
        this.orderBy_ = string;
    }

    private void setOrderByBytes(ByteString byteString) {
        ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.orderBy_ = byteString.toStringUtf8();
    }

    private void setPageSize(int n) {
        this.pageSize_ = n;
    }

    private void setPageToken(String string) {
        string.getClass();
        this.pageToken_ = string;
    }

    private void setPageTokenBytes(ByteString byteString) {
        ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.pageToken_ = byteString.toStringUtf8();
    }

    private void setParent(String string) {
        string.getClass();
        this.parent_ = string;
    }

    private void setParentBytes(ByteString byteString) {
        ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.parent_ = byteString.toStringUtf8();
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 10;
    }

    private void setShowMissing(boolean bl) {
        this.showMissing_ = bl;
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.consistencySelectorCase_ = 8;
        this.consistencySelector_ = byteString;
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
                Parser<ListDocumentsRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListDocumentsRequest> class_ = ListDocumentsRequest.class;
                synchronized (ListDocumentsRequest.class) {
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
                Object[] arrobject = new Object[]{"consistencySelector_", "consistencySelectorCase_", "parent_", "collectionId_", "pageSize_", "pageToken_", "orderBy_", "mask_", Timestamp.class, "showMissing_"};
                return ListDocumentsRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\t\u0001\u0000\u0001\f\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0208\u0006\u0208\u0007\t\b=\u0000\n<\u0000\f\u0007", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListDocumentsRequest();
    }

    @Override
    public String getCollectionId() {
        return this.collectionId_;
    }

    @Override
    public ByteString getCollectionIdBytes() {
        return ByteString.copyFromUtf8((String)this.collectionId_);
    }

    @Override
    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber(this.consistencySelectorCase_);
    }

    @Override
    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    @Override
    public String getOrderBy() {
        return this.orderBy_;
    }

    @Override
    public ByteString getOrderByBytes() {
        return ByteString.copyFromUtf8((String)this.orderBy_);
    }

    @Override
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override
    public ByteString getPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.pageToken_);
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
    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 10) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public boolean getShowMissing() {
        return this.showMissing_;
    }

    @Override
    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 8) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    @Override
    public boolean hasMask() {
        return this.mask_ != null;
    }

    @Override
    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 10;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListDocumentsRequest, Builder>
    implements ListDocumentsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCollectionId() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearCollectionId();
            return this;
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearOrderBy() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearOrderBy();
            return this;
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearPageToken();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearParent();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearShowMissing() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearShowMissing();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearTransaction();
            return this;
        }

        @Override
        public String getCollectionId() {
            return ((ListDocumentsRequest)this.instance).getCollectionId();
        }

        @Override
        public ByteString getCollectionIdBytes() {
            return ((ListDocumentsRequest)this.instance).getCollectionIdBytes();
        }

        @Override
        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((ListDocumentsRequest)this.instance).getConsistencySelectorCase();
        }

        @Override
        public DocumentMask getMask() {
            return ((ListDocumentsRequest)this.instance).getMask();
        }

        @Override
        public String getOrderBy() {
            return ((ListDocumentsRequest)this.instance).getOrderBy();
        }

        @Override
        public ByteString getOrderByBytes() {
            return ((ListDocumentsRequest)this.instance).getOrderByBytes();
        }

        @Override
        public int getPageSize() {
            return ((ListDocumentsRequest)this.instance).getPageSize();
        }

        @Override
        public String getPageToken() {
            return ((ListDocumentsRequest)this.instance).getPageToken();
        }

        @Override
        public ByteString getPageTokenBytes() {
            return ((ListDocumentsRequest)this.instance).getPageTokenBytes();
        }

        @Override
        public String getParent() {
            return ((ListDocumentsRequest)this.instance).getParent();
        }

        @Override
        public ByteString getParentBytes() {
            return ((ListDocumentsRequest)this.instance).getParentBytes();
        }

        @Override
        public Timestamp getReadTime() {
            return ((ListDocumentsRequest)this.instance).getReadTime();
        }

        @Override
        public boolean getShowMissing() {
            return ((ListDocumentsRequest)this.instance).getShowMissing();
        }

        @Override
        public ByteString getTransaction() {
            return ((ListDocumentsRequest)this.instance).getTransaction();
        }

        @Override
        public boolean hasMask() {
            return ((ListDocumentsRequest)this.instance).hasMask();
        }

        @Override
        public boolean hasReadTime() {
            return ((ListDocumentsRequest)this.instance).hasReadTime();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setCollectionId(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setCollectionId(string);
            return this;
        }

        public Builder setCollectionIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setCollectionIdBytes(byteString);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setOrderBy(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setOrderBy(string);
            return this;
        }

        public Builder setOrderByBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setOrderByBytes(byteString);
            return this;
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setParentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setShowMissing(boolean bl) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setShowMissing(bl);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

