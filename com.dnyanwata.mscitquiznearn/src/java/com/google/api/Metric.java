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
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.api;

import com.google.api.Metric;
import com.google.api.MetricOrBuilder;
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

public final class Metric
extends GeneratedMessageLite<Metric, Builder>
implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<Metric> PARSER;
    public static final int TYPE_FIELD_NUMBER = 3;
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String type_ = "";

    static {
        Metric metric;
        DEFAULT_INSTANCE = metric = new Metric();
        GeneratedMessageLite.registerDefaultInstance(Metric.class, (GeneratedMessageLite)metric);
    }

    private Metric() {
    }

    private void clearType() {
        this.type_ = Metric.getDefaultInstance().getType();
    }

    public static Metric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite<String, String> internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Metric metric) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)metric);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric)Metric.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)Metric.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Metric parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Metric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setType(String string) {
        string.getClass();
        this.type_ = string;
    }

    private void setTypeBytes(ByteString byteString) {
        Metric.checkByteStringIsUtf8((ByteString)byteString);
        this.type_ = byteString.toStringUtf8();
    }

    @Override
    public boolean containsLabels(String string) {
        string.getClass();
        return this.internalGetLabels().containsKey((Object)string);
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
                Parser<Metric> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Metric> class_ = Metric.class;
                synchronized (Metric.class) {
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
                Object[] arrobject = new Object[]{"labels_", LabelsDefaultEntryHolder.defaultEntry, "type_"};
                return Metric.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Metric();
    }

    @Deprecated
    @Override
    public Map<String, String> getLabels() {
        return this.getLabelsMap();
    }

    @Override
    public int getLabelsCount() {
        return this.internalGetLabels().size();
    }

    @Override
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    @Override
    public String getLabelsOrDefault(String string, String string2) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            string2 = (String)mapFieldLite.get((Object)string);
        }
        return string2;
    }

    @Override
    public String getLabelsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            return (String)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
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
    extends GeneratedMessageLite.Builder<Metric, Builder>
    implements MetricOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((Metric)this.instance).clearType();
            return this;
        }

        @Override
        public boolean containsLabels(String string) {
            string.getClass();
            return ((Metric)this.instance).getLabelsMap().containsKey((Object)string);
        }

        @Deprecated
        @Override
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        @Override
        public int getLabelsCount() {
            return ((Metric)this.instance).getLabelsMap().size();
        }

        @Override
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((Metric)this.instance).getLabelsMap());
        }

        @Override
        public String getLabelsOrDefault(String string, String string2) {
            string.getClass();
            Map<String, String> map = ((Metric)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                string2 = (String)map.get((Object)string);
            }
            return string2;
        }

        @Override
        public String getLabelsOrThrow(String string) {
            string.getClass();
            Map<String, String> map = ((Metric)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                return (String)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public String getType() {
            return ((Metric)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((Metric)this.instance).getTypeBytes();
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string, String string2) {
            string.getClass();
            string2.getClass();
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
            return this;
        }

        public Builder removeLabels(String string) {
            string.getClass();
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().remove((Object)string);
            return this;
        }

        public Builder setType(String string) {
            this.copyOnWrite();
            ((Metric)this.instance).setType(string);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Metric)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

}

