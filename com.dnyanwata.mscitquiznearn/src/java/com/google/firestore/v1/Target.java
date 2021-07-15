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
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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

import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Target;
import com.google.firestore.v1.TargetOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Target
extends GeneratedMessageLite<Target, Builder>
implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private int resumeTypeCase_ = 0;
    private Object resumeType_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    static {
        Target target;
        DEFAULT_INSTANCE = target = new Target();
        GeneratedMessageLite.registerDefaultInstance(Target.class, (GeneratedMessageLite)target);
    }

    private Target() {
    }

    private void clearDocuments() {
        if (this.targetTypeCase_ == 3) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    private void clearOnce() {
        this.once_ = false;
    }

    private void clearQuery() {
        if (this.targetTypeCase_ == 2) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    private void clearReadTime() {
        if (this.resumeTypeCase_ == 11) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    private void clearResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    private void clearResumeType() {
        this.resumeTypeCase_ = 0;
        this.resumeType_ = null;
    }

    private void clearTargetId() {
        this.targetId_ = 0;
    }

    private void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = this.targetTypeCase_ == 3 && this.targetType_ != DocumentsTarget.getDefaultInstance() ? ((DocumentsTarget.Builder)DocumentsTarget.newBuilder((DocumentsTarget)this.targetType_).mergeFrom((GeneratedMessageLite)documentsTarget)).buildPartial() : documentsTarget;
        this.targetTypeCase_ = 3;
    }

    private void mergeQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = this.targetTypeCase_ == 2 && this.targetType_ != QueryTarget.getDefaultInstance() ? ((QueryTarget.Builder)QueryTarget.newBuilder((QueryTarget)this.targetType_).mergeFrom((GeneratedMessageLite)queryTarget)).buildPartial() : queryTarget;
        this.targetTypeCase_ = 2;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.resumeType_ = this.resumeTypeCase_ == 11 && this.resumeType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.resumeType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.resumeTypeCase_ = 11;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Target target) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Target)Target.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)Target.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Target parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Target parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(InputStream inputStream) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Target parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Target parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Target> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 3;
    }

    private void setOnce(boolean bl) {
        this.once_ = bl;
    }

    private void setQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 2;
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.resumeType_ = timestamp;
        this.resumeTypeCase_ = 11;
    }

    private void setResumeToken(ByteString byteString) {
        byteString.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = byteString;
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
                Parser<Target> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Target> class_ = Target.class;
                synchronized (Target.class) {
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
                Object[] arrobject = new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class};
                return Target.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Target();
    }

    @Override
    public DocumentsTarget getDocuments() {
        if (this.targetTypeCase_ == 3) {
            return (DocumentsTarget)this.targetType_;
        }
        return DocumentsTarget.getDefaultInstance();
    }

    @Override
    public boolean getOnce() {
        return this.once_;
    }

    @Override
    public QueryTarget getQuery() {
        if (this.targetTypeCase_ == 2) {
            return (QueryTarget)this.targetType_;
        }
        return QueryTarget.getDefaultInstance();
    }

    @Override
    public Timestamp getReadTime() {
        if (this.resumeTypeCase_ == 11) {
            return (Timestamp)this.resumeType_;
        }
        return Timestamp.getDefaultInstance();
    }

    @Override
    public ByteString getResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            return (ByteString)this.resumeType_;
        }
        return ByteString.EMPTY;
    }

    @Override
    public ResumeTypeCase getResumeTypeCase() {
        return ResumeTypeCase.forNumber(this.resumeTypeCase_);
    }

    @Override
    public int getTargetId() {
        return this.targetId_;
    }

    @Override
    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber(this.targetTypeCase_);
    }

    @Override
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 3;
    }

    @Override
    public boolean hasQuery() {
        return this.targetTypeCase_ == 2;
    }

    @Override
    public boolean hasReadTime() {
        return this.resumeTypeCase_ == 11;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Target, Builder>
    implements TargetOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((Target)this.instance).clearDocuments();
            return this;
        }

        public Builder clearOnce() {
            this.copyOnWrite();
            ((Target)this.instance).clearOnce();
            return this;
        }

        public Builder clearQuery() {
            this.copyOnWrite();
            ((Target)this.instance).clearQuery();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((Target)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResumeToken() {
            this.copyOnWrite();
            ((Target)this.instance).clearResumeToken();
            return this;
        }

        public Builder clearResumeType() {
            this.copyOnWrite();
            ((Target)this.instance).clearResumeType();
            return this;
        }

        public Builder clearTargetId() {
            this.copyOnWrite();
            ((Target)this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            this.copyOnWrite();
            ((Target)this.instance).clearTargetType();
            return this;
        }

        @Override
        public DocumentsTarget getDocuments() {
            return ((Target)this.instance).getDocuments();
        }

        @Override
        public boolean getOnce() {
            return ((Target)this.instance).getOnce();
        }

        @Override
        public QueryTarget getQuery() {
            return ((Target)this.instance).getQuery();
        }

        @Override
        public Timestamp getReadTime() {
            return ((Target)this.instance).getReadTime();
        }

        @Override
        public ByteString getResumeToken() {
            return ((Target)this.instance).getResumeToken();
        }

        @Override
        public ResumeTypeCase getResumeTypeCase() {
            return ((Target)this.instance).getResumeTypeCase();
        }

        @Override
        public int getTargetId() {
            return ((Target)this.instance).getTargetId();
        }

        @Override
        public TargetTypeCase getTargetTypeCase() {
            return ((Target)this.instance).getTargetTypeCase();
        }

        @Override
        public boolean hasDocuments() {
            return ((Target)this.instance).hasDocuments();
        }

        @Override
        public boolean hasQuery() {
            return ((Target)this.instance).hasQuery();
        }

        @Override
        public boolean hasReadTime() {
            return ((Target)this.instance).hasReadTime();
        }

        public Builder mergeDocuments(DocumentsTarget documentsTarget) {
            this.copyOnWrite();
            ((Target)this.instance).mergeDocuments(documentsTarget);
            return this;
        }

        public Builder mergeQuery(QueryTarget queryTarget) {
            this.copyOnWrite();
            ((Target)this.instance).mergeQuery(queryTarget);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Target)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocuments(DocumentsTarget.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setDocuments((DocumentsTarget)builder.build());
            return this;
        }

        public Builder setDocuments(DocumentsTarget documentsTarget) {
            this.copyOnWrite();
            ((Target)this.instance).setDocuments(documentsTarget);
            return this;
        }

        public Builder setOnce(boolean bl) {
            this.copyOnWrite();
            ((Target)this.instance).setOnce(bl);
            return this;
        }

        public Builder setQuery(QueryTarget.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setQuery((QueryTarget)builder.build());
            return this;
        }

        public Builder setQuery(QueryTarget queryTarget) {
            this.copyOnWrite();
            ((Target)this.instance).setQuery(queryTarget);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Target)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setResumeToken(ByteString byteString) {
            this.copyOnWrite();
            ((Target)this.instance).setResumeToken(byteString);
            return this;
        }

        public Builder setTargetId(int n) {
            this.copyOnWrite();
            ((Target)this.instance).setTargetId(n);
            return this;
        }
    }

    public static final class DocumentsTarget
    extends GeneratedMessageLite<DocumentsTarget, Builder>
    implements DocumentsTargetOrBuilder {
        private static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();

        static {
            DocumentsTarget documentsTarget;
            DEFAULT_INSTANCE = documentsTarget = new DocumentsTarget();
            GeneratedMessageLite.registerDefaultInstance(DocumentsTarget.class, (GeneratedMessageLite)documentsTarget);
        }

        private DocumentsTarget() {
        }

        private void addAllDocuments(Iterable<String> iterable) {
            this.ensureDocumentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.documents_);
        }

        private void addDocuments(String string) {
            string.getClass();
            this.ensureDocumentsIsMutable();
            this.documents_.add((Object)string);
        }

        private void addDocumentsBytes(ByteString byteString) {
            DocumentsTarget.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureDocumentsIsMutable();
            this.documents_.add((Object)byteString.toStringUtf8());
        }

        private void clearDocuments() {
            this.documents_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDocumentsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.documents_;
            if (!protobufList.isModifiable()) {
                this.documents_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static DocumentsTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DocumentsTarget documentsTarget) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentsTarget);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget)DocumentsTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)DocumentsTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static DocumentsTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static DocumentsTarget parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<DocumentsTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDocuments(int n, String string) {
            string.getClass();
            this.ensureDocumentsIsMutable();
            this.documents_.set(n, (Object)string);
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
                    Parser<DocumentsTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<DocumentsTarget> class_ = DocumentsTarget.class;
                    synchronized (DocumentsTarget.class) {
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
                    Object[] arrobject = new Object[]{"documents_"};
                    return DocumentsTarget.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u021a", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new DocumentsTarget();
        }

        @Override
        public String getDocuments(int n) {
            return (String)this.documents_.get(n);
        }

        @Override
        public ByteString getDocumentsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.documents_.get(n)));
        }

        @Override
        public int getDocumentsCount() {
            return this.documents_.size();
        }

        @Override
        public List<String> getDocumentsList() {
            return this.documents_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<DocumentsTarget, Builder>
        implements DocumentsTargetOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllDocuments(Iterable<String> iterable) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addAllDocuments((Iterable<String>)iterable);
                return this;
            }

            public Builder addDocuments(String string) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addDocuments(string);
                return this;
            }

            public Builder addDocumentsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addDocumentsBytes(byteString);
                return this;
            }

            public Builder clearDocuments() {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).clearDocuments();
                return this;
            }

            @Override
            public String getDocuments(int n) {
                return ((DocumentsTarget)this.instance).getDocuments(n);
            }

            @Override
            public ByteString getDocumentsBytes(int n) {
                return ((DocumentsTarget)this.instance).getDocumentsBytes(n);
            }

            @Override
            public int getDocumentsCount() {
                return ((DocumentsTarget)this.instance).getDocumentsCount();
            }

            @Override
            public List<String> getDocumentsList() {
                return Collections.unmodifiableList(((DocumentsTarget)this.instance).getDocumentsList());
            }

            public Builder setDocuments(int n, String string) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).setDocuments(n, string);
                return this;
            }
        }

    }

    public static interface DocumentsTargetOrBuilder
    extends MessageLiteOrBuilder {
        public String getDocuments(int var1);

        public ByteString getDocumentsBytes(int var1);

        public int getDocumentsCount();

        public List<String> getDocumentsList();
    }

    public static final class QueryTarget
    extends GeneratedMessageLite<QueryTarget, Builder>
    implements QueryTargetOrBuilder {
        private static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private String parent_ = "";
        private int queryTypeCase_ = 0;
        private Object queryType_;

        static {
            QueryTarget queryTarget;
            DEFAULT_INSTANCE = queryTarget = new QueryTarget();
            GeneratedMessageLite.registerDefaultInstance(QueryTarget.class, (GeneratedMessageLite)queryTarget);
        }

        private QueryTarget() {
        }

        private void clearParent() {
            this.parent_ = QueryTarget.getDefaultInstance().getParent();
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

        public static QueryTarget getDefaultInstance() {
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

        public static Builder newBuilder(QueryTarget queryTarget) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)queryTarget);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QueryTarget)QueryTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)QueryTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static QueryTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(InputStream inputStream) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static QueryTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static QueryTarget parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<QueryTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setParent(String string) {
            string.getClass();
            this.parent_ = string;
        }

        private void setParentBytes(ByteString byteString) {
            QueryTarget.checkByteStringIsUtf8((ByteString)byteString);
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
                    Parser<QueryTarget> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<QueryTarget> class_ = QueryTarget.class;
                    synchronized (QueryTarget.class) {
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
                    Object[] arrobject = new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class};
                    return QueryTarget.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new QueryTarget();
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
        extends GeneratedMessageLite.Builder<QueryTarget, Builder>
        implements QueryTargetOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearParent() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearParent();
                return this;
            }

            public Builder clearQueryType() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearQueryType();
                return this;
            }

            public Builder clearStructuredQuery() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearStructuredQuery();
                return this;
            }

            @Override
            public String getParent() {
                return ((QueryTarget)this.instance).getParent();
            }

            @Override
            public ByteString getParentBytes() {
                return ((QueryTarget)this.instance).getParentBytes();
            }

            @Override
            public QueryTypeCase getQueryTypeCase() {
                return ((QueryTarget)this.instance).getQueryTypeCase();
            }

            @Override
            public StructuredQuery getStructuredQuery() {
                return ((QueryTarget)this.instance).getStructuredQuery();
            }

            @Override
            public boolean hasStructuredQuery() {
                return ((QueryTarget)this.instance).hasStructuredQuery();
            }

            public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).mergeStructuredQuery(structuredQuery);
                return this;
            }

            public Builder setParent(String string) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setParent(string);
                return this;
            }

            public Builder setParentBytes(ByteString byteString) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setParentBytes(byteString);
                return this;
            }

            public Builder setStructuredQuery(StructuredQuery.Builder builder) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setStructuredQuery((StructuredQuery)builder.build());
                return this;
            }

            public Builder setStructuredQuery(StructuredQuery structuredQuery) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setStructuredQuery(structuredQuery);
                return this;
            }
        }

    }

    public static interface QueryTargetOrBuilder
    extends MessageLiteOrBuilder {
        public String getParent();

        public ByteString getParentBytes();

        public QueryTarget.QueryTypeCase getQueryTypeCase();

        public StructuredQuery getStructuredQuery();

        public boolean hasStructuredQuery();
    }

}

