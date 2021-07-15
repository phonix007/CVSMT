package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

final class zzft implements Parcelable.Creator<zzfs> {
    zzft() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzfs(parcel);
    }
}
