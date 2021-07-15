/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

import java.io.IOException;
import java.io.OutputStream;

public interface Compressor {
    public OutputStream compress(OutputStream var1) throws IOException;

    public String getMessageEncoding();
}

