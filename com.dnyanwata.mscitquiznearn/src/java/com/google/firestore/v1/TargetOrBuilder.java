/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Timestamp
 *  java.lang.Object
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;

public interface TargetOrBuilder
extends MessageLiteOrBuilder {
    public Target.DocumentsTarget getDocuments();

    public boolean getOnce();

    public Target.QueryTarget getQuery();

    public Timestamp getReadTime();

    public ByteString getResumeToken();

    public Target.ResumeTypeCase getResumeTypeCase();

    public int getTargetId();

    public Target.TargetTypeCase getTargetTypeCase();

    public boolean hasDocuments();

    public boolean hasQuery();

    public boolean hasReadTime();
}

