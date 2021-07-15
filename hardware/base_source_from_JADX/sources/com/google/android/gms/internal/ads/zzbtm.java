package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbtm implements Comparable<zzbtm>, Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ zzbtf zzftq;
    private final K zzftt;

    zzbtm(zzbtf zzbtf, Map.Entry<K, V> entry) {
        this(zzbtf, (Comparable) entry.getKey(), entry.getValue());
    }

    zzbtm(zzbtf zzbtf, K k, V v) {
        this.zzftq = zzbtf;
        this.zzftt = k;
        this.value = v;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        this.zzftq.zzaos();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzftt, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.zzftt == null ? 0 : this.zzftt.hashCode();
        if (this.value != null) {
            i = this.value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzftt);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.zzftt;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzbtm) obj).getKey());
    }
}
