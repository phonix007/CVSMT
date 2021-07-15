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
package com.google.api;

import com.google.api.Control;
import com.google.api.ControlOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Control
extends GeneratedMessageLite<Control, Builder>
implements ControlOrBuilder {
    private static final Control DEFAULT_INSTANCE;
    public static final int ENVIRONMENT_FIELD_NUMBER = 1;
    private static volatile Parser<Control> PARSER;
    private String environment_ = "";

    static {
        Control control;
        DEFAULT_INSTANCE = control = new Control();
        GeneratedMessageLite.registerDefaultInstance(Control.class, (GeneratedMessageLite)control);
    }

    private Control() {
    }

    private void clearEnvironment() {
        this.environment_ = Control.getDefaultInstance().getEnvironment();
    }

    public static Control getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Control control) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)control);
    }

    public static Control parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Control)Control.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Control parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control)Control.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Control parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Control parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Control parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Control parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Control parseFrom(InputStream inputStream) throws IOException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Control parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Control parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Control parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Control parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Control parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Control)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Control> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEnvironment(String string) {
        string.getClass();
        this.environment_ = string;
    }

    private void setEnvironmentBytes(ByteString byteString) {
        Control.checkByteStringIsUtf8((ByteString)byteString);
        this.environment_ = byteString.toStringUtf8();
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
                Parser<Control> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Control> class_ = Control.class;
                synchronized (Control.class) {
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
                Object[] arrobject = new Object[]{"environment_"};
                return Control.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Control();
    }

    @Override
    public String getEnvironment() {
        return this.environment_;
    }

    @Override
    public ByteString getEnvironmentBytes() {
        return ByteString.copyFromUtf8((String)this.environment_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Control, Builder>
    implements ControlOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearEnvironment() {
            this.copyOnWrite();
            ((Control)this.instance).clearEnvironment();
            return this;
        }

        @Override
        public String getEnvironment() {
            return ((Control)this.instance).getEnvironment();
        }

        @Override
        public ByteString getEnvironmentBytes() {
            return ((Control)this.instance).getEnvironmentBytes();
        }

        public Builder setEnvironment(String string) {
            this.copyOnWrite();
            ((Control)this.instance).setEnvironment(string);
            return this;
        }

        public Builder setEnvironmentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Control)this.instance).setEnvironmentBytes(byteString);
            return this;
        }
    }

}

