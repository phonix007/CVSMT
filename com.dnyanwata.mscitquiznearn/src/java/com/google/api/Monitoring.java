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
 *  com.google.protobuf.MessageLiteOrBuilder
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

import com.google.api.Monitoring;
import com.google.api.MonitoringOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
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

public final class Monitoring
extends GeneratedMessageLite<Monitoring, Builder>
implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile Parser<Monitoring> PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<MonitoringDestination> consumerDestinations_ = Monitoring.emptyProtobufList();
    private Internal.ProtobufList<MonitoringDestination> producerDestinations_ = Monitoring.emptyProtobufList();

    static {
        Monitoring monitoring;
        DEFAULT_INSTANCE = monitoring = new Monitoring();
        GeneratedMessageLite.registerDefaultInstance(Monitoring.class, (GeneratedMessageLite)monitoring);
    }

    private Monitoring() {
    }

    private void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        this.ensureProducerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.producerDestinations_);
    }

    private void addConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)monitoringDestination);
    }

    private void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)monitoringDestination);
    }

    private void addProducerDestinations(int n, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n, (Object)monitoringDestination);
    }

    private void addProducerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add((Object)monitoringDestination);
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Monitoring.emptyProtobufList();
    }

    private void clearProducerDestinations() {
        this.producerDestinations_ = Monitoring.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal.ProtobufList<MonitoringDestination> protobufList = this.consumerDestinations_;
        if (!protobufList.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        Internal.ProtobufList<MonitoringDestination> protobufList = this.producerDestinations_;
        if (!protobufList.isModifiable()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Monitoring monitoring) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitoring)Monitoring.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)Monitoring.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Monitoring parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Monitoring parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Monitoring> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n);
    }

    private void removeProducerDestinations(int n) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(n);
    }

    private void setConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)monitoringDestination);
    }

    private void setProducerDestinations(int n, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n, (Object)monitoringDestination);
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
                Parser<Monitoring> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Monitoring> class_ = Monitoring.class;
                synchronized (Monitoring.class) {
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
                Object[] arrobject = new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class};
                return Monitoring.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Monitoring();
    }

    @Override
    public MonitoringDestination getConsumerDestinations(int n) {
        return (MonitoringDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return this.consumerDestinations_.get(n);
    }

    public List<? extends MonitoringDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override
    public MonitoringDestination getProducerDestinations(int n) {
        return (MonitoringDestination)this.producerDestinations_.get(n);
    }

    @Override
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override
    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int n) {
        return this.producerDestinations_.get(n);
    }

    public List<? extends MonitoringDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Monitoring, Builder>
    implements MonitoringOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addAllConsumerDestinations((Iterable<? extends MonitoringDestination>)iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addAllProducerDestinations((Iterable<? extends MonitoringDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(n, (MonitoringDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations((MonitoringDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(n, (MonitoringDestination)builder.build());
            return this;
        }

        public Builder addProducerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations((MonitoringDestination)builder.build());
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(monitoringDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Monitoring)this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            this.copyOnWrite();
            ((Monitoring)this.instance).clearProducerDestinations();
            return this;
        }

        @Override
        public MonitoringDestination getConsumerDestinations(int n) {
            return ((Monitoring)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Monitoring)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<MonitoringDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring)this.instance).getConsumerDestinationsList());
        }

        @Override
        public MonitoringDestination getProducerDestinations(int n) {
            return ((Monitoring)this.instance).getProducerDestinations(n);
        }

        @Override
        public int getProducerDestinationsCount() {
            return ((Monitoring)this.instance).getProducerDestinationsCount();
        }

        @Override
        public List<MonitoringDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring)this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Monitoring)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder removeProducerDestinations(int n) {
            this.copyOnWrite();
            ((Monitoring)this.instance).removeProducerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setConsumerDestinations(n, (MonitoringDestination)builder.build());
            return this;
        }

        public Builder setConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setConsumerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder setProducerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setProducerDestinations(n, (MonitoringDestination)builder.build());
            return this;
        }

        public Builder setProducerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setProducerDestinations(n, monitoringDestination);
            return this;
        }
    }

    public static final class MonitoringDestination
    extends GeneratedMessageLite<MonitoringDestination, Builder>
    implements MonitoringDestinationOrBuilder {
        private static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<MonitoringDestination> PARSER;
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            MonitoringDestination monitoringDestination;
            DEFAULT_INSTANCE = monitoringDestination = new MonitoringDestination();
            GeneratedMessageLite.registerDefaultInstance(MonitoringDestination.class, (GeneratedMessageLite)monitoringDestination);
        }

        private MonitoringDestination() {
        }

        private void addAllMetrics(Iterable<String> iterable) {
            this.ensureMetricsIsMutable();
            AbstractMessageLite.addAll(iterable, this.metrics_);
        }

        private void addMetrics(String string) {
            string.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.add((Object)string);
        }

        private void addMetricsBytes(ByteString byteString) {
            MonitoringDestination.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureMetricsIsMutable();
            this.metrics_.add((Object)byteString.toStringUtf8());
        }

        private void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMonitoredResource() {
            this.monitoredResource_ = MonitoringDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.metrics_;
            if (!protobufList.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MonitoringDestination monitoringDestination) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination)MonitoringDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)MonitoringDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static MonitoringDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static MonitoringDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<MonitoringDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMetrics(int n, String string) {
            string.getClass();
            this.ensureMetricsIsMutable();
            this.metrics_.set(n, (Object)string);
        }

        private void setMonitoredResource(String string) {
            string.getClass();
            this.monitoredResource_ = string;
        }

        private void setMonitoredResourceBytes(ByteString byteString) {
            MonitoringDestination.checkByteStringIsUtf8((ByteString)byteString);
            this.monitoredResource_ = byteString.toStringUtf8();
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
                    Parser<MonitoringDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<MonitoringDestination> class_ = MonitoringDestination.class;
                    synchronized (MonitoringDestination.class) {
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
                    Object[] arrobject = new Object[]{"monitoredResource_", "metrics_"};
                    return MonitoringDestination.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new MonitoringDestination();
        }

        @Override
        public String getMetrics(int n) {
            return (String)this.metrics_.get(n);
        }

        @Override
        public ByteString getMetricsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.metrics_.get(n)));
        }

        @Override
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override
        public ByteString getMonitoredResourceBytes() {
            return ByteString.copyFromUtf8((String)this.monitoredResource_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<MonitoringDestination, Builder>
        implements MonitoringDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addAllMetrics((Iterable<String>)iterable);
                return this;
            }

            public Builder addMetrics(String string) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addMetrics(string);
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addMetricsBytes(byteString);
                return this;
            }

            public Builder clearMetrics() {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getMetrics(int n) {
                return ((MonitoringDestination)this.instance).getMetrics(n);
            }

            @Override
            public ByteString getMetricsBytes(int n) {
                return ((MonitoringDestination)this.instance).getMetricsBytes(n);
            }

            @Override
            public int getMetricsCount() {
                return ((MonitoringDestination)this.instance).getMetricsCount();
            }

            @Override
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((MonitoringDestination)this.instance).getMetricsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((MonitoringDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((MonitoringDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int n, String string) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMetrics(n, string);
                return this;
            }

            public Builder setMonitoredResource(String string) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMonitoredResource(string);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

}

