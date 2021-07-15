/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
 *  com.google.protobuf.AnyOrBuilder
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
package com.google.api;

import com.google.api.SourceInfo;
import com.google.api.SourceInfoOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
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

public final class SourceInfo
extends GeneratedMessageLite<SourceInfo, Builder>
implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE;
    private static volatile Parser<SourceInfo> PARSER;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> sourceFiles_ = SourceInfo.emptyProtobufList();

    static {
        SourceInfo sourceInfo;
        DEFAULT_INSTANCE = sourceInfo = new SourceInfo();
        GeneratedMessageLite.registerDefaultInstance(SourceInfo.class, (GeneratedMessageLite)sourceInfo);
    }

    private SourceInfo() {
    }

    private void addAllSourceFiles(Iterable<? extends Any> iterable) {
        this.ensureSourceFilesIsMutable();
        AbstractMessageLite.addAll(iterable, this.sourceFiles_);
    }

    private void addSourceFiles(int n, Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add(n, (Object)any);
    }

    private void addSourceFiles(Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add((Object)any);
    }

    private void clearSourceFiles() {
        this.sourceFiles_ = SourceInfo.emptyProtobufList();
    }

    private void ensureSourceFilesIsMutable() {
        Internal.ProtobufList<Any> protobufList = this.sourceFiles_;
        if (!protobufList.isModifiable()) {
            this.sourceFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(SourceInfo sourceInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceInfo)SourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)SourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static SourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SourceInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSourceFiles(int n) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(n);
    }

    private void setSourceFiles(int n, Any any) {
        any.getClass();
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.set(n, (Object)any);
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
                Parser<SourceInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<SourceInfo> class_ = SourceInfo.class;
                synchronized (SourceInfo.class) {
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
                Object[] arrobject = new Object[]{"sourceFiles_", Any.class};
                return SourceInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new SourceInfo();
    }

    @Override
    public Any getSourceFiles(int n) {
        return (Any)this.sourceFiles_.get(n);
    }

    @Override
    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    @Override
    public List<Any> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public AnyOrBuilder getSourceFilesOrBuilder(int n) {
        return (AnyOrBuilder)this.sourceFiles_.get(n);
    }

    public List<? extends AnyOrBuilder> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SourceInfo, Builder>
    implements SourceInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllSourceFiles(Iterable<? extends Any> iterable) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addAllSourceFiles((Iterable<? extends Any>)iterable);
            return this;
        }

        public Builder addSourceFiles(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(n, (Any)builder.build());
            return this;
        }

        public Builder addSourceFiles(int n, Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(n, any);
            return this;
        }

        public Builder addSourceFiles(Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles((Any)builder.build());
            return this;
        }

        public Builder addSourceFiles(Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(any);
            return this;
        }

        public Builder clearSourceFiles() {
            this.copyOnWrite();
            ((SourceInfo)this.instance).clearSourceFiles();
            return this;
        }

        @Override
        public Any getSourceFiles(int n) {
            return ((SourceInfo)this.instance).getSourceFiles(n);
        }

        @Override
        public int getSourceFilesCount() {
            return ((SourceInfo)this.instance).getSourceFilesCount();
        }

        @Override
        public List<Any> getSourceFilesList() {
            return Collections.unmodifiableList(((SourceInfo)this.instance).getSourceFilesList());
        }

        public Builder removeSourceFiles(int n) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).removeSourceFiles(n);
            return this;
        }

        public Builder setSourceFiles(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).setSourceFiles(n, (Any)builder.build());
            return this;
        }

        public Builder setSourceFiles(int n, Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).setSourceFiles(n, any);
            return this;
        }
    }

}

