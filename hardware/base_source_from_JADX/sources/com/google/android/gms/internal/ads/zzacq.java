package com.google.android.gms.internal.ads;

import android.os.Parcelable;

public final class zzacq implements Parcelable.Creator<zzacp> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacp[i];
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r9 = r2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x000d:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x004a
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0040;
                case 3: goto L_0x003b;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x0027;
                case 7: goto L_0x0022;
                default: goto L_0x001e;
            }
        L_0x001e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto L_0x000d
        L_0x0022:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto L_0x000d
        L_0x0027:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzzw> r2 = com.google.android.gms.internal.ads.zzzw.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r9 = r1
            com.google.android.gms.internal.ads.zzzw r9 = (com.google.android.gms.internal.ads.zzzw) r9
            goto L_0x000d
        L_0x0031:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            goto L_0x000d
        L_0x0036:
            boolean r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto L_0x000d
        L_0x003b:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            goto L_0x000d
        L_0x0040:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto L_0x000d
        L_0x0045:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            goto L_0x000d
        L_0x004a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.internal.ads.zzacp r12 = new com.google.android.gms.internal.ads.zzacp
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacq.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
