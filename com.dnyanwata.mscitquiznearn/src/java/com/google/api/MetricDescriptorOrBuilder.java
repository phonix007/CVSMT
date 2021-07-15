/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.LabelDescriptor
 *  com.google.api.MetricDescriptor
 *  com.google.api.MetricDescriptor$MetricDescriptorMetadata
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LaunchStage;
import com.google.api.MetricDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MetricDescriptorOrBuilder
extends MessageLiteOrBuilder {
    public String getDescription();

    public ByteString getDescriptionBytes();

    public String getDisplayName();

    public ByteString getDisplayNameBytes();

    public LabelDescriptor getLabels(int var1);

    public int getLabelsCount();

    public List<LabelDescriptor> getLabelsList();

    public LaunchStage getLaunchStage();

    public int getLaunchStageValue();

    public MetricDescriptor.MetricDescriptorMetadata getMetadata();

    public MetricDescriptor.MetricKind getMetricKind();

    public int getMetricKindValue();

    public String getName();

    public ByteString getNameBytes();

    public String getType();

    public ByteString getTypeBytes();

    public String getUnit();

    public ByteString getUnitBytes();

    public MetricDescriptor.ValueType getValueType();

    public int getValueTypeValue();

    public boolean hasMetadata();
}

