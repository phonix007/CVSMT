/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
 *  com.google.protobuf.AnyOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$DoubleList
 *  com.google.protobuf.Internal$LongList
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.Distribution;
import com.google.api.DistributionOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Distribution
extends GeneratedMessageLite<Distribution, Builder>
implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser<Distribution> PARSER;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bucketCountsMemoizedSerializedSize = -1;
    private Internal.LongList bucketCounts_ = Distribution.emptyLongList();
    private BucketOptions bucketOptions_;
    private long count_;
    private Internal.ProtobufList<Exemplar> exemplars_ = Distribution.emptyProtobufList();
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    static {
        Distribution distribution;
        DEFAULT_INSTANCE = distribution = new Distribution();
        GeneratedMessageLite.registerDefaultInstance(Distribution.class, (GeneratedMessageLite)distribution);
    }

    private Distribution() {
    }

    private void addAllBucketCounts(Iterable<? extends Long> iterable) {
        this.ensureBucketCountsIsMutable();
        AbstractMessageLite.addAll(iterable, (List)this.bucketCounts_);
    }

    private void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        this.ensureExemplarsIsMutable();
        AbstractMessageLite.addAll(iterable, this.exemplars_);
    }

    private void addBucketCounts(long l) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(l);
    }

    private void addExemplars(int n, Exemplar exemplar) {
        exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.add(n, (Object)exemplar);
    }

    private void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.add((Object)exemplar);
    }

    private void clearBucketCounts() {
        this.bucketCounts_ = Distribution.emptyLongList();
    }

    private void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    private void clearCount() {
        this.count_ = 0L;
    }

    private void clearExemplars() {
        this.exemplars_ = Distribution.emptyProtobufList();
    }

    private void clearMean() {
        this.mean_ = 0.0;
    }

    private void clearRange() {
        this.range_ = null;
    }

    private void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0;
    }

    private void ensureBucketCountsIsMutable() {
        Internal.LongList longList = this.bucketCounts_;
        if (!longList.isModifiable()) {
            this.bucketCounts_ = GeneratedMessageLite.mutableCopy((Internal.LongList)longList);
        }
    }

    private void ensureExemplarsIsMutable() {
        Internal.ProtobufList<Exemplar> protobufList = this.exemplars_;
        if (!protobufList.isModifiable()) {
            this.exemplars_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 != null && bucketOptions2 != BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = (BucketOptions)((BucketOptions.Builder)BucketOptions.newBuilder(this.bucketOptions_).mergeFrom((GeneratedMessageLite)bucketOptions)).buildPartial();
            return;
        }
        this.bucketOptions_ = bucketOptions;
    }

    private void mergeRange(Range range) {
        range.getClass();
        Range range2 = this.range_;
        if (range2 != null && range2 != Range.getDefaultInstance()) {
            this.range_ = (Range)((Range.Builder)Range.newBuilder(this.range_).mergeFrom((GeneratedMessageLite)range)).buildPartial();
            return;
        }
        this.range_ = range;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Distribution distribution) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution)Distribution.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)Distribution.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Distribution parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Distribution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeExemplars(int n) {
        this.ensureExemplarsIsMutable();
        this.exemplars_.remove(n);
    }

    private void setBucketCounts(int n, long l) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(n, l);
    }

    private void setBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        this.bucketOptions_ = bucketOptions;
    }

    private void setCount(long l) {
        this.count_ = l;
    }

    private void setExemplars(int n, Exemplar exemplar) {
        exemplar.getClass();
        this.ensureExemplarsIsMutable();
        this.exemplars_.set(n, (Object)exemplar);
    }

    private void setMean(double d) {
        this.mean_ = d;
    }

    private void setRange(Range range) {
        range.getClass();
        this.range_ = range;
    }

    private void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
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
                Parser<Distribution> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Distribution> class_ = Distribution.class;
                synchronized (Distribution.class) {
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
                Object[] arrobject = new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class};
                return Distribution.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Distribution();
    }

    @Override
    public long getBucketCounts(int n) {
        return this.bucketCounts_.getLong(n);
    }

    @Override
    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    @Override
    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    @Override
    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        if (bucketOptions == null) {
            bucketOptions = BucketOptions.getDefaultInstance();
        }
        return bucketOptions;
    }

    @Override
    public long getCount() {
        return this.count_;
    }

    @Override
    public Exemplar getExemplars(int n) {
        return (Exemplar)this.exemplars_.get(n);
    }

    @Override
    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    @Override
    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public ExemplarOrBuilder getExemplarsOrBuilder(int n) {
        return this.exemplars_.get(n);
    }

    public List<? extends ExemplarOrBuilder> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    @Override
    public double getMean() {
        return this.mean_;
    }

    @Override
    public Range getRange() {
        Range range = this.range_;
        if (range == null) {
            range = Range.getDefaultInstance();
        }
        return range;
    }

    @Override
    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    @Override
    public boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    @Override
    public boolean hasRange() {
        return this.range_ != null;
    }

    public static final class BucketOptions
    extends GeneratedMessageLite<BucketOptions, Builder>
    implements BucketOptionsOrBuilder {
        private static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile Parser<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        static {
            BucketOptions bucketOptions;
            DEFAULT_INSTANCE = bucketOptions = new BucketOptions();
            GeneratedMessageLite.registerDefaultInstance(BucketOptions.class, (GeneratedMessageLite)bucketOptions);
        }

        private BucketOptions() {
        }

        private void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            this.options_ = this.optionsCase_ == 3 && this.options_ != Explicit.getDefaultInstance() ? ((Explicit.Builder)Explicit.newBuilder((Explicit)this.options_).mergeFrom((GeneratedMessageLite)explicit)).buildPartial() : explicit;
            this.optionsCase_ = 3;
        }

        private void mergeExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            this.options_ = this.optionsCase_ == 2 && this.options_ != Exponential.getDefaultInstance() ? ((Exponential.Builder)Exponential.newBuilder((Exponential)this.options_).mergeFrom((GeneratedMessageLite)exponential)).buildPartial() : exponential;
            this.optionsCase_ = 2;
        }

        private void mergeLinearBuckets(Linear linear) {
            linear.getClass();
            this.options_ = this.optionsCase_ == 1 && this.options_ != Linear.getDefaultInstance() ? ((Linear.Builder)Linear.newBuilder((Linear)this.options_).mergeFrom((GeneratedMessageLite)linear)).buildPartial() : linear;
            this.optionsCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)bucketOptions);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions)BucketOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)BucketOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static BucketOptions parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<BucketOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        private void setExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        private void setLinearBuckets(Linear linear) {
            linear.getClass();
            this.options_ = linear;
            this.optionsCase_ = 1;
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
                    Parser<BucketOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<BucketOptions> class_ = BucketOptions.class;
                    synchronized (BucketOptions.class) {
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
                    Object[] arrobject = new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class};
                    return BucketOptions.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new BucketOptions();
        }

        @Override
        public Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit)this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        @Override
        public Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential)this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        @Override
        public Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear)this.options_;
            }
            return Linear.getDefaultInstance();
        }

        @Override
        public OptionsCase getOptionsCase() {
            return OptionsCase.forNumber(this.optionsCase_);
        }

        @Override
        public boolean hasExplicitBuckets() {
            return this.optionsCase_ == 3;
        }

        @Override
        public boolean hasExponentialBuckets() {
            return this.optionsCase_ == 2;
        }

        @Override
        public boolean hasLinearBuckets() {
            return this.optionsCase_ == 1;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<BucketOptions, Builder>
        implements BucketOptionsOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearExplicitBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearExplicitBuckets();
                return this;
            }

            public Builder clearExponentialBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearExponentialBuckets();
                return this;
            }

            public Builder clearLinearBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearLinearBuckets();
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearOptions();
                return this;
            }

            @Override
            public Explicit getExplicitBuckets() {
                return ((BucketOptions)this.instance).getExplicitBuckets();
            }

            @Override
            public Exponential getExponentialBuckets() {
                return ((BucketOptions)this.instance).getExponentialBuckets();
            }

            @Override
            public Linear getLinearBuckets() {
                return ((BucketOptions)this.instance).getLinearBuckets();
            }

            @Override
            public OptionsCase getOptionsCase() {
                return ((BucketOptions)this.instance).getOptionsCase();
            }

            @Override
            public boolean hasExplicitBuckets() {
                return ((BucketOptions)this.instance).hasExplicitBuckets();
            }

            @Override
            public boolean hasExponentialBuckets() {
                return ((BucketOptions)this.instance).hasExponentialBuckets();
            }

            @Override
            public boolean hasLinearBuckets() {
                return ((BucketOptions)this.instance).hasLinearBuckets();
            }

            public Builder mergeExplicitBuckets(Explicit explicit) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeExplicitBuckets(explicit);
                return this;
            }

            public Builder mergeExponentialBuckets(Exponential exponential) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeExponentialBuckets(exponential);
                return this;
            }

            public Builder mergeLinearBuckets(Linear linear) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeLinearBuckets(linear);
                return this;
            }

            public Builder setExplicitBuckets(Explicit.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExplicitBuckets((Explicit)builder.build());
                return this;
            }

            public Builder setExplicitBuckets(Explicit explicit) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExplicitBuckets(explicit);
                return this;
            }

            public Builder setExponentialBuckets(Exponential.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExponentialBuckets((Exponential)builder.build());
                return this;
            }

            public Builder setExponentialBuckets(Exponential exponential) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExponentialBuckets(exponential);
                return this;
            }

            public Builder setLinearBuckets(Linear.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setLinearBuckets((Linear)builder.build());
                return this;
            }

            public Builder setLinearBuckets(Linear linear) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setLinearBuckets(linear);
                return this;
            }
        }

        public static final class Explicit
        extends GeneratedMessageLite<Explicit, Builder>
        implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE;
            private static volatile Parser<Explicit> PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private Internal.DoubleList bounds_ = Explicit.emptyDoubleList();

            static {
                Explicit explicit;
                DEFAULT_INSTANCE = explicit = new Explicit();
                GeneratedMessageLite.registerDefaultInstance(Explicit.class, (GeneratedMessageLite)explicit);
            }

            private Explicit() {
            }

            private void addAllBounds(Iterable<? extends Double> iterable) {
                this.ensureBoundsIsMutable();
                AbstractMessageLite.addAll(iterable, (List)this.bounds_);
            }

            private void addBounds(double d) {
                this.ensureBoundsIsMutable();
                this.bounds_.addDouble(d);
            }

            private void clearBounds() {
                this.bounds_ = Explicit.emptyDoubleList();
            }

            private void ensureBoundsIsMutable() {
                Internal.DoubleList doubleList = this.bounds_;
                if (!doubleList.isModifiable()) {
                    this.bounds_ = GeneratedMessageLite.mutableCopy((Internal.DoubleList)doubleList);
                }
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Explicit explicit) {
                return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)explicit);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit)Explicit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)Explicit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Explicit parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Explicit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBounds(int n, double d) {
                this.ensureBoundsIsMutable();
                this.bounds_.setDouble(n, d);
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
                        Parser<Explicit> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        Class<Explicit> class_ = Explicit.class;
                        synchronized (Explicit.class) {
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
                        Object[] arrobject = new Object[]{"bounds_"};
                        return Explicit.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", (Object[])arrobject);
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Explicit();
            }

            @Override
            public double getBounds(int n) {
                return this.bounds_.getDouble(n);
            }

            @Override
            public int getBoundsCount() {
                return this.bounds_.size();
            }

            @Override
            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Explicit, Builder>
            implements ExplicitOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder addAllBounds(Iterable<? extends Double> iterable) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).addAllBounds((Iterable<? extends Double>)iterable);
                    return this;
                }

                public Builder addBounds(double d) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).addBounds(d);
                    return this;
                }

                public Builder clearBounds() {
                    this.copyOnWrite();
                    ((Explicit)this.instance).clearBounds();
                    return this;
                }

                @Override
                public double getBounds(int n) {
                    return ((Explicit)this.instance).getBounds(n);
                }

                @Override
                public int getBoundsCount() {
                    return ((Explicit)this.instance).getBoundsCount();
                }

                @Override
                public List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((Explicit)this.instance).getBoundsList());
                }

                public Builder setBounds(int n, double d) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).setBounds(n, d);
                    return this;
                }
            }

        }

        public static final class Exponential
        extends GeneratedMessageLite<Exponential, Builder>
        implements ExponentialOrBuilder {
            private static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile Parser<Exponential> PARSER;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            static {
                Exponential exponential;
                DEFAULT_INSTANCE = exponential = new Exponential();
                GeneratedMessageLite.registerDefaultInstance(Exponential.class, (GeneratedMessageLite)exponential);
            }

            private Exponential() {
            }

            private void clearGrowthFactor() {
                this.growthFactor_ = 0.0;
            }

            private void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            private void clearScale() {
                this.scale_ = 0.0;
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Exponential exponential) {
                return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)exponential);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential)Exponential.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)Exponential.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Exponential parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Exponential> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            private void setNumFiniteBuckets(int n) {
                this.numFiniteBuckets_ = n;
            }

            private void setScale(double d) {
                this.scale_ = d;
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
                        Parser<Exponential> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        Class<Exponential> class_ = Exponential.class;
                        synchronized (Exponential.class) {
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
                        Object[] arrobject = new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"};
                        return Exponential.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", (Object[])arrobject);
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Exponential();
            }

            @Override
            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            @Override
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override
            public double getScale() {
                return this.scale_;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Exponential, Builder>
            implements ExponentialOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearGrowthFactor() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearGrowthFactor();
                    return this;
                }

                public Builder clearNumFiniteBuckets() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearScale() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearScale();
                    return this;
                }

                @Override
                public double getGrowthFactor() {
                    return ((Exponential)this.instance).getGrowthFactor();
                }

                @Override
                public int getNumFiniteBuckets() {
                    return ((Exponential)this.instance).getNumFiniteBuckets();
                }

                @Override
                public double getScale() {
                    return ((Exponential)this.instance).getScale();
                }

                public Builder setGrowthFactor(double d) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setGrowthFactor(d);
                    return this;
                }

                public Builder setNumFiniteBuckets(int n) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setNumFiniteBuckets(n);
                    return this;
                }

                public Builder setScale(double d) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setScale(d);
                    return this;
                }
            }

        }

        public static final class Linear
        extends GeneratedMessageLite<Linear, Builder>
        implements LinearOrBuilder {
            private static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile Parser<Linear> PARSER;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            static {
                Linear linear;
                DEFAULT_INSTANCE = linear = new Linear();
                GeneratedMessageLite.registerDefaultInstance(Linear.class, (GeneratedMessageLite)linear);
            }

            private Linear() {
            }

            private void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            private void clearOffset() {
                this.offset_ = 0.0;
            }

            private void clearWidth() {
                this.width_ = 0.0;
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Linear linear) {
                return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)linear);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear)Linear.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)Linear.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Linear parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Linear> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setNumFiniteBuckets(int n) {
                this.numFiniteBuckets_ = n;
            }

            private void setOffset(double d) {
                this.offset_ = d;
            }

            private void setWidth(double d) {
                this.width_ = d;
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
                        Parser<Linear> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        Class<Linear> class_ = Linear.class;
                        synchronized (Linear.class) {
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
                        Object[] arrobject = new Object[]{"numFiniteBuckets_", "width_", "offset_"};
                        return Linear.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", (Object[])arrobject);
                    }
                    case 2: {
                        return new Builder();
                    }
                    case 1: 
                }
                return new Linear();
            }

            @Override
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override
            public double getOffset() {
                return this.offset_;
            }

            @Override
            public double getWidth() {
                return this.width_;
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Linear, Builder>
            implements LinearOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearNumFiniteBuckets() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearOffset() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearOffset();
                    return this;
                }

                public Builder clearWidth() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearWidth();
                    return this;
                }

                @Override
                public int getNumFiniteBuckets() {
                    return ((Linear)this.instance).getNumFiniteBuckets();
                }

                @Override
                public double getOffset() {
                    return ((Linear)this.instance).getOffset();
                }

                @Override
                public double getWidth() {
                    return ((Linear)this.instance).getWidth();
                }

                public Builder setNumFiniteBuckets(int n) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setNumFiniteBuckets(n);
                    return this;
                }

                public Builder setOffset(double d) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setOffset(d);
                    return this;
                }

                public Builder setWidth(double d) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setWidth(d);
                    return this;
                }
            }

        }

    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Distribution, Builder>
    implements DistributionOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
            this.copyOnWrite();
            ((Distribution)this.instance).addAllBucketCounts((Iterable<? extends Long>)iterable);
            return this;
        }

        public Builder addAllExemplars(Iterable<? extends Exemplar> iterable) {
            this.copyOnWrite();
            ((Distribution)this.instance).addAllExemplars((Iterable<? extends Exemplar>)iterable);
            return this;
        }

        public Builder addBucketCounts(long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).addBucketCounts(l);
            return this;
        }

        public Builder addExemplars(int n, Exemplar.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).addExemplars(n, (Exemplar)builder.build());
            return this;
        }

        public Builder addExemplars(int n, Exemplar exemplar) {
            this.copyOnWrite();
            ((Distribution)this.instance).addExemplars(n, exemplar);
            return this;
        }

        public Builder addExemplars(Exemplar.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).addExemplars((Exemplar)builder.build());
            return this;
        }

        public Builder addExemplars(Exemplar exemplar) {
            this.copyOnWrite();
            ((Distribution)this.instance).addExemplars(exemplar);
            return this;
        }

        public Builder clearBucketCounts() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearBucketCounts();
            return this;
        }

        public Builder clearBucketOptions() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearBucketOptions();
            return this;
        }

        public Builder clearCount() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearCount();
            return this;
        }

        public Builder clearExemplars() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearExemplars();
            return this;
        }

        public Builder clearMean() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearMean();
            return this;
        }

        public Builder clearRange() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearRange();
            return this;
        }

        public Builder clearSumOfSquaredDeviation() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearSumOfSquaredDeviation();
            return this;
        }

        @Override
        public long getBucketCounts(int n) {
            return ((Distribution)this.instance).getBucketCounts(n);
        }

        @Override
        public int getBucketCountsCount() {
            return ((Distribution)this.instance).getBucketCountsCount();
        }

        @Override
        public List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((Distribution)this.instance).getBucketCountsList());
        }

        @Override
        public BucketOptions getBucketOptions() {
            return ((Distribution)this.instance).getBucketOptions();
        }

        @Override
        public long getCount() {
            return ((Distribution)this.instance).getCount();
        }

        @Override
        public Exemplar getExemplars(int n) {
            return ((Distribution)this.instance).getExemplars(n);
        }

        @Override
        public int getExemplarsCount() {
            return ((Distribution)this.instance).getExemplarsCount();
        }

        @Override
        public List<Exemplar> getExemplarsList() {
            return Collections.unmodifiableList(((Distribution)this.instance).getExemplarsList());
        }

        @Override
        public double getMean() {
            return ((Distribution)this.instance).getMean();
        }

        @Override
        public Range getRange() {
            return ((Distribution)this.instance).getRange();
        }

        @Override
        public double getSumOfSquaredDeviation() {
            return ((Distribution)this.instance).getSumOfSquaredDeviation();
        }

        @Override
        public boolean hasBucketOptions() {
            return ((Distribution)this.instance).hasBucketOptions();
        }

        @Override
        public boolean hasRange() {
            return ((Distribution)this.instance).hasRange();
        }

        public Builder mergeBucketOptions(BucketOptions bucketOptions) {
            this.copyOnWrite();
            ((Distribution)this.instance).mergeBucketOptions(bucketOptions);
            return this;
        }

        public Builder mergeRange(Range range) {
            this.copyOnWrite();
            ((Distribution)this.instance).mergeRange(range);
            return this;
        }

        public Builder removeExemplars(int n) {
            this.copyOnWrite();
            ((Distribution)this.instance).removeExemplars(n);
            return this;
        }

        public Builder setBucketCounts(int n, long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketCounts(n, l);
            return this;
        }

        public Builder setBucketOptions(BucketOptions.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketOptions((BucketOptions)builder.build());
            return this;
        }

        public Builder setBucketOptions(BucketOptions bucketOptions) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketOptions(bucketOptions);
            return this;
        }

        public Builder setCount(long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).setCount(l);
            return this;
        }

        public Builder setExemplars(int n, Exemplar.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).setExemplars(n, (Exemplar)builder.build());
            return this;
        }

        public Builder setExemplars(int n, Exemplar exemplar) {
            this.copyOnWrite();
            ((Distribution)this.instance).setExemplars(n, exemplar);
            return this;
        }

        public Builder setMean(double d) {
            this.copyOnWrite();
            ((Distribution)this.instance).setMean(d);
            return this;
        }

        public Builder setRange(Range.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).setRange((Range)builder.build());
            return this;
        }

        public Builder setRange(Range range) {
            this.copyOnWrite();
            ((Distribution)this.instance).setRange(range);
            return this;
        }

        public Builder setSumOfSquaredDeviation(double d) {
            this.copyOnWrite();
            ((Distribution)this.instance).setSumOfSquaredDeviation(d);
            return this;
        }
    }

    public static final class Exemplar
    extends GeneratedMessageLite<Exemplar, Builder>
    implements ExemplarOrBuilder {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE;
        private static volatile Parser<Exemplar> PARSER;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Any> attachments_ = Exemplar.emptyProtobufList();
        private Timestamp timestamp_;
        private double value_;

        static {
            Exemplar exemplar;
            DEFAULT_INSTANCE = exemplar = new Exemplar();
            GeneratedMessageLite.registerDefaultInstance(Exemplar.class, (GeneratedMessageLite)exemplar);
        }

        private Exemplar() {
        }

        private void addAllAttachments(Iterable<? extends Any> iterable) {
            this.ensureAttachmentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.attachments_);
        }

        private void addAttachments(int n, Any any) {
            any.getClass();
            this.ensureAttachmentsIsMutable();
            this.attachments_.add(n, (Object)any);
        }

        private void addAttachments(Any any) {
            any.getClass();
            this.ensureAttachmentsIsMutable();
            this.attachments_.add((Object)any);
        }

        private void clearAttachments() {
            this.attachments_ = Exemplar.emptyProtobufList();
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
        }

        private void clearValue() {
            this.value_ = 0.0;
        }

        private void ensureAttachmentsIsMutable() {
            Internal.ProtobufList<Any> protobufList = this.attachments_;
            if (!protobufList.isModifiable()) {
                this.attachments_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.timestamp_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.timestamp_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
                return;
            }
            this.timestamp_ = timestamp;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Exemplar exemplar) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)exemplar);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar)Exemplar.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar)Exemplar.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Exemplar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Exemplar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Exemplar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Exemplar parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Exemplar parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Exemplar)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Exemplar> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAttachments(int n) {
            this.ensureAttachmentsIsMutable();
            this.attachments_.remove(n);
        }

        private void setAttachments(int n, Any any) {
            any.getClass();
            this.ensureAttachmentsIsMutable();
            this.attachments_.set(n, (Object)any);
        }

        private void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
        }

        private void setValue(double d) {
            this.value_ = d;
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
                    Parser<Exemplar> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Exemplar> class_ = Exemplar.class;
                    synchronized (Exemplar.class) {
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
                    Object[] arrobject = new Object[]{"value_", "timestamp_", "attachments_", Any.class};
                    return Exemplar.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Exemplar();
        }

        @Override
        public Any getAttachments(int n) {
            return (Any)this.attachments_.get(n);
        }

        @Override
        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        @Override
        public List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        public AnyOrBuilder getAttachmentsOrBuilder(int n) {
            return (AnyOrBuilder)this.attachments_.get(n);
        }

        public List<? extends AnyOrBuilder> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        @Override
        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            if (timestamp == null) {
                timestamp = Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        @Override
        public double getValue() {
            return this.value_;
        }

        @Override
        public boolean hasTimestamp() {
            return this.timestamp_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Exemplar, Builder>
        implements ExemplarOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllAttachments(Iterable<? extends Any> iterable) {
                this.copyOnWrite();
                ((Exemplar)this.instance).addAllAttachments((Iterable<? extends Any>)iterable);
                return this;
            }

            public Builder addAttachments(int n, Any.Builder builder) {
                this.copyOnWrite();
                ((Exemplar)this.instance).addAttachments(n, (Any)builder.build());
                return this;
            }

            public Builder addAttachments(int n, Any any) {
                this.copyOnWrite();
                ((Exemplar)this.instance).addAttachments(n, any);
                return this;
            }

            public Builder addAttachments(Any.Builder builder) {
                this.copyOnWrite();
                ((Exemplar)this.instance).addAttachments((Any)builder.build());
                return this;
            }

            public Builder addAttachments(Any any) {
                this.copyOnWrite();
                ((Exemplar)this.instance).addAttachments(any);
                return this;
            }

            public Builder clearAttachments() {
                this.copyOnWrite();
                ((Exemplar)this.instance).clearAttachments();
                return this;
            }

            public Builder clearTimestamp() {
                this.copyOnWrite();
                ((Exemplar)this.instance).clearTimestamp();
                return this;
            }

            public Builder clearValue() {
                this.copyOnWrite();
                ((Exemplar)this.instance).clearValue();
                return this;
            }

            @Override
            public Any getAttachments(int n) {
                return ((Exemplar)this.instance).getAttachments(n);
            }

            @Override
            public int getAttachmentsCount() {
                return ((Exemplar)this.instance).getAttachmentsCount();
            }

            @Override
            public List<Any> getAttachmentsList() {
                return Collections.unmodifiableList(((Exemplar)this.instance).getAttachmentsList());
            }

            @Override
            public Timestamp getTimestamp() {
                return ((Exemplar)this.instance).getTimestamp();
            }

            @Override
            public double getValue() {
                return ((Exemplar)this.instance).getValue();
            }

            @Override
            public boolean hasTimestamp() {
                return ((Exemplar)this.instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((Exemplar)this.instance).mergeTimestamp(timestamp);
                return this;
            }

            public Builder removeAttachments(int n) {
                this.copyOnWrite();
                ((Exemplar)this.instance).removeAttachments(n);
                return this;
            }

            public Builder setAttachments(int n, Any.Builder builder) {
                this.copyOnWrite();
                ((Exemplar)this.instance).setAttachments(n, (Any)builder.build());
                return this;
            }

            public Builder setAttachments(int n, Any any) {
                this.copyOnWrite();
                ((Exemplar)this.instance).setAttachments(n, any);
                return this;
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((Exemplar)this.instance).setTimestamp((Timestamp)builder.build());
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                this.copyOnWrite();
                ((Exemplar)this.instance).setTimestamp(timestamp);
                return this;
            }

            public Builder setValue(double d) {
                this.copyOnWrite();
                ((Exemplar)this.instance).setValue(d);
                return this;
            }
        }

    }

    public static final class Range
    extends GeneratedMessageLite<Range, Builder>
    implements RangeOrBuilder {
        private static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile Parser<Range> PARSER;
        private double max_;
        private double min_;

        static {
            Range range;
            DEFAULT_INSTANCE = range = new Range();
            GeneratedMessageLite.registerDefaultInstance(Range.class, (GeneratedMessageLite)range);
        }

        private Range() {
        }

        private void clearMax() {
            this.max_ = 0.0;
        }

        private void clearMin() {
            this.min_ = 0.0;
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Range range) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)range);
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range)Range.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)Range.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Range parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Range> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMax(double d) {
            this.max_ = d;
        }

        private void setMin(double d) {
            this.min_ = d;
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
                    Parser<Range> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Range> class_ = Range.class;
                    synchronized (Range.class) {
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
                    Object[] arrobject = new Object[]{"min_", "max_"};
                    return Range.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Range();
        }

        @Override
        public double getMax() {
            return this.max_;
        }

        @Override
        public double getMin() {
            return this.min_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Range, Builder>
        implements RangeOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearMax() {
                this.copyOnWrite();
                ((Range)this.instance).clearMax();
                return this;
            }

            public Builder clearMin() {
                this.copyOnWrite();
                ((Range)this.instance).clearMin();
                return this;
            }

            @Override
            public double getMax() {
                return ((Range)this.instance).getMax();
            }

            @Override
            public double getMin() {
                return ((Range)this.instance).getMin();
            }

            public Builder setMax(double d) {
                this.copyOnWrite();
                ((Range)this.instance).setMax(d);
                return this;
            }

            public Builder setMin(double d) {
                this.copyOnWrite();
                ((Range)this.instance).setMin(d);
                return this;
            }
        }

    }

}

