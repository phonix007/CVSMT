package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzfe extends zzep.zzb {
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ int zzaew = 5;
    private final /* synthetic */ String zzaex;
    private final /* synthetic */ Object zzaey;
    private final /* synthetic */ Object zzaez;
    private final /* synthetic */ Object zzafa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfe(zzep zzep, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.zzaek = zzep;
        this.zzaex = str;
        this.zzaey = obj;
        this.zzaez = obj2;
        this.zzafa = obj3;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.logHealthData(this.zzaew, this.zzaex, ObjectWrapper.wrap(this.zzaey), ObjectWrapper.wrap(this.zzaez), ObjectWrapper.wrap(this.zzafa));
    }
}
