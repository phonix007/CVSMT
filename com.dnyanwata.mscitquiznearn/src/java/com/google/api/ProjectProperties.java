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

import com.google.api.ProjectProperties;
import com.google.api.ProjectPropertiesOrBuilder;
import com.google.api.Property;
import com.google.api.PropertyOrBuilder;
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

public final class ProjectProperties
extends GeneratedMessageLite<ProjectProperties, Builder>
implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE;
    private static volatile Parser<ProjectProperties> PARSER;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Property> properties_ = ProjectProperties.emptyProtobufList();

    static {
        ProjectProperties projectProperties;
        DEFAULT_INSTANCE = projectProperties = new ProjectProperties();
        GeneratedMessageLite.registerDefaultInstance(ProjectProperties.class, (GeneratedMessageLite)projectProperties);
    }

    private ProjectProperties() {
    }

    private void addAllProperties(Iterable<? extends Property> iterable) {
        this.ensurePropertiesIsMutable();
        AbstractMessageLite.addAll(iterable, this.properties_);
    }

    private void addProperties(int n, Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.add(n, (Object)property);
    }

    private void addProperties(Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.add((Object)property);
    }

    private void clearProperties() {
        this.properties_ = ProjectProperties.emptyProtobufList();
    }

    private void ensurePropertiesIsMutable() {
        Internal.ProtobufList<Property> protobufList = this.properties_;
        if (!protobufList.isModifiable()) {
            this.properties_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ProjectProperties projectProperties) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties)ProjectProperties.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)ProjectProperties.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ProjectProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ProjectProperties parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ProjectProperties parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ProjectProperties> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProperties(int n) {
        this.ensurePropertiesIsMutable();
        this.properties_.remove(n);
    }

    private void setProperties(int n, Property property) {
        property.getClass();
        this.ensurePropertiesIsMutable();
        this.properties_.set(n, (Object)property);
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
                Parser<ProjectProperties> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ProjectProperties> class_ = ProjectProperties.class;
                synchronized (ProjectProperties.class) {
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
                Object[] arrobject = new Object[]{"properties_", Property.class};
                return ProjectProperties.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ProjectProperties();
    }

    @Override
    public Property getProperties(int n) {
        return (Property)this.properties_.get(n);
    }

    @Override
    public int getPropertiesCount() {
        return this.properties_.size();
    }

    @Override
    public List<Property> getPropertiesList() {
        return this.properties_;
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int n) {
        return (PropertyOrBuilder)this.properties_.get(n);
    }

    public List<? extends PropertyOrBuilder> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ProjectProperties, Builder>
    implements ProjectPropertiesOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllProperties(Iterable<? extends Property> iterable) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addAllProperties((Iterable<? extends Property>)iterable);
            return this;
        }

        public Builder addProperties(int n, Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(n, (Property)builder.build());
            return this;
        }

        public Builder addProperties(int n, Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(n, property);
            return this;
        }

        public Builder addProperties(Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties((Property)builder.build());
            return this;
        }

        public Builder addProperties(Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(property);
            return this;
        }

        public Builder clearProperties() {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).clearProperties();
            return this;
        }

        @Override
        public Property getProperties(int n) {
            return ((ProjectProperties)this.instance).getProperties(n);
        }

        @Override
        public int getPropertiesCount() {
            return ((ProjectProperties)this.instance).getPropertiesCount();
        }

        @Override
        public List<Property> getPropertiesList() {
            return Collections.unmodifiableList(((ProjectProperties)this.instance).getPropertiesList());
        }

        public Builder removeProperties(int n) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).removeProperties(n);
            return this;
        }

        public Builder setProperties(int n, Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).setProperties(n, (Property)builder.build());
            return this;
        }

        public Builder setProperties(int n, Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).setProperties(n, property);
            return this;
        }
    }

}

