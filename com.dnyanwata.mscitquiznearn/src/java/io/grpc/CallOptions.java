/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.MoreObjects$ToStringHelper
 *  com.google.common.base.Preconditions
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import io.grpc.ClientStreamTracer;
import io.grpc.Deadline;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
public final class CallOptions {
    public static final CallOptions DEFAULT = new CallOptions();
    @Nullable
    private String authority;
    @Nullable
    private String compressorName;
    @Nullable
    private CallCredentials credentials;
    private Object[][] customOptions = (Object[][])Array.newInstance(Object.class, (int[])new int[]{0, 2});
    @Nullable
    private Deadline deadline;
    @Nullable
    private Executor executor;
    @Nullable
    private Integer maxInboundMessageSize;
    @Nullable
    private Integer maxOutboundMessageSize;
    private List<ClientStreamTracer.Factory> streamTracerFactories = Collections.emptyList();
    @Nullable
    private Boolean waitForReady;

    private CallOptions() {
    }

    private CallOptions(CallOptions callOptions) {
        this.deadline = callOptions.deadline;
        this.authority = callOptions.authority;
        this.credentials = callOptions.credentials;
        this.executor = callOptions.executor;
        this.compressorName = callOptions.compressorName;
        this.customOptions = callOptions.customOptions;
        this.waitForReady = callOptions.waitForReady;
        this.maxInboundMessageSize = callOptions.maxInboundMessageSize;
        this.maxOutboundMessageSize = callOptions.maxOutboundMessageSize;
        this.streamTracerFactories = callOptions.streamTracerFactories;
    }

    @Nullable
    public String getAuthority() {
        return this.authority;
    }

    @Nullable
    public String getCompressor() {
        return this.compressorName;
    }

    @Nullable
    public CallCredentials getCredentials() {
        return this.credentials;
    }

    @Nullable
    public Deadline getDeadline() {
        return this.deadline;
    }

    @Nullable
    public Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public Integer getMaxInboundMessageSize() {
        return this.maxInboundMessageSize;
    }

    @Nullable
    public Integer getMaxOutboundMessageSize() {
        return this.maxOutboundMessageSize;
    }

    public <T> T getOption(Key<T> key) {
        Object[][] arrobject;
        Preconditions.checkNotNull(key, (Object)"key");
        for (int i = 0; i < (arrobject = this.customOptions).length; ++i) {
            if (!key.equals(arrobject[i][0])) continue;
            return (T)this.customOptions[i][1];
        }
        return (T)key.defaultValue;
    }

    public List<ClientStreamTracer.Factory> getStreamTracerFactories() {
        return this.streamTracerFactories;
    }

    Boolean getWaitForReady() {
        return this.waitForReady;
    }

    public boolean isWaitForReady() {
        return Boolean.TRUE.equals((Object)this.waitForReady);
    }

    public String toString() {
        MoreObjects.ToStringHelper toStringHelper = MoreObjects.toStringHelper((Object)this).add("deadline", (Object)this.deadline).add("authority", (Object)this.authority).add("callCredentials", (Object)this.credentials);
        Executor executor = this.executor;
        Class class_ = executor != null ? executor.getClass() : null;
        return toStringHelper.add("executor", (Object)class_).add("compressorName", (Object)this.compressorName).add("customOptions", (Object)Arrays.deepToString((Object[])this.customOptions)).add("waitForReady", this.isWaitForReady()).add("maxInboundMessageSize", (Object)this.maxInboundMessageSize).add("maxOutboundMessageSize", (Object)this.maxOutboundMessageSize).add("streamTracerFactories", this.streamTracerFactories).toString();
    }

    public CallOptions withAuthority(@Nullable String string2) {
        CallOptions callOptions = new CallOptions(this);
        callOptions.authority = string2;
        return callOptions;
    }

    public CallOptions withCallCredentials(@Nullable CallCredentials callCredentials) {
        CallOptions callOptions = new CallOptions(this);
        callOptions.credentials = callCredentials;
        return callOptions;
    }

    public CallOptions withCompression(@Nullable String string2) {
        CallOptions callOptions = new CallOptions(this);
        callOptions.compressorName = string2;
        return callOptions;
    }

