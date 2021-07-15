/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.FloatValue
 *  com.google.protobuf.FloatValue$Builder
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.Color$1
 *  com.google.type.ColorOrBuilder
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
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.Color;
import com.google.type.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Color
extends GeneratedMessageLite<Color, Builder>
implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser<Color> PARSER;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    static {
        Color color;
        DEFAULT_INSTANCE = color = new Color();
        GeneratedMessageLite.registerDefaultInstance(Color.class, (GeneratedMessageLite)color);
    }

    private Color() {
    }

    private void clearAlpha() {
        this.alpha_ = null;
    }

    private void clearBlue() {
        this.blue_ = 0.0f;
    }

    private void clearGreen() {
        this.green_ = 0.0f;
    }

    private void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAlpha(FloatValue floatValue) {
        floatValue.getClass();
        FloatValue floatValue2 = this.alpha_;
        if (floatValue2 != null && floatValue2 != FloatValue.getDefaultInstance()) {
            this.alpha_ = (FloatValue)((FloatValue.Builder)FloatValue.newBuilder((FloatValue)this.alpha_).mergeFrom((GeneratedMessageLite)floatValue)).buildPartial();
            return;
        }
        this.alpha_ = floatValue;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Color color) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)color);
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Color)Color.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)Color.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Color parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Color parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Color parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Color parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Color> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlpha(FloatValue floatValue) {
        floatValue.getClass();
        this.alpha_ = floatValue;
    }

    private void setBlue(float f) {
        this.blue_ = f;
    }

    private void setGreen(float f) {
        this.green_ = f;
    }

    private void setRed(float f) {
        this.red_ = f;
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
                Parser<Color> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Color> class_ = Color.class;
                synchronized (Color.class) {
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
                Object[] arrobject = new Object[]{"red_", "green_", "blue_", "alpha_"};
                return Color.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Color();
    }

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        if (floatValue == null) {
            floatValue = FloatValue.getDefaultInstance();
        }
        return floatValue;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public boolean hasAlpha() {
        return this.alpha_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Color, Builder>
    implements ColorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAlpha() {
            this.copyOnWrite();
            ((Color)this.instance).clearAlpha();
            return this;
        }

        public Builder clearBlue() {
            this.copyOnWrite();
            ((Color)this.instance).clearBlue();
            return this;
        }

        public Builder clearGreen() {
            this.copyOnWrite();
            ((Color)this.instance).clearGreen();
            return this;
        }

        public Builder clearRed() {
            this.copyOnWrite();
            ((Color)this.instance).clearRed();
            return this;
        }

        public FloatValue getAlpha() {
            return ((Color)this.instance).getAlpha();
        }

        public float getBlue() {
            return ((Color)this.instance).getBlue();
        }

        public float getGreen() {
            return ((Color)this.instance).getGreen();
        }

        public float getRed() {
            return ((Color)this.instance).getRed();
        }

        public boolean hasAlpha() {
            return ((Color)this.instance).hasAlpha();
        }

        public Builder mergeAlpha(FloatValue floatValue) {
            this.copyOnWrite();
            ((Color)this.instance).mergeAlpha(floatValue);
            return this;
        }

        public Builder setAlpha(FloatValue.Builder builder) {
            this.copyOnWrite();
            ((Color)this.instance).setAlpha((FloatValue)builder.build());
            return this;
        }

        public Builder setAlpha(FloatValue floatValue) {
            this.copyOnWrite();
            ((Color)this.instance).setAlpha(floatValue);
            return this;
        }

        public Builder setBlue(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setBlue(f);
            return this;
        }

        public Builder setGreen(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setGreen(f);
            return this;
        }

        public Builder setRed(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setRed(f);
            return this;
        }
    }

}

