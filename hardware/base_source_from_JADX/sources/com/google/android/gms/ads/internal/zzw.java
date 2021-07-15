package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzayh;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzw {
    private final Context mContext;
    private boolean zzbmw;
    private zzawr zzbmx;
    private zzaso zzbmy;

    public zzw(Context context, zzawr zzawr, zzaso zzaso) {
        this.mContext = context;
        this.zzbmx = zzawr;
        this.zzbmy = zzaso;
        if (this.zzbmy == null) {
            this.zzbmy = new zzaso();
        }
    }

    private final boolean zzjt() {
        return (this.zzbmx != null && this.zzbmx.zzxp().zzegm) || this.zzbmy.zzdzg;
    }

    public final void recordClick() {
        this.zzbmw = true;
    }

    public final boolean zzju() {
        return !zzjt() || this.zzbmw;
    }

    public final void zzas(@Nullable String str) {
        if (zzjt()) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            if (this.zzbmx != null) {
                this.zzbmx.zza(str, (Map<String, String>) null, 3);
            } else if (this.zzbmy.zzdzg && this.zzbmy.zzdzh != null) {
                for (String next : this.zzbmy.zzdzh) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzlf();
                        zzayh.zzc(this.mContext, BuildConfig.FLAVOR, replace);
                    }
                }
            }
        }
    }
}
