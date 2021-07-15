package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "AdDataParcelCreator")
public final class zzvv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvv> CREATOR = new zzvw();
    @SafeParcelable.Field(mo8233id = 1)
    private final String zzcix;
    @SafeParcelable.Field(mo8233id = 2)
    private final String zzciy;

    @SafeParcelable.Constructor
    public zzvv(@SafeParcelable.Param(mo8236id = 1) String str, @SafeParcelable.Param(mo8236id = 2) String str2) {
        this.zzcix = str;
        this.zzciy = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzcix, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzciy, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
