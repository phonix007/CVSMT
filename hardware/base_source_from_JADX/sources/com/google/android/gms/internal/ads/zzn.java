package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class zzn extends Thread {
    private final zzm zzaa;
    private final zzb zzj;
    private final zzaa zzk;
    private volatile boolean zzl = false;
    private final BlockingQueue<zzr<?>> zzz;

    public zzn(BlockingQueue<zzr<?>> blockingQueue, zzm zzm, zzb zzb, zzaa zzaa2) {
        this.zzz = blockingQueue;
        this.zzaa = zzm;
        this.zzj = zzb;
        this.zzk = zzaa2;
    }

    public final void quit() {
        this.zzl = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.zzl) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaf.m28e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private final void processRequest() throws InterruptedException {
        zzr take = this.zzz.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            take.zzb("network-queue-take");
            take.isCanceled();
            TrafficStats.setThreadStatsTag(take.zze());
            zzp zzc = this.zzaa.zzc(take);
            take.zzb("network-http-complete");
            if (!zzc.zzac || !take.zzm()) {
                zzx zza = take.zza(zzc);
                take.zzb("network-parse-complete");
                if (take.zzi() && zza.zzbg != null) {
                    this.zzj.zza(take.zzf(), zza.zzbg);
                    take.zzb("network-cache-written");
                }
                take.zzl();
                this.zzk.zzb(take, zza);
                take.zza((zzx<?>) zza);
                return;
            }
            take.zzc("not-modified");
            take.zzn();
        } catch (zzae e) {
            e.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzk.zza(take, e);
            take.zzn();
        } catch (Exception e2) {
            zzaf.zza(e2, "Unhandled exception %s", e2.toString());
            zzae zzae = new zzae((Throwable) e2);
            zzae.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzk.zza(take, zzae);
            take.zzn();
        }
    }
}
