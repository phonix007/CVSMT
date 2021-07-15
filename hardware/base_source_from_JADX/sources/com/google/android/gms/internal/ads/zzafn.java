package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "HttpResponseParcelCreator")
public final class zzafn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafn> CREATOR = new zzafo();
    @SafeParcelable.Field(mo8233id = 4)
    public final byte[] data;
    @SafeParcelable.Field(mo8233id = 3)
    public final int statusCode;
    @SafeParcelable.Field(mo8233id = 7)
    public final boolean zzac;
    @SafeParcelable.Field(mo8233id = 8)
    public final long zzad;
    @SafeParcelable.Field(mo8233id = 5)
    public final String[] zzdgi;
    @SafeParcelable.Field(mo8233id = 6)
    public final String[] zzdgj;
    @SafeParcelable.Field(mo8233id = 1)
    public final boolean zzdgk;
    @SafeParcelable.Field(mo8233id = 2)
    public final String zzdgl;

    @SafeParcelable.Constructor
    zzafn(@SafeParcelable.Param(mo8236id = 1) boolean z, @SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) int i, @SafeParcelable.Param(mo8236id = 4) byte[] bArr, @SafeParcelable.Param(mo8236id = 5) String[] strArr, @SafeParcelable.Param(mo8236id = 6) String[] strArr2, @SafeParcelable.Param(mo8236id = 7) boolean z2, @SafeParcelable.Param(mo8236id = 8) long j) {
        this.zzdgk = z;
        this.zzdgl = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzdgi = strArr;
        this.zzdgj = strArr2;
        this.zzac = z2;
        this.zzad = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzdgk);
        SafeParcelWriter.writeString(parcel, 2, this.zzdgl, false);
        SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        SafeParcelWriter.writeByteArray(parcel, 4, this.data, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zzdgi, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzdgj, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzac);
        SafeParcelWriter.writeLong(parcel, 8, this.zzad);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
