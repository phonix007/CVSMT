package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

final class zzamo implements Runnable {
    private final /* synthetic */ zzamj zzdoi;
    private final /* synthetic */ AdRequest.ErrorCode zzdoj;

    zzamo(zzamj zzamj, AdRequest.ErrorCode errorCode) {
        this.zzdoi = zzamj;
        this.zzdoj = errorCode;
    }

    public final void run() {
        try {
            this.zzdoi.zzdnz.onAdFailedToLoad(zzamv.zza(this.zzdoj));
        } catch (RemoteException e) {
            zzbbd.zzd("#007 Could not call remote method.", e);
        }
    }
}
