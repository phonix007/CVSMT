package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzbgg;
import java.util.Map;

final class zzr implements zzu<zzbgg> {
    zzr() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbgg zzbgg = (zzbgg) obj;
        if (map.keySet().contains("start")) {
            zzbgg.zzadl().zzaeh();
        } else if (map.keySet().contains("stop")) {
            zzbgg.zzadl().zzaei();
        } else if (map.keySet().contains("cancel")) {
            zzbgg.zzadl().zzaej();
        }
    }
}
