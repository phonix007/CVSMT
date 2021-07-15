package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import org.json.JSONObject;

final class zzaah extends zzaac<String> {
    zzaah(int i, String str, String str2) {
        super(i, str, str2, (zzaad) null);
    }

    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Object obj) {
        editor.putString(getKey(), (String) obj);
    }

    public final /* synthetic */ Object zzb(JSONObject jSONObject) {
        return jSONObject.optString(getKey(), (String) zzqv());
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(getKey(), (String) zzqv());
    }
}
