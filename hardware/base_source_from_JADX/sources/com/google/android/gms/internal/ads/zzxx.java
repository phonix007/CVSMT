package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzxx extends zzex implements zzxw {
    public zzxx() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzxw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        if (queryLocalInterface instanceof zzxw) {
            return (zzxw) queryLocalInterface;
        }
        return new zzxy(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzxl createBannerAdManager = createBannerAdManager(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzwf) zzey.zza(parcel, zzwf.CREATOR), parcel.readString(), zzalh.zzu(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createBannerAdManager);
                return true;
            case 2:
                zzxl createInterstitialAdManager = createInterstitialAdManager(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzwf) zzey.zza(parcel, zzwf.CREATOR), parcel.readString(), zzalh.zzu(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createInterstitialAdManager);
                return true;
            case 3:
                zzxg createAdLoaderBuilder = createAdLoaderBuilder(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzalh.zzu(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createAdLoaderBuilder);
                return true;
            case 4:
                zzyc mobileAdsSettingsManager = getMobileAdsSettingsManager(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) mobileAdsSettingsManager);
                return true;
            case 5:
                zzadf createNativeAdViewDelegate = createNativeAdViewDelegate(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createNativeAdViewDelegate);
                return true;
            case 6:
                zzauw createRewardedVideoAd = createRewardedVideoAd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzalh.zzu(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createRewardedVideoAd);
                return true;
            case 7:
                zzaoz createInAppPurchaseManager = createInAppPurchaseManager(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createInAppPurchaseManager);
                return true;
            case 8:
                zzaop createAdOverlay = createAdOverlay(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createAdOverlay);
                return true;
            case 9:
                zzyc mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) mobileAdsSettingsManagerWithClientJarVersion);
                return true;
            case 10:
                zzxl createSearchAdManager = createSearchAdManager(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzwf) zzey.zza(parcel, zzwf.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createSearchAdManager);
                return true;
            case 11:
                zzadk createNativeAdViewHolderDelegate = createNativeAdViewHolderDelegate(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createNativeAdViewHolderDelegate);
                return true;
            case 12:
                zzauw createRewardedVideoAdSku = createRewardedVideoAdSku(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                zzey.zza(parcel2, (IInterface) createRewardedVideoAdSku);
                return true;
            default:
                return false;
        }
    }
}
