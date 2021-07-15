package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbi> CREATOR = new zzbbj();
    @SafeParcelable.Field(mo8233id = 2)
    public String zzdp;
    @SafeParcelable.Field(mo8233id = 3)
    public int zzeou;
    @SafeParcelable.Field(mo8233id = 4)
    public int zzeov;
    @SafeParcelable.Field(mo8233id = 5)
    public boolean zzeow;
    @SafeParcelable.Field(mo8233id = 6)
    public boolean zzeox;

    public zzbbi(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzbbi(int i, int i2, boolean z, boolean z2) {
        this(14300000, i2, true, false, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzbbi(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            int r0 = r0 + 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbi.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzbbi(@SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) int i, @SafeParcelable.Param(mo8236id = 4) int i2, @SafeParcelable.Param(mo8236id = 5) boolean z, @SafeParcelable.Param(mo8236id = 6) boolean z2) {
        this.zzdp = str;
        this.zzeou = i;
        this.zzeov = i2;
        this.zzeow = z;
        this.zzeox = z2;
    }

    public static zzbbi zzaav() {
        return new zzbbi(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdp, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzeou);
        SafeParcelWriter.writeInt(parcel, 4, this.zzeov);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzeow);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzeox);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
