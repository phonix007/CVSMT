package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzbgg;
import java.util.Map;

final class zzq implements zzu<zzbgg> {
    zzq() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbgg zzbgg = (zzbgg) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbgg.zzjf();
        } else if ("resume".equals(str)) {
            zzbgg.zzjg();
        }
    }
}
