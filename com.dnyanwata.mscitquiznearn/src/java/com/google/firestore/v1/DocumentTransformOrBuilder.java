/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentTransform
 *  com.google.firestore.v1.DocumentTransform$FieldTransform
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.DocumentTransform;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentTransformOrBuilder
extends MessageLiteOrBuilder {
    public String getDocument();

    public ByteString getDocumentBytes();

    public DocumentTransform.FieldTransform getFieldTransforms(int var1);

    public int getFieldTransformsCount();

    public List<DocumentTransform.FieldTransform> getFieldTransformsList();
}

