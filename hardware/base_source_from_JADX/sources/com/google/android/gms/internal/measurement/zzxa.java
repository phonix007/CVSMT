package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzxa implements zzwz {
    zzxa() {
    }

    public final Map<?, ?> zzac(Object obj) {
        return (zzwy) obj;
    }

    public final zzwx<?, ?> zzah(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> zzad(Object obj) {
        return (zzwy) obj;
    }

    public final boolean zzae(Object obj) {
        return !((zzwy) obj).isMutable();
    }

    public final Object zzaf(Object obj) {
        ((zzwy) obj).zzsw();
        return obj;
    }

    public final Object zzag(Object obj) {
        return zzwy.zzxn().zzxo();
    }

    public final Object zzc(Object obj, Object obj2) {
        zzwy zzwy = (zzwy) obj;
        zzwy zzwy2 = (zzwy) obj2;
        if (!zzwy2.isEmpty()) {
            if (!zzwy.isMutable()) {
                zzwy = zzwy.zzxo();
            }
            zzwy.zza(zzwy2);
        }
        return zzwy;
    }

    public final int zzb(int i, Object obj, Object obj2) {
        zzwy zzwy = (zzwy) obj;
        if (zzwy.isEmpty()) {
            return 0;
        }
        Iterator it = zzwy.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
