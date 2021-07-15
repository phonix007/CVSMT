/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Precondition
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Precondition;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface PreconditionOrBuilder
extends MessageLiteOrBuilder {
    public Precondition.ConditionTypeCase getConditionTypeCase();

    public boolean getExists();

    public Timestamp getUpdateTime();

    public boolean hasUpdateTime();
}

