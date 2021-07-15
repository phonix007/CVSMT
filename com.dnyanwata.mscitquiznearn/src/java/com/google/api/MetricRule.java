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

import com.google.api.MetricRule;
import com.google.api.MetricRuleOrBuilder;
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

public final class MetricRule
extends GeneratedMessageLite<MetricRule, Builder>
implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private MapFieldLite<String, Long> metricCosts_ = MapFieldLite.emptyMapField();
    private String selector_ = "";

    static {
        MetricRule metricRule;
        DEFAULT_INSTANCE = metricRule = new MetricRule();
        GeneratedMessageLite.registerDefaultInstance(MetricRule.class, (GeneratedMessageLite)metricRule);
    }

    private MetricRule() {
    }

    private void clearSelector() {
        this.selector_ = MetricRule.getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Long> getMutableMetricCostsMap() {
        return this.internalGetMutableMetricCosts();
    }

    private MapFieldLite<String, Long> internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private MapFieldLite<String, Long> internalGetMutableMetricCosts() {
        if (!this.metricCosts_.isMutable()) {
            this.metricCosts_ = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(MetricRule metricRule) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricRule)MetricRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)MetricRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MetricRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(InputStream inputStream) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MetricRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MetricRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSelector(String string) {
        string.getClass();
        this.selector_ = string;
    }

    private void setSelectorBytes(ByteString byteString) {
        MetricRule.checkByteStringIsUtf8((ByteString)byteString);
        this.selector_ = byteString.toStringUtf8();
    }

    @Override
    public boolean containsMetricCosts(String string) {
        string.getClass();
        return this.internalGetMetricCosts().containsKey((Object)string);
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
                Parser<MetricRule> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<MetricRule> class_ = MetricRule.class;
                synchronized (MetricRule.class) {
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
                Object[] arrobject = new Object[]{"selector_", "metricCosts_", MetricCostsDefaultEntryHolder.defaultEntry};
                return MetricRule.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0208\u00022", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new MetricRule();
    }

    @Deprecated
    @Override
    public Map<String, Long> getMetricCosts() {
        return this.getMetricCostsMap();
    }

    @Override
    public int getMetricCostsCount() {
        return this.internalGetMetricCosts().size();
    }

    @Override
    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(this.internalGetMetricCosts());
    }

    @Override
    public long getMetricCostsOrDefault(String string, long l) {
        string.getClass();
        MapFieldLite<String, Long> mapFieldLite = this.internalGetMetricCosts();
        if (mapFieldLite.containsKey((Object)string)) {
            l = (Long)mapFieldLite.get((Object)string);
        }
        return l;
    }

    @Override
    public long getMetricCostsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, Long> mapFieldLite = this.internalGetMetricCosts();
        if (mapFieldLite.containsKey((Object)string)) {
            return (Long)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
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
    extends GeneratedMessageLite.Builder<MetricRule, Builder>
    implements MetricRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearMetricCosts() {
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().clear();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((MetricRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public boolean containsMetricCosts(String string) {
            string.getClass();
            return ((MetricRule)this.instance).getMetricCostsMap().containsKey((Object)string);
        }

        @Deprecated
        @Override
        public Map<String, Long> getMetricCosts() {
            return this.getMetricCostsMap();
        }

        @Override
        public int getMetricCostsCount() {
            return ((MetricRule)this.instance).getMetricCostsMap().size();
        }

        @Override
        public Map<String, Long> getMetricCostsMap() {
            return Collections.unmodifiableMap(((MetricRule)this.instance).getMetricCostsMap());
        }

        @Override
        public long getMetricCostsOrDefault(String string, long l) {
            string.getClass();
            Map<String, Long> map = ((MetricRule)this.instance).getMetricCostsMap();
            if (map.containsKey((Object)string)) {
                l = (Long)map.get((Object)string);
            }
            return l;
        }

        @Override
        public long getMetricCostsOrThrow(String string) {
            string.getClass();
            Map<String, Long> map = ((MetricRule)this.instance).getMetricCostsMap();
            if (map.containsKey((Object)string)) {
                return (Long)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public String getSelector() {
            return ((MetricRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((MetricRule)this.instance).getSelectorBytes();
        }

        public Builder putAllMetricCosts(Map<String, Long> map) {
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().putAll(map);
            return this;
        }

        public Builder putMetricCosts(String string, long l) {
            string.getClass();
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().put((Object)string, (Object)l);
            return this;
        }

        public Builder removeMetricCosts(String string) {
            string.getClass();
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().remove((Object)string);
            return this;
        }

        public Builder setSelector(String string) {
            this.copyOnWrite();
            ((MetricRule)this.instance).setSelector(string);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

