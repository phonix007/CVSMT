package com.google.android.gms.internal.ads;

import java.util.List;

public final class zznw extends zznu {
    final zzoa zzbea;
    final zzoa zzbeb;

    public zznw(zzno zzno, long j, long j2, int i, long j3, List<zznx> list, zzoa zzoa, zzoa zzoa2) {
        super(zzno, j, j2, i, j3, list);
        this.zzbea = zzoa;
        this.zzbeb = zzoa2;
    }

    public final zzno zza(zznp zznp) {
        if (this.zzbea != null) {
            return new zzno(this.zzbea.zza(zznp.zzaad.zzze, 0, zznp.zzaad.zzzf, 0), 0, -1);
        }
        return super.zza(zznp);
    }

    public final zzno zza(zznp zznp, int i) {
        long j;
        zznp zznp2 = zznp;
        if (this.zzbdy != null) {
            j = ((zznx) this.zzbdy.get(i - this.zzbdx)).startTime;
        } else {
            j = ((long) (i - this.zzbdx)) * this.zzcs;
        }
        long j2 = j;
        return new zzno(this.zzbeb.zza(zznp2.zzaad.zzze, i, zznp2.zzaad.zzzf, j2), 0, -1);
    }

    public final int zzai(long j) {
        if (this.zzbdy != null) {
            return this.zzbdy.size();
        }
        if (j != -9223372036854775807L) {
            return (int) zzqe.zzg(j, (this.zzcs * 1000000) / this.zzcr);
        }
        return -1;
    }
}
