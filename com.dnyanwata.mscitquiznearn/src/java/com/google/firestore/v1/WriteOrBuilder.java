/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface WriteOrBuilder
extends MessageLiteOrBuilder {
    public Precondition getCurrentDocument();

    public String getDelete();

    public ByteString getDeleteBytes();

    public Write.OperationCase getOperationCase();

    public DocumentTransform getTransform();

    public Document getUpdate();

    public DocumentMask getUpdateMask();

    public DocumentTransform.FieldTransform getUpdateTransforms(int var1);

    public int getUpdateTransformsCount();

    public List<DocumentTransform.FieldTransform> getUpdateTransformsList();

    public String getVerify();

    public ByteString getVerifyBytes();

    public boolean hasCurrentDocument();

    public boolean hasTransform();

    public boolean hasUpdate();

    public boolean hasUpdateMask();
}

