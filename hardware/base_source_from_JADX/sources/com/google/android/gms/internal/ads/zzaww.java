package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

@zzark
public final class zzaww {
    private final AtomicReference<ThreadPoolExecutor> zzegt = new AtomicReference<>((Object) null);
    private final Object zzegu = new Object();
    @Nullable
    @GuardedBy("mGmpAppIdLock")
    private String zzegv = null;
    @Nullable
    @GuardedBy("mGmpAppIdLock")
    private String zzegw = null;
    @VisibleForTesting
    private final AtomicBoolean zzegx = new AtomicBoolean(false);
    @VisibleForTesting
    private final AtomicInteger zzegy = new AtomicInteger(-1);
    private final AtomicReference<Object> zzegz = new AtomicReference<>((Object) null);
    private final AtomicReference<Object> zzeha = new AtomicReference<>((Object) null);
    private ConcurrentMap<String, Method> zzehb = new ConcurrentHashMap(9);
    private final AtomicReference<zzbik> zzehc = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")
    private final List<FutureTask> zzehd = new ArrayList();

    public final boolean zzv(Context context) {
        if (!((Boolean) zzwu.zzpz().zzd(zzaan.zzcqp)).booleanValue() || this.zzegx.get()) {
            return false;
        }
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcqy)).booleanValue()) {
            return true;
        }
        if (this.zzegy.get() == -1) {
            zzwu.zzpv();
            if (!zzbat.zzc(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzwu.zzpv();
                if (zzbat.zzbh(context)) {
                    zzaxz.zzeo("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.zzegy.set(0);
                }
            }
            this.zzegy.set(1);
        }
        if (this.zzegy.get() == 1) {
            return true;
        }
        return false;
    }

    public final void zzc(Context context, String str) {
        if (zzv(context)) {
            zzb(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzd(Context context, String str) {
        if (zzv(context)) {
            zzb(context, str, "endAdUnitExposure");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzw(android.content.Context r5) {
        /*
            r4 = this;
            boolean r0 = r4.zzv(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r5 = ""
            return r5
        L_0x0009:
            java.lang.String r0 = "com.google.android.gms.measurement.AppMeasurement"
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.zzegz
            r2 = 1
            boolean r0 = r4.zza(r5, r0, r1, r2)
            if (r0 != 0) goto L_0x0017
            java.lang.String r5 = ""
            return r5
        L_0x0017:
            r0 = 0
            java.lang.String r1 = "getCurrentScreenName"
            java.lang.reflect.Method r1 = r4.zzj(r5, r1)     // Catch:{ Exception -> 0x0049 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2 = r4.zzegz     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0049 }
            if (r1 != 0) goto L_0x0043
            java.lang.String r1 = "getCurrentScreenClass"
            java.lang.reflect.Method r5 = r4.zzj(r5, r1)     // Catch:{ Exception -> 0x0049 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r4.zzegz     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0049 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r5 = r5.invoke(r1, r2)     // Catch:{ Exception -> 0x0049 }
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0049 }
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r5 = ""
            return r5
        L_0x0049:
            r5 = move-exception
            java.lang.String r1 = "getCurrentScreenName"
            r4.zza((java.lang.Exception) r5, (java.lang.String) r1, (boolean) r0)
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaww.zzw(android.content.Context):java.lang.String");
    }

    public final void zze(Context context, String str) {
        if (zzv(context) && (context instanceof Activity) && zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzeha, false)) {
            Method zzk = zzk(context, "setCurrentScreen");
            try {
                zzk.invoke(this.zzeha.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                zza(e, "setCurrentScreen", false);
            }
        }
    }

    @Nullable
    public final String zzx(Context context) {
        if (!zzv(context)) {
            return null;
        }
        synchronized (this.zzegu) {
            if (this.zzegv != null) {
                String str = this.zzegv;
                return str;
            }
            this.zzegv = (String) zza("getGmpAppId", context);
            String str2 = this.zzegv;
            return str2;
        }
    }

    @Nullable
    public final String zzy(Context context) {
        if (!zzv(context)) {
            return null;
        }
        long longValue = ((Long) zzwu.zzpz().zzd(zzaan.zzcqu)).longValue();
        if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        }
        if (this.zzegt.get() == null) {
            this.zzegt.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) zzwu.zzpz().zzd(zzaan.zzcqv)).intValue(), ((Integer) zzwu.zzpz().zzd(zzaan.zzcqv)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzawy(this)));
        }
        Future submit = this.zzegt.get().submit(new zzawx(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            submit.cancel(true);
            if (e instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    @Nullable
    public final String zzz(Context context) {
        Object zza;
        if (zzv(context) && (zza = zza("generateEventId", context)) != null) {
            return zza.toString();
        }
        return null;
    }

    @Nullable
    public final String zzaa(Context context) {
        if (!zzv(context)) {
            return null;
        }
        synchronized (this.zzegu) {
            if (this.zzegw != null) {
                String str = this.zzegw;
                return str;
            }
            this.zzegw = "fa";
            String str2 = this.zzegw;
            return str2;
        }
    }

    public final void zzf(Context context, String str) {
        zza(context, "_ac", str);
    }

    public final void zzg(Context context, String str) {
        zza(context, "_ai", str);
    }

    public final void zzh(Context context, String str) {
        zza(context, "_aq", str);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzv(context)) {
            Bundle zzf = zzf(str, false);
            zzf.putString("_ai", str2);
            zzf.putString("type", str3);
            zzf.putInt(AppMeasurementSdk.ConditionalUserProperty.VALUE, i);
            zzb(context, "_ar", zzf);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzaxz.m30v(sb.toString());
        }
    }

    public final void zza(Context context, String str, String str2) {
        if (zzv(context)) {
            zzb(context, str, zzf(str2, "_ac".equals(str)));
        }
    }

    private final void zzb(Context context, String str, Bundle bundle) {
        if (zzv(context) && zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzegz, true)) {
            Method zzab = zzab(context);
            try {
                zzab.invoke(this.zzegz.get(), new Object[]{"am", str, bundle});
            } catch (Exception e) {
                zza(e, "logEventInternal", true);
            }
        }
    }

    private static Bundle zzf(String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzaxz.zzb(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzab(Context context) {
        Method method = (Method) this.zzehb.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.zzehb.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method zzi(Context context, String str) {
        Method method = (Method) this.zzehb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.zzehb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzj(Context context, String str) {
        Method method = (Method) this.zzehb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzehb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzk(Context context, String str) {
        Method method = (Method) this.zzehb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.zzehb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zzb(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzegz, true)) {
            Method zzi = zzi(context, str2);
            try {
                zzi.invoke(this.zzegz.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzaxz.m30v(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzegz, true)) {
            return null;
        }
        try {
            return zzj(context, str).invoke(this.zzegz.get(), new Object[0]);
        } catch (Exception e) {
            zza(e, str, true);
            return null;
        }
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (!this.zzegx.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            zzaxz.zzeo(sb.toString());
            if (z) {
                zzaxz.zzeo("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zzegx.set(true);
            }
        }
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzac(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }
}
