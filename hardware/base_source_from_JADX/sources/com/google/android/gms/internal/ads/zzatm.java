package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "StringParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzatm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatm> CREATOR = new zzatn();
    @SafeParcelable.Field(mo8233id = 2)
    String zzczq;

    @SafeParcelable.Constructor
    public zzatm(@SafeParcelable.Param(mo8236id = 2) String str) {
        this.zzczq = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzczq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
