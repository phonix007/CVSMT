package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@zzark
@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
public final class zzty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzty> CREATOR = new zztz();
    @Nullable
    @SafeParcelable.Field(mo8233id = 2)
    public final String url;
    @SafeParcelable.Field(mo8233id = 3)
    private final long zzbzv;
    @SafeParcelable.Field(mo8233id = 4)
    private final String zzbzw;
    @SafeParcelable.Field(mo8233id = 5)
    private final String zzbzx;
    @SafeParcelable.Field(mo8233id = 6)
    private final String zzbzy;
    @SafeParcelable.Field(mo8233id = 7)
    private final Bundle zzbzz;
    @SafeParcelable.Field(mo8233id = 8)
    public final boolean zzcaa;
    @SafeParcelable.Field(mo8233id = 9)
    public long zzcab;

    @Nullable
    public static zzty zzbb(String str) {
        return zzd(Uri.parse(str));
    }

    @Nullable
    public static zzty zzd(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzaxz.zzeo(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(ImagesContract.URL);
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : zzbv.zzlh().zzh(uri)) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new zzty(queryParameter, j, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e) {
            zzaxz.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @SafeParcelable.Constructor
    zzty(@Nullable @SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) long j, @SafeParcelable.Param(mo8236id = 4) String str2, @SafeParcelable.Param(mo8236id = 5) String str3, @SafeParcelable.Param(mo8236id = 6) String str4, @SafeParcelable.Param(mo8236id = 7) Bundle bundle, @SafeParcelable.Param(mo8236id = 8) boolean z, @SafeParcelable.Param(mo8236id = 9) long j2) {
        this.url = str;
        this.zzbzv = j;
        this.zzbzw = str2 == null ? BuildConfig.FLAVOR : str2;
        this.zzbzx = str3 == null ? BuildConfig.FLAVOR : str3;
        this.zzbzy = str4 == null ? BuildConfig.FLAVOR : str4;
        this.zzbzz = bundle == null ? new Bundle() : bundle;
        this.zzcaa = z;
        this.zzcab = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.url, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzbzv);
        SafeParcelWriter.writeString(parcel, 4, this.zzbzw, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbzx, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbzy, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.zzbzz, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzcaa);
        SafeParcelWriter.writeLong(parcel, 9, this.zzcab);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
