package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@zzark
@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
public final class zztv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztv> CREATOR = new zztw();
    @Nullable
    @GuardedBy("this")
    @SafeParcelable.Field(getter = "getContentFileDescriptor", mo8233id = 2)
    private ParcelFileDescriptor zzbzu;

    public zztv() {
        this((ParcelFileDescriptor) null);
    }

    @SafeParcelable.Constructor
    public zztv(@Nullable @SafeParcelable.Param(mo8236id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zzbzu = parcelFileDescriptor;
    }

    public final synchronized boolean zzoe() {
        return this.zzbzu != null;
    }

    @Nullable
    public final synchronized InputStream zzof() {
        if (this.zzbzu == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zzbzu);
        this.zzbzu = null;
        return autoCloseInputStream;
    }

    private final synchronized ParcelFileDescriptor zzog() {
        return this.zzbzu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzog(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
