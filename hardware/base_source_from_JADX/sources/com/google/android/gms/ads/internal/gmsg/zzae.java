package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxz;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
@ParametersAreNonnullByDefault
public final class zzae implements zzu<Object> {
    private final Object mLock = new Object();
    @GuardedBy("mLock")
    private final Map<String, zzaf> zzdgg = new HashMap();

    public final void zza(String str, zzaf zzaf) {
        synchronized (this.mLock) {
            this.zzdgg.put(str, zzaf);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = BuildConfig.FLAVOR;
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.mLock) {
            zzaf remove = this.zzdgg.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                zzaxz.zzeo(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.zzbw(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.zzd((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zzaxz.zzza()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzaxz.m30v(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zzd(jSONObject);
                } catch (JSONException e) {
                    remove.zzbw(e.getMessage());
                }
            }
        }
    }
}
