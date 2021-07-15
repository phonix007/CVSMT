package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzep;

final class zzfj extends zzep.zzb {
    private final /* synthetic */ String val$name;
    private final /* synthetic */ String zzaeh;
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ Long zzafd;
    private final /* synthetic */ Bundle zzafe;
    private final /* synthetic */ boolean zzaff = true;
    private final /* synthetic */ boolean zzafg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfj(zzep zzep, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(zzep);
        this.zzaek = zzep;
        this.zzafd = l;
        this.zzaeh = str;
        this.val$name = str2;
        this.zzafe = bundle;
        this.zzafg = z2;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.logEvent(this.zzaeh, this.val$name, this.zzafe, this.zzaff, this.zzafg, this.zzafd == null ? this.timestamp : this.zzafd.longValue());
    }
}
