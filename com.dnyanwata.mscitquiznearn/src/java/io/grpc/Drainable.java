/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 */
package io.grpc;

import java.io.IOException;
import java.io.OutputStream;

public interface Drainable {
    public int drainTo(OutputStream var1) throws IOException;
}

