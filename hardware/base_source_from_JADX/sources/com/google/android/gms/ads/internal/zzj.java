package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzacf;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzalj;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzaxg;
import com.google.android.gms.internal.ads.zzbgg;

final class zzj implements Runnable {
    private final /* synthetic */ zzaxg zzblz;
    private final /* synthetic */ zzh zzbmf;

    zzj(zzh zzh, zzaxg zzaxg) {
        this.zzbmf = zzh;
        this.zzblz = zzaxg;
    }

    public final void run() {
        this.zzbmf.zzb(new zzaxf(this.zzblz, (zzbgg) null, (zzakq) null, (zzalj) null, (String) null, (zzakt) null, (zzacf) null, (String) null));
    }
}
