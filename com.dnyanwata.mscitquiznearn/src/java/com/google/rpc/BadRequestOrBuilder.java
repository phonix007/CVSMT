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
import com.google.rpc.BadRequest;
import java.util.List;

public interface BadRequestOrBuilder
extends MessageLiteOrBuilder {
    public BadRequest.FieldViolation getFieldViolations(int var1);

    public int getFieldViolationsCount();

    public List<BadRequest.FieldViolation> getFieldViolationsList();
}

