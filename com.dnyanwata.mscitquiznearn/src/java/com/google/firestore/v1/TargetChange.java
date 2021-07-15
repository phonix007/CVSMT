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
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TargetChange;
import com.google.firestore.v1.TargetChangeOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TargetChange
extends GeneratedMessageLite<TargetChange, Builder>
implements TargetChangeOrBuilder {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final TargetChange DEFAULT_INSTANCE;
    private static volatile Parser<TargetChange> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private Status cause_;
    private Timestamp readTime_;
    private ByteString resumeToken_ = ByteString.EMPTY;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private Internal.IntList targetIds_ = TargetChange.emptyIntList();

    static {
        TargetChange targetChange;
        DEFAULT_INSTANCE = targetChange = new TargetChange();
        GeneratedMessageLite.registerDefaultInstance(TargetChange.class, (GeneratedMessageLite)targetChange);
    }

    private TargetChange() {
    }

    private void addAllTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (List)this.targetIds_);
    }

    private void addTargetIds(int n) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.addInt(n);
    }

    private void clearCause() {
        this.cause_ = null;
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearResumeToken() {
        this.resumeToken_ = TargetChange.getDefaultInstance().getResumeToken();
    }

    private void clearTargetChangeType() {
        this.targetChangeType_ = 0;
    }

    private void clearTargetIds() {
        this.targetIds_ = TargetChange.emptyIntList();
    }

    private void ensureTargetIdsIsMutable() {
        Internal.IntList intList = this.targetIds_;
        if (!intList.isModifiable()) {
            this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)intList);
        }
    }

    public static TargetChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCause(Status status) {
        status.getClass();
        Status status2 = this.cause_;
        if (status2 != null && status2 != Status.getDefaultInstance()) {
            this.cause_ = (Status)((Status.Builder)Status.newBuilder(this.cause_).mergeFrom((GeneratedMessageLite)status)).buildPartial();
            return;
        }
        this.cause_ = status;
    }

    private void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.readTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.readTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.readTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(TargetChange targetChange) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)targetChange);
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TargetChange)TargetChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)TargetChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TargetChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(InputStream inputStream) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TargetChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static TargetChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TargetChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TargetChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCause(Status status) {
        status.getClass();
        this.cause_ = status;
    }

    private void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
    }

    private void setResumeToken(ByteString byteString) {
        byteString.getClass();
        this.resumeToken_ = byteString;
    }

    private void setTargetChangeType(TargetChangeType targetChangeType) {
        this.targetChangeType_ = targetChangeType.getNumber();
    }

    private void setTargetChangeTypeValue(int n) {
        this.targetChangeType_ = n;
    }

    private void setTargetIds(int n, int n2) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.setInt(n, n2);
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
                Parser<TargetChange> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<TargetChange> class_ = TargetChange.class;
                synchronized (TargetChange.class) {
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
                Object[] arrobject = new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"};
                return TargetChange.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new TargetChange();
    }

    @Override
    public Status getCause() {
        Status status = this.cause_;
        if (status == null) {
            status = Status.getDefaultInstance();
        }
        return status;
    }

    @Override
    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    @Override
    public ByteString getResumeToken() {
        return this.resumeToken_;
    }

    @Override
    public TargetChangeType getTargetChangeType() {
        TargetChangeType targetChangeType = TargetChangeType.forNumber(this.targetChangeType_);
        if (targetChangeType == null) {
            targetChangeType = TargetChangeType.UNRECOGNIZED;
        }
        return targetChangeType;
    }

    @Override
    public int getTargetChangeTypeValue() {
        return this.targetChangeType_;
    }

    @Override
    public int getTargetIds(int n) {
        return this.targetIds_.getInt(n);
    }

    @Override
    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    @Override
    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    @Override
    public boolean hasCause() {
        return this.cause_ != null;
    }

    @Override
    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TargetChange, Builder>
    implements TargetChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((TargetChange)this.instance).addAllTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addTargetIds(int n) {
            this.copyOnWrite();
            ((TargetChange)this.instance).addTargetIds(n);
            return this;
        }

        public Builder clearCause() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearCause();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResumeToken() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearResumeToken();
            return this;
        }

        public Builder clearTargetChangeType() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearTargetChangeType();
            return this;
        }

        public Builder clearTargetIds() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearTargetIds();
            return this;
        }

        @Override
        public Status getCause() {
            return ((TargetChange)this.instance).getCause();
        }

        @Override
        public Timestamp getReadTime() {
            return ((TargetChange)this.instance).getReadTime();
        }

        @Override
        public ByteString getResumeToken() {
            return ((TargetChange)this.instance).getResumeToken();
        }

        @Override
        public TargetChangeType getTargetChangeType() {
            return ((TargetChange)this.instance).getTargetChangeType();
        }

        @Override
        public int getTargetChangeTypeValue() {
            return ((TargetChange)this.instance).getTargetChangeTypeValue();
        }

        @Override
        public int getTargetIds(int n) {
            return ((TargetChange)this.instance).getTargetIds(n);
        }

        @Override
        public int getTargetIdsCount() {
            return ((TargetChange)this.instance).getTargetIdsCount();
        }

        @Override
        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((TargetChange)this.instance).getTargetIdsList());
        }

        @Override
        public boolean hasCause() {
            return ((TargetChange)this.instance).hasCause();
        }

        @Override
        public boolean hasReadTime() {
            return ((TargetChange)this.instance).hasReadTime();
        }

        public Builder mergeCause(Status status) {
            this.copyOnWrite();
            ((TargetChange)this.instance).mergeCause(status);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((TargetChange)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setCause(Status.Builder builder) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setCause((Status)builder.build());
            return this;
        }

        public Builder setCause(Status status) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setCause(status);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setReadTime((Timestamp)builder.build());
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setResumeToken(ByteString byteString) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setResumeToken(byteString);
            return this;
        }

        public Builder setTargetChangeType(TargetChangeType targetChangeType) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetChangeType(targetChangeType);
            return this;
        }

        public Builder setTargetChangeTypeValue(int n) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetChangeTypeValue(n);
            return this;
        }

        public Builder setTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetIds(n, n2);
            return this;
        }
    }

    public static final class TargetChangeType
    extends Enum<TargetChangeType>
    implements Internal.EnumLite {
        private static final /* synthetic */ TargetChangeType[] $VALUES;
        public static final /* enum */ TargetChangeType ADD;
        public static final int ADD_VALUE = 1;
        public static final /* enum */ TargetChangeType CURRENT;
        public static final int CURRENT_VALUE = 3;
        public static final /* enum */ TargetChangeType NO_CHANGE;
        public static final int NO_CHANGE_VALUE = 0;
        public static final /* enum */ TargetChangeType REMOVE;
        public static final int REMOVE_VALUE = 2;
        public static final /* enum */ TargetChangeType RESET;
        public static final int RESET_VALUE = 4;
        public static final /* enum */ TargetChangeType UNRECOGNIZED;
        private static final Internal.EnumLiteMap<TargetChangeType> internalValueMap;
        private final int value;

        static {
            TargetChangeType targetChangeType;
            TargetChangeType targetChangeType2;
            TargetChangeType targetChangeType3;
            TargetChangeType targetChangeType4;
            TargetChangeType targetChangeType5;
            TargetChangeType targetChangeType6;
            NO_CHANGE = targetChangeType2 = new TargetChangeType(0);
            ADD = targetChangeType3 = new TargetChangeType(1);
            REMOVE = targetChangeType6 = new TargetChangeType(2);
            CURRENT = targetChangeType5 = new TargetChangeType(3);
            RESET = targetChangeType4 = new TargetChangeType(4);
            UNRECOGNIZED = targetChangeType = new TargetChangeType(-1);
            $VALUES = new TargetChangeType[]{targetChangeType2, targetChangeType3, targetChangeType6, targetChangeType5, targetChangeType4, targetChangeType};
            internalValueMap = new Internal.EnumLiteMap<TargetChangeType>(){

                public TargetChangeType findValueByNumber(int n) {
                    return TargetChangeType.forNumber(n);
                }
            };
        }

        private TargetChangeType(int n2) {
            this.value = n2;
        }

        public static TargetChangeType forNumber(int n) {
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                return null;
                            }
                            return RESET;
                        }
                        return CURRENT;
                    }
                    return REMOVE;
                }
                return ADD;
            }
            return NO_CHANGE;
        }

        public static Internal.EnumLiteMap<TargetChangeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return TargetChangeTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static TargetChangeType valueOf(int n) {
            return TargetChangeType.forNumber(n);
        }

        public static TargetChangeType valueOf(String string) {
            return (TargetChangeType)Enum.valueOf(TargetChangeType.class, (String)string);
        }

        public static TargetChangeType[] values() {
            return (TargetChangeType[])$VALUES.clone();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        private static final class TargetChangeTypeVerifier
        implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new TargetChangeTypeVerifier();

            private TargetChangeTypeVerifier() {
            }

            public boolean isInRange(int n) {
                return TargetChangeType.forNumber(n) != null;
            }
        }

    }

}

