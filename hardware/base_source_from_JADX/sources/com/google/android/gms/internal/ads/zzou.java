package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class zzou implements zzov {
    private final byte[] data;
    private Uri uri;
    private int zzbfo;
    private int zzbfp;

    public zzou(byte[] bArr) {
        zzpo.checkNotNull(bArr);
        zzpo.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    public final long zza(zzoz zzoz) throws IOException {
        this.uri = zzoz.uri;
        this.zzbfo = (int) zzoz.zzaha;
        this.zzbfp = (int) (zzoz.zzcc == -1 ? ((long) this.data.length) - zzoz.zzaha : zzoz.zzcc);
        if (this.zzbfp > 0 && this.zzbfo + this.zzbfp <= this.data.length) {
            return (long) this.zzbfp;
        }
        int i = this.zzbfo;
        long j = zzoz.zzcc;
        int length = this.data.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzbfp == 0) {
            return -1;
        }
        int min = Math.min(i2, this.zzbfp);
        System.arraycopy(this.data, this.zzbfo, bArr, i, min);
        this.zzbfo += min;
        this.zzbfp -= min;
        return min;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void close() throws IOException {
        this.uri = null;
    }
}
