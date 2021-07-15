package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzark
public final class zzbdy {
    public final boolean zzetk;
    public final int zzetl;
    public final int zzetm;
    public final int zzetn;
    public final String zzeto;
    public final int zzetp;
    public final int zzetq;
    public final int zzetr;
    public final boolean zzets;
    public final boolean zzett;

    public zzbdy(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzetk = zza(jSONObject, "aggressive_media_codec_release", zzaan.zzcph);
        this.zzetl = zzb(jSONObject, "byte_buffer_precache_limit", zzaan.zzcor);
        this.zzetm = zzb(jSONObject, "exo_cache_buffer_size", zzaan.zzcov);
        this.zzetn = zzb(jSONObject, "exo_connect_timeout_millis", zzaan.zzcon);
        this.zzeto = zzc(jSONObject, "exo_player_version", zzaan.zzcom);
        this.zzetp = zzb(jSONObject, "exo_read_timeout_millis", zzaan.zzcoo);
        this.zzetq = zzb(jSONObject, "load_check_interval_bytes", zzaan.zzcop);
        this.zzetr = zzb(jSONObject, "player_precache_limit", zzaan.zzcoq);
        this.zzets = zza(jSONObject, "use_cache_data_source", zzaan.zzcvu);
        this.zzett = zzb(jSONObject, "use_dash", false);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzaac<java.lang.Boolean>, com.google.android.gms.internal.ads.zzaac] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zza(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.zzaak r0 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r3 = r0.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = zzb((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdy.zza(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaac):boolean");
    }

    private static boolean zzb(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaac<java.lang.Integer>, com.google.android.gms.internal.ads.zzaac] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzaak r0 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdy.zzb(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaac):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzaac, com.google.android.gms.internal.ads.zzaac<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzc(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzaac<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzaak r0 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdy.zzc(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzaac):java.lang.String");
    }
}
