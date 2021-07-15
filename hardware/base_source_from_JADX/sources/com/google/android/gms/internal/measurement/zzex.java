package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.measurement.internal.zzcv;

final class zzex extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ zzcv zzaeu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzex(zzep zzep, zzcv zzcv) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaeu = zzcv;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.setEventInterceptor(new zzep.zzc(this.zzaeu));
    }
}
