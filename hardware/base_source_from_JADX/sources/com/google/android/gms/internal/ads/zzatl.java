package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

public final class zzatl implements zzu<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String valueOf = String.valueOf(map.get("errors"));
        zzaxz.zzeo(valueOf.length() != 0 ? "Invalid request: ".concat(valueOf) : new String("Invalid request: "));
        zzatd.zzdzv.zzbv(str);
    }
}
