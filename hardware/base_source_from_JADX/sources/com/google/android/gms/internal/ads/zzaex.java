package com.google.android.gms.internal.ads;

public abstract class zzaex extends zzex implements zzaew {
    public zzaex() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x0154;
                case 3: goto L_0x0149;
                case 4: goto L_0x013e;
                case 5: goto L_0x0133;
                case 6: goto L_0x0128;
                case 7: goto L_0x011d;
                case 8: goto L_0x0112;
                case 9: goto L_0x0107;
                case 10: goto L_0x00fc;
                case 11: goto L_0x00f1;
                case 12: goto L_0x00e5;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00ad;
                case 17: goto L_0x009d;
                case 18: goto L_0x0091;
                case 19: goto L_0x0085;
                case 20: goto L_0x0079;
                case 21: goto L_0x0055;
                case 22: goto L_0x004d;
                case 23: goto L_0x0041;
                case 24: goto L_0x0035;
                case 25: goto L_0x0025;
                case 26: goto L_0x0015;
                case 27: goto L_0x000d;
                case 28: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.recordCustomClickGesture()
            r3.writeNoException()
            goto L_0x015e
        L_0x000d:
            r0.zzsi()
            r3.writeNoException()
            goto L_0x015e
        L_0x0015:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzyh r1 = com.google.android.gms.internal.ads.zzyi.zze(r1)
            r0.zza((com.google.android.gms.internal.ads.zzyh) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0025:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzyl r1 = com.google.android.gms.internal.ads.zzym.zzf(r1)
            r0.zza((com.google.android.gms.internal.ads.zzyl) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0035:
            boolean r1 = r0.isCustomMuteThisAdEnabled()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.writeBoolean(r3, r1)
            goto L_0x015e
        L_0x0041:
            java.util.List r1 = r0.getMuteThisAdReasons()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x015e
        L_0x004d:
            r0.cancelUnconfirmedClick()
            r3.writeNoException()
            goto L_0x015e
        L_0x0055:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x005d
            r1 = 0
            goto L_0x0071
        L_0x005d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzaet
            if (r4 == 0) goto L_0x006b
            r1 = r2
            com.google.android.gms.internal.ads.zzaet r1 = (com.google.android.gms.internal.ads.zzaet) r1
            goto L_0x0071
        L_0x006b:
            com.google.android.gms.internal.ads.zzaev r2 = new com.google.android.gms.internal.ads.zzaev
            r2.<init>(r1)
            r1 = r2
        L_0x0071:
            r0.zza((com.google.android.gms.internal.ads.zzaet) r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x0079:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zzb(r3, r1)
            goto L_0x015e
        L_0x0085:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzsd()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x0091:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzsc()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x009d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.reportTouchEvent(r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x00ad:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.recordImpression(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.writeBoolean(r3, r1)
            goto L_0x015e
        L_0x00c1:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.performClick(r1)
            r3.writeNoException()
            goto L_0x015e
        L_0x00d1:
            com.google.android.gms.internal.ads.zzacx r1 = r0.zzse()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x00dd:
            r0.destroy()
            r3.writeNoException()
            goto L_0x015e
        L_0x00e5:
            java.lang.String r1 = r0.getMediationAdapterClassName()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x00f1:
            com.google.android.gms.internal.ads.zzyp r1 = r0.getVideoController()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x00fc:
            java.lang.String r1 = r0.getPrice()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0107:
            java.lang.String r1 = r0.getStore()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0112:
            double r1 = r0.getStarRating()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x015e
        L_0x011d:
            java.lang.String r1 = r0.getAdvertiser()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0128:
            java.lang.String r1 = r0.getCallToAction()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0133:
            com.google.android.gms.internal.ads.zzadb r1 = r0.zzsb()
            r3.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x015e
        L_0x013e:
            java.lang.String r1 = r0.getBody()
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x015e
        L_0x0149:
            java.util.List r1 = r0.getImages()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x015e
        L_0x0154:
            java.lang.String r1 = r0.getHeadline()
            r3.writeNoException()
            r3.writeString(r1)
        L_0x015e:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaex.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
