/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Duration
 *  com.google.protobuf.Duration$Builder
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
 *  com.google.protobuf.MessageLiteOrBuilder
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

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MetricDescriptor
extends GeneratedMessageLite<MetricDescriptor, Builder>
implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<MetricDescriptor> PARSER;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private String description_ = "";
    private String displayName_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = MetricDescriptor.emptyProtobufList();
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private String name_ = "";
    private String type_ = "";
    private String unit_ = "";
    private int valueType_;

    static {
        MetricDescriptor metricDescriptor;
        DEFAULT_INSTANCE = metricDescriptor = new MetricDescriptor();
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor.class, (GeneratedMessageLite)metricDescriptor);
    }

    private MetricDescriptor() {
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
        this.description_ = MetricDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = MetricDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        this.labels_ = MetricDescriptor.emptyProtobufList();
    }

    private void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    private void clearMetadata() {
        this.metadata_ = null;
    }

    private void clearMetricKind() {
        this.metricKind_ = 0;
    }

    private void clearName() {
        this.name_ = MetricDescriptor.getDefaultInstance().getName();
    }

    private void clearType() {
        this.type_ = MetricDescriptor.getDefaultInstance().getType();
    }

    private void clearUnit() {
        this.unit_ = MetricDescriptor.getDefaultInstance().getUnit();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        Internal.ProtobufList<LabelDescriptor> protobufList = this.labels_;
        if (!protobufList.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 != null && metricDescriptorMetadata2 != MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = (MetricDescriptorMetadata)((MetricDescriptorMetadata.Builder)MetricDescriptorMetadata.newBuilder(this.metadata_).mergeFrom((GeneratedMessageLite)metricDescriptorMetadata)).buildPartial();
            return;
        }
        this.metadata_ = metricDescriptorMetadata;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor)MetricDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)MetricDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MetricDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MetricDescriptor> parser() {
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
        MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setDisplayName(String string) {
        string.getClass();
        this.displayName_ = string;
    }

    private void setDisplayNameBytes(ByteString byteString) {
        MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
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

    private void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptorMetadata;
    }

    private void setMetricKind(MetricKind metricKind) {
        this.metricKind_ = metricKind.getNumber();
    }

    private void setMetricKindValue(int n) {
        this.metricKind_ = n;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setType(String string) {
        string.getClass();
        this.type_ = string;
    }

    private void setTypeBytes(ByteString byteString) {
        MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.type_ = byteString.toStringUtf8();
    }

    private void setUnit(String string) {
        string.getClass();
        this.unit_ = string;
    }

    private void setUnitBytes(ByteString byteString) {
        MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
        this.unit_ = byteString.toStringUtf8();
    }

    private void setValueType(ValueType valueType) {
        this.valueType_ = valueType.getNumber();
    }

    private void setValueTypeValue(int n) {
        this.valueType_ = n;
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
                Parser<MetricDescriptor> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<MetricDescriptor> class_ = MetricDescriptor.class;
                synchronized (MetricDescriptor.class) {
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
                Object[] arrobject = new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"};
                return MetricDescriptor.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001\u0208\u0002\u001b\u0003\f\u0004\f\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\n\t\f\f", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new MetricDescriptor();
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
    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        if (metricDescriptorMetadata == null) {
            metricDescriptorMetadata = MetricDescriptorMetadata.getDefaultInstance();
        }
        return metricDescriptorMetadata;
    }

    @Override
    public MetricKind getMetricKind() {
        MetricKind metricKind = MetricKind.forNumber(this.metricKind_);
        if (metricKind == null) {
            metricKind = MetricKind.UNRECOGNIZED;
        }
        return metricKind;
    }

    @Override
    public int getMetricKindValue() {
        return this.metricKind_;
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

    @Override
    public String getUnit() {
        return this.unit_;
    }

    @Override
    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8((String)this.unit_);
    }

    @Override
    public ValueType getValueType() {
        ValueType valueType = ValueType.forNumber(this.valueType_);
        if (valueType == null) {
            valueType = ValueType.UNRECOGNIZED;
        }
        return valueType;
    }

    @Override
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override
    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MetricDescriptor, Builder>
    implements MetricDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addAllLabels((Iterable<? extends LabelDescriptor>)iterable);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(n, (LabelDescriptor)builder.build());
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(n, labelDescriptor);
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels((LabelDescriptor)builder.build());
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearLabels();
            return this;
        }

        public Builder clearLaunchStage() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearLaunchStage();
            return this;
        }

        public Builder clearMetadata() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearMetadata();
            return this;
        }

        public Builder clearMetricKind() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearMetricKind();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearType();
            return this;
        }

        public Builder clearUnit() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearUnit();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearValueType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((MetricDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((MetricDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((MetricDescriptor)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((MetricDescriptor)this.instance).getDisplayNameBytes();
        }

        @Override
        public LabelDescriptor getLabels(int n) {
            return ((MetricDescriptor)this.instance).getLabels(n);
        }

        @Override
        public int getLabelsCount() {
            return ((MetricDescriptor)this.instance).getLabelsCount();
        }

        @Override
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MetricDescriptor)this.instance).getLabelsList());
        }

        @Override
        public LaunchStage getLaunchStage() {
            return ((MetricDescriptor)this.instance).getLaunchStage();
        }

        @Override
        public int getLaunchStageValue() {
            return ((MetricDescriptor)this.instance).getLaunchStageValue();
        }

        @Override
        public MetricDescriptorMetadata getMetadata() {
            return ((MetricDescriptor)this.instance).getMetadata();
        }

        @Override
        public MetricKind getMetricKind() {
            return ((MetricDescriptor)this.instance).getMetricKind();
        }

        @Override
        public int getMetricKindValue() {
            return ((MetricDescriptor)this.instance).getMetricKindValue();
        }

        @Override
        public String getName() {
            return ((MetricDescriptor)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((MetricDescriptor)this.instance).getNameBytes();
        }

        @Override
        public String getType() {
            return ((MetricDescriptor)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((MetricDescriptor)this.instance).getTypeBytes();
        }

        @Override
        public String getUnit() {
            return ((MetricDescriptor)this.instance).getUnit();
        }

        @Override
        public ByteString getUnitBytes() {
            return ((MetricDescriptor)this.instance).getUnitBytes();
        }

        @Override
        public ValueType getValueType() {
            return ((MetricDescriptor)this.instance).getValueType();
        }

        @Override
        public int getValueTypeValue() {
            return ((MetricDescriptor)this.instance).getValueTypeValue();
        }

        @Override
        public boolean hasMetadata() {
            return ((MetricDescriptor)this.instance).hasMetadata();
        }

        public Builder mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).mergeMetadata(metricDescriptorMetadata);
            return this;
        }

        public Builder removeLabels(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).removeLabels(n);
            return this;
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDisplayName(string);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLabels(n, (LabelDescriptor)builder.build());
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLabels(n, labelDescriptor);
            return this;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLaunchStage(launchStage);
            return this;
        }

        public Builder setLaunchStageValue(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLaunchStageValue(n);
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetadata((MetricDescriptorMetadata)builder.build());
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetadata(metricDescriptorMetadata);
            return this;
        }

        public Builder setMetricKind(MetricKind metricKind) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetricKind(metricKind);
            return this;
        }

        public Builder setMetricKindValue(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetricKindValue(n);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(String string) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setType(string);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setTypeBytes(byteString);
            return this;
        }

        public Builder setUnit(String string) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setUnit(string);
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setUnitBytes(byteString);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setValueTypeValue(n);
            return this;
        }
    }

    public static final class MetricDescriptorMetadata
    extends GeneratedMessageLite<MetricDescriptorMetadata, Builder>
    implements MetricDescriptorMetadataOrBuilder {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile Parser<MetricDescriptorMetadata> PARSER;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        static {
            MetricDescriptorMetadata metricDescriptorMetadata;
            DEFAULT_INSTANCE = metricDescriptorMetadata = new MetricDescriptorMetadata();
            GeneratedMessageLite.registerDefaultInstance(MetricDescriptorMetadata.class, (GeneratedMessageLite)metricDescriptorMetadata);
        }

        private MetricDescriptorMetadata() {
        }

        private void clearIngestDelay() {
            this.ingestDelay_ = null;
        }

        private void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        private void clearSamplePeriod() {
            this.samplePeriod_ = null;
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeIngestDelay(Duration duration) {
            duration.getClass();
            Duration duration2 = this.ingestDelay_;
            if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
                this.ingestDelay_ = (Duration)((Duration.Builder)Duration.newBuilder((Duration)this.ingestDelay_).mergeFrom((GeneratedMessageLite)duration)).buildPartial();
                return;
            }
            this.ingestDelay_ = duration;
        }

        private void mergeSamplePeriod(Duration duration) {
            duration.getClass();
            Duration duration2 = this.samplePeriod_;
            if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
                this.samplePeriod_ = (Duration)((Duration.Builder)Duration.newBuilder((Duration)this.samplePeriod_).mergeFrom((GeneratedMessageLite)duration)).buildPartial();
                return;
            }
            this.samplePeriod_ = duration;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata)MetricDescriptorMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata)MetricDescriptorMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MetricDescriptorMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<MetricDescriptorMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIngestDelay(Duration duration) {
            duration.getClass();
            this.ingestDelay_ = duration;
        }

        private void setLaunchStage(LaunchStage launchStage) {
            this.launchStage_ = launchStage.getNumber();
        }

        private void setLaunchStageValue(int n) {
            this.launchStage_ = n;
        }

        private void setSamplePeriod(Duration duration) {
            duration.getClass();
            this.samplePeriod_ = duration;
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
                    Parser<MetricDescriptorMetadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<MetricDescriptorMetadata> class_ = MetricDescriptorMetadata.class;
                    synchronized (MetricDescriptorMetadata.class) {
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
                    Object[] arrobject = new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"};
                    return MetricDescriptorMetadata.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new MetricDescriptorMetadata();
        }

        @Override
        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            if (duration == null) {
                duration = Duration.getDefaultInstance();
            }
            return duration;
        }

        @Deprecated
        @Override
        public LaunchStage getLaunchStage() {
            LaunchStage launchStage = LaunchStage.forNumber(this.launchStage_);
            if (launchStage == null) {
                launchStage = LaunchStage.UNRECOGNIZED;
            }
            return launchStage;
        }

        @Deprecated
        @Override
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Override
        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            if (duration == null) {
                duration = Duration.getDefaultInstance();
            }
            return duration;
        }

        @Override
        public boolean hasIngestDelay() {
            return this.ingestDelay_ != null;
        }

        @Override
        public boolean hasSamplePeriod() {
            return this.samplePeriod_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<MetricDescriptorMetadata, Builder>
        implements MetricDescriptorMetadataOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearIngestDelay() {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).clearIngestDelay();
                return this;
            }

            @Deprecated
            public Builder clearLaunchStage() {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).clearLaunchStage();
                return this;
            }

            public Builder clearSamplePeriod() {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).clearSamplePeriod();
                return this;
            }

            @Override
            public Duration getIngestDelay() {
                return ((MetricDescriptorMetadata)this.instance).getIngestDelay();
            }

            @Deprecated
            @Override
            public LaunchStage getLaunchStage() {
                return ((MetricDescriptorMetadata)this.instance).getLaunchStage();
            }

            @Deprecated
            @Override
            public int getLaunchStageValue() {
                return ((MetricDescriptorMetadata)this.instance).getLaunchStageValue();
            }

            @Override
            public Duration getSamplePeriod() {
                return ((MetricDescriptorMetadata)this.instance).getSamplePeriod();
            }

            @Override
            public boolean hasIngestDelay() {
                return ((MetricDescriptorMetadata)this.instance).hasIngestDelay();
            }

            @Override
            public boolean hasSamplePeriod() {
                return ((MetricDescriptorMetadata)this.instance).hasSamplePeriod();
            }

            public Builder mergeIngestDelay(Duration duration) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).mergeIngestDelay(duration);
                return this;
            }

            public Builder mergeSamplePeriod(Duration duration) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).mergeSamplePeriod(duration);
                return this;
            }

            public Builder setIngestDelay(Duration.Builder builder) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setIngestDelay((Duration)builder.build());
                return this;
            }

            public Builder setIngestDelay(Duration duration) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setIngestDelay(duration);
                return this;
            }

            @Deprecated
            public Builder setLaunchStage(LaunchStage launchStage) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setLaunchStage(launchStage);
                return this;
            }

            @Deprecated
            public Builder setLaunchStageValue(int n) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setLaunchStageValue(n);
                return this;
            }

            public Builder setSamplePeriod(Duration.Builder builder) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setSamplePeriod((Duration)builder.build());
                return this;
            }

            public Builder setSamplePeriod(Duration duration) {
                this.copyOnWrite();
                ((MetricDescriptorMetadata)this.instance).setSamplePeriod(duration);
                return this;
            }
        }

    }

}

