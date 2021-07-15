package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzmg implements zzii {

    /* renamed from: id */
    private final int f49id;
    private final int type;
    private zzii zzasj;
    private final zzfs zzazu;
    public zzfs zzazz;

    public zzmg(int i, int i2, zzfs zzfs) {
        this.f49id = i;
        this.type = i2;
        this.zzazu = zzfs;
    }

    public final void zzb(zzmh zzmh) {
        if (zzmh == null) {
            this.zzasj = new zzhy();
            return;
        }
        this.zzasj = zzmh.zzb(this.f49id, this.type);
        if (this.zzasj != null) {
            this.zzasj.zzf(this.zzazz);
        }
    }

    public final void zzf(zzfs zzfs) {
        this.zzazz = zzfs.zza(this.zzazu);
        this.zzasj.zzf(this.zzazz);
    }

    public final int zza(zzia zzia, int i, boolean z) throws IOException, InterruptedException {
        return this.zzasj.zza(zzia, i, z);
    }

    public final void zza(zzpx zzpx, int i) {
        this.zzasj.zza(zzpx, i);
    }

    public final void zza(long j, int i, int i2, int i3, zzij zzij) {
        this.zzasj.zza(j, i, i2, i3, zzij);
    }
}
