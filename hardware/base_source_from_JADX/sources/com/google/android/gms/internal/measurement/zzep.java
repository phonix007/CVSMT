package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzcv;
import com.google.android.gms.measurement.internal.zzcw;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class zzep {
    private static volatile zzep zzadz;
    /* access modifiers changed from: private */
    public final String zzadw;
    private final ExecutorService zzaea;
    private final AppMeasurementSdk zzaeb;
    /* access modifiers changed from: private */
    public Map<zzcw, zzd> zzaec;
    private int zzaed;
    /* access modifiers changed from: private */
    public boolean zzaee;
    private String zzaef;
    /* access modifiers changed from: private */
    public zzec zzaeg;
    protected final Clock zzrz;

    class zze implements Application.ActivityLifecycleCallbacks {
        zze() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzep.this.zza((zzb) new zzfm(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            zzep.this.zza((zzb) new zzfn(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            zzep.this.zza((zzb) new zzfo(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            zzep.this.zza((zzb) new zzfp(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            zzep.this.zza((zzb) new zzfq(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zza zza = new zza();
            zzep.this.zza((zzb) new zzfr(this, activity, zza));
            Bundle zzo = zza.zzo(50);
            if (zzo != null) {
                bundle.putAll(zzo);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            zzep.this.zza((zzb) new zzfs(this, activity));
        }
    }

    public static zzep zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzadz == null) {
            synchronized (zzep.class) {
                if (zzadz == null) {
                    zzadz = new zzep(context, str, str2, str3, bundle);
                }
            }
        }
        return zzadz;
    }

    class zza extends zzeg {
        private final AtomicReference<Bundle> zzafi = new AtomicReference<>();
        private boolean zzafj;

        zza() {
        }

        public final void zzb(Bundle bundle) {
            synchronized (this.zzafi) {
                try {
                    this.zzafi.set(bundle);
                    this.zzafj = true;
                    this.zzafi.notify();
                } catch (Throwable th) {
                    this.zzafi.notify();
                    throw th;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final String zzk(long j) {
            return (String) zza(zzp(j), String.class);
        }

        /* access modifiers changed from: package-private */
        public final <T extends Parcelable> List<T> zzl(long j) {
            return (List) zza(zzp(5000), List.class);
        }

        /* access modifiers changed from: package-private */
        public final Long zzm(long j) {
            return (Long) zza(zzp(500), Long.class);
        }

        /* access modifiers changed from: package-private */
        public final Integer zzn(long j) {
            return (Integer) zza(zzp(10000), Integer.class);
        }

        /* access modifiers changed from: package-private */
        public final Bundle zzo(long j) {
            return zzp(j);
        }

        private final Bundle zzp(long j) {
            Bundle bundle;
            synchronized (this.zzafi) {
                if (!this.zzafj) {
                    try {
                        this.zzafi.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.zzafi.get();
            }
            return bundle;
        }

        private final <T> T zza(Bundle bundle, Class<T> cls) {
            Object obj;
            if (bundle == null || (obj = bundle.get("r")) == null) {
                return null;
            }
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                String canonicalName = cls.getCanonicalName();
                String canonicalName2 = obj.getClass().getCanonicalName();
                zzep.this.zzc(5, "Unexpected object type. Expected, Received", canonicalName, canonicalName2, e);
                Log.w(zzep.this.zzadw, String.format(String.valueOf("Unexpected object type. Expected, Received").concat(": %s, %s"), new Object[]{canonicalName, canonicalName2}), e);
                throw e;
            }
        }
    }

    abstract class zzb implements Runnable {
        final long timestamp;
        final long zzafk;
        private final boolean zzafl;

        zzb(zzep zzep) {
            this(true);
        }

        /* access modifiers changed from: package-private */
        public abstract void zzgd() throws RemoteException;

        /* access modifiers changed from: protected */
        public void zzge() {
        }

        zzb(boolean z) {
            this.timestamp = zzep.this.zzrz.currentTimeMillis();
            this.zzafk = zzep.this.zzrz.elapsedRealtime();
            this.zzafl = z;
        }

        public void run() {
            if (zzep.this.zzaee) {
                zzge();
                return;
            }
            try {
                zzgd();
            } catch (Exception e) {
                zzep.this.zza(e, false, this.zzafl);
                zzge();
            }
        }
    }

    static class zzc extends zzej {
        private final zzcv zzafm;

        zzc(zzcv zzcv) {
            this.zzafm = zzcv;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            this.zzafm.interceptEvent(str, str2, bundle, j);
        }

        /* renamed from: id */
        public final int mo11897id() {
            return this.zzafm.hashCode();
        }
    }

    static class zzd extends zzej {
        private final zzcw zzafn;

        zzd(zzcw zzcw) {
            this.zzafn = zzcw;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            this.zzafn.onEvent(str, str2, bundle, j);
        }

        /* renamed from: id */
        public final int mo11897id() {
            return this.zzafn.hashCode();
        }
    }

    public final AppMeasurementSdk zzga() {
        return this.zzaeb;
    }

    private zzep(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zze(str2, str3)) {
            this.zzadw = "FA";
        } else {
            this.zzadw = str;
        }
        this.zzrz = DefaultClock.getInstance();
        this.zzaea = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzadw, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zze());
        }
        this.zzaeb = new AppMeasurementSdk(this);
        boolean z = false;
        if (!(!zzf(context) || zzgb())) {
            this.zzaef = null;
            this.zzaee = true;
            Log.w(this.zzadw, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!zze(str2, str3)) {
            this.zzaef = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.zzadw, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzadw, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.zzaee = true;
                return;
            }
        } else {
            this.zzaef = str2;
        }
        zza((zzb) new zzeq(this, context, str2, str3, bundle));
    }

    private static boolean zzf(Context context) {
        try {
            GoogleServices.initialize(context);
            if (GoogleServices.getGoogleAppId() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static boolean zze(String str, String str2) {
        return (str2 == null || str == null || zzgb()) ? false : true;
    }

    /* access modifiers changed from: private */
    public final void zza(zzb zzb2) {
        this.zzaea.execute(zzb2);
    }

    /* access modifiers changed from: protected */
    public final zzec zzg(Context context) {
        try {
            return zzed.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zza((Exception) e, true, false);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static int zzh(Context context) {
        return DynamiteModule.getRemoteVersion(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public static int zzi(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public final void zza(Exception exc, boolean z, boolean z2) {
        this.zzaee |= z;
        if (z) {
            Log.w(this.zzadw, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzc(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzadw, "Error with data collection. Data lost.", exc);
    }

    private static boolean zzgb() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void zza(zzcv zzcv) {
        zza((zzb) new zzex(this, zzcv));
    }

    public final void zza(zzcw zzcw) {
        zza((zzb) new zzfh(this, zzcw));
    }

    public final void zzb(zzcw zzcw) {
        zza((zzb) new zzfi(this, zzcw));
    }

    public final void logEventInternal(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, (Long) null);
    }

    public final void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, Long.valueOf(j));
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zza((zzb) new zzfj(this, l, str, str2, bundle, true, z2));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza((zzb) new zzfk(this, str, str2, obj, true));
    }

    public final void setConditionalUserProperty(Bundle bundle) {
        zza((zzb) new zzfl(this, bundle));
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        zza((zzb) new zzer(this, str, str2, bundle));
    }

    public final List<Bundle> getConditionalUserProperties(String str, String str2) {
        zza zza2 = new zza();
        zza((zzb) new zzes(this, str, str2, zza2));
        List<Bundle> zzl = zza2.zzl(5000);
        return zzl == null ? Collections.emptyList() : zzl;
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        zza((zzb) new zzet(this, activity, str, str2));
    }

    public final void setMeasurementEnabled(boolean z) {
        zza((zzb) new zzeu(this, z));
    }

    public final void beginAdUnitExposure(String str) {
        zza((zzb) new zzev(this, str));
    }

    public final void endAdUnitExposure(String str) {
        zza((zzb) new zzew(this, str));
    }

    public final String getGmpAppId() {
        zza zza2 = new zza();
        zza((zzb) new zzey(this, zza2));
        return zza2.zzk(500);
    }

    public final String zzgc() {
        zza zza2 = new zza();
        zza((zzb) new zzez(this, zza2));
        return zza2.zzk(50);
    }

    public final long generateEventId() {
        zza zza2 = new zza();
        zza((zzb) new zzfa(this, zza2));
        Long zzm = zza2.zzm(500);
        if (zzm != null) {
            return zzm.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.zzrz.currentTimeMillis()).nextLong();
        int i = this.zzaed + 1;
        this.zzaed = i;
        return nextLong + ((long) i);
    }

    public final String getCurrentScreenName() {
        zza zza2 = new zza();
        zza((zzb) new zzfb(this, zza2));
        return zza2.zzk(500);
    }

    public final String getCurrentScreenClass() {
        zza zza2 = new zza();
        zza((zzb) new zzfc(this, zza2));
        return zza2.zzk(500);
    }

    public final Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        zza zza2 = new zza();
        zza((zzb) new zzfd(this, str, str2, z, zza2));
        Bundle zzo = zza2.zzo(5000);
        if (zzo == null || zzo.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zzo.size());
        for (String str3 : zzo.keySet()) {
            Object obj = zzo.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzc(int i, String str, Object obj, Object obj2, Object obj3) {
        zza((zzb) new zzfe(this, false, 5, str, obj, obj2, obj3));
    }

    public final Bundle zza(Bundle bundle, boolean z) {
        zza zza2 = new zza();
        zza((zzb) new zzff(this, bundle, zza2));
        if (z) {
            return zza2.zzo(5000);
        }
        return null;
    }

    public final int getMaxUserProperties(String str) {
        zza zza2 = new zza();
        zza((zzb) new zzfg(this, str, zza2));
        Integer zzn = zza2.zzn(10000);
        if (zzn == null) {
            return 25;
        }
        return zzn.intValue();
    }

    public final String getAppIdOrigin() {
        return this.zzaef;
    }
}
