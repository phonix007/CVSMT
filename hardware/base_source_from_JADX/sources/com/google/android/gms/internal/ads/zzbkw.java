package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbmp;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zzbkw implements zzboa {
    private final String zzfdv;
    private final int zzfdw;
    private zzblr zzfdx;
    private zzblb zzfdy;
    private int zzfdz;

    zzbkw(zzbna zzbna) throws GeneralSecurityException {
        this.zzfdv = zzbna.zzaig();
        if (this.zzfdv.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzblt zzt = zzblt.zzt(zzbna.zzaih());
                this.zzfdx = (zzblr) zzbkb.zzb(zzbna);
                this.zzfdw = zzt.getKeySize();
            } catch (zzbrl e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zzfdv.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzbld zzj = zzbld.zzj(zzbna.zzaih());
                this.zzfdy = (zzblb) zzbkb.zzb(zzbna);
                this.zzfdz = zzj.zzagb().getKeySize();
                this.zzfdw = this.zzfdz + zzj.zzagc().getKeySize();
            } catch (zzbrl e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.zzfdv);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    public final int zzafw() {
        return this.zzfdw;
    }

    public final zzbjm zzl(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzfdw) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zzfdv.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (zzbjm) zzbkb.zzb(this.zzfdv, (zzblr) ((zzbrd) ((zzblr.zza) zzblr.zzagu().zza(this.zzfdx)).zzs(zzbpu.zzi(bArr, 0, this.zzfdw)).zzana()));
        } else if (this.zzfdv.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzfdz);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzfdz, this.zzfdw);
            zzblb.zza zzb = zzblb.zzafz().zzdk(this.zzfdy.getVersion()).zzb((zzblf) ((zzbrd) ((zzblf.zza) zzblf.zzagg().zza(this.zzfdy.zzafx())).zzm(zzbpu.zzr(copyOfRange)).zzana()));
            return (zzbjm) zzbkb.zzb(this.zzfdv, (zzblb) ((zzbrd) zzb.zzb((zzbmp) ((zzbrd) ((zzbmp.zza) zzbmp.zzahx().zza(this.zzfdy.zzafy())).zzaf(zzbpu.zzr(copyOfRange2)).zzana())).zzana()));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
