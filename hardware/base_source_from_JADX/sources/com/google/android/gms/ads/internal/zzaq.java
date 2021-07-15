package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzark;

@zzark
@SafeParcelable.Class(creator = "InterstitialAdParameterParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    @SafeParcelable.Field(mo8233id = 2)
    public final boolean zzbpa;
    @SafeParcelable.Field(mo8233id = 3)
    public final boolean zzbpb;
    @SafeParcelable.Field(mo8233id = 4)
    private final String zzbpc;
    @SafeParcelable.Field(mo8233id = 5)
    public final boolean zzbpd;
    @SafeParcelable.Field(mo8233id = 6)
    public final float zzbpe;
    @SafeParcelable.Field(mo8233id = 7)
    public final int zzbpf;
    @SafeParcelable.Field(mo8233id = 8)
    public final boolean zzbpg;
    @SafeParcelable.Field(mo8233id = 9)
    public final boolean zzbph;
    @SafeParcelable.Field(mo8233id = 10)
    public final boolean zzbpi;

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, i, z4, z5, z6);
    }

    @SafeParcelable.Constructor
    zzaq(@SafeParcelable.Param(mo8236id = 2) boolean z, @SafeParcelable.Param(mo8236id = 3) boolean z2, @SafeParcelable.Param(mo8236id = 4) String str, @SafeParcelable.Param(mo8236id = 5) boolean z3, @SafeParcelable.Param(mo8236id = 6) float f, @SafeParcelable.Param(mo8236id = 7) int i, @SafeParcelable.Param(mo8236id = 8) boolean z4, @SafeParcelable.Param(mo8236id = 9) boolean z5, @SafeParcelable.Param(mo8236id = 10) boolean z6) {
        this.zzbpa = z;
        this.zzbpb = z2;
        this.zzbpc = str;
        this.zzbpd = z3;
        this.zzbpe = f;
        this.zzbpf = i;
        this.zzbpg = z4;
        this.zzbph = z5;
        this.zzbpi = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzbpa);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbpb);
        SafeParcelWriter.writeString(parcel, 4, this.zzbpc, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbpd);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzbpe);
        SafeParcelWriter.writeInt(parcel, 7, this.zzbpf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzbpg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbph);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzbpi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
