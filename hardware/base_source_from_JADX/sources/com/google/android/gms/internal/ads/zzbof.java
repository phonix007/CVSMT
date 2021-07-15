package com.google.android.gms.internal.ads;

public final class zzbof {
    private final zzbou zzfjb;
    private final zzbou zzfjc;

    public zzbof(byte[] bArr, byte[] bArr2) {
        this.zzfjb = zzbou.zzp(bArr);
        this.zzfjc = zzbou.zzp(bArr2);
    }

    public final byte[] zzajz() {
        if (this.zzfjb == null) {
            return null;
        }
        return this.zzfjb.getBytes();
    }

    public final byte[] zzaka() {
        if (this.zzfjc == null) {
            return null;
        }
        return this.zzfjc.getBytes();
    }
}
