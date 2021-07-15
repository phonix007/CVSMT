/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.CallCredentials
 *  io.grpc.CallCredentials$MetadataApplier
 *  io.grpc.CallCredentials$RequestInfo
 *  java.lang.Deprecated
 *  java.util.concurrent.Executor
 */
package io.grpc;

import io.grpc.CallCredentials;
import io.grpc.CallCredentials2;
import java.util.concurrent.Executor;

@Deprecated
public abstract class CallCredentials2
extends CallCredentials {
    public final void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier) {
        this.applyRequestMetadata(requestInfo, executor, new MetadataApplier(this, metadataApplier){
            final /* synthetic */ CallCredentials2 this$0;
            final /* synthetic */ CallCredentials.MetadataApplier val$applier;
            {
                this.this$0 = callCredentials2;
                this.val$applier = metadataApplier;
            }

            public void apply(io.grpc.Metadata metadata) {
                this.val$applier.apply(metadata);
            }

            public void fail(io.grpc.Status status) {
                this.val$applier.fail(status);
            }
        });
    }

    public abstract void applyRequestMetadata(CallCredentials.RequestInfo var1, Executor var2, MetadataApplier var3);

    public static abstract class MetadataApplier
    extends CallCredentials.MetadataApplier {
    }

}

