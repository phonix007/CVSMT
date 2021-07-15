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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

public final class Write
extends GeneratedMessageLite<Write, Builder>
implements WriteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final Write DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<Write> PARSER;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private Precondition currentDocument_;
    private int operationCase_ = 0;
    private Object operation_;
    private DocumentMask updateMask_;
    private Internal.ProtobufList<DocumentTransform.FieldTransform> updateTransforms_ = Write.emptyProtobufList();

    static {
        Write write;
        DEFAULT_INSTANCE = write = new Write();
        GeneratedMessageLite.registerDefaultInstance(Write.class, (GeneratedMessageLite)write);
    }

    private Write() {
    }

    private void addAllUpdateTransforms(Iterable<? extends DocumentTransform.FieldTransform> iterable) {
        this.ensureUpdateTransformsIsMutable();
        AbstractMessageLite.addAll(iterable, this.updateTransforms_);
    }

    private void addUpdateTransforms(int n, DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add(n, (Object)fieldTransform);
    }

    private void addUpdateTransforms(DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add((Object)fieldTransform);
    }

    private void clearCurrentDocument() {
        this.currentDocument_ = null;
    }

    private void clearDelete() {
        if (this.operationCase_ == 2) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearOperation() {
        this.operationCase_ = 0;
        this.operation_ = null;
    }

    private void clearTransform() {
        if (this.operationCase_ == 6) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearUpdate() {
        if (this.operationCase_ == 1) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearUpdateMask() {
        this.updateMask_ = null;
    }

    private void clearUpdateTransforms() {
        this.updateTransforms_ = Write.emptyProtobufList();
    }

    private void clearVerify() {
        if (this.operationCase_ == 5) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void ensureUpdateTransformsIsMutable() {
        Internal.ProtobufList<DocumentTransform.FieldTransform> protobufList = this.updateTransforms_;
        if (!protobufList.isModifiable()) {
            this.updateTransforms_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Write getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCurrentDocument(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.currentDocument_;
        if (precondition2 != null && precondition2 != Precondition.getDefaultInstance()) {
            this.currentDocument_ = (Precondition)((Precondition.Builder)Precondition.newBuilder(this.currentDocument_).mergeFrom((GeneratedMessageLite)precondition)).buildPartial();
            return;
        }
        this.currentDocument_ = precondition;
    }

    private void mergeTransform(DocumentTransform documentTransform) {
        documentTransform.getClass();
        this.operation_ = this.operationCase_ == 6 && this.operation_ != DocumentTransform.getDefaultInstance() ? ((DocumentTransform.Builder)DocumentTransform.newBuilder((DocumentTransform)this.operation_).mergeFrom((GeneratedMessageLite)documentTransform)).buildPartial() : documentTransform;
        this.operationCase_ = 6;
    }

    private void mergeUpdate(Document document) {
        document.getClass();
        this.operation_ = this.operationCase_ == 1 && this.operation_ != Document.getDefaultInstance() ? ((Document.Builder)Document.newBuilder((Document)this.operation_).mergeFrom((GeneratedMessageLite)document)).buildPartial() : document;
        this.operationCase_ = 1;
    }

    private void mergeUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.updateMask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.updateMask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.updateMask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.updateMask_ = documentMask;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Write write) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)write);
    }

    public static Write parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Write)Write.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Write parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)Write.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Write parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Write parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(InputStream inputStream) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Write parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Write parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Write parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Write> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUpdateTransforms(int n) {
        this.ensureUpdateTransformsIsMutable();
        this.updateTransforms_.remove(n);
    }

    private void setCurrentDocument(Precondition precondition) {
        precondition.getClass();
        this.currentDocument_ = precondition;
    }

    private void setDelete(String string) {
        string.getClass();
        this.operationCase_ = 2;
        this.operation_ = string;
    }

    private void setDeleteBytes(ByteString byteString) {
        Write.checkByteStringIsUtf8((ByteString)byteString);
        this.operation_ = byteString.toStringUtf8();
        this.operationCase_ = 2;
    }

    private void setTransform(DocumentTransform documentTransform) {
        documentTransform.getClass();
        this.operation_ = documentTransform;
        this.operationCase_ = 6;
    }

    private void setUpdate(Document document) {
        document.getClass();
        this.operation_ = document;
        this.operationCase_ = 1;
    }

    private void setUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.updateMask_ = documentMask;
    }

    private void setUpdateTransforms(int n, DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        this.ensureUpdateTransformsIsMutable();
        this.updateTransforms_.set(n, (Object)fieldTransform);
    }

    private void setVerify(String string) {
        string.getClass();
        this.operationCase_ = 5;
        this.operation_ = string;
    }

    private void setVerifyBytes(ByteString byteString) {
        Write.checkByteStringIsUtf8((ByteString)byteString);
        this.operation_ = byteString.toStringUtf8();
        this.operationCase_ = 5;
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
                Parser<Write> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Write> class_ = Write.class;
                synchronized (Write.class) {
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
                Object[] arrobject = new Object[]{"operation_", "operationCase_", Document.class, "updateMask_", "currentDocument_", DocumentTransform.class, "updateTransforms_", DocumentTransform.FieldTransform.class};
                return Write.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002\u023b\u0000\u0003\t\u0004\t\u0005\u023b\u0000\u0006<\u0000\u0007\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Write();
    }

    @Override
    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        if (precondition == null) {
            precondition = Precondition.getDefaultInstance();
        }
        return precondition;
    }

    @Override
    public String getDelete() {
        if (this.operationCase_ == 2) {
            return (String)this.operation_;
        }
        return "";
    }

    @Override
    public ByteString getDeleteBytes() {
        String string = this.operationCase_ == 2 ? (String)this.operation_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public OperationCase getOperationCase() {
        return OperationCase.forNumber(this.operationCase_);
    }

    @Override
    public DocumentTransform getTransform() {
        if (this.operationCase_ == 6) {
            return (DocumentTransform)this.operation_;
        }
        return DocumentTransform.getDefaultInstance();
    }

    @Override
    public Document getUpdate() {
        if (this.operationCase_ == 1) {
            return (Document)this.operation_;
        }
        return Document.getDefaultInstance();
    }

    @Override
    public DocumentMask getUpdateMask() {
        DocumentMask documentMask = this.updateMask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    @Override
    public DocumentTransform.FieldTransform getUpdateTransforms(int n) {
        return (DocumentTransform.FieldTransform)this.updateTransforms_.get(n);
    }

    @Override
    public int getUpdateTransformsCount() {
        return this.updateTransforms_.size();
    }

    @Override
    public List<DocumentTransform.FieldTransform> getUpdateTransformsList() {
        return this.updateTransforms_;
    }

    public DocumentTransform.FieldTransformOrBuilder getUpdateTransformsOrBuilder(int n) {
        return this.updateTransforms_.get(n);
    }

    public List<? extends DocumentTransform.FieldTransformOrBuilder> getUpdateTransformsOrBuilderList() {
        return this.updateTransforms_;
    }

    @Override
    public String getVerify() {
        if (this.operationCase_ == 5) {
            return (String)this.operation_;
        }
        return "";
    }

    @Override
    public ByteString getVerifyBytes() {
        String string = this.operationCase_ == 5 ? (String)this.operation_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public boolean hasCurrentDocument() {
        return this.currentDocument_ != null;
    }

    @Override
    public boolean hasTransform() {
        return this.operationCase_ == 6;
    }

    @Override
    public boolean hasUpdate() {
        return this.operationCase_ == 1;
    }

    @Override
    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Write, Builder>
    implements WriteOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllUpdateTransforms(Iterable<? extends DocumentTransform.FieldTransform> iterable) {
            this.copyOnWrite();
            ((Write)this.instance).addAllUpdateTransforms((Iterable<? extends DocumentTransform.FieldTransform>)iterable);
            return this;
        }

        public Builder addUpdateTransforms(int n, DocumentTransform.FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).addUpdateTransforms(n, (DocumentTransform.FieldTransform)builder.build());
            return this;
        }

        public Builder addUpdateTransforms(int n, DocumentTransform.FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((Write)this.instance).addUpdateTransforms(n, fieldTransform);
            return this;
        }

        public Builder addUpdateTransforms(DocumentTransform.FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).addUpdateTransforms((DocumentTransform.FieldTransform)builder.build());
            return this;
        }

        public Builder addUpdateTransforms(DocumentTransform.FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((Write)this.instance).addUpdateTransforms(fieldTransform);
            return this;
        }

        public Builder clearCurrentDocument() {
            this.copyOnWrite();
            ((Write)this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearDelete() {
            this.copyOnWrite();
            ((Write)this.instance).clearDelete();
            return this;
        }

        public Builder clearOperation() {
            this.copyOnWrite();
            ((Write)this.instance).clearOperation();
            return this;
        }

        public Builder clearTransform() {
            this.copyOnWrite();
            ((Write)this.instance).clearTransform();
            return this;
        }

        public Builder clearUpdate() {
            this.copyOnWrite();
            ((Write)this.instance).clearUpdate();
            return this;
        }

        public Builder clearUpdateMask() {
            this.copyOnWrite();
            ((Write)this.instance).clearUpdateMask();
            return this;
        }

        public Builder clearUpdateTransforms() {
            this.copyOnWrite();
            ((Write)this.instance).clearUpdateTransforms();
            return this;
        }

        public Builder clearVerify() {
            this.copyOnWrite();
            ((Write)this.instance).clearVerify();
            return this;
        }

        @Override
        public Precondition getCurrentDocument() {
            return ((Write)this.instance).getCurrentDocument();
        }

        @Override
        public String getDelete() {
            return ((Write)this.instance).getDelete();
        }

        @Override
        public ByteString getDeleteBytes() {
            return ((Write)this.instance).getDeleteBytes();
        }

        @Override
        public OperationCase getOperationCase() {
            return ((Write)this.instance).getOperationCase();
        }

        @Override
        public DocumentTransform getTransform() {
            return ((Write)this.instance).getTransform();
        }

        @Override
        public Document getUpdate() {
            return ((Write)this.instance).getUpdate();
        }

        @Override
        public DocumentMask getUpdateMask() {
            return ((Write)this.instance).getUpdateMask();
        }

        @Override
        public DocumentTransform.FieldTransform getUpdateTransforms(int n) {
            return ((Write)this.instance).getUpdateTransforms(n);
        }

        @Override
        public int getUpdateTransformsCount() {
            return ((Write)this.instance).getUpdateTransformsCount();
        }

        @Override
        public List<DocumentTransform.FieldTransform> getUpdateTransformsList() {
            return Collections.unmodifiableList(((Write)this.instance).getUpdateTransformsList());
        }

        @Override
        public String getVerify() {
            return ((Write)this.instance).getVerify();
        }

        @Override
        public ByteString getVerifyBytes() {
            return ((Write)this.instance).getVerifyBytes();
        }

        @Override
        public boolean hasCurrentDocument() {
            return ((Write)this.instance).hasCurrentDocument();
        }

        @Override
        public boolean hasTransform() {
            return ((Write)this.instance).hasTransform();
        }

        @Override
        public boolean hasUpdate() {
            return ((Write)this.instance).hasUpdate();
        }

        @Override
        public boolean hasUpdateMask() {
            return ((Write)this.instance).hasUpdateMask();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((Write)this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder mergeTransform(DocumentTransform documentTransform) {
            this.copyOnWrite();
            ((Write)this.instance).mergeTransform(documentTransform);
            return this;
        }

        public Builder mergeUpdate(Document document) {
            this.copyOnWrite();
            ((Write)this.instance).mergeUpdate(document);
            return this;
        }

        public Builder mergeUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((Write)this.instance).mergeUpdateMask(documentMask);
            return this;
        }

        public Builder removeUpdateTransforms(int n) {
            this.copyOnWrite();
            ((Write)this.instance).removeUpdateTransforms(n);
            return this;
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setCurrentDocument((Precondition)builder.build());
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((Write)this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setDelete(String string) {
            this.copyOnWrite();
            ((Write)this.instance).setDelete(string);
            return this;
        }

        public Builder setDeleteBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Write)this.instance).setDeleteBytes(byteString);
            return this;
        }

        public Builder setTransform(DocumentTransform.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setTransform((DocumentTransform)builder.build());
            return this;
        }

        public Builder setTransform(DocumentTransform documentTransform) {
            this.copyOnWrite();
            ((Write)this.instance).setTransform(documentTransform);
            return this;
        }

        public Builder setUpdate(Document.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdate((Document)builder.build());
            return this;
        }

        public Builder setUpdate(Document document) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdate(document);
            return this;
        }

        public Builder setUpdateMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateMask((DocumentMask)builder.build());
            return this;
        }

        public Builder setUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateMask(documentMask);
            return this;
        }

        public Builder setUpdateTransforms(int n, DocumentTransform.FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateTransforms(n, (DocumentTransform.FieldTransform)builder.build());
            return this;
        }

        public Builder setUpdateTransforms(int n, DocumentTransform.FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateTransforms(n, fieldTransform);
            return this;
        }

        public Builder setVerify(String string) {
            this.copyOnWrite();
            ((Write)this.instance).setVerify(string);
            return this;
        }

        public Builder setVerifyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Write)this.instance).setVerifyBytes(byteString);
            return this;
        }
    }

}

