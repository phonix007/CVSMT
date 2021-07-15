package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbng;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class zzbkc {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static zzbng zzb(zzbne zzbne) {
        zzbng.zza zzea = zzbng.zzaje().zzea(zzbne.zzaiu());
        for (zzbne.zzb next : zzbne.zzaiv()) {
            zzea.zzb((zzbng.zzb) ((zzbrd) zzbng.zzb.zzajg().zzfr(next.zzaiz().zzaig()).zzb(next.zzaja()).zzb(next.zzajc()).zzec(next.zzajb()).zzana()));
        }
        return (zzbng) ((zzbrd) zzea.zzana());
    }

    public static void zzc(zzbne zzbne) throws GeneralSecurityException {
        if (zzbne.zzaiw() != 0) {
            int zzaiu = zzbne.zzaiu();
            boolean z = false;
            boolean z2 = true;
            for (zzbne.zzb next : zzbne.zzaiv()) {
                if (!next.zzaiy()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.zzajb())}));
                } else if (next.zzajc() == zzbnq.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.zzajb())}));
                } else if (next.zzaja() != zzbmy.UNKNOWN_STATUS) {
                    if (next.zzaja() == zzbmy.ENABLED && next.zzajb() == zzaiu) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.zzaiz().zzaii() != zzbmv.zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.zzajb())}));
                }
            }
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
