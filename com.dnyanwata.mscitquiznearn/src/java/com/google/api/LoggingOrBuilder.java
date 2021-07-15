/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Logging
 *  com.google.api.Logging$LoggingDestination
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface LoggingOrBuilder
extends MessageLiteOrBuilder {
    public Logging.LoggingDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List<Logging.LoggingDestination> getConsumerDestinationsList();

    public Logging.LoggingDestination getProducerDestinations(int var1);

    public int getProducerDestinationsCount();

    public List<Logging.LoggingDestination> getProducerDestinationsList();
}

