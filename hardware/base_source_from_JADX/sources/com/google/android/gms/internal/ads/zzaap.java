package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzark
public final class zzaap {
    private Context mContext = null;
    private String zzbuk = null;
    private String zzcyt;
    private Map<String, String> zzcyu;

    public zzaap(Context context, String str) {
        String str2;
        this.mContext = context;
        this.zzbuk = str;
        this.zzcyt = (String) zzwu.zzpz().zzd(zzaan.zzcpx);
        this.zzcyu = new LinkedHashMap();
        this.zzcyu.put("s", "gmob_sdk");
        this.zzcyu.put("v", "3");
        this.zzcyu.put("os", Build.VERSION.RELEASE);
        this.zzcyu.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzcyu;
        zzbv.zzlf();
        map.put("device", zzayh.zzzt());
        Map<String, String> map2 = this.zzcyu;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.zzcyu;
        zzbv.zzlf();
        map3.put("is_lite_sdk", zzayh.zzav(context) ? "1" : "0");
        Future<zzatz> zzt = zzbv.zzlq().zzt(this.mContext);
        try {
            zzt.get();
            this.zzcyu.put("network_coarse", Integer.toString(zzt.get().zzedd));
            this.zzcyu.put("network_fine", Integer.toString(zzt.get().zzede));
        } catch (Exception e) {
            zzbv.zzlj().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzra() {
        return this.zzcyt;
    }

    /* access modifiers changed from: package-private */
    public final Context getContext() {
        return this.mContext;
    }

    /* access modifiers changed from: package-private */
    public final String zzmr() {
        return this.zzbuk;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zzrb() {
        return this.zzcyu;
    }
}
