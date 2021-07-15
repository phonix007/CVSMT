/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.DescriptorProtos
 *  com.google.protobuf.DescriptorProtos$MethodOptions
 *  com.google.protobuf.DescriptorProtos$ServiceOptions
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$GeneratedExtension
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class ClientProto {
    public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
    public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
    public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.ServiceOptions, String> defaultHost;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> methodSignature;
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.ServiceOptions, String> oauthScopes;

    static {
        methodSignature = GeneratedMessageLite.newRepeatedGeneratedExtension((MessageLite)DescriptorProtos.MethodOptions.getDefaultInstance(), null, null, (int)1051, (WireFormat.FieldType)WireFormat.FieldType.STRING, (boolean)false, String.class);
        defaultHost = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.ServiceOptions.getDefaultInstance(), (Object)"", null, null, (int)1049, (WireFormat.FieldType)WireFormat.FieldType.STRING, String.class);
        oauthScopes = GeneratedMessageLite.newSingularGeneratedExtension((MessageLite)DescriptorProtos.ServiceOptions.getDefaultInstance(), (Object)"", null, null, (int)1050, (WireFormat.FieldType)WireFormat.FieldType.STRING, String.class);
    }

    private ClientProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(defaultHost);
        extensionRegistryLite.add(oauthScopes);
    }
}

