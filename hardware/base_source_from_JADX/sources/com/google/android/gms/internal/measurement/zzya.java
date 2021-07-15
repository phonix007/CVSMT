package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzya extends zzyg {
    private final /* synthetic */ zzxx zzcdc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzya(zzxx zzxx) {
        super(zzxx, (zzxy) null);
        this.zzcdc = zzxx;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzxz(this.zzcdc, (zzxy) null);
    }

    /* synthetic */ zzya(zzxx zzxx, zzxy zzxy) {
        this(zzxx);
    }
}
