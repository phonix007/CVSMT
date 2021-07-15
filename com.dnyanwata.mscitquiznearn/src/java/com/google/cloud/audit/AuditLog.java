/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
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
 *  com.google.protobuf.Struct
 *  com.google.protobuf.Struct$Builder
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
package com.google.cloud.audit;

import com.google.cloud.audit.AuditLog;
import com.google.cloud.audit.AuditLogOrBuilder;
import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.AuthorizationInfoOrBuilder;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class AuditLog
extends GeneratedMessageLite<AuditLog, Builder>
implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser<AuditLog> PARSER;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private Internal.ProtobufList<AuthorizationInfo> authorizationInfo_ = AuditLog.emptyProtobufList();
    private String methodName_ = "";
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_ = "";
    private Struct response_;
    private Any serviceData_;
    private String serviceName_ = "";
    private Status status_;

    static {
        AuditLog auditLog;
        DEFAULT_INSTANCE = auditLog = new AuditLog();
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, (GeneratedMessageLite)auditLog);
    }

    private AuditLog() {
    }

    private void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        this.ensureAuthorizationInfoIsMutable();
        AbstractMessageLite.addAll(iterable, this.authorizationInfo_);
    }

    private void addAuthorizationInfo(int n, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(n, (Object)authorizationInfo);
    }

    private void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add((Object)authorizationInfo);
    }

    private void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    private void clearAuthorizationInfo() {
        this.authorizationInfo_ = AuditLog.emptyProtobufList();
    }

    private void clearMethodName() {
        this.methodName_ = AuditLog.getDefaultInstance().getMethodName();
    }

    private void clearNumResponseItems() {
        this.numResponseItems_ = 0L;
    }

    private void clearRequest() {
        this.request_ = null;
    }

    private void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    private void clearResourceName() {
        this.resourceName_ = AuditLog.getDefaultInstance().getResourceName();
    }

    private void clearResponse() {
        this.response_ = null;
    }

    private void clearServiceData() {
        this.serviceData_ = null;
    }

    private void clearServiceName() {
        this.serviceName_ = AuditLog.getDefaultInstance().getServiceName();
    }

    private void clearStatus() {
        this.status_ = null;
    }

    private void ensureAuthorizationInfoIsMutable() {
        Internal.ProtobufList<AuthorizationInfo> protobufList = this.authorizationInfo_;
        if (!protobufList.isModifiable()) {
            this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 != null && authenticationInfo2 != AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = (AuthenticationInfo)((AuthenticationInfo.Builder)AuthenticationInfo.newBuilder(this.authenticationInfo_).mergeFrom((GeneratedMessageLite)authenticationInfo)).buildPartial();
            return;
        }
        this.authenticationInfo_ = authenticationInfo;
    }

    private void mergeRequest(Struct struct) {
        struct.getClass();
        Struct struct2 = this.request_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.request_ = (Struct)((Struct.Builder)Struct.newBuilder((Struct)this.request_).mergeFrom((GeneratedMessageLite)struct)).buildPartial();
            return;
        }
        this.request_ = struct;
    }

    private void mergeRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 != null && requestMetadata2 != RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = (RequestMetadata)((RequestMetadata.Builder)RequestMetadata.newBuilder(this.requestMetadata_).mergeFrom((GeneratedMessageLite)requestMetadata)).buildPartial();
            return;
        }
        this.requestMetadata_ = requestMetadata;
    }

    private void mergeResponse(Struct struct) {
        struct.getClass();
        Struct struct2 = this.response_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.response_ = (Struct)((Struct.Builder)Struct.newBuilder((Struct)this.response_).mergeFrom((GeneratedMessageLite)struct)).buildPartial();
            return;
        }
        this.response_ = struct;
    }

    private void mergeServiceData(Any any) {
        any.getClass();
        Any any2 = this.serviceData_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.serviceData_ = (Any)((Any.Builder)Any.newBuilder((Any)this.serviceData_).mergeFrom((GeneratedMessageLite)any)).buildPartial();
            return;
        }
        this.serviceData_ = any;
    }

    private void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 != null && status2 != Status.getDefaultInstance()) {
            this.status_ = (Status)((Status.Builder)Status.newBuilder(this.status_).mergeFrom((GeneratedMessageLite)status)).buildPartial();
            return;
        }
        this.status_ = status;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuditLog auditLog) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)auditLog);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog)AuditLog.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog)AuditLog.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuditLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuditLog parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuditLog parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuditLog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAuthorizationInfo(int n) {
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(n);
    }

    private void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        this.authenticationInfo_ = authenticationInfo;
    }

    private void setAuthorizationInfo(int n, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(n, (Object)authorizationInfo);
    }

    private void setMethodName(String string) {
        string.getClass();
        this.methodName_ = string;
    }

    private void setMethodNameBytes(ByteString byteString) {
        AuditLog.checkByteStringIsUtf8((ByteString)byteString);
        this.methodName_ = byteString.toStringUtf8();
    }

    private void setNumResponseItems(long l) {
        this.numResponseItems_ = l;
    }

    private void setRequest(Struct struct) {
        struct.getClass();
        this.request_ = struct;
    }

    private void setRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        this.requestMetadata_ = requestMetadata;
    }

    private void setResourceName(String string) {
        string.getClass();
        this.resourceName_ = string;
    }

    private void setResourceNameBytes(ByteString byteString) {
        AuditLog.checkByteStringIsUtf8((ByteString)byteString);
        this.resourceName_ = byteString.toStringUtf8();
    }

    private void setResponse(Struct struct) {
        struct.getClass();
        this.response_ = struct;
    }

    private void setServiceData(Any any) {
        any.getClass();
        this.serviceData_ = any;
    }

    private void setServiceName(String string) {
        string.getClass();
        this.serviceName_ = string;
    }

    private void setServiceNameBytes(ByteString byteString) {
        AuditLog.checkByteStringIsUtf8((ByteString)byteString);
        this.serviceName_ = byteString.toStringUtf8();
    }

    private void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
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
                Parser<AuditLog> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AuditLog> class_ = AuditLog.class;
                synchronized (AuditLog.class) {
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
                Object[] arrobject = new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"};
                return AuditLog.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007\u0208\b\u0208\t\u001b\u000b\u0208\f\u0002\u000f\t\u0010\t\u0011\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AuditLog();
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        if (authenticationInfo == null) {
            authenticationInfo = AuthenticationInfo.getDefaultInstance();
        }
        return authenticationInfo;
    }

    @Override
    public AuthorizationInfo getAuthorizationInfo(int n) {
        return (AuthorizationInfo)this.authorizationInfo_.get(n);
    }

    @Override
    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    @Override
    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int n) {
        return (AuthorizationInfoOrBuilder)this.authorizationInfo_.get(n);
    }

    public List<? extends AuthorizationInfoOrBuilder> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    @Override
    public String getMethodName() {
        return this.methodName_;
    }

    @Override
    public ByteString getMethodNameBytes() {
        return ByteString.copyFromUtf8((String)this.methodName_);
    }

    @Override
    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    @Override
    public Struct getRequest() {
        Struct struct = this.request_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    @Override
    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        if (requestMetadata == null) {
            requestMetadata = RequestMetadata.getDefaultInstance();
        }
        return requestMetadata;
    }

    @Override
    public String getResourceName() {
        return this.resourceName_;
    }

    @Override
    public ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8((String)this.resourceName_);
    }

    @Override
    public Struct getResponse() {
        Struct struct = this.response_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    @Override
    public Any getServiceData() {
        Any any = this.serviceData_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    @Override
    public String getServiceName() {
        return this.serviceName_;
    }

    @Override
    public ByteString getServiceNameBytes() {
        return ByteString.copyFromUtf8((String)this.serviceName_);
    }

    @Override
    public Status getStatus() {
        Status status = this.status_;
        if (status == null) {
            status = Status.getDefaultInstance();
        }
        return status;
    }

    @Override
    public boolean hasAuthenticationInfo() {
        return this.authenticationInfo_ != null;
    }

    @Override
    public boolean hasRequest() {
        return this.request_ != null;
    }

    @Override
    public boolean hasRequestMetadata() {
        return this.requestMetadata_ != null;
    }

    @Override
    public boolean hasResponse() {
        return this.response_ != null;
    }

    @Override
    public boolean hasServiceData() {
        return this.serviceData_ != null;
    }

    @Override
    public boolean hasStatus() {
        return this.status_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuditLog, Builder>
    implements AuditLogOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
            this.copyOnWrite();
            ((AuditLog)this.instance).addAllAuthorizationInfo((Iterable<? extends AuthorizationInfo>)iterable);
            return this;
        }

        public Builder addAuthorizationInfo(int n, AuthorizationInfo.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).addAuthorizationInfo(n, (AuthorizationInfo)builder.build());
            return this;
        }

        public Builder addAuthorizationInfo(int n, AuthorizationInfo authorizationInfo) {
            this.copyOnWrite();
            ((AuditLog)this.instance).addAuthorizationInfo(n, authorizationInfo);
            return this;
        }

        public Builder addAuthorizationInfo(AuthorizationInfo.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).addAuthorizationInfo((AuthorizationInfo)builder.build());
            return this;
        }

        public Builder addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
            this.copyOnWrite();
            ((AuditLog)this.instance).addAuthorizationInfo(authorizationInfo);
            return this;
        }

        public Builder clearAuthenticationInfo() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearAuthenticationInfo();
            return this;
        }

        public Builder clearAuthorizationInfo() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearAuthorizationInfo();
            return this;
        }

        public Builder clearMethodName() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearMethodName();
            return this;
        }

        public Builder clearNumResponseItems() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearNumResponseItems();
            return this;
        }

        public Builder clearRequest() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearRequest();
            return this;
        }

        public Builder clearRequestMetadata() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearRequestMetadata();
            return this;
        }

        public Builder clearResourceName() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearResourceName();
            return this;
        }

        public Builder clearResponse() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearResponse();
            return this;
        }

        public Builder clearServiceData() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearServiceData();
            return this;
        }

        public Builder clearServiceName() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearServiceName();
            return this;
        }

        public Builder clearStatus() {
            this.copyOnWrite();
            ((AuditLog)this.instance).clearStatus();
            return this;
        }

        @Override
        public AuthenticationInfo getAuthenticationInfo() {
            return ((AuditLog)this.instance).getAuthenticationInfo();
        }

        @Override
        public AuthorizationInfo getAuthorizationInfo(int n) {
            return ((AuditLog)this.instance).getAuthorizationInfo(n);
        }

        @Override
        public int getAuthorizationInfoCount() {
            return ((AuditLog)this.instance).getAuthorizationInfoCount();
        }

        @Override
        public List<AuthorizationInfo> getAuthorizationInfoList() {
            return Collections.unmodifiableList(((AuditLog)this.instance).getAuthorizationInfoList());
        }

        @Override
        public String getMethodName() {
            return ((AuditLog)this.instance).getMethodName();
        }

        @Override
        public ByteString getMethodNameBytes() {
            return ((AuditLog)this.instance).getMethodNameBytes();
        }

        @Override
        public long getNumResponseItems() {
            return ((AuditLog)this.instance).getNumResponseItems();
        }

        @Override
        public Struct getRequest() {
            return ((AuditLog)this.instance).getRequest();
        }

        @Override
        public RequestMetadata getRequestMetadata() {
            return ((AuditLog)this.instance).getRequestMetadata();
        }

        @Override
        public String getResourceName() {
            return ((AuditLog)this.instance).getResourceName();
        }

        @Override
        public ByteString getResourceNameBytes() {
            return ((AuditLog)this.instance).getResourceNameBytes();
        }

        @Override
        public Struct getResponse() {
            return ((AuditLog)this.instance).getResponse();
        }

        @Override
        public Any getServiceData() {
            return ((AuditLog)this.instance).getServiceData();
        }

        @Override
        public String getServiceName() {
            return ((AuditLog)this.instance).getServiceName();
        }

        @Override
        public ByteString getServiceNameBytes() {
            return ((AuditLog)this.instance).getServiceNameBytes();
        }

        @Override
        public Status getStatus() {
            return ((AuditLog)this.instance).getStatus();
        }

        @Override
        public boolean hasAuthenticationInfo() {
            return ((AuditLog)this.instance).hasAuthenticationInfo();
        }

        @Override
        public boolean hasRequest() {
            return ((AuditLog)this.instance).hasRequest();
        }

        @Override
        public boolean hasRequestMetadata() {
            return ((AuditLog)this.instance).hasRequestMetadata();
        }

        @Override
        public boolean hasResponse() {
            return ((AuditLog)this.instance).hasResponse();
        }

        @Override
        public boolean hasServiceData() {
            return ((AuditLog)this.instance).hasServiceData();
        }

        @Override
        public boolean hasStatus() {
            return ((AuditLog)this.instance).hasStatus();
        }

        public Builder mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeAuthenticationInfo(authenticationInfo);
            return this;
        }

        public Builder mergeRequest(Struct struct) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeRequest(struct);
            return this;
        }

        public Builder mergeRequestMetadata(RequestMetadata requestMetadata) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeRequestMetadata(requestMetadata);
            return this;
        }

        public Builder mergeResponse(Struct struct) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeResponse(struct);
            return this;
        }

        public Builder mergeServiceData(Any any) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeServiceData(any);
            return this;
        }

        public Builder mergeStatus(Status status) {
            this.copyOnWrite();
            ((AuditLog)this.instance).mergeStatus(status);
            return this;
        }

        public Builder removeAuthorizationInfo(int n) {
            this.copyOnWrite();
            ((AuditLog)this.instance).removeAuthorizationInfo(n);
            return this;
        }

        public Builder setAuthenticationInfo(AuthenticationInfo.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setAuthenticationInfo((AuthenticationInfo)builder.build());
            return this;
        }

        public Builder setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setAuthenticationInfo(authenticationInfo);
            return this;
        }

        public Builder setAuthorizationInfo(int n, AuthorizationInfo.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setAuthorizationInfo(n, (AuthorizationInfo)builder.build());
            return this;
        }

        public Builder setAuthorizationInfo(int n, AuthorizationInfo authorizationInfo) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setAuthorizationInfo(n, authorizationInfo);
            return this;
        }

        public Builder setMethodName(String string) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setMethodName(string);
            return this;
        }

        public Builder setMethodNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setMethodNameBytes(byteString);
            return this;
        }

        public Builder setNumResponseItems(long l) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setNumResponseItems(l);
            return this;
        }

        public Builder setRequest(Struct.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setRequest((Struct)builder.build());
            return this;
        }

        public Builder setRequest(Struct struct) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setRequest(struct);
            return this;
        }

        public Builder setRequestMetadata(RequestMetadata.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setRequestMetadata((RequestMetadata)builder.build());
            return this;
        }

        public Builder setRequestMetadata(RequestMetadata requestMetadata) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setRequestMetadata(requestMetadata);
            return this;
        }

        public Builder setResourceName(String string) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setResourceName(string);
            return this;
        }

        public Builder setResourceNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setResourceNameBytes(byteString);
            return this;
        }

        public Builder setResponse(Struct.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setResponse((Struct)builder.build());
            return this;
        }

        public Builder setResponse(Struct struct) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setResponse(struct);
            return this;
        }

        public Builder setServiceData(Any.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setServiceData((Any)builder.build());
            return this;
        }

        public Builder setServiceData(Any any) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setServiceData(any);
            return this;
        }

        public Builder setServiceName(String string) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setServiceName(string);
            return this;
        }

        public Builder setServiceNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setServiceNameBytes(byteString);
            return this;
        }

        public Builder setStatus(Status.Builder builder) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setStatus((Status)builder.build());
            return this;
        }

        public Builder setStatus(Status status) {
            this.copyOnWrite();
            ((AuditLog)this.instance).setStatus(status);
            return this;
        }
    }

}

