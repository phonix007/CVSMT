package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class zzaae extends zzaac<Integer> {
    zzaae(int i, String str, Integer num) {
        super(i, str, num, (zzaad) null);
    }

    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(getKey(), ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object zzb(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(getKey(), ((Integer) zzqv()).intValue()));
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(getKey(), ((Integer) zzqv()).intValue()));
    }
}
