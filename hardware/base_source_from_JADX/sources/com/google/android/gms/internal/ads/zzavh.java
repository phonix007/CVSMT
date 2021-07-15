package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzavh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzavh> CREATOR = new zzavi();
    @SafeParcelable.Field(mo8233id = 3)
    public final String zzbsn;
    @SafeParcelable.Field(mo8233id = 2)
    public final zzwb zzdwg;

    @SafeParcelable.Constructor
    public zzavh(@SafeParcelable.Param(mo8236id = 2) zzwb zzwb, @SafeParcelable.Param(mo8236id = 3) String str) {
        this.zzdwg = zzwb;
        this.zzbsn = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdwg, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbsn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
