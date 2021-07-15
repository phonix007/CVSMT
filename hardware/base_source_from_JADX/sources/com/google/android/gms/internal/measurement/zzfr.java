package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzfr extends zzep.zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzep.zza zzaep;
    private final /* synthetic */ zzep.zze zzafp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfr(zzep.zze zze, Activity activity, zzep.zza zza) {
        super(zzep.this);
        this.zzafp = zze;
        this.val$activity = activity;
        this.zzaep = zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        zzep.this.zzaeg.onActivitySaveInstanceState(ObjectWrapper.wrap(this.val$activity), this.zzaep, this.zzafk);
    }
}
