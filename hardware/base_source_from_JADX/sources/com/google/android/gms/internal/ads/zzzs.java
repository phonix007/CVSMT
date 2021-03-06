package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "SearchAdRequestParcelCreator")
@SafeParcelable.Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
public final class zzzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzs> CREATOR = new zzzt();
    @SafeParcelable.Field(mo8233id = 15)
    public final String zzcne;

    public zzzs(SearchAdRequest searchAdRequest) {
        this.zzcne = searchAdRequest.getQuery();
    }

    @SafeParcelable.Constructor
    zzzs(@SafeParcelable.Param(mo8236id = 15) String str) {
        this.zzcne = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzcne, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
