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

import com.google.api.Logging;
import com.google.api.LoggingOrBuilder;
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

public final class Logging
extends GeneratedMessageLite<Logging, Builder>
implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile Parser<Logging> PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<LoggingDestination> consumerDestinations_ = Logging.emptyProtobufList();
    private Internal.ProtobufList<LoggingDestination> producerDestinations_ = Logging.emptyProtobufList();

    static {
        Logging logging;
        DEFAULT_INSTANCE = logging = new Logging();
        GeneratedMessageLite.registerDefaultInstance(Logging.class, (GeneratedMessageLite)logging);
    }

    private Logging() {
    }

    private void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        this.ensureProducerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.producerDestinations_);
    }

    private void addConsumerDestinations(int n, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)loggingDestination);
    }

    private void addConsumerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)loggingDestination);
    }

    private void addProducerDestinations(int n, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n, (Object)loggingDestination);
    }

    private void addProducerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add((Object)loggingDestination);
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Logging.emptyProtobufList();
    }

    private void clearProducerDestinations() {
        this.producerDestinations_ = Logging.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal.ProtobufList<LoggingDestination> protobufList = this.consumerDestinations_;
        if (!protobufList.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        Internal.ProtobufList<LoggingDestination> protobufList = this.producerDestinations_;
        if (!protobufList.isModifiable()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Logging logging) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging)Logging.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)Logging.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Logging parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Logging parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Logging> parser() {
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

    private void setConsumerDestinations(int n, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)loggingDestination);
    }

    private void setProducerDestinations(int n, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n, (Object)loggingDestination);
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
                Parser<Logging> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Logging> class_ = Logging.class;
                synchronized (Logging.class) {
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
                Object[] arrobject = new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class};
                return Logging.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Logging();
    }

    @Override
    public LoggingDestination getConsumerDestinations(int n) {
        return (LoggingDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return this.consumerDestinations_.get(n);
    }

    public List<? extends LoggingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override
    public LoggingDestination getProducerDestinations(int n) {
        return (LoggingDestination)this.producerDestinations_.get(n);
    }

    @Override
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override
    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int n) {
        return this.producerDestinations_.get(n);
    }

    public List<? extends LoggingDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Logging, Builder>
    implements LoggingOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
            this.copyOnWrite();
            ((Logging)this.instance).addAllConsumerDestinations((Iterable<? extends LoggingDestination>)iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
            this.copyOnWrite();
            ((Logging)this.instance).addAllProducerDestinations((Iterable<? extends LoggingDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(n, (LoggingDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(n, loggingDestination);
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations((LoggingDestination)builder.build());
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(n, (LoggingDestination)builder.build());
            return this;
        }

        public Builder addProducerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(n, loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations((LoggingDestination)builder.build());
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(loggingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Logging)this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            this.copyOnWrite();
            ((Logging)this.instance).clearProducerDestinations();
            return this;
        }

        @Override
        public LoggingDestination getConsumerDestinations(int n) {
            return ((Logging)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Logging)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<LoggingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Logging)this.instance).getConsumerDestinationsList());
        }

        @Override
        public LoggingDestination getProducerDestinations(int n) {
            return ((Logging)this.instance).getProducerDestinations(n);
        }

        @Override
        public int getProducerDestinationsCount() {
            return ((Logging)this.instance).getProducerDestinationsCount();
        }

        @Override
        public List<LoggingDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Logging)this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Logging)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder removeProducerDestinations(int n) {
            this.copyOnWrite();
            ((Logging)this.instance).removeProducerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).setConsumerDestinations(n, (LoggingDestination)builder.build());
            return this;
        }

        public Builder setConsumerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).setConsumerDestinations(n, loggingDestination);
            return this;
        }

        public Builder setProducerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).setProducerDestinations(n, (LoggingDestination)builder.build());
            return this;
        }

        public Builder setProducerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).setProducerDestinations(n, loggingDestination);
            return this;
        }
    }

    public static final class LoggingDestination
    extends GeneratedMessageLite<LoggingDestination, Builder>
    implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser<LoggingDestination> PARSER;
        private Internal.ProtobufList<String> logs_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            LoggingDestination loggingDestination;
            DEFAULT_INSTANCE = loggingDestination = new LoggingDestination();
            GeneratedMessageLite.registerDefaultInstance(LoggingDestination.class, (GeneratedMessageLite)loggingDestination);
        }

        private LoggingDestination() {
        }

        private void addAllLogs(Iterable<String> iterable) {
            this.ensureLogsIsMutable();
            AbstractMessageLite.addAll(iterable, this.logs_);
        }

        private void addLogs(String string) {
            string.getClass();
            this.ensureLogsIsMutable();
            this.logs_.add((Object)string);
        }

        private void addLogsBytes(ByteString byteString) {
            LoggingDestination.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureLogsIsMutable();
            this.logs_.add((Object)byteString.toStringUtf8());
        }

        private void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMonitoredResource() {
            this.monitoredResource_ = LoggingDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.logs_;
            if (!protobufList.isModifiable()) {
                this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(LoggingDestination loggingDestination) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination)LoggingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)LoggingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static LoggingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static LoggingDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<LoggingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLogs(int n, String string) {
            string.getClass();
            this.ensureLogsIsMutable();
            this.logs_.set(n, (Object)string);
        }

        private void setMonitoredResource(String string) {
            string.getClass();
            this.monitoredResource_ = string;
        }

        private void setMonitoredResourceBytes(ByteString byteString) {
            LoggingDestination.checkByteStringIsUtf8((ByteString)byteString);
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
                    Parser<LoggingDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<LoggingDestination> class_ = LoggingDestination.class;
                    synchronized (LoggingDestination.class) {
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
                    Object[] arrobject = new Object[]{"logs_", "monitoredResource_"};
                    return LoggingDestination.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u021a\u0003\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new LoggingDestination();
        }

        @Override
        public String getLogs(int n) {
            return (String)this.logs_.get(n);
        }

        @Override
        public ByteString getLogsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.logs_.get(n)));
        }

        @Override
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override
        public List<String> getLogsList() {
            return this.logs_;
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
        extends GeneratedMessageLite.Builder<LoggingDestination, Builder>
        implements LoggingDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllLogs(Iterable<String> iterable) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addAllLogs((Iterable<String>)iterable);
                return this;
            }

            public Builder addLogs(String string) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addLogs(string);
                return this;
            }

            public Builder addLogsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addLogsBytes(byteString);
                return this;
            }

            public Builder clearLogs() {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).clearLogs();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getLogs(int n) {
                return ((LoggingDestination)this.instance).getLogs(n);
            }

            @Override
            public ByteString getLogsBytes(int n) {
                return ((LoggingDestination)this.instance).getLogsBytes(n);
            }

            @Override
            public int getLogsCount() {
                return ((LoggingDestination)this.instance).getLogsCount();
            }

            @Override
            public List<String> getLogsList() {
                return Collections.unmodifiableList(((LoggingDestination)this.instance).getLogsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((LoggingDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((LoggingDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setLogs(int n, String string) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setLogs(n, string);
                return this;
            }

            public Builder setMonitoredResource(String string) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setMonitoredResource(string);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

}

