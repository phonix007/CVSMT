package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzcy extends zzbt<Integer, Long> {
    public long zzse;
    public long zzsf;

    public zzcy() {
        this.zzse = -1;
        this.zzsf = -1;
    }

    public zzcy(String str) {
        this();
        zzj(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzv() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzse));
        hashMap.put(1, Long.valueOf(this.zzsf));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzse = ((Long) zzk.get(0)).longValue();
            this.zzsf = ((Long) zzk.get(1)).longValue();
        }
    }
}
