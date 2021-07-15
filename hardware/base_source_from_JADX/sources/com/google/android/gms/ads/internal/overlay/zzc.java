package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzark;

@zzark
@SafeParcelable.Class(creator = "AdLauncherIntentInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field(mo8233id = 9)
    public final Intent intent;
    @SafeParcelable.Field(mo8233id = 4)
    public final String mimeType;
    @SafeParcelable.Field(mo8233id = 5)
    public final String packageName;
    @SafeParcelable.Field(mo8233id = 3)
    public final String url;
    @SafeParcelable.Field(mo8233id = 2)
    private final String zzdqp;
    @SafeParcelable.Field(mo8233id = 6)
    public final String zzdqq;
    @SafeParcelable.Field(mo8233id = 7)
    public final String zzdqr;
    @SafeParcelable.Field(mo8233id = 8)
    private final String zzdqs;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public zzc(Intent intent2) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent2);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) String str2, @SafeParcelable.Param(mo8236id = 4) String str3, @SafeParcelable.Param(mo8236id = 5) String str4, @SafeParcelable.Param(mo8236id = 6) String str5, @SafeParcelable.Param(mo8236id = 7) String str6, @SafeParcelable.Param(mo8236id = 8) String str7, @SafeParcelable.Param(mo8236id = 9) Intent intent2) {
        this.zzdqp = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzdqq = str5;
        this.zzdqr = str6;
        this.zzdqs = str7;
        this.intent = intent2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdqp, false);
        SafeParcelWriter.writeString(parcel, 3, this.url, false);
        SafeParcelWriter.writeString(parcel, 4, this.mimeType, false);
        SafeParcelWriter.writeString(parcel, 5, this.packageName, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzdqq, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdqr, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdqs, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.intent, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
