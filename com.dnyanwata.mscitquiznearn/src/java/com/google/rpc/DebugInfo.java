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
 *  com.google.rpc.DebugInfo$1
 *  com.google.rpc.DebugInfoOrBuilder
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
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.DebugInfo;
import com.google.rpc.DebugInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class DebugInfo
extends GeneratedMessageLite<DebugInfo, Builder>
implements DebugInfoOrBuilder {
    private static final DebugInfo DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser<DebugInfo> PARSER;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private String detail_ = "";
    private Internal.ProtobufList<String> stackEntries_ = GeneratedMessageLite.emptyProtobufList();

    static {
        DebugInfo debugInfo;
        DEFAULT_INSTANCE = debugInfo = new DebugInfo();
        GeneratedMessageLite.registerDefaultInstance(DebugInfo.class, (GeneratedMessageLite)debugInfo);
    }

    private DebugInfo() {
    }

    private void addAllStackEntries(Iterable<String> iterable) {
        this.ensureStackEntriesIsMutable();
        AbstractMessageLite.addAll(iterable, this.stackEntries_);
    }

    private void addStackEntries(String string) {
        string.getClass();
        this.ensureStackEntriesIsMutable();
        this.stackEntries_.add((Object)string);
    }

    private void addStackEntriesBytes(ByteString byteString) {
        DebugInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureStackEntriesIsMutable();
        this.stackEntries_.add((Object)byteString.toStringUtf8());
    }

    private void clearDetail() {
        this.detail_ = DebugInfo.getDefaultInstance().getDetail();
    }

    private void clearStackEntries() {
        this.stackEntries_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStackEntriesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.stackEntries_;
        if (!protobufList.isModifiable()) {
            this.stackEntries_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static DebugInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DebugInfo debugInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)debugInfo);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DebugInfo)DebugInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)DebugInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DebugInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(InputStream inputStream) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DebugInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DebugInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DebugInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DebugInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDetail(String string) {
        string.getClass();
        this.detail_ = string;
    }

    private void setDetailBytes(ByteString byteString) {
        DebugInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.detail_ = byteString.toStringUtf8();
    }

    private void setStackEntries(int n, String string) {
        string.getClass();
        this.ensureStackEntriesIsMutable();
        this.stackEntries_.set(n, (Object)string);
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
                Parser<DebugInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DebugInfo> class_ = DebugInfo.class;
                synchronized (DebugInfo.class) {
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
                Object[] arrobject = new Object[]{"stackEntries_", "detail_"};
                return DebugInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u021a\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DebugInfo();
    }

    public String getDetail() {
        return this.detail_;
    }

    public ByteString getDetailBytes() {
        return ByteString.copyFromUtf8((String)this.detail_);
    }

    public String getStackEntries(int n) {
        return (String)this.stackEntries_.get(n);
    }

    public ByteString getStackEntriesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.stackEntries_.get(n)));
    }

    public int getStackEntriesCount() {
        return this.stackEntries_.size();
    }

    public List<String> getStackEntriesList() {
        return this.stackEntries_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DebugInfo, Builder>
    implements DebugInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllStackEntries(Iterable<String> iterable) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addAllStackEntries((Iterable<String>)iterable);
            return this;
        }

        public Builder addStackEntries(String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addStackEntries(string);
            return this;
        }

        public Builder addStackEntriesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addStackEntriesBytes(byteString);
            return this;
        }

        public Builder clearDetail() {
            this.copyOnWrite();
            ((DebugInfo)this.instance).clearDetail();
            return this;
        }

        public Builder clearStackEntries() {
            this.copyOnWrite();
            ((DebugInfo)this.instance).clearStackEntries();
            return this;
        }

        public String getDetail() {
            return ((DebugInfo)this.instance).getDetail();
        }

        public ByteString getDetailBytes() {
            return ((DebugInfo)this.instance).getDetailBytes();
        }

        public String getStackEntries(int n) {
            return ((DebugInfo)this.instance).getStackEntries(n);
        }

        public ByteString getStackEntriesBytes(int n) {
            return ((DebugInfo)this.instance).getStackEntriesBytes(n);
        }

        public int getStackEntriesCount() {
            return ((DebugInfo)this.instance).getStackEntriesCount();
        }

        public List<String> getStackEntriesList() {
            return Collections.unmodifiableList(((DebugInfo)this.instance).getStackEntriesList());
        }

        public Builder setDetail(String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setDetail(string);
            return this;
        }

        public Builder setDetailBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setDetailBytes(byteString);
            return this;
        }

        public Builder setStackEntries(int n, String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setStackEntries(n, string);
            return this;
        }
    }

}

