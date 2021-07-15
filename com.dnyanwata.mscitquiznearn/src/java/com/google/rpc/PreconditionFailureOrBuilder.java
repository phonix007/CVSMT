/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.PreconditionFailure;
import java.util.List;

public interface PreconditionFailureOrBuilder
extends MessageLiteOrBuilder {
    public PreconditionFailure.Violation getViolations(int var1);

    public int getViolationsCount();

    public List<PreconditionFailure.Violation> getViolationsList();
}

