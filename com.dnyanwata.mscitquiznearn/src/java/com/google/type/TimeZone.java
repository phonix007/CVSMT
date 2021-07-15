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
 *  com.google.type.TimeZone$1
 *  com.google.type.TimeZoneOrBuilder
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
import com.google.type.TimeZone;
import com.google.type.TimeZoneOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TimeZone
extends GeneratedMessageLite<TimeZone, Builder>
implements TimeZoneOrBuilder {
    private static final TimeZone DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<TimeZone> PARSER;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String id_ = "";
    private String version_ = "";

    static {
        TimeZone timeZone;
        DEFAULT_INSTANCE = timeZone = new TimeZone();
        GeneratedMessageLite.registerDefaultInstance(TimeZone.class, (GeneratedMessageLite)timeZone);
    }

    private TimeZone() {
    }

    private void clearId() {
        this.id_ = TimeZone.getDefaultInstance().getId();
    }

    private void clearVersion() {
        this.version_ = TimeZone.getDefaultInstance().getVersion();
    }

    public static TimeZone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TimeZone timeZone) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)timeZone);
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeZone)TimeZone.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TimeZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeZone)TimeZone.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeZone parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TimeZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TimeZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeZone parseFrom(InputStream inputStream) throws IOException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TimeZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static TimeZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeZone parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TimeZone parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeZone)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TimeZone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String string) {
        string.getClass();
        this.id_ = string;
    }

    private void setIdBytes(ByteString byteString) {
        TimeZone.checkByteStringIsUtf8((ByteString)byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setVersion(String string) {
        string.getClass();
        this.version_ = string;
    }

    private void setVersionBytes(ByteString byteString) {
        TimeZone.checkByteStringIsUtf8((ByteString)byteString);
        this.version_ = byteString.toStringUtf8();
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
                Parser<TimeZone> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<TimeZone> class_ = TimeZone.class;
                synchronized (TimeZone.class) {
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
                Object[] arrobject = new Object[]{"id_", "version_"};
                return TimeZone.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new TimeZone();
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8((String)this.version_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TimeZone, Builder>
    implements TimeZoneOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((TimeZone)this.instance).clearId();
            return this;
        }

        public Builder clearVersion() {
            this.copyOnWrite();
            ((TimeZone)this.instance).clearVersion();
            return this;
        }

        public String getId() {
            return ((TimeZone)this.instance).getId();
        }

        public ByteString getIdBytes() {
            return ((TimeZone)this.instance).getIdBytes();
        }

        public String getVersion() {
            return ((TimeZone)this.instance).getVersion();
        }

        public ByteString getVersionBytes() {
            return ((TimeZone)this.instance).getVersionBytes();
        }

        public Builder setId(String string) {
            this.copyOnWrite();
            ((TimeZone)this.instance).setId(string);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((TimeZone)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setVersion(String string) {
            this.copyOnWrite();
            ((TimeZone)this.instance).setVersion(string);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((TimeZone)this.instance).setVersionBytes(byteString);
            return this;
        }
    }

}

