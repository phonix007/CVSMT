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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Struct
 *  com.google.protobuf.Struct$Builder
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.api;

import com.google.api.MonitoredResourceMetadata;
import com.google.api.MonitoredResourceMetadataOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class MonitoredResourceMetadata
extends GeneratedMessageLite<MonitoredResourceMetadata, Builder>
implements MonitoredResourceMetadataOrBuilder {
    private static final MonitoredResourceMetadata DEFAULT_INSTANCE;
    private static volatile Parser<MonitoredResourceMetadata> PARSER;
    public static final int SYSTEM_LABELS_FIELD_NUMBER = 1;
    public static final int USER_LABELS_FIELD_NUMBER = 2;
    private Struct systemLabels_;
    private MapFieldLite<String, String> userLabels_ = MapFieldLite.emptyMapField();

    static {
        MonitoredResourceMetadata monitoredResourceMetadata;
        DEFAULT_INSTANCE = monitoredResourceMetadata = new MonitoredResourceMetadata();
        GeneratedMessageLite.registerDefaultInstance(MonitoredResourceMetadata.class, (GeneratedMessageLite)monitoredResourceMetadata);
    }

    private MonitoredResourceMetadata() {
    }

    private void clearSystemLabels() {
        this.systemLabels_ = null;
    }

    public static MonitoredResourceMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableUserLabelsMap() {
        return this.internalGetMutableUserLabels();
    }

    private MapFieldLite<String, String> internalGetMutableUserLabels() {
        if (!this.userLabels_.isMutable()) {
            this.userLabels_ = this.userLabels_.mutableCopy();
        }
        return this.userLabels_;
    }

    private MapFieldLite<String, String> internalGetUserLabels() {
        return this.userLabels_;
    }

    private void mergeSystemLabels(Struct struct) {
        struct.getClass();
        Struct struct2 = this.systemLabels_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.systemLabels_ = (Struct)((Struct.Builder)Struct.newBuilder((Struct)this.systemLabels_).mergeFrom((GeneratedMessageLite)struct)).buildPartial();
            return;
        }
        this.systemLabels_ = struct;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(MonitoredResourceMetadata monitoredResourceMetadata) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)monitoredResourceMetadata);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata)MonitoredResourceMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResourceMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceMetadata)MonitoredResourceMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MonitoredResourceMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MonitoredResourceMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResourceMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static MonitoredResourceMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MonitoredResourceMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResourceMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MonitoredResourceMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSystemLabels(Struct struct) {
        struct.getClass();
        this.systemLabels_ = struct;
    }

    @Override
    public boolean containsUserLabels(String string) {
        string.getClass();
        return this.internalGetUserLabels().containsKey((Object)string);
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
                Parser<MonitoredResourceMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<MonitoredResourceMetadata> class_ = MonitoredResourceMetadata.class;
                synchronized (MonitoredResourceMetadata.class) {
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
                Object[] arrobject = new Object[]{"systemLabels_", "userLabels_", UserLabelsDefaultEntryHolder.defaultEntry};
                return MonitoredResourceMetadata.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\t\u00022", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new MonitoredResourceMetadata();
    }

    @Override
    public Struct getSystemLabels() {
        Struct struct = this.systemLabels_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    @Deprecated
    @Override
    public Map<String, String> getUserLabels() {
        return this.getUserLabelsMap();
    }

    @Override
    public int getUserLabelsCount() {
        return this.internalGetUserLabels().size();
    }

    @Override
    public Map<String, String> getUserLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetUserLabels());
    }

    @Override
    public String getUserLabelsOrDefault(String string, String string2) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetUserLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            string2 = (String)mapFieldLite.get((Object)string);
        }
        return string2;
    }

    @Override
    public String getUserLabelsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetUserLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            return (String)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean hasSystemLabels() {
        return this.systemLabels_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MonitoredResourceMetadata, Builder>
    implements MonitoredResourceMetadataOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearSystemLabels() {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).clearSystemLabels();
            return this;
        }

        public Builder clearUserLabels() {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).getMutableUserLabelsMap().clear();
            return this;
        }

        @Override
        public boolean containsUserLabels(String string) {
            string.getClass();
            return ((MonitoredResourceMetadata)this.instance).getUserLabelsMap().containsKey((Object)string);
        }

        @Override
        public Struct getSystemLabels() {
            return ((MonitoredResourceMetadata)this.instance).getSystemLabels();
        }

        @Deprecated
        @Override
        public Map<String, String> getUserLabels() {
            return this.getUserLabelsMap();
        }

        @Override
        public int getUserLabelsCount() {
            return ((MonitoredResourceMetadata)this.instance).getUserLabelsMap().size();
        }

        @Override
        public Map<String, String> getUserLabelsMap() {
            return Collections.unmodifiableMap(((MonitoredResourceMetadata)this.instance).getUserLabelsMap());
        }

        @Override
        public String getUserLabelsOrDefault(String string, String string2) {
            string.getClass();
            Map<String, String> map = ((MonitoredResourceMetadata)this.instance).getUserLabelsMap();
            if (map.containsKey((Object)string)) {
                string2 = (String)map.get((Object)string);
            }
            return string2;
        }

        @Override
        public String getUserLabelsOrThrow(String string) {
            string.getClass();
            Map<String, String> map = ((MonitoredResourceMetadata)this.instance).getUserLabelsMap();
            if (map.containsKey((Object)string)) {
                return (String)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public boolean hasSystemLabels() {
            return ((MonitoredResourceMetadata)this.instance).hasSystemLabels();
        }

        public Builder mergeSystemLabels(Struct struct) {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).mergeSystemLabels(struct);
            return this;
        }

        public Builder putAllUserLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).getMutableUserLabelsMap().putAll(map);
            return this;
        }

        public Builder putUserLabels(String string, String string2) {
            string.getClass();
            string2.getClass();
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).getMutableUserLabelsMap().put((Object)string, (Object)string2);
            return this;
        }

        public Builder removeUserLabels(String string) {
            string.getClass();
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).getMutableUserLabelsMap().remove((Object)string);
            return this;
        }

        public Builder setSystemLabels(Struct.Builder builder) {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).setSystemLabels((Struct)builder.build());
            return this;
        }

        public Builder setSystemLabels(Struct struct) {
            this.copyOnWrite();
            ((MonitoredResourceMetadata)this.instance).setSystemLabels(struct);
            return this;
        }
    }

}

