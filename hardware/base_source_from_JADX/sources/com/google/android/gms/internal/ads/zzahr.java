package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzahr extends zzxm {
    private final String zzboa;
    private boolean zzboq;
    private final zzagi zzdhg;
    @Nullable
    private zzal zzdhl;
    private final zzahj zzdhx;

    @VisibleForTesting
    private zzahr(String str, zzagi zzagi) {
        this.zzboa = str;
        this.zzdhg = zzagi;
        this.zzdhx = new zzahj();
        zzbv.zzlt().zza(zzagi);
    }

    public final void setUserId(String str) {
    }

    public final void zzap(String str) {
    }

    public zzahr(Context context, String str, zzalg zzalg, zzbbi zzbbi, zzv zzv) {
        this(str, new zzagi(context, zzalg, zzbbi, zzv));
    }

    @Nullable
    public final IObjectWrapper zzie() throws RemoteException {
        if (this.zzdhl != null) {
            return this.zzdhl.zzie();
        }
        return null;
    }

    public final void destroy() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.destroy();
        }
    }

    public final boolean isReady() throws RemoteException {
        return this.zzdhl != null && this.zzdhl.isReady();
    }

    public final boolean zzb(zzwb zzwb) throws RemoteException {
        if (!zzahm.zzh(zzwb).contains("gw")) {
            abort();
        }
        if (zzahm.zzh(zzwb).contains("_skipMediation")) {
            abort();
        }
        if (zzwb.zzcji != null) {
            abort();
        }
        if (this.zzdhl != null) {
            return this.zzdhl.zzb(zzwb);
        }
        zzahm zzlt = zzbv.zzlt();
        if (zzahm.zzh(zzwb).contains("_ad")) {
            zzlt.zzb(zzwb, this.zzboa);
        }
        zzahp zza = zzlt.zza(zzwb, this.zzboa);
        if (zza != null) {
            if (!zza.zzblw) {
                zza.load();
                zzahq.zzto().zzts();
            } else {
                zzahq.zzto().zztr();
            }
            this.zzdhl = zza.zzdhl;
            zza.zzdhn.zza(this.zzdhx);
            this.zzdhx.zzd(this.zzdhl);
            return zza.zzdhp;
        }
        abort();
        zzahq.zzto().zzts();
        return this.zzdhl.zzb(zzwb);
    }

    public final void pause() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.pause();
        }
    }

    public final void resume() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.resume();
        }
    }

    public final void zza(zzxa zzxa) throws RemoteException {
        this.zzdhx.zzbnn = zzxa;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final void zza(zzavb zzavb) {
        this.zzdhx.zzdhb = zzavb;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final void zza(zzxt zzxt) throws RemoteException {
        this.zzdhx.zzdgy = zzxt;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final void zza(zzxq zzxq) throws RemoteException {
        this.zzdhx.zzdgx = zzxq;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final Bundle getAdMetadata() throws RemoteException {
        if (this.zzdhl != null) {
            return this.zzdhl.getAdMetadata();
        }
        return new Bundle();
    }

    public final void showInterstitial() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.setImmersiveMode(this.zzboq);
            this.zzdhl.showInterstitial();
            return;
        }
        zzaxz.zzeo("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.stopLoading();
        }
    }

    public final void zzih() throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.zzih();
        } else {
            zzaxz.zzeo("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Nullable
    public final zzwf zzif() throws RemoteException {
        if (this.zzdhl != null) {
            return this.zzdhl.zzif();
        }
        return null;
    }

    public final void zza(zzwf zzwf) throws RemoteException {
        if (this.zzdhl != null) {
            this.zzdhl.zza(zzwf);
        }
    }

    public final void zza(zzaow zzaow) throws RemoteException {
        zzaxz.zzeo("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzapc zzapc, String str) throws RemoteException {
        zzaxz.zzeo("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Nullable
    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzdhl != null) {
            return this.zzdhl.getMediationAdapterClassName();
        }
        return null;
    }

    @Nullable
    public final String zzje() throws RemoteException {
        if (this.zzdhl != null) {
            return this.zzdhl.zzje();
        }
        return null;
    }

    public final void zza(zzabg zzabg) throws RemoteException {
        this.zzdhx.zzdgz = zzabg;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final void zza(zzwx zzwx) throws RemoteException {
        this.zzdhx.zzdha = zzwx;
        if (this.zzdhl != null) {
            this.zzdhx.zzd(this.zzdhl);
        }
    }

    public final void zza(zzxz zzxz) throws RemoteException {
        abort();
        if (this.zzdhl != null) {
            this.zzdhl.zza(zzxz);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        abort();
        if (this.zzdhl != null) {
            this.zzdhl.setManualImpressionsEnabled(z);
        }
    }

    public final boolean isLoading() throws RemoteException {
        return this.zzdhl != null && this.zzdhl.isLoading();
    }

    public final zzyp getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final zzxt zzir() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzxa zzis() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(zzzw zzzw) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void zza(zzyv zzyv) {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        this.zzboq = z;
    }

    @VisibleForTesting
    private final void abort() {
        if (this.zzdhl == null) {
            this.zzdhl = this.zzdhg.zzbx(this.zzboa);
            this.zzdhx.zzd(this.zzdhl);
        }
    }
}
