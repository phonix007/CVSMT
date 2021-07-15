package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzark
public final class zzamd extends zzalk {
    private final MediationAdapter zzdnx;
    private zzame zzdny;

    public zzamd(@NonNull MediationAdapter mediationAdapter) {
        this.zzdnx = mediationAdapter;
    }

    public final IObjectWrapper zzut() throws RemoteException {
        if (!(this.zzdnx instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) this.zzdnx).getBannerView());
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwf zzwf, zzwb zzwb, String str, zzalm zzalm) throws RemoteException {
        zza(iObjectWrapper, zzwf, zzwb, str, (String) null, zzalm);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwf zzwf, zzwb zzwb, String str, String str2, zzalm zzalm) throws RemoteException {
        Date date;
        zzwf zzwf2 = zzwf;
        zzwb zzwb2 = zzwb;
        if (!(this.zzdnx instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdnx;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.zzcjd != null ? new HashSet(zzwb2.zzcjd) : null;
            if (zzwb2.zzcjb == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.zzcjb);
            }
            zzamc zzamc = new zzamc(date, zzwb2.zzcjc, hashSet, zzwb2.zzcjj, zzm(zzwb), zzwb2.zzcjf, zzwb2.zzcjq);
            if (zzwb2.zzcjl != null) {
                bundle = zzwb2.zzcjl.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzame(zzalm), zza(str, zzwb2, str2), zzc.zza(zzwf2.width, zzwf2.height, zzwf2.zzckk), zzamc, bundle);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final Bundle zzuw() {
        if (this.zzdnx instanceof zzbix) {
            return ((zzbix) this.zzdnx).zzuw();
        }
        String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
        zzbbd.zzeo(valueOf.length() != 0 ? "Not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("Not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwb zzwb, String str, zzalm zzalm) throws RemoteException {
        zza(iObjectWrapper, zzwb, str, (String) null, zzalm);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwb zzwb, String str, String str2, zzalm zzalm) throws RemoteException {
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.zzdnx instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdnx;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.zzcjd != null ? new HashSet(zzwb2.zzcjd) : null;
            if (zzwb2.zzcjb == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.zzcjb);
            }
            zzamc zzamc = new zzamc(date, zzwb2.zzcjc, hashSet, zzwb2.zzcjj, zzm(zzwb), zzwb2.zzcjf, zzwb2.zzcjq);
            if (zzwb2.zzcjl != null) {
                bundle = zzwb2.zzcjl.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzame(zzalm), zza(str, zzwb2, str2), zzamc, bundle);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        if (this.zzdnx instanceof zzbiy) {
            return ((zzbiy) this.zzdnx).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
        zzbbd.zzeo(valueOf.length() != 0 ? "Not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwb zzwb, String str, String str2, zzalm zzalm, zzacp zzacp, List<String> list) throws RemoteException {
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.zzdnx instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationNativeAdapter: ".concat(valueOf) : new String("Not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.zzdnx;
            Bundle bundle = null;
            HashSet hashSet = zzwb2.zzcjd != null ? new HashSet(zzwb2.zzcjd) : null;
            if (zzwb2.zzcjb == -1) {
                date = null;
            } else {
                date = new Date(zzwb2.zzcjb);
            }
            zzamh zzamh = new zzamh(date, zzwb2.zzcjc, hashSet, zzwb2.zzcjj, zzm(zzwb), zzwb2.zzcjf, zzacp, list, zzwb2.zzcjq);
            if (zzwb2.zzcjl != null) {
                bundle = zzwb2.zzcjl.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.zzdny = new zzame(zzalm);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdny, zza(str, zzwb2, str2), zzamh, bundle);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final Bundle zzux() {
        return new Bundle();
    }

    public final zzals zzuu() {
        NativeAdMapper zzvd = this.zzdny.zzvd();
        if (zzvd instanceof NativeAppInstallAdMapper) {
            return new zzamf((NativeAppInstallAdMapper) zzvd);
        }
        return null;
    }

    public final zzaly zzva() {
        UnifiedNativeAdMapper zzve = this.zzdny.zzve();
        if (zzve != null) {
            return new zzamx(zzve);
        }
        return null;
    }

    public final zzalv zzuv() {
        NativeAdMapper zzvd = this.zzdny.zzvd();
        if (zzvd instanceof NativeContentAdMapper) {
            return new zzamg((NativeContentAdMapper) zzvd);
        }
        return null;
    }

    public final zzadx zzuz() {
        NativeCustomTemplateAd zzvf = this.zzdny.zzvf();
        if (zzvf instanceof zzaea) {
            return ((zzaea) zzvf).zzsx();
        }
        return null;
    }

    public final boolean zzuy() {
        return this.zzdnx instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzwb zzwb, String str, zzavz zzavz, String str2) throws RemoteException {
        Bundle bundle;
        zzamc zzamc;
        Date date;
        zzwb zzwb2 = zzwb;
        if (!(this.zzdnx instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdnx;
            Bundle zza = zza(str2, zzwb2, (String) null);
            if (zzwb2 != null) {
                HashSet hashSet = zzwb2.zzcjd != null ? new HashSet(zzwb2.zzcjd) : null;
                if (zzwb2.zzcjb == -1) {
                    date = null;
                } else {
                    date = new Date(zzwb2.zzcjb);
                }
                zzamc zzamc2 = new zzamc(date, zzwb2.zzcjc, hashSet, zzwb2.zzcjj, zzm(zzwb), zzwb2.zzcjf, zzwb2.zzcjq);
                bundle = zzwb2.zzcjl != null ? zzwb2.zzcjl.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                zzamc = zzamc2;
            } else {
                zzamc = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzamc, str, new zzawc(zzavz), zza, bundle);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzavz zzavz, List<String> list) throws RemoteException {
        if (!(this.zzdnx instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdnx;
            ArrayList arrayList = new ArrayList();
            for (String zza : list) {
                arrayList.add(zza(zza, (zzwb) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzawc(zzavz), arrayList);
        } catch (Throwable th) {
            zzbbd.zzc("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    public final void zzc(zzwb zzwb, String str) throws RemoteException {
        zza(zzwb, str, (String) null);
    }

    public final void zza(zzwb zzwb, String str, String str2) throws RemoteException {
        Date date;
        if (!(this.zzdnx instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdnx;
            Bundle bundle = null;
            HashSet hashSet = zzwb.zzcjd != null ? new HashSet(zzwb.zzcjd) : null;
            if (zzwb.zzcjb == -1) {
                date = null;
            } else {
                date = new Date(zzwb.zzcjb);
            }
            zzamc zzamc = new zzamc(date, zzwb.zzcjc, hashSet, zzwb.zzcjj, zzm(zzwb), zzwb.zzcjf, zzwb.zzcjq);
            if (zzwb.zzcjl != null) {
                bundle = zzwb.zzcjl.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
            }
            mediationRewardedVideoAdAdapter.loadAd(zzamc, zza(str, zzwb, str2), bundle);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        if (!(this.zzdnx instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.zzdnx).showVideo();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        if (!(this.zzdnx instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("Not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.zzdnx).isInitialized();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        if (!(this.zzdnx instanceof OnImmersiveModeUpdatedListener)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzen(valueOf.length() != 0 ? "Not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("Not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) this.zzdnx).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
        }
    }

    public final zzyp getVideoController() {
        if (!(this.zzdnx instanceof zzb)) {
            return null;
        }
        try {
            return ((zzb) this.zzdnx).getVideoController();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (!(this.zzdnx instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.zzdnx.getClass().getCanonicalName());
            zzbbd.zzeo(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzdn("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdnx).showInterstitial();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void destroy() throws RemoteException {
        try {
            this.zzdnx.onDestroy();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void pause() throws RemoteException {
        try {
            this.zzdnx.onPause();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void resume() throws RemoteException {
        try {
            this.zzdnx.onResume();
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (this.zzdnx instanceof OnContextChangedListener) {
            ((OnContextChangedListener) this.zzdnx).onContextChanged(context);
        }
    }

    private final Bundle zza(String str, zzwb zzwb, String str2) throws RemoteException {
        Bundle bundle;
        String valueOf = String.valueOf(str);
        zzbbd.zzeo(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } else {
                bundle = bundle2;
            }
            if (this.zzdnx instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzwb != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzwb.zzcjf);
                }
            }
            return bundle;
        } catch (Throwable th) {
            zzbbd.zzb(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    private static boolean zzm(zzwb zzwb) {
        if (zzwb.zzcje) {
            return true;
        }
        zzwu.zzpv();
        return zzbat.zzaaq();
    }
}
