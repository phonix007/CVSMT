package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdj extends zzbt<Integer, Object> {
    public Long zzsk;
    public Boolean zzsl;
    public Boolean zzsm;

    public zzdj() {
    }

    public zzdj(String str) {
        zzj(str);
    }

    /* access modifiers changed from: protected */
    public final void zzj(String str) {
        HashMap zzk = zzk(str);
        if (zzk != null) {
            this.zzsk = (Long) zzk.get(0);
            this.zzsl = (Boolean) zzk.get(1);
            this.zzsm = (Boolean) zzk.get(2);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> zzv() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzsk);
        hashMap.put(1, this.zzsl);
        hashMap.put(2, this.zzsm);
        return hashMap;
    }
}
