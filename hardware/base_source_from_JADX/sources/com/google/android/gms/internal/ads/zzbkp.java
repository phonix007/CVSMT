package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import java.security.GeneralSecurityException;

public final class zzbkp {
    @Deprecated
    public static final zzbns zzfdl = ((zzbns) ((zzbrd) ((zzbns.zza) zzbns.zzajw().zza(zzbke.zzfdl)).zzb(zzbjo.zza("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzbjo.zza("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzft("TINK_HYBRID_1_0_0").zzana()));
    @Deprecated
    private static final zzbns zzfdm = ((zzbns) ((zzbrd) ((zzbns.zza) zzbns.zzajw().zza(zzfdl)).zzft("TINK_HYBRID_1_1_0").zzana()));
    private static final zzbns zzfdn = ((zzbns) ((zzbrd) ((zzbns.zza) zzbns.zzajw().zza(zzbke.zzfdn)).zzb(zzbjo.zza("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).zzb(zzbjo.zza("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).zzft("TINK_HYBRID").zzana()));

    static {
        try {
            zzbke.zzafu();
            zzbkb.zza("TinkHybridEncrypt", new zzbkr());
            zzbkb.zza("TinkHybridDecrypt", new zzbkq());
            zzbjo.zza(zzfdn);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
