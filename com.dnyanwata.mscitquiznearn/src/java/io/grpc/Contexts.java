/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.grpc.Metadata
 *  io.grpc.ServerCall
 *  io.grpc.ServerCall$Listener
 *  io.grpc.ServerCallHandler
 *  io.grpc.Status
 *  io.grpc.Status$Code
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.TimeoutException
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Context;
import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/*
 * Exception performing whole class analysis.
 */
public final class Contexts {
    private Contexts() {
    }

    public static <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(Context context, ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        Context context2 = context.attach();
        try {
            ForwardingServerCallListener.SimpleForwardingServerCallListener simpleForwardingServerCallListener = }
    }
    java.lang.IllegalStateException: Inner class got unexpected class file - revert this change
    
    