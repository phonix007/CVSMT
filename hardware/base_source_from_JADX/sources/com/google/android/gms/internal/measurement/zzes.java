package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzes extends zzep.zzb {
    private final /* synthetic */ String zzaeh;
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ String zzaeo;
    private final /* synthetic */ zzep.zza zzaep;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzes(zzep zzep, String str, String str2, zzep.zza zza) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaeh = str;
        this.zzaeo = str2;
        this.zzaep = zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.getConditionalUserProperties(this.zzaeh, this.zzaeo, this.zzaep);
    }

    /* access modifiers changed from: protected */
    public final void zzge() {
        this.zzaep.zzb((Bundle) null);
    }
}
