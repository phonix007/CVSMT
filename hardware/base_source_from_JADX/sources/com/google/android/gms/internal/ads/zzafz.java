package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
@ParametersAreNonnullByDefault
public final class zzafz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafz> CREATOR = new zzaga();
    @SafeParcelable.Field(mo8233id = 1)
    public final int zzdgp;

    @SafeParcelable.Constructor
    public zzafz(@SafeParcelable.Param(mo8236id = 1) int i) {
        this.zzdgp = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzdgp);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
