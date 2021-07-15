package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.io.IOException;

public final class zzmp extends zzmc {
    private volatile boolean zzaxq;
    private final zzfs zzazz;
    private volatile int zzbau;
    private volatile boolean zzbav;
    private final int zzwg;

    public zzmp(zzov zzov, zzoz zzoz, zzfs zzfs, int i, Object obj, long j, long j2, int i2, int i3, zzfs zzfs2) {
        super(zzov, zzoz, zzfs, i, obj, j, j2, i2);
        this.zzwg = i3;
        this.zzazz = zzfs2;
    }

    public final boolean zzga() {
        return this.zzbav;
    }

    public final long zzfv() {
        return (long) this.zzbau;
    }

    public final void cancelLoad() {
        this.zzaxq = true;
    }

    public final boolean zzfe() {
        return this.zzaxq;
    }

    /* JADX INFO: finally extract failed */
    public final void zzff() throws IOException, InterruptedException {
        try {
            long zza = this.zzagy.zza(zzqe.zza(this.zzazo, this.zzbau));
            if (zza != -1) {
                zza += (long) this.zzbau;
            }
            zzhx zzhx = new zzhx(this.zzagy, (long) this.zzbau, zza);
            zzmd zzft = zzft();
            zzft.zzae(0);
            zzii zzb = zzft.zzb(0, this.zzwg);
            zzb.zzf(this.zzazz);
            for (int i = 0; i != -1; i = zzb.zza(zzhx, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true)) {
                this.zzbau += i;
            }
            zzb.zza(this.zzazs, 1, this.zzbau, 0, (zzij) null);
            zzqe.zza(this.zzagy);
            this.zzbav = true;
        } catch (Throwable th) {
            zzqe.zza(this.zzagy);
            throw th;
        }
    }
}
