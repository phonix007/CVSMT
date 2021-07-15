package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@zzark
@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
public final class zzafl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzafl> CREATOR = new zzafm();
    @SafeParcelable.Field(mo8233id = 1)
    private final String url;
    @SafeParcelable.Field(mo8233id = 2)
    private final String[] zzdgi;
    @SafeParcelable.Field(mo8233id = 3)
    private final String[] zzdgj;

    @SafeParcelable.Constructor
    zzafl(@SafeParcelable.Param(mo8236id = 1) String str, @SafeParcelable.Param(mo8236id = 2) String[] strArr, @SafeParcelable.Param(mo8236id = 3) String[] strArr2) {
        this.url = str;
        this.zzdgi = strArr;
        this.zzdgj = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzdgi, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzdgj, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzafl zzh(zzr zzr) throws zza {
        Map<String, String> headers = zzr.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry next : headers.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        return new zzafl(zzr.getUrl(), strArr, strArr2);
    }
}
