/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

public interface OSLogger {
    public void debug(String var1);

    public void error(String var1);

    public void error(String var1, Throwable var2);

    public void info(String var1);

    public void verbose(String var1);

    public void warning(String var1);
}

