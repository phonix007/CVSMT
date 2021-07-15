package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class zzaad extends zzaac<Boolean> {
    zzaad(int i, String str, Boolean bool) {
        super(i, str, bool, (zzaad) null);
    }

    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(getKey(), ((Boolean) obj).booleanValue());
    }

    public final /* synthetic */ Object zzb(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(getKey(), ((Boolean) zzqv()).booleanValue()));
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), ((Boolean) zzqv()).booleanValue()));
    }
}
