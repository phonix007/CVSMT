package com.google.android.gms.internal.ads;

import android.support.p000v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class zzbfo implements Runnable {
    private final /* synthetic */ String zzdvo;
    private final /* synthetic */ String zzewp;
    private final /* synthetic */ zzbfk zzewt;
    private final /* synthetic */ long zzewv;

    zzbfo(zzbfk zzbfk, String str, String str2, long j) {
        this.zzewt = zzbfk;
        this.zzdvo = str;
        this.zzewp = str2;
        this.zzewv = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzdvo);
        hashMap.put("cachedSrc", this.zzewp);
        hashMap.put("totalDuration", Long.toString(this.zzewv));
        this.zzewt.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
