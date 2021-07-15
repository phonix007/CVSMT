package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzfq extends zzep.zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzep.zze zzafp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfq(zzep.zze zze, Activity activity) {
        super(zzep.this);
        this.zzafp = zze;
        this.val$activity = activity;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        zzep.this.zzaeg.onActivityStopped(ObjectWrapper.wrap(this.val$activity), this.zzafk);
    }
}
