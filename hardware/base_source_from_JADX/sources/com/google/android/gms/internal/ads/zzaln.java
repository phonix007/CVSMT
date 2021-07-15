package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaln extends zzex implements zzalm {
    public zzaln() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzalm zzv(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzalm) {
            return (zzalm) queryLocalInterface;
        }
        return new zzalo(iBinder);
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
                case 1: goto L_0x0080;
                case 2: goto L_0x007c;
                case 3: goto L_0x0074;
                case 4: goto L_0x0070;
                case 5: goto L_0x006c;
                case 6: goto L_0x0068;
                case 7: goto L_0x0048;
                case 8: goto L_0x0044;
                case 9: goto L_0x0038;
                case 10: goto L_0x0028;
                case 11: goto L_0x0024;
                case 12: goto L_0x001c;
                case 13: goto L_0x0017;
                case 14: goto L_0x000a;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.onVideoPause()
            goto L_0x0083
        L_0x000a:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzawd> r1 = com.google.android.gms.internal.ads.zzawd.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzey.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzawd r1 = (com.google.android.gms.internal.ads.zzawd) r1
            r0.zzc(r1)
            goto L_0x0083
        L_0x0017:
            r0.zzul()
            goto L_0x0083
        L_0x001c:
            java.lang.String r1 = r2.readString()
            r0.zzcl(r1)
            goto L_0x0083
        L_0x0024:
            r0.onVideoEnd()
            goto L_0x0083
        L_0x0028:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzadx r1 = com.google.android.gms.internal.ads.zzady.zzm(r1)
            java.lang.String r2 = r2.readString()
            r0.zzb(r1, r2)
            goto L_0x0083
        L_0x0038:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.onAppEvent(r1, r2)
            goto L_0x0083
        L_0x0044:
            r0.onAdImpression()
            goto L_0x0083
        L_0x0048:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0050
            r1 = 0
            goto L_0x0064
        L_0x0050:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzalp
            if (r4 == 0) goto L_0x005e
            r1 = r2
            com.google.android.gms.internal.ads.zzalp r1 = (com.google.android.gms.internal.ads.zzalp) r1
            goto L_0x0064
        L_0x005e:
            com.google.android.gms.internal.ads.zzalr r2 = new com.google.android.gms.internal.ads.zzalr
            r2.<init>(r1)
            r1 = r2
        L_0x0064:
            r0.zza(r1)
            goto L_0x0083
        L_0x0068:
            r0.onAdLoaded()
            goto L_0x0083
        L_0x006c:
            r0.onAdOpened()
            goto L_0x0083
        L_0x0070:
            r0.onAdLeftApplication()
            goto L_0x0083
        L_0x0074:
            int r1 = r2.readInt()
            r0.onAdFailedToLoad(r1)
            goto L_0x0083
        L_0x007c:
            r0.onAdClosed()
            goto L_0x0083
        L_0x0080:
            r0.onAdClicked()
        L_0x0083:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaln.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
