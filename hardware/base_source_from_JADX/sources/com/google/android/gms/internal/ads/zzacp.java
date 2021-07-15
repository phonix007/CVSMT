package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
public final class zzacp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzacp> CREATOR = new zzacq();
    @SafeParcelable.Field(mo8233id = 1)
    public final int versionCode;
    @SafeParcelable.Field(mo8233id = 2)
    public final boolean zzdcs;
    @SafeParcelable.Field(mo8233id = 3)
    public final int zzdct;
    @SafeParcelable.Field(mo8233id = 4)
    public final boolean zzdcu;
    @SafeParcelable.Field(mo8233id = 5)
    public final int zzdcv;
    @Nullable
    @SafeParcelable.Field(mo8233id = 6)
    public final zzzw zzdcw;
    @SafeParcelable.Field(mo8233id = 7)
    private final boolean zzdcx;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzacp(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzzw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzhz());
    }

    @SafeParcelable.Constructor
    public zzacp(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) boolean z, @SafeParcelable.Param(mo8236id = 3) int i2, @SafeParcelable.Param(mo8236id = 4) boolean z2, @SafeParcelable.Param(mo8236id = 5) int i3, @SafeParcelable.Param(mo8236id = 6) zzzw zzzw, @SafeParcelable.Param(mo8236id = 7) boolean z3) {
        this.versionCode = i;
        this.zzdcs = z;
        this.zzdct = i2;
        this.zzdcu = z2;
        this.zzdcv = i3;
        this.zzdcw = zzzw;
        this.zzdcx = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdcs);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdct);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzdcu);
        SafeParcelWriter.writeInt(parcel, 5, this.zzdcv);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdcw, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzdcx);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
