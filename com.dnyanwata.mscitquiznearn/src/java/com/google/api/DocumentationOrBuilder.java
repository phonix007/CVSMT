/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.DocumentationRule
 *  com.google.api.Page
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.DocumentationRule;
import com.google.api.Page;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DocumentationOrBuilder
extends MessageLiteOrBuilder {
    public String getDocumentationRootUrl();

    public ByteString getDocumentationRootUrlBytes();

    public String getOverview();

    public ByteString getOverviewBytes();

    public Page getPages(int var1);

    public int getPagesCount();

    public List<Page> getPagesList();

    public DocumentationRule getRules(int var1);

    public int getRulesCount();

    public List<DocumentationRule> getRulesList();

    public String getSummary();

    public ByteString getSummaryBytes();
}

