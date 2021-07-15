package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

final class zzli {
    private final zzib zzajq;
    private final zzhz[] zzaxt;
    private zzhz zzaxu;

    public zzli(zzhz[] zzhzArr, zzib zzib) {
        this.zzaxt = zzhzArr;
        this.zzajq = zzib;
    }

    public final zzhz zza(zzia zzia, Uri uri) throws IOException, InterruptedException {
        if (this.zzaxu != null) {
            return this.zzaxu;
        }
        zzhz[] zzhzArr = this.zzaxt;
        int length = zzhzArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzhz zzhz = zzhzArr[i];
            try {
                if (zzhz.zza(zzia)) {
                    this.zzaxu = zzhz;
                    zzia.zzdx();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                zzia.zzdx();
            }
        }
        if (this.zzaxu != null) {
            this.zzaxu.zza(this.zzajq);
            return this.zzaxu;
        }
        String zza = zzqe.zza((Object[]) this.zzaxt);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(zza);
        sb.append(") could read the stream.");
        throw new zzmb(sb.toString(), uri);
    }

    public final void release() {
        if (this.zzaxu != null) {
            this.zzaxu.release();
            this.zzaxu = null;
        }
    }
}
