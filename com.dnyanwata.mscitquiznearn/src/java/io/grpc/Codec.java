/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Compressor
 *  io.grpc.Decompressor
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.GZIPOutputStream
 */
package io.grpc;

import io.grpc.Compressor;
import io.grpc.Decompressor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public interface Codec
extends Compressor,
Decompressor {

}

