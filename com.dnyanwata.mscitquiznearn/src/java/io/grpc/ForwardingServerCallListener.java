/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.PartialForwardingServerCallListener
 *  io.grpc.ServerCall
 *  io.grpc.ServerCall$Listener
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

import io.grpc.PartialForwardingServerCallListener;
import io.grpc.ServerCall;

public abstract class ForwardingServerCallListener<ReqT>
extends PartialForwardingServerCallListener<ReqT> {
    protected abstract ServerCall.Listener<ReqT> delegate();

    public void onMessage(ReqT ReqT) {
        this.delegate().onMessage(ReqT);
    }

    public static abstract class SimpleForwardingServerCallListener<ReqT>
    extends ForwardingServerCallListener<ReqT> {
        private final ServerCall.Listener<ReqT> delegate;

        protected SimpleForwardingServerCallListener(ServerCall.Listener<ReqT> listener) {
            this.delegate = listener;
        }

        @Override
        protected ServerCall.Listener<ReqT> delegate() {
            return this.delegate;
        }
    }

}

