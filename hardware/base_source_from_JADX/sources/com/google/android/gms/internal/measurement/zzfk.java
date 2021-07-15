package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzfk extends zzep.zzb {
    private final /* synthetic */ String val$name;
    private final /* synthetic */ String zzaeh;
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ boolean zzaff = true;
    private final /* synthetic */ Object zzafh;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfk(zzep zzep, String str, String str2, Object obj, boolean z) {
        super(zzep);
        this.zzaek = zzep;
        this.zzaeh = str;
        this.val$name = str2;
        this.zzafh = obj;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.setUserProperty(this.zzaeh, this.val$name, ObjectWrapper.wrap(this.zzafh), this.zzaff, this.timestamp);
    }
}
