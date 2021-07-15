package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@zzark
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
public class zzwf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwf> CREATOR = new zzwg();
    @SafeParcelable.Field(mo8233id = 3)
    public final int height;
    @SafeParcelable.Field(mo8233id = 4)
    public final int heightPixels;
    @SafeParcelable.Field(mo8233id = 6)
    public final int width;
    @SafeParcelable.Field(mo8233id = 7)
    public final int widthPixels;
    @SafeParcelable.Field(mo8233id = 2)
    public final String zzckk;
    @SafeParcelable.Field(mo8233id = 5)
    public final boolean zzckl;
    @SafeParcelable.Field(mo8233id = 8)
    public final zzwf[] zzckm;
    @SafeParcelable.Field(mo8233id = 9)
    public final boolean zzckn;
    @SafeParcelable.Field(mo8233id = 10)
    public final boolean zzcko;
    @SafeParcelable.Field(mo8233id = 11)
    public boolean zzckp;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzwf zzg(Context context) {
        return new zzwf("320x50_mb", 0, 0, false, 0, 0, (zzwf[]) null, true, false, false);
    }

    public static zzwf zzpo() {
        return new zzwf("reward_mb", 0, 0, true, 0, 0, (zzwf[]) null, false, false, false);
    }

    public zzwf() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzwf[]) null, false, false, false);
    }

    public zzwf(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzwf(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.zzckl = r0
            boolean r2 = r1.isFluid()
            r12.zzcko = r2
            boolean r2 = r12.zzcko
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.width = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.height = r2
            goto L_0x002f
        L_0x0023:
            int r2 = r1.getWidth()
            r12.width = r2
            int r2 = r1.getHeight()
            r12.height = r2
        L_0x002f:
            int r2 = r12.width
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r3 = r12.height
            r5 = -2
            if (r3 != r5) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzwu.zzpv()
            boolean r6 = com.google.android.gms.internal.ads.zzbat.zzbi(r13)
            if (r6 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzwu.zzpv()
            boolean r6 = com.google.android.gms.internal.ads.zzbat.zzbj(r13)
            if (r6 == 0) goto L_0x0069
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.zzwu.zzpv()
            int r7 = com.google.android.gms.internal.ads.zzbat.zzbk(r13)
            int r6 = r6 - r7
            r12.widthPixels = r6
            goto L_0x006d
        L_0x0069:
            int r6 = r5.widthPixels
            r12.widthPixels = r6
        L_0x006d:
            int r6 = r12.widthPixels
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0096
            int r8 = r8 + 1
            goto L_0x0096
        L_0x0089:
            int r8 = r12.width
            com.google.android.gms.internal.ads.zzwu.zzpv()
            int r6 = r12.width
            int r6 = com.google.android.gms.internal.ads.zzbat.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.widthPixels = r6
        L_0x0096:
            if (r3 == 0) goto L_0x009d
            int r6 = zzd(r5)
            goto L_0x009f
        L_0x009d:
            int r6 = r12.height
        L_0x009f:
            com.google.android.gms.internal.ads.zzwu.zzpv()
            int r5 = com.google.android.gms.internal.ads.zzbat.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.heightPixels = r5
            if (r2 != 0) goto L_0x00bd
            if (r3 == 0) goto L_0x00ad
            goto L_0x00bd
        L_0x00ad:
            boolean r2 = r12.zzcko
            if (r2 == 0) goto L_0x00b6
            java.lang.String r1 = "320x50_mb"
            r12.zzckk = r1
            goto L_0x00da
        L_0x00b6:
            java.lang.String r1 = r1.toString()
            r12.zzckk = r1
            goto L_0x00da
        L_0x00bd:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.zzckk = r1
        L_0x00da:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x00f4
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzwf[] r1 = new com.google.android.gms.internal.ads.zzwf[r1]
            r12.zzckm = r1
            r1 = 0
        L_0x00e3:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00f7
            com.google.android.gms.internal.ads.zzwf[] r2 = r12.zzckm
            com.google.android.gms.internal.ads.zzwf r3 = new com.google.android.gms.internal.ads.zzwf
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00e3
        L_0x00f4:
            r13 = 0
            r12.zzckm = r13
        L_0x00f7:
            r12.zzckn = r0
            r12.zzckp = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwf.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public zzwf(zzwf zzwf, zzwf[] zzwfArr) {
        this(zzwf.zzckk, zzwf.height, zzwf.heightPixels, zzwf.zzckl, zzwf.width, zzwf.widthPixels, zzwfArr, zzwf.zzckn, zzwf.zzcko, zzwf.zzckp);
    }

    @SafeParcelable.Constructor
    zzwf(@SafeParcelable.Param(mo8236id = 2) String str, @SafeParcelable.Param(mo8236id = 3) int i, @SafeParcelable.Param(mo8236id = 4) int i2, @SafeParcelable.Param(mo8236id = 5) boolean z, @SafeParcelable.Param(mo8236id = 6) int i3, @SafeParcelable.Param(mo8236id = 7) int i4, @SafeParcelable.Param(mo8236id = 8) zzwf[] zzwfArr, @SafeParcelable.Param(mo8236id = 9) boolean z2, @SafeParcelable.Param(mo8236id = 10) boolean z3, @SafeParcelable.Param(mo8236id = 11) boolean z4) {
        this.zzckk = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzckl = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzckm = zzwfArr;
        this.zzckn = z2;
        this.zzcko = z3;
        this.zzckp = z4;
    }

    public final AdSize zzpp() {
        return zzc.zza(this.width, this.height, this.zzckk);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzckk, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzckl);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzckm, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzckn);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzcko);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzckp);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
