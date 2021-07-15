/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.ClientCall
 *  io.grpc.ClientCall$Listener
 *  io.grpc.Metadata
 *  io.grpc.PartialForwardingClientCallListener
 *  io.grpc.Status
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.PartialForwardingClientCallListener;
import io.grpc.Status;

public abstract class ForwardingClientCallListener<RespT>
extends PartialForwardingClientCallListener<RespT> {
    protected abstract ClientCall.Listener<RespT> delegate();

    public void onMessage(RespT RespT) {
        this.delegate().onMessage(RespT);
    }

    public static abstract class SimpleForwardingClientCallListener<RespT>
    extends ForwardingClientCallListener<RespT> {
        private final ClientCall.Listener<RespT> delegate;

        protected SimpleForwardingClientCallListener(ClientCall.Listener<RespT> listener) {
            this.delegate = listener;
        }

        @Override
        protected ClientCall.Listener<RespT> delegate() {
            return this.delegate;
        }
    }

}

