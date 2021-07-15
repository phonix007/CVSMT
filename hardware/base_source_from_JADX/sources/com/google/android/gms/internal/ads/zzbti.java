package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class zzbti extends zzbto {
    private final /* synthetic */ zzbtf zzftq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzbti(zzbtf zzbtf) {
        super(zzbtf, (zzbtg) null);
        this.zzftq = zzbtf;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzbth(this.zzftq, (zzbtg) null);
    }

    /* synthetic */ zzbti(zzbtf zzbtf, zzbtg zzbtg) {
        this(zzbtf);
    }
}
