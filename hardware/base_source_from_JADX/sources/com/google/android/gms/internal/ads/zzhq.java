package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class zzhq implements Parcelable.Creator<zzhp> {
    zzhq() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzhp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzhp(parcel);
    }
}
