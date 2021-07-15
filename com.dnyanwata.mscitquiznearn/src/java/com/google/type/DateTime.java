/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Duration
 *  com.google.protobuf.Duration$Builder
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.DateTime$1
 *  com.google.type.DateTime$TimeOffsetCase
 *  com.google.type.DateTimeOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.DateTime;
import com.google.type.DateTimeOrBuilder;
import com.google.type.TimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Exception performing whole class analysis ignored.
 */
public final class DateTime
extends GeneratedMessageLite<DateTime, Builder>
implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser<DateTime> PARSER;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    static {
        DateTime dateTime;
        DEFAULT_INSTANCE = dateTime = new DateTime();
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, (GeneratedMessageLite)dateTime);
    }

    private DateTime() {
    }

    private void clearDay() {
        this.day_ = 0;
    }

    private void clearHours() {
        this.hours_ = 0;
    }

    private void clearMinutes() {
        this.minutes_ = 0;
    }

    private void clearMonth() {
        this.month_ = 0;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0;
    }

    private void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    private void clearTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    private void clearUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            this.timeOffsetCase_ = 0;
            this.timeOffset_ = null;
        }
    }

    private void clearYear() {
        this.year_ = 0;
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = this.timeOffsetCase_ == 9 && this.timeOffset_ != TimeZone.getDefaultInstance() ? ((TimeZone.Builder)TimeZone.newBuilder((TimeZone)((Object)this.timeOffset_)).mergeFrom((GeneratedMessageLite)timeZone)).buildPartial() : timeZone;
        this.timeOffsetCase_ = 9;
    }

    private void mergeUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = this.timeOffsetCase_ == 8 && this.timeOffset_ != Duration.getDefaultInstance() ? ((Duration.Builder)Duration.newBuilder((Duration)((Duration)this.timeOffset_)).mergeFrom((GeneratedMessageLite)duration)).buildPartial() : duration;
        this.timeOffsetCase_ = 8;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DateTime dateTime) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)dateTime);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime)DateTime.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime)DateTime.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DateTime parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DateTime parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DateTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDay(int n) {
        this.day_ = n;
    }

    private void setHours(int n) {
        this.hours_ = n;
    }

    private void setMinutes(int n) {
        this.minutes_ = n;
    }

    private void setMonth(int n) {
        this.month_ = n;
    }

    private void setNanos(int n) {
        this.nanos_ = n;
    }

    private void setSeconds(int n) {
        this.seconds_ = n;
    }

    private void setTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    private void setUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    private void setYear(int n) {
        this.year_ = n;
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
                Parser<DateTime> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<DateTime> class_ = DateTime.class;
                synchronized (DateTime.class) {
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
                Object[] arrobject = new Object[]{"timeOffset_", "timeOffsetCase_", "year_", "month_", "day_", "hours_", "minutes_", "seconds_", "nanos_", Duration.class, TimeZone.class};
                return DateTime.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new DateTime();
    }

    public int getDay() {
        return this.day_;
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public TimeOffsetCase getTimeOffsetCase() {
        return TimeOffsetCase.forNumber((int)this.timeOffsetCase_);
    }

    public TimeZone getTimeZone() {
        if (this.timeOffsetCase_ == 9) {
            return (TimeZone)((Object)this.timeOffset_);
        }
        return TimeZone.getDefaultInstance();
    }

    public Duration getUtcOffset() {
        if (this.timeOffsetCase_ == 8) {
            return (Duration)this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    public int getYear() {
        return this.year_;
    }

    public boolean hasTimeZone() {
        return this.timeOffsetCase_ == 9;
    }

    public boolean hasUtcOffset() {
        return this.timeOffsetCase_ == 8;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DateTime, Builder>
    implements DateTimeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDay() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearDay();
            return this;
        }

        public Builder clearHours() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearHours();
            return this;
        }

        public Builder clearMinutes() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearMinutes();
            return this;
        }

        public Builder clearMonth() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearMonth();
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearSeconds();
            return this;
        }

        public Builder clearTimeOffset() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearTimeOffset();
            return this;
        }

        public Builder clearTimeZone() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearTimeZone();
            return this;
        }

        public Builder clearUtcOffset() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearUtcOffset();
            return this;
        }

        public Builder clearYear() {
            this.copyOnWrite();
            ((DateTime)this.instance).clearYear();
            return this;
        }

        public int getDay() {
            return ((DateTime)this.instance).getDay();
        }

        public int getHours() {
            return ((DateTime)this.instance).getHours();
        }

        public int getMinutes() {
            return ((DateTime)this.instance).getMinutes();
        }

        public int getMonth() {
            return ((DateTime)this.instance).getMonth();
        }

        public int getNanos() {
            return ((DateTime)this.instance).getNanos();
        }

        public int getSeconds() {
            return ((DateTime)this.instance).getSeconds();
        }

        public TimeOffsetCase getTimeOffsetCase() {
            return ((DateTime)this.instance).getTimeOffsetCase();
        }

        public TimeZone getTimeZone() {
            return ((DateTime)this.instance).getTimeZone();
        }

        public Duration getUtcOffset() {
            return ((DateTime)this.instance).getUtcOffset();
        }

        public int getYear() {
            return ((DateTime)this.instance).getYear();
        }

        public boolean hasTimeZone() {
            return ((DateTime)this.instance).hasTimeZone();
        }

        public boolean hasUtcOffset() {
            return ((DateTime)this.instance).hasUtcOffset();
        }

        public Builder mergeTimeZone(TimeZone timeZone) {
            this.copyOnWrite();
            ((DateTime)this.instance).mergeTimeZone(timeZone);
            return this;
        }

        public Builder mergeUtcOffset(Duration duration) {
            this.copyOnWrite();
            ((DateTime)this.instance).mergeUtcOffset(duration);
            return this;
        }

        public Builder setDay(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setDay(n);
            return this;
        }

        public Builder setHours(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setHours(n);
            return this;
        }

        public Builder setMinutes(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setMinutes(n);
            return this;
        }

        public Builder setMonth(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setMonth(n);
            return this;
        }

        public Builder setNanos(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setNanos(n);
            return this;
        }

        public Builder setSeconds(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setSeconds(n);
            return this;
        }

        public Builder setTimeZone(TimeZone.Builder builder) {
            this.copyOnWrite();
            ((DateTime)this.instance).setTimeZone((TimeZone)builder.build());
            return this;
        }

        public Builder setTimeZone(TimeZone timeZone) {
            this.copyOnWrite();
            ((DateTime)this.instance).setTimeZone(timeZone);
            return this;
        }

        public Builder setUtcOffset(Duration.Builder builder) {
            this.copyOnWrite();
            ((DateTime)this.instance).setUtcOffset((Duration)builder.build());
            return this;
        }

        public Builder setUtcOffset(Duration duration) {
            this.copyOnWrite();
            ((DateTime)this.instance).setUtcOffset(duration);
            return this;
        }

        public Builder setYear(int n) {
            this.copyOnWrite();
            ((DateTime)this.instance).setYear(n);
            return this;
        }
    }

}

