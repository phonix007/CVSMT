package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "IconAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyv> CREATOR = new zzyw();
    @SafeParcelable.Field(mo8233id = 2)
    public final int zzcly;

    @SafeParcelable.Constructor
    public zzyv(@SafeParcelable.Param(mo8236id = 2) int i) {
        this.zzcly = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzcly);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
