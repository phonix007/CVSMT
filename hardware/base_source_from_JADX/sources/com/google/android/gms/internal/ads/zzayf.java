package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzark
public final class zzayf {
    public static final zzbcf zzeky = zzbcg.zza(new ThreadPoolExecutor(2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzdw("Default")));
    public static final zzbcf zzekz;
    public static final ScheduledExecutorService zzela = new ScheduledThreadPoolExecutor(3, zzdw("Schedule"));

    public static <T> zzbcb<T> zza(Callable<T> callable) {
        return zzeky.zza(callable);
    }

    private static ThreadFactory zzdw(String str) {
        return new zzayg(str);
    }

    public static zzbcb<?> zzc(Runnable runnable) {
        return zzeky.zze(runnable);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzdw("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzekz = zzbcg.zza(threadPoolExecutor);
    }
}
