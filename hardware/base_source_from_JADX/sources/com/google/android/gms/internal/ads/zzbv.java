package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzbv extends zzbt<Integer, Object> {
    public String zzdq;
    public String zzds;
    public String zzdt;
    public String zzdu;
    public long zzit;

    public zzbv(String str) {
        this();
        zzj(str);
    }

    public zzbv() {
        this.zzdq = "E";
        this.zzit = -1;
        this.zzds = "E";
        this.zzdt = "E";
        this.zzdu = "E";
    }

    /* access modifiers changed from: protected */
    public final void zzj(String str) {
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        HashMap zzk = zzk(str);
        if (zzk != null) {
            if (zzk.get(0) == null) {
                str2 = "E";
            } else {
                str2 = (String) zzk.get(0);
            }
            this.zzdq = str2;
            if (zzk.get(1) == null) {
                j = -1;
            } else {
                j = ((Long) zzk.get(1)).longValue();
            }
            this.zzit = j;
            if (zzk.get(2) == null) {
                str3 = "E";
            } else {
                str3 = (String) zzk.get(2);
            }
            this.zzds = str3;
            if (zzk.get(3) == null) {
                str4 = "E";
            } else {
                str4 = (String) zzk.get(3);
            }
            this.zzdt = str4;
            if (zzk.get(4) == null) {
                str5 = "E";
            } else {
                str5 = (String) zzk.get(4);
            }
            this.zzdu = str5;
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> zzv() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzdq);
        hashMap.put(4, this.zzdu);
        hashMap.put(3, this.zzdt);
        hashMap.put(2, this.zzds);
        hashMap.put(1, Long.valueOf(this.zzit));
        return hashMap;
    }
}
