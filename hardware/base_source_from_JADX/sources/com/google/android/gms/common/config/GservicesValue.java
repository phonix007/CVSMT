package com.google.android.gms.common.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object sLock = new Object();
    private static zza zzbl = null;
    private static int zzbm = 0;
    private static Context zzbn;
    @GuardedBy("sLock")
    private static HashSet<String> zzbo;
    protected final String mKey;
    protected final T zzbp;
    private T zzbq = null;

    private interface zza {
        Long getLong(String str, Long l);

        String getString(String str, String str2);

        Boolean zza(String str, Boolean bool);

        Float zza(String str, Float f);

        Integer zza(String str, Integer num);
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (sLock) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract T zzd(String str);

    private static boolean zzi() {
        synchronized (sLock) {
        }
        return false;
    }

    protected GservicesValue(String str, T t) {
        this.mKey = str;
        this.zzbp = t;
    }

    @KeepForSdk
    @VisibleForTesting
    public void override(T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzbq = t;
        synchronized (sLock) {
            zzi();
        }
    }

    @KeepForSdk
    @VisibleForTesting
    public void resetOverride() {
        this.zzbq = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = zzd(r4.mKey);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x003d, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0024 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get() {
        /*
            r4 = this;
            T r0 = r4.zzbq
            if (r0 == 0) goto L_0x0007
            T r0 = r4.zzbq
            return r0
        L_0x0007:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = sLock
            monitor-enter(r2)
            r1 = 0
            zzbo = r1     // Catch:{ all -> 0x003e }
            zzbn = r1     // Catch:{ all -> 0x003e }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            java.lang.String r1 = r4.mKey     // Catch:{ SecurityException -> 0x0024 }
            java.lang.Object r1 = r4.zzd(r1)     // Catch:{ SecurityException -> 0x0024 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0022:
            r1 = move-exception
            goto L_0x003a
        L_0x0024:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = r4.mKey     // Catch:{ all -> 0x0035 }
            java.lang.Object r3 = r4.zzd(r3)     // Catch:{ all -> 0x0035 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0022 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x0035:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x003a:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x003e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.config.GservicesValue.get():java.lang.Object");
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l) {
        return new zzb(str, l);
    }

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f) {
        return new zzd(str, f);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }
}
