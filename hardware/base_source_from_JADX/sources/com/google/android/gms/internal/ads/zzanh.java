package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzanh extends zzex implements zzang {
    public zzanh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzang zzw(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzang) {
            return (zzang) queryLocalInterface;
        }
        return new zzani(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zzanj] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.zzamz] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.zzamy] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzamy] */
    /* JADX WARNING: type inference failed for: r1v17, types: [com.google.android.gms.internal.ads.zzanb] */
    /* JADX WARNING: type inference failed for: r1v18, types: [com.google.android.gms.internal.ads.zzana] */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.zzana] */
    /* JADX WARNING: type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.zzanf] */
    /* JADX WARNING: type inference failed for: r1v24, types: [com.google.android.gms.internal.ads.zzane] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzane] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.google.android.gms.internal.ads.zzand] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.zzanc] */
    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzanc] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
        /*
            r9 = this;
            r1 = 0
            switch(r10) {
                case 1: goto L_0x018e;
                case 2: goto L_0x0183;
                case 3: goto L_0x0178;
                case 4: goto L_0x0124;
                case 5: goto L_0x0118;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00c6;
                case 8: goto L_0x007c;
                case 9: goto L_0x0074;
                case 10: goto L_0x0064;
                case 11: goto L_0x0050;
                case 12: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0026
        L_0x0024:
            r6 = r1
            goto L_0x0039
        L_0x0026:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.zzanc
            if (r7 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzanc r1 = (com.google.android.gms.internal.ads.zzanc) r1
            goto L_0x0024
        L_0x0033:
            com.google.android.gms.internal.ads.zzand r1 = new com.google.android.gms.internal.ads.zzand
            r1.<init>(r6)
            goto L_0x0024
        L_0x0039:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzalm r7 = com.google.android.gms.internal.ads.zzaln.zzv(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzanc) r5, (com.google.android.gms.internal.ads.zzalm) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x0050:
            java.lang.String[] r1 = r11.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r0 = r11.createTypedArray(r2)
            android.os.Bundle[] r0 = (android.os.Bundle[]) r0
            r9.zza(r1, r0)
            r12.writeNoException()
            goto L_0x01da
        L_0x0064:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            r9.zzn(r0)
            r12.writeNoException()
            goto L_0x01da
        L_0x0074:
            r9.zzvk()
            r12.writeNoException()
            goto L_0x01da
        L_0x007c:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x009c
        L_0x009a:
            r6 = r1
            goto L_0x00af
        L_0x009c:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.zzane
            if (r7 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzane r1 = (com.google.android.gms.internal.ads.zzane) r1
            goto L_0x009a
        L_0x00a9:
            com.google.android.gms.internal.ads.zzanf r1 = new com.google.android.gms.internal.ads.zzanf
            r1.<init>(r6)
            goto L_0x009a
        L_0x00af:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzalm r7 = com.google.android.gms.internal.ads.zzaln.zzv(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzane) r5, (com.google.android.gms.internal.ads.zzalm) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x00c6:
            r9.showInterstitial()
            r12.writeNoException()
            goto L_0x01da
        L_0x00ce:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x00ee
        L_0x00ec:
            r6 = r1
            goto L_0x0101
        L_0x00ee:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.zzana
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzana r1 = (com.google.android.gms.internal.ads.zzana) r1
            goto L_0x00ec
        L_0x00fb:
            com.google.android.gms.internal.ads.zzanb r1 = new com.google.android.gms.internal.ads.zzanb
            r1.<init>(r6)
            goto L_0x00ec
        L_0x0101:
            android.os.IBinder r0 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzalm r7 = com.google.android.gms.internal.ads.zzaln.zzv(r0)
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (android.os.Bundle) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzana) r5, (com.google.android.gms.internal.ads.zzalm) r6)
            r12.writeNoException()
            goto L_0x01da
        L_0x0118:
            com.google.android.gms.internal.ads.zzyp r0 = r9.getVideoController()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r12, (android.os.IInterface) r0)
            goto L_0x01da
        L_0x0124:
            java.lang.String r2 = r11.readString()
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            android.os.IBinder r6 = r11.readStrongBinder()
            if (r6 != 0) goto L_0x0144
        L_0x0142:
            r6 = r1
            goto L_0x0157
        L_0x0144:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.zzamy
            if (r7 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.zzamy r1 = (com.google.android.gms.internal.ads.zzamy) r1
            goto L_0x0142
        L_0x0151:
            com.google.android.gms.internal.ads.zzamz r1 = new com.google.android.gms.internal.ads.zzamz
            r1.<init>(r6)
            goto L_0x0142
        L_0x0157:
            android.os.IBinder r1 = r11.readStrongBinder()
            com.google.android.gms.internal.ads.zzalm r7 = com.google.android.gms.internal.ads.zzaln.zzv(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r1 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzwf r8 = (com.google.android.gms.internal.ads.zzwf) r8
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r0.zza(r1, r2, r3, r4, r5, r6, r7)
            r12.writeNoException()
            goto L_0x01da
        L_0x0178:
            com.google.android.gms.internal.ads.zzans r0 = r9.zzvj()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzey.zzb(r12, r0)
            goto L_0x01da
        L_0x0183:
            com.google.android.gms.internal.ads.zzans r0 = r9.zzvi()
            r12.writeNoException()
            com.google.android.gms.internal.ads.zzey.zzb(r12, r0)
            goto L_0x01da
        L_0x018e:
            android.os.IBinder r2 = r11.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            java.lang.String r3 = r11.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzwf> r6 = com.google.android.gms.internal.ads.zzwf.CREATOR
            android.os.Parcelable r6 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r11, r6)
            com.google.android.gms.internal.ads.zzwf r6 = (com.google.android.gms.internal.ads.zzwf) r6
            android.os.IBinder r0 = r11.readStrongBinder()
            if (r0 != 0) goto L_0x01ba
        L_0x01b8:
            r7 = r1
            goto L_0x01cd
        L_0x01ba:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r7 = r1 instanceof com.google.android.gms.internal.ads.zzanj
            if (r7 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.zzanj r1 = (com.google.android.gms.internal.ads.zzanj) r1
            goto L_0x01b8
        L_0x01c7:
            com.google.android.gms.internal.ads.zzank r1 = new com.google.android.gms.internal.ads.zzank
            r1.<init>(r0)
            goto L_0x01b8
        L_0x01cd:
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r0.zza((com.google.android.gms.dynamic.IObjectWrapper) r1, (java.lang.String) r2, (android.os.Bundle) r3, (android.os.Bundle) r4, (com.google.android.gms.internal.ads.zzwf) r5, (com.google.android.gms.internal.ads.zzanj) r6)
            r12.writeNoException()
        L_0x01da:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanh.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
