package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzfm extends Handler {
    private final /* synthetic */ zzfl zzxr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzfl zzfl, Looper looper) {
        super(looper);
        this.zzxr = zzfl;
    }

    public final void handleMessage(Message message) {
        this.zzxr.zza(message);
    }
}
