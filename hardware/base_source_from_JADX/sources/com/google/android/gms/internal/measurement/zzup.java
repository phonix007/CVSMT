package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zzup implements Comparator<zzun> {
    zzup() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzun zzun = (zzun) obj;
        zzun zzun2 = (zzun) obj2;
        zzuu zzuu = (zzuu) zzun.iterator();
        zzuu zzuu2 = (zzuu) zzun2.iterator();
        while (zzuu.hasNext() && zzuu2.hasNext()) {
            int compare = Integer.compare(zzun.zza(zzuu.nextByte()), zzun.zza(zzuu2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzun.size(), zzun2.size());
    }
}
