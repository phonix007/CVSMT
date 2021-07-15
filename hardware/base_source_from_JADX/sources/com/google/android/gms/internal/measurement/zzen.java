package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    @SafeParcelable.Field(mo8233id = 5)
    public final String origin;
    @SafeParcelable.Field(mo8233id = 1)
    public final long zzadt;
    @SafeParcelable.Field(mo8233id = 2)
    public final long zzadu;
    @SafeParcelable.Field(mo8233id = 3)
    public final boolean zzadv;
    @SafeParcelable.Field(mo8233id = 4)
    public final String zzadw;
    @SafeParcelable.Field(mo8233id = 6)
    public final String zzadx;
    @SafeParcelable.Field(mo8233id = 7)
    public final Bundle zzady;

    @SafeParcelable.Constructor
    zzen(@SafeParcelable.Param(mo8236id = 1) long j, @SafeParcelable.Param(mo8236id = 2) long j2, @SafeParcelable.Param(mo8236id = 3) boolean z, @SafeParcelable.Param(mo8236id = 4) String str, @SafeParcelable.Param(mo8236id = 5) String str2, @SafeParcelable.Param(mo8236id = 6) String str3, @SafeParcelable.Param(mo8236id = 7) Bundle bundle) {
        this.zzadt = j;
        this.zzadu = j2;
        this.zzadv = z;
        this.zzadw = str;
        this.origin = str2;
        this.zzadx = str3;
        this.zzady = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.zzadt);
        SafeParcelWriter.writeLong(parcel, 2, this.zzadu);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzadv);
        SafeParcelWriter.writeString(parcel, 4, this.zzadw, false);
        SafeParcelWriter.writeString(parcel, 5, this.origin, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzadx, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzady, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
