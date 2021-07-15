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

import com.google.api.ContextRule;
import com.google.api.ContextRuleOrBuilder;
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

public final class ContextRule
extends GeneratedMessageLite<ContextRule, Builder>
implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile Parser<ContextRule> PARSER;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    static {
        ContextRule contextRule;
        DEFAULT_INSTANCE = contextRule = new ContextRule();
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, (GeneratedMessageLite)contextRule);
    }

    private ContextRule() {
    }

    private void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        this.ensureAllowedRequestExtensionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.allowedRequestExtensions_);
    }

    private void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        this.ensureAllowedResponseExtensionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.allowedResponseExtensions_);
    }

    private void addAllProvided(Iterable<String> iterable) {
        this.ensureProvidedIsMutable();
        AbstractMessageLite.addAll(iterable, this.provided_);
    }

    private void addAllRequested(Iterable<String> iterable) {
        this.ensureRequestedIsMutable();
        AbstractMessageLite.addAll(iterable, this.requested_);
    }

    private void addAllowedRequestExtensions(String string) {
        string.getClass();
        this.ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add((Object)string);
    }

    private void addAllowedRequestExtensionsBytes(ByteString byteString) {
        ContextRule.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add((Object)byteString.toStringUtf8());
    }

    private void addAllowedResponseExtensions(String string) {
        string.getClass();
        this.ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add((Object)string);
    }

    private void addAllowedResponseExtensionsBytes(ByteString byteString) {
        ContextRule.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add((Object)byteString.toStringUtf8());
    }

    private void addProvided(String string) {
        string.getClass();
        this.ensureProvidedIsMutable();
        this.provided_.add((Object)string);
    }

    private void addProvidedBytes(ByteString byteString) {
        ContextRule.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureProvidedIsMutable();
        this.provided_.add((Object)byteString.toStringUtf8());
    }

    private void addRequested(String string) {
        string.getClass();
        this.ensureRequestedIsMutable();
        this.requested_.add((Object)string);
    }

    private void addRequestedBytes(ByteString byteString) {
        ContextRule.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureRequestedIsMutable();
        this.requested_.add((Object)byteString.toStringUtf8());
    }

    private void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = ContextRule.getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedRequestExtensions_;
        if (!protobufList.isModifiable()) {
            this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.allowedResponseExtensions_;
        if (!protobufList.isModifiable()) {
            this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureProvidedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.provided_;
        if (!protobufList.isModifiable()) {
            this.provided_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureRequestedIsMutable() {
        Internal.ProtobufList<String> protobufList = this.requested_;
        if (!protobufList.isModifiable()) {
            this.requested_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule)ContextRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)ContextRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ContextRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAllowedRequestExtensions(int n, String string) {
        string.getClass();
        this.ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(n, (Object)string);
    }

    private void setAllowedResponseExtensions(int n, String string) {
        string.getClass();
        this.ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(n, (Object)string);
    }

    private void setProvided(int n, String string) {
        string.getClass();
        this.ensureProvidedIsMutable();
        this.provided_.set(n, (Object)string);
    }

    private void setRequested(int n, String string) {
        string.getClass();
        this.ensureRequestedIsMutable();
        this.requested_.set(n, (Object)string);
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        ContextRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<ContextRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ContextRule> class_ = ContextRule.class;
                synchronized (ContextRule.class) {
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
                Object[] arrobject = new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"};
                return ContextRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u0208\u0002\u021a\u0003\u021a\u0004\u021a\u0005\u021a", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ContextRule();
    }

    @Override
    public String getAllowedRequestExtensions(int n) {
        return (String)this.allowedRequestExtensions_.get(n);
    }

    @Override
    public ByteString getAllowedRequestExtensionsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.allowedRequestExtensions_.get(n)));
    }

    @Override
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override
    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override
    public String getAllowedResponseExtensions(int n) {
        return (String)this.allowedResponseExtensions_.get(n);
    }

    @Override
    public ByteString getAllowedResponseExtensionsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.allowedResponseExtensions_.get(n)));
    }

    @Override
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override
    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override
    public String getProvided(int n) {
        return (String)this.provided_.get(n);
    }

    @Override
    public ByteString getProvidedBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.provided_.get(n)));
    }

    @Override
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override
    public List<String> getProvidedList() {
        return this.provided_;
    }

    @Override
    public String getRequested(int n) {
        return (String)this.requested_.get(n);
    }

    @Override
    public ByteString getRequestedBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.requested_.get(n)));
    }

    @Override
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override
    public List<String> getRequestedList() {
        return this.requested_;
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
    extends GeneratedMessageLite.Builder<ContextRule, Builder>
    implements ContextRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllAllowedRequestExtensions((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllAllowedResponseExtensions((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllProvided(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllProvided((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRequested(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllRequested((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllowedRequestExtensions(String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllowedRequestExtensions(string);
            return this;
        }

        public Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllowedRequestExtensionsBytes(byteString);
            return this;
        }

        public Builder addAllowedResponseExtensions(String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllowedResponseExtensions(string);
            return this;
        }

        public Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllowedResponseExtensionsBytes(byteString);
            return this;
        }

        public Builder addProvided(String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addProvided(string);
            return this;
        }

        public Builder addProvidedBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addProvidedBytes(byteString);
            return this;
        }

        public Builder addRequested(String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addRequested(string);
            return this;
        }

        public Builder addRequestedBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addRequestedBytes(byteString);
            return this;
        }

        public Builder clearAllowedRequestExtensions() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearAllowedRequestExtensions();
            return this;
        }

        public Builder clearAllowedResponseExtensions() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearAllowedResponseExtensions();
            return this;
        }

        public Builder clearProvided() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearProvided();
            return this;
        }

        public Builder clearRequested() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearRequested();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getAllowedRequestExtensions(int n) {
            return ((ContextRule)this.instance).getAllowedRequestExtensions(n);
        }

        @Override
        public ByteString getAllowedRequestExtensionsBytes(int n) {
            return ((ContextRule)this.instance).getAllowedRequestExtensionsBytes(n);
        }

        @Override
        public int getAllowedRequestExtensionsCount() {
            return ((ContextRule)this.instance).getAllowedRequestExtensionsCount();
        }

        @Override
        public List<String> getAllowedRequestExtensionsList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getAllowedRequestExtensionsList());
        }

        @Override
        public String getAllowedResponseExtensions(int n) {
            return ((ContextRule)this.instance).getAllowedResponseExtensions(n);
        }

        @Override
        public ByteString getAllowedResponseExtensionsBytes(int n) {
            return ((ContextRule)this.instance).getAllowedResponseExtensionsBytes(n);
        }

        @Override
        public int getAllowedResponseExtensionsCount() {
            return ((ContextRule)this.instance).getAllowedResponseExtensionsCount();
        }

        @Override
        public List<String> getAllowedResponseExtensionsList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getAllowedResponseExtensionsList());
        }

        @Override
        public String getProvided(int n) {
            return ((ContextRule)this.instance).getProvided(n);
        }

        @Override
        public ByteString getProvidedBytes(int n) {
            return ((ContextRule)this.instance).getProvidedBytes(n);
        }

        @Override
        public int getProvidedCount() {
            return ((ContextRule)this.instance).getProvidedCount();
        }

        @Override
        public List<String> getProvidedList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getProvidedList());
        }

        @Override
        public String getRequested(int n) {
            return ((ContextRule)this.instance).getRequested(n);
        }

        @Override
        public ByteString getRequestedBytes(int n) {
            return ((ContextRule)this.instance).getRequestedBytes(n);
        }

        @Override
        public int getRequestedCount() {
            return ((ContextRule)this.instance).getRequestedCount();
        }

        @Override
        public List<String> getRequestedList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getRequestedList());
        }

        @Override
        public String getSelector() {
            return ((ContextRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((ContextRule)this.instance).getSelectorBytes();
        }

        public Builder setAllowedRequestExtensions(int n, String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setAllowedRequestExtensions(n, string);
            return this;
        }

        public Builder setAllowedResponseExtensions(int n, String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setAllowedResponseExtensions(n, string);
            return this;
        }

        public Builder setProvided(int n, String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setProvided(n, string);
            return this;
        }

        public Builder setRequested(int n, String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setRequested(n, string);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

