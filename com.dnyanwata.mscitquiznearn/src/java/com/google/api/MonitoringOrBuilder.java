/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Monitoring
 *  com.google.api.Monitoring$MonitoringDestination
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MonitoringOrBuilder
extends MessageLiteOrBuilder {
    public Monitoring.MonitoringDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    public Monitoring.MonitoringDestination getProducerDestinations(int var1);

    public int getProducerDestinationsCount();

    public List<Monitoring.MonitoringDestination> getProducerDestinationsList();
}

