package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import org.json.JSONObject;

@zzark
public final class zzro implements zzsb {
    /* access modifiers changed from: private */
    public final zzrg zzbvr;
    private final zzbgg zzbvs;
    private final zzu<zzbgg> zzbvt = new zzrp(this);
    private final zzu<zzbgg> zzbvu = new zzrq(this);
    private final zzu<zzbgg> zzbvv = new zzrr(this);

    public zzro(zzrg zzrg, zzbgg zzbgg) {
        this.zzbvr = zzrg;
        this.zzbvs = zzbgg;
        zzbgg zzbgg2 = this.zzbvs;
        zzbgg2.zza("/updateActiveView", (zzu<? super zzbgg>) this.zzbvt);
        zzbgg2.zza("/untrackActiveViewUnit", (zzu<? super zzbgg>) this.zzbvu);
        zzbgg2.zza("/visibilityChanged", (zzu<? super zzbgg>) this.zzbvv);
        String valueOf = String.valueOf(this.zzbvr.zzbuu.zzmt());
        zzaxz.zzdn(valueOf.length() != 0 ? "Custom JS tracking ad unit: ".concat(valueOf) : new String("Custom JS tracking ad unit: "));
    }

    public final boolean zznf() {
        return true;
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.zzbvs.zzb("AFMA_updateActiveView", jSONObject);
        } else {
            this.zzbvr.zzb(this);
        }
    }

    public final void zzng() {
        zzbgg zzbgg = this.zzbvs;
        zzbgg.zzb("/visibilityChanged", this.zzbvv);
        zzbgg.zzb("/untrackActiveViewUnit", this.zzbvu);
        zzbgg.zzb("/updateActiveView", this.zzbvt);
    }
}
