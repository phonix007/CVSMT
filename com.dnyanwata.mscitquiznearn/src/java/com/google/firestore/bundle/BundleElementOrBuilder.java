/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.bundle.BundleElement
 *  com.google.firestore.bundle.BundleMetadata
 *  com.google.firestore.bundle.BundledDocumentMetadata
 *  com.google.firestore.bundle.NamedQuery
 *  com.google.firestore.v1.Document
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 */
package com.google.firestore.bundle;

import com.google.firestore.bundle.BundleElement;
import com.google.firestore.bundle.BundleMetadata;
import com.google.firestore.bundle.BundledDocumentMetadata;
import com.google.firestore.bundle.NamedQuery;
import com.google.firestore.v1.Document;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BundleElementOrBuilder
extends MessageLiteOrBuilder {
    public Document getDocument();

    public BundledDocumentMetadata getDocumentMetadata();

    public BundleElement.ElementTypeCase getElementTypeCase();

    public BundleMetadata getMetadata();

    public NamedQuery getNamedQuery();

    public boolean hasDocument();

    public boolean hasDocumentMetadata();

    public boolean hasMetadata();

    public boolean hasNamedQuery();
}

