package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
@ParametersAreNonnullByDefault
public final class zzatb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatb> CREATOR = new zzatc();
    @SafeParcelable.Field(mo8233id = 3)
    private final ApplicationInfo applicationInfo;
    @SafeParcelable.Field(mo8233id = 4)
    private final String packageName;
    @SafeParcelable.Field(mo8233id = 6)
    @Nullable
    private final PackageInfo zzdwh;
    @SafeParcelable.Field(mo8233id = 5)
    private final List<String> zzdwt;
    @SafeParcelable.Field(mo8233id = 7)
    private final String zzdxc;
    @SafeParcelable.Field(mo8233id = 1)
    private final Bundle zzdzn;
    @SafeParcelable.Field(mo8233id = 2)
    private final zzbbi zzdzo;
    @SafeParcelable.Field(mo8233id = 8)
    private final boolean zzdzp;
    @SafeParcelable.Field(mo8233id = 9)
    private final String zzdzq;

    @SafeParcelable.Constructor
    public zzatb(@SafeParcelable.Param(mo8236id = 1) Bundle bundle, @SafeParcelable.Param(mo8236id = 2) zzbbi zzbbi, @SafeParcelable.Param(mo8236id = 3) ApplicationInfo applicationInfo2, @SafeParcelable.Param(mo8236id = 4) String str, @SafeParcelable.Param(mo8236id = 5) List<String> list, @SafeParcelable.Param(mo8236id = 6) @Nullable PackageInfo packageInfo, @SafeParcelable.Param(mo8236id = 7) String str2, @SafeParcelable.Param(mo8236id = 8) boolean z, @SafeParcelable.Param(mo8236id = 9) String str3) {
        this.zzdzn = bundle;
        this.zzdzo = zzbbi;
        this.packageName = str;
        this.applicationInfo = applicationInfo2;
        this.zzdwt = list;
        this.zzdwh = packageInfo;
        this.zzdxc = str2;
        this.zzdzp = z;
        this.zzdzq = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdzn, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdzo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdwt, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdwh, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdxc, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdzp);
        SafeParcelWriter.writeString(parcel, 9, this.zzdzq, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
