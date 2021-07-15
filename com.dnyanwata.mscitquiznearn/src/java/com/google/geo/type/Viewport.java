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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.geo.type;

import com.google.geo.type.Viewport;
import com.google.geo.type.ViewportOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Viewport
extends GeneratedMessageLite<Viewport, Builder>
implements ViewportOrBuilder {
    private static final Viewport DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser<Viewport> PARSER;
    private LatLng high_;
    private LatLng low_;

    static {
        Viewport viewport;
        DEFAULT_INSTANCE = viewport = new Viewport();
        GeneratedMessageLite.registerDefaultInstance(Viewport.class, (GeneratedMessageLite)viewport);
    }

    private Viewport() {
    }

    private void clearHigh() {
        this.high_ = null;
    }

    private void clearLow() {
        this.low_ = null;
    }

    public static Viewport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeHigh(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.high_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.high_ = (LatLng)((LatLng.Builder)LatLng.newBuilder(this.high_).mergeFrom((GeneratedMessageLite)latLng)).buildPartial();
            return;
        }
        this.high_ = latLng;
    }

    private void mergeLow(LatLng latLng) {
        latLng.getClass();
        LatLng latLng2 = this.low_;
        if (latLng2 != null && latLng2 != LatLng.getDefaultInstance()) {
            this.low_ = (LatLng)((LatLng.Builder)LatLng.newBuilder(this.low_).mergeFrom((GeneratedMessageLite)latLng)).buildPartial();
            return;
        }
        this.low_ = latLng;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Viewport viewport) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)viewport);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Viewport)Viewport.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Viewport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport)Viewport.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Viewport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Viewport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Viewport parseFrom(InputStream inputStream) throws IOException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Viewport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Viewport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Viewport parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Viewport parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Viewport)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Viewport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHigh(LatLng latLng) {
        latLng.getClass();
        this.high_ = latLng;
    }

    private void setLow(LatLng latLng) {
        latLng.getClass();
        this.low_ = latLng;
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
                Parser<Viewport> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Viewport> class_ = Viewport.class;
                synchronized (Viewport.class) {
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
                Object[] arrobject = new Object[]{"low_", "high_"};
                return Viewport.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Viewport();
    }

    @Override
    public LatLng getHigh() {
        LatLng latLng = this.high_;
        if (latLng == null) {
            latLng = LatLng.getDefaultInstance();
        }
        return latLng;
    }

    @Override
    public LatLng getLow() {
        LatLng latLng = this.low_;
        if (latLng == null) {
            latLng = LatLng.getDefaultInstance();
        }
        return latLng;
    }

    @Override
    public boolean hasHigh() {
        return this.high_ != null;
    }

    @Override
    public boolean hasLow() {
        return this.low_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Viewport, Builder>
    implements ViewportOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearHigh() {
            this.copyOnWrite();
            ((Viewport)this.instance).clearHigh();
            return this;
        }

        public Builder clearLow() {
            this.copyOnWrite();
            ((Viewport)this.instance).clearLow();
            return this;
        }

        @Override
        public LatLng getHigh() {
            return ((Viewport)this.instance).getHigh();
        }

        @Override
        public LatLng getLow() {
            return ((Viewport)this.instance).getLow();
        }

        @Override
        public boolean hasHigh() {
            return ((Viewport)this.instance).hasHigh();
        }

        @Override
        public boolean hasLow() {
            return ((Viewport)this.instance).hasLow();
        }

        public Builder mergeHigh(LatLng latLng) {
            this.copyOnWrite();
            ((Viewport)this.instance).mergeHigh(latLng);
            return this;
        }

        public Builder mergeLow(LatLng latLng) {
            this.copyOnWrite();
            ((Viewport)this.instance).mergeLow(latLng);
            return this;
        }

        public Builder setHigh(LatLng.Builder builder) {
            this.copyOnWrite();
            ((Viewport)this.instance).setHigh((LatLng)builder.build());
            return this;
        }

        public Builder setHigh(LatLng latLng) {
            this.copyOnWrite();
            ((Viewport)this.instance).setHigh(latLng);
            return this;
        }

        public Builder setLow(LatLng.Builder builder) {
            this.copyOnWrite();
            ((Viewport)this.instance).setLow((LatLng)builder.build());
            return this;
        }

        public Builder setLow(LatLng latLng) {
            this.copyOnWrite();
            ((Viewport)this.instance).setLow(latLng);
            return this;
        }
    }

}

