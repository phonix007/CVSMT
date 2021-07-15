package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
@ParametersAreNonnullByDefault
public final class zzabn implements View.OnClickListener {
    private final zzaqp zzbqa;
    /* access modifiers changed from: private */
    @Nullable
    public zzaet zzdai;
    @Nullable
    private zzu zzdaj;
    @Nullable
    @VisibleForTesting
    String zzdak;
    @Nullable
    @VisibleForTesting
    Long zzdal;
    @Nullable
    @VisibleForTesting
    WeakReference<View> zzdam;

    public zzabn(zzaqp zzaqp) {
        this.zzbqa = zzaqp;
    }

    public final void zza(zzaet zzaet) {
        this.zzdai = zzaet;
        if (this.zzdaj != null) {
            this.zzbqa.zzb("/unconfirmedClick", this.zzdaj);
        }
        this.zzdaj = new zzabo(this);
        this.zzbqa.zza("/unconfirmedClick", this.zzdaj);
    }

    @Nullable
    public final zzaet zzrt() {
        return this.zzdai;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzdai != null && this.zzdal != null) {
            zzru();
            try {
                this.zzdai.onUnconfirmedClickCancelled();
            } catch (RemoteException e) {
                zzbbd.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.zzdam != null && this.zzdam.get() == view) {
            if (!(this.zzdak == null || this.zzdal == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.zzdak);
                    jSONObject.put("time_interval", zzbv.zzlm().currentTimeMillis() - this.zzdal.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.zzbqa.zza("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    zzaxz.zzb("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            zzru();
        }
    }

    private final void zzru() {
        this.zzdak = null;
        this.zzdal = null;
        if (this.zzdam != null) {
            View view = (View) this.zzdam.get();
            this.zzdam = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener((View.OnClickListener) null);
            }
        }
    }
}
