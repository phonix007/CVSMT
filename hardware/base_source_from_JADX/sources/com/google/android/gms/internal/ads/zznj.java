package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public final class zznj {
    public final long zzbcq;
    private final long zzbcr;
    public final boolean zzbcs;
    public final long zzbct;
    public final long zzbcu;
    public final long zzbcv;
    public final zzob zzbcw;
    public final Uri zzbcx;
    private final List<zznn> zzbcy;
    private final long zzcs;

    public zznj(long j, long j2, long j3, boolean z, long j4, long j5, long j6, zzob zzob, Uri uri, List<zznn> list) {
        this.zzbcq = j;
        this.zzcs = j2;
        this.zzbcr = j3;
        this.zzbcs = z;
        this.zzbct = j4;
        this.zzbcu = j5;
        this.zzbcv = j6;
        this.zzbcw = zzob;
        this.zzbcx = uri;
        this.zzbcy = list;
    }

    public final int zzcl() {
        return this.zzbcy.size();
    }

    public final zznn zzba(int i) {
        return this.zzbcy.get(i);
    }

    public final long zzbb(int i) {
        long j;
        if (i == this.zzbcy.size() - 1) {
            j = this.zzcs == -9223372036854775807L ? -9223372036854775807L : this.zzcs - this.zzbcy.get(i).zzbdj;
        } else {
            j = this.zzbcy.get(i + 1).zzbdj - this.zzbcy.get(i).zzbdj;
        }
        return zzfe.zzg(j);
    }
}
