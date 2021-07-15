/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.ResourceDescriptor
 *  com.google.api.ResourceReference
 *  com.google.protobuf.DescriptorProtos
 *  com.google.protobuf.DescriptorProtos$FieldOptions
 *  com.google.protobuf.DescriptorProtos$FileOptions
 *  com.google.protobuf.DescriptorProtos$MessageOptions
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

import com.google.api.ResourceDescriptor;
import com.google.api.ResourceReference;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class ResourceProto {
    public static final int RESOURCE_DEFINITION_FIELD_NUMBER = 1053;
    public static final int RESOURCE_FIELD_NUMBER = 1053;
    public static final int RESOURCE_REFERENCE_FIELD_NUMBER = 1055;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MessageOptions, ResourceDescriptor> resource;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FileOptions, List<ResourceDescriptor>> resourceDefinition;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FieldOptions, ResourceReference> resourceReference;

    static {
        resourceReference = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.FieldOptions.getDefaultInstance(), (Object)ResourceReference.getDefaultInstance(), (MessageLite)ResourceReference.getDefaultInstance(), null, (int)1055, (WireFormat.FieldType)WireFormat.FieldType.MESSAGE, ResourceReference.class);
        resourceDefinition = GeneratedMessageLite.newRepeatedGeneratedExtension((MessageLite)DescriptorProtos.FileOptions.getDefaultInstance(), (MessageLite)ResourceDescriptor.getDefaultInstance(), null, (int)1053, (WireFormat.FieldType)WireFormat.FieldType.MESSAGE, (boolean)false, ResourceDescriptor.class);
        resource = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.MessageOptions.getDefaultInstance(), (Object)ResourceDescriptor.getDefaultInstance(), (MessageLite)ResourceDescriptor.getDefaultInstance(), null, (int)1053, (WireFormat.FieldType)WireFormat.FieldType.MESSAGE, ResourceDescriptor.class);
    }

    private ResourceProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(resourceReference);
        extensionRegistryLite.add(resourceDefinition);
        extensionRegistryLite.add(resource);
    }
}

