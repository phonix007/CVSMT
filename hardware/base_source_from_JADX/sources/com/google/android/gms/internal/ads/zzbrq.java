package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbrq<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzbro> zzfrj;

    private zzbrq(Map.Entry<K, zzbro> entry) {
        this.zzfrj = entry;
    }

    public final K getKey() {
        return this.zzfrj.getKey();
    }

    public final Object getValue() {
        if (this.zzfrj.getValue() == null) {
            return null;
        }
        return zzbro.zzanm();
    }

    public final zzbro zzann() {
        return this.zzfrj.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzbsl) {
            return this.zzfrj.getValue().zzl((zzbsl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
