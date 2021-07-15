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
package com.google.api;

import com.google.api.Usage;
import com.google.api.UsageOrBuilder;
import com.google.api.UsageRule;
import com.google.api.UsageRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Usage
extends GeneratedMessageLite<Usage, Builder>
implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile Parser<Usage> PARSER;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private String producerNotificationChannel_ = "";
    private Internal.ProtobufList<String> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<UsageRule> rules_ = Usage.emptyProtobufList();

    static {
        Usage usage;
        DEFAULT_INSTANCE = usage = new Usage();
        GeneratedMessageLite.registerDefaultInstance(Usage.class, (GeneratedMessageLite)usage);
    }

    private Usage() {
    }

    private void addAllRequirements(Iterable<String> iterable) {
        this.ensureRequirementsIsMutable();
        AbstractMessageLite.addAll(iterable, this.requirements_);
    }

    private void addAllRules(Iterable<? extends UsageRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRequirements(String string) {
        string.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.add((Object)string);
    }

    private void addRequirementsBytes(ByteString byteString) {
        Usage.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureRequirementsIsMutable();
        this.requirements_.add((Object)byteString.toStringUtf8());
    }

    private void addRules(int n, UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)usageRule);
    }

    private void addRules(UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.add((Object)usageRule);
    }

    private void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = Usage.getDefaultInstance().getProducerNotificationChannel();
    }

    private void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Usage.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.requirements_;
        if (!protobufList.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureRulesIsMutable() {
        Internal.ProtobufList<UsageRule> protobufList = this.rules_;
        if (!protobufList.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Usage usage) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage)Usage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)Usage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Usage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Usage parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Usage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setProducerNotificationChannel(String string) {
        string.getClass();
        this.producerNotificationChannel_ = string;
    }

    private void setProducerNotificationChannelBytes(ByteString byteString) {
        Usage.checkByteStringIsUtf8((ByteString)byteString);
        this.producerNotificationChannel_ = byteString.toStringUtf8();
    }

    private void setRequirements(int n, String string) {
        string.getClass();
        this.ensureRequirementsIsMutable();
        this.requirements_.set(n, (Object)string);
    }

    private void setRules(int n, UsageRule usageRule) {
        usageRule.getClass();
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)usageRule);
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
                Parser<Usage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Usage> class_ = Usage.class;
                synchronized (Usage.class) {
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
                Object[] arrobject = new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"};
                return Usage.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001\u021a\u0006\u001b\u0007\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Usage();
    }

    @Override
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    @Override
    public ByteString getProducerNotificationChannelBytes() {
        return ByteString.copyFromUtf8((String)this.producerNotificationChannel_);
    }

    @Override
    public String getRequirements(int n) {
        return (String)this.requirements_.get(n);
    }

    @Override
    public ByteString getRequirementsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.requirements_.get(n)));
    }

    @Override
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override
    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    @Override
    public UsageRule getRules(int n) {
        return (UsageRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int n) {
        return (UsageRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends UsageRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Usage, Builder>
    implements UsageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRequirements(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Usage)this.instance).addAllRequirements((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends UsageRule> iterable) {
            this.copyOnWrite();
            ((Usage)this.instance).addAllRules((Iterable<? extends UsageRule>)iterable);
            return this;
        }

        public Builder addRequirements(String string) {
            this.copyOnWrite();
            ((Usage)this.instance).addRequirements(string);
            return this;
        }

        public Builder addRequirementsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Usage)this.instance).addRequirementsBytes(byteString);
            return this;
        }

        public Builder addRules(int n, UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(n, (UsageRule)builder.build());
            return this;
        }

        public Builder addRules(int n, UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(n, usageRule);
            return this;
        }

        public Builder addRules(UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules((UsageRule)builder.build());
            return this;
        }

        public Builder addRules(UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(usageRule);
            return this;
        }

        public Builder clearProducerNotificationChannel() {
            this.copyOnWrite();
            ((Usage)this.instance).clearProducerNotificationChannel();
            return this;
        }

        public Builder clearRequirements() {
            this.copyOnWrite();
            ((Usage)this.instance).clearRequirements();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Usage)this.instance).clearRules();
            return this;
        }

        @Override
        public String getProducerNotificationChannel() {
            return ((Usage)this.instance).getProducerNotificationChannel();
        }

        @Override
        public ByteString getProducerNotificationChannelBytes() {
            return ((Usage)this.instance).getProducerNotificationChannelBytes();
        }

        @Override
        public String getRequirements(int n) {
            return ((Usage)this.instance).getRequirements(n);
        }

        @Override
        public ByteString getRequirementsBytes(int n) {
            return ((Usage)this.instance).getRequirementsBytes(n);
        }

        @Override
        public int getRequirementsCount() {
            return ((Usage)this.instance).getRequirementsCount();
        }

        @Override
        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((Usage)this.instance).getRequirementsList());
        }

        @Override
        public UsageRule getRules(int n) {
            return ((Usage)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Usage)this.instance).getRulesCount();
        }

        @Override
        public List<UsageRule> getRulesList() {
            return Collections.unmodifiableList(((Usage)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Usage)this.instance).removeRules(n);
            return this;
        }

        public Builder setProducerNotificationChannel(String string) {
            this.copyOnWrite();
            ((Usage)this.instance).setProducerNotificationChannel(string);
            return this;
        }

        public Builder setProducerNotificationChannelBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Usage)this.instance).setProducerNotificationChannelBytes(byteString);
            return this;
        }

        public Builder setRequirements(int n, String string) {
            this.copyOnWrite();
            ((Usage)this.instance).setRequirements(n, string);
            return this;
        }

        public Builder setRules(int n, UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).setRules(n, (UsageRule)builder.build());
            return this;
        }

        public Builder setRules(int n, UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).setRules(n, usageRule);
            return this;
        }
    }

}

