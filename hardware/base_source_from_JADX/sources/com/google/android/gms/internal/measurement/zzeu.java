package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzeu extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ boolean zzaes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeu(zzep zzep, boolean z) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaes = z;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.setMeasurementEnabled(this.zzaes, this.timestamp);
    }
}
