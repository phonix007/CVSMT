package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxz;
import java.util.Map;

@zzark
public final class zzx implements zzu<Object> {
    private final zzy zzdfz;

    public zzx(zzy zzy) {
        this.zzdfz = zzy;
    }

    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzaxz.zzb("Fail to parse float", e);
        }
        this.zzdfz.zzo(equals);
        this.zzdfz.zza(equals2, f);
    }
}
