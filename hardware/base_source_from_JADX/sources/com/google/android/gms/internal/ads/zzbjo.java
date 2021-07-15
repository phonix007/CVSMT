package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnc;
import java.security.GeneralSecurityException;

public final class zzbjo {
    public static zzbnc zza(String str, String str2, String str3, int i, boolean z) {
        zzbnc.zza zzfo = zzbnc.zzais().zzfo(str2);
        String valueOf = String.valueOf(str3);
        return (zzbnc) ((zzbrd) zzfo.zzfp(valueOf.length() != 0 ? "type.googleapis.com/google.crypto.tink.".concat(valueOf) : new String("type.googleapis.com/google.crypto.tink.")).zzdy(0).zzbc(true).zzfq(str).zzana());
    }

    public static void zza(zzbns zzbns) throws GeneralSecurityException {
        for (zzbnc next : zzbns.zzajv()) {
            if (next.zzaig().isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (next.zzaio().isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!next.zzair().isEmpty()) {
                zzbkb.zza(zzbkb.zzfi(next.zzair()).zzb(next.zzaig(), next.zzaio(), next.zzaip()), next.zzaiq());
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }
}
