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
import com.google.rpc.QuotaFailure;
import java.util.List;

public interface QuotaFailureOrBuilder
extends MessageLiteOrBuilder {
    public QuotaFailure.Violation getViolations(int var1);

    public int getViolationsCount();

    public List<QuotaFailure.Violation> getViolationsList();
}

