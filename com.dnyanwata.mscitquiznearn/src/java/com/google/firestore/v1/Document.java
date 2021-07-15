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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

public final class Document
extends GeneratedMessageLite<Document, Builder>
implements DocumentOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final Document DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Document> PARSER;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private Timestamp createTime_;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Timestamp updateTime_;

    static {
        Document document;
        DEFAULT_INSTANCE = document = new Document();
        GeneratedMessageLite.registerDefaultInstance(Document.class, (GeneratedMessageLite)document);
    }

    private Document() {
    }

    private void clearCreateTime() {
        this.createTime_ = null;
    }

    private void clearName() {
        this.name_ = Document.getDefaultInstance().getName();
    }

    private void clearUpdateTime() {
        this.updateTime_ = null;
    }

    public static Document getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Value> getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    private void mergeCreateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.createTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.createTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.createTime_ = timestamp;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.updateTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.updateTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.updateTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Document document) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)document);
    }

    public static Document parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Document)Document.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Document parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)Document.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Document parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Document parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(InputStream inputStream) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Document parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Document parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Document parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Document> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCreateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.createTime_ = timestamp;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        Document.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.updateTime_ = timestamp;
    }

    @Override
    public boolean containsFields(String string) {
        string.getClass();
        return this.internalGetFields().containsKey((Object)string);
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
                Parser<Document> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Document> class_ = Document.class;
                synchronized (Document.class) {
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
                Object[] arrobject = new Object[]{"name_", "fields_", FieldsDefaultEntryHolder.defaultEntry, "createTime_", "updateTime_"};
                return Document.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u00022\u0003\t\u0004\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Document();
    }

    @Override
    public Timestamp getCreateTime() {
        Timestamp timestamp = this.createTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Deprecated
    @Override
    public Map<String, Value> getFields() {
        return this.getFieldsMap();
    }

    @Override
    public int getFieldsCount() {
        return this.internalGetFields().size();
    }

    @Override
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.internalGetFields());
    }

    @Override
    public Value getFieldsOrDefault(String string, Value value) {
        string.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
        if (mapFieldLite.containsKey((Object)string)) {
            value = (Value)mapFieldLite.get((Object)string);
        }
        return value;
    }

    @Override
    public Value getFieldsOrThrow(String string) {
        string.getClass();
        MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
        if (mapFieldLite.containsKey((Object)string)) {
            return (Value)mapFieldLite.get((Object)string);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public boolean hasCreateTime() {
        return this.createTime_ != null;
    }

    @Override
    public boolean hasUpdateTime() {
        return this.updateTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Document, Builder>
    implements DocumentOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCreateTime() {
            this.copyOnWrite();
            ((Document)this.instance).clearCreateTime();
            return this;
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Document)this.instance).clearName();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((Document)this.instance).clearUpdateTime();
            return this;
        }

        @Override
        public boolean containsFields(String string) {
            string.getClass();
            return ((Document)this.instance).getFieldsMap().containsKey((Object)string);
        }

        @Override
        public Timestamp getCreateTime() {
            return ((Document)this.instance).getCreateTime();
        }

        @Deprecated
        @Override
        public Map<String, Value> getFields() {
            return this.getFieldsMap();
        }

        @Override
        public int getFieldsCount() {
            return ((Document)this.instance).getFieldsMap().size();
        }

        @Override
        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Document)this.instance).getFieldsMap());
        }

        @Override
        public Value getFieldsOrDefault(String string, Value value) {
            string.getClass();
            Map<String, Value> map = ((Document)this.instance).getFieldsMap();
            if (map.containsKey((Object)string)) {
                value = (Value)map.get((Object)string);
            }
            return value;
        }

        @Override
        public Value getFieldsOrThrow(String string) {
            string.getClass();
            Map<String, Value> map = ((Document)this.instance).getFieldsMap();
            if (map.containsKey((Object)string)) {
                return (Value)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public String getName() {
            return ((Document)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Document)this.instance).getNameBytes();
        }

        @Override
        public Timestamp getUpdateTime() {
            return ((Document)this.instance).getUpdateTime();
        }

        @Override
        public boolean hasCreateTime() {
            return ((Document)this.instance).hasCreateTime();
        }

        @Override
        public boolean hasUpdateTime() {
            return ((Document)this.instance).hasUpdateTime();
        }

        public Builder mergeCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).mergeCreateTime(timestamp);
            return this;
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder putAllFields(Map<String, Value> map) {
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }

        public Builder putFields(String string, Value value) {
            string.getClass();
            value.getClass();
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().put((Object)string, (Object)value);
            return this;
        }

        public Builder removeFields(String string) {
            string.getClass();
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().remove((Object)string);
            return this;
        }

        public Builder setCreateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Document)this.instance).setCreateTime((Timestamp)builder.build());
            return this;
        }

        public Builder setCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).setCreateTime(timestamp);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Document)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Document)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Document)this.instance).setUpdateTime((Timestamp)builder.build());
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

