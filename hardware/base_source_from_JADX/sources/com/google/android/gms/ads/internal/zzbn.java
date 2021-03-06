package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class zzbn {
    private final Handler mHandler;

    public zzbn(Handler handler) {
        this.mHandler = handler;
    }

    public final void removeCallbacks(Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.mHandler.postDelayed(runnable, j);
    }
}
