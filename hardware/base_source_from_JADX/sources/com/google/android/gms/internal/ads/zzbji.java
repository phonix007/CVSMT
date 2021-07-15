package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzbji extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbji> CREATOR = new zzbjj();
    @SafeParcelable.VersionField(mo8239id = 1)
    private final int versionCode;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", mo8233id = 2, type = "byte[]")
    private zzbl zzfcw = null;
    private byte[] zzfcx;

    @SafeParcelable.Constructor
    zzbji(@SafeParcelable.Param(mo8236id = 1) int i, @SafeParcelable.Param(mo8236id = 2) byte[] bArr) {
        this.versionCode = i;
        this.zzfcx = bArr;
        zzafo();
    }

    public final zzbl zzafn() {
        if (!(this.zzfcw != null)) {
            try {
                this.zzfcw = (zzbl) zzbuz.zza(new zzbl(), this.zzfcx);
                this.zzfcx = null;
            } catch (zzbuy e) {
                throw new IllegalStateException(e);
            }
        }
        zzafo();
        return this.zzfcw;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        if (this.zzfcx != null) {
            bArr = this.zzfcx;
        } else {
            bArr = zzbuz.zzb(this.zzfcw);
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzafo() {
        if (this.zzfcw == null && this.zzfcx != null) {
            return;
        }
        if (this.zzfcw != null && this.zzfcx == null) {
            return;
        }
        if (this.zzfcw != null && this.zzfcx != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.zzfcw == null && this.zzfcx == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
