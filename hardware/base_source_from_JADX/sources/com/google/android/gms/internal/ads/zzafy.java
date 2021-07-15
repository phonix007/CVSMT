package com.google.android.gms.internal.ads;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzafy implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbcl zzcaf;

    zzafy(zzaft zzaft, zzbcl zzbcl) {
        this.zzcaf = zzbcl;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzcaf.setException(new RuntimeException("Connection failed."));
    }
}
