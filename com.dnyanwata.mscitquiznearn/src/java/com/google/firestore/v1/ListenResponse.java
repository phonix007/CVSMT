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
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentDelete;
import com.google.firestore.v1.DocumentRemove;
import com.google.firestore.v1.ExistenceFilter;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.ListenResponseOrBuilder;
import com.google.firestore.v1.TargetChange;
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

public final class ListenResponse
extends GeneratedMessageLite<ListenResponse, Builder>
implements ListenResponseOrBuilder {
    private static final ListenResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<ListenResponse> PARSER;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        ListenResponse listenResponse;
        DEFAULT_INSTANCE = listenResponse = new ListenResponse();
        GeneratedMessageLite.registerDefaultInstance(ListenResponse.class, (GeneratedMessageLite)listenResponse);
    }

    private ListenResponse() {
    }

    private void clearDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearFilter() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    private void clearTargetChange() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static ListenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocumentChange(DocumentChange documentChange) {
        documentChange.getClass();
        this.responseType_ = this.responseTypeCase_ == 3 && this.responseType_ != DocumentChange.getDefaultInstance() ? ((DocumentChange.Builder)DocumentChange.newBuilder((DocumentChange)this.responseType_).mergeFrom((GeneratedMessageLite)documentChange)).buildPartial() : documentChange;
        this.responseTypeCase_ = 3;
    }

    private void mergeDocumentDelete(DocumentDelete documentDelete) {
        documentDelete.getClass();
        this.responseType_ = this.responseTypeCase_ == 4 && this.responseType_ != DocumentDelete.getDefaultInstance() ? ((DocumentDelete.Builder)DocumentDelete.newBuilder((DocumentDelete)this.responseType_).mergeFrom((GeneratedMessageLite)documentDelete)).buildPartial() : documentDelete;
        this.responseTypeCase_ = 4;
    }

    private void mergeDocumentRemove(DocumentRemove documentRemove) {
        documentRemove.getClass();
        this.responseType_ = this.responseTypeCase_ == 6 && this.responseType_ != DocumentRemove.getDefaultInstance() ? ((DocumentRemove.Builder)DocumentRemove.newBuilder((DocumentRemove)this.responseType_).mergeFrom((GeneratedMessageLite)documentRemove)).buildPartial() : documentRemove;
        this.responseTypeCase_ = 6;
    }

    private void mergeFilter(ExistenceFilter existenceFilter) {
        existenceFilter.getClass();
        this.responseType_ = this.responseTypeCase_ == 5 && this.responseType_ != ExistenceFilter.getDefaultInstance() ? ((ExistenceFilter.Builder)ExistenceFilter.newBuilder((ExistenceFilter)this.responseType_).mergeFrom((GeneratedMessageLite)existenceFilter)).buildPartial() : existenceFilter;
        this.responseTypeCase_ = 5;
    }

    private void mergeTargetChange(TargetChange targetChange) {
        targetChange.getClass();
        this.responseType_ = this.responseTypeCase_ == 2 && this.responseType_ != TargetChange.getDefaultInstance() ? ((TargetChange.Builder)TargetChange.newBuilder((TargetChange)this.responseType_).mergeFrom((GeneratedMessageLite)targetChange)).buildPartial() : targetChange;
        this.responseTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListenResponse listenResponse) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listenResponse);
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenResponse)ListenResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)ListenResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListenResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListenResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListenResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListenResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocumentChange(DocumentChange documentChange) {
        documentChange.getClass();
        this.responseType_ = documentChange;
        this.responseTypeCase_ = 3;
    }

    private void setDocumentDelete(DocumentDelete documentDelete) {
        documentDelete.getClass();
        this.responseType_ = documentDelete;
        this.responseTypeCase_ = 4;
    }

    private void setDocumentRemove(DocumentRemove documentRemove) {
        documentRemove.getClass();
        this.responseType_ = documentRemove;
        this.responseTypeCase_ = 6;
    }

    private void setFilter(ExistenceFilter existenceFilter) {
        existenceFilter.getClass();
        this.responseType_ = existenceFilter;
        this.responseTypeCase_ = 5;
    }

    private void setTargetChange(TargetChange targetChange) {
        targetChange.getClass();
        this.responseType_ = targetChange;
        this.responseTypeCase_ = 2;
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
                Parser<ListenResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListenResponse> class_ = ListenResponse.class;
                synchronized (ListenResponse.class) {
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
                Object[] arrobject = new Object[]{"responseType_", "responseTypeCase_", TargetChange.class, DocumentChange.class, DocumentDelete.class, ExistenceFilter.class, DocumentRemove.class};
                return ListenResponse.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListenResponse();
    }

    @Override
    public DocumentChange getDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            return (DocumentChange)this.responseType_;
        }
        return DocumentChange.getDefaultInstance();
    }

    @Override
    public DocumentDelete getDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            return (DocumentDelete)this.responseType_;
        }
        return DocumentDelete.getDefaultInstance();
    }

    @Override
    public DocumentRemove getDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            return (DocumentRemove)this.responseType_;
        }
        return DocumentRemove.getDefaultInstance();
    }

    @Override
    public ExistenceFilter getFilter() {
        if (this.responseTypeCase_ == 5) {
            return (ExistenceFilter)this.responseType_;
        }
        return ExistenceFilter.getDefaultInstance();
    }

    @Override
    public ResponseTypeCase getResponseTypeCase() {
        return ResponseTypeCase.forNumber(this.responseTypeCase_);
    }

    @Override
    public TargetChange getTargetChange() {
        if (this.responseTypeCase_ == 2) {
            return (TargetChange)this.responseType_;
        }
        return TargetChange.getDefaultInstance();
    }

    @Override
    public boolean hasDocumentChange() {
        return this.responseTypeCase_ == 3;
    }

    @Override
    public boolean hasDocumentDelete() {
        return this.responseTypeCase_ == 4;
    }

    @Override
    public boolean hasDocumentRemove() {
        return this.responseTypeCase_ == 6;
    }

    @Override
    public boolean hasFilter() {
        return this.responseTypeCase_ == 5;
    }

    @Override
    public boolean hasTargetChange() {
        return this.responseTypeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListenResponse, Builder>
    implements ListenResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocumentChange() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentChange();
            return this;
        }

        public Builder clearDocumentDelete() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentDelete();
            return this;
        }

        public Builder clearDocumentRemove() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentRemove();
            return this;
        }

        public Builder clearFilter() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearFilter();
            return this;
        }

        public Builder clearResponseType() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearResponseType();
            return this;
        }

        public Builder clearTargetChange() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearTargetChange();
            return this;
        }

        @Override
        public DocumentChange getDocumentChange() {
            return ((ListenResponse)this.instance).getDocumentChange();
        }

        @Override
        public DocumentDelete getDocumentDelete() {
            return ((ListenResponse)this.instance).getDocumentDelete();
        }

        @Override
        public DocumentRemove getDocumentRemove() {
            return ((ListenResponse)this.instance).getDocumentRemove();
        }

        @Override
        public ExistenceFilter getFilter() {
            return ((ListenResponse)this.instance).getFilter();
        }

        @Override
        public ResponseTypeCase getResponseTypeCase() {
            return ((ListenResponse)this.instance).getResponseTypeCase();
        }

        @Override
        public TargetChange getTargetChange() {
            return ((ListenResponse)this.instance).getTargetChange();
        }

        @Override
        public boolean hasDocumentChange() {
            return ((ListenResponse)this.instance).hasDocumentChange();
        }

        @Override
        public boolean hasDocumentDelete() {
            return ((ListenResponse)this.instance).hasDocumentDelete();
        }

        @Override
        public boolean hasDocumentRemove() {
            return ((ListenResponse)this.instance).hasDocumentRemove();
        }

        @Override
        public boolean hasFilter() {
            return ((ListenResponse)this.instance).hasFilter();
        }

        @Override
        public boolean hasTargetChange() {
            return ((ListenResponse)this.instance).hasTargetChange();
        }

        public Builder mergeDocumentChange(DocumentChange documentChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentChange(documentChange);
            return this;
        }

        public Builder mergeDocumentDelete(DocumentDelete documentDelete) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentDelete(documentDelete);
            return this;
        }

        public Builder mergeDocumentRemove(DocumentRemove documentRemove) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentRemove(documentRemove);
            return this;
        }

        public Builder mergeFilter(ExistenceFilter existenceFilter) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeFilter(existenceFilter);
            return this;
        }

        public Builder mergeTargetChange(TargetChange targetChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeTargetChange(targetChange);
            return this;
        }

        public Builder setDocumentChange(DocumentChange.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentChange((DocumentChange)builder.build());
            return this;
        }

        public Builder setDocumentChange(DocumentChange documentChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentChange(documentChange);
            return this;
        }

        public Builder setDocumentDelete(DocumentDelete.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentDelete((DocumentDelete)builder.build());
            return this;
        }

        public Builder setDocumentDelete(DocumentDelete documentDelete) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentDelete(documentDelete);
            return this;
        }

        public Builder setDocumentRemove(DocumentRemove.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentRemove((DocumentRemove)builder.build());
            return this;
        }

        public Builder setDocumentRemove(DocumentRemove documentRemove) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentRemove(documentRemove);
            return this;
        }

        public Builder setFilter(ExistenceFilter.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setFilter((ExistenceFilter)builder.build());
            return this;
        }

        public Builder setFilter(ExistenceFilter existenceFilter) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setFilter(existenceFilter);
            return this;
        }

        public Builder setTargetChange(TargetChange.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setTargetChange((TargetChange)builder.build());
            return this;
        }

        public Builder setTargetChange(TargetChange targetChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setTargetChange(targetChange);
            return this;
        }
    }

}

