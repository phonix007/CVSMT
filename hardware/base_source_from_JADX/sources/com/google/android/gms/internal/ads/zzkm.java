package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

public final class zzkm extends zzkp {
    public static final Parcelable.Creator<zzkm> CREATOR = new zzkn();
    public final String description;
    private final String zzaaa;
    public final String zzavu;

    public zzkm(String str, String str2, String str3) {
        super("COMM");
        this.zzaaa = str;
        this.description = str2;
        this.zzavu = str3;
    }

    zzkm(Parcel parcel) {
        super("COMM");
        this.zzaaa = parcel.readString();
        this.description = parcel.readString();
        this.zzavu = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzkm zzkm = (zzkm) obj;
        return zzqe.zza((Object) this.description, (Object) zzkm.description) && zzqe.zza((Object) this.zzaaa, (Object) zzkm.zzaaa) && zzqe.zza((Object) this.zzavu, (Object) zzkm.zzavu);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.zzaaa != null ? this.zzaaa.hashCode() : 0) + 527) * 31) + (this.description != null ? this.description.hashCode() : 0)) * 31;
        if (this.zzavu != null) {
            i = this.zzavu.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzze);
        parcel.writeString(this.zzaaa);
        parcel.writeString(this.zzavu);
    }
}
