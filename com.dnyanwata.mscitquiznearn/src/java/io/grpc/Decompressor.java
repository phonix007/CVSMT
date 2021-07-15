/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

import java.io.IOException;
import java.io.InputStream;

public interface Decompressor {
    public InputStream decompress(InputStream var1) throws IOException;

    public String getMessageEncoding();
}

