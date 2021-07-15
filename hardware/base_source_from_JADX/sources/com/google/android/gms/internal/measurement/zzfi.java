package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.measurement.internal.zzcw;

final class zzfi extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ zzcw zzafc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfi(zzep zzep, zzcw zzcw) {
        super(zzep);
        this.zzaek = zzep;
        this.zzafc = zzcw;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        zzep.zzd zzd = (zzep.zzd) this.zzaek.zzaec.get(this.zzafc);
        if (zzd == null) {
            Log.w(this.zzaek.zzadw, "OnEventListener had not been registered.");
            return;
        }
        this.zzaek.zzaeg.unregisterOnMeasurementEventListener(zzd);
        this.zzaek.zzaec.remove(this.zzafc);
    }
}
