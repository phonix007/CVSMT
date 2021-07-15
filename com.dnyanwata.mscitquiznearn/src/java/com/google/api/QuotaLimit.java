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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.api;

import com.google.api.QuotaLimit;
import com.google.api.QuotaLimitOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class QuotaLimit
extends GeneratedMessageLite<QuotaLimit, Builder>
implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile Parser<QuotaLimit> PARSER;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private String description_ = "";
    private String displayName_ = "";
    private String duration_ = "";
    private long freeTier_;
    private long maxLimit_;
    private String metric_ = "";
    private String name_ = "";
    private String unit_ = "";
    private MapFieldLite<String, Long> values_ = MapFieldLite.emptyMapField();

    static {
        QuotaLimit quotaLimit;
        DEFAULT_INSTANCE = quotaLimit = new QuotaLimit();
        GeneratedMessageLite.registerDefaultInstance(QuotaLimit.class, (GeneratedMessageLite)quotaLimit);
    }

    private QuotaLimit() {
    }

    private void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    private void clearDescription() {
        this.description_ = QuotaLimit.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = QuotaLimit.getDefaultInstance().getDisplayName();
    }

    private void clearDuration() {
        this.duration_ = QuotaLimit.getDefaultInstance().getDuration();
    }

    private void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    private void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    private void clearMetric() {
        this.metric_ = QuotaLimit.getDefaultInstance().getMetric();
    }

    private void clearName() {
        this.name_ = QuotaLimit.getDefaultInstance().getName();
    }

    private void clearUnit() {
        this.unit_ = QuotaLimit.getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Long> getMutableValuesMap() {
        return this.internalGetMutableValues();
    }

    private MapFieldLite<String, Long> internalGetMutableValues() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite<String, Long> internalGetValues() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(QuotaLimit quotaLimit) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit)QuotaLimit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)QuotaLimit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static QuotaLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static QuotaLimit parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<QuotaLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefaultLimit(long l) {
        this.defaultLimit_ = l;
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setDisplayName(String string) {
        string.getClass();
        this.displayName_ = string;
    }

    private void setDisplayNameBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.displayName_ = byteString.toStringUtf8();
    }

    private void setDuration(String string) {
        string.getClass();
        this.duration_ = string;
    }

    private void setDurationBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.duration_ = byteString.toStringUtf8();
    }

    private void setFreeTier(long l) {
        this.freeTier_ = l;
    }

    private void setMaxLimit(long l) {
        this.maxLimit_ = l;
    }

    private void setMetric(String string) {
        string.getClass();
        this.metric_ = string;
    }

    private void setMetricBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.metric_ = byteString.toStringUtf8();
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setUnit(String string) {
        string.getClass();
        this.unit_ = string;
    }

    private void setUnitBytes(ByteString byteString) {
        QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
        this.unit_ = byteString.toStringUtf8();
    }

    @Override
    public boolean containsValues(String string) {
        string.getClass();
        return this.internalGetValues().containsKey((Object)string);
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
                Parser<QuotaLimit> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<QuotaLimit> class_ = QuotaLimit.class;
                synchronized (QuotaLimit.class) {
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
                Object[] arrobject = new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", ValuesDefaultEntryHolder.defaultEntry, "displayName_"};
                return QuotaLimit.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002\u0208\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0208\u0007\u0002\b\u0208\t\u0208\n2\f\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new QuotaLimit();
    }

    @Override
    public long getDefaultLimit() {
        return this.defaultLimit_;
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
    public String getDuration() {
        return this.duration_;
    }

    @Override
    public ByteString getDurationBytes() {
        return ByteString.copyFromUtf8((String)this.duration_);
    }

    @Override
    public long getFreeTier() {
        return this.freeTier_;
    }

    @Override
    public long getMaxLimit() {
        return this.maxLimit_;
    }

    @Override
    public String getMetric() {
        return this.metric_;
    }

    @Override
    public ByteString getMetricBytes() {
        return ByteString.copyFromUtf8((String)this.metric_);
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
    public String getUnit() {
        return this.unit_;
    }

    @Override
    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8((String)this.unit_);
    }

    @Deprecated
    @Override
    public Map<String, Long> getValues() {
        return this.getValuesMap();
    }

    @Override
    public int getValuesCount() {
        return this.internalGetValues().size();
    }

    @Override
    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(this.internalGetValues());
    }

    @Override
    public long getValuesOrDefault(String string, long l) {
        string.getClass();
        MapFieldLite<String, Long> mapFieldLite = this.internalGetValues();
        if (mapFieldLite.containsKey((Object)string)) {
            l = (Long)mapFieldLite.get((Object)string);
        }
        return l;
    }

    @Override
    public long getValuesOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, Long> mapFieldLite = this.internalGetValues();
        if (mapFieldLite.containsKey((Object)string)) {
            return (Long)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<QuotaLimit, Builder>
    implements QuotaLimitOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDefaultLimit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDefaultLimit();
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearDuration() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDuration();
            return this;
        }

        public Builder clearFreeTier() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearFreeTier();
            return this;
        }

        public Builder clearMaxLimit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearMaxLimit();
            return this;
        }

        public Builder clearMetric() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearMetric();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearName();
            return this;
        }

        public Builder clearUnit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearUnit();
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().clear();
            return this;
        }

        @Override
        public boolean containsValues(String string) {
            string.getClass();
            return ((QuotaLimit)this.instance).getValuesMap().containsKey((Object)string);
        }

        @Override
        public long getDefaultLimit() {
            return ((QuotaLimit)this.instance).getDefaultLimit();
        }

        @Override
        public String getDescription() {
            return ((QuotaLimit)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((QuotaLimit)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((QuotaLimit)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((QuotaLimit)this.instance).getDisplayNameBytes();
        }

        @Override
        public String getDuration() {
            return ((QuotaLimit)this.instance).getDuration();
        }

        @Override
        public ByteString getDurationBytes() {
            return ((QuotaLimit)this.instance).getDurationBytes();
        }

        @Override
        public long getFreeTier() {
            return ((QuotaLimit)this.instance).getFreeTier();
        }

        @Override
        public long getMaxLimit() {
            return ((QuotaLimit)this.instance).getMaxLimit();
        }

        @Override
        public String getMetric() {
            return ((QuotaLimit)this.instance).getMetric();
        }

        @Override
        public ByteString getMetricBytes() {
            return ((QuotaLimit)this.instance).getMetricBytes();
        }

        @Override
        public String getName() {
            return ((QuotaLimit)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((QuotaLimit)this.instance).getNameBytes();
        }

        @Override
        public String getUnit() {
            return ((QuotaLimit)this.instance).getUnit();
        }

        @Override
        public ByteString getUnitBytes() {
            return ((QuotaLimit)this.instance).getUnitBytes();
        }

        @Deprecated
        @Override
        public Map<String, Long> getValues() {
            return this.getValuesMap();
        }

        @Override
        public int getValuesCount() {
            return ((QuotaLimit)this.instance).getValuesMap().size();
        }

        @Override
        public Map<String, Long> getValuesMap() {
            return Collections.unmodifiableMap(((QuotaLimit)this.instance).getValuesMap());
        }

        @Override
        public long getValuesOrDefault(String string, long l) {
            string.getClass();
            Map<String, Long> map = ((QuotaLimit)this.instance).getValuesMap();
            if (map.containsKey((Object)string)) {
                l = (Long)map.get((Object)string);
            }
            return l;
        }

        @Override
        public long getValuesOrThrow(String string) {
            string.getClass();
            Map<String, Long> map = ((QuotaLimit)this.instance).getValuesMap();
            if (map.containsKey((Object)string)) {
                return (Long)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllValues(Map<String, Long> map) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().putAll(map);
            return this;
        }

        public Builder putValues(String string, long l) {
            string.getClass();
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().put((Object)string, (Object)l);
            return this;
        }

        public Builder removeValues(String string) {
            string.getClass();
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().remove((Object)string);
            return this;
        }

        public Builder setDefaultLimit(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDefaultLimit(l);
            return this;
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDisplayName(string);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setDuration(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDuration(string);
            return this;
        }

        public Builder setDurationBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDurationBytes(byteString);
            return this;
        }

        public Builder setFreeTier(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setFreeTier(l);
            return this;
        }

        public Builder setMaxLimit(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMaxLimit(l);
            return this;
        }

        public Builder setMetric(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMetric(string);
            return this;
        }

        public Builder setMetricBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMetricBytes(byteString);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUnit(String string) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setUnit(string);
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setUnitBytes(byteString);
            return this;
        }
    }

}