    public CallOptions withDeadline(@Nullable Deadline deadline) {
        CallOptions callOptions = new CallOptions(this);
        callOptions.deadline = deadline;
        return callOptions;
    }

    public CallOptions withDeadlineAfter(long l, TimeUnit timeUnit) {
        return this.withDeadline(Deadline.after(l, timeUnit));
    }

    public CallOptions withExecutor(@Nullable Executor executor) {
        CallOptions callOptions = new CallOptions(this);
        callOptions.executor = executor;
        return callOptions;
    }

    public CallOptions withMaxInboundMessageSize(int n) {
        boolean bl = n >= 0;
        Preconditions.checkArgument((boolean)bl, (String)"invalid maxsize %s", (int)n);
        CallOptions callOptions = new CallOptions(this);
        callOptions.maxInboundMessageSize = n;
        return callOptions;
    }

    public CallOptions withMaxOutboundMessageSize(int n) {
        boolean bl = n >= 0;
        Preconditions.checkArgument((boolean)bl, (String)"invalid maxsize %s", (int)n);
        CallOptions callOptions = new CallOptions(this);
        callOptions.maxOutboundMessageSize = n;
        return callOptions;
    }

    public <T> CallOptions withOption(Key<T> key, T t) {
        CallOptions callOptions;
        int n;
        block3 : {
            Object[][] arrobject;
            Preconditions.checkNotNull(key, (Object)"key");
            Preconditions.checkNotNull(t, (Object)"value");
            callOptions = new CallOptions(this);
            for (n = 0; n < (arrobject = this.customOptions).length; ++n) {
                if (!key.equals(arrobject[n][0])) {
                    continue;
                }
                break block3;
            }
            n = -1;
        }
        int n2 = this.customOptions.length;
        int n3 = n == -1 ? 1 : 0;
        int n4 = n2 + n3;
        int[] arrn = new int[2];
        arrn[1] = 2;
        arrn[0] = n4;
        Object[][] arrobject = (Object[][])Array.newInstance(Object.class, (int[])arrn);
        callOptions.customOptions = arrobject;
        Object[][] arrobject2 = this.customOptions;
        System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)arrobject2.length);
        if (n == -1) {
            callOptions.customOptions[this.customOptions.length] = new Object[]{key, t};
            return callOptions;
        }
        callOptions.customOptions[n] = new Object[]{key, t};
        return callOptions;
    }

    public CallOptions withStreamTracerFactory(ClientStreamTracer.Factory factory) {
        CallOptions callOptions = new CallOptions(this);
        ArrayList arrayList = new ArrayList(1 + this.streamTracerFactories.size());
        arrayList.addAll(this.streamTracerFactories);
        arrayList.add((Object)factory);
        callOptions.streamTracerFactories = Collections.unmodifiableList((List)arrayList);
        return callOptions;
    }

    public CallOptions withWaitForReady() {
        CallOptions callOptions = new CallOptions(this);
        callOptions.waitForReady = Boolean.TRUE;
        return callOptions;
    }

    public CallOptions withoutWaitForReady() {
        CallOptions callOptions = new CallOptions(this);
        callOptions.waitForReady = Boolean.FALSE;
        return callOptions;
    }

    public static final class Key<T> {
        private final String debugString;
        private final T defaultValue;

        private Key(String string2, T t) {
            this.debugString = string2;
            this.defaultValue = t;
        }

        public static <T> Key<T> create(String string2) {
            Preconditions.checkNotNull((Object)string2, (Object)"debugString");
            return new Key<Object>(string2, null);
        }

        public static <T> Key<T> createWithDefault(String string2, T t) {
            Preconditions.checkNotNull((Object)string2, (Object)"debugString");
            return new Key<T>(string2, t);
        }

        @Deprecated
        public static <T> Key<T> of(String string2, T t) {
            Preconditions.checkNotNull((Object)string2, (Object)"debugString");
            return new Key<T>(string2, t);
        }

        public T getDefault() {
            return this.defaultValue;
        }

        public String toString() {
            return this.debugString;
        }
    }

}

