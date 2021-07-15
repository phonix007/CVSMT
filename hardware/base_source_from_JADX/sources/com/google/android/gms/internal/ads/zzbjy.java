package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbne;
import java.security.GeneralSecurityException;

public final class zzbjy {
    @Deprecated
    public static final zzbju zzk(byte[] bArr) throws GeneralSecurityException {
        try {
            zzbne zzm = zzbne.zzm(bArr);
            for (zzbne.zzb next : zzm.zzaiv()) {
                if (next.zzaiz().zzaii() == zzbmv.zzb.UNKNOWN_KEYMATERIAL || next.zzaiz().zzaii() == zzbmv.zzb.SYMMETRIC || next.zzaiz().zzaii() == zzbmv.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzbju.zza(zzm);
        } catch (zzbrl unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
