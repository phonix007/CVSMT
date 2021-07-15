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
 *  com.google.type.Quaternion$1
 *  com.google.type.QuaternionOrBuilder
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
import com.google.type.Quaternion;
import com.google.type.QuaternionOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Quaternion
extends GeneratedMessageLite<Quaternion, Builder>
implements QuaternionOrBuilder {
    private static final Quaternion DEFAULT_INSTANCE;
    private static volatile Parser<Quaternion> PARSER;
    public static final int W_FIELD_NUMBER = 4;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private double w_;
    private double x_;
    private double y_;
    private double z_;

    static {
        Quaternion quaternion;
        DEFAULT_INSTANCE = quaternion = new Quaternion();
        GeneratedMessageLite.registerDefaultInstance(Quaternion.class, (GeneratedMessageLite)quaternion);
    }

    private Quaternion() {
    }

    private void clearW() {
        this.w_ = 0.0;
    }

    private void clearX() {
        this.x_ = 0.0;
    }

    private void clearY() {
        this.y_ = 0.0;
    }

    private void clearZ() {
        this.z_ = 0.0;
    }

    public static Quaternion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Quaternion quaternion) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)quaternion);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quaternion)Quaternion.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quaternion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion)Quaternion.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Quaternion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Quaternion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quaternion parseFrom(InputStream inputStream) throws IOException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quaternion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Quaternion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quaternion parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Quaternion parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quaternion)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Quaternion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setW(double d) {
        this.w_ = d;
    }

    private void setX(double d) {
        this.x_ = d;
    }

    private void setY(double d) {
        this.y_ = d;
    }

    private void setZ(double d) {
        this.z_ = d;
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
                Parser<Quaternion> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Quaternion> class_ = Quaternion.class;
                synchronized (Quaternion.class) {
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
                Object[] arrobject = new Object[]{"x_", "y_", "z_", "w_"};
                return Quaternion.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Quaternion();
    }

    public double getW() {
        return this.w_;
    }

    public double getX() {
        return this.x_;
    }

    public double getY() {
        return this.y_;
    }

    public double getZ() {
        return this.z_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Quaternion, Builder>
    implements QuaternionOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearW() {
            this.copyOnWrite();
            ((Quaternion)this.instance).clearW();
            return this;
        }

        public Builder clearX() {
            this.copyOnWrite();
            ((Quaternion)this.instance).clearX();
            return this;
        }

        public Builder clearY() {
            this.copyOnWrite();
            ((Quaternion)this.instance).clearY();
            return this;
        }

        public Builder clearZ() {
            this.copyOnWrite();
            ((Quaternion)this.instance).clearZ();
            return this;
        }

        public double getW() {
            return ((Quaternion)this.instance).getW();
        }

        public double getX() {
            return ((Quaternion)this.instance).getX();
        }

        public double getY() {
            return ((Quaternion)this.instance).getY();
        }

        public double getZ() {
            return ((Quaternion)this.instance).getZ();
        }

        public Builder setW(double d) {
            this.copyOnWrite();
            ((Quaternion)this.instance).setW(d);
            return this;
        }

        public Builder setX(double d) {
            this.copyOnWrite();
            ((Quaternion)this.instance).setX(d);
            return this;
        }

        public Builder setY(double d) {
            this.copyOnWrite();
            ((Quaternion)this.instance).setY(d);
            return this;
        }

        public Builder setZ(double d) {
            this.copyOnWrite();
            ((Quaternion)this.instance).setZ(d);
            return this;
        }
    }

}

