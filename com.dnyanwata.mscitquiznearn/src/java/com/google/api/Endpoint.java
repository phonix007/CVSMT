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
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.Endpoint;
import com.google.api.EndpointOrBuilder;
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

public final class Endpoint
extends GeneratedMessageLite<Endpoint, Builder>
implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Endpoint> PARSER;
    public static final int TARGET_FIELD_NUMBER = 101;
    private Internal.ProtobufList<String> aliases_ = GeneratedMessageLite.emptyProtobufList();
    private boolean allowCors_;
    private Internal.ProtobufList<String> features_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private String target_ = "";

    static {
        Endpoint endpoint;
        DEFAULT_INSTANCE = endpoint = new Endpoint();
        GeneratedMessageLite.registerDefaultInstance(Endpoint.class, (GeneratedMessageLite)endpoint);
    }

    private Endpoint() {
    }

    private void addAliases(String string) {
        string.getClass();
        this.ensureAliasesIsMutable();
        this.aliases_.add((Object)string);
    }

    private void addAliasesBytes(ByteString byteString) {
        Endpoint.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureAliasesIsMutable();
        this.aliases_.add((Object)byteString.toStringUtf8());
    }

    private void addAllAliases(Iterable<String> iterable) {
        this.ensureAliasesIsMutable();
        AbstractMessageLite.addAll(iterable, this.aliases_);
    }

    private void addAllFeatures(Iterable<String> iterable) {
        this.ensureFeaturesIsMutable();
        AbstractMessageLite.addAll(iterable, this.features_);
    }

    private void addFeatures(String string) {
        string.getClass();
        this.ensureFeaturesIsMutable();
        this.features_.add((Object)string);
    }

    private void addFeaturesBytes(ByteString byteString) {
        Endpoint.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureFeaturesIsMutable();
        this.features_.add((Object)byteString.toStringUtf8());
    }

    private void clearAliases() {
        this.aliases_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAllowCors() {
        this.allowCors_ = false;
    }

    private void clearFeatures() {
        this.features_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = Endpoint.getDefaultInstance().getName();
    }

    private void clearTarget() {
        this.target_ = Endpoint.getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.aliases_;
        if (!protobufList.isModifiable()) {
            this.aliases_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureFeaturesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.features_;
        if (!protobufList.isModifiable()) {
            this.features_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Endpoint endpoint) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Endpoint)Endpoint.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)Endpoint.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Endpoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Endpoint parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Endpoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAliases(int n, String string) {
        string.getClass();
        this.ensureAliasesIsMutable();
        this.aliases_.set(n, (Object)string);
    }

    private void setAllowCors(boolean bl) {
        this.allowCors_ = bl;
    }

    private void setFeatures(int n, String string) {
        string.getClass();
        this.ensureFeaturesIsMutable();
        this.features_.set(n, (Object)string);
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        Endpoint.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setTarget(String string) {
        string.getClass();
        this.target_ = string;
    }

    private void setTargetBytes(ByteString byteString) {
        Endpoint.checkByteStringIsUtf8((ByteString)byteString);
        this.target_ = byteString.toStringUtf8();
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
                Parser<Endpoint> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Endpoint> class_ = Endpoint.class;
                synchronized (Endpoint.class) {
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
                Object[] arrobject = new Object[]{"name_", "aliases_", "features_", "allowCors_", "target_"};
                return Endpoint.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001e\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u021a\u0004\u021a\u0005\u0007e\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Endpoint();
    }

    @Deprecated
    @Override
    public String getAliases(int n) {
        return (String)this.aliases_.get(n);
    }

    @Deprecated
    @Override
    public ByteString getAliasesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.aliases_.get(n)));
    }

    @Deprecated
    @Override
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Deprecated
    @Override
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    @Override
    public boolean getAllowCors() {
        return this.allowCors_;
    }

    @Override
    public String getFeatures(int n) {
        return (String)this.features_.get(n);
    }

    @Override
    public ByteString getFeaturesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.features_.get(n)));
    }

    @Override
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override
    public List<String> getFeaturesList() {
        return this.features_;
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
    public String getTarget() {
        return this.target_;
    }

    @Override
    public ByteString getTargetBytes() {
        return ByteString.copyFromUtf8((String)this.target_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Endpoint, Builder>
    implements EndpointOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        @Deprecated
        public Builder addAliases(String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAliases(string);
            return this;
        }

        @Deprecated
        public Builder addAliasesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAliasesBytes(byteString);
            return this;
        }

        @Deprecated
        public Builder addAllAliases(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAllAliases((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllFeatures(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAllFeatures((Iterable<String>)iterable);
            return this;
        }

        public Builder addFeatures(String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addFeatures(string);
            return this;
        }

        public Builder addFeaturesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addFeaturesBytes(byteString);
            return this;
        }

        @Deprecated
        public Builder clearAliases() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearAliases();
            return this;
        }

        public Builder clearAllowCors() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearAllowCors();
            return this;
        }

        public Builder clearFeatures() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearFeatures();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearName();
            return this;
        }

        public Builder clearTarget() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearTarget();
            return this;
        }

        @Deprecated
        @Override
        public String getAliases(int n) {
            return ((Endpoint)this.instance).getAliases(n);
        }

        @Deprecated
        @Override
        public ByteString getAliasesBytes(int n) {
            return ((Endpoint)this.instance).getAliasesBytes(n);
        }

        @Deprecated
        @Override
        public int getAliasesCount() {
            return ((Endpoint)this.instance).getAliasesCount();
        }

        @Deprecated
        @Override
        public List<String> getAliasesList() {
            return Collections.unmodifiableList(((Endpoint)this.instance).getAliasesList());
        }

        @Override
        public boolean getAllowCors() {
            return ((Endpoint)this.instance).getAllowCors();
        }

        @Override
        public String getFeatures(int n) {
            return ((Endpoint)this.instance).getFeatures(n);
        }

        @Override
        public ByteString getFeaturesBytes(int n) {
            return ((Endpoint)this.instance).getFeaturesBytes(n);
        }

        @Override
        public int getFeaturesCount() {
            return ((Endpoint)this.instance).getFeaturesCount();
        }

        @Override
        public List<String> getFeaturesList() {
            return Collections.unmodifiableList(((Endpoint)this.instance).getFeaturesList());
        }

        @Override
        public String getName() {
            return ((Endpoint)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Endpoint)this.instance).getNameBytes();
        }

        @Override
        public String getTarget() {
            return ((Endpoint)this.instance).getTarget();
        }

        @Override
        public ByteString getTargetBytes() {
            return ((Endpoint)this.instance).getTargetBytes();
        }

        @Deprecated
        public Builder setAliases(int n, String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setAliases(n, string);
            return this;
        }

        public Builder setAllowCors(boolean bl) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setAllowCors(bl);
            return this;
        }

        public Builder setFeatures(int n, String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setFeatures(n, string);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setTarget(String string) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setTarget(string);
            return this;
        }

        public Builder setTargetBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setTargetBytes(byteString);
            return this;
        }
    }

}

