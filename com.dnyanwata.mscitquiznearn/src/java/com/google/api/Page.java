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
package com.google.api;

import com.google.api.Page;
import com.google.api.PageOrBuilder;
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

public final class Page
extends GeneratedMessageLite<Page, Builder>
implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Page> PARSER;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private String content_ = "";
    private String name_ = "";
    private Internal.ProtobufList<Page> subpages_ = Page.emptyProtobufList();

    static {
        Page page;
        DEFAULT_INSTANCE = page = new Page();
        GeneratedMessageLite.registerDefaultInstance(Page.class, (GeneratedMessageLite)page);
    }

    private Page() {
    }

    private void addAllSubpages(Iterable<? extends Page> iterable) {
        this.ensureSubpagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.subpages_);
    }

    private void addSubpages(int n, Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.add(n, (Object)page);
    }

    private void addSubpages(Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.add((Object)page);
    }

    private void clearContent() {
        this.content_ = Page.getDefaultInstance().getContent();
    }

    private void clearName() {
        this.name_ = Page.getDefaultInstance().getName();
    }

    private void clearSubpages() {
        this.subpages_ = Page.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        Internal.ProtobufList<Page> protobufList = this.subpages_;
        if (!protobufList.isModifiable()) {
            this.subpages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Page page) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page)Page.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)Page.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Page parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Page parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Page> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSubpages(int n) {
        this.ensureSubpagesIsMutable();
        this.subpages_.remove(n);
    }

    private void setContent(String string) {
        string.getClass();
        this.content_ = string;
    }

    private void setContentBytes(ByteString byteString) {
        Page.checkByteStringIsUtf8((ByteString)byteString);
        this.content_ = byteString.toStringUtf8();
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        Page.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setSubpages(int n, Page page) {
        page.getClass();
        this.ensureSubpagesIsMutable();
        this.subpages_.set(n, (Object)page);
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
                Parser<Page> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Page> class_ = Page.class;
                synchronized (Page.class) {
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
                Object[] arrobject = new Object[]{"name_", "content_", "subpages_", Page.class};
                return Page.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Page();
    }

    @Override
    public String getContent() {
        return this.content_;
    }

    @Override
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8((String)this.content_);
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
    public Page getSubpages(int n) {
        return (Page)this.subpages_.get(n);
    }

    @Override
    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    @Override
    public List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public PageOrBuilder getSubpagesOrBuilder(int n) {
        return (PageOrBuilder)this.subpages_.get(n);
    }

    public List<? extends PageOrBuilder> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Page, Builder>
    implements PageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllSubpages(Iterable<? extends Page> iterable) {
            this.copyOnWrite();
            ((Page)this.instance).addAllSubpages((Iterable<? extends Page>)iterable);
            return this;
        }

        public Builder addSubpages(int n, Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(n, (Page)builder.build());
            return this;
        }

        public Builder addSubpages(int n, Page page) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(n, page);
            return this;
        }

        public Builder addSubpages(Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages((Page)builder.build());
            return this;
        }

        public Builder addSubpages(Page page) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(page);
            return this;
        }

        public Builder clearContent() {
            this.copyOnWrite();
            ((Page)this.instance).clearContent();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Page)this.instance).clearName();
            return this;
        }

        public Builder clearSubpages() {
            this.copyOnWrite();
            ((Page)this.instance).clearSubpages();
            return this;
        }

        @Override
        public String getContent() {
            return ((Page)this.instance).getContent();
        }

        @Override
        public ByteString getContentBytes() {
            return ((Page)this.instance).getContentBytes();
        }

        @Override
        public String getName() {
            return ((Page)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Page)this.instance).getNameBytes();
        }

        @Override
        public Page getSubpages(int n) {
            return ((Page)this.instance).getSubpages(n);
        }

        @Override
        public int getSubpagesCount() {
            return ((Page)this.instance).getSubpagesCount();
        }

        @Override
        public List<Page> getSubpagesList() {
            return Collections.unmodifiableList(((Page)this.instance).getSubpagesList());
        }

        public Builder removeSubpages(int n) {
            this.copyOnWrite();
            ((Page)this.instance).removeSubpages(n);
            return this;
        }

        public Builder setContent(String string) {
            this.copyOnWrite();
            ((Page)this.instance).setContent(string);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Page)this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Page)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Page)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setSubpages(int n, Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).setSubpages(n, (Page)builder.build());
            return this;
        }

        public Builder setSubpages(int n, Page page) {
            this.copyOnWrite();
            ((Page)this.instance).setSubpages(n, page);
            return this;
        }
    }

}

