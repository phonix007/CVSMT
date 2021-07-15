package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzbth implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzftp;
    private final /* synthetic */ zzbtf zzftq;

    private zzbth(zzbtf zzbtf) {
        this.zzftq = zzbtf;
        this.pos = this.zzftq.zzftk.size();
    }

    public final boolean hasNext() {
        return (this.pos > 0 && this.pos <= this.zzftq.zzftk.size()) || zzaou().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzaou() {
        if (this.zzftp == null) {
            this.zzftp = this.zzftq.zzftn.entrySet().iterator();
        }
        return this.zzftp;
    }

    public final /* synthetic */ Object next() {
        if (zzaou().hasNext()) {
            return (Map.Entry) zzaou().next();
        }
        List zzb = this.zzftq.zzftk;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzbth(zzbtf zzbtf, zzbtg zzbtg) {
        this(zzbtf);
    }
}
