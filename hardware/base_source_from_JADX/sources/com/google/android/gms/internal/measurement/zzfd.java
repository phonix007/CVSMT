package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzfd extends zzep.zzb {
    private final /* synthetic */ String zzaeh;
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ String zzaeo;
    private final /* synthetic */ zzep.zza zzaep;
    private final /* synthetic */ boolean zzaev;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfd(zzep zzep, String str, String str2, boolean z, zzep.zza zza) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaeh = str;
        this.zzaeo = str2;
        this.zzaev = z;
        this.zzaep = zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.getUserProperties(this.zzaeh, this.zzaeo, this.zzaev, this.zzaep);
    }

    /* access modifiers changed from: protected */
    public final void zzge() {
        this.zzaep.zzb((Bundle) null);
    }
}
