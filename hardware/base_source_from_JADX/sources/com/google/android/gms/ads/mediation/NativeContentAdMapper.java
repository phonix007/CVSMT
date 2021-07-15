package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzdaw;
    private List<NativeAd.Image> zzdax;
    private String zzday;
    private String zzdba;
    private String zzdbm;
    private NativeAd.Image zzfbp;

    public final void setHeadline(String str) {
        this.zzdaw = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzdax = list;
    }

    public final void setBody(String str) {
        this.zzday = str;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzfbp = image;
    }

    public final void setCallToAction(String str) {
        this.zzdba = str;
    }

    public final void setAdvertiser(String str) {
        this.zzdbm = str;
    }

    public final String getHeadline() {
        return this.zzdaw;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzdax;
    }

    public final String getBody() {
        return this.zzday;
    }

    public final NativeAd.Image getLogo() {
        return this.zzfbp;
    }

    public final String getCallToAction() {
        return this.zzdba;
    }

    public final String getAdvertiser() {
        return this.zzdbm;
    }
}
