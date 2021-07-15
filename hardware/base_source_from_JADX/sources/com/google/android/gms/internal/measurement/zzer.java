package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzer extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ String zzael;
    private final /* synthetic */ String zzaem;
    private final /* synthetic */ Bundle zzaen;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzer(zzep zzep, String str, String str2, Bundle bundle) {
        super(zzep);
        this.zzaek = zzep;
        this.zzael = str;
        this.zzaem = str2;
        this.zzaen = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.clearConditionalUserProperty(this.zzael, this.zzaem, this.zzaen);
    }
}
