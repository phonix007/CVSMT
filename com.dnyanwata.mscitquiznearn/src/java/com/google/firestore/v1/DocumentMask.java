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
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentMaskOrBuilder;
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

public final class DocumentMask
extends GeneratedMessageLite<DocumentMask, Builder>
implements DocumentMaskOrBuilder {
    private static final DocumentMask DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentMask> PARSER;
    private Internal.ProtobufList<String> fieldPaths_ = GeneratedMessageLite.emptyProtobufList();

    static {
        DocumentMask documentMask;
        DEFAULT_INSTANCE = documentMask = new DocumentMask();
        GeneratedMessageLite.registerDefaultInstance(DocumentMask.class, (GeneratedMessageLite)documentMask);
    }

    private DocumentMask() {
    }

    private void addAllFieldPaths(Iterable<String> iterable) {
        this.ensureFieldPathsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldPaths_);
    }

    private void addFieldPaths(String string) {
        string.getClass();
        this.ensureFieldPathsIsMutable();
        this.fieldPaths_.add((Object)string);
    }

    private void addFieldPathsBytes(ByteString byteString) {
        DocumentMask.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureFieldPathsIsMutable();
        this.fieldPaths_.add((Object)byteString.toStringUtf8());
    }

    private void clearFieldPaths() {
        this.fieldPaths_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFieldPathsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.fieldPaths_;
        if (!protobufList.isModifiable()) {
            this.fieldPaths_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static DocumentMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DocumentMask documentMask) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentMask);
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentMask)DocumentMask.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)DocumentMask.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(InputStream inputStream) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DocumentMask parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentMask parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFieldPaths(int n, String string) {
        string.getClass();
        this.ensureFieldPathsIsMutable();
        this.fieldPaths_.set(n, (Object)string);
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
                Parser<DocumentMask> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DocumentMask> class_ = DocumentMask.class;
                synchronized (DocumentMask.class) {
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
                Object[] arrobject = new Object[]{"fieldPaths_"};
                return DocumentMask.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DocumentMask();
    }

    @Override
    public String getFieldPaths(int n) {
        return (String)this.fieldPaths_.get(n);
    }

    @Override
    public ByteString getFieldPathsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.fieldPaths_.get(n)));
    }

    @Override
    public int getFieldPathsCount() {
        return this.fieldPaths_.size();
    }

    @Override
    public List<String> getFieldPathsList() {
        return this.fieldPaths_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentMask, Builder>
    implements DocumentMaskOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldPaths(Iterable<String> iterable) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addAllFieldPaths((Iterable<String>)iterable);
            return this;
        }

        public Builder addFieldPaths(String string) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addFieldPaths(string);
            return this;
        }

        public Builder addFieldPathsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addFieldPathsBytes(byteString);
            return this;
        }

        public Builder clearFieldPaths() {
            this.copyOnWrite();
            ((DocumentMask)this.instance).clearFieldPaths();
            return this;
        }

        @Override
        public String getFieldPaths(int n) {
            return ((DocumentMask)this.instance).getFieldPaths(n);
        }

        @Override
        public ByteString getFieldPathsBytes(int n) {
            return ((DocumentMask)this.instance).getFieldPathsBytes(n);
        }

        @Override
        public int getFieldPathsCount() {
            return ((DocumentMask)this.instance).getFieldPathsCount();
        }

        @Override
        public List<String> getFieldPathsList() {
            return Collections.unmodifiableList(((DocumentMask)this.instance).getFieldPathsList());
        }

        public Builder setFieldPaths(int n, String string) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).setFieldPaths(n, string);
            return this;
        }
    }

}

