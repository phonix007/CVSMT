package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
public final class zzaue extends zzaug {
    private final Object mLock = new Object();
    private final Context zzbup;
    @Nullable
    private SharedPreferences zzedt;
    private final zzajv<JSONObject, JSONObject> zzedu;

    public zzaue(Context context, zzajv<JSONObject, JSONObject> zzajv) {
        this.zzbup = context.getApplicationContext();
        this.zzedu = zzajv;
    }

    public final zzbcb<Void> zzwy() {
        synchronized (this.mLock) {
            if (this.zzedt == null) {
                this.zzedt = this.zzbup.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzbv.zzlm().currentTimeMillis() - this.zzedt.getLong("js_last_update", 0) < ((Long) zzwu.zzpz().zzd(zzaan.zzctz)).longValue()) {
            return zzbbq.zzm(null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbbi.zzaav().zzdp);
            jSONObject.put("mf", zzwu.zzpz().zzd(zzaan.zzcua));
            jSONObject.put("cl", "220701481");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(this.zzbup, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
            return zzbbq.zza(this.zzedu.zzj(jSONObject), new zzauf(this), zzbcg.zzepp);
        } catch (JSONException e) {
            zzaxz.zzb("Unable to populate SDK Core Constants parameters.", e);
            return zzbbq.zzm(null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzn(JSONObject jSONObject) {
        zzaan.zza(this.zzbup, 1, jSONObject);
        this.zzedt.edit().putLong("js_last_update", zzbv.zzlm().currentTimeMillis()).apply();
        return null;
    }
}
