/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Duration
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.type.DateTime$TimeOffsetCase
 *  java.lang.Object
 */
package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.DateTime;
import com.google.type.TimeZone;

public interface DateTimeOrBuilder
extends MessageLiteOrBuilder {
    public int getDay();

    public int getHours();

    public int getMinutes();

    public int getMonth();

    public int getNanos();

    public int getSeconds();

    public DateTime.TimeOffsetCase getTimeOffsetCase();

    public TimeZone getTimeZone();

    public Duration getUtcOffset();

    public int getYear();

    public boolean hasTimeZone();

    public boolean hasUtcOffset();
}

