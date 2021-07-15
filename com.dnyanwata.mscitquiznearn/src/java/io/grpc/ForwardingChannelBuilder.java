/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.MoreObjects$ToStringHelper
 *  io.grpc.BinaryLog
 *  io.grpc.ClientInterceptor
 *  io.grpc.CompressorRegistry
 *  io.grpc.DecompressorRegistry
 *  io.grpc.ManagedChannel
 *  io.grpc.ManagedChannelBuilder
 *  io.grpc.NameResolver
 *  io.grpc.NameResolver$Factory
 *  io.grpc.ProxyDetector
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.BinaryLog;
import io.grpc.ClientInterceptor;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.ProxyDetector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public abstract class ForwardingChannelBuilder<T extends ForwardingChannelBuilder<T>>
extends ManagedChannelBuilder<T> {
    protected ForwardingChannelBuilder() {
    }

    public static ManagedChannelBuilder<?> forAddress(String string2, int n) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    public static ManagedChannelBuilder<?> forTarget(String string2) {
        throw new UnsupportedOperationException("Subclass failed to hide static factory");
    }

    @Deprecated
    public T blockingExecutor(Executor executor) {
        this.delegate().blockingExecutor(executor);
        return this.thisT();
    }

    public ManagedChannel build() {
        return this.delegate().build();
    }

    public T compressorRegistry(CompressorRegistry compressorRegistry) {
        this.delegate().compressorRegistry(compressorRegistry);
        return this.thisT();
    }

    public T decompressorRegistry(DecompressorRegistry decompressorRegistry) {
        this.delegate().decompressorRegistry(decompressorRegistry);
        return this.thisT();
    }

    public T defaultLoadBalancingPolicy(String string2) {
        this.delegate().defaultLoadBalancingPolicy(string2);
        return this.thisT();
    }

    public T defaultServiceConfig(@Nullable Map<String, ?> map) {
        this.delegate().defaultServiceConfig(map);
        return this.thisT();
    }

    protected abstract ManagedChannelBuilder<?> delegate();

    public T directExecutor() {
        this.delegate().directExecutor();
        return this.thisT();
    }

    public T disableRetry() {
        this.delegate().disableRetry();
        return this.thisT();
    }

    public T disableServiceConfigLookUp() {
        this.delegate().disableServiceConfigLookUp();
        return this.thisT();
    }

    public T enableFullStreamDecompression() {
        this.delegate().enableFullStreamDecompression();
        return this.thisT();
    }

    public T enableRetry() {
        this.delegate().enableRetry();
        return this.thisT();
    }

    public T executor(Executor executor) {
        this.delegate().executor(executor);
        return this.thisT();
    }

    public T idleTimeout(long l, TimeUnit timeUnit) {
        this.delegate().idleTimeout(l, timeUnit);
        return this.thisT();
    }

    public T intercept(List<ClientInterceptor> list) {
        this.delegate().intercept(list);
        return this.thisT();
    }

    public /* varargs */ T intercept(ClientInterceptor ... arrclientInterceptor) {
        this.delegate().intercept(arrclientInterceptor);
        return this.thisT();
    }

    public T keepAliveTime(long l, TimeUnit timeUnit) {
        this.delegate().keepAliveTime(l, timeUnit);
        return this.thisT();
    }

    public T keepAliveTimeout(long l, TimeUnit timeUnit) {
        this.delegate().keepAliveTimeout(l, timeUnit);
        return this.thisT();
    }

    public T keepAliveWithoutCalls(boolean bl) {
        this.delegate().keepAliveWithoutCalls(bl);
        return this.thisT();
    }

    public T maxHedgedAttempts(int n) {
        this.delegate().maxHedgedAttempts(n);
        return this.thisT();
    }

    public T maxInboundMessageSize(int n) {
        this.delegate().maxInboundMessageSize(n);
        return this.thisT();
    }

    public T maxInboundMetadataSize(int n) {
        this.delegate().maxInboundMetadataSize(n);
        return this.thisT();
    }

    public T maxRetryAttempts(int n) {
        this.delegate().maxRetryAttempts(n);
        return this.thisT();
    }

    public T maxTraceEvents(int n) {
        this.delegate().maxTraceEvents(n);
        return this.thisT();
    }

    public T nameResolverFactory(NameResolver.Factory factory) {
        this.delegate().nameResolverFactory(factory);
        return this.thisT();
    }

    public T offloadExecutor(Executor executor) {
        this.delegate().offloadExecutor(executor);
        return this.thisT();
    }

    public T overrideAuthority(String string2) {
        this.delegate().overrideAuthority(string2);
        return this.thisT();
    }

    public T perRpcBufferLimit(long l) {
        this.delegate().perRpcBufferLimit(l);
        return this.thisT();
    }

    public T proxyDetector(ProxyDetector proxyDetector) {
        this.delegate().proxyDetector(proxyDetector);
        return this.thisT();
    }

    public T retryBufferSize(long l) {
        this.delegate().retryBufferSize(l);
        return this.thisT();
    }

    public T setBinaryLog(BinaryLog binaryLog) {
        this.delegate().setBinaryLog(binaryLog);
        return this.thisT();
    }

    protected final T thisT() {
        return (T)((Object)this);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)((Object)this)).add("delegate", this.delegate()).toString();
    }

    public T usePlaintext() {
        this.delegate().usePlaintext();
        return this.thisT();
    }

    public T useTransportSecurity() {
        this.delegate().useTransportSecurity();
        return this.thisT();
    }

    public T userAgent(String string2) {
        this.delegate().userAgent(string2);
        return this.thisT();
    }
}

