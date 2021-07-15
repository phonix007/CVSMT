/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Any
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.protobuf.Any;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface SourceInfoOrBuilder
extends MessageLiteOrBuilder {
    public Any getSourceFiles(int var1);

    public int getSourceFilesCount();

    public List<Any> getSourceFilesList();
}

