/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Api
 *  com.google.protobuf.Api$Builder
 *  com.google.protobuf.ApiOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Enum
 *  com.google.protobuf.Enum$Builder
 *  com.google.protobuf.EnumOrBuilder
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
 *  com.google.protobuf.Type
 *  com.google.protobuf.Type$Builder
 *  com.google.protobuf.TypeOrBuilder
 *  com.google.protobuf.UInt32Value
 *  com.google.protobuf.UInt32Value$Builder
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

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.EndpointOrBuilder;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.LogDescriptorOrBuilder;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.Service;
import com.google.api.ServiceOrBuilder;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Service
extends GeneratedMessageLite<Service, Builder>
implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Internal.ProtobufList<Api> apis_ = Service.emptyProtobufList();
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Internal.ProtobufList<Endpoint> endpoints_ = Service.emptyProtobufList();
    private Internal.ProtobufList<Enum> enums_ = Service.emptyProtobufList();
    private Http http_;
    private String id_ = "";
    private Logging logging_;
    private Internal.ProtobufList<LogDescriptor> logs_ = Service.emptyProtobufList();
    private Internal.ProtobufList<MetricDescriptor> metrics_ = Service.emptyProtobufList();
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_ = Service.emptyProtobufList();
    private Monitoring monitoring_;
    private String name_ = "";
    private String producerProjectId_ = "";
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_ = "";
    private Internal.ProtobufList<Type> types_ = Service.emptyProtobufList();
    private Usage usage_;

    static {
        Service service;
        DEFAULT_INSTANCE = service = new Service();
        GeneratedMessageLite.registerDefaultInstance(Service.class, (GeneratedMessageLite)service);
    }

    private Service() {
    }

    private void addAllApis(Iterable<? extends Api> iterable) {
        this.ensureApisIsMutable();
        AbstractMessageLite.addAll(iterable, this.apis_);
    }

    private void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        this.ensureEndpointsIsMutable();
        AbstractMessageLite.addAll(iterable, this.endpoints_);
    }

    private void addAllEnums(Iterable<? extends Enum> iterable) {
        this.ensureEnumsIsMutable();
        AbstractMessageLite.addAll(iterable, this.enums_);
    }

    private void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        this.ensureLogsIsMutable();
        AbstractMessageLite.addAll(iterable, this.logs_);
    }

    private void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        this.ensureMetricsIsMutable();
        AbstractMessageLite.addAll(iterable, this.metrics_);
    }

    private void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        this.ensureMonitoredResourcesIsMutable();
        AbstractMessageLite.addAll(iterable, this.monitoredResources_);
    }

    private void addAllTypes(Iterable<? extends Type> iterable) {
        this.ensureTypesIsMutable();
        AbstractMessageLite.addAll(iterable, this.types_);
    }

    private void addApis(int n, Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.add(n, (Object)api);
    }

    private void addApis(Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.add((Object)api);
    }

    private void addEndpoints(int n, Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.add(n, (Object)endpoint);
    }

    private void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.add((Object)endpoint);
    }

    private void addEnums(int n, Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.add(n, (Object)enum_);
    }

    private void addEnums(Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.add((Object)enum_);
    }

    private void addLogs(int n, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.add(n, (Object)logDescriptor);
    }

    private void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.add((Object)logDescriptor);
    }

    private void addMetrics(int n, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add(n, (Object)metricDescriptor);
    }

    private void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.add((Object)metricDescriptor);
    }

    private void addMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(n, (Object)monitoredResourceDescriptor);
    }

    private void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add((Object)monitoredResourceDescriptor);
    }

    private void addTypes(int n, Type type) {
        type.getClass();
        this.ensureTypesIsMutable();
        this.types_.add(n, (Object)type);
    }

    private void addTypes(Type type) {
        type.getClass();
        this.ensureTypesIsMutable();
        this.types_.add((Object)type);
    }

    private void clearApis() {
        this.apis_ = Service.emptyProtobufList();
    }

    private void clearAuthentication() {
        this.authentication_ = null;
    }

    private void clearBackend() {
        this.backend_ = null;
    }

    private void clearBilling() {
        this.billing_ = null;
    }

    private void clearConfigVersion() {
        this.configVersion_ = null;
    }

    private void clearContext() {
        this.context_ = null;
    }

    private void clearControl() {
        this.control_ = null;
    }

    private void clearDocumentation() {
        this.documentation_ = null;
    }

    private void clearEndpoints() {
        this.endpoints_ = Service.emptyProtobufList();
    }

    private void clearEnums() {
        this.enums_ = Service.emptyProtobufList();
    }

    private void clearHttp() {
        this.http_ = null;
    }

    private void clearId() {
        this.id_ = Service.getDefaultInstance().getId();
    }

    private void clearLogging() {
        this.logging_ = null;
    }

    private void clearLogs() {
        this.logs_ = Service.emptyProtobufList();
    }

    private void clearMetrics() {
        this.metrics_ = Service.emptyProtobufList();
    }

    private void clearMonitoredResources() {
        this.monitoredResources_ = Service.emptyProtobufList();
    }

    private void clearMonitoring() {
        this.monitoring_ = null;
    }

    private void clearName() {
        this.name_ = Service.getDefaultInstance().getName();
    }

    private void clearProducerProjectId() {
        this.producerProjectId_ = Service.getDefaultInstance().getProducerProjectId();
    }

    private void clearQuota() {
        this.quota_ = null;
    }

    private void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    private void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    private void clearTitle() {
        this.title_ = Service.getDefaultInstance().getTitle();
    }

    private void clearTypes() {
        this.types_ = Service.emptyProtobufList();
    }

    private void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        Internal.ProtobufList<Api> protobufList = this.apis_;
        if (!protobufList.isModifiable()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureEndpointsIsMutable() {
        Internal.ProtobufList<Endpoint> protobufList = this.endpoints_;
        if (!protobufList.isModifiable()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureEnumsIsMutable() {
        Internal.ProtobufList<Enum> protobufList = this.enums_;
        if (!protobufList.isModifiable()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureLogsIsMutable() {
        Internal.ProtobufList<LogDescriptor> protobufList = this.logs_;
        if (!protobufList.isModifiable()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureMetricsIsMutable() {
        Internal.ProtobufList<MetricDescriptor> protobufList = this.metrics_;
        if (!protobufList.isModifiable()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureMonitoredResourcesIsMutable() {
        Internal.ProtobufList<MonitoredResourceDescriptor> protobufList = this.monitoredResources_;
        if (!protobufList.isModifiable()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureTypesIsMutable() {
        Internal.ProtobufList<Type> protobufList = this.types_;
        if (!protobufList.isModifiable()) {
            this.types_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 != null && authentication2 != Authentication.getDefaultInstance()) {
            this.authentication_ = (Authentication)((Authentication.Builder)Authentication.newBuilder(this.authentication_).mergeFrom((GeneratedMessageLite)authentication)).buildPartial();
            return;
        }
        this.authentication_ = authentication;
    }

    private void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 != null && backend2 != Backend.getDefaultInstance()) {
            this.backend_ = (Backend)((Backend.Builder)Backend.newBuilder(this.backend_).mergeFrom((GeneratedMessageLite)backend)).buildPartial();
            return;
        }
        this.backend_ = backend;
    }

    private void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 != null && billing2 != Billing.getDefaultInstance()) {
            this.billing_ = (Billing)((Billing.Builder)Billing.newBuilder(this.billing_).mergeFrom((GeneratedMessageLite)billing)).buildPartial();
            return;
        }
        this.billing_ = billing;
    }

    private void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 != null && uInt32Value2 != UInt32Value.getDefaultInstance()) {
            this.configVersion_ = (UInt32Value)((UInt32Value.Builder)UInt32Value.newBuilder((UInt32Value)this.configVersion_).mergeFrom((GeneratedMessageLite)uInt32Value)).buildPartial();
            return;
        }
        this.configVersion_ = uInt32Value;
    }

    private void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 != null && context2 != Context.getDefaultInstance()) {
            this.context_ = (Context)((Context.Builder)Context.newBuilder(this.context_).mergeFrom((GeneratedMessageLite)context)).buildPartial();
            return;
        }
        this.context_ = context;
    }

    private void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.control_ = (Control)((Control.Builder)Control.newBuilder(this.control_).mergeFrom((GeneratedMessageLite)control)).buildPartial();
            return;
        }
        this.control_ = control;
    }

    private void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 != null && documentation2 != Documentation.getDefaultInstance()) {
            this.documentation_ = (Documentation)((Documentation.Builder)Documentation.newBuilder(this.documentation_).mergeFrom((GeneratedMessageLite)documentation)).buildPartial();
            return;
        }
        this.documentation_ = documentation;
    }

    private void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 != null && http2 != Http.getDefaultInstance()) {
            this.http_ = (Http)((Http.Builder)Http.newBuilder(this.http_).mergeFrom((GeneratedMessageLite)http)).buildPartial();
            return;
        }
        this.http_ = http;
    }

    private void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 != null && logging2 != Logging.getDefaultInstance()) {
            this.logging_ = (Logging)((Logging.Builder)Logging.newBuilder(this.logging_).mergeFrom((GeneratedMessageLite)logging)).buildPartial();
            return;
        }
        this.logging_ = logging;
    }

    private void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 != null && monitoring2 != Monitoring.getDefaultInstance()) {
            this.monitoring_ = (Monitoring)((Monitoring.Builder)Monitoring.newBuilder(this.monitoring_).mergeFrom((GeneratedMessageLite)monitoring)).buildPartial();
            return;
        }
        this.monitoring_ = monitoring;
    }

    private void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 != null && quota2 != Quota.getDefaultInstance()) {
            this.quota_ = (Quota)((Quota.Builder)Quota.newBuilder(this.quota_).mergeFrom((GeneratedMessageLite)quota)).buildPartial();
            return;
        }
        this.quota_ = quota;
    }

    private void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 != null && sourceInfo2 != SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = (SourceInfo)((SourceInfo.Builder)SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((GeneratedMessageLite)sourceInfo)).buildPartial();
            return;
        }
        this.sourceInfo_ = sourceInfo;
    }

    private void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 != null && systemParameters2 != SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = (SystemParameters)((SystemParameters.Builder)SystemParameters.newBuilder(this.systemParameters_).mergeFrom((GeneratedMessageLite)systemParameters)).buildPartial();
            return;
        }
        this.systemParameters_ = systemParameters;
    }

    private void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 != null && usage2 != Usage.getDefaultInstance()) {
            this.usage_ = (Usage)((Usage.Builder)Usage.newBuilder(this.usage_).mergeFrom((GeneratedMessageLite)usage)).buildPartial();
            return;
        }
        this.usage_ = usage;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Service service) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service)Service.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)Service.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Service parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeApis(int n) {
        this.ensureApisIsMutable();
        this.apis_.remove(n);
    }

    private void removeEndpoints(int n) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.remove(n);
    }

    private void removeEnums(int n) {
        this.ensureEnumsIsMutable();
        this.enums_.remove(n);
    }

    private void removeLogs(int n) {
        this.ensureLogsIsMutable();
        this.logs_.remove(n);
    }

    private void removeMetrics(int n) {
        this.ensureMetricsIsMutable();
        this.metrics_.remove(n);
    }

    private void removeMonitoredResources(int n) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(n);
    }

    private void removeTypes(int n) {
        this.ensureTypesIsMutable();
        this.types_.remove(n);
    }

    private void setApis(int n, Api api) {
        api.getClass();
        this.ensureApisIsMutable();
        this.apis_.set(n, (Object)api);
    }

    private void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    private void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    private void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    private void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
    }

    private void setContext(Context context) {
        context.getClass();
        this.context_ = context;
    }

    private void setControl(Control control) {
        control.getClass();
        this.control_ = control;
    }

    private void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    private void setEndpoints(int n, Endpoint endpoint) {
        endpoint.getClass();
        this.ensureEndpointsIsMutable();
        this.endpoints_.set(n, (Object)endpoint);
    }

    private void setEnums(int n, Enum enum_) {
        enum_.getClass();
        this.ensureEnumsIsMutable();
        this.enums_.set(n, (Object)enum_);
    }

    private void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
    }

    private void setId(String string) {
        string.getClass();
        this.id_ = string;
    }

    private void setIdBytes(ByteString byteString) {
        Service.checkByteStringIsUtf8((ByteString)byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    private void setLogs(int n, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        this.ensureLogsIsMutable();
        this.logs_.set(n, (Object)logDescriptor);
    }

    private void setMetrics(int n, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        this.ensureMetricsIsMutable();
        this.metrics_.set(n, (Object)metricDescriptor);
    }

    private void setMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(n, (Object)monitoredResourceDescriptor);
    }

    private void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
    }

    private void setName(String string) {
        string.getClass();
        this.name_ = string;
    }

    private void setNameBytes(ByteString byteString) {
        Service.checkByteStringIsUtf8((ByteString)byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setProducerProjectId(String string) {
        string.getClass();
        this.producerProjectId_ = string;
    }

    private void setProducerProjectIdBytes(ByteString byteString) {
        Service.checkByteStringIsUtf8((ByteString)byteString);
        this.producerProjectId_ = byteString.toStringUtf8();
    }

    private void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    private void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    private void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    private void setTitle(String string) {
        string.getClass();
        this.title_ = string;
    }

    private void setTitleBytes(ByteString byteString) {
        Service.checkByteStringIsUtf8((ByteString)byteString);
        this.title_ = byteString.toStringUtf8();
    }

    private void setTypes(int n, Type type) {
        type.getClass();
        this.ensureTypesIsMutable();
        this.types_.set(n, (Object)type);
    }

    private void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
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
                Parser<Service> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<Service> class_ = Service.class;
                synchronized (Service.class) {
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
                Object[] arrobject = new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"};
                return Service.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001\u0208\u0002\u0208\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016\u0208\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!\u0208%\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new Service();
    }

    @Override
    public Api getApis(int n) {
        return (Api)this.apis_.get(n);
    }

    @Override
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override
    public List<Api> getApisList() {
        return this.apis_;
    }

    public ApiOrBuilder getApisOrBuilder(int n) {
        return (ApiOrBuilder)this.apis_.get(n);
    }

    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        if (authentication == null) {
            authentication = Authentication.getDefaultInstance();
        }
        return authentication;
    }

    @Override
    public Backend getBackend() {
        Backend backend = this.backend_;
        if (backend == null) {
            backend = Backend.getDefaultInstance();
        }
        return backend;
    }

    @Override
    public Billing getBilling() {
        Billing billing = this.billing_;
        if (billing == null) {
            billing = Billing.getDefaultInstance();
        }
        return billing;
    }

    @Override
    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value == null) {
            uInt32Value = UInt32Value.getDefaultInstance();
        }
        return uInt32Value;
    }

    @Override
    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            context = Context.getDefaultInstance();
        }
        return context;
    }

    @Override
    public Control getControl() {
        Control control = this.control_;
        if (control == null) {
            control = Control.getDefaultInstance();
        }
        return control;
    }

    @Override
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        if (documentation == null) {
            documentation = Documentation.getDefaultInstance();
        }
        return documentation;
    }

    @Override
    public Endpoint getEndpoints(int n) {
        return (Endpoint)this.endpoints_.get(n);
    }

    @Override
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int n) {
        return (EndpointOrBuilder)this.endpoints_.get(n);
    }

    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override
    public Enum getEnums(int n) {
        return (Enum)this.enums_.get(n);
    }

    @Override
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override
    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public EnumOrBuilder getEnumsOrBuilder(int n) {
        return (EnumOrBuilder)this.enums_.get(n);
    }

    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override
    public Http getHttp() {
        Http http = this.http_;
        if (http == null) {
            http = Http.getDefaultInstance();
        }
        return http;
    }

    @Override
    public String getId() {
        return this.id_;
    }

    @Override
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    @Override
    public Logging getLogging() {
        Logging logging = this.logging_;
        if (logging == null) {
            logging = Logging.getDefaultInstance();
        }
        return logging;
    }

    @Override
    public LogDescriptor getLogs(int n) {
        return (LogDescriptor)this.logs_.get(n);
    }

    @Override
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int n) {
        return (LogDescriptorOrBuilder)this.logs_.get(n);
    }

    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override
    public MetricDescriptor getMetrics(int n) {
        return (MetricDescriptor)this.metrics_.get(n);
    }

    @Override
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int n) {
        return (MetricDescriptorOrBuilder)this.metrics_.get(n);
    }

    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override
    public MonitoredResourceDescriptor getMonitoredResources(int n) {
        return (MonitoredResourceDescriptor)this.monitoredResources_.get(n);
    }

    @Override
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int n) {
        return (MonitoredResourceDescriptorOrBuilder)this.monitoredResources_.get(n);
    }

    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        if (monitoring == null) {
            monitoring = Monitoring.getDefaultInstance();
        }
        return monitoring;
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
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override
    public ByteString getProducerProjectIdBytes() {
        return ByteString.copyFromUtf8((String)this.producerProjectId_);
    }

    @Override
    public Quota getQuota() {
        Quota quota = this.quota_;
        if (quota == null) {
            quota = Quota.getDefaultInstance();
        }
        return quota;
    }

    @Override
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo == null) {
            sourceInfo = SourceInfo.getDefaultInstance();
        }
        return sourceInfo;
    }

    @Override
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters == null) {
            systemParameters = SystemParameters.getDefaultInstance();
        }
        return systemParameters;
    }

    @Override
    public String getTitle() {
        return this.title_;
    }

    @Override
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8((String)this.title_);
    }

    @Override
    public Type getTypes(int n) {
        return (Type)this.types_.get(n);
    }

    @Override
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override
    public List<Type> getTypesList() {
        return this.types_;
    }

    public TypeOrBuilder getTypesOrBuilder(int n) {
        return (TypeOrBuilder)this.types_.get(n);
    }

    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override
    public Usage getUsage() {
        Usage usage = this.usage_;
        if (usage == null) {
            usage = Usage.getDefaultInstance();
        }
        return usage;
    }

    @Override
    public boolean hasAuthentication() {
        return this.authentication_ != null;
    }

    @Override
    public boolean hasBackend() {
        return this.backend_ != null;
    }

    @Override
    public boolean hasBilling() {
        return this.billing_ != null;
    }

    @Override
    public boolean hasConfigVersion() {
        return this.configVersion_ != null;
    }

    @Override
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override
    public boolean hasControl() {
        return this.control_ != null;
    }

    @Override
    public boolean hasDocumentation() {
        return this.documentation_ != null;
    }

    @Override
    public boolean hasHttp() {
        return this.http_ != null;
    }

    @Override
    public boolean hasLogging() {
        return this.logging_ != null;
    }

    @Override
    public boolean hasMonitoring() {
        return this.monitoring_ != null;
    }

    @Override
    public boolean hasQuota() {
        return this.quota_ != null;
    }

    @Override
    public boolean hasSourceInfo() {
        return this.sourceInfo_ != null;
    }

    @Override
    public boolean hasSystemParameters() {
        return this.systemParameters_ != null;
    }

    @Override
    public boolean hasUsage() {
        return this.usage_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Service, Builder>
    implements ServiceOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllApis(Iterable<? extends Api> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllApis((Iterable<? extends Api>)iterable);
            return this;
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllEndpoints((Iterable<? extends Endpoint>)iterable);
            return this;
        }

        public Builder addAllEnums(Iterable<? extends Enum> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllEnums((Iterable<? extends Enum>)iterable);
            return this;
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllLogs((Iterable<? extends LogDescriptor>)iterable);
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllMetrics((Iterable<? extends MetricDescriptor>)iterable);
            return this;
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllMonitoredResources((Iterable<? extends MonitoredResourceDescriptor>)iterable);
            return this;
        }

        public Builder addAllTypes(Iterable<? extends Type> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllTypes((Iterable<? extends Type>)iterable);
            return this;
        }

        public Builder addApis(int n, Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(n, (Api)builder.build());
            return this;
        }

        public Builder addApis(int n, Api api) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(n, api);
            return this;
        }

        public Builder addApis(Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addApis((Api)builder.build());
            return this;
        }

        public Builder addApis(Api api) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(api);
            return this;
        }

        public Builder addEndpoints(int n, Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(n, (Endpoint)builder.build());
            return this;
        }

        public Builder addEndpoints(int n, Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(n, endpoint);
            return this;
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints((Endpoint)builder.build());
            return this;
        }

        public Builder addEndpoints(Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(endpoint);
            return this;
        }

        public Builder addEnums(int n, Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(n, (Enum)builder.build());
            return this;
        }

        public Builder addEnums(int n, Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(n, enum_);
            return this;
        }

        public Builder addEnums(Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums((Enum)builder.build());
            return this;
        }

        public Builder addEnums(Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(enum_);
            return this;
        }

        public Builder addLogs(int n, LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(n, (LogDescriptor)builder.build());
            return this;
        }

        public Builder addLogs(int n, LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(n, logDescriptor);
            return this;
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs((LogDescriptor)builder.build());
            return this;
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(logDescriptor);
            return this;
        }

        public Builder addMetrics(int n, MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(n, (MetricDescriptor)builder.build());
            return this;
        }

        public Builder addMetrics(int n, MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(n, metricDescriptor);
            return this;
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics((MetricDescriptor)builder.build());
            return this;
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(n, (MonitoredResourceDescriptor)builder.build());
            return this;
        }

        public Builder addMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(n, monitoredResourceDescriptor);
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources((MonitoredResourceDescriptor)builder.build());
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(int n, Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(n, (Type)builder.build());
            return this;
        }

        public Builder addTypes(int n, Type type) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(n, type);
            return this;
        }

        public Builder addTypes(Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes((Type)builder.build());
            return this;
        }

        public Builder addTypes(Type type) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(type);
            return this;
        }

        public Builder clearApis() {
            this.copyOnWrite();
            ((Service)this.instance).clearApis();
            return this;
        }

        public Builder clearAuthentication() {
            this.copyOnWrite();
            ((Service)this.instance).clearAuthentication();
            return this;
        }

        public Builder clearBackend() {
            this.copyOnWrite();
            ((Service)this.instance).clearBackend();
            return this;
        }

        public Builder clearBilling() {
            this.copyOnWrite();
            ((Service)this.instance).clearBilling();
            return this;
        }

        public Builder clearConfigVersion() {
            this.copyOnWrite();
            ((Service)this.instance).clearConfigVersion();
            return this;
        }

        public Builder clearContext() {
            this.copyOnWrite();
            ((Service)this.instance).clearContext();
            return this;
        }

        public Builder clearControl() {
            this.copyOnWrite();
            ((Service)this.instance).clearControl();
            return this;
        }

        public Builder clearDocumentation() {
            this.copyOnWrite();
            ((Service)this.instance).clearDocumentation();
            return this;
        }

        public Builder clearEndpoints() {
            this.copyOnWrite();
            ((Service)this.instance).clearEndpoints();
            return this;
        }

        public Builder clearEnums() {
            this.copyOnWrite();
            ((Service)this.instance).clearEnums();
            return this;
        }

        public Builder clearHttp() {
            this.copyOnWrite();
            ((Service)this.instance).clearHttp();
            return this;
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((Service)this.instance).clearId();
            return this;
        }

        public Builder clearLogging() {
            this.copyOnWrite();
            ((Service)this.instance).clearLogging();
            return this;
        }

        public Builder clearLogs() {
            this.copyOnWrite();
            ((Service)this.instance).clearLogs();
            return this;
        }

        public Builder clearMetrics() {
            this.copyOnWrite();
            ((Service)this.instance).clearMetrics();
            return this;
        }

        public Builder clearMonitoredResources() {
            this.copyOnWrite();
            ((Service)this.instance).clearMonitoredResources();
            return this;
        }

        public Builder clearMonitoring() {
            this.copyOnWrite();
            ((Service)this.instance).clearMonitoring();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Service)this.instance).clearName();
            return this;
        }

        public Builder clearProducerProjectId() {
            this.copyOnWrite();
            ((Service)this.instance).clearProducerProjectId();
            return this;
        }

        public Builder clearQuota() {
            this.copyOnWrite();
            ((Service)this.instance).clearQuota();
            return this;
        }

        public Builder clearSourceInfo() {
            this.copyOnWrite();
            ((Service)this.instance).clearSourceInfo();
            return this;
        }

        public Builder clearSystemParameters() {
            this.copyOnWrite();
            ((Service)this.instance).clearSystemParameters();
            return this;
        }

        public Builder clearTitle() {
            this.copyOnWrite();
            ((Service)this.instance).clearTitle();
            return this;
        }

        public Builder clearTypes() {
            this.copyOnWrite();
            ((Service)this.instance).clearTypes();
            return this;
        }

        public Builder clearUsage() {
            this.copyOnWrite();
            ((Service)this.instance).clearUsage();
            return this;
        }

        @Override
        public Api getApis(int n) {
            return ((Service)this.instance).getApis(n);
        }

        @Override
        public int getApisCount() {
            return ((Service)this.instance).getApisCount();
        }

        @Override
        public List<Api> getApisList() {
            return Collections.unmodifiableList(((Service)this.instance).getApisList());
        }

        @Override
        public Authentication getAuthentication() {
            return ((Service)this.instance).getAuthentication();
        }

        @Override
        public Backend getBackend() {
            return ((Service)this.instance).getBackend();
        }

        @Override
        public Billing getBilling() {
            return ((Service)this.instance).getBilling();
        }

        @Override
        public UInt32Value getConfigVersion() {
            return ((Service)this.instance).getConfigVersion();
        }

        @Override
        public Context getContext() {
            return ((Service)this.instance).getContext();
        }

        @Override
        public Control getControl() {
            return ((Service)this.instance).getControl();
        }

        @Override
        public Documentation getDocumentation() {
            return ((Service)this.instance).getDocumentation();
        }

        @Override
        public Endpoint getEndpoints(int n) {
            return ((Service)this.instance).getEndpoints(n);
        }

        @Override
        public int getEndpointsCount() {
            return ((Service)this.instance).getEndpointsCount();
        }

        @Override
        public List<Endpoint> getEndpointsList() {
            return Collections.unmodifiableList(((Service)this.instance).getEndpointsList());
        }

        @Override
        public Enum getEnums(int n) {
            return ((Service)this.instance).getEnums(n);
        }

        @Override
        public int getEnumsCount() {
            return ((Service)this.instance).getEnumsCount();
        }

        @Override
        public List<Enum> getEnumsList() {
            return Collections.unmodifiableList(((Service)this.instance).getEnumsList());
        }

        @Override
        public Http getHttp() {
            return ((Service)this.instance).getHttp();
        }

        @Override
        public String getId() {
            return ((Service)this.instance).getId();
        }

        @Override
        public ByteString getIdBytes() {
            return ((Service)this.instance).getIdBytes();
        }

        @Override
        public Logging getLogging() {
            return ((Service)this.instance).getLogging();
        }

        @Override
        public LogDescriptor getLogs(int n) {
            return ((Service)this.instance).getLogs(n);
        }

        @Override
        public int getLogsCount() {
            return ((Service)this.instance).getLogsCount();
        }

        @Override
        public List<LogDescriptor> getLogsList() {
            return Collections.unmodifiableList(((Service)this.instance).getLogsList());
        }

        @Override
        public MetricDescriptor getMetrics(int n) {
            return ((Service)this.instance).getMetrics(n);
        }

        @Override
        public int getMetricsCount() {
            return ((Service)this.instance).getMetricsCount();
        }

        @Override
        public List<MetricDescriptor> getMetricsList() {
            return Collections.unmodifiableList(((Service)this.instance).getMetricsList());
        }

        @Override
        public MonitoredResourceDescriptor getMonitoredResources(int n) {
            return ((Service)this.instance).getMonitoredResources(n);
        }

        @Override
        public int getMonitoredResourcesCount() {
            return ((Service)this.instance).getMonitoredResourcesCount();
        }

        @Override
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((Service)this.instance).getMonitoredResourcesList());
        }

        @Override
        public Monitoring getMonitoring() {
            return ((Service)this.instance).getMonitoring();
        }

        @Override
        public String getName() {
            return ((Service)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Service)this.instance).getNameBytes();
        }

        @Override
        public String getProducerProjectId() {
            return ((Service)this.instance).getProducerProjectId();
        }

        @Override
        public ByteString getProducerProjectIdBytes() {
            return ((Service)this.instance).getProducerProjectIdBytes();
        }

        @Override
        public Quota getQuota() {
            return ((Service)this.instance).getQuota();
        }

        @Override
        public SourceInfo getSourceInfo() {
            return ((Service)this.instance).getSourceInfo();
        }

        @Override
        public SystemParameters getSystemParameters() {
            return ((Service)this.instance).getSystemParameters();
        }

        @Override
        public String getTitle() {
            return ((Service)this.instance).getTitle();
        }

        @Override
        public ByteString getTitleBytes() {
            return ((Service)this.instance).getTitleBytes();
        }

        @Override
        public Type getTypes(int n) {
            return ((Service)this.instance).getTypes(n);
        }

        @Override
        public int getTypesCount() {
            return ((Service)this.instance).getTypesCount();
        }

        @Override
        public List<Type> getTypesList() {
            return Collections.unmodifiableList(((Service)this.instance).getTypesList());
        }

        @Override
        public Usage getUsage() {
            return ((Service)this.instance).getUsage();
        }

        @Override
        public boolean hasAuthentication() {
            return ((Service)this.instance).hasAuthentication();
        }

        @Override
        public boolean hasBackend() {
            return ((Service)this.instance).hasBackend();
        }

        @Override
        public boolean hasBilling() {
            return ((Service)this.instance).hasBilling();
        }

        @Override
        public boolean hasConfigVersion() {
            return ((Service)this.instance).hasConfigVersion();
        }

        @Override
        public boolean hasContext() {
            return ((Service)this.instance).hasContext();
        }

        @Override
        public boolean hasControl() {
            return ((Service)this.instance).hasControl();
        }

        @Override
        public boolean hasDocumentation() {
            return ((Service)this.instance).hasDocumentation();
        }

        @Override
        public boolean hasHttp() {
            return ((Service)this.instance).hasHttp();
        }

        @Override
        public boolean hasLogging() {
            return ((Service)this.instance).hasLogging();
        }

        @Override
        public boolean hasMonitoring() {
            return ((Service)this.instance).hasMonitoring();
        }

        @Override
        public boolean hasQuota() {
            return ((Service)this.instance).hasQuota();
        }

        @Override
        public boolean hasSourceInfo() {
            return ((Service)this.instance).hasSourceInfo();
        }

        @Override
        public boolean hasSystemParameters() {
            return ((Service)this.instance).hasSystemParameters();
        }

        @Override
        public boolean hasUsage() {
            return ((Service)this.instance).hasUsage();
        }

        public Builder mergeAuthentication(Authentication authentication) {
            this.copyOnWrite();
            ((Service)this.instance).mergeAuthentication(authentication);
            return this;
        }

        public Builder mergeBackend(Backend backend) {
            this.copyOnWrite();
            ((Service)this.instance).mergeBackend(backend);
            return this;
        }

        public Builder mergeBilling(Billing billing) {
            this.copyOnWrite();
            ((Service)this.instance).mergeBilling(billing);
            return this;
        }

        public Builder mergeConfigVersion(UInt32Value uInt32Value) {
            this.copyOnWrite();
            ((Service)this.instance).mergeConfigVersion(uInt32Value);
            return this;
        }

        public Builder mergeContext(Context context) {
            this.copyOnWrite();
            ((Service)this.instance).mergeContext(context);
            return this;
        }

        public Builder mergeControl(Control control) {
            this.copyOnWrite();
            ((Service)this.instance).mergeControl(control);
            return this;
        }

        public Builder mergeDocumentation(Documentation documentation) {
            this.copyOnWrite();
            ((Service)this.instance).mergeDocumentation(documentation);
            return this;
        }

        public Builder mergeHttp(Http http) {
            this.copyOnWrite();
            ((Service)this.instance).mergeHttp(http);
            return this;
        }

        public Builder mergeLogging(Logging logging) {
            this.copyOnWrite();
            ((Service)this.instance).mergeLogging(logging);
            return this;
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
            this.copyOnWrite();
            ((Service)this.instance).mergeMonitoring(monitoring);
            return this;
        }

        public Builder mergeQuota(Quota quota) {
            this.copyOnWrite();
            ((Service)this.instance).mergeQuota(quota);
            return this;
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
            this.copyOnWrite();
            ((Service)this.instance).mergeSourceInfo(sourceInfo);
            return this;
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
            this.copyOnWrite();
            ((Service)this.instance).mergeSystemParameters(systemParameters);
            return this;
        }

        public Builder mergeUsage(Usage usage) {
            this.copyOnWrite();
            ((Service)this.instance).mergeUsage(usage);
            return this;
        }

        public Builder removeApis(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeApis(n);
            return this;
        }

        public Builder removeEndpoints(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeEndpoints(n);
            return this;
        }

        public Builder removeEnums(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeEnums(n);
            return this;
        }

        public Builder removeLogs(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeLogs(n);
            return this;
        }

        public Builder removeMetrics(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeMetrics(n);
            return this;
        }

        public Builder removeMonitoredResources(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeMonitoredResources(n);
            return this;
        }

        public Builder removeTypes(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeTypes(n);
            return this;
        }

        public Builder setApis(int n, Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setApis(n, (Api)builder.build());
            return this;
        }

        public Builder setApis(int n, Api api) {
            this.copyOnWrite();
            ((Service)this.instance).setApis(n, api);
            return this;
        }

        public Builder setAuthentication(Authentication.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setAuthentication((Authentication)builder.build());
            return this;
        }

        public Builder setAuthentication(Authentication authentication) {
            this.copyOnWrite();
            ((Service)this.instance).setAuthentication(authentication);
            return this;
        }

        public Builder setBackend(Backend.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setBackend((Backend)builder.build());
            return this;
        }

        public Builder setBackend(Backend backend) {
            this.copyOnWrite();
            ((Service)this.instance).setBackend(backend);
            return this;
        }

        public Builder setBilling(Billing.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setBilling((Billing)builder.build());
            return this;
        }

        public Builder setBilling(Billing billing) {
            this.copyOnWrite();
            ((Service)this.instance).setBilling(billing);
            return this;
        }

        public Builder setConfigVersion(UInt32Value.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setConfigVersion((UInt32Value)builder.build());
            return this;
        }

        public Builder setConfigVersion(UInt32Value uInt32Value) {
            this.copyOnWrite();
            ((Service)this.instance).setConfigVersion(uInt32Value);
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setContext((Context)builder.build());
            return this;
        }

        public Builder setContext(Context context) {
            this.copyOnWrite();
            ((Service)this.instance).setContext(context);
            return this;
        }

        public Builder setControl(Control.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setControl((Control)builder.build());
            return this;
        }

        public Builder setControl(Control control) {
            this.copyOnWrite();
            ((Service)this.instance).setControl(control);
            return this;
        }

        public Builder setDocumentation(Documentation.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setDocumentation((Documentation)builder.build());
            return this;
        }

        public Builder setDocumentation(Documentation documentation) {
            this.copyOnWrite();
            ((Service)this.instance).setDocumentation(documentation);
            return this;
        }

        public Builder setEndpoints(int n, Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setEndpoints(n, (Endpoint)builder.build());
            return this;
        }

        public Builder setEndpoints(int n, Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).setEndpoints(n, endpoint);
            return this;
        }

        public Builder setEnums(int n, Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setEnums(n, (Enum)builder.build());
            return this;
        }

        public Builder setEnums(int n, Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).setEnums(n, enum_);
            return this;
        }

        public Builder setHttp(Http.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setHttp((Http)builder.build());
            return this;
        }

        public Builder setHttp(Http http) {
            this.copyOnWrite();
            ((Service)this.instance).setHttp(http);
            return this;
        }

        public Builder setId(String string) {
            this.copyOnWrite();
            ((Service)this.instance).setId(string);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setLogging(Logging.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setLogging((Logging)builder.build());
            return this;
        }

        public Builder setLogging(Logging logging) {
            this.copyOnWrite();
            ((Service)this.instance).setLogging(logging);
            return this;
        }

        public Builder setLogs(int n, LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setLogs(n, (LogDescriptor)builder.build());
            return this;
        }

        public Builder setLogs(int n, LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setLogs(n, logDescriptor);
            return this;
        }

        public Builder setMetrics(int n, MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMetrics(n, (MetricDescriptor)builder.build());
            return this;
        }

        public Builder setMetrics(int n, MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setMetrics(n, metricDescriptor);
            return this;
        }

        public Builder setMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoredResources(n, (MonitoredResourceDescriptor)builder.build());
            return this;
        }

        public Builder setMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoredResources(n, monitoredResourceDescriptor);
            return this;
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoring((Monitoring)builder.build());
            return this;
        }

        public Builder setMonitoring(Monitoring monitoring) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoring(monitoring);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Service)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setProducerProjectId(String string) {
            this.copyOnWrite();
            ((Service)this.instance).setProducerProjectId(string);
            return this;
        }

        public Builder setProducerProjectIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setProducerProjectIdBytes(byteString);
            return this;
        }

        public Builder setQuota(Quota.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setQuota((Quota)builder.build());
            return this;
        }

        public Builder setQuota(Quota quota) {
            this.copyOnWrite();
            ((Service)this.instance).setQuota(quota);
            return this;
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setSourceInfo((SourceInfo)builder.build());
            return this;
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
            this.copyOnWrite();
            ((Service)this.instance).setSourceInfo(sourceInfo);
            return this;
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setSystemParameters((SystemParameters)builder.build());
            return this;
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
            this.copyOnWrite();
            ((Service)this.instance).setSystemParameters(systemParameters);
            return this;
        }

        public Builder setTitle(String string) {
            this.copyOnWrite();
            ((Service)this.instance).setTitle(string);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTypes(int n, Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setTypes(n, (Type)builder.build());
            return this;
        }

        public Builder setTypes(int n, Type type) {
            this.copyOnWrite();
            ((Service)this.instance).setTypes(n, type);
            return this;
        }

        public Builder setUsage(Usage.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setUsage((Usage)builder.build());
            return this;
        }

        public Builder setUsage(Usage usage) {
            this.copyOnWrite();
            ((Service)this.instance).setUsage(usage);
            return this;
        }
    }

}

