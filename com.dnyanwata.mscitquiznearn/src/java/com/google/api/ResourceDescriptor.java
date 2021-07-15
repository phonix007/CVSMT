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
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.ResourceDescriptor;
import com.google.api.ResourceDescriptorOrBuilder;
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

public final class ResourceDescriptor
extends GeneratedMessageLite<ResourceDescriptor, Builder>
implements ResourceDescriptorOrBuilder {
    private static final ResourceDescriptor DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceDescriptor> PARSER;
    public static final int PATTERN_FIELD_NUMBER = 2;
    public static final int PLURAL_FIELD_NUMBER = 5;
    public static final int SINGULAR_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int history_;
    private String nameField_ = "";
    private Internal.ProtobufList<String> pattern_ = GeneratedMessageLite.emptyProtobufList();
    private String plural_ = "";
    private String singular_ = "";
    private String type_ = "";

    static {
        ResourceDescriptor resourceDescriptor;
        DEFAULT_INSTANCE = resourceDescriptor = new ResourceDescriptor();
        GeneratedMessageLite.registerDefaultInstance(ResourceDescriptor.class, (GeneratedMessageLite)resourceDescriptor);
    }

    private ResourceDescriptor() {
    }

    private void addAllPattern(Iterable<String> iterable) {
        this.ensurePatternIsMutable();
        AbstractMessageLite.addAll(iterable, this.pattern_);
    }

    private void addPattern(String string) {
        string.getClass();
        this.ensurePatternIsMutable();
        this.pattern_.add((Object)string);
    }

    private void addPatternBytes(ByteString byteString) {
        ResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.ensurePatternIsMutable();
        this.pattern_.add((Object)byteString.toStringUtf8());
    }

    private void clearHistory() {
        this.history_ = 0;
    }

    private void clearNameField() {
        this.nameField_ = ResourceDescriptor.getDefaultInstance().getNameField();
    }

    private void clearPattern() {
        this.pattern_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPlural() {
        this.plural_ = ResourceDescriptor.getDefaultInstance().getPlural();
    }

    private void clearSingular() {
        this.singular_ = ResourceDescriptor.getDefaultInstance().getSingular();
    }

    private void clearType() {
        this.type_ = ResourceDescriptor.getDefaultInstance().getType();
    }

    private void ensurePatternIsMutable() {
        Internal.ProtobufList<String> protobufList = this.pattern_;
        if (!protobufList.isModifiable()) {
            this.pattern_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ResourceDescriptor resourceDescriptor) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)resourceDescriptor);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor)ResourceDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor)ResourceDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ResourceDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ResourceDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHistory(History history) {
        this.history_ = history.getNumber();
    }

    private void setHistoryValue(int n) {
        this.history_ = n;
    }

    private void setNameField(String string) {
        string.getClass();
        this.nameField_ = string;
    }

    private void setNameFieldBytes(ByteString byteString) {
        ResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.nameField_ = byteString.toStringUtf8();
    }

    private void setPattern(int n, String string) {
        string.getClass();
        this.ensurePatternIsMutable();
        this.pattern_.set(n, (Object)string);
    }

    private void setPlural(String string) {
        string.getClass();
        this.plural_ = string;
    }

    private void setPluralBytes(ByteString byteString) {
        ResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.plural_ = byteString.toStringUtf8();
    }

    private void setSingular(String string) {
        string.getClass();
        this.singular_ = string;
    }

    private void setSingularBytes(ByteString byteString) {
        ResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.singular_ = byteString.toStringUtf8();
    }

    private void setType(String string) {
        string.getClass();
        this.type_ = string;
    }

    private void setTypeBytes(ByteString byteString) {
        ResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.type_ = byteString.toStringUtf8();
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
                Parser<ResourceDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ResourceDescriptor> class_ = ResourceDescriptor.class;
                synchronized (ResourceDescriptor.class) {
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
                Object[] arrobject = new Object[]{"type_", "pattern_", "nameField_", "history_", "plural_", "singular_"};
                return ResourceDescriptor.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u021a\u0003\u0208\u0004\f\u0005\u0208\u0006\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ResourceDescriptor();
    }

    @Override
    public History getHistory() {
        History history = History.forNumber(this.history_);
        if (history == null) {
            history = History.UNRECOGNIZED;
        }
        return history;
    }

    @Override
    public int getHistoryValue() {
        return this.history_;
    }

    @Override
    public String getNameField() {
        return this.nameField_;
    }

    @Override
    public ByteString getNameFieldBytes() {
        return ByteString.copyFromUtf8((String)this.nameField_);
    }

    @Override
    public String getPattern(int n) {
        return (String)this.pattern_.get(n);
    }

    @Override
    public ByteString getPatternBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.pattern_.get(n)));
    }

    @Override
    public int getPatternCount() {
        return this.pattern_.size();
    }

    @Override
    public List<String> getPatternList() {
        return this.pattern_;
    }

    @Override
    public String getPlural() {
        return this.plural_;
    }

    @Override
    public ByteString getPluralBytes() {
        return ByteString.copyFromUtf8((String)this.plural_);
    }

    @Override
    public String getSingular() {
        return this.singular_;
    }

    @Override
    public ByteString getSingularBytes() {
        return ByteString.copyFromUtf8((String)this.singular_);
    }

    @Override
    public String getType() {
        return this.type_;
    }

    @Override
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8((String)this.type_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ResourceDescriptor, Builder>
    implements ResourceDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllPattern(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).addAllPattern((Iterable<String>)iterable);
            return this;
        }

        public Builder addPattern(String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).addPattern(string);
            return this;
        }

        public Builder addPatternBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).addPatternBytes(byteString);
            return this;
        }

        public Builder clearHistory() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearHistory();
            return this;
        }

        public Builder clearNameField() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearNameField();
            return this;
        }

        public Builder clearPattern() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearPattern();
            return this;
        }

        public Builder clearPlural() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearPlural();
            return this;
        }

        public Builder clearSingular() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearSingular();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).clearType();
            return this;
        }

        @Override
        public History getHistory() {
            return ((ResourceDescriptor)this.instance).getHistory();
        }

        @Override
        public int getHistoryValue() {
            return ((ResourceDescriptor)this.instance).getHistoryValue();
        }

        @Override
        public String getNameField() {
            return ((ResourceDescriptor)this.instance).getNameField();
        }

        @Override
        public ByteString getNameFieldBytes() {
            return ((ResourceDescriptor)this.instance).getNameFieldBytes();
        }

        @Override
        public String getPattern(int n) {
            return ((ResourceDescriptor)this.instance).getPattern(n);
        }

        @Override
        public ByteString getPatternBytes(int n) {
            return ((ResourceDescriptor)this.instance).getPatternBytes(n);
        }

        @Override
        public int getPatternCount() {
            return ((ResourceDescriptor)this.instance).getPatternCount();
        }

        @Override
        public List<String> getPatternList() {
            return Collections.unmodifiableList(((ResourceDescriptor)this.instance).getPatternList());
        }

        @Override
        public String getPlural() {
            return ((ResourceDescriptor)this.instance).getPlural();
        }

        @Override
        public ByteString getPluralBytes() {
            return ((ResourceDescriptor)this.instance).getPluralBytes();
        }

        @Override
        public String getSingular() {
            return ((ResourceDescriptor)this.instance).getSingular();
        }

        @Override
        public ByteString getSingularBytes() {
            return ((ResourceDescriptor)this.instance).getSingularBytes();
        }

        @Override
        public String getType() {
            return ((ResourceDescriptor)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((ResourceDescriptor)this.instance).getTypeBytes();
        }

        public Builder setHistory(History history) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setHistory(history);
            return this;
        }

        public Builder setHistoryValue(int n) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setHistoryValue(n);
            return this;
        }

        public Builder setNameField(String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setNameField(string);
            return this;
        }

        public Builder setNameFieldBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setNameFieldBytes(byteString);
            return this;
        }

        public Builder setPattern(int n, String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setPattern(n, string);
            return this;
        }

        public Builder setPlural(String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setPlural(string);
            return this;
        }

        public Builder setPluralBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setPluralBytes(byteString);
            return this;
        }

        public Builder setSingular(String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setSingular(string);
            return this;
        }

        public Builder setSingularBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setSingularBytes(byteString);
            return this;
        }

        public Builder setType(String string) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setType(string);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceDescriptor)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

}

