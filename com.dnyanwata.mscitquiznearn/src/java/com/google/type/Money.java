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
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.Money$1
 *  com.google.type.MoneyOrBuilder
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
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.Money;
import com.google.type.MoneyOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Money
extends GeneratedMessageLite<Money, Builder>
implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser<Money> PARSER;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    static {
        Money money;
        DEFAULT_INSTANCE = money = new Money();
        GeneratedMessageLite.registerDefaultInstance(Money.class, (GeneratedMessageLite)money);
    }

    private Money() {
    }

    private void clearCurrencyCode() {
        this.currencyCode_ = Money.getDefaultInstance().getCurrencyCode();
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearUnits() {
        this.units_ = 0L;
    }

    public static Money getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Money money) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)money);
    }

    public static Money parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Money)Money.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Money parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)Money.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Money parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Money parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(InputStream inputStream) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Money parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Money parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Money parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Money> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCurrencyCode(String string) {
        string.getClass();
        this.currencyCode_ = string;
    }

    private void setCurrencyCodeBytes(ByteString byteString) {
        Money.checkByteStringIsUtf8((ByteString)byteString);
        this.currencyCode_ = byteString.toStringUtf8();
    }

    private void setNanos(int n) {
        this.nanos_ = n;
    }

    private void setUnits(long l) {
        this.units_ = l;
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
                Parser<Money> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Money> class_ = Money.class;
                synchronized (Money.class) {
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
                Object[] arrobject = new Object[]{"currencyCode_", "units_", "nanos_"};
                return Money.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0004", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Money();
    }

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public ByteString getCurrencyCodeBytes() {
        return ByteString.copyFromUtf8((String)this.currencyCode_);
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getUnits() {
        return this.units_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Money, Builder>
    implements MoneyOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrencyCode() {
            this.copyOnWrite();
            ((Money)this.instance).clearCurrencyCode();
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((Money)this.instance).clearNanos();
            return this;
        }

        public Builder clearUnits() {
            this.copyOnWrite();
            ((Money)this.instance).clearUnits();
            return this;
        }

        public String getCurrencyCode() {
            return ((Money)this.instance).getCurrencyCode();
        }

        public ByteString getCurrencyCodeBytes() {
            return ((Money)this.instance).getCurrencyCodeBytes();
        }

        public int getNanos() {
            return ((Money)this.instance).getNanos();
        }

        public long getUnits() {
            return ((Money)this.instance).getUnits();
        }

        public Builder setCurrencyCode(String string) {
            this.copyOnWrite();
            ((Money)this.instance).setCurrencyCode(string);
            return this;
        }

        public Builder setCurrencyCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Money)this.instance).setCurrencyCodeBytes(byteString);
            return this;
        }

        public Builder setNanos(int n) {
            this.copyOnWrite();
            ((Money)this.instance).setNanos(n);
            return this;
        }

        public Builder setUnits(long l) {
            this.copyOnWrite();
            ((Money)this.instance).setUnits(l);
            return this;
        }
    }

}

