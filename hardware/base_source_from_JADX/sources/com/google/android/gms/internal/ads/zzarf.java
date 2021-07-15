package com.google.android.gms.internal.ads;

import java.lang.Thread;

final class zzarf implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdvk;
    private final /* synthetic */ zzare zzdvl;

    zzarf(zzare zzare, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdvl = zzare;
        this.zzdvk = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.zzdvl.zza(thread, th);
            if (this.zzdvk != null) {
                this.zzdvk.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.zzdvk != null) {
                this.zzdvk.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
