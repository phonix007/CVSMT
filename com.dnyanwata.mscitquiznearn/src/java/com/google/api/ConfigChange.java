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

import com.google.api.Advice;
import com.google.api.AdviceOrBuilder;
import com.google.api.ChangeType;
import com.google.api.ConfigChange;
import com.google.api.ConfigChangeOrBuilder;
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

public final class ConfigChange
extends GeneratedMessageLite<ConfigChange, Builder>
implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigChange> PARSER;
    private Internal.ProtobufList<Advice> advices_ = ConfigChange.emptyProtobufList();
    private int changeType_;
    private String element_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";

    static {
        ConfigChange configChange;
        DEFAULT_INSTANCE = configChange = new ConfigChange();
        GeneratedMessageLite.registerDefaultInstance(ConfigChange.class, (GeneratedMessageLite)configChange);
    }

    private ConfigChange() {
    }

    private void addAdvices(int n, Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.add(n, (Object)advice);
    }

    private void addAdvices(Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.add((Object)advice);
    }

    private void addAllAdvices(Iterable<? extends Advice> iterable) {
        this.ensureAdvicesIsMutable();
        AbstractMessageLite.addAll(iterable, this.advices_);
    }

    private void clearAdvices() {
        this.advices_ = ConfigChange.emptyProtobufList();
    }

    private void clearChangeType() {
        this.changeType_ = 0;
    }

    private void clearElement() {
        this.element_ = ConfigChange.getDefaultInstance().getElement();
    }

    private void clearNewValue() {
        this.newValue_ = ConfigChange.getDefaultInstance().getNewValue();
    }

    private void clearOldValue() {
        this.oldValue_ = ConfigChange.getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        Internal.ProtobufList<Advice> protobufList = this.advices_;
        if (!protobufList.isModifiable()) {
            this.advices_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ConfigChange configChange) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange)ConfigChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)ConfigChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ConfigChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ConfigChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ConfigChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdvices(int n) {
        this.ensureAdvicesIsMutable();
        this.advices_.remove(n);
    }

    private void setAdvices(int n, Advice advice) {
        advice.getClass();
        this.ensureAdvicesIsMutable();
        this.advices_.set(n, (Object)advice);
    }

    private void setChangeType(ChangeType changeType) {
        this.changeType_ = changeType.getNumber();
    }

    private void setChangeTypeValue(int n) {
        this.changeType_ = n;
    }

    private void setElement(String string) {
        string.getClass();
        this.element_ = string;
    }

    private void setElementBytes(ByteString byteString) {
        ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
        this.element_ = byteString.toStringUtf8();
    }

    private void setNewValue(String string) {
        string.getClass();
        this.newValue_ = string;
    }

    private void setNewValueBytes(ByteString byteString) {
        ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
        this.newValue_ = byteString.toStringUtf8();
    }

    private void setOldValue(String string) {
        string.getClass();
        this.oldValue_ = string;
    }

    private void setOldValueBytes(ByteString byteString) {
        ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
        this.oldValue_ = byteString.toStringUtf8();
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
                Parser<ConfigChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ConfigChange> class_ = ConfigChange.class;
                synchronized (ConfigChange.class) {
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
                Object[] arrobject = new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class};
                return ConfigChange.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\f\u0005\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ConfigChange();
    }

    @Override
    public Advice getAdvices(int n) {
        return (Advice)this.advices_.get(n);
    }

    @Override
    public int getAdvicesCount() {
        return this.advices_.size();
    }

    @Override
    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int n) {
        return (AdviceOrBuilder)this.advices_.get(n);
    }

    public List<? extends AdviceOrBuilder> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    @Override
    public ChangeType getChangeType() {
        ChangeType changeType = ChangeType.forNumber(this.changeType_);
        if (changeType == null) {
            changeType = ChangeType.UNRECOGNIZED;
        }
        return changeType;
    }

    @Override
    public int getChangeTypeValue() {
        return this.changeType_;
    }

    @Override
    public String getElement() {
        return this.element_;
    }

    @Override
    public ByteString getElementBytes() {
        return ByteString.copyFromUtf8((String)this.element_);
    }

    @Override
    public String getNewValue() {
        return this.newValue_;
    }

    @Override
    public ByteString getNewValueBytes() {
        return ByteString.copyFromUtf8((String)this.newValue_);
    }

    @Override
    public String getOldValue() {
        return this.oldValue_;
    }

    @Override
    public ByteString getOldValueBytes() {
        return ByteString.copyFromUtf8((String)this.oldValue_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ConfigChange, Builder>
    implements ConfigChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAdvices(int n, Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(n, (Advice)builder.build());
            return this;
        }

        public Builder addAdvices(int n, Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(n, advice);
            return this;
        }

        public Builder addAdvices(Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices((Advice)builder.build());
            return this;
        }

        public Builder addAdvices(Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(advice);
            return this;
        }

        public Builder addAllAdvices(Iterable<? extends Advice> iterable) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAllAdvices((Iterable<? extends Advice>)iterable);
            return this;
        }

        public Builder clearAdvices() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearAdvices();
            return this;
        }

        public Builder clearChangeType() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearChangeType();
            return this;
        }

        public Builder clearElement() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearElement();
            return this;
        }

        public Builder clearNewValue() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearNewValue();
            return this;
        }

        public Builder clearOldValue() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearOldValue();
            return this;
        }

        @Override
        public Advice getAdvices(int n) {
            return ((ConfigChange)this.instance).getAdvices(n);
        }

        @Override
        public int getAdvicesCount() {
            return ((ConfigChange)this.instance).getAdvicesCount();
        }

        @Override
        public List<Advice> getAdvicesList() {
            return Collections.unmodifiableList(((ConfigChange)this.instance).getAdvicesList());
        }

        @Override
        public ChangeType getChangeType() {
            return ((ConfigChange)this.instance).getChangeType();
        }

        @Override
        public int getChangeTypeValue() {
            return ((ConfigChange)this.instance).getChangeTypeValue();
        }

        @Override
        public String getElement() {
            return ((ConfigChange)this.instance).getElement();
        }

        @Override
        public ByteString getElementBytes() {
            return ((ConfigChange)this.instance).getElementBytes();
        }

        @Override
        public String getNewValue() {
            return ((ConfigChange)this.instance).getNewValue();
        }

        @Override
        public ByteString getNewValueBytes() {
            return ((ConfigChange)this.instance).getNewValueBytes();
        }

        @Override
        public String getOldValue() {
            return ((ConfigChange)this.instance).getOldValue();
        }

        @Override
        public ByteString getOldValueBytes() {
            return ((ConfigChange)this.instance).getOldValueBytes();
        }

        public Builder removeAdvices(int n) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).removeAdvices(n);
            return this;
        }

        public Builder setAdvices(int n, Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setAdvices(n, (Advice)builder.build());
            return this;
        }

        public Builder setAdvices(int n, Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setAdvices(n, advice);
            return this;
        }

        public Builder setChangeType(ChangeType changeType) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setChangeType(changeType);
            return this;
        }

        public Builder setChangeTypeValue(int n) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setChangeTypeValue(n);
            return this;
        }

        public Builder setElement(String string) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setElement(string);
            return this;
        }

        public Builder setElementBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setElementBytes(byteString);
            return this;
        }

        public Builder setNewValue(String string) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setNewValue(string);
            return this;
        }

        public Builder setNewValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setNewValueBytes(byteString);
            return this;
        }

        public Builder setOldValue(String string) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setOldValue(string);
            return this;
        }

        public Builder setOldValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setOldValueBytes(byteString);
            return this;
        }
    }

}

