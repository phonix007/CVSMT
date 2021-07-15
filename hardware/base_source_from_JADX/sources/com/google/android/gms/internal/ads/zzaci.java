package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzu;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class zzaci implements zzu<Object> {
    private final WeakReference<zzace> zzboc;
    private final String zzbqb;

    public zzaci(zzace zzace, String str) {
        this.zzboc = new WeakReference<>(zzace);
        this.zzbqb = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzace zzace;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.zzbqb.equals(str)) {
            if ("_ai".equals(str2)) {
                zzace zzace2 = (zzace) this.zzboc.get();
                if (zzace2 != null) {
                    zzace2.zzim();
                }
            } else if ("_ac".equals(str2) && (zzace = (zzace) this.zzboc.get()) != null) {
                zzace.zzin();
            }
        }
    }
}
