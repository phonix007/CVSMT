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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 */
package com.google.api;

import com.google.api.ResourceReference;
import com.google.api.ResourceReferenceOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResourceReference
extends GeneratedMessageLite<ResourceReference, Builder>
implements ResourceReferenceOrBuilder {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile Parser<ResourceReference> PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String childType_ = "";
    private String type_ = "";

    static {
        ResourceReference resourceReference;
        DEFAULT_INSTANCE = resourceReference = new ResourceReference();
        GeneratedMessageLite.registerDefaultInstance(ResourceReference.class, (GeneratedMessageLite)resourceReference);
    }

    private ResourceReference() {
    }

    private void clearChildType() {
        this.childType_ = ResourceReference.getDefaultInstance().getChildType();
    }

    private void clearType() {
        this.type_ = ResourceReference.getDefaultInstance().getType();
    }

    public static ResourceReference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ResourceReference resourceReference) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)resourceReference);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceReference)ResourceReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference)ResourceReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceReference parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ResourceReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ResourceReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceReference parseFrom(InputStream inputStream) throws IOException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceReference parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ResourceReference parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ResourceReference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setChildType(String string) {
        string.getClass();
        this.childType_ = string;
    }

    private void setChildTypeBytes(ByteString byteString) {
        ResourceReference.checkByteStringIsUtf8((ByteString)byteString);
        this.childType_ = byteString.toStringUtf8();
    }

    private void setType(String string) {
        string.getClass();
        this.type_ = string;
    }

    private void setTypeBytes(ByteString byteString) {
        ResourceReference.checkByteStringIsUtf8((ByteString)byteString);
        this.type_ = byteString.toStringUtf8();
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
                Parser<ResourceReference> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<ResourceReference> class_ = ResourceReference.class;
                synchronized (ResourceReference.class) {
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
                Object[] arrobject = new Object[]{"type_", "childType_"};
                return ResourceReference.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new ResourceReference();
    }

    @Override
    public String getChildType() {
        return this.childType_;
    }

    @Override
    public ByteString getChildTypeBytes() {
        return ByteString.copyFromUtf8((String)this.childType_);
    }

    @Override
    public String getType() {
        return this.type_;
    }

    @Override
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8((String)this.type_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ResourceReference, Builder>
    implements ResourceReferenceOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearChildType() {
            this.copyOnWrite();
            ((ResourceReference)this.instance).clearChildType();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((ResourceReference)this.instance).clearType();
            return this;
        }

        @Override
        public String getChildType() {
            return ((ResourceReference)this.instance).getChildType();
        }

        @Override
        public ByteString getChildTypeBytes() {
            return ((ResourceReference)this.instance).getChildTypeBytes();
        }

        @Override
        public String getType() {
            return ((ResourceReference)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((ResourceReference)this.instance).getTypeBytes();
        }

        public Builder setChildType(String string) {
            this.copyOnWrite();
            ((ResourceReference)this.instance).setChildType(string);
            return this;
        }

        public Builder setChildTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceReference)this.instance).setChildTypeBytes(byteString);
            return this;
        }

        public Builder setType(String string) {
            this.copyOnWrite();
            ((ResourceReference)this.instance).setType(string);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceReference)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

}

