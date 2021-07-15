package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrd;
import java.io.IOException;
import java.util.Map;

final class zzbqs extends zzbqr<Object> {
    zzbqs() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zzh(zzbsl zzbsl) {
        return zzbsl instanceof zzbrd.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzbqu<Object> zzq(Object obj) {
        return ((zzbrd.zzc) obj).zzfqa;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, zzbqu<Object> zzbqu) {
        ((zzbrd.zzc) obj).zzfqa = zzbqu;
    }

    /* access modifiers changed from: package-private */
    public final zzbqu<Object> zzr(Object obj) {
        zzbqu<Object> zzq = zzq(obj);
        if (!zzq.isImmutable()) {
            return zzq;
        }
        zzbqu<Object> zzbqu = (zzbqu) zzq.clone();
        zza(obj, zzbqu);
        return zzbqu;
    }

    /* access modifiers changed from: package-private */
    public final void zzs(Object obj) {
        zzq(obj).zzakj();
    }

    /* access modifiers changed from: package-private */
    public final <UT, UB> UB zza(zzbtb zzbtb, Object obj, zzbqq zzbqq, zzbqu<Object> zzbqu, UB ub, zzbtu<UT, UB> zzbtu) throws IOException {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbup zzbup, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final Object zza(zzbqq zzbqq, zzbsl zzbsl, int i) {
        return zzbqq.zza(zzbsl, i);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbtb zzbtb, Object obj, zzbqq zzbqq, zzbqu<Object> zzbqu) throws IOException {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbpu zzbpu, Object obj, zzbqq zzbqq, zzbqu<Object> zzbqu) throws IOException {
        throw new NoSuchMethodError();
    }
}
