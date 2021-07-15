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

import com.google.api.Billing;
import com.google.api.BillingOrBuilder;
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

public final class Billing
extends GeneratedMessageLite<Billing, Builder>
implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_ = Billing.emptyProtobufList();

    static {
        Billing billing;
        DEFAULT_INSTANCE = billing = new Billing();
        GeneratedMessageLite.registerDefaultInstance(Billing.class, (GeneratedMessageLite)billing);
    }

    private Billing() {
    }

    private void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addConsumerDestinations(int n, BillingDestination billingDestination) {
        billingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)billingDestination);
    }

    private void addConsumerDestinations(BillingDestination billingDestination) {
        billingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)billingDestination);
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Billing.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal.ProtobufList<BillingDestination> protobufList = this.consumerDestinations_;
        if (!protobufList.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Billing billing) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing)Billing.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)Billing.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Billing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Billing parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Billing> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n);
    }

    private void setConsumerDestinations(int n, BillingDestination billingDestination) {
        billingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)billingDestination);
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
                Parser<Billing> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Billing> class_ = Billing.class;
                synchronized (Billing.class) {
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
                Object[] arrobject = new Object[]{"consumerDestinations_", BillingDestination.class};
                return Billing.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Billing();
    }

    @Override
    public BillingDestination getConsumerDestinations(int n) {
        return (BillingDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return this.consumerDestinations_.get(n);
    }

    public List<? extends BillingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public static final class BillingDestination
    extends GeneratedMessageLite<BillingDestination, Builder>
    implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            BillingDestination billingDestination;
            DEFAULT_INSTANCE = billingDestination = new BillingDestination();
            GeneratedMessageLite.registerDefaultInstance(BillingDestination.class, (GeneratedMessageLite)billingDestination);
        }

        private BillingDestination() {
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
            BillingDestination.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureMetricsIsMutable();
            this.metrics_.add((Object)byteString.toStringUtf8());
        }

        private void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMonitoredResource() {
            this.monitoredResource_ = BillingDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.metrics_;
            if (!protobufList.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BillingDestination billingDestination) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination)BillingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)BillingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static BillingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static BillingDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<BillingDestination> parser() {
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
            BillingDestination.checkByteStringIsUtf8((ByteString)byteString);
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
                    Parser<BillingDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<BillingDestination> class_ = BillingDestination.class;
                    synchronized (BillingDestination.class) {
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
                    return BillingDestination.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new BillingDestination();
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
        extends GeneratedMessageLite.Builder<BillingDestination, Builder>
        implements BillingDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addAllMetrics((Iterable<String>)iterable);
                return this;
            }

            public Builder addMetrics(String string) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addMetrics(string);
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addMetricsBytes(byteString);
                return this;
            }

            public Builder clearMetrics() {
                this.copyOnWrite();
                ((BillingDestination)this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((BillingDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getMetrics(int n) {
                return ((BillingDestination)this.instance).getMetrics(n);
            }

            @Override
            public ByteString getMetricsBytes(int n) {
                return ((BillingDestination)this.instance).getMetricsBytes(n);
            }

            @Override
            public int getMetricsCount() {
                return ((BillingDestination)this.instance).getMetricsCount();
            }

            @Override
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((BillingDestination)this.instance).getMetricsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((BillingDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((BillingDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int n, String string) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMetrics(n, string);
                return this;
            }

            public Builder setMonitoredResource(String string) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMonitoredResource(string);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Billing, Builder>
    implements BillingOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
            this.copyOnWrite();
            ((Billing)this.instance).addAllConsumerDestinations((Iterable<? extends BillingDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(n, (BillingDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int n, BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(n, billingDestination);
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations((BillingDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(billingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Billing)this.instance).clearConsumerDestinations();
            return this;
        }

        @Override
        public BillingDestination getConsumerDestinations(int n) {
            return ((Billing)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Billing)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<BillingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Billing)this.instance).getConsumerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Billing)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).setConsumerDestinations(n, (BillingDestination)builder.build());
            return this;
        }

        public Builder setConsumerDestinations(int n, BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).setConsumerDestinations(n, billingDestination);
            return this;
        }
    }

}

