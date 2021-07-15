package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzwr extends zzwo {
    private zzwr() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzwd zzd = zzd(obj, j);
        if (zzd.zzug()) {
            return zzd;
        }
        int size = zzd.size();
        zzwd zzak = zzd.zzak(size == 0 ? 10 : size << 1);
        zzys.zza(obj, j, (Object) zzak);
        return zzak;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzd(obj, j).zzsw();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzwd zzd = zzd(obj, j);
        zzwd zzd2 = zzd(obj2, j);
        int size = zzd.size();
        int size2 = zzd2.size();
        if (size > 0 && size2 > 0) {
            if (!zzd.zzug()) {
                zzd = zzd.zzak(size2 + size);
            }
            zzd.addAll(zzd2);
        }
        if (size > 0) {
            zzd2 = zzd;
        }
        zzys.zza(obj, j, (Object) zzd2);
    }

    private static <E> zzwd<E> zzd(Object obj, long j) {
        return (zzwd) zzys.zzp(obj, j);
    }
}
