/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Authentication
 *  com.google.api.Backend
 *  com.google.api.Billing
 *  com.google.api.Context
 *  com.google.api.Control
 *  com.google.api.Documentation
 *  com.google.api.Endpoint
 *  com.google.api.Http
 *  com.google.api.LogDescriptor
 *  com.google.api.Logging
 *  com.google.api.MetricDescriptor
 *  com.google.api.MonitoredResourceDescriptor
 *  com.google.api.Monitoring
 *  com.google.api.Quota
 *  com.google.api.SourceInfo
 *  com.google.api.SystemParameters
 *  com.google.api.Usage
 *  com.google.protobuf.Api
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.Enum
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Type
 *  com.google.protobuf.UInt32Value
 *  java.lang.Object
 *  java.lang.String
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
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.Api;
import com.google.protobuf.ByteString;
import com.google.protobuf.Enum;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import java.util.List;

public interface ServiceOrBuilder
extends MessageLiteOrBuilder {
    public Api getApis(int var1);

    public int getApisCount();

    public List<Api> getApisList();

    public Authentication getAuthentication();

    public Backend getBackend();

    public Billing getBilling();

    public UInt32Value getConfigVersion();

    public Context getContext();

    public Control getControl();

    public Documentation getDocumentation();

    public Endpoint getEndpoints(int var1);

    public int getEndpointsCount();

    public List<Endpoint> getEndpointsList();

    public Enum getEnums(int var1);

    public int getEnumsCount();

    public List<Enum> getEnumsList();

    public Http getHttp();

    public String getId();

    public ByteString getIdBytes();

    public Logging getLogging();

    public LogDescriptor getLogs(int var1);

    public int getLogsCount();

    public List<LogDescriptor> getLogsList();

    public MetricDescriptor getMetrics(int var1);

    public int getMetricsCount();

    public List<MetricDescriptor> getMetricsList();

    public MonitoredResourceDescriptor getMonitoredResources(int var1);

    public int getMonitoredResourcesCount();

    public List<MonitoredResourceDescriptor> getMonitoredResourcesList();

    public Monitoring getMonitoring();

    public String getName();

    public ByteString getNameBytes();

    public String getProducerProjectId();

    public ByteString getProducerProjectIdBytes();

    public Quota getQuota();

    public SourceInfo getSourceInfo();

    public SystemParameters getSystemParameters();

    public String getTitle();

    public ByteString getTitleBytes();

    public Type getTypes(int var1);

    public int getTypesCount();

    public List<Type> getTypesList();

    public Usage getUsage();

    public boolean hasAuthentication();

    public boolean hasBackend();

    public boolean hasBilling();

    public boolean hasConfigVersion();

    public boolean hasContext();

    public boolean hasControl();

    public boolean hasDocumentation();

    public boolean hasHttp();

    public boolean hasLogging();

    public boolean hasMonitoring();

    public boolean hasQuota();

    public boolean hasSourceInfo();

    public boolean hasSystemParameters();

    public boolean hasUsage();
}

