package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzep;
import java.util.HashMap;
import java.util.Map;

final class zzeq extends zzep.zzb {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzaeh;
    private final /* synthetic */ String zzaei;
    private final /* synthetic */ Bundle zzaej;
    private final /* synthetic */ zzep zzaek;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeq(zzep zzep, Context context, String str, String str2, Bundle bundle) {
        super(zzep);
        this.zzaek = zzep;
        this.val$context = context;
        this.zzaeh = str;
        this.zzaei = str2;
        this.zzaej = bundle;
    }

    public final void zzgd() {
        String str;
        String str2;
        String str3;
        try {
            Map unused = this.zzaek.zzaec = new HashMap();
            zzec unused2 = this.zzaek.zzaeg = this.zzaek.zzg(this.val$context);
            if (this.zzaek.zzaeg == null) {
                Log.w(this.zzaek.zzadw, "Failed to connect to measurement client.");
                return;
            }
            if (zzep.zze(this.zzaeh, this.zzaei)) {
                String str4 = this.zzaei;
                str2 = this.zzaeh;
                str = str4;
                str3 = this.zzaek.zzadw;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            int zzj = zzep.zzi(this.val$context);
            int zzk = zzep.zzh(this.val$context);
            this.zzaek.zzaeg.initialize(ObjectWrapper.wrap(this.val$context), new zzen(13001, (long) Math.max(zzj, zzk), zzk < zzj, str3, str2, str, this.zzaej), this.timestamp);
        } catch (RemoteException e) {
            this.zzaek.zza((Exception) e, true, false);
        }
    }
}
