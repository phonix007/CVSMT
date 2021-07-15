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
 *  com.google.rpc.ResourceInfo$1
 *  com.google.rpc.ResourceInfoOrBuilder
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
import com.google.rpc.ResourceInfo;
import com.google.rpc.ResourceInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResourceInfo
extends GeneratedMessageLite<ResourceInfo, Builder>
implements ResourceInfoOrBuilder {
    private static final ResourceInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceInfo> PARSER;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String owner_ = "";
    private String resourceName_ = "";
    private String resourceType_ = "";

    static {
        ResourceInfo resourceInfo;
        DEFAULT_INSTANCE = resourceInfo = new ResourceInfo();
        GeneratedMessageLite.registerDefaultInstance(ResourceInfo.class, (GeneratedMessageLite)resourceInfo);
    }

    private ResourceInfo() {
    }

    private void clearDescription() {
        this.description_ = ResourceInfo.getDefaultInstance().getDescription();
    }

    private void clearOwner() {
        this.owner_ = ResourceInfo.getDefaultInstance().getOwner();
    }

    private void clearResourceName() {
        this.resourceName_ = ResourceInfo.getDefaultInstance().getResourceName();
    }

    private void clearResourceType() {
        this.resourceType_ = ResourceInfo.getDefaultInstance().getResourceType();
    }

    public static ResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ResourceInfo resourceInfo) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)resourceInfo);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo)ResourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)ResourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ResourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ResourceInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ResourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string) {
        string.getClass();
        this.description_ = string;
    }

    private void setDescriptionBytes(ByteString byteString) {
        ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.description_ = byteString.toStringUtf8();
    }

    private void setOwner(String string) {
        string.getClass();
        this.owner_ = string;
    }

    private void setOwnerBytes(ByteString byteString) {
        ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.owner_ = byteString.toStringUtf8();
    }

    private void setResourceName(String string) {
        string.getClass();
        this.resourceName_ = string;
    }

    private void setResourceNameBytes(ByteString byteString) {
        ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.resourceName_ = byteString.toStringUtf8();
    }

    private void setResourceType(String string) {
        string.getClass();
        this.resourceType_ = string;
    }

    private void setResourceTypeBytes(ByteString byteString) {
        ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
        this.resourceType_ = byteString.toStringUtf8();
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
                Parser<ResourceInfo> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ResourceInfo> class_ = ResourceInfo.class;
                synchronized (ResourceInfo.class) {
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
                Object[] arrobject = new Object[]{"resourceType_", "resourceName_", "owner_", "description_"};
                return ResourceInfo.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ResourceInfo();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    public String getOwner() {
        return this.owner_;
    }

    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8((String)this.owner_);
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8((String)this.resourceName_);
    }

    public String getResourceType() {
        return this.resourceType_;
    }

    public ByteString getResourceTypeBytes() {
        return ByteString.copyFromUtf8((String)this.resourceType_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ResourceInfo, Builder>
    implements ResourceInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearDescription();
            return this;
        }

        public Builder clearOwner() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearOwner();
            return this;
        }

        public Builder clearResourceName() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearResourceName();
            return this;
        }

        public Builder clearResourceType() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearResourceType();
            return this;
        }

        public String getDescription() {
            return ((ResourceInfo)this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((ResourceInfo)this.instance).getDescriptionBytes();
        }

        public String getOwner() {
            return ((ResourceInfo)this.instance).getOwner();
        }

        public ByteString getOwnerBytes() {
            return ((ResourceInfo)this.instance).getOwnerBytes();
        }

        public String getResourceName() {
            return ((ResourceInfo)this.instance).getResourceName();
        }

        public ByteString getResourceNameBytes() {
            return ((ResourceInfo)this.instance).getResourceNameBytes();
        }

        public String getResourceType() {
            return ((ResourceInfo)this.instance).getResourceType();
        }

        public ByteString getResourceTypeBytes() {
            return ((ResourceInfo)this.instance).getResourceTypeBytes();
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setOwner(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setOwner(string);
            return this;
        }

        public Builder setOwnerBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setOwnerBytes(byteString);
            return this;
        }

        public Builder setResourceName(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceName(string);
            return this;
        }

        public Builder setResourceNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceNameBytes(byteString);
            return this;
        }

        public Builder setResourceType(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceType(string);
            return this;
        }

        public Builder setResourceTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceTypeBytes(byteString);
            return this;
        }
    }

}

