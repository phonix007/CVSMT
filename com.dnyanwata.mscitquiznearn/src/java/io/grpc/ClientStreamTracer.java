/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Metadata
 *  io.grpc.StreamTracer
 */
package io.grpc;

import io.grpc.Metadata;
import io.grpc.StreamTracer;

public abstract class ClientStreamTracer
extends StreamTracer {
    public void inboundHeaders() {
    }

    public void inboundTrailers(Metadata metadata) {
    }

    public void outboundHeaders() {
    }
}

