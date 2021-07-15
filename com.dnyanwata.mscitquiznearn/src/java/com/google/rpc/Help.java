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
 *  com.google.rpc.Help$1
 *  com.google.rpc.Help$LinkOrBuilder
 *  com.google.rpc.HelpOrBuilder
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
import com.google.rpc.Help;
import com.google.rpc.HelpOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Help
extends GeneratedMessageLite<Help, Builder>
implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser<Help> PARSER;
    private Internal.ProtobufList<Link> links_ = Help.emptyProtobufList();

    static {
        Help help;
        DEFAULT_INSTANCE = help = new Help();
        GeneratedMessageLite.registerDefaultInstance(Help.class, (GeneratedMessageLite)help);
    }

    private Help() {
    }

    private void addAllLinks(Iterable<? extends Link> iterable) {
        this.ensureLinksIsMutable();
        AbstractMessageLite.addAll(iterable, this.links_);
    }

    private void addLinks(int n, Link link) {
        link.getClass();
        this.ensureLinksIsMutable();
        this.links_.add(n, (Object)link);
    }

    private void addLinks(Link link) {
        link.getClass();
        this.ensureLinksIsMutable();
        this.links_.add((Object)link);
    }

    private void clearLinks() {
        this.links_ = Help.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        Internal.ProtobufList<Link> protobufList = this.links_;
        if (!protobufList.isModifiable()) {
            this.links_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Help help) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Help)Help.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)Help.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Help parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Help parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Help parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Help parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Help> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLinks(int n) {
        this.ensureLinksIsMutable();
        this.links_.remove(n);
    }

    private void setLinks(int n, Link link) {
        link.getClass();
        this.ensureLinksIsMutable();
        this.links_.set(n, (Object)link);
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
                Parser<Help> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Help> class_ = Help.class;
                synchronized (Help.class) {
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
                Object[] arrobject = new Object[]{"links_", Link.class};
                return Help.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Help();
    }

    public Link getLinks(int n) {
        return (Link)((Object)this.links_.get(n));
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int n) {
        return this.links_.get(n);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Help, Builder>
    implements HelpOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
            this.copyOnWrite();
            ((Help)this.instance).addAllLinks((Iterable<? extends Link>)iterable);
            return this;
        }

        public Builder addLinks(int n, Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(n, (Link)builder.build());
            return this;
        }

        public Builder addLinks(int n, Link link) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(n, link);
            return this;
        }

        public Builder addLinks(Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks((Link)builder.build());
            return this;
        }

        public Builder addLinks(Link link) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(link);
            return this;
        }

        public Builder clearLinks() {
            this.copyOnWrite();
            ((Help)this.instance).clearLinks();
            return this;
        }

        public Link getLinks(int n) {
            return ((Help)this.instance).getLinks(n);
        }

        public int getLinksCount() {
            return ((Help)this.instance).getLinksCount();
        }

        public List<Link> getLinksList() {
            return Collections.unmodifiableList(((Help)this.instance).getLinksList());
        }

        public Builder removeLinks(int n) {
            this.copyOnWrite();
            ((Help)this.instance).removeLinks(n);
            return this;
        }

        public Builder setLinks(int n, Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).setLinks(n, (Link)builder.build());
            return this;
        }

        public Builder setLinks(int n, Link link) {
            this.copyOnWrite();
            ((Help)this.instance).setLinks(n, link);
            return this;
        }
    }

    public static final class Link
    extends GeneratedMessageLite<Link, Builder>
    implements LinkOrBuilder {
        private static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser<Link> PARSER;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        static {
            Link link;
            DEFAULT_INSTANCE = link = new Link();
            GeneratedMessageLite.registerDefaultInstance(Link.class, (GeneratedMessageLite)link);
        }

        private Link() {
        }

        private void clearDescription() {
            this.description_ = Link.getDefaultInstance().getDescription();
        }

        private void clearUrl() {
            this.url_ = Link.getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Link link) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link)Link.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)Link.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Link parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDescription(String string) {
            string.getClass();
            this.description_ = string;
        }

        private void setDescriptionBytes(ByteString byteString) {
            Link.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
        }

        private void setUrl(String string) {
            string.getClass();
            this.url_ = string;
        }

        private void setUrlBytes(ByteString byteString) {
            Link.checkByteStringIsUtf8((ByteString)byteString);
            this.url_ = byteString.toStringUtf8();
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
                    Parser<Link> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Link> class_ = Link.class;
                    synchronized (Link.class) {
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
                    Object[] arrobject = new Object[]{"description_", "url_"};
                    return Link.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Link();
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8((String)this.description_);
        }

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8((String)this.url_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Link, Builder>
        implements LinkOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((Link)this.instance).clearDescription();
                return this;
            }

            public Builder clearUrl() {
                this.copyOnWrite();
                ((Link)this.instance).clearUrl();
                return this;
            }

            public String getDescription() {
                return ((Link)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((Link)this.instance).getDescriptionBytes();
            }

            public String getUrl() {
                return ((Link)this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((Link)this.instance).getUrlBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((Link)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Link)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setUrl(String string) {
                this.copyOnWrite();
                ((Link)this.instance).setUrl(string);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Link)this.instance).setUrlBytes(byteString);
                return this;
            }
        }

    }

}

