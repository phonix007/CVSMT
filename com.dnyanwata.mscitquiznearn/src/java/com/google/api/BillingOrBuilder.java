/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.api.Billing
 *  com.google.api.Billing$BillingDestination
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.Billing;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface BillingOrBuilder
extends MessageLiteOrBuilder {
    public Billing.BillingDestination getConsumerDestinations(int var1);

    public int getConsumerDestinationsCount();

    public List<Billing.BillingDestination> getConsumerDestinationsList();
}

