package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class zzki implements Parcelable {
    public static final Parcelable.Creator<zzki> CREATOR = new zzkj();
    private final zza[] zzavr;

    public interface zza extends Parcelable {
    }

    public zzki(List<? extends zza> list) {
        this.zzavr = new zza[list.size()];
        list.toArray(this.zzavr);
    }

    public final int describeContents() {
        return 0;
    }

    zzki(Parcel parcel) {
        this.zzavr = new zza[parcel.readInt()];
        for (int i = 0; i < this.zzavr.length; i++) {
            this.zzavr[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
        }
    }

    public final int length() {
        return this.zzavr.length;
    }

    public final zza zzao(int i) {
        return this.zzavr[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzavr, ((zzki) obj).zzavr);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzavr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzavr.length);
        for (zza writeParcelable : this.zzavr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
