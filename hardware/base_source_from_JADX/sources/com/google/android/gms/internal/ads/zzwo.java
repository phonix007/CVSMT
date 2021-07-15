package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzwo extends zzwt<zzxg> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcla;
    private final /* synthetic */ zzalg zzclb;
    private final /* synthetic */ zzwj zzclc;

    zzwo(zzwj zzwj, Context context, String str, zzalg zzalg) {
        this.zzclc = zzwj;
        this.val$context = context;
        this.zzcla = str;
        this.zzclb = zzalg;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpq() {
        zzwj.zza(this.val$context, "native_ad");
        return new zzzh();
    }

    public final /* synthetic */ Object zzpr() throws RemoteException {
        return this.zzclc.zzcks.zza(this.val$context, this.zzcla, this.zzclb);
    }

    public final /* synthetic */ Object zza(zzxw zzxw) throws RemoteException {
        return zzxw.createAdLoaderBuilder(ObjectWrapper.wrap(this.val$context), this.zzcla, this.zzclb, 14300000);
    }
}
