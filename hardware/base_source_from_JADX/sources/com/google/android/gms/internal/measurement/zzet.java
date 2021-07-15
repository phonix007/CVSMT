package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;

final class zzet extends zzep.zzb {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzep zzaek;
    private final /* synthetic */ String zzaeq;
    private final /* synthetic */ String zzaer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzet(zzep zzep, Activity activity, String str, String str2) {
        super(zzep);
        this.zzaek = zzep;
        this.val$activity = activity;
        this.zzaeq = str;
        this.zzaer = str2;
    }

    /* access modifiers changed from: package-private */
    public final void zzgd() throws RemoteException {
        this.zzaek.zzaeg.setCurrentScreen(ObjectWrapper.wrap(this.val$activity), this.zzaeq, this.zzaer, this.timestamp);
    }
}
