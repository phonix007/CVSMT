/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Metadata
 *  io.grpc.MethodDescriptor
 *  io.grpc.SecurityLevel
 *  io.grpc.Status
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package io.grpc;

import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.SecurityLevel;
import io.grpc.Status;
import java.util.concurrent.Executor;

public abstract class CallCredentials {
    public abstract void applyRequestMetadata(RequestInfo var1, Executor var2, MetadataApplier var3);

    public abstract void thisUsesUnstableApi();

    public static abstract class MetadataApplier {
        public abstract void apply(Metadata var1);

        public abstract void fail(Status var1);
    }

    public static abstract class RequestInfo {
        public abstract String getAuthority();

        public abstract MethodDescriptor<?, ?> getMethodDescriptor();

        public abstract SecurityLevel getSecurityLevel();

        public abstract Attributes getTransportAttrs();
    }

}

