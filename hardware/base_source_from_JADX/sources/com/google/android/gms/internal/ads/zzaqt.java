package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.gmsg.zzy;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import org.json.JSONObject;

@zzark
public final class zzaqt implements zzaqp<zzbgg> {
    private final Context mContext;
    private final zzbbi zzbpt;
    /* access modifiers changed from: private */
    public String zzbqb;
    private final zzcu zzdcf;
    private final zzbb zzdug;
    private zzbcb<zzbgg> zzduv;
    private final zzaa zzduw = new zzaa(this.mContext);
    private final zzaci zzdux;

    public zzaqt(Context context, zzbb zzbb, String str, zzcu zzcu, zzbbi zzbbi) {
        zzaxz.zzen("Webview loading for native ads.");
        this.mContext = context;
        this.zzdug = zzbb;
        this.zzdcf = zzcu;
        this.zzbpt = zzbbi;
        this.zzbqb = str;
        zzbv.zzlg();
        zzbcb<zzbgg> zza = zzbgm.zza(this.mContext, this.zzbpt, (String) zzwu.zzpz().zzd(zzaan.zzcud), this.zzdcf, this.zzdug.zzid());
        this.zzdux = new zzaci(zzbb, str);
        this.zzduv = zzbbq.zza(zza, new zzaqu(this), zzbcg.zzepp);
        zzbbo.zza(this.zzduv, "WebViewNativeAdsUtil.constructor");
    }

    public final zzbcb<JSONObject> zzh(JSONObject jSONObject) {
        return zzbbq.zza(this.zzduv, new zzaqv(this, jSONObject), zzbcg.zzepo);
    }

    public final zzbcb<JSONObject> zzi(JSONObject jSONObject) {
        return zzbbq.zza(this.zzduv, new zzaqw(this, jSONObject), zzbcg.zzepo);
    }

    public final zzbcb<JSONObject> zzj(JSONObject jSONObject) {
        return zzbbq.zza(this.zzduv, new zzaqx(this, jSONObject), zzbcg.zzepo);
    }

    public final zzbcb<JSONObject> zzk(JSONObject jSONObject) {
        return zzbbq.zza(this.zzduv, new zzaqy(this, jSONObject), zzbcg.zzepo);
    }

    public final void zza(String str, zzu<? super zzbgg> zzu) {
        zzbbq.zza(this.zzduv, new zzara(this, str, zzu), zzbcg.zzepo);
    }

    public final void zzb(String str, zzu<? super zzbgg> zzu) {
        zzbbq.zza(this.zzduv, new zzarb(this, str, zzu), zzbcg.zzepo);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzbbq.zza(this.zzduv, new zzarc(this, str, jSONObject), zzbcg.zzepo);
    }

    public final void zzug() {
        zzbbq.zza(this.zzduv, new zzard(this), zzbcg.zzepo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zza(JSONObject jSONObject, zzbgg zzbgg) throws Exception {
        jSONObject.put("ads_id", this.zzbqb);
        zzbgg.zzb("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return zzbbq.zzm(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zzb(JSONObject jSONObject, zzbgg zzbgg) throws Exception {
        jSONObject.put("ads_id", this.zzbqb);
        zzbgg.zzb("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return zzbbq.zzm(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zzc(JSONObject jSONObject, zzbgg zzbgg) throws Exception {
        jSONObject.put("ads_id", this.zzbqb);
        zzbgg.zzb("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return zzbbq.zzm(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zzd(JSONObject jSONObject, zzbgg zzbgg) throws Exception {
        jSONObject.put("ads_id", this.zzbqb);
        zzbcl zzbcl = new zzbcl();
        zzbgg.zza("/nativeAdPreProcess", (zzu<? super zzbgg>) new zzaqz(this, zzbgg, zzbcl));
        zzbgg.zzb("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return zzbcl;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zzh(zzbgg zzbgg) throws Exception {
        zzaxz.zzen("Javascript has loaded for native ads.");
        zzbgg.zzadl().zza(this.zzdug, this.zzdug, this.zzdug, this.zzdug, this.zzdug, false, (zzy) null, new zzw(this.mContext, (zzawr) null, (zzaso) null), (zzaol) null, (zzawr) null);
        zzbgg.zza("/logScionEvent", (zzu<? super zzbgg>) this.zzduw);
        zzbgg.zza("/logScionEvent", (zzu<? super zzbgg>) this.zzdux);
        return zzbbq.zzm(zzbgg);
    }
}
