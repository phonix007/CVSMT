package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzyo extends zzym<zzyn, zzyn> {
    zzyo() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzxt zzxt) {
        return false;
    }

    private static void zza(Object obj, zzyn zzyn) {
        ((zzvx) obj).zzbzh = zzyn;
    }

    /* access modifiers changed from: package-private */
    public final void zzy(Object obj) {
        ((zzvx) obj).zzbzh.zzsw();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzai(Object obj) {
        return ((zzyn) obj).zzwe();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzan(Object obj) {
        return ((zzyn) obj).zzyu();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzh(Object obj, Object obj2) {
        zzyn zzyn = (zzyn) obj;
        zzyn zzyn2 = (zzyn) obj2;
        if (zzyn2.equals(zzyn.zzys())) {
            return zzyn;
        }
        return zzyn.zza(zzyn, zzyn2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, zzzh zzzh) throws IOException {
        ((zzyn) obj).zza(zzzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzzh zzzh) throws IOException {
        ((zzyn) obj).zzb(zzzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Object obj, Object obj2) {
        zza(obj, (zzyn) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzam(Object obj) {
        zzyn zzyn = ((zzvx) obj).zzbzh;
        if (zzyn != zzyn.zzys()) {
            return zzyn;
        }
        zzyn zzyt = zzyn.zzyt();
        zza(obj, zzyt);
        return zzyt;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzal(Object obj) {
        return ((zzvx) obj).zzbzh;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        zza(obj, (zzyn) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzaf(Object obj) {
        zzyn zzyn = (zzyn) obj;
        zzyn.zzsw();
        return zzyn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzyr() {
        return zzyn.zzyt();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, Object obj2) {
        ((zzyn) obj).zzb((i << 3) | 3, (Object) (zzyn) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzun zzun) {
        ((zzyn) obj).zzb((i << 3) | 2, (Object) zzun);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzyn) obj).zzb((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Object obj, int i, int i2) {
        ((zzyn) obj).zzb((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzyn) obj).zzb(i << 3, (Object) Long.valueOf(j));
    }
}
