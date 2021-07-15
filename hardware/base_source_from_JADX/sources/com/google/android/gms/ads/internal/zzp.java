package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaba;
import com.google.android.gms.internal.ads.zzabg;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzabz;
import com.google.android.gms.internal.ads.zzacb;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzacf;
import com.google.android.gms.internal.ads.zzadb;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzalj;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzaly;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzaxg;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyp;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzp extends zzc implements zzace {
    private boolean zzbli;
    private zzaxf zzbmk;
    private boolean zzbml = false;

    public zzp(Context context, zzv zzv, zzwf zzwf, String str, zzalg zzalg, zzbbi zzbbi) {
        super(context, zzwf, str, zzalg, zzbbi, zzv);
    }

    @Nullable
    public final zzyp getVideoController() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzwb zzwb, zzaxf zzaxf, boolean z) {
        return false;
    }

    public final boolean zzb(zzwb zzwb) {
        zzwb zzwb2 = zzwb;
        if (this.zzbls.zzbtn != null && this.zzbls.zzbtn.size() == 1 && this.zzbls.zzbtn.get(0).intValue() == 2) {
            zzaxz.m31e("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzbr(0);
            return false;
        } else if (this.zzbls.zzbtm == null) {
            return super.zzb(zzwb);
        } else {
            if (zzwb2.zzcjg != this.zzbli) {
                zzwb2 = new zzwb(zzwb2.versionCode, zzwb2.zzcjb, zzwb2.extras, zzwb2.zzcjc, zzwb2.zzcjd, zzwb2.zzcje, zzwb2.zzcjf, zzwb2.zzcjg || this.zzbli, zzwb2.zzcjh, zzwb2.zzcji, zzwb2.zzcjj, zzwb2.zzcjk, zzwb2.zzcjl, zzwb2.zzcjm, zzwb2.zzcjn, zzwb2.zzcjo, zzwb2.zzcjp, zzwb2.zzcjq, (zzvv) null, zzwb2.zzcjs, zzwb2.zzcjt);
            }
            return super.zzb(zzwb2);
        }
    }

    public final void zza(zzaxg zzaxg, zzaba zzaba) {
        this.zzbmk = null;
        if (zzaxg.errorCode != -2) {
            this.zzbmk = zza(zzaxg, zzaxg.errorCode);
        } else if (!zzaxg.zzehy.zzdyd) {
            zzaxz.zzeo("partialAdState is not mediation");
            this.zzbmk = zza(zzaxg, 0);
        }
        if (this.zzbmk != null) {
            zzayh.zzelc.post(new zzq(this));
            return;
        }
        if (zzaxg.zzbst != null) {
            this.zzbls.zzbst = zzaxg.zzbst;
        }
        this.zzbls.zzbtw = 0;
        zzbw zzbw = this.zzbls;
        zzbv.zzle();
        zzbw.zzbss = zzapl.zza(this.zzbls.zzsp, this, zzaxg, this.zzbls.zzbso, (zzbgg) null, this.zzbma, this, zzaba);
    }

    private static zzaxf zza(zzaxg zzaxg, int i) {
        zzaxg zzaxg2 = zzaxg;
        return new zzaxf(zzaxg2.zzeag.zzdwg, (zzbgg) null, zzaxg2.zzehy.zzdlq, i, zzaxg2.zzehy.zzdlr, zzaxg2.zzehy.zzdyf, zzaxg2.zzehy.orientation, zzaxg2.zzehy.zzdlx, zzaxg2.zzeag.zzdwj, zzaxg2.zzehy.zzdyd, (zzakq) null, (zzalj) null, (String) null, zzaxg2.zzehj, (zzakt) null, zzaxg2.zzehy.zzdye, zzaxg2.zzbst, zzaxg2.zzehy.zzdyc, zzaxg2.zzehn, zzaxg2.zzeho, zzaxg2.zzehy.zzdyi, zzaxg2.zzehh, (zzacf) null, zzaxg2.zzehy.zzdyr, zzaxg2.zzehy.zzdys, zzaxg2.zzehy.zzdys, zzaxg2.zzehy.zzdyu, zzaxg2.zzehy.zzdyv, (String) null, zzaxg2.zzehy.zzdlu, zzaxg2.zzehy.zzdyy, zzaxg2.zzehw, zzaxg2.zzehy.zzbph, zzaxg2.zzehx, zzaxg2.zzehy.zzdzc, zzaxg2.zzehy.zzdls, zzaxg2.zzehy.zzbpi, zzaxg2.zzehy.zzdzd, zzaxg2.zzehy.zzdzf);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(@android.support.annotation.Nullable com.google.android.gms.internal.ads.zzaxf r5, com.google.android.gms.internal.ads.zzaxf r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x009c
            boolean r0 = r6.zzdyd
            r1 = 0
            if (r0 != 0) goto L_0x0016
            r4.zzbr(r1)
            java.lang.String r5 = "newState is not mediation."
            com.google.android.gms.internal.ads.zzaxz.zzeo(r5)
            return r1
        L_0x0016:
            com.google.android.gms.internal.ads.zzakq r0 = r6.zzdnb
            r2 = 1
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzakq r0 = r6.zzdnb
            boolean r0 = r0.zzuj()
            if (r0 == 0) goto L_0x006a
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r0 = r0.zzbsq
            if (r0 == 0) goto L_0x003e
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            com.google.android.gms.ads.internal.zzbx r0 = r0.zzbsq
            com.google.android.gms.internal.ads.zzazc r0 = r0.zzmm()
            java.lang.String r3 = r6.zzdyi
            r0.zzef(r3)
        L_0x003e:
            boolean r0 = super.zza((com.google.android.gms.internal.ads.zzaxf) r5, (com.google.android.gms.internal.ads.zzaxf) r6)
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r5 = 0
            goto L_0x0064
        L_0x0046:
            com.google.android.gms.ads.internal.zzbw r0 = r4.zzbls
            boolean r0 = r0.zzmj()
            if (r0 == 0) goto L_0x0058
            boolean r5 = r4.zzc(r5, r6)
            if (r5 != 0) goto L_0x0058
            r4.zzbr(r1)
            goto L_0x0044
        L_0x0058:
            com.google.android.gms.ads.internal.zzbw r5 = r4.zzbls
            boolean r5 = r5.zzmk()
            if (r5 != 0) goto L_0x0063
            super.zza((com.google.android.gms.internal.ads.zzaxf) r6, (boolean) r1)
        L_0x0063:
            r5 = 1
        L_0x0064:
            if (r5 != 0) goto L_0x0067
            return r1
        L_0x0067:
            r4.zzbml = r2
            goto L_0x007d
        L_0x006a:
            com.google.android.gms.internal.ads.zzakq r0 = r6.zzdnb
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzakq r0 = r6.zzdnb
            boolean r0 = r0.zzuk()
            if (r0 == 0) goto L_0x0093
            boolean r5 = r4.zzb(r5, r6)
            if (r5 != 0) goto L_0x007d
            return r1
        L_0x007d:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.zze(r5)
            return r2
        L_0x0093:
            r4.zzbr(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            com.google.android.gms.internal.ads.zzaxz.zzeo(r5)
            return r1
        L_0x009c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzp.zza(com.google.android.gms.internal.ads.zzaxf, com.google.android.gms.internal.ads.zzaxf):boolean");
    }

    private final boolean zzb(zzaxf zzaxf, zzaxf zzaxf2) {
        zzaxf zzaxf3 = zzaxf2;
        View view = null;
        zzd((List<String>) null);
        if (!this.zzbls.zzmj()) {
            zzaxz.zzeo("Native ad does not have custom rendering mode.");
            zzbr(0);
            return false;
        }
        try {
            zzaly zzva = zzaxf3.zzdnc != null ? zzaxf3.zzdnc.zzva() : null;
            zzals zzuu = zzaxf3.zzdnc != null ? zzaxf3.zzdnc.zzuu() : null;
            zzalv zzuv = zzaxf3.zzdnc != null ? zzaxf3.zzdnc.zzuv() : null;
            zzadx zzuz = zzaxf3.zzdnc != null ? zzaxf3.zzdnc.zzuz() : null;
            String zzc = zzc(zzaxf2);
            if (zzva != null && this.zzbls.zzbte != null) {
                String headline = zzva.getHeadline();
                List images = zzva.getImages();
                String body = zzva.getBody();
                zzadb zzsb = zzva.zzsb() != null ? zzva.zzsb() : null;
                String callToAction = zzva.getCallToAction();
                String advertiser = zzva.getAdvertiser();
                double starRating = zzva.getStarRating();
                String store = zzva.getStore();
                String price = zzva.getPrice();
                zzyp videoController = zzva.getVideoController();
                if (zzva.zzvc() != null) {
                    view = (View) ObjectWrapper.unwrap(zzva.zzvc());
                }
                zzabz zzabz = new zzabz(headline, images, body, zzsb, callToAction, advertiser, starRating, store, price, (zzabm) null, videoController, view, zzva.zzsd(), zzc, zzva.getExtras());
                zzabz.zzb((zzacd) new zzacc(this.zzbls.zzsp, (zzace) this, this.zzbls.zzbso, zzva, (zzacf) zzabz));
                zza(zzabz);
            } else if (zzuu != null && this.zzbls.zzbte != null) {
                String headline2 = zzuu.getHeadline();
                List images2 = zzuu.getImages();
                String body2 = zzuu.getBody();
                zzadb zzsb2 = zzuu.zzsb() != null ? zzuu.zzsb() : null;
                String callToAction2 = zzuu.getCallToAction();
                double starRating2 = zzuu.getStarRating();
                String store2 = zzuu.getStore();
                String price2 = zzuu.getPrice();
                zzyp videoController2 = zzuu.getVideoController();
                if (zzuu.zzvc() != null) {
                    view = (View) ObjectWrapper.unwrap(zzuu.zzvc());
                }
                zzabz zzabz2 = new zzabz(headline2, images2, body2, zzsb2, callToAction2, (String) null, starRating2, store2, price2, (zzabm) null, videoController2, view, zzuu.zzsd(), zzc, zzuu.getExtras());
                zzabz2.zzb((zzacd) new zzacc(this.zzbls.zzsp, (zzace) this, this.zzbls.zzbso, zzuu, (zzacf) zzabz2));
                zza(zzabz2);
            } else if (zzuu != null && this.zzbls.zzbtc != null) {
                String headline3 = zzuu.getHeadline();
                List images3 = zzuu.getImages();
                String body3 = zzuu.getBody();
                zzadb zzsb3 = zzuu.zzsb() != null ? zzuu.zzsb() : null;
                String callToAction3 = zzuu.getCallToAction();
                double starRating3 = zzuu.getStarRating();
                String store3 = zzuu.getStore();
                String price3 = zzuu.getPrice();
                Bundle extras = zzuu.getExtras();
                zzyp videoController3 = zzuu.getVideoController();
                if (zzuu.zzvc() != null) {
                    view = (View) ObjectWrapper.unwrap(zzuu.zzvc());
                }
                zzabs zzabs = new zzabs(headline3, images3, body3, zzsb3, callToAction3, starRating3, store3, price3, (zzabm) null, extras, videoController3, view, zzuu.zzsd(), zzc);
                zzabs.zzb((zzacd) new zzacc(this.zzbls.zzsp, (zzace) this, this.zzbls.zzbso, zzuu, (zzacf) zzabs));
                zzayh.zzelc.post(new zzs(this, zzabs));
            } else if (zzuv != null && this.zzbls.zzbte != null) {
                String headline4 = zzuv.getHeadline();
                List images4 = zzuv.getImages();
                String body4 = zzuv.getBody();
                zzadb zzsf = zzuv.zzsf() != null ? zzuv.zzsf() : null;
                String callToAction4 = zzuv.getCallToAction();
                String advertiser2 = zzuv.getAdvertiser();
                zzyp videoController4 = zzuv.getVideoController();
                if (zzuv.zzvc() != null) {
                    view = (View) ObjectWrapper.unwrap(zzuv.zzvc());
                }
                zzabz zzabz3 = new zzabz(headline4, images4, body4, zzsf, callToAction4, advertiser2, -1.0d, (String) null, (String) null, (zzabm) null, videoController4, view, zzuv.zzsd(), zzc, zzuv.getExtras());
                zzalv zzalv = zzuv;
                zzabz zzabz4 = zzabz3;
                zzabz4.zzb((zzacd) new zzacc(this.zzbls.zzsp, (zzace) this, this.zzbls.zzbso, zzalv, (zzacf) zzabz3));
                zza(zzabz4);
            } else if (zzuv != null && this.zzbls.zzbtd != null) {
                String headline5 = zzuv.getHeadline();
                List images5 = zzuv.getImages();
                String body5 = zzuv.getBody();
                zzadb zzsf2 = zzuv.zzsf() != null ? zzuv.zzsf() : null;
                String callToAction5 = zzuv.getCallToAction();
                String advertiser3 = zzuv.getAdvertiser();
                Bundle extras2 = zzuv.getExtras();
                zzyp videoController5 = zzuv.getVideoController();
                if (zzuv.zzvc() != null) {
                    view = (View) ObjectWrapper.unwrap(zzuv.zzvc());
                }
                zzabu zzabu = new zzabu(headline5, images5, body5, zzsf2, callToAction5, advertiser3, (zzabm) null, extras2, videoController5, view, zzuv.zzsd(), zzc);
                zzalv zzalv2 = zzuv;
                zzabu zzabu2 = zzabu;
                zzabu2.zzb((zzacd) new zzacc(this.zzbls.zzsp, (zzace) this, this.zzbls.zzbso, zzalv2, (zzacf) zzabu));
                zzayh.zzelc.post(new zzt(this, zzabu2));
            } else if (zzuz == null || this.zzbls.zzbth == null || this.zzbls.zzbth.get(zzuz.getCustomTemplateId()) == null) {
                zzaxz.zzeo("No matching mapper/listener for retrieved native ad template.");
                zzbr(0);
                return false;
            } else {
                zzayh.zzelc.post(new zzu(this, zzuz));
            }
            return super.zza(zzaxf, zzaxf2);
        } catch (RemoteException e) {
            zzaxz.zzd("#007 Could not call remote method.", e);
            zzbr(0);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb(@Nullable IObjectWrapper iObjectWrapper) {
        Object unwrap = iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null;
        if (unwrap instanceof zzacd) {
            ((zzacd) unwrap).zzsm();
        }
        super.zzb(this.zzbls.zzbsu, false);
    }

    private final void zza(zzabz zzabz) {
        zzayh.zzelc.post(new zzr(this, zzabz));
    }

    public final void zzi(View view) {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjl() {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjm() {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zza(zzacd zzacd) {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zzjn() {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final void zza(zzacb zzacb) {
        zzbbd.zzd("#005 Unexpected call to an abstract (unimplemented) method.", (Throwable) null);
    }

    public final boolean zzjo() {
        if (zzjr() != null) {
            return zzjr().zzdmd;
        }
        return false;
    }

    public final boolean zzjp() {
        if (zzjr() != null) {
            return zzjr().zzdme;
        }
        return false;
    }

    public final boolean zzjq() {
        if (zzjr() != null) {
            return zzjr().zzdmf;
        }
        return false;
    }

    @Nullable
    private final zzakr zzjr() {
        if (this.zzbls.zzbsu == null || !this.zzbls.zzbsu.zzdyd) {
            return null;
        }
        return this.zzbls.zzbsu.zzehj;
    }

    private final boolean zzc(zzaxf zzaxf, zzaxf zzaxf2) {
        View zze = zzas.zze(zzaxf2);
        if (zze == null) {
            return false;
        }
        View nextView = this.zzbls.zzbsq.getNextView();
        if (nextView != null) {
            if (nextView instanceof zzbgg) {
                ((zzbgg) nextView).destroy();
            }
            this.zzbls.zzbsq.removeView(nextView);
        }
        if (!zzas.zzf(zzaxf2)) {
            try {
                zzg(zze);
            } catch (Throwable th) {
                zzbv.zzlj().zza(th, "AdLoaderManager.swapBannerViews");
                zzaxz.zzc("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.zzbls.zzbsq.getChildCount() > 1) {
            this.zzbls.zzbsq.showNext();
        }
        if (zzaxf != null) {
            View nextView2 = this.zzbls.zzbsq.getNextView();
            if (nextView2 != null) {
                this.zzbls.zzbsq.removeView(nextView2);
            }
            this.zzbls.zzmi();
        }
        this.zzbls.zzbsq.setMinimumWidth(zzif().widthPixels);
        this.zzbls.zzbsq.setMinimumHeight(zzif().heightPixels);
        this.zzbls.zzbsq.requestLayout();
        this.zzbls.zzbsq.setVisibility(0);
        return true;
    }

    public final void pause() {
        if (this.zzbml) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.zzbml) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void zzd(@Nullable List<String> list) {
        Preconditions.checkMainThread("setNativeTemplates must be called on the main UI thread.");
        this.zzbls.zzbtt = list;
    }

    @Nullable
    public final zzaeh zzar(String str) {
        Preconditions.checkMainThread("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzbls.zzbtg.get(str);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzbli = z;
    }

    public final void zza(zzabg zzabg) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zze(List<Integer> list) {
        Preconditions.checkMainThread("setAllowedAdTypes must be called on the main UI thread.");
        this.zzbls.zzbtn = list;
    }

    /* access modifiers changed from: protected */
    public final void zzil() {
        super.zzil();
        zzaxf zzaxf = this.zzbls.zzbsu;
        if (zzaxf != null && zzaxf.zzdnb != null && zzaxf.zzdnb.zzuj() && this.zzbls.zzbtm != null) {
            try {
                this.zzbls.zzbtm.zza(this, ObjectWrapper.wrap(this.zzbls.zzsp));
                super.zzb(this.zzbls.zzbsu, false);
            } catch (RemoteException e) {
                zzaxz.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zziy() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.zzdnd) || this.zzbls.zzbsu.zzdnb == null || !this.zzbls.zzbsu.zzdnb.zzuk()) {
            super.zziy();
        } else {
            zzin();
        }
    }

    public final void zzjd() {
        if (this.zzbls.zzbsu == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbls.zzbsu.zzdnd) || this.zzbls.zzbsu.zzdnb == null || !this.zzbls.zzbsu.zzdnb.zzuk()) {
            super.zzjd();
        } else {
            zzim();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzjs() {
        zzb(this.zzbmk);
    }
}
