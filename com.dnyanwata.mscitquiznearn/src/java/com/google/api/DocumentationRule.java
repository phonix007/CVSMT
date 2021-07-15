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
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.DocumentationRuleOrBuilder;
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

public final class DocumentationRule
extends GeneratedMessageLite<DocumentationRule, Builder>
implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE;
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentationRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String deprecationDescription_ = "";
    private String description_ = "";
    private String selector_ = "";

    static {
        DocumentationRule documentationRule;
        DEFAULT_INSTANCE = documentationRule = new DocumentationRule();
        GeneratedMessageLite.registerDefaultInstance(DocumentationRule.class, (GeneratedMessageLite)documentationRule);
    }

    private DocumentationRule() {
    }

    private void clearDeprecationDescription() {
        this.deprecationDescription_ = DocumentationRule.getDefaultInstance().getDeprecationDescription();
    }

    private void clearDescription() {
        this.description_ = DocumentationRule.getDefaultInstance().getDescription();
    }

    private void clearSelector() {
        this.selector_ = DocumentationRule.getDefaultInstance().getSelector();
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DocumentationRule documentationRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)documentationRule);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule)DocumentationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)DocumentationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DocumentationRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentationRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDeprecationDescription(String string) {
        string.getClass();
        this.deprecationDescription_ = string;
    }

    private void setDeprecationDescriptionBytes(ByteString byteString) {
        DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
        this.deprecationDescription_ = byteString.toStringUtf8();
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
        this.selector_ = byteString.toStringUtf8();
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
                Parser<DocumentationRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DocumentationRule> class_ = DocumentationRule.class;
                synchronized (DocumentationRule.class) {
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
                Object[] arrobject = new Object[]{"selector_", "description_", "deprecationDescription_"};
                return DocumentationRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DocumentationRule();
    }

    @Override
    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    @Override
    public ByteString getDeprecationDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.deprecationDescription_);
    }

    @Override
    public String getDescription() {
        return this.description_;
    }

    @Override
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentationRule, Builder>
    implements DocumentationRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDeprecationDescription() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearDeprecationDescription();
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearDescription();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getDeprecationDescription() {
            return ((DocumentationRule)this.instance).getDeprecationDescription();
        }

        @Override
        public ByteString getDeprecationDescriptionBytes() {
            return ((DocumentationRule)this.instance).getDeprecationDescriptionBytes();
        }

        @Override
        public String getDescription() {
            return ((DocumentationRule)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((DocumentationRule)this.instance).getDescriptionBytes();
        }

        @Override
        public String getSelector() {
            return ((DocumentationRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((DocumentationRule)this.instance).getSelectorBytes();
        }

        public Builder setDeprecationDescription(String string) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDeprecationDescription(string);
            return this;
        }

        public Builder setDeprecationDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDeprecationDescriptionBytes(byteString);
            return this;
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

