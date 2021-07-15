package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzbto extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzbtf zzftq;

    private zzbto(zzbtf zzbtf) {
        this.zzftq = zzbtf;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzbtn(this.zzftq, (zzbtg) null);
    }

    public int size() {
        return this.zzftq.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzftq.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzftq.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzftq.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzftq.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzbto(zzbtf zzbtf, zzbtg zzbtg) {
        this(zzbtf);
    }
}
