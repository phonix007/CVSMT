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
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.rpc.QuotaFailure$1
 *  com.google.rpc.QuotaFailure$ViolationOrBuilder
 *  com.google.rpc.QuotaFailureOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.QuotaFailure;
import com.google.rpc.QuotaFailureOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class QuotaFailure
extends GeneratedMessageLite<QuotaFailure, Builder>
implements QuotaFailureOrBuilder {
    private static final QuotaFailure DEFAULT_INSTANCE;
    private static volatile Parser<QuotaFailure> PARSER;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_ = QuotaFailure.emptyProtobufList();

    static {
        QuotaFailure quotaFailure;
        DEFAULT_INSTANCE = quotaFailure = new QuotaFailure();
        GeneratedMessageLite.registerDefaultInstance(QuotaFailure.class, (GeneratedMessageLite)quotaFailure);
    }

    private QuotaFailure() {
    }

    private void addAllViolations(Iterable<? extends Violation> iterable) {
        this.ensureViolationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.violations_);
    }

    private void addViolations(int n, Violation violation) {
        violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add(n, (Object)violation);
    }

    private void addViolations(Violation violation) {
        violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.add((Object)violation);
    }

    private void clearViolations() {
        this.violations_ = QuotaFailure.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        Internal.ProtobufList<Violation> protobufList = this.violations_;
        if (!protobufList.isModifiable()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static QuotaFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(QuotaFailure quotaFailure) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)quotaFailure);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure)QuotaFailure.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)QuotaFailure.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static QuotaFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static QuotaFailure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static QuotaFailure parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<QuotaFailure> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeViolations(int n) {
        this.ensureViolationsIsMutable();
        this.violations_.remove(n);
    }

    private void setViolations(int n, Violation violation) {
        violation.getClass();
        this.ensureViolationsIsMutable();
        this.violations_.set(n, (Object)violation);
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
                Parser<QuotaFailure> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<QuotaFailure> class_ = QuotaFailure.class;
                synchronized (QuotaFailure.class) {
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
                Object[] arrobject = new Object[]{"violations_", Violation.class};
                return QuotaFailure.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new QuotaFailure();
    }

    public Violation getViolations(int n) {
        return (Violation)((Object)this.violations_.get(n));
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public ViolationOrBuilder getViolationsOrBuilder(int n) {
        return this.violations_.get(n);
    }

    public List<? extends ViolationOrBuilder> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<QuotaFailure, Builder>
    implements QuotaFailureOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllViolations(Iterable<? extends Violation> iterable) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addAllViolations((Iterable<? extends Violation>)iterable);
            return this;
        }

        public Builder addViolations(int n, Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(n, (Violation)builder.build());
            return this;
        }

        public Builder addViolations(int n, Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(n, violation);
            return this;
        }

        public Builder addViolations(Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations((Violation)builder.build());
            return this;
        }

        public Builder addViolations(Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(violation);
            return this;
        }

        public Builder clearViolations() {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).clearViolations();
            return this;
        }

        public Violation getViolations(int n) {
            return ((QuotaFailure)this.instance).getViolations(n);
        }

        public int getViolationsCount() {
            return ((QuotaFailure)this.instance).getViolationsCount();
        }

        public List<Violation> getViolationsList() {
            return Collections.unmodifiableList(((QuotaFailure)this.instance).getViolationsList());
        }

        public Builder removeViolations(int n) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).removeViolations(n);
            return this;
        }

        public Builder setViolations(int n, Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).setViolations(n, (Violation)builder.build());
            return this;
        }

        public Builder setViolations(int n, Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).setViolations(n, violation);
            return this;
        }
    }

    public static final class Violation
    extends GeneratedMessageLite<Violation, Builder>
    implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<Violation> PARSER;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String description_ = "";
        private String subject_ = "";

        static {
            Violation violation;
            DEFAULT_INSTANCE = violation = new Violation();
            GeneratedMessageLite.registerDefaultInstance(Violation.class, (GeneratedMessageLite)violation);
        }

        private Violation() {
        }

        private void clearDescription() {
            this.description_ = Violation.getDefaultInstance().getDescription();
        }

        private void clearSubject() {
            this.subject_ = Violation.getDefaultInstance().getSubject();
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Violation violation) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation)Violation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)Violation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Violation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Violation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDescription(String string) {
            string.getClass();
            this.description_ = string;
        }

        private void setDescriptionBytes(ByteString byteString) {
            Violation.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
        }

        private void setSubject(String string) {
            string.getClass();
            this.subject_ = string;
        }

        private void setSubjectBytes(ByteString byteString) {
            Violation.checkByteStringIsUtf8((ByteString)byteString);
            this.subject_ = byteString.toStringUtf8();
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
                    Parser<Violation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Violation> class_ = Violation.class;
                    synchronized (Violation.class) {
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
                    Object[] arrobject = new Object[]{"subject_", "description_"};
                    return Violation.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Violation();
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8((String)this.description_);
        }

        public String getSubject() {
            return this.subject_;
        }

        public ByteString getSubjectBytes() {
            return ByteString.copyFromUtf8((String)this.subject_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Violation, Builder>
        implements ViolationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((Violation)this.instance).clearDescription();
                return this;
            }

            public Builder clearSubject() {
                this.copyOnWrite();
                ((Violation)this.instance).clearSubject();
                return this;
            }

            public String getDescription() {
                return ((Violation)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((Violation)this.instance).getDescriptionBytes();
            }

            public String getSubject() {
                return ((Violation)this.instance).getSubject();
            }

            public ByteString getSubjectBytes() {
                return ((Violation)this.instance).getSubjectBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((Violation)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Violation)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setSubject(String string) {
                this.copyOnWrite();
                ((Violation)this.instance).setSubject(string);
                return this;
            }

            public Builder setSubjectBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Violation)this.instance).setSubjectBytes(byteString);
                return this;
            }
        }

    }

}

