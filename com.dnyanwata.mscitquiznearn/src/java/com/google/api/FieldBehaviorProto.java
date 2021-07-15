/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.DescriptorProtos
 *  com.google.protobuf.DescriptorProtos$FieldOptions
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$GeneratedExtension
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.FieldBehavior;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class FieldBehaviorProto {
    public static final int FIELD_BEHAVIOR_FIELD_NUMBER = 1052;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FieldOptions, List<FieldBehavior>> fieldBehavior = GeneratedMessageLite.newRepeatedGeneratedExtension((MessageLite)DescriptorProtos.FieldOptions.getDefaultInstance(), null, FieldBehavior.internalGetValueMap(), (int)1052, (WireFormat.FieldType)WireFormat.FieldType.ENUM, (boolean)true, FieldBehavior.class);

    private FieldBehaviorProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(fieldBehavior);
    }
}

