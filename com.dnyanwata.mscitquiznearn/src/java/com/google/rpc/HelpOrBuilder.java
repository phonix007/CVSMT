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
import com.google.rpc.Help;
import java.util.List;

public interface HelpOrBuilder
extends MessageLiteOrBuilder {
    public Help.Link getLinks(int var1);

    public int getLinksCount();

    public List<Help.Link> getLinksList();
}

