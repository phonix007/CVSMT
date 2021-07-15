package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.lang.ref.WeakReference;

final class zzacj {
    /* access modifiers changed from: private */
    public String mId;
    /* access modifiers changed from: private */
    public final WeakReference<zzbgg> zzdcm;

    public zzacj(zzbgg zzbgg) {
        this.zzdcm = new WeakReference<>(zzbgg);
    }

    public final void zza(zzaqp zzaqp) {
        zzaqp.zza("/loadHtml", new zzack(this, zzaqp));
        zzaqp.zza("/showOverlay", new zzacm(this, zzaqp));
        zzaqp.zza("/hideOverlay", new zzacn(this, zzaqp));
        zzbgg zzbgg = (zzbgg) this.zzdcm.get();
        if (zzbgg != null) {
            zzbgg.zza("/sendMessageToSdk", (zzu<? super zzbgg>) new zzaco(this, zzaqp));
        }
    }
}
