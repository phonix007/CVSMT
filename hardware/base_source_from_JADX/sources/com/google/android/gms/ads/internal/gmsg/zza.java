package com.google.android.gms.ads.internal.gmsg;

import android.os.Bundle;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
public final class zza implements zzu<Object> {
    private final zzb zzder;

    public zza(zzb zzb) {
        this.zzder = zzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzder != null) {
            String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (str == null) {
                zzaxz.zzen("Ad metadata with no name parameter.");
                str = BuildConfig.FLAVOR;
            }
            Bundle zzbt = zzbt(map.get("info"));
            if (zzbt == null) {
                zzaxz.m31e("Failed to convert ad metadata to Bundle.");
            } else {
                this.zzder.zza(str, zzbt);
            }
        }
    }

    private static Bundle zzbt(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            Bundle bundle = new Bundle();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else {
                        String valueOf = String.valueOf(next);
                        zzaxz.zzeo(valueOf.length() != 0 ? "Unsupported type for key:".concat(valueOf) : new String("Unsupported type for key:"));
                    }
                }
            }
            return bundle;
        } catch (JSONException e) {
            zzaxz.zzb("Failed to convert ad metadata to JSON.", e);
            return null;
        }
    }
}
