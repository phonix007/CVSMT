/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.ServerMethodDefinition
 *  java.io.Closeable
 *  java.lang.Object
 */
package io.grpc;

import io.grpc.Channel;
import io.grpc.ServerMethodDefinition;
import java.io.Closeable;

public abstract class BinaryLog
implements Closeable {
    public abstract Channel wrapChannel(Channel var1);

    public abstract <ReqT, RespT> ServerMethodDefinition<?, ?> wrapMethodDefinition(ServerMethodDefinition<ReqT, RespT> var1);
}

