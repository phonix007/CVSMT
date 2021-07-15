package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

@zzark
public final class zzamv {
    public static int zza(AdRequest.ErrorCode errorCode) {
        switch (zzamw.zzdol[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    public static MediationAdRequest zza(zzwb zzwb, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzwb.zzcjd != null ? new HashSet(zzwb.zzcjd) : null;
        Date date = new Date(zzwb.zzcjb);
        switch (zzwb.zzcjc) {
            case 1:
                gender = AdRequest.Gender.MALE;
                break;
            case 2:
                gender = AdRequest.Gender.FEMALE;
                break;
            default:
                gender = AdRequest.Gender.UNKNOWN;
                break;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzwb.zzcjj);
    }
}
