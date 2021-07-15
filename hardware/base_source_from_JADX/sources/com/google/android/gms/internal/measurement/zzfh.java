package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.measurement.internal.zzcw;

final class zzfh extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ zzcw zzafc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfh(zzep zzep, zzcw zzcw) {
        super(zzep);
        this.zzaek = zzep;
        this.zzafc = zzcw;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        if (this.zzaek.zzaec.containsKey(this.zzafc)) {
            Log.w(this.zzaek.zzadw, "OnEventListener already registered.");
            return;
        }
        zzep.zzd zzd = new zzep.zzd(this.zzafc);
        this.zzaek.zzaec.put(this.zzafc, zzd);
        this.zzaek.zzaeg.registerOnMeasurementEventListener(zzd);
    }
}
