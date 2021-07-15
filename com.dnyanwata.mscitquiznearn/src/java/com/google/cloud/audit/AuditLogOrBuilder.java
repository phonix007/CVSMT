/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.cloud.audit.AuthenticationInfo
 *  com.google.cloud.audit.AuthorizationInfo
 *  com.google.cloud.audit.RequestMetadata
 *  com.google.protobuf.Any
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Struct
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Struct;
import com.google.rpc.Status;
import java.util.List;

public interface AuditLogOrBuilder
extends MessageLiteOrBuilder {
    public AuthenticationInfo getAuthenticationInfo();

    public AuthorizationInfo getAuthorizationInfo(int var1);

    public int getAuthorizationInfoCount();

    public List<AuthorizationInfo> getAuthorizationInfoList();

    public String getMethodName();

    public ByteString getMethodNameBytes();

    public long getNumResponseItems();

    public Struct getRequest();

    public RequestMetadata getRequestMetadata();

    public String getResourceName();

    public ByteString getResourceNameBytes();

    public Struct getResponse();

    public Any getServiceData();

    public String getServiceName();

    public ByteString getServiceNameBytes();

    public Status getStatus();

    public boolean hasAuthenticationInfo();

    public boolean hasRequest();

    public boolean hasRequestMetadata();

    public boolean hasResponse();

    public boolean hasServiceData();

    public boolean hasStatus();
}

