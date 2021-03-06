package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdk extends zzbt<Integer, Long> {
    public Long zzsn;
    public Long zzso;

    public zzdk() {
    }

    public zzdk(String str) {
        zzj(str);
    }

    /* access modifiers changed from: protected */
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzsn = (Long) zzk.get(0);
            this.zzso = (Long) zzk.get(1);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzv() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzsn);
        hashMap.put(1, this.zzso);
        return hashMap;
    }
}
