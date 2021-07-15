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
 *  com.google.rpc.LocalizedMessage$1
 *  com.google.rpc.LocalizedMessageOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.LocalizedMessage;
import com.google.rpc.LocalizedMessageOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LocalizedMessage
extends GeneratedMessageLite<LocalizedMessage, Builder>
implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<LocalizedMessage> PARSER;
    private String locale_ = "";
    private String message_ = "";

    static {
        LocalizedMessage localizedMessage;
        DEFAULT_INSTANCE = localizedMessage = new LocalizedMessage();
        GeneratedMessageLite.registerDefaultInstance(LocalizedMessage.class, (GeneratedMessageLite)localizedMessage);
    }

    private LocalizedMessage() {
    }

    private void clearLocale() {
        this.locale_ = LocalizedMessage.getDefaultInstance().getLocale();
    }

    private void clearMessage() {
        this.message_ = LocalizedMessage.getDefaultInstance().getMessage();
    }

    public static LocalizedMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LocalizedMessage localizedMessage) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)localizedMessage);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage)LocalizedMessage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)LocalizedMessage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LocalizedMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static LocalizedMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LocalizedMessage parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LocalizedMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLocale(String string) {
        string.getClass();
        this.locale_ = string;
    }

    private void setLocaleBytes(ByteString byteString) {
        LocalizedMessage.checkByteStringIsUtf8((ByteString)byteString);
        this.locale_ = byteString.toStringUtf8();
    }

    private void setMessage(String string) {
        string.getClass();
        this.message_ = string;
    }

    private void setMessageBytes(ByteString byteString) {
        LocalizedMessage.checkByteStringIsUtf8((ByteString)byteString);
        this.message_ = byteString.toStringUtf8();
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
                Parser<LocalizedMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<LocalizedMessage> class_ = LocalizedMessage.class;
                synchronized (LocalizedMessage.class) {
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
                Object[] arrobject = new Object[]{"locale_", "message_"};
                return LocalizedMessage.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new LocalizedMessage();
    }

    public String getLocale() {
        return this.locale_;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8((String)this.locale_);
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8((String)this.message_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LocalizedMessage, Builder>
    implements LocalizedMessageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLocale() {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).clearLocale();
            return this;
        }

        public Builder clearMessage() {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).clearMessage();
            return this;
        }

        public String getLocale() {
            return ((LocalizedMessage)this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((LocalizedMessage)this.instance).getLocaleBytes();
        }

        public String getMessage() {
            return ((LocalizedMessage)this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((LocalizedMessage)this.instance).getMessageBytes();
        }

        public Builder setLocale(String string) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setLocale(string);
            return this;
        }

        public Builder setLocaleBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setLocaleBytes(byteString);
            return this;
        }

        public Builder setMessage(String string) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setMessage(string);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setMessageBytes(byteString);
            return this;
        }
    }

}

