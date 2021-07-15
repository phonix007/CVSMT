/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteRequestOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WriteRequest
extends GeneratedMessageLite<WriteRequest, Builder>
implements WriteRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final WriteRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile Parser<WriteRequest> PARSER;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private String database_ = "";
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.EMPTY;
    private Internal.ProtobufList<Write> writes_ = WriteRequest.emptyProtobufList();

    static {
        WriteRequest writeRequest;
        DEFAULT_INSTANCE = writeRequest = new WriteRequest();
        GeneratedMessageLite.registerDefaultInstance(WriteRequest.class, (GeneratedMessageLite)writeRequest);
    }

    private WriteRequest() {
    }

    private void addAllWrites(Iterable<? extends Write> iterable) {
        this.ensureWritesIsMutable();
        AbstractMessageLite.addAll(iterable, this.writes_);
    }

    private void addWrites(int n, Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.add(n, (Object)write);
    }

    private void addWrites(Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.add((Object)write);
    }

    private void clearDatabase() {
        this.database_ = WriteRequest.getDefaultInstance().getDatabase();
    }

    private void clearStreamId() {
        this.streamId_ = WriteRequest.getDefaultInstance().getStreamId();
    }

    private void clearStreamToken() {
        this.streamToken_ = WriteRequest.getDefaultInstance().getStreamToken();
    }

    private void clearWrites() {
        this.writes_ = WriteRequest.emptyProtobufList();
    }

    private void ensureWritesIsMutable() {
        Internal.ProtobufList<Write> protobufList = this.writes_;
        if (!protobufList.isModifiable()) {
            this.writes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static WriteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite<String, String> internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(WriteRequest writeRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)writeRequest);
    }

    public static WriteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteRequest)WriteRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)WriteRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(InputStream inputStream) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static WriteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrites(int n) {
        this.ensureWritesIsMutable();
        this.writes_.remove(n);
    }

    private void setDatabase(String string) {
        string.getClass();
        this.database_ = string;
    }

    private void setDatabaseBytes(ByteString byteString) {
        WriteRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.database_ = byteString.toStringUtf8();
    }

    private void setStreamId(String string) {
        string.getClass();
        this.streamId_ = string;
    }

    private void setStreamIdBytes(ByteString byteString) {
        WriteRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.streamId_ = byteString.toStringUtf8();
    }

    private void setStreamToken(ByteString byteString) {
        byteString.getClass();
        this.streamToken_ = byteString;
    }

    private void setWrites(int n, Write write) {
        write.getClass();
        this.ensureWritesIsMutable();
        this.writes_.set(n, (Object)write);
    }

    @Override
    public boolean containsLabels(String string) {
        string.getClass();
        return this.internalGetLabels().containsKey((Object)string);
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
                Parser<WriteRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<WriteRequest> class_ = WriteRequest.class;
                synchronized (WriteRequest.class) {
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
                Object[] arrobject = new Object[]{"database_", "streamId_", "writes_", Write.class, "streamToken_", "labels_", LabelsDefaultEntryHolder.defaultEntry};
                return WriteRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\n\u00052", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new WriteRequest();
    }

    @Override
    public String getDatabase() {
        return this.database_;
    }

    @Override
    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    @Deprecated
    @Override
    public Map<String, String> getLabels() {
        return this.getLabelsMap();
    }

    @Override
    public int getLabelsCount() {
        return this.internalGetLabels().size();
    }

    @Override
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    @Override
    public String getLabelsOrDefault(String string, String string2) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            string2 = (String)mapFieldLite.get((Object)string);
        }
        return string2;
    }

    @Override
    public String getLabelsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
        if (mapFieldLite.containsKey((Object)string)) {
            return (String)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String getStreamId() {
        return this.streamId_;
    }

    @Override
    public ByteString getStreamIdBytes() {
        return ByteString.copyFromUtf8((String)this.streamId_);
    }

    @Override
    public ByteString getStreamToken() {
        return this.streamToken_;
    }

    @Override
    public Write getWrites(int n) {
        return (Write)this.writes_.get(n);
    }

    @Override
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override
    public List<Write> getWritesList() {
        return this.writes_;
    }

    public WriteOrBuilder getWritesOrBuilder(int n) {
        return (WriteOrBuilder)this.writes_.get(n);
    }

    public List<? extends WriteOrBuilder> getWritesOrBuilderList() {
        return this.writes_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<WriteRequest, Builder>
    implements WriteRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWrites(Iterable<? extends Write> iterable) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addAllWrites((Iterable<? extends Write>)iterable);
            return this;
        }

        public Builder addWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(n, (Write)builder.build());
            return this;
        }

        public Builder addWrites(int n, Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(n, write);
            return this;
        }

        public Builder addWrites(Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites((Write)builder.build());
            return this;
        }

        public Builder addWrites(Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(write);
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearStreamId() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearStreamId();
            return this;
        }

        public Builder clearStreamToken() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearStreamToken();
            return this;
        }

        public Builder clearWrites() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearWrites();
            return this;
        }

        @Override
        public boolean containsLabels(String string) {
            string.getClass();
            return ((WriteRequest)this.instance).getLabelsMap().containsKey((Object)string);
        }

        @Override
        public String getDatabase() {
            return ((WriteRequest)this.instance).getDatabase();
        }

        @Override
        public ByteString getDatabaseBytes() {
            return ((WriteRequest)this.instance).getDatabaseBytes();
        }

        @Deprecated
        @Override
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        @Override
        public int getLabelsCount() {
            return ((WriteRequest)this.instance).getLabelsMap().size();
        }

        @Override
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((WriteRequest)this.instance).getLabelsMap());
        }

        @Override
        public String getLabelsOrDefault(String string, String string2) {
            string.getClass();
            Map<String, String> map = ((WriteRequest)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                string2 = (String)map.get((Object)string);
            }
            return string2;
        }

        @Override
        public String getLabelsOrThrow(String string) {
            string.getClass();
            Map<String, String> map = ((WriteRequest)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                return (String)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public String getStreamId() {
            return ((WriteRequest)this.instance).getStreamId();
        }

        @Override
        public ByteString getStreamIdBytes() {
            return ((WriteRequest)this.instance).getStreamIdBytes();
        }

        @Override
        public ByteString getStreamToken() {
            return ((WriteRequest)this.instance).getStreamToken();
        }

        @Override
        public Write getWrites(int n) {
            return ((WriteRequest)this.instance).getWrites(n);
        }

        @Override
        public int getWritesCount() {
            return ((WriteRequest)this.instance).getWritesCount();
        }

        @Override
        public List<Write> getWritesList() {
            return Collections.unmodifiableList(((WriteRequest)this.instance).getWritesList());
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string, String string2) {
            string.getClass();
            string2.getClass();
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
            return this;
        }

        public Builder removeLabels(String string) {
            string.getClass();
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().remove((Object)string);
            return this;
        }

        public Builder removeWrites(int n) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).removeWrites(n);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setStreamId(String string) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamId(string);
            return this;
        }

        public Builder setStreamIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamIdBytes(byteString);
            return this;
        }

        public Builder setStreamToken(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamToken(byteString);
            return this;
        }

        public Builder setWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setWrites(n, (Write)builder.build());
            return this;
        }

        public Builder setWrites(int n, Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setWrites(n, write);
            return this;
        }
    }

}

