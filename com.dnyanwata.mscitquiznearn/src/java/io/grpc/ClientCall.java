/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Metadata
 *  io.grpc.Status
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  javax.annotation.Nullable
 */
package io.grpc;

import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.Status;
import javax.annotation.Nullable;

public abstract class ClientCall<ReqT, RespT> {
    public abstract void cancel(@Nullable String var1, @Nullable Throwable var2);

    public Attributes getAttributes() {
        return Attributes.EMPTY;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int var1);

    public abstract void sendMessage(ReqT var1);

    public void setMessageCompression(boolean bl) {
    }

    public abstract void start(Listener<RespT> var1, Metadata var2);

    public static abstract class Listener<T> {
        public void onClose(Status status, Metadata metadata) {
        }

        public void onHeaders(Metadata metadata) {
        }

        public void onMessage(T t) {
        }

        public void onReady() {
        }
    }

}

