package com.google.android.gms.internal.ads;

import android.content.Context;
import com.apps.saiinfo.computerhardware.BuildConfig;
import java.util.concurrent.Callable;

final /* synthetic */ class zzayi implements Callable {
    private final Context zzcmy;
    private final zzayh zzeli;

    zzayi(zzayh zzayh, Context context) {
        this.zzeli = zzayh;
        this.zzcmy = context;
    }

    public final Object call() {
        Context context = this.zzcmy;
        if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcym)).booleanValue()) {
            return BuildConfig.FLAVOR;
        }
        return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", BuildConfig.FLAVOR);
    }
}
