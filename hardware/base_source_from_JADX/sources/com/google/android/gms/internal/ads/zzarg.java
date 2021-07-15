package com.google.android.gms.internal.ads;

import java.lang.Thread;

final class zzarg implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzare zzdvl;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdvm;

    zzarg(zzare zzare, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdvl = zzare;
        this.zzdvm = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.zzdvl.zza(thread, th);
            if (this.zzdvm != null) {
                this.zzdvm.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.zzdvm != null) {
                this.zzdvm.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
