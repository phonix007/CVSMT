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

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LaunchStage;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
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

public final class MonitoredResourceDescriptor
extends GeneratedMessageLite<MonitoredResourceDescriptor, Builder>
implements MonitoredResourceDescriptorOrBuilder {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile Parser<MonitoredResourceDescriptor> PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String displayName_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = MonitoredResourceDescriptor.emptyProtobufList();
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor;
        DEFAULT_INSTANCE = monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceDescriptor.class, (GeneratedMessageLite)monitoredResourceDescriptor);
    }

    private MonitoredResourceDescriptor() {
    }

    private void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        this.ensureLabelsIsMutable();
        AbstractMessageLite.addAll(iterable, this.labels_);
    }

    private void addLabels(int n, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add(n, (Object)labelDescriptor);
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.add((Object)labelDescriptor);
    }

    private void clearDescription() {
        this.description_ = MonitoredResourceDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = MonitoredResourceDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        this.labels_ = MonitoredResourceDescriptor.emptyProtobufList();
    }

    private void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    private void clearName() {
        this.name_ = MonitoredResourceDescriptor.getDefaultInstance().getName();
    }

    private void clearType() {
        this.type_ = MonitoredResourceDescriptor.getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        Internal.ProtobufList<LabelDescriptor> protobufList = this.labels_;
        if (!protobufList.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)monitoredResourceDescriptor);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor)MonitoredResourceDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceDescriptor)MonitoredResourceDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MonitoredResourceDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLabels(int n) {
        this.ensureLabelsIsMutable();
        this.labels_.remove(n);
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        MonitoredResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setDisplayName(String string) {
        string.getClass();
        this.displayName_ = string;
    }

    private void setDisplayNameBytes(ByteString byteString) {
        MonitoredResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.displayName_ = byteString.toStringUtf8();
    }

    private void setLabels(int n, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        this.ensureLabelsIsMutable();
        this.labels_.set(n, (Object)labelDescriptor);
    }

    private void setLaunchStage(LaunchStage launchStage) {
        this.launchStage_ = launchStage.getNumber();
    }

    private void setLaunchStageValue(int n) {
        this.launchStage_ = n;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        MonitoredResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setType(String string) {
        string.getClass();
        this.type_ = string;
    }

    private void setTypeBytes(ByteString byteString) {
        MonitoredResourceDescriptor.checkByteStringIsUtf8((ByteString)byteString);
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
                Parser<MonitoredResourceDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<MonitoredResourceDescriptor> class_ = MonitoredResourceDescriptor.class;
                synchronized (MonitoredResourceDescriptor.class) {
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
                Object[] arrobject = new Object[]{"type_", "displayName_", "description_", "labels_", LabelDescriptor.class, "name_", "launchStage_"};
                return MonitoredResourceDescriptor.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u001b\u0005\u0208\u0007\f", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new MonitoredResourceDescriptor();
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
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override
    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8((String)this.displayName_);
    }

    @Override
    public LabelDescriptor getLabels(int n) {
        return (LabelDescriptor)this.labels_.get(n);
    }

    @Override
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int n) {
        return (LabelDescriptorOrBuilder)this.labels_.get(n);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override
    public LaunchStage getLaunchStage() {
        LaunchStage launchStage = LaunchStage.forNumber(this.launchStage_);
        if (launchStage == null) {
            launchStage = LaunchStage.UNRECOGNIZED;
        }
        return launchStage;
    }

    @Override
    public int getLaunchStageValue() {
        return this.launchStage_;
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
    public String getType() {
        return this.type_;
    }

    @Override
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8((String)this.type_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MonitoredResourceDescriptor, Builder>
    implements MonitoredResourceDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).addAllLabels((Iterable<? extends LabelDescriptor>)iterable);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).addLabels(n, (LabelDescriptor)builder.build());
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).addLabels(n, labelDescriptor);
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).addLabels((LabelDescriptor)builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearLabels();
            return this;
        }

        public Builder clearLaunchStage() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearLaunchStage();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).clearType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((MonitoredResourceDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((MonitoredResourceDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((MonitoredResourceDescriptor)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((MonitoredResourceDescriptor)this.instance).getDisplayNameBytes();
        }

        @Override
        public LabelDescriptor getLabels(int n) {
            return ((MonitoredResourceDescriptor)this.instance).getLabels(n);
        }

        @Override
        public int getLabelsCount() {
            return ((MonitoredResourceDescriptor)this.instance).getLabelsCount();
        }

        @Override
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MonitoredResourceDescriptor)this.instance).getLabelsList());
        }

        @Override
        public LaunchStage getLaunchStage() {
            return ((MonitoredResourceDescriptor)this.instance).getLaunchStage();
        }

        @Override
        public int getLaunchStageValue() {
            return ((MonitoredResourceDescriptor)this.instance).getLaunchStageValue();
        }

        @Override
        public String getName() {
            return ((MonitoredResourceDescriptor)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((MonitoredResourceDescriptor)this.instance).getNameBytes();
        }

        @Override
        public String getType() {
            return ((MonitoredResourceDescriptor)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((MonitoredResourceDescriptor)this.instance).getTypeBytes();
        }

        public Builder removeLabels(int n) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).removeLabels(n);
            return this;
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setDisplayName(string);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setLabels(n, (LabelDescriptor)builder.build());
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setLabels(n, labelDescriptor);
            return this;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setLaunchStage(launchStage);
            return this;
        }

        public Builder setLaunchStageValue(int n) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setLaunchStageValue(n);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(String string) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setType(string);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MonitoredResourceDescriptor)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

}

