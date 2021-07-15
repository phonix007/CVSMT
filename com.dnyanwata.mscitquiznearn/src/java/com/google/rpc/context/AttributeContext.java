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
 *  com.google.protobuf.Struct
 *  com.google.protobuf.Struct$Builder
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  com.google.rpc.context.AttributeContext$1
 *  com.google.rpc.context.AttributeContext$ApiOrBuilder
 *  com.google.rpc.context.AttributeContext$AuthOrBuilder
 *  com.google.rpc.context.AttributeContext$Peer$LabelsDefaultEntryHolder
 *  com.google.rpc.context.AttributeContext$PeerOrBuilder
 *  com.google.rpc.context.AttributeContext$Request$HeadersDefaultEntryHolder
 *  com.google.rpc.context.AttributeContext$RequestOrBuilder
 *  com.google.rpc.context.AttributeContext$Resource$LabelsDefaultEntryHolder
 *  com.google.rpc.context.AttributeContext$ResourceOrBuilder
 *  com.google.rpc.context.AttributeContext$Response$HeadersDefaultEntryHolder
 *  com.google.rpc.context.AttributeContext$ResponseOrBuilder
 *  com.google.rpc.context.AttributeContextOrBuilder
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
package com.google.rpc.context;

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
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.rpc.context.AttributeContext;
import com.google.rpc.context.AttributeContextOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AttributeContext
extends GeneratedMessageLite<AttributeContext, Builder>
implements AttributeContextOrBuilder {
    public static final int API_FIELD_NUMBER = 6;
    private static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile Parser<AttributeContext> PARSER;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;

    static {
        AttributeContext attributeContext;
        DEFAULT_INSTANCE = attributeContext = new AttributeContext();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext.class, (GeneratedMessageLite)attributeContext);
    }

    private AttributeContext() {
    }

    private void clearApi() {
        this.api_ = null;
    }

    private void clearDestination() {
        this.destination_ = null;
    }

    private void clearOrigin() {
        this.origin_ = null;
    }

    private void clearRequest() {
        this.request_ = null;
    }

    private void clearResource() {
        this.resource_ = null;
    }

    private void clearResponse() {
        this.response_ = null;
    }

    private void clearSource() {
        this.source_ = null;
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeApi(Api api) {
        api.getClass();
        Api api2 = this.api_;
        if (api2 != null && api2 != Api.getDefaultInstance()) {
            this.api_ = (Api)((Api.Builder)Api.newBuilder(this.api_).mergeFrom((GeneratedMessageLite)api)).buildPartial();
            return;
        }
        this.api_ = api;
    }

    private void mergeDestination(Peer peer) {
        peer.getClass();
        Peer peer2 = this.destination_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.destination_ = (Peer)((Peer.Builder)Peer.newBuilder(this.destination_).mergeFrom((GeneratedMessageLite)peer)).buildPartial();
            return;
        }
        this.destination_ = peer;
    }

    private void mergeOrigin(Peer peer) {
        peer.getClass();
        Peer peer2 = this.origin_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.origin_ = (Peer)((Peer.Builder)Peer.newBuilder(this.origin_).mergeFrom((GeneratedMessageLite)peer)).buildPartial();
            return;
        }
        this.origin_ = peer;
    }

    private void mergeRequest(Request request) {
        request.getClass();
        Request request2 = this.request_;
        if (request2 != null && request2 != Request.getDefaultInstance()) {
            this.request_ = (Request)((Request.Builder)Request.newBuilder(this.request_).mergeFrom((GeneratedMessageLite)request)).buildPartial();
            return;
        }
        this.request_ = request;
    }

    private void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 != null && resource2 != Resource.getDefaultInstance()) {
            this.resource_ = (Resource)((Resource.Builder)Resource.newBuilder(this.resource_).mergeFrom((GeneratedMessageLite)resource)).buildPartial();
            return;
        }
        this.resource_ = resource;
    }

    private void mergeResponse(Response response) {
        response.getClass();
        Response response2 = this.response_;
        if (response2 != null && response2 != Response.getDefaultInstance()) {
            this.response_ = (Response)((Response.Builder)Response.newBuilder(this.response_).mergeFrom((GeneratedMessageLite)response)).buildPartial();
            return;
        }
        this.response_ = response;
    }

    private void mergeSource(Peer peer) {
        peer.getClass();
        Peer peer2 = this.source_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.source_ = (Peer)((Peer.Builder)Peer.newBuilder(this.source_).mergeFrom((GeneratedMessageLite)peer)).buildPartial();
            return;
        }
        this.source_ = peer;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AttributeContext attributeContext) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)attributeContext);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext)AttributeContext.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext)AttributeContext.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AttributeContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AttributeContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AttributeContext parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AttributeContext parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AttributeContext)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AttributeContext> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setApi(Api api) {
        api.getClass();
        this.api_ = api;
    }

    private void setDestination(Peer peer) {
        peer.getClass();
        this.destination_ = peer;
    }

    private void setOrigin(Peer peer) {
        peer.getClass();
        this.origin_ = peer;
    }

    private void setRequest(Request request) {
        request.getClass();
        this.request_ = request;
    }

    private void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
    }

    private void setResponse(Response response) {
        response.getClass();
        this.response_ = response;
    }

    private void setSource(Peer peer) {
        peer.getClass();
        this.source_ = peer;
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
                Parser<AttributeContext> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AttributeContext> class_ = AttributeContext.class;
                synchronized (AttributeContext.class) {
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
                Object[] arrobject = new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"};
                return AttributeContext.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AttributeContext();
    }

    public Api getApi() {
        Api api = this.api_;
        if (api == null) {
            api = Api.getDefaultInstance();
        }
        return api;
    }

    public Peer getDestination() {
        Peer peer = this.destination_;
        if (peer == null) {
            peer = Peer.getDefaultInstance();
        }
        return peer;
    }

    public Peer getOrigin() {
        Peer peer = this.origin_;
        if (peer == null) {
            peer = Peer.getDefaultInstance();
        }
        return peer;
    }

    public Request getRequest() {
        Request request = this.request_;
        if (request == null) {
            request = Request.getDefaultInstance();
        }
        return request;
    }

    public Resource getResource() {
        Resource resource = this.resource_;
        if (resource == null) {
            resource = Resource.getDefaultInstance();
        }
        return resource;
    }

    public Response getResponse() {
        Response response = this.response_;
        if (response == null) {
            response = Response.getDefaultInstance();
        }
        return response;
    }

    public Peer getSource() {
        Peer peer = this.source_;
        if (peer == null) {
            peer = Peer.getDefaultInstance();
        }
        return peer;
    }

    public boolean hasApi() {
        return this.api_ != null;
    }

    public boolean hasDestination() {
        return this.destination_ != null;
    }

    public boolean hasOrigin() {
        return this.origin_ != null;
    }

    public boolean hasRequest() {
        return this.request_ != null;
    }

    public boolean hasResource() {
        return this.resource_ != null;
    }

    public boolean hasResponse() {
        return this.response_ != null;
    }

    public boolean hasSource() {
        return this.source_ != null;
    }

    public static final class Api
    extends GeneratedMessageLite<Api, Builder>
    implements ApiOrBuilder {
        private static final Api DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile Parser<Api> PARSER;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String operation_ = "";
        private String protocol_ = "";
        private String service_ = "";
        private String version_ = "";

        static {
            Api api;
            DEFAULT_INSTANCE = api = new Api();
            GeneratedMessageLite.registerDefaultInstance(Api.class, (GeneratedMessageLite)api);
        }

        private Api() {
        }

        private void clearOperation() {
            this.operation_ = Api.getDefaultInstance().getOperation();
        }

        private void clearProtocol() {
            this.protocol_ = Api.getDefaultInstance().getProtocol();
        }

        private void clearService() {
            this.service_ = Api.getDefaultInstance().getService();
        }

        private void clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
        }

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Api api) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)api);
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api)Api.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api)Api.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Api parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Api parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Api parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Api)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Api> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setOperation(String string) {
            string.getClass();
            this.operation_ = string;
        }

        private void setOperationBytes(ByteString byteString) {
            Api.checkByteStringIsUtf8((ByteString)byteString);
            this.operation_ = byteString.toStringUtf8();
        }

        private void setProtocol(String string) {
            string.getClass();
            this.protocol_ = string;
        }

        private void setProtocolBytes(ByteString byteString) {
            Api.checkByteStringIsUtf8((ByteString)byteString);
            this.protocol_ = byteString.toStringUtf8();
        }

        private void setService(String string) {
            string.getClass();
            this.service_ = string;
        }

        private void setServiceBytes(ByteString byteString) {
            Api.checkByteStringIsUtf8((ByteString)byteString);
            this.service_ = byteString.toStringUtf8();
        }

        private void setVersion(String string) {
            string.getClass();
            this.version_ = string;
        }

        private void setVersionBytes(ByteString byteString) {
            Api.checkByteStringIsUtf8((ByteString)byteString);
            this.version_ = byteString.toStringUtf8();
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
                    Parser<Api> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Api> class_ = Api.class;
                    synchronized (Api.class) {
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
                    Object[] arrobject = new Object[]{"service_", "operation_", "protocol_", "version_"};
                    return Api.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Api();
        }

        public String getOperation() {
            return this.operation_;
        }

        public ByteString getOperationBytes() {
            return ByteString.copyFromUtf8((String)this.operation_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public ByteString getProtocolBytes() {
            return ByteString.copyFromUtf8((String)this.protocol_);
        }

        public String getService() {
            return this.service_;
        }

        public ByteString getServiceBytes() {
            return ByteString.copyFromUtf8((String)this.service_);
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8((String)this.version_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Api, Builder>
        implements ApiOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearOperation() {
                this.copyOnWrite();
                ((Api)this.instance).clearOperation();
                return this;
            }

            public Builder clearProtocol() {
                this.copyOnWrite();
                ((Api)this.instance).clearProtocol();
                return this;
            }

            public Builder clearService() {
                this.copyOnWrite();
                ((Api)this.instance).clearService();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((Api)this.instance).clearVersion();
                return this;
            }

            public String getOperation() {
                return ((Api)this.instance).getOperation();
            }

            public ByteString getOperationBytes() {
                return ((Api)this.instance).getOperationBytes();
            }

            public String getProtocol() {
                return ((Api)this.instance).getProtocol();
            }

            public ByteString getProtocolBytes() {
                return ((Api)this.instance).getProtocolBytes();
            }

            public String getService() {
                return ((Api)this.instance).getService();
            }

            public ByteString getServiceBytes() {
                return ((Api)this.instance).getServiceBytes();
            }

            public String getVersion() {
                return ((Api)this.instance).getVersion();
            }

            public ByteString getVersionBytes() {
                return ((Api)this.instance).getVersionBytes();
            }

            public Builder setOperation(String string) {
                this.copyOnWrite();
                ((Api)this.instance).setOperation(string);
                return this;
            }

            public Builder setOperationBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Api)this.instance).setOperationBytes(byteString);
                return this;
            }

            public Builder setProtocol(String string) {
                this.copyOnWrite();
                ((Api)this.instance).setProtocol(string);
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Api)this.instance).setProtocolBytes(byteString);
                return this;
            }

            public Builder setService(String string) {
                this.copyOnWrite();
                ((Api)this.instance).setService(string);
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Api)this.instance).setServiceBytes(byteString);
                return this;
            }

            public Builder setVersion(String string) {
                this.copyOnWrite();
                ((Api)this.instance).setVersion(string);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Api)this.instance).setVersionBytes(byteString);
                return this;
            }
        }

    }

    public static final class Auth
    extends GeneratedMessageLite<Auth, Builder>
    implements AuthOrBuilder {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final Auth DEFAULT_INSTANCE;
        private static volatile Parser<Auth> PARSER;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> audiences_ = GeneratedMessageLite.emptyProtobufList();
        private Struct claims_;
        private String presenter_ = "";
        private String principal_ = "";

        static {
            Auth auth;
            DEFAULT_INSTANCE = auth = new Auth();
            GeneratedMessageLite.registerDefaultInstance(Auth.class, (GeneratedMessageLite)auth);
        }

        private Auth() {
        }

        private void addAccessLevels(String string) {
            string.getClass();
            this.ensureAccessLevelsIsMutable();
            this.accessLevels_.add((Object)string);
        }

        private void addAccessLevelsBytes(ByteString byteString) {
            Auth.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureAccessLevelsIsMutable();
            this.accessLevels_.add((Object)byteString.toStringUtf8());
        }

        private void addAllAccessLevels(Iterable<String> iterable) {
            this.ensureAccessLevelsIsMutable();
            AbstractMessageLite.addAll(iterable, this.accessLevels_);
        }

        private void addAllAudiences(Iterable<String> iterable) {
            this.ensureAudiencesIsMutable();
            AbstractMessageLite.addAll(iterable, this.audiences_);
        }

        private void addAudiences(String string) {
            string.getClass();
            this.ensureAudiencesIsMutable();
            this.audiences_.add((Object)string);
        }

        private void addAudiencesBytes(ByteString byteString) {
            Auth.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureAudiencesIsMutable();
            this.audiences_.add((Object)byteString.toStringUtf8());
        }

        private void clearAccessLevels() {
            this.accessLevels_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearAudiences() {
            this.audiences_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearClaims() {
            this.claims_ = null;
        }

        private void clearPresenter() {
            this.presenter_ = Auth.getDefaultInstance().getPresenter();
        }

        private void clearPrincipal() {
            this.principal_ = Auth.getDefaultInstance().getPrincipal();
        }

        private void ensureAccessLevelsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.accessLevels_;
            if (!protobufList.isModifiable()) {
                this.accessLevels_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureAudiencesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.audiences_;
            if (!protobufList.isModifiable()) {
                this.audiences_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeClaims(Struct struct) {
            struct.getClass();
            Struct struct2 = this.claims_;
            if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
                this.claims_ = (Struct)((Struct.Builder)Struct.newBuilder((Struct)this.claims_).mergeFrom((GeneratedMessageLite)struct)).buildPartial();
                return;
            }
            this.claims_ = struct;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Auth auth) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)auth);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth)Auth.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth)Auth.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Auth parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Auth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Auth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Auth parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Auth parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Auth)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Auth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccessLevels(int n, String string) {
            string.getClass();
            this.ensureAccessLevelsIsMutable();
            this.accessLevels_.set(n, (Object)string);
        }

        private void setAudiences(int n, String string) {
            string.getClass();
            this.ensureAudiencesIsMutable();
            this.audiences_.set(n, (Object)string);
        }

        private void setClaims(Struct struct) {
            struct.getClass();
            this.claims_ = struct;
        }

        private void setPresenter(String string) {
            string.getClass();
            this.presenter_ = string;
        }

        private void setPresenterBytes(ByteString byteString) {
            Auth.checkByteStringIsUtf8((ByteString)byteString);
            this.presenter_ = byteString.toStringUtf8();
        }

        private void setPrincipal(String string) {
            string.getClass();
            this.principal_ = string;
        }

        private void setPrincipalBytes(ByteString byteString) {
            Auth.checkByteStringIsUtf8((ByteString)byteString);
            this.principal_ = byteString.toStringUtf8();
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
                    Parser<Auth> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Auth> class_ = Auth.class;
                    synchronized (Auth.class) {
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
                    Object[] arrobject = new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"};
                    return Auth.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0208\u0002\u021a\u0003\u0208\u0004\t\u0005\u021a", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Auth();
        }

        public String getAccessLevels(int n) {
            return (String)this.accessLevels_.get(n);
        }

        public ByteString getAccessLevelsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.accessLevels_.get(n)));
        }

        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        public List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        public String getAudiences(int n) {
            return (String)this.audiences_.get(n);
        }

        public ByteString getAudiencesBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.audiences_.get(n)));
        }

        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        public List<String> getAudiencesList() {
            return this.audiences_;
        }

        public Struct getClaims() {
            Struct struct = this.claims_;
            if (struct == null) {
                struct = Struct.getDefaultInstance();
            }
            return struct;
        }

        public String getPresenter() {
            return this.presenter_;
        }

        public ByteString getPresenterBytes() {
            return ByteString.copyFromUtf8((String)this.presenter_);
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public ByteString getPrincipalBytes() {
            return ByteString.copyFromUtf8((String)this.principal_);
        }

        public boolean hasClaims() {
            return this.claims_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Auth, Builder>
        implements AuthOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAccessLevels(String string) {
                this.copyOnWrite();
                ((Auth)this.instance).addAccessLevels(string);
                return this;
            }

            public Builder addAccessLevelsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Auth)this.instance).addAccessLevelsBytes(byteString);
                return this;
            }

            public Builder addAllAccessLevels(Iterable<String> iterable) {
                this.copyOnWrite();
                ((Auth)this.instance).addAllAccessLevels((Iterable<String>)iterable);
                return this;
            }

            public Builder addAllAudiences(Iterable<String> iterable) {
                this.copyOnWrite();
                ((Auth)this.instance).addAllAudiences((Iterable<String>)iterable);
                return this;
            }

            public Builder addAudiences(String string) {
                this.copyOnWrite();
                ((Auth)this.instance).addAudiences(string);
                return this;
            }

            public Builder addAudiencesBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Auth)this.instance).addAudiencesBytes(byteString);
                return this;
            }

            public Builder clearAccessLevels() {
                this.copyOnWrite();
                ((Auth)this.instance).clearAccessLevels();
                return this;
            }

            public Builder clearAudiences() {
                this.copyOnWrite();
                ((Auth)this.instance).clearAudiences();
                return this;
            }

            public Builder clearClaims() {
                this.copyOnWrite();
                ((Auth)this.instance).clearClaims();
                return this;
            }

            public Builder clearPresenter() {
                this.copyOnWrite();
                ((Auth)this.instance).clearPresenter();
                return this;
            }

            public Builder clearPrincipal() {
                this.copyOnWrite();
                ((Auth)this.instance).clearPrincipal();
                return this;
            }

            public String getAccessLevels(int n) {
                return ((Auth)this.instance).getAccessLevels(n);
            }

            public ByteString getAccessLevelsBytes(int n) {
                return ((Auth)this.instance).getAccessLevelsBytes(n);
            }

            public int getAccessLevelsCount() {
                return ((Auth)this.instance).getAccessLevelsCount();
            }

            public List<String> getAccessLevelsList() {
                return Collections.unmodifiableList(((Auth)this.instance).getAccessLevelsList());
            }

            public String getAudiences(int n) {
                return ((Auth)this.instance).getAudiences(n);
            }

            public ByteString getAudiencesBytes(int n) {
                return ((Auth)this.instance).getAudiencesBytes(n);
            }

            public int getAudiencesCount() {
                return ((Auth)this.instance).getAudiencesCount();
            }

            public List<String> getAudiencesList() {
                return Collections.unmodifiableList(((Auth)this.instance).getAudiencesList());
            }

            public Struct getClaims() {
                return ((Auth)this.instance).getClaims();
            }

            public String getPresenter() {
                return ((Auth)this.instance).getPresenter();
            }

            public ByteString getPresenterBytes() {
                return ((Auth)this.instance).getPresenterBytes();
            }

            public String getPrincipal() {
                return ((Auth)this.instance).getPrincipal();
            }

            public ByteString getPrincipalBytes() {
                return ((Auth)this.instance).getPrincipalBytes();
            }

            public boolean hasClaims() {
                return ((Auth)this.instance).hasClaims();
            }

            public Builder mergeClaims(Struct struct) {
                this.copyOnWrite();
                ((Auth)this.instance).mergeClaims(struct);
                return this;
            }

            public Builder setAccessLevels(int n, String string) {
                this.copyOnWrite();
                ((Auth)this.instance).setAccessLevels(n, string);
                return this;
            }

            public Builder setAudiences(int n, String string) {
                this.copyOnWrite();
                ((Auth)this.instance).setAudiences(n, string);
                return this;
            }

            public Builder setClaims(Struct.Builder builder) {
                this.copyOnWrite();
                ((Auth)this.instance).setClaims((Struct)builder.build());
                return this;
            }

            public Builder setClaims(Struct struct) {
                this.copyOnWrite();
                ((Auth)this.instance).setClaims(struct);
                return this;
            }

            public Builder setPresenter(String string) {
                this.copyOnWrite();
                ((Auth)this.instance).setPresenter(string);
                return this;
            }

            public Builder setPresenterBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Auth)this.instance).setPresenterBytes(byteString);
                return this;
            }

            public Builder setPrincipal(String string) {
                this.copyOnWrite();
                ((Auth)this.instance).setPrincipal(string);
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Auth)this.instance).setPrincipalBytes(byteString);
                return this;
            }
        }

    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AttributeContext, Builder>
    implements AttributeContextOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearApi() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearApi();
            return this;
        }

        public Builder clearDestination() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearDestination();
            return this;
        }

        public Builder clearOrigin() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearOrigin();
            return this;
        }

        public Builder clearRequest() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearRequest();
            return this;
        }

        public Builder clearResource() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearResource();
            return this;
        }

        public Builder clearResponse() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearResponse();
            return this;
        }

        public Builder clearSource() {
            this.copyOnWrite();
            ((AttributeContext)this.instance).clearSource();
            return this;
        }

        public Api getApi() {
            return ((AttributeContext)this.instance).getApi();
        }

        public Peer getDestination() {
            return ((AttributeContext)this.instance).getDestination();
        }

        public Peer getOrigin() {
            return ((AttributeContext)this.instance).getOrigin();
        }

        public Request getRequest() {
            return ((AttributeContext)this.instance).getRequest();
        }

        public Resource getResource() {
            return ((AttributeContext)this.instance).getResource();
        }

        public Response getResponse() {
            return ((AttributeContext)this.instance).getResponse();
        }

        public Peer getSource() {
            return ((AttributeContext)this.instance).getSource();
        }

        public boolean hasApi() {
            return ((AttributeContext)this.instance).hasApi();
        }

        public boolean hasDestination() {
            return ((AttributeContext)this.instance).hasDestination();
        }

        public boolean hasOrigin() {
            return ((AttributeContext)this.instance).hasOrigin();
        }

        public boolean hasRequest() {
            return ((AttributeContext)this.instance).hasRequest();
        }

        public boolean hasResource() {
            return ((AttributeContext)this.instance).hasResource();
        }

        public boolean hasResponse() {
            return ((AttributeContext)this.instance).hasResponse();
        }

        public boolean hasSource() {
            return ((AttributeContext)this.instance).hasSource();
        }

        public Builder mergeApi(Api api) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeApi(api);
            return this;
        }

        public Builder mergeDestination(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeDestination(peer);
            return this;
        }

        public Builder mergeOrigin(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeOrigin(peer);
            return this;
        }

        public Builder mergeRequest(Request request) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeRequest(request);
            return this;
        }

        public Builder mergeResource(Resource resource) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeResource(resource);
            return this;
        }

        public Builder mergeResponse(Response response) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeResponse(response);
            return this;
        }

        public Builder mergeSource(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).mergeSource(peer);
            return this;
        }

        public Builder setApi(Api.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setApi((Api)builder.build());
            return this;
        }

        public Builder setApi(Api api) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setApi(api);
            return this;
        }

        public Builder setDestination(Peer.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setDestination((Peer)builder.build());
            return this;
        }

        public Builder setDestination(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setDestination(peer);
            return this;
        }

        public Builder setOrigin(Peer.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setOrigin((Peer)builder.build());
            return this;
        }

        public Builder setOrigin(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setOrigin(peer);
            return this;
        }

        public Builder setRequest(Request.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setRequest((Request)builder.build());
            return this;
        }

        public Builder setRequest(Request request) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setRequest(request);
            return this;
        }

        public Builder setResource(Resource.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setResource((Resource)builder.build());
            return this;
        }

        public Builder setResource(Resource resource) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setResource(resource);
            return this;
        }

        public Builder setResponse(Response.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setResponse((Response)builder.build());
            return this;
        }

        public Builder setResponse(Response response) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setResponse(response);
            return this;
        }

        public Builder setSource(Peer.Builder builder) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setSource((Peer)builder.build());
            return this;
        }

        public Builder setSource(Peer peer) {
            this.copyOnWrite();
            ((AttributeContext)this.instance).setSource(peer);
            return this;
        }
    }

    public static final class Peer
    extends GeneratedMessageLite<Peer, Builder>
    implements PeerOrBuilder {
        private static final Peer DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile Parser<Peer> PARSER;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private String ip_ = "";
        private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
        private long port_;
        private String principal_ = "";
        private String regionCode_ = "";

        static {
            Peer peer;
            DEFAULT_INSTANCE = peer = new Peer();
            GeneratedMessageLite.registerDefaultInstance(Peer.class, (GeneratedMessageLite)peer);
        }

        private Peer() {
        }

        private void clearIp() {
            this.ip_ = Peer.getDefaultInstance().getIp();
        }

        private void clearPort() {
            this.port_ = 0L;
        }

        private void clearPrincipal() {
            this.principal_ = Peer.getDefaultInstance().getPrincipal();
        }

        private void clearRegionCode() {
            this.regionCode_ = Peer.getDefaultInstance().getRegionCode();
        }

        public static Peer getDefaultInstance() {
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

        public static Builder newBuilder(Peer peer) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)peer);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer)Peer.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer)Peer.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Peer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Peer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Peer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Peer parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Peer parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Peer)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Peer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIp(String string) {
            string.getClass();
            this.ip_ = string;
        }

        private void setIpBytes(ByteString byteString) {
            Peer.checkByteStringIsUtf8((ByteString)byteString);
            this.ip_ = byteString.toStringUtf8();
        }

        private void setPort(long l) {
            this.port_ = l;
        }

        private void setPrincipal(String string) {
            string.getClass();
            this.principal_ = string;
        }

        private void setPrincipalBytes(ByteString byteString) {
            Peer.checkByteStringIsUtf8((ByteString)byteString);
            this.principal_ = byteString.toStringUtf8();
        }

        private void setRegionCode(String string) {
            string.getClass();
            this.regionCode_ = string;
        }

        private void setRegionCodeBytes(ByteString byteString) {
            Peer.checkByteStringIsUtf8((ByteString)byteString);
            this.regionCode_ = byteString.toStringUtf8();
        }

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
                    Parser<Peer> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Peer> class_ = Peer.class;
                    synchronized (Peer.class) {
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
                    Object[] arrobject = new Object[]{"ip_", "port_", "labels_", LabelsDefaultEntryHolder.defaultEntry, "principal_", "regionCode_"};
                    return Peer.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001\u0208\u0002\u0002\u00062\u0007\u0208\b\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Peer();
        }

        public String getIp() {
            return this.ip_;
        }

        public ByteString getIpBytes() {
            return ByteString.copyFromUtf8((String)this.ip_);
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        public int getLabelsCount() {
            return this.internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(this.internalGetLabels());
        }

        public String getLabelsOrDefault(String string, String string2) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                string2 = (String)mapFieldLite.get((Object)string);
            }
            return string2;
        }

        public String getLabelsOrThrow(String string) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public long getPort() {
            return this.port_;
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public ByteString getPrincipalBytes() {
            return ByteString.copyFromUtf8((String)this.principal_);
        }

        public String getRegionCode() {
            return this.regionCode_;
        }

        public ByteString getRegionCodeBytes() {
            return ByteString.copyFromUtf8((String)this.regionCode_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Peer, Builder>
        implements PeerOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearIp() {
                this.copyOnWrite();
                ((Peer)this.instance).clearIp();
                return this;
            }

            public Builder clearLabels() {
                this.copyOnWrite();
                ((Peer)this.instance).getMutableLabelsMap().clear();
                return this;
            }

            public Builder clearPort() {
                this.copyOnWrite();
                ((Peer)this.instance).clearPort();
                return this;
            }

            public Builder clearPrincipal() {
                this.copyOnWrite();
                ((Peer)this.instance).clearPrincipal();
                return this;
            }

            public Builder clearRegionCode() {
                this.copyOnWrite();
                ((Peer)this.instance).clearRegionCode();
                return this;
            }

            public boolean containsLabels(String string) {
                string.getClass();
                return ((Peer)this.instance).getLabelsMap().containsKey((Object)string);
            }

            public String getIp() {
                return ((Peer)this.instance).getIp();
            }

            public ByteString getIpBytes() {
                return ((Peer)this.instance).getIpBytes();
            }

            @Deprecated
            public Map<String, String> getLabels() {
                return this.getLabelsMap();
            }

            public int getLabelsCount() {
                return ((Peer)this.instance).getLabelsMap().size();
            }

            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Peer)this.instance).getLabelsMap());
            }

            public String getLabelsOrDefault(String string, String string2) {
                string.getClass();
                Map<String, String> map = ((Peer)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    string2 = (String)map.get((Object)string);
                }
                return string2;
            }

            public String getLabelsOrThrow(String string) {
                string.getClass();
                Map<String, String> map = ((Peer)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }

            public long getPort() {
                return ((Peer)this.instance).getPort();
            }

            public String getPrincipal() {
                return ((Peer)this.instance).getPrincipal();
            }

            public ByteString getPrincipalBytes() {
                return ((Peer)this.instance).getPrincipalBytes();
            }

            public String getRegionCode() {
                return ((Peer)this.instance).getRegionCode();
            }

            public ByteString getRegionCodeBytes() {
                return ((Peer)this.instance).getRegionCodeBytes();
            }

            public Builder putAllLabels(Map<String, String> map) {
                this.copyOnWrite();
                ((Peer)this.instance).getMutableLabelsMap().putAll(map);
                return this;
            }

            public Builder putLabels(String string, String string2) {
                string.getClass();
                string2.getClass();
                this.copyOnWrite();
                ((Peer)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
                return this;
            }

            public Builder removeLabels(String string) {
                string.getClass();
                this.copyOnWrite();
                ((Peer)this.instance).getMutableLabelsMap().remove((Object)string);
                return this;
            }

            public Builder setIp(String string) {
                this.copyOnWrite();
                ((Peer)this.instance).setIp(string);
                return this;
            }

            public Builder setIpBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Peer)this.instance).setIpBytes(byteString);
                return this;
            }

            public Builder setPort(long l) {
                this.copyOnWrite();
                ((Peer)this.instance).setPort(l);
                return this;
            }

            public Builder setPrincipal(String string) {
                this.copyOnWrite();
                ((Peer)this.instance).setPrincipal(string);
                return this;
            }

            public Builder setPrincipalBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Peer)this.instance).setPrincipalBytes(byteString);
                return this;
            }

            public Builder setRegionCode(String string) {
                this.copyOnWrite();
                ((Peer)this.instance).setRegionCode(string);
                return this;
            }

            public Builder setRegionCodeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Peer)this.instance).setRegionCodeBytes(byteString);
                return this;
            }
        }

    }

    public static final class Request
    extends GeneratedMessageLite<Request, Builder>
    implements RequestOrBuilder {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final Request DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile Parser<Request> PARSER;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.emptyMapField();
        private String host_ = "";
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String protocol_ = "";
        private String query_ = "";
        private String reason_ = "";
        private String scheme_ = "";
        private long size_;
        private Timestamp time_;

        static {
            Request request;
            DEFAULT_INSTANCE = request = new Request();
            GeneratedMessageLite.registerDefaultInstance(Request.class, (GeneratedMessageLite)request);
        }

        private Request() {
        }

        private void clearAuth() {
            this.auth_ = null;
        }

        private void clearHost() {
            this.host_ = Request.getDefaultInstance().getHost();
        }

        private void clearId() {
            this.id_ = Request.getDefaultInstance().getId();
        }

        private void clearMethod() {
            this.method_ = Request.getDefaultInstance().getMethod();
        }

        private void clearPath() {
            this.path_ = Request.getDefaultInstance().getPath();
        }

        private void clearProtocol() {
            this.protocol_ = Request.getDefaultInstance().getProtocol();
        }

        private void clearQuery() {
            this.query_ = Request.getDefaultInstance().getQuery();
        }

        private void clearReason() {
            this.reason_ = Request.getDefaultInstance().getReason();
        }

        private void clearScheme() {
            this.scheme_ = Request.getDefaultInstance().getScheme();
        }

        private void clearSize() {
            this.size_ = 0L;
        }

        private void clearTime() {
            this.time_ = null;
        }

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, String> getMutableHeadersMap() {
            return this.internalGetMutableHeaders();
        }

        private MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        private void mergeAuth(Auth auth) {
            auth.getClass();
            Auth auth2 = this.auth_;
            if (auth2 != null && auth2 != Auth.getDefaultInstance()) {
                this.auth_ = (Auth)((Auth.Builder)Auth.newBuilder(this.auth_).mergeFrom((GeneratedMessageLite)auth)).buildPartial();
                return;
            }
            this.auth_ = auth;
        }

        private void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.time_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
                return;
            }
            this.time_ = timestamp;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Request request) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)request);
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request)Request.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request)Request.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Request parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Request parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Request> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAuth(Auth auth) {
            auth.getClass();
            this.auth_ = auth;
        }

        private void setHost(String string) {
            string.getClass();
            this.host_ = string;
        }

        private void setHostBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.host_ = byteString.toStringUtf8();
        }

        private void setId(String string) {
            string.getClass();
            this.id_ = string;
        }

        private void setIdBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.id_ = byteString.toStringUtf8();
        }

        private void setMethod(String string) {
            string.getClass();
            this.method_ = string;
        }

        private void setMethodBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.method_ = byteString.toStringUtf8();
        }

        private void setPath(String string) {
            string.getClass();
            this.path_ = string;
        }

        private void setPathBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.path_ = byteString.toStringUtf8();
        }

        private void setProtocol(String string) {
            string.getClass();
            this.protocol_ = string;
        }

        private void setProtocolBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.protocol_ = byteString.toStringUtf8();
        }

        private void setQuery(String string) {
            string.getClass();
            this.query_ = string;
        }

        private void setQueryBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.query_ = byteString.toStringUtf8();
        }

        private void setReason(String string) {
            string.getClass();
            this.reason_ = string;
        }

        private void setReasonBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.reason_ = byteString.toStringUtf8();
        }

        private void setScheme(String string) {
            string.getClass();
            this.scheme_ = string;
        }

        private void setSchemeBytes(ByteString byteString) {
            Request.checkByteStringIsUtf8((ByteString)byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        private void setSize(long l) {
            this.size_ = l;
        }

        private void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String string) {
            string.getClass();
            return this.internalGetHeaders().containsKey((Object)string);
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
                    Parser<Request> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Request> class_ = Request.class;
                    synchronized (Request.class) {
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
                    Object[] arrobject = new Object[]{"id_", "method_", "headers_", HeadersDefaultEntryHolder.defaultEntry, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"};
                    return Request.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u00032\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\t\t\n\u0002\u000b\u0208\f\u0208\r\t", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Request();
        }

        public Auth getAuth() {
            Auth auth = this.auth_;
            if (auth == null) {
                auth = Auth.getDefaultInstance();
            }
            return auth;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return this.getHeadersMap();
        }

        public int getHeadersCount() {
            return this.internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(this.internalGetHeaders());
        }

        public String getHeadersOrDefault(String string, String string2) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetHeaders();
            if (mapFieldLite.containsKey((Object)string)) {
                string2 = (String)mapFieldLite.get((Object)string);
            }
            return string2;
        }

        public String getHeadersOrThrow(String string) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetHeaders();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public String getHost() {
            return this.host_;
        }

        public ByteString getHostBytes() {
            return ByteString.copyFromUtf8((String)this.host_);
        }

        public String getId() {
            return this.id_;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8((String)this.id_);
        }

        public String getMethod() {
            return this.method_;
        }

        public ByteString getMethodBytes() {
            return ByteString.copyFromUtf8((String)this.method_);
        }

        public String getPath() {
            return this.path_;
        }

        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8((String)this.path_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public ByteString getProtocolBytes() {
            return ByteString.copyFromUtf8((String)this.protocol_);
        }

        public String getQuery() {
            return this.query_;
        }

        public ByteString getQueryBytes() {
            return ByteString.copyFromUtf8((String)this.query_);
        }

        public String getReason() {
            return this.reason_;
        }

        public ByteString getReasonBytes() {
            return ByteString.copyFromUtf8((String)this.reason_);
        }

        public String getScheme() {
            return this.scheme_;
        }

        public ByteString getSchemeBytes() {
            return ByteString.copyFromUtf8((String)this.scheme_);
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            if (timestamp == null) {
                timestamp = Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public boolean hasAuth() {
            return this.auth_ != null;
        }

        public boolean hasTime() {
            return this.time_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Request, Builder>
        implements RequestOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAuth() {
                this.copyOnWrite();
                ((Request)this.instance).clearAuth();
                return this;
            }

            public Builder clearHeaders() {
                this.copyOnWrite();
                ((Request)this.instance).getMutableHeadersMap().clear();
                return this;
            }

            public Builder clearHost() {
                this.copyOnWrite();
                ((Request)this.instance).clearHost();
                return this;
            }

            public Builder clearId() {
                this.copyOnWrite();
                ((Request)this.instance).clearId();
                return this;
            }

            public Builder clearMethod() {
                this.copyOnWrite();
                ((Request)this.instance).clearMethod();
                return this;
            }

            public Builder clearPath() {
                this.copyOnWrite();
                ((Request)this.instance).clearPath();
                return this;
            }

            public Builder clearProtocol() {
                this.copyOnWrite();
                ((Request)this.instance).clearProtocol();
                return this;
            }

            public Builder clearQuery() {
                this.copyOnWrite();
                ((Request)this.instance).clearQuery();
                return this;
            }

            public Builder clearReason() {
                this.copyOnWrite();
                ((Request)this.instance).clearReason();
                return this;
            }

            public Builder clearScheme() {
                this.copyOnWrite();
                ((Request)this.instance).clearScheme();
                return this;
            }

            public Builder clearSize() {
                this.copyOnWrite();
                ((Request)this.instance).clearSize();
                return this;
            }

            public Builder clearTime() {
                this.copyOnWrite();
                ((Request)this.instance).clearTime();
                return this;
            }

            public boolean containsHeaders(String string) {
                string.getClass();
                return ((Request)this.instance).getHeadersMap().containsKey((Object)string);
            }

            public Auth getAuth() {
                return ((Request)this.instance).getAuth();
            }

            @Deprecated
            public Map<String, String> getHeaders() {
                return this.getHeadersMap();
            }

            public int getHeadersCount() {
                return ((Request)this.instance).getHeadersMap().size();
            }

            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((Request)this.instance).getHeadersMap());
            }

            public String getHeadersOrDefault(String string, String string2) {
                string.getClass();
                Map<String, String> map = ((Request)this.instance).getHeadersMap();
                if (map.containsKey((Object)string)) {
                    string2 = (String)map.get((Object)string);
                }
                return string2;
            }

            public String getHeadersOrThrow(String string) {
                string.getClass();
                Map<String, String> map = ((Request)this.instance).getHeadersMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }

            public String getHost() {
                return ((Request)this.instance).getHost();
            }

            public ByteString getHostBytes() {
                return ((Request)this.instance).getHostBytes();
            }

            public String getId() {
                return ((Request)this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((Request)this.instance).getIdBytes();
            }

            public String getMethod() {
                return ((Request)this.instance).getMethod();
            }

            public ByteString getMethodBytes() {
                return ((Request)this.instance).getMethodBytes();
            }

            public String getPath() {
                return ((Request)this.instance).getPath();
            }

            public ByteString getPathBytes() {
                return ((Request)this.instance).getPathBytes();
            }

            public String getProtocol() {
                return ((Request)this.instance).getProtocol();
            }

            public ByteString getProtocolBytes() {
                return ((Request)this.instance).getProtocolBytes();
            }

            public String getQuery() {
                return ((Request)this.instance).getQuery();
            }

            public ByteString getQueryBytes() {
                return ((Request)this.instance).getQueryBytes();
            }

            public String getReason() {
                return ((Request)this.instance).getReason();
            }

            public ByteString getReasonBytes() {
                return ((Request)this.instance).getReasonBytes();
            }

            public String getScheme() {
                return ((Request)this.instance).getScheme();
            }

            public ByteString getSchemeBytes() {
                return ((Request)this.instance).getSchemeBytes();
            }

            public long getSize() {
                return ((Request)this.instance).getSize();
            }

            public Timestamp getTime() {
                return ((Request)this.instance).getTime();
            }

            public boolean hasAuth() {
                return ((Request)this.instance).hasAuth();
            }

            public boolean hasTime() {
                return ((Request)this.instance).hasTime();
            }

            public Builder mergeAuth(Auth auth) {
                this.copyOnWrite();
                ((Request)this.instance).mergeAuth(auth);
                return this;
            }

            public Builder mergeTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((Request)this.instance).mergeTime(timestamp);
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                this.copyOnWrite();
                ((Request)this.instance).getMutableHeadersMap().putAll(map);
                return this;
            }

            public Builder putHeaders(String string, String string2) {
                string.getClass();
                string2.getClass();
                this.copyOnWrite();
                ((Request)this.instance).getMutableHeadersMap().put((Object)string, (Object)string2);
                return this;
            }

            public Builder removeHeaders(String string) {
                string.getClass();
                this.copyOnWrite();
                ((Request)this.instance).getMutableHeadersMap().remove((Object)string);
                return this;
            }

            public Builder setAuth(Auth.Builder builder) {
                this.copyOnWrite();
                ((Request)this.instance).setAuth((Auth)builder.build());
                return this;
            }

            public Builder setAuth(Auth auth) {
                this.copyOnWrite();
                ((Request)this.instance).setAuth(auth);
                return this;
            }

            public Builder setHost(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setHost(string);
                return this;
            }

            public Builder setHostBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setHostBytes(byteString);
                return this;
            }

            public Builder setId(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setId(string);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setIdBytes(byteString);
                return this;
            }

            public Builder setMethod(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setMethod(string);
                return this;
            }

            public Builder setMethodBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setMethodBytes(byteString);
                return this;
            }

            public Builder setPath(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setPath(string);
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setPathBytes(byteString);
                return this;
            }

            public Builder setProtocol(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setProtocol(string);
                return this;
            }

            public Builder setProtocolBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setProtocolBytes(byteString);
                return this;
            }

            public Builder setQuery(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setQuery(string);
                return this;
            }

            public Builder setQueryBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setQueryBytes(byteString);
                return this;
            }

            public Builder setReason(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setReason(string);
                return this;
            }

            public Builder setReasonBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setReasonBytes(byteString);
                return this;
            }

            public Builder setScheme(String string) {
                this.copyOnWrite();
                ((Request)this.instance).setScheme(string);
                return this;
            }

            public Builder setSchemeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Request)this.instance).setSchemeBytes(byteString);
                return this;
            }

            public Builder setSize(long l) {
                this.copyOnWrite();
                ((Request)this.instance).setSize(l);
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((Request)this.instance).setTime((Timestamp)builder.build());
                return this;
            }

            public Builder setTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((Request)this.instance).setTime(timestamp);
                return this;
            }
        }

    }

    public static final class Resource
    extends GeneratedMessageLite<Resource, Builder>
    implements ResourceOrBuilder {
        private static final Resource DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Resource> PARSER;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
        private String name_ = "";
        private String service_ = "";
        private String type_ = "";

        static {
            Resource resource;
            DEFAULT_INSTANCE = resource = new Resource();
            GeneratedMessageLite.registerDefaultInstance(Resource.class, (GeneratedMessageLite)resource);
        }

        private Resource() {
        }

        private void clearName() {
            this.name_ = Resource.getDefaultInstance().getName();
        }

        private void clearService() {
            this.service_ = Resource.getDefaultInstance().getService();
        }

        private void clearType() {
            this.type_ = Resource.getDefaultInstance().getType();
        }

        public static Resource getDefaultInstance() {
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

        public static Builder newBuilder(Resource resource) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)resource);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource)Resource.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource)Resource.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Resource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Resource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Resource parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Resource parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Resource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setName(String string) {
            string.getClass();
            this.name_ = string;
        }

        private void setNameBytes(ByteString byteString) {
            Resource.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
        }

        private void setService(String string) {
            string.getClass();
            this.service_ = string;
        }

        private void setServiceBytes(ByteString byteString) {
            Resource.checkByteStringIsUtf8((ByteString)byteString);
            this.service_ = byteString.toStringUtf8();
        }

        private void setType(String string) {
            string.getClass();
            this.type_ = string;
        }

        private void setTypeBytes(ByteString byteString) {
            Resource.checkByteStringIsUtf8((ByteString)byteString);
            this.type_ = byteString.toStringUtf8();
        }

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
                    Parser<Resource> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Resource> class_ = Resource.class;
                    synchronized (Resource.class) {
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
                    Object[] arrobject = new Object[]{"service_", "name_", "type_", "labels_", LabelsDefaultEntryHolder.defaultEntry};
                    return Resource.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u00042", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Resource();
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        public int getLabelsCount() {
            return this.internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(this.internalGetLabels());
        }

        public String getLabelsOrDefault(String string, String string2) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                string2 = (String)mapFieldLite.get((Object)string);
            }
            return string2;
        }

        public String getLabelsOrThrow(String string) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8((String)this.name_);
        }

        public String getService() {
            return this.service_;
        }

        public ByteString getServiceBytes() {
            return ByteString.copyFromUtf8((String)this.service_);
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8((String)this.type_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Resource, Builder>
        implements ResourceOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearLabels() {
                this.copyOnWrite();
                ((Resource)this.instance).getMutableLabelsMap().clear();
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((Resource)this.instance).clearName();
                return this;
            }

            public Builder clearService() {
                this.copyOnWrite();
                ((Resource)this.instance).clearService();
                return this;
            }

            public Builder clearType() {
                this.copyOnWrite();
                ((Resource)this.instance).clearType();
                return this;
            }

            public boolean containsLabels(String string) {
                string.getClass();
                return ((Resource)this.instance).getLabelsMap().containsKey((Object)string);
            }

            @Deprecated
            public Map<String, String> getLabels() {
                return this.getLabelsMap();
            }

            public int getLabelsCount() {
                return ((Resource)this.instance).getLabelsMap().size();
            }

            public Map<String, String> getLabelsMap() {
                return Collections.unmodifiableMap(((Resource)this.instance).getLabelsMap());
            }

            public String getLabelsOrDefault(String string, String string2) {
                string.getClass();
                Map<String, String> map = ((Resource)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    string2 = (String)map.get((Object)string);
                }
                return string2;
            }

            public String getLabelsOrThrow(String string) {
                string.getClass();
                Map<String, String> map = ((Resource)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }

            public String getName() {
                return ((Resource)this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((Resource)this.instance).getNameBytes();
            }

            public String getService() {
                return ((Resource)this.instance).getService();
            }

            public ByteString getServiceBytes() {
                return ((Resource)this.instance).getServiceBytes();
            }

            public String getType() {
                return ((Resource)this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((Resource)this.instance).getTypeBytes();
            }

            public Builder putAllLabels(Map<String, String> map) {
                this.copyOnWrite();
                ((Resource)this.instance).getMutableLabelsMap().putAll(map);
                return this;
            }

            public Builder putLabels(String string, String string2) {
                string.getClass();
                string2.getClass();
                this.copyOnWrite();
                ((Resource)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
                return this;
            }

            public Builder removeLabels(String string) {
                string.getClass();
                this.copyOnWrite();
                ((Resource)this.instance).getMutableLabelsMap().remove((Object)string);
                return this;
            }

            public Builder setName(String string) {
                this.copyOnWrite();
                ((Resource)this.instance).setName(string);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Resource)this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setService(String string) {
                this.copyOnWrite();
                ((Resource)this.instance).setService(string);
                return this;
            }

            public Builder setServiceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Resource)this.instance).setServiceBytes(byteString);
                return this;
            }

            public Builder setType(String string) {
                this.copyOnWrite();
                ((Resource)this.instance).setType(string);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Resource)this.instance).setTypeBytes(byteString);
                return this;
            }
        }

    }

    public static final class Response
    extends GeneratedMessageLite<Response, Builder>
    implements ResponseOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Response DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile Parser<Response> PARSER;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private MapFieldLite<String, String> headers_ = MapFieldLite.emptyMapField();
        private long size_;
        private Timestamp time_;

        static {
            Response response;
            DEFAULT_INSTANCE = response = new Response();
            GeneratedMessageLite.registerDefaultInstance(Response.class, (GeneratedMessageLite)response);
        }

        private Response() {
        }

        private void clearCode() {
            this.code_ = 0L;
        }

        private void clearSize() {
            this.size_ = 0L;
        }

        private void clearTime() {
            this.time_ = null;
        }

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map<String, String> getMutableHeadersMap() {
            return this.internalGetMutableHeaders();
        }

        private MapFieldLite<String, String> internalGetHeaders() {
            return this.headers_;
        }

        private MapFieldLite<String, String> internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        private void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.time_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
                return;
            }
            this.time_ = timestamp;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Response response) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)response);
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response)Response.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response)Response.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Response parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Response parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Response> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCode(long l) {
            this.code_ = l;
        }

        private void setSize(long l) {
            this.size_ = l;
        }

        private void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String string) {
            string.getClass();
            return this.internalGetHeaders().containsKey((Object)string);
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
                    Parser<Response> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Response> class_ = Response.class;
                    synchronized (Response.class) {
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
                    Object[] arrobject = new Object[]{"code_", "size_", "headers_", HeadersDefaultEntryHolder.defaultEntry, "time_"};
                    return Response.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Response();
        }

        public long getCode() {
            return this.code_;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return this.getHeadersMap();
        }

        public int getHeadersCount() {
            return this.internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(this.internalGetHeaders());
        }

        public String getHeadersOrDefault(String string, String string2) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetHeaders();
            if (mapFieldLite.containsKey((Object)string)) {
                string2 = (String)mapFieldLite.get((Object)string);
            }
            return string2;
        }

        public String getHeadersOrThrow(String string) {
            string.getClass();
            MapFieldLite<String, String> mapFieldLite = this.internalGetHeaders();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            throw new IllegalArgumentException();
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            if (timestamp == null) {
                timestamp = Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public boolean hasTime() {
            return this.time_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Response, Builder>
        implements ResponseOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearCode() {
                this.copyOnWrite();
                ((Response)this.instance).clearCode();
                return this;
            }

            public Builder clearHeaders() {
                this.copyOnWrite();
                ((Response)this.instance).getMutableHeadersMap().clear();
                return this;
            }

            public Builder clearSize() {
                this.copyOnWrite();
                ((Response)this.instance).clearSize();
                return this;
            }

            public Builder clearTime() {
                this.copyOnWrite();
                ((Response)this.instance).clearTime();
                return this;
            }

            public boolean containsHeaders(String string) {
                string.getClass();
                return ((Response)this.instance).getHeadersMap().containsKey((Object)string);
            }

            public long getCode() {
                return ((Response)this.instance).getCode();
            }

            @Deprecated
            public Map<String, String> getHeaders() {
                return this.getHeadersMap();
            }

            public int getHeadersCount() {
                return ((Response)this.instance).getHeadersMap().size();
            }

            public Map<String, String> getHeadersMap() {
                return Collections.unmodifiableMap(((Response)this.instance).getHeadersMap());
            }

            public String getHeadersOrDefault(String string, String string2) {
                string.getClass();
                Map<String, String> map = ((Response)this.instance).getHeadersMap();
                if (map.containsKey((Object)string)) {
                    string2 = (String)map.get((Object)string);
                }
                return string2;
            }

            public String getHeadersOrThrow(String string) {
                string.getClass();
                Map<String, String> map = ((Response)this.instance).getHeadersMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }

            public long getSize() {
                return ((Response)this.instance).getSize();
            }

            public Timestamp getTime() {
                return ((Response)this.instance).getTime();
            }

            public boolean hasTime() {
                return ((Response)this.instance).hasTime();
            }

            public Builder mergeTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((Response)this.instance).mergeTime(timestamp);
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                this.copyOnWrite();
                ((Response)this.instance).getMutableHeadersMap().putAll(map);
                return this;
            }

            public Builder putHeaders(String string, String string2) {
                string.getClass();
                string2.getClass();
                this.copyOnWrite();
                ((Response)this.instance).getMutableHeadersMap().put((Object)string, (Object)string2);
                return this;
            }

            public Builder removeHeaders(String string) {
                string.getClass();
                this.copyOnWrite();
                ((Response)this.instance).getMutableHeadersMap().remove((Object)string);
                return this;
            }

            public Builder setCode(long l) {
                this.copyOnWrite();
                ((Response)this.instance).setCode(l);
                return this;
            }

            public Builder setSize(long l) {
                this.copyOnWrite();
                ((Response)this.instance).setSize(l);
                return this;
            }

            public Builder setTime(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((Response)this.instance).setTime((Timestamp)builder.build());
                return this;
            }

            public Builder setTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((Response)this.instance).setTime(timestamp);
                return this;
            }
        }

    }

}

