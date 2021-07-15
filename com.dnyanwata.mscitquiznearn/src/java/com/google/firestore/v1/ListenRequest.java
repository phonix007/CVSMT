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
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.Map
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenRequestOrBuilder;
import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
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
import java.util.Map;

public final class ListenRequest
extends GeneratedMessageLite<ListenRequest, Builder>
implements ListenRequestOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ListenRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<ListenRequest> PARSER;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private String database_ = "";
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private int targetChangeCase_ = 0;
    private Object targetChange_;

    static {
        ListenRequest listenRequest;
        DEFAULT_INSTANCE = listenRequest = new ListenRequest();
        GeneratedMessageLite.registerDefaultInstance(ListenRequest.class, (GeneratedMessageLite)listenRequest);
    }

    private ListenRequest() {
    }

    private void clearAddTarget() {
        if (this.targetChangeCase_ == 2) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    private void clearDatabase() {
        this.database_ = ListenRequest.getDefaultInstance().getDatabase();
    }

    private void clearRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    private void clearTargetChange() {
        this.targetChangeCase_ = 0;
        this.targetChange_ = null;
    }

    public static ListenRequest getDefaultInstance() {
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

    private void mergeAddTarget(Target target) {
        target.getClass();
        this.targetChange_ = this.targetChangeCase_ == 2 && this.targetChange_ != Target.getDefaultInstance() ? ((Target.Builder)Target.newBuilder((Target)this.targetChange_).mergeFrom((GeneratedMessageLite)target)).buildPartial() : target;
        this.targetChangeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ListenRequest listenRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)listenRequest);
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenRequest)ListenRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)ListenRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListenRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ListenRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListenRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListenRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddTarget(Target target) {
        target.getClass();
        this.targetChange_ = target;
        this.targetChangeCase_ = 2;
    }

    private void setDatabase(String string) {
        string.getClass();
        this.database_ = string;
    }

    private void setDatabaseBytes(ByteString byteString) {
        ListenRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.database_ = byteString.toStringUtf8();
    }

    private void setRemoveTarget(int n) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = n;
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
                Parser<ListenRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ListenRequest> class_ = ListenRequest.class;
                synchronized (ListenRequest.class) {
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
                Object[] arrobject = new Object[]{"targetChange_", "targetChangeCase_", "database_", Target.class, "labels_", LabelsDefaultEntryHolder.defaultEntry};
                return ListenRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002<\u0000\u00037\u0000\u00042", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ListenRequest();
    }

    @Override
    public Target getAddTarget() {
        if (this.targetChangeCase_ == 2) {
            return (Target)this.targetChange_;
        }
        return Target.getDefaultInstance();
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
    public int getRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            return (Integer)this.targetChange_;
        }
        return 0;
    }

    @Override
    public TargetChangeCase getTargetChangeCase() {
        return TargetChangeCase.forNumber(this.targetChangeCase_);
    }

    @Override
    public boolean hasAddTarget() {
        return this.targetChangeCase_ == 2;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListenRequest, Builder>
    implements ListenRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAddTarget() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearAddTarget();
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearRemoveTarget() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearRemoveTarget();
            return this;
        }

        public Builder clearTargetChange() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearTargetChange();
            return this;
        }

        @Override
        public boolean containsLabels(String string) {
            string.getClass();
            return ((ListenRequest)this.instance).getLabelsMap().containsKey((Object)string);
        }

        @Override
        public Target getAddTarget() {
            return ((ListenRequest)this.instance).getAddTarget();
        }

        @Override
        public String getDatabase() {
            return ((ListenRequest)this.instance).getDatabase();
        }

        @Override
        public ByteString getDatabaseBytes() {
            return ((ListenRequest)this.instance).getDatabaseBytes();
        }

        @Deprecated
        @Override
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        @Override
        public int getLabelsCount() {
            return ((ListenRequest)this.instance).getLabelsMap().size();
        }

        @Override
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((ListenRequest)this.instance).getLabelsMap());
        }

        @Override
        public String getLabelsOrDefault(String string, String string2) {
            string.getClass();
            Map<String, String> map = ((ListenRequest)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                string2 = (String)map.get((Object)string);
            }
            return string2;
        }

        @Override
        public String getLabelsOrThrow(String string) {
            string.getClass();
            Map<String, String> map = ((ListenRequest)this.instance).getLabelsMap();
            if (map.containsKey((Object)string)) {
                return (String)map.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        @Override
        public int getRemoveTarget() {
            return ((ListenRequest)this.instance).getRemoveTarget();
        }

        @Override
        public TargetChangeCase getTargetChangeCase() {
            return ((ListenRequest)this.instance).getTargetChangeCase();
        }

        @Override
        public boolean hasAddTarget() {
            return ((ListenRequest)this.instance).hasAddTarget();
        }

        public Builder mergeAddTarget(Target target) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).mergeAddTarget(target);
            return this;
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string, String string2) {
            string.getClass();
            string2.getClass();
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
            return this;
        }

        public Builder removeLabels(String string) {
            string.getClass();
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().remove((Object)string);
            return this;
        }

        public Builder setAddTarget(Target.Builder builder) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setAddTarget((Target)builder.build());
            return this;
        }

        public Builder setAddTarget(Target target) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setAddTarget(target);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setRemoveTarget(int n) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setRemoveTarget(n);
            return this;
        }
    }

}

