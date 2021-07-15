package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
@ParametersAreNonnullByDefault
public final class zzans extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzans> CREATOR = new zzant();
    @SafeParcelable.Field(mo8233id = 1)
    private final int major;
    @SafeParcelable.Field(mo8233id = 2)
    private final int minor;
    @SafeParcelable.Field(mo8233id = 3)
    private final int zzdov;

    public static zzans zza(zzbiw zzbiw) {
        throw new NoSuchMethodError();
    }

    @SafeParcelable.Constructor
    zzans(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) int i2, @SafeParcelable.Param(mo8236id = 3) int i3) {
        this.major = i;
        this.minor = i2;
        this.zzdov = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.major);
        SafeParcelWriter.writeInt(parcel, 2, this.minor);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdov);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String toString() {
        int i = this.major;
        int i2 = this.minor;
        int i3 = this.zzdov;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }
}
