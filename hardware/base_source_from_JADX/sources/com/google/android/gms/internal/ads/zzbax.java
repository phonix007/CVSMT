package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.p000v4.app.NotificationCompat;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@zzark
public final class zzbax {
    private static Object sLock = new Object();
    private static Clock zzbrs = DefaultClock.getInstance();
    @GuardedBy("sLock")
    private static boolean zzeom = false;
    @GuardedBy("sLock")
    private static boolean zzeon = false;
    private static final Set<String> zzeoo = new HashSet(Arrays.asList(new String[0]));
    private final List<String> zzeop;

    public zzbax() {
        this((String) null);
    }

    public zzbax(@Nullable String str) {
        List<String> list;
        if (!isEnabled()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? "ad_request_".concat(valueOf2) : new String("ad_request_");
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? "network_request_".concat(valueOf3) : new String("network_request_");
                list = Arrays.asList(strArr2);
            }
        }
        this.zzeop = list;
    }

    public final void zza(HttpURLConnection httpURLConnection, @Nullable byte[] bArr) {
        HashMap hashMap;
        if (isEnabled()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public final void zza(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    private final void zzb(String str, String str2, @Nullable Map<String, ?> map, @Nullable byte[] bArr) {
        zza("onNetworkRequest", (zzbbc) new zzbay(str, str2, map, bArr));
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (isEnabled()) {
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzbbd.zzeo(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                    str = null;
                }
                zzel(str);
            }
        }
    }

    public final void zza(@Nullable Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzel((String) null);
            }
        }
    }

    private final void zzb(@Nullable Map<String, ?> map, int i) {
        zza("onNetworkResponse", (zzbbc) new zzbaz(i, map));
    }

    public final void zzek(@Nullable String str) {
        if (isEnabled() && str != null) {
            zzi(str.getBytes());
        }
    }

    public final void zzi(byte[] bArr) {
        zza("onNetworkResponseBody", (zzbbc) new zzbba(bArr));
    }

    private final void zzel(@Nullable String str) {
        zza("onNetworkRequestError", (zzbbc) new zzbbb(str));
    }

    private static void zza(JsonWriter jsonWriter, @Nullable Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!zzeoo.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            zzbbd.m31e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                        jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.NAME).value(str);
                            jsonWriter.name(AppMeasurementSdk.ConditionalUserProperty.VALUE).value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    private final void zza(String str, zzbbc zzbbc) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zzbrs.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.zzeop) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzbbc.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzbbd.zzb("unable to log", e);
        }
        zzem(stringWriter.toString());
    }

    private static synchronized void zzem(String str) {
        synchronized (zzbax.class) {
            zzbbd.zzen("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzbbd.zzen(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzbbd.zzen("GMA Debug FINISH");
        }
    }

    public static void zzaat() {
        synchronized (sLock) {
            zzeom = false;
            zzeon = false;
            zzbbd.zzeo("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzaq(boolean z) {
        synchronized (sLock) {
            zzeom = true;
            zzeon = z;
        }
    }

    public static boolean zzaau() {
        boolean z;
        synchronized (sLock) {
            z = zzeom;
        }
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (sLock) {
            z = zzeom && zzeon;
        }
        return z;
    }

    public static boolean zzbl(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcsn)).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            zzbbd.zzc("Fail to determine debug setting.", e);
            return false;
        }
    }

    static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zzei = zzbat.zzei(encode);
            if (zzei != null) {
                jsonWriter.name("bodydigest").value(zzei);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
