/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.longrunning.OperationInfo
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
package com.google.longrunning;

import com.google.longrunning.OperationInfo;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

public final class OperationsProto {
    public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MethodOptions, OperationInfo> operationInfo = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.MethodOptions.getDefaultInstance(), (Object)OperationInfo.getDefaultInstance(), (MessageLite)OperationInfo.getDefaultInstance(), null, (int)1049, (WireFormat.FieldType)WireFormat.FieldType.MESSAGE, OperationInfo.class);

    private OperationsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(operationInfo);
    }
}

