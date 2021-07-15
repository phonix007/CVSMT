/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.Duration
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.logging.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

public interface HttpRequestOrBuilder
extends MessageLiteOrBuilder {
    public long getCacheFillBytes();

    public boolean getCacheHit();

    public boolean getCacheLookup();

    public boolean getCacheValidatedWithOriginServer();

    public Duration getLatency();

    public String getProtocol();

    public ByteString getProtocolBytes();

    public String getReferer();

    public ByteString getRefererBytes();

    public String getRemoteIp();

    public ByteString getRemoteIpBytes();

    public String getRequestMethod();

    public ByteString getRequestMethodBytes();

    public long getRequestSize();

    public String getRequestUrl();

    public ByteString getRequestUrlBytes();

    public long getResponseSize();

    public String getServerIp();

    public ByteString getServerIpBytes();

    public int getStatus();

    public String getUserAgent();

    public ByteString getUserAgentBytes();

    public boolean hasLatency();
}

