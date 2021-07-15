/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.rpc.context;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.context.AttributeContext;

public interface AttributeContextOrBuilder
extends MessageLiteOrBuilder {
    public AttributeContext.Api getApi();

    public AttributeContext.Peer getDestination();

    public AttributeContext.Peer getOrigin();

    public AttributeContext.Request getRequest();

    public AttributeContext.Resource getResource();

    public AttributeContext.Response getResponse();

    public AttributeContext.Peer getSource();

    public boolean hasApi();

    public boolean hasDestination();

    public boolean hasOrigin();

    public boolean hasRequest();

    public boolean hasResource();

    public boolean hasResponse();

    public boolean hasSource();
}

