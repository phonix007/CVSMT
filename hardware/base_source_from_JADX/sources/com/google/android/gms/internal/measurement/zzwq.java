package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

final class zzwq extends zzwo {
    private static final Class<?> zzcbg = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzwq() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzys.zzp(obj, j);
        if (list instanceof zzwn) {
            obj2 = ((zzwn) list).zzxj();
        } else if (!zzcbg.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzxp) || !(list instanceof zzwd)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzwd zzwd = (zzwd) list;
                if (zzwd.zzug()) {
                    zzwd.zzsw();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzys.zza(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.zzwm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.zzwm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.zzwm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> zza(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = zzc(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzwn
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.zzwm r0 = new com.google.android.gms.internal.measurement.zzwm
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzxp
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzwd
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.zzwd r0 = (com.google.android.gms.internal.measurement.zzwd) r0
            com.google.android.gms.internal.measurement.zzwd r6 = r0.zzak(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.zzys.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = zzcbg
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.zzys.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzyp
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.zzwm r1 = new com.google.android.gms.internal.measurement.zzwm
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.zzyp r0 = (com.google.android.gms.internal.measurement.zzyp) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.zzys.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzxp
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzwd
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.zzwd r1 = (com.google.android.gms.internal.measurement.zzwd) r1
            boolean r2 = r1.zzug()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.zzwd r0 = r1.zzak(r0)
            com.google.android.gms.internal.measurement.zzys.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzwq.zza(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzc = zzc(obj2, j);
        List zza = zza(obj, j, zzc.size());
        int size = zza.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza;
        }
        zzys.zza(obj, j, (Object) zzc);
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzys.zzp(obj, j);
    }
}
