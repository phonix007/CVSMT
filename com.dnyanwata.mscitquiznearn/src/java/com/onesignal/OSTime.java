/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.onesignal;

public interface OSTime {
    public long getCurrentThreadTimeMillis();

    public long getCurrentTimeMillis();

    public long getElapsedRealtime();
}

