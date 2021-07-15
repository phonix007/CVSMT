package com.google.android.gms.internal.ads;

final class zzaje implements zzbcq<zzaii> {
    private final /* synthetic */ zzait zzdjj;
    private final /* synthetic */ zzajm zzdjm;

    zzaje(zzait zzait, zzajm zzajm) {
        this.zzdjj = zzait;
        this.zzdjm = zzajm;
    }

    public final /* synthetic */ void zzh(Object obj) {
        synchronized (this.zzdjj.mLock) {
            int unused = this.zzdjj.zzdiz = 0;
            if (!(this.zzdjj.zzdiy == null || this.zzdjm == this.zzdjj.zzdiy)) {
                zzaxz.m30v("New JS engine is loaded, marking previous one as destroyable.");
                this.zzdjj.zzdiy.zzuf();
            }
            zzajm unused2 = this.zzdjj.zzdiy = this.zzdjm;
        }
    }
}
