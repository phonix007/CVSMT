package com.google.android.gms.internal.ads;

public final class zznh {
    private long zzaze;
    public final zzmf zzbat;
    public zznp zzbck;
    public zznd zzbcl;
    private int zzbcm;

    public zznh(long j, zznp zznp, boolean z, boolean z2) {
        zzhz zzhz;
        this.zzaze = j;
        this.zzbck = zznp;
        String str = zznp.zzaad.zzzi;
        int i = 0;
        if (zzpt.zzad(str) || "application/ttml+xml".equals(str)) {
            this.zzbat = null;
        } else {
            if ("application/x-rawcc".equals(str)) {
                zzhz = new zzjw(zznp.zzaad);
            } else {
                if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                    zzhz = new zzip(1);
                } else {
                    i = z ? 4 : i;
                    zzhz = new zzji(z2 ? i | 8 : i);
                }
            }
            this.zzbat = new zzmf(zzhz, zznp.zzaad);
        }
        this.zzbcl = zznp.zzgj();
    }

    public final void zza(long j, zznp zznp) throws zzkz {
        int zzai;
        zznd zzgj = this.zzbck.zzgj();
        zznd zzgj2 = zznp.zzgj();
        this.zzaze = j;
        this.zzbck = zznp;
        if (zzgj != null) {
            this.zzbcl = zzgj2;
            if (zzgj.zzge() && (zzai = zzgj.zzai(this.zzaze)) != 0) {
                int zzgd = (zzgj.zzgd() + zzai) - 1;
                long zzaw = zzgj.zzaw(zzgd) + zzgj.zze(zzgd, this.zzaze);
                int zzgd2 = zzgj2.zzgd();
                long zzaw2 = zzgj2.zzaw(zzgd2);
                if (zzaw == zzaw2) {
                    this.zzbcm += (zzgd + 1) - zzgd2;
                } else if (zzaw >= zzaw2) {
                    this.zzbcm += zzgj.zzf(zzaw2, this.zzaze) - zzgd2;
                } else {
                    throw new zzkz();
                }
            }
        }
    }

    public final int zzgd() {
        return this.zzbcl.zzgd() + this.zzbcm;
    }

    public final int zzgg() {
        return this.zzbcl.zzai(this.zzaze);
    }

    public final long zzay(int i) {
        return this.zzbcl.zzaw(i - this.zzbcm);
    }

    public final long zzaz(int i) {
        return zzay(i) + this.zzbcl.zze(i - this.zzbcm, this.zzaze);
    }

    public final int zzaj(long j) {
        return this.zzbcl.zzf(j, this.zzaze) + this.zzbcm;
    }

    public final zzno zzax(int i) {
        return this.zzbcl.zzax(i - this.zzbcm);
    }
}
