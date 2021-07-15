package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class zzrj extends ContentObserver {
    private final /* synthetic */ zzrg zzbvl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzrj(zzrg zzrg, Handler handler) {
        super(handler);
        this.zzbvl = zzrg;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.zzbvl.zzmw();
    }
}
