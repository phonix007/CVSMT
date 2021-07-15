/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.base.Preconditions
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import io.grpc.Codec;
import io.grpc.Decompressor;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class DecompressorRegistry {
    static final Joiner ACCEPT_ENCODING_JOINER = Joiner.on((char)',');
    private static final DecompressorRegistry DEFAULT_INSTANCE = DecompressorRegistry.emptyInstance().with(new Codec(){

        public java.io.OutputStream compress(java.io.OutputStream outputStream) throws java.io.IOException {
            return new java.util.zip.GZIPOutputStream(outputStream);
        }

        public java.io.InputStream decompress(java.io.InputStream inputStream) throws java.io.IOException {
            return new java.util.zip.GZIPInputStream(inputStream);
        }

        public String getMessageEncoding() {
            return "gzip";
        }
    }, true).with(Codec.Identity.NONE, false);
    private final byte[] advertisedDecompressors;
    private final Map<String, DecompressorInfo> decompressors;

    private DecompressorRegistry() {
        this.decompressors = new LinkedHashMap(0);
        this.advertisedDecompressors = new byte[0];
    }

    private DecompressorRegistry(Decompressor decompressor, boolean bl, DecompressorRegistry decompressorRegistry) {
        String string2 = decompressor.getMessageEncoding();
        Preconditions.checkArgument((boolean)(true ^ string2.contains((CharSequence)",")), (Object)"Comma is currently not allowed in message encoding");
        int n = decompressorRegistry.decompressors.size();
        if (!decompressorRegistry.decompressors.containsKey((Object)decompressor.getMessageEncoding())) {
            ++n;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n);
        for (DecompressorInfo decompressorInfo : decompressorRegistry.decompressors.values()) {
            String string3 = decompressorInfo.decompressor.getMessageEncoding();
            if (string3.equals((Object)string2)) continue;
            linkedHashMap.put((Object)string3, (Object)new DecompressorInfo(decompressorInfo.decompressor, decompressorInfo.advertised));
        }
        linkedHashMap.put((Object)string2, (Object)new DecompressorInfo(decompressor, bl));
        this.decompressors = Collections.unmodifiableMap((Map)linkedHashMap);
        this.advertisedDecompressors = ACCEPT_ENCODING_JOINER.join(this.getAdvertisedMessageEncodings()).getBytes(Charset.forName((String)"US-ASCII"));
    }

    public static DecompressorRegistry emptyInstance() {
        return new DecompressorRegistry();
    }

    public static DecompressorRegistry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public Set<String> getAdvertisedMessageEncodings() {
        HashSet hashSet = new HashSet(this.decompressors.size());
        for (Map.Entry entry : this.decompressors.entrySet()) {
            if (!((DecompressorInfo)entry.getValue()).advertised) continue;
            hashSet.add(entry.getKey());
        }
        return Collections.unmodifiableSet((Set)hashSet);
    }

    public Set<String> getKnownMessageEncodings() {
        return this.decompressors.keySet();
    }

    byte[] getRawAdvertisedMessageEncodings() {
        return this.advertisedDecompressors;
    }

    @Nullable
    public Decompressor lookupDecompressor(String string2) {
        DecompressorInfo decompressorInfo = (DecompressorInfo)this.decompressors.get((Object)string2);
        if (decompressorInfo != null) {
            return decompressorInfo.decompressor;
        }
        return null;
    }

    public DecompressorRegistry with(Decompressor decompressor, boolean bl) {
        return new DecompressorRegistry(decompressor, bl, this);
    }

    private static final class DecompressorInfo {
        final boolean advertised;
        final Decompressor decompressor;

        DecompressorInfo(Decompressor decompressor, boolean bl) {
            this.decompressor = (Decompressor)Preconditions.checkNotNull((Object)decompressor, (Object)"decompressor");
            this.advertised = bl;
        }
    }

}

