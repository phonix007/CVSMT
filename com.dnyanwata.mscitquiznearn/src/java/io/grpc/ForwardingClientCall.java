/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Attributes
 *  io.grpc.ClientCall
 *  io.grpc.ClientCall$Listener
 *  io.grpc.Metadata
 *  io.grpc.PartialForwardingClientCall
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  javax.annotation.Nullable
 */
package io.grpc;

import io.grpc.Attributes;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.PartialForwardingClientCall;
import javax.annotation.Nullable;

public abstract class ForwardingClientCall<ReqT, RespT>
extends PartialForwardingClientCall<ReqT, RespT> {
    protected abstract ClientCall<ReqT, RespT> delegate();

    public void sendMessage(ReqT ReqT) {
        this.delegate().sendMessage(ReqT);
    }

    public void start(ClientCall.Listener<RespT> listener, Metadata metadata) {
        this.delegate().start(listener, metadata);
    }

    public static abstract class SimpleForwardingClientCall<ReqT, RespT>
    extends ForwardingClientCall<ReqT, RespT> {
        private final ClientCall<ReqT, RespT> delegate;

        protected SimpleForwardingClientCall(ClientCall<ReqT, RespT> clientCall) {
            this.delegate = clientCall;
        }

        @Override
        protected ClientCall<ReqT, RespT> delegate() {
            return this.delegate;
        }
    }

}

