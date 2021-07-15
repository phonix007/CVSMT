package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzw> CREATOR = new zzzx();
    @SafeParcelable.Field(mo8233id = 2)
    public final boolean zzcnf;
    @SafeParcelable.Field(mo8233id = 3)
    public final boolean zzcng;
    @SafeParcelable.Field(mo8233id = 4)
    public final boolean zzcnh;

    public zzzw(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @SafeParcelable.Constructor
    public zzzw(@SafeParcelable.Param(mo8236id = 2) boolean z, @SafeParcelable.Param(mo8236id = 3) boolean z2, @SafeParcelable.Param(mo8236id = 4) boolean z3) {
        this.zzcnf = z;
        this.zzcng = z2;
        this.zzcnh = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzcnf);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzcng);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzcnh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
