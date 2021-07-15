/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Attributes
 *  io.grpc.Metadata
 *  io.grpc.MethodDescriptor
 *  io.grpc.PartialForwardingServerCall
 *  io.grpc.ServerCall
 *  io.grpc.Status
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.PartialForwardingServerCall;
import io.grpc.ServerCall;
import io.grpc.Status;

public abstract class ForwardingServerCall<ReqT, RespT>
extends PartialForwardingServerCall<ReqT, RespT> {
    protected abstract ServerCall<ReqT, RespT> delegate();

    public void sendMessage(RespT RespT) {
        this.delegate().sendMessage(RespT);
    }

    public static abstract class SimpleForwardingServerCall<ReqT, RespT>
    extends ForwardingServerCall<ReqT, RespT> {
        private final ServerCall<ReqT, RespT> delegate;

        protected SimpleForwardingServerCall(ServerCall<ReqT, RespT> serverCall) {
            this.delegate = serverCall;
        }

        @Override
        protected ServerCall<ReqT, RespT> delegate() {
            return this.delegate;
        }

        public MethodDescriptor<ReqT, RespT> getMethodDescriptor() {
            return this.delegate.getMethodDescriptor();
        }
    }

}

