package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zztu implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zztq zzbzt;

    zztu(zztq zztq) {
        this.zzbzt = zztq;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zzbzt.mLock) {
            zzub unused = this.zzbzt.zzbzs = null;
            if (this.zzbzt.zzbzr != null) {
                zztx unused2 = this.zzbzt.zzbzr = null;
            }
            this.zzbzt.mLock.notifyAll();
        }
    }
}
