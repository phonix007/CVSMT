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
package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.api.HttpRule;
import com.google.api.HttpRuleOrBuilder;
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

public final class HttpRule
extends GeneratedMessageLite<HttpRule, Builder>
implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser<HttpRule> PARSER;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<HttpRule> additionalBindings_ = HttpRule.emptyProtobufList();
    private String body_ = "";
    private int patternCase_ = 0;
    private Object pattern_;
    private String responseBody_ = "";
    private String selector_ = "";

    static {
        HttpRule httpRule;
        DEFAULT_INSTANCE = httpRule = new HttpRule();
        GeneratedMessageLite.registerDefaultInstance(HttpRule.class, (GeneratedMessageLite)httpRule);
    }

    private HttpRule() {
    }

    private void addAdditionalBindings(int n, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(n, (Object)httpRule);
    }

    private void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add((Object)httpRule);
    }

    private void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        this.ensureAdditionalBindingsIsMutable();
        AbstractMessageLite.addAll(iterable, this.additionalBindings_);
    }

    private void clearAdditionalBindings() {
        this.additionalBindings_ = HttpRule.emptyProtobufList();
    }

    private void clearBody() {
        this.body_ = HttpRule.getDefaultInstance().getBody();
    }

    private void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    private void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearResponseBody() {
        this.responseBody_ = HttpRule.getDefaultInstance().getResponseBody();
    }

    private void clearSelector() {
        this.selector_ = HttpRule.getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        Internal.ProtobufList<HttpRule> protobufList = this.additionalBindings_;
        if (!protobufList.isModifiable()) {
            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = this.patternCase_ == 8 && this.pattern_ != CustomHttpPattern.getDefaultInstance() ? ((CustomHttpPattern.Builder)CustomHttpPattern.newBuilder((CustomHttpPattern)this.pattern_).mergeFrom((GeneratedMessageLite)customHttpPattern)).buildPartial() : customHttpPattern;
        this.patternCase_ = 8;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HttpRule httpRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRule)HttpRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)HttpRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalBindings(int n) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(n);
    }

    private void setAdditionalBindings(int n, HttpRule httpRule) {
        httpRule.getClass();
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(n, (Object)httpRule);
    }

    private void setBody(String string) {
        string.getClass();
        this.body_ = string;
    }

    private void setBodyBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.body_ = byteString.toStringUtf8();
    }

    private void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    private void setDelete(String string) {
        string.getClass();
        this.patternCase_ = 5;
        this.pattern_ = string;
    }

    private void setDeleteBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.pattern_ = byteString.toStringUtf8();
        this.patternCase_ = 5;
    }

    private void setGet(String string) {
        string.getClass();
        this.patternCase_ = 2;
        this.pattern_ = string;
    }

    private void setGetBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.pattern_ = byteString.toStringUtf8();
        this.patternCase_ = 2;
    }

    private void setPatch(String string) {
        string.getClass();
        this.patternCase_ = 6;
        this.pattern_ = string;
    }

    private void setPatchBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.pattern_ = byteString.toStringUtf8();
        this.patternCase_ = 6;
    }

    private void setPost(String string) {
        string.getClass();
        this.patternCase_ = 4;
        this.pattern_ = string;
    }

    private void setPostBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.pattern_ = byteString.toStringUtf8();
        this.patternCase_ = 4;
    }

    private void setPut(String string) {
        string.getClass();
        this.patternCase_ = 3;
        this.pattern_ = string;
    }

    private void setPutBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.pattern_ = byteString.toStringUtf8();
        this.patternCase_ = 3;
    }

    private void setResponseBody(String string) {
        string.getClass();
        this.responseBody_ = string;
    }

    private void setResponseBodyBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
        this.responseBody_ = byteString.toStringUtf8();
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        HttpRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<HttpRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<HttpRule> class_ = HttpRule.class;
                synchronized (HttpRule.class) {
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
                Object[] arrobject = new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"};
                return HttpRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001\u0208\u0002\u023b\u0000\u0003\u023b\u0000\u0004\u023b\u0000\u0005\u023b\u0000\u0006\u023b\u0000\u0007\u0208\b<\u0000\u000b\u001b\f\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new HttpRule();
    }

    @Override
    public HttpRule getAdditionalBindings(int n) {
        return (HttpRule)this.additionalBindings_.get(n);
    }

    @Override
    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    @Override
    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public HttpRuleOrBuilder getAdditionalBindingsOrBuilder(int n) {
        return (HttpRuleOrBuilder)this.additionalBindings_.get(n);
    }

    public List<? extends HttpRuleOrBuilder> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    @Override
    public String getBody() {
        return this.body_;
    }

    @Override
    public ByteString getBodyBytes() {
        return ByteString.copyFromUtf8((String)this.body_);
    }

    @Override
    public CustomHttpPattern getCustom() {
        if (this.patternCase_ == 8) {
            return (CustomHttpPattern)this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    @Override
    public String getDelete() {
        if (this.patternCase_ == 5) {
            return (String)this.pattern_;
        }
        return "";
    }

    @Override
    public ByteString getDeleteBytes() {
        String string = this.patternCase_ == 5 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getGet() {
        if (this.patternCase_ == 2) {
            return (String)this.pattern_;
        }
        return "";
    }

    @Override
    public ByteString getGetBytes() {
        String string = this.patternCase_ == 2 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getPatch() {
        if (this.patternCase_ == 6) {
            return (String)this.pattern_;
        }
        return "";
    }

    @Override
    public ByteString getPatchBytes() {
        String string = this.patternCase_ == 6 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public PatternCase getPatternCase() {
        return PatternCase.forNumber(this.patternCase_);
    }

    @Override
    public String getPost() {
        if (this.patternCase_ == 4) {
            return (String)this.pattern_;
        }
        return "";
    }

    @Override
    public ByteString getPostBytes() {
        String string = this.patternCase_ == 4 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getPut() {
        if (this.patternCase_ == 3) {
            return (String)this.pattern_;
        }
        return "";
    }

    @Override
    public ByteString getPutBytes() {
        String string = this.patternCase_ == 3 ? (String)this.pattern_ : "";
        return ByteString.copyFromUtf8((String)string);
    }

    @Override
    public String getResponseBody() {
        return this.responseBody_;
    }

    @Override
    public ByteString getResponseBodyBytes() {
        return ByteString.copyFromUtf8((String)this.responseBody_);
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    @Override
    public boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpRule, Builder>
    implements HttpRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAdditionalBindings(int n, Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(n, (HttpRule)builder.build());
            return this;
        }

        public Builder addAdditionalBindings(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(n, httpRule);
            return this;
        }

        public Builder addAdditionalBindings(Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings((HttpRule)builder.build());
            return this;
        }

        public Builder addAdditionalBindings(HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(httpRule);
            return this;
        }

        public Builder addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAllAdditionalBindings((Iterable<? extends HttpRule>)iterable);
            return this;
        }

        public Builder clearAdditionalBindings() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearAdditionalBindings();
            return this;
        }

        public Builder clearBody() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearBody();
            return this;
        }

        public Builder clearCustom() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearCustom();
            return this;
        }

        public Builder clearDelete() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearDelete();
            return this;
        }

        public Builder clearGet() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearGet();
            return this;
        }

        public Builder clearPatch() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPatch();
            return this;
        }

        public Builder clearPattern() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPattern();
            return this;
        }

        public Builder clearPost() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPost();
            return this;
        }

        public Builder clearPut() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPut();
            return this;
        }

        public Builder clearResponseBody() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearResponseBody();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public HttpRule getAdditionalBindings(int n) {
            return ((HttpRule)this.instance).getAdditionalBindings(n);
        }

        @Override
        public int getAdditionalBindingsCount() {
            return ((HttpRule)this.instance).getAdditionalBindingsCount();
        }

        @Override
        public List<HttpRule> getAdditionalBindingsList() {
            return Collections.unmodifiableList(((HttpRule)this.instance).getAdditionalBindingsList());
        }

        @Override
        public String getBody() {
            return ((HttpRule)this.instance).getBody();
        }

        @Override
        public ByteString getBodyBytes() {
            return ((HttpRule)this.instance).getBodyBytes();
        }

        @Override
        public CustomHttpPattern getCustom() {
            return ((HttpRule)this.instance).getCustom();
        }

        @Override
        public String getDelete() {
            return ((HttpRule)this.instance).getDelete();
        }

        @Override
        public ByteString getDeleteBytes() {
            return ((HttpRule)this.instance).getDeleteBytes();
        }

        @Override
        public String getGet() {
            return ((HttpRule)this.instance).getGet();
        }

        @Override
        public ByteString getGetBytes() {
            return ((HttpRule)this.instance).getGetBytes();
        }

        @Override
        public String getPatch() {
            return ((HttpRule)this.instance).getPatch();
        }

        @Override
        public ByteString getPatchBytes() {
            return ((HttpRule)this.instance).getPatchBytes();
        }

        @Override
        public PatternCase getPatternCase() {
            return ((HttpRule)this.instance).getPatternCase();
        }

        @Override
        public String getPost() {
            return ((HttpRule)this.instance).getPost();
        }

        @Override
        public ByteString getPostBytes() {
            return ((HttpRule)this.instance).getPostBytes();
        }

        @Override
        public String getPut() {
            return ((HttpRule)this.instance).getPut();
        }

        @Override
        public ByteString getPutBytes() {
            return ((HttpRule)this.instance).getPutBytes();
        }

        @Override
        public String getResponseBody() {
            return ((HttpRule)this.instance).getResponseBody();
        }

        @Override
        public ByteString getResponseBodyBytes() {
            return ((HttpRule)this.instance).getResponseBodyBytes();
        }

        @Override
        public String getSelector() {
            return ((HttpRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((HttpRule)this.instance).getSelectorBytes();
        }

        @Override
        public boolean hasCustom() {
            return ((HttpRule)this.instance).hasCustom();
        }

        public Builder mergeCustom(CustomHttpPattern customHttpPattern) {
            this.copyOnWrite();
            ((HttpRule)this.instance).mergeCustom(customHttpPattern);
            return this;
        }

        public Builder removeAdditionalBindings(int n) {
            this.copyOnWrite();
            ((HttpRule)this.instance).removeAdditionalBindings(n);
            return this;
        }

        public Builder setAdditionalBindings(int n, Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setAdditionalBindings(n, (HttpRule)builder.build());
            return this;
        }

        public Builder setAdditionalBindings(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setAdditionalBindings(n, httpRule);
            return this;
        }

        public Builder setBody(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setBody(string);
            return this;
        }

        public Builder setBodyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setBodyBytes(byteString);
            return this;
        }

        public Builder setCustom(CustomHttpPattern.Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setCustom((CustomHttpPattern)builder.build());
            return this;
        }

        public Builder setCustom(CustomHttpPattern customHttpPattern) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setCustom(customHttpPattern);
            return this;
        }

        public Builder setDelete(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setDelete(string);
            return this;
        }

        public Builder setDeleteBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setDeleteBytes(byteString);
            return this;
        }

        public Builder setGet(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setGet(string);
            return this;
        }

        public Builder setGetBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setGetBytes(byteString);
            return this;
        }

        public Builder setPatch(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPatch(string);
            return this;
        }

        public Builder setPatchBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPatchBytes(byteString);
            return this;
        }

        public Builder setPost(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPost(string);
            return this;
        }

        public Builder setPostBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPostBytes(byteString);
            return this;
        }

        public Builder setPut(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPut(string);
            return this;
        }

        public Builder setPutBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPutBytes(byteString);
            return this;
        }

        public Builder setResponseBody(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setResponseBody(string);
            return this;
        }

        public Builder setResponseBodyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setResponseBodyBytes(byteString);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

