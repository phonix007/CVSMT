package com.google.android.gms.internal.ads;

import android.os.Parcelable;

public final class zzasn implements Parcelable.Creator<zzasm> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzasm[i];
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r63) {
        /*
            r62 = this;
            r0 = r63
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r63)
            r2 = 0
            r4 = 0
            r5 = 0
            r13 = r2
            r16 = r13
            r19 = r16
            r23 = r19
            r8 = r5
            r9 = r8
            r10 = r9
            r12 = r10
            r18 = r12
            r22 = r18
            r25 = r22
            r27 = r25
            r28 = r27
            r34 = r28
            r35 = r34
            r36 = r35
            r39 = r36
            r40 = r39
            r41 = r40
            r43 = r41
            r45 = r43
            r46 = r45
            r48 = r46
            r49 = r48
            r50 = r49
            r53 = r50
            r57 = r53
            r59 = r57
            r60 = r59
            r7 = 0
            r11 = 0
            r15 = 0
            r21 = 0
            r26 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r37 = 0
            r38 = 0
            r42 = 0
            r44 = 0
            r47 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r61 = 0
        L_0x0068:
            int r2 = r63.dataPosition()
            if (r2 >= r1) goto L_0x01b4
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r63)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x01ae;
                case 2: goto L_0x01a8;
                case 3: goto L_0x01a2;
                case 4: goto L_0x019c;
                case 5: goto L_0x0196;
                case 6: goto L_0x0190;
                case 7: goto L_0x018a;
                case 8: goto L_0x0184;
                case 9: goto L_0x017e;
                case 10: goto L_0x0178;
                case 11: goto L_0x0172;
                case 12: goto L_0x016c;
                case 13: goto L_0x0166;
                case 14: goto L_0x0160;
                case 15: goto L_0x015a;
                case 16: goto L_0x0079;
                case 17: goto L_0x0079;
                case 18: goto L_0x0154;
                case 19: goto L_0x014e;
                case 20: goto L_0x0079;
                case 21: goto L_0x0148;
                case 22: goto L_0x0142;
                case 23: goto L_0x013c;
                case 24: goto L_0x0136;
                case 25: goto L_0x0130;
                case 26: goto L_0x012a;
                case 27: goto L_0x0079;
                case 28: goto L_0x011e;
                case 29: goto L_0x0118;
                case 30: goto L_0x0112;
                case 31: goto L_0x010c;
                case 32: goto L_0x0106;
                case 33: goto L_0x00fa;
                case 34: goto L_0x00f4;
                case 35: goto L_0x00ee;
                case 36: goto L_0x00e8;
                case 37: goto L_0x00dd;
                case 38: goto L_0x00d8;
                case 39: goto L_0x00d3;
                case 40: goto L_0x00ce;
                case 41: goto L_0x0079;
                case 42: goto L_0x00c9;
                case 43: goto L_0x00c4;
                case 44: goto L_0x00b9;
                case 45: goto L_0x00b4;
                case 46: goto L_0x00af;
                case 47: goto L_0x00aa;
                case 48: goto L_0x00a5;
                case 49: goto L_0x00a0;
                case 50: goto L_0x009b;
                case 51: goto L_0x0096;
                case 52: goto L_0x0091;
                case 53: goto L_0x008c;
                case 54: goto L_0x0087;
                case 55: goto L_0x0082;
                case 56: goto L_0x007d;
                default: goto L_0x0079;
            }
        L_0x0079:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x0068
        L_0x007d:
            boolean r61 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0082:
            java.lang.String r60 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x0087:
            java.lang.String r59 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x008c:
            boolean r58 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0091:
            java.util.ArrayList r57 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x0096:
            boolean r56 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x009b:
            int r55 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0068
        L_0x00a0:
            boolean r54 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00a5:
            android.os.Bundle r53 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x0068
        L_0x00aa:
            boolean r52 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00af:
            boolean r51 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00b4:
            java.lang.String r50 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x00b9:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawo> r3 = com.google.android.gms.internal.ads.zzawo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r49 = r2
            com.google.android.gms.internal.ads.zzawo r49 = (com.google.android.gms.internal.ads.zzawo) r49
            goto L_0x0068
        L_0x00c4:
            java.lang.String r48 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x00c9:
            boolean r47 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00ce:
            java.util.ArrayList r46 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x00d3:
            java.lang.String r45 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x00d8:
            boolean r44 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00dd:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzaso> r3 = com.google.android.gms.internal.ads.zzaso.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r43 = r2
            com.google.android.gms.internal.ads.zzaso r43 = (com.google.android.gms.internal.ads.zzaso) r43
            goto L_0x0068
        L_0x00e8:
            boolean r42 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x00ee:
            java.util.ArrayList r41 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x00f4:
            java.util.ArrayList r40 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x00fa:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawd> r3 = com.google.android.gms.internal.ads.zzawd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r39 = r2
            com.google.android.gms.internal.ads.zzawd r39 = (com.google.android.gms.internal.ads.zzawd) r39
            goto L_0x0068
        L_0x0106:
            boolean r38 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x010c:
            boolean r37 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0112:
            java.lang.String r36 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x0118:
            java.lang.String r35 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x011e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasy> r3 = com.google.android.gms.internal.ads.zzasy.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r34 = r2
            com.google.android.gms.internal.ads.zzasy r34 = (com.google.android.gms.internal.ads.zzasy) r34
            goto L_0x0068
        L_0x012a:
            boolean r33 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0130:
            boolean r32 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0136:
            boolean r31 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x013c:
            boolean r30 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0142:
            boolean r29 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x0148:
            java.lang.String r28 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x014e:
            java.lang.String r27 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x0154:
            boolean r26 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x015a:
            java.lang.String r25 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x0160:
            long r23 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0068
        L_0x0166:
            java.lang.String r22 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x016c:
            int r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0068
        L_0x0172:
            long r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0068
        L_0x0178:
            java.util.ArrayList r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x017e:
            long r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0068
        L_0x0184:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x0068
        L_0x018a:
            long r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r0, r2)
            goto L_0x0068
        L_0x0190:
            java.util.ArrayList r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x0196:
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0068
        L_0x019c:
            java.util.ArrayList r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x0068
        L_0x01a2:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x01a8:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x0068
        L_0x01ae:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x0068
        L_0x01b4:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r16, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasn.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
