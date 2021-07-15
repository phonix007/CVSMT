package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzwk<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzcax;

    public zzwk(Iterator<Map.Entry<K, Object>> it) {
        this.zzcax = it;
    }

    public final boolean hasNext() {
        return this.zzcax.hasNext();
    }

    public final void remove() {
        this.zzcax.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzcax.next();
        return next.getValue() instanceof zzwh ? new zzwj(next) : next;
    }
}
