package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.apps.saiinfo.computerhardware.BuildConfig;
import java.util.concurrent.Callable;

final class zzf implements Callable<String> {
    private final /* synthetic */ zzc zzbmd;

    zzf(zzc zzc) {
        this.zzbmd = zzc;
    }

    public final /* synthetic */ Object call() throws Exception {
        CookieManager zzba = zzbv.zzlh().zzba(this.zzbmd.zzbls.zzsp);
        if (zzba != null) {
            return zzba.getCookie("googleads.g.doubleclick.net");
        }
        return BuildConfig.FLAVOR;
    }
}
