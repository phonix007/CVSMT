package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzfm extends zzep.zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzafo;
    private final /* synthetic */ zzep.zze zzafp;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfm(zzep.zze zze, Activity activity, Bundle bundle) {
        super(zzep.this);
        this.zzafp = zze;
        this.val$activity = activity;
        this.zzafo = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        zzep.this.zzaeg.onActivityCreated(ObjectWrapper.wrap(this.val$activity), this.zzafo, this.zzafk);
    }
}
