package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzfl extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ Bundle zzafb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfl(zzep zzep, Bundle bundle) {
        super(zzep);
        this.zzaek = zzep;
        this.zzafb = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.setConditionalUserProperty(this.zzafb, this.timestamp);
    }
}
