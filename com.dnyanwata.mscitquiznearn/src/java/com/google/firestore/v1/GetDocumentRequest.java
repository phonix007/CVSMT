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
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.GetDocumentRequestOrBuilder;
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

public final class GetDocumentRequest
extends GeneratedMessageLite<GetDocumentRequest, Builder>
implements GetDocumentRequestOrBuilder {
    private static final GetDocumentRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetDocumentRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 5;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private String name_ = "";

    static {
        GetDocumentRequest getDocumentRequest;
        DEFAULT_INSTANCE = getDocumentRequest = new GetDocumentRequest();
        GeneratedMessageLite.registerDefaultInstance(GetDocumentRequest.class, (GeneratedMessageLite)getDocumentRequest);
    }

    private GetDocumentRequest() {
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearName() {
        this.name_ = GetDocumentRequest.getDefaultInstance().getName();
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 3) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static GetDocumentRequest getDefaultInstance() {
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
        this.consistencySelector_ = this.consistencySelectorCase_ == 5 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(GetDocumentRequest getDocumentRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)getDocumentRequest);
    }

    public static GetDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetDocumentRequest)GetDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static GetDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GetDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static GetDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static GetDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static GetDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static GetDocumentRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static GetDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<GetDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        GetDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 5;
    }

    private void setTransaction(ByteString byteString) {
        byteString.getClass();
        this.consistencySelectorCase_ = 3;
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
                Parser<GetDocumentRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<GetDocumentRequest> class_ = GetDocumentRequest.class;
                synchronized (GetDocumentRequest.class) {
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
                Object[] arrobject = new Object[]{"consistencySelector_", "consistencySelectorCase_", "name_", "mask_", Timestamp.class};
                return GetDocumentRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003=\u0000\u0005<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new GetDocumentRequest();
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
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 5) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 3) {
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
        return this.consistencySelectorCase_ == 5;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<GetDocumentRequest, Builder>
    implements GetDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearName();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearTransaction();
            return this;
        }

        @Override
        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((GetDocumentRequest)this.instance).getConsistencySelectorCase();
        }

        @Override
        public DocumentMask getMask() {
            return ((GetDocumentRequest)this.instance).getMask();
        }

        @Override
        public String getName() {
            return ((GetDocumentRequest)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((GetDocumentRequest)this.instance).getNameBytes();
        }

        @Override
        public Timestamp getReadTime() {
            return ((GetDocumentRequest)this.instance).getReadTime();
        }

        @Override
        public ByteString getTransaction() {
            return ((GetDocumentRequest)this.instance).getTransaction();
        }

        @Override
        public boolean hasMask() {
            return ((GetDocumentRequest)this.instance).hasMask();
        }

        @Override
        public boolean hasReadTime() {
            return ((GetDocumentRequest)this.instance).hasReadTime();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

