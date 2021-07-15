/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Property
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.Property;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ProjectPropertiesOrBuilder
extends MessageLiteOrBuilder {
    public Property getProperties(int var1);

    public int getPropertiesCount();

    public List<Property> getPropertiesList();
}

