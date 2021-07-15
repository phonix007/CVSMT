/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.HttpRule
 *  com.google.protobuf.DescriptorProtos
 *  com.google.protobuf.DescriptorProtos$MethodOptions
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$GeneratedExtension
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.lang.Object
 */
package com.google.api;

import com.google.api.HttpRule;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

public final class AnnotationsProto {
    public static final int HTTP_FIELD_NUMBER = 72295728;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MethodOptions, HttpRule> http = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.MethodOptions.getDefaultInstance(), (Object)HttpRule.getDefaultInstance(), (MessageLite)HttpRule.getDefaultInstance(), null, (int)72295728, (WireFormat.FieldType)WireFormat.FieldType.MESSAGE, HttpRule.class);

    private AnnotationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(http);
    }
}

