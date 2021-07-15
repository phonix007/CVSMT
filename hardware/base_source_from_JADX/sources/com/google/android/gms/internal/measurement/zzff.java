package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzff extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ zzep.zza zzaep;
    private final /* synthetic */ Bundle zzafb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzff(zzep zzep, Bundle bundle, zzep.zza zza) {
        super(zzep);
        this.zzaek = zzep;
        this.zzafb = bundle;
        this.zzaep = zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.performAction(this.zzafb, this.zzaep, this.timestamp);
    }

    /* access modifiers changed from: protected */
    public final void zzge() {
        this.zzaep.zzb((Bundle) null);
    }
}
