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

import com.google.api.Documentation;
import com.google.api.DocumentationOrBuilder;
import com.google.api.DocumentationRule;
import com.google.api.DocumentationRuleOrBuilder;
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

public final class Documentation
extends GeneratedMessageLite<Documentation, Builder>
implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<Documentation> PARSER;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private Internal.ProtobufList<Page> pages_ = Documentation.emptyProtobufList();
    private Internal.ProtobufList<DocumentationRule> rules_ = Documentation.emptyProtobufList();
    private String summary_ = "";

    static {
        Documentation documentation;
        DEFAULT_INSTANCE = documentation = new Documentation();
        GeneratedMessageLite.registerDefaultInstance(Documentation.class, (GeneratedMessageLite)documentation);
    }

    private Documentation() {
    }

    private void addAllPages(Iterable<? extends Page> iterable) {
        this.ensurePagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.pages_);
    }

    private void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addPages(int n, Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.add(n, (Object)page);
    }

    private void addPages(Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.add((Object)page);
    }

    private void addRules(int n, DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)documentationRule);
    }

    private void addRules(DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)documentationRule);
    }

    private void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = Documentation.getDefaultInstance().getDocumentationRootUrl();
    }

    private void clearOverview() {
        this.overview_ = Documentation.getDefaultInstance().getOverview();
    }

    private void clearPages() {
        this.pages_ = Documentation.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Documentation.emptyProtobufList();
    }

    private void clearSummary() {
        this.summary_ = Documentation.getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        Internal.ProtobufList<Page> protobufList = this.pages_;
        if (!protobufList.isModifiable()) {
            this.pages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<DocumentationRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Documentation documentation) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation)Documentation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)Documentation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Documentation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Documentation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Documentation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Documentation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePages(int n) {
        this.ensurePagesIsMutable();
        this.pages_.remove(n);
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setDocumentationRootUrl(String string) {
        string.getClass();
        this.documentationRootUrl_ = string;
    }

    private void setDocumentationRootUrlBytes(ByteString byteString) {
        Documentation.checkByteStringIsUtf8((ByteString)byteString);
        this.documentationRootUrl_ = byteString.toStringUtf8();
    }

    private void setOverview(String string) {
        string.getClass();
        this.overview_ = string;
    }

    private void setOverviewBytes(ByteString byteString) {
        Documentation.checkByteStringIsUtf8((ByteString)byteString);
        this.overview_ = byteString.toStringUtf8();
    }

    private void setPages(int n, Page page) {
        page.getClass();
        this.ensurePagesIsMutable();
        this.pages_.set(n, (Object)page);
    }

    private void setRules(int n, DocumentationRule documentationRule) {
        documentationRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)documentationRule);
    }

    private void setSummary(String string) {
        string.getClass();
        this.summary_ = string;
    }

    private void setSummaryBytes(ByteString byteString) {
        Documentation.checkByteStringIsUtf8((ByteString)byteString);
        this.summary_ = byteString.toStringUtf8();
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
                Parser<Documentation> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Documentation> class_ = Documentation.class;
                synchronized (Documentation.class) {
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
                Object[] arrobject = new Object[]{"summary_", "overview_", "rules_", DocumentationRule.class, "documentationRootUrl_", "pages_", Page.class};
                return Documentation.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u0208\u0005\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Documentation();
    }

    @Override
    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    @Override
    public ByteString getDocumentationRootUrlBytes() {
        return ByteString.copyFromUtf8((String)this.documentationRootUrl_);
    }

    @Override
    public String getOverview() {
        return this.overview_;
    }

    @Override
    public ByteString getOverviewBytes() {
        return ByteString.copyFromUtf8((String)this.overview_);
    }

    @Override
    public Page getPages(int n) {
        return (Page)this.pages_.get(n);
    }

    @Override
    public int getPagesCount() {
        return this.pages_.size();
    }

    @Override
    public List<Page> getPagesList() {
        return this.pages_;
    }

    public PageOrBuilder getPagesOrBuilder(int n) {
        return (PageOrBuilder)this.pages_.get(n);
    }

    public List<? extends PageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    @Override
    public DocumentationRule getRules(int n) {
        return (DocumentationRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public DocumentationRuleOrBuilder getRulesOrBuilder(int n) {
        return (DocumentationRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends DocumentationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override
    public String getSummary() {
        return this.summary_;
    }

    @Override
    public ByteString getSummaryBytes() {
        return ByteString.copyFromUtf8((String)this.summary_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Documentation, Builder>
    implements DocumentationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllPages(Iterable<? extends Page> iterable) {
            this.copyOnWrite();
            ((Documentation)this.instance).addAllPages((Iterable<? extends Page>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends DocumentationRule> iterable) {
            this.copyOnWrite();
            ((Documentation)this.instance).addAllRules((Iterable<? extends DocumentationRule>)iterable);
            return this;
        }

        public Builder addPages(int n, Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(n, (Page)builder.build());
            return this;
        }

        public Builder addPages(int n, Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(n, page);
            return this;
        }

        public Builder addPages(Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages((Page)builder.build());
            return this;
        }

        public Builder addPages(Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(page);
            return this;
        }

        public Builder addRules(int n, DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(n, (DocumentationRule)builder.build());
            return this;
        }

        public Builder addRules(int n, DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(n, documentationRule);
            return this;
        }

        public Builder addRules(DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules((DocumentationRule)builder.build());
            return this;
        }

        public Builder addRules(DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(documentationRule);
            return this;
        }

        public Builder clearDocumentationRootUrl() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearDocumentationRootUrl();
            return this;
        }

        public Builder clearOverview() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearOverview();
            return this;
        }

        public Builder clearPages() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearPages();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearRules();
            return this;
        }

        public Builder clearSummary() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearSummary();
            return this;
        }

        @Override
        public String getDocumentationRootUrl() {
            return ((Documentation)this.instance).getDocumentationRootUrl();
        }

        @Override
        public ByteString getDocumentationRootUrlBytes() {
            return ((Documentation)this.instance).getDocumentationRootUrlBytes();
        }

        @Override
        public String getOverview() {
            return ((Documentation)this.instance).getOverview();
        }

        @Override
        public ByteString getOverviewBytes() {
            return ((Documentation)this.instance).getOverviewBytes();
        }

        @Override
        public Page getPages(int n) {
            return ((Documentation)this.instance).getPages(n);
        }

        @Override
        public int getPagesCount() {
            return ((Documentation)this.instance).getPagesCount();
        }

        @Override
        public List<Page> getPagesList() {
            return Collections.unmodifiableList(((Documentation)this.instance).getPagesList());
        }

        @Override
        public DocumentationRule getRules(int n) {
            return ((Documentation)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Documentation)this.instance).getRulesCount();
        }

        @Override
        public List<DocumentationRule> getRulesList() {
            return Collections.unmodifiableList(((Documentation)this.instance).getRulesList());
        }

        @Override
        public String getSummary() {
            return ((Documentation)this.instance).getSummary();
        }

        @Override
        public ByteString getSummaryBytes() {
            return ((Documentation)this.instance).getSummaryBytes();
        }

        public Builder removePages(int n) {
            this.copyOnWrite();
            ((Documentation)this.instance).removePages(n);
            return this;
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Documentation)this.instance).removeRules(n);
            return this;
        }

        public Builder setDocumentationRootUrl(String string) {
            this.copyOnWrite();
            ((Documentation)this.instance).setDocumentationRootUrl(string);
            return this;
        }

        public Builder setDocumentationRootUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setDocumentationRootUrlBytes(byteString);
            return this;
        }

        public Builder setOverview(String string) {
            this.copyOnWrite();
            ((Documentation)this.instance).setOverview(string);
            return this;
        }

        public Builder setOverviewBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setOverviewBytes(byteString);
            return this;
        }

        public Builder setPages(int n, Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).setPages(n, (Page)builder.build());
            return this;
        }

        public Builder setPages(int n, Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).setPages(n, page);
            return this;
        }

        public Builder setRules(int n, DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).setRules(n, (DocumentationRule)builder.build());
            return this;
        }

        public Builder setRules(int n, DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).setRules(n, documentationRule);
            return this;
        }

        public Builder setSummary(String string) {
            this.copyOnWrite();
            ((Documentation)this.instance).setSummary(string);
            return this;
        }

        public Builder setSummaryBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setSummaryBytes(byteString);
            return this;
        }
    }

}

