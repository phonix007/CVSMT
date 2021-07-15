package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassRequestParcelCreator")
public final class zzbjg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbjg> CREATOR = new zzbjh();
    @SafeParcelable.Field(mo8233id = 2)
    private final String packageName;
    @SafeParcelable.VersionField(mo8239id = 1)
    private final int versionCode;
    @SafeParcelable.Field(mo8233id = 3)
    private final String zzfcv;

    @SafeParcelable.Constructor
    zzbjg(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzfcv = str2;
    }

    public zzbjg(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzfcv, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
