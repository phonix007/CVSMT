/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Page
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface PageOrBuilder
extends MessageLiteOrBuilder {
    public String getContent();

    public ByteString getContentBytes();

    public String getName();

    public ByteString getNameBytes();

    public Page getSubpages(int var1);

    public int getSubpagesCount();

    public List<Page> getSubpagesList();
}

