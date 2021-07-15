package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class zzbrr<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzfrk;

    public zzbrr(Iterator<Map.Entry<K, Object>> it) {
        this.zzfrk = it;
    }

    public final boolean hasNext() {
        return this.zzfrk.hasNext();
    }

    public final void remove() {
        this.zzfrk.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzfrk.next();
        return next.getValue() instanceof zzbro ? new zzbrq(next) : next;
    }
}
