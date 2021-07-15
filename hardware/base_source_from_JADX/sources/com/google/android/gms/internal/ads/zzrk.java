package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzrk implements zzsq {
    private zzacd zzbvn;

    public zzrk(zzacd zzacd) {
        this.zzbvn = zzacd;
    }

    public final zzsq zzne() {
        return this;
    }

    public final View zznc() {
        if (this.zzbvn != null) {
            return this.zzbvn.zzss();
        }
        return null;
    }

    public final boolean zznd() {
        return this.zzbvn == null;
    }
}
