/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Duration
 *  com.google.protobuf.Duration$Builder
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
package com.google.logging.type;

import com.google.logging.type.HttpRequest;
import com.google.logging.type.HttpRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HttpRequest
extends GeneratedMessageLite<HttpRequest, Builder>
implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser<HttpRequest> PARSER;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    static {
        HttpRequest httpRequest;
        DEFAULT_INSTANCE = httpRequest = new HttpRequest();
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, (GeneratedMessageLite)httpRequest);
    }

    private HttpRequest() {
    }

    private void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    private void clearCacheHit() {
        this.cacheHit_ = false;
    }

    private void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    private void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    private void clearLatency() {
        this.latency_ = null;
    }

    private void clearProtocol() {
        this.protocol_ = HttpRequest.getDefaultInstance().getProtocol();
    }

    private void clearReferer() {
        this.referer_ = HttpRequest.getDefaultInstance().getReferer();
    }

    private void clearRemoteIp() {
        this.remoteIp_ = HttpRequest.getDefaultInstance().getRemoteIp();
    }

    private void clearRequestMethod() {
        this.requestMethod_ = HttpRequest.getDefaultInstance().getRequestMethod();
    }

    private void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    private void clearRequestUrl() {
        this.requestUrl_ = HttpRequest.getDefaultInstance().getRequestUrl();
    }

    private void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    private void clearServerIp() {
        this.serverIp_ = HttpRequest.getDefaultInstance().getServerIp();
    }

    private void clearStatus() {
        this.status_ = 0;
    }

    private void clearUserAgent() {
        this.userAgent_ = HttpRequest.getDefaultInstance().getUserAgent();
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLatency(Duration duration) {
        duration.getClass();
        Duration duration2 = this.latency_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.latency_ = (Duration)((Duration.Builder)Duration.newBuilder((Duration)this.latency_).mergeFrom((GeneratedMessageLite)duration)).buildPartial();
            return;
        }
        this.latency_ = duration;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HttpRequest httpRequest) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)httpRequest);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest)HttpRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)HttpRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCacheFillBytes(long l) {
        this.cacheFillBytes_ = l;
    }

    private void setCacheHit(boolean bl) {
        this.cacheHit_ = bl;
    }

    private void setCacheLookup(boolean bl) {
        this.cacheLookup_ = bl;
    }

    private void setCacheValidatedWithOriginServer(boolean bl) {
        this.cacheValidatedWithOriginServer_ = bl;
    }

    private void setLatency(Duration duration) {
        duration.getClass();
        this.latency_ = duration;
    }

    private void setProtocol(String string) {
        string.getClass();
        this.protocol_ = string;
    }

    private void setProtocolBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.protocol_ = byteString.toStringUtf8();
    }

    private void setReferer(String string) {
        string.getClass();
        this.referer_ = string;
    }

    private void setRefererBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.referer_ = byteString.toStringUtf8();
    }

    private void setRemoteIp(String string) {
        string.getClass();
        this.remoteIp_ = string;
    }

    private void setRemoteIpBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.remoteIp_ = byteString.toStringUtf8();
    }

    private void setRequestMethod(String string) {
        string.getClass();
        this.requestMethod_ = string;
    }

    private void setRequestMethodBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.requestMethod_ = byteString.toStringUtf8();
    }

    private void setRequestSize(long l) {
        this.requestSize_ = l;
    }

    private void setRequestUrl(String string) {
        string.getClass();
        this.requestUrl_ = string;
    }

    private void setRequestUrlBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.requestUrl_ = byteString.toStringUtf8();
    }

    private void setResponseSize(long l) {
        this.responseSize_ = l;
    }

    private void setServerIp(String string) {
        string.getClass();
        this.serverIp_ = string;
    }

    private void setServerIpBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.serverIp_ = byteString.toStringUtf8();
    }

    private void setStatus(int n) {
        this.status_ = n;
    }

    private void setUserAgent(String string) {
        string.getClass();
        this.userAgent_ = string;
    }

    private void setUserAgentBytes(ByteString byteString) {
        HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
        this.userAgent_ = byteString.toStringUtf8();
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
                Parser<HttpRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<HttpRequest> class_ = HttpRequest.class;
                synchronized (HttpRequest.class) {
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
                Object[] arrobject = new Object[]{"requestMethod_", "requestUrl_", "requestSize_", "status_", "responseSize_", "userAgent_", "remoteIp_", "referer_", "cacheHit_", "cacheValidatedWithOriginServer_", "cacheLookup_", "cacheFillBytes_", "serverIp_", "latency_", "protocol_"};
                return HttpRequest.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0004\u0005\u0002\u0006\u0208\u0007\u0208\b\u0208\t\u0007\n\u0007\u000b\u0007\f\u0002\r\u0208\u000e\t\u000f\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new HttpRequest();
    }

    @Override
    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    @Override
    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    @Override
    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    @Override
    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    @Override
    public Duration getLatency() {
        Duration duration = this.latency_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    @Override
    public String getProtocol() {
        return this.protocol_;
    }

    @Override
    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8((String)this.protocol_);
    }

    @Override
    public String getReferer() {
        return this.referer_;
    }

    @Override
    public ByteString getRefererBytes() {
        return ByteString.copyFromUtf8((String)this.referer_);
    }

    @Override
    public String getRemoteIp() {
        return this.remoteIp_;
    }

    @Override
    public ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8((String)this.remoteIp_);
    }

    @Override
    public String getRequestMethod() {
        return this.requestMethod_;
    }

    @Override
    public ByteString getRequestMethodBytes() {
        return ByteString.copyFromUtf8((String)this.requestMethod_);
    }

    @Override
    public long getRequestSize() {
        return this.requestSize_;
    }

    @Override
    public String getRequestUrl() {
        return this.requestUrl_;
    }

    @Override
    public ByteString getRequestUrlBytes() {
        return ByteString.copyFromUtf8((String)this.requestUrl_);
    }

    @Override
    public long getResponseSize() {
        return this.responseSize_;
    }

    @Override
    public String getServerIp() {
        return this.serverIp_;
    }

    @Override
    public ByteString getServerIpBytes() {
        return ByteString.copyFromUtf8((String)this.serverIp_);
    }

    @Override
    public int getStatus() {
        return this.status_;
    }

    @Override
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override
    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8((String)this.userAgent_);
    }

    @Override
    public boolean hasLatency() {
        return this.latency_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpRequest, Builder>
    implements HttpRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCacheFillBytes() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheFillBytes();
            return this;
        }

        public Builder clearCacheHit() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheHit();
            return this;
        }

        public Builder clearCacheLookup() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheLookup();
            return this;
        }

        public Builder clearCacheValidatedWithOriginServer() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheValidatedWithOriginServer();
            return this;
        }

        public Builder clearLatency() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearLatency();
            return this;
        }

        public Builder clearProtocol() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearProtocol();
            return this;
        }

        public Builder clearReferer() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearReferer();
            return this;
        }

        public Builder clearRemoteIp() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRemoteIp();
            return this;
        }

        public Builder clearRequestMethod() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestMethod();
            return this;
        }

        public Builder clearRequestSize() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestSize();
            return this;
        }

        public Builder clearRequestUrl() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestUrl();
            return this;
        }

        public Builder clearResponseSize() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearResponseSize();
            return this;
        }

        public Builder clearServerIp() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearServerIp();
            return this;
        }

        public Builder clearStatus() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearStatus();
            return this;
        }

        public Builder clearUserAgent() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearUserAgent();
            return this;
        }

        @Override
        public long getCacheFillBytes() {
            return ((HttpRequest)this.instance).getCacheFillBytes();
        }

        @Override
        public boolean getCacheHit() {
            return ((HttpRequest)this.instance).getCacheHit();
        }

        @Override
        public boolean getCacheLookup() {
            return ((HttpRequest)this.instance).getCacheLookup();
        }

        @Override
        public boolean getCacheValidatedWithOriginServer() {
            return ((HttpRequest)this.instance).getCacheValidatedWithOriginServer();
        }

        @Override
        public Duration getLatency() {
            return ((HttpRequest)this.instance).getLatency();
        }

        @Override
        public String getProtocol() {
            return ((HttpRequest)this.instance).getProtocol();
        }

        @Override
        public ByteString getProtocolBytes() {
            return ((HttpRequest)this.instance).getProtocolBytes();
        }

        @Override
        public String getReferer() {
            return ((HttpRequest)this.instance).getReferer();
        }

        @Override
        public ByteString getRefererBytes() {
            return ((HttpRequest)this.instance).getRefererBytes();
        }

        @Override
        public String getRemoteIp() {
            return ((HttpRequest)this.instance).getRemoteIp();
        }

        @Override
        public ByteString getRemoteIpBytes() {
            return ((HttpRequest)this.instance).getRemoteIpBytes();
        }

        @Override
        public String getRequestMethod() {
            return ((HttpRequest)this.instance).getRequestMethod();
        }

        @Override
        public ByteString getRequestMethodBytes() {
            return ((HttpRequest)this.instance).getRequestMethodBytes();
        }

        @Override
        public long getRequestSize() {
            return ((HttpRequest)this.instance).getRequestSize();
        }

        @Override
        public String getRequestUrl() {
            return ((HttpRequest)this.instance).getRequestUrl();
        }

        @Override
        public ByteString getRequestUrlBytes() {
            return ((HttpRequest)this.instance).getRequestUrlBytes();
        }

        @Override
        public long getResponseSize() {
            return ((HttpRequest)this.instance).getResponseSize();
        }

        @Override
        public String getServerIp() {
            return ((HttpRequest)this.instance).getServerIp();
        }

        @Override
        public ByteString getServerIpBytes() {
            return ((HttpRequest)this.instance).getServerIpBytes();
        }

        @Override
        public int getStatus() {
            return ((HttpRequest)this.instance).getStatus();
        }

        @Override
        public String getUserAgent() {
            return ((HttpRequest)this.instance).getUserAgent();
        }

        @Override
        public ByteString getUserAgentBytes() {
            return ((HttpRequest)this.instance).getUserAgentBytes();
        }

        @Override
        public boolean hasLatency() {
            return ((HttpRequest)this.instance).hasLatency();
        }

        public Builder mergeLatency(Duration duration) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).mergeLatency(duration);
            return this;
        }

        public Builder setCacheFillBytes(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheFillBytes(l);
            return this;
        }

        public Builder setCacheHit(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheHit(bl);
            return this;
        }

        public Builder setCacheLookup(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheLookup(bl);
            return this;
        }

        public Builder setCacheValidatedWithOriginServer(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheValidatedWithOriginServer(bl);
            return this;
        }

        public Builder setLatency(Duration.Builder builder) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setLatency((Duration)builder.build());
            return this;
        }

        public Builder setLatency(Duration duration) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setLatency(duration);
            return this;
        }

        public Builder setProtocol(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setProtocol(string);
            return this;
        }

        public Builder setProtocolBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setProtocolBytes(byteString);
            return this;
        }

        public Builder setReferer(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setReferer(string);
            return this;
        }

        public Builder setRefererBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRefererBytes(byteString);
            return this;
        }

        public Builder setRemoteIp(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRemoteIp(string);
            return this;
        }

        public Builder setRemoteIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRemoteIpBytes(byteString);
            return this;
        }

        public Builder setRequestMethod(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestMethod(string);
            return this;
        }

        public Builder setRequestMethodBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestMethodBytes(byteString);
            return this;
        }

        public Builder setRequestSize(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestSize(l);
            return this;
        }

        public Builder setRequestUrl(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestUrl(string);
            return this;
        }

        public Builder setRequestUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestUrlBytes(byteString);
            return this;
        }

        public Builder setResponseSize(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setResponseSize(l);
            return this;
        }

        public Builder setServerIp(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setServerIp(string);
            return this;
        }

        public Builder setServerIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setServerIpBytes(byteString);
            return this;
        }

        public Builder setStatus(int n) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setStatus(n);
            return this;
        }

        public Builder setUserAgent(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setUserAgent(string);
            return this;
        }

        public Builder setUserAgentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setUserAgentBytes(byteString);
            return this;
        }
    }

}

