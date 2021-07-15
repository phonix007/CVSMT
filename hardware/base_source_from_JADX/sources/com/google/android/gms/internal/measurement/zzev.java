package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzev extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ String zzaet;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzev(zzep zzep, String str) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaet = str;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.beginAdUnitExposure(this.zzaet, this.zzafk);
    }
}
