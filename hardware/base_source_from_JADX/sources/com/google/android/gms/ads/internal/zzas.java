package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzadb;
import com.google.android.gms.internal.ads.zzadc;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzbgg;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
@ParametersAreNonnullByDefault
public final class zzas {
    @Nullable
    public static View zze(@Nullable zzaxf zzaxf) {
        if (zzaxf == null) {
            zzaxz.m31e("AdState is null");
            return null;
        } else if (zzf(zzaxf) && zzaxf.zzdrv != null) {
            return zzaxf.zzdrv.getView();
        } else {
            try {
                IObjectWrapper zzut = zzaxf.zzdnc != null ? zzaxf.zzdnc.zzut() : null;
                if (zzut != null) {
                    return (View) ObjectWrapper.unwrap(zzut);
                }
                zzaxz.zzeo("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                zzaxz.zzc("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zza(com.google.android.gms.internal.ads.zzbgg r25, com.google.android.gms.internal.ads.zzakx r26, java.util.concurrent.CountDownLatch r27) {
        /*
            r0 = r25
            r1 = r26
            r7 = r27
            r8 = 0
            android.view.View r2 = r25.getView()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "AdWebView is null"
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x0014:
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzakq r2 = r1.zzdnb     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List<java.lang.String> r2 = r2.zzdll     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0127
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r3 == 0) goto L_0x0026
            goto L_0x0127
        L_0x0026:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            com.google.android.gms.ads.internal.zzav r4 = new com.google.android.gms.ads.internal.zzav     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r0.zza((java.lang.String) r3, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.zzbgg>) r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            com.google.android.gms.ads.internal.zzaw r4 = new com.google.android.gms.ads.internal.zzaw     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r0.zza((java.lang.String) r3, (com.google.android.gms.ads.internal.gmsg.zzu<? super com.google.android.gms.internal.ads.zzbgg>) r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzalj r3 = r1.zzdnc     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzals r3 = r3.zzuu()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzalj r4 = r1.zzdnc     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzalv r4 = r4.zzuv()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = 0
            if (r5 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzabs r2 = new com.google.android.gms.internal.ads.zzabs     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r10 = r3.getHeadline()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List r11 = r3.getImages()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r12 = r3.getBody()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzadb r13 = r3.zzsb()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r14 = r3.getCallToAction()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            double r15 = r3.getStarRating()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r17 = r3.getStore()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r18 = r3.getPrice()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r19 = 0
            android.os.Bundle r20 = r3.getExtras()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r21 = 0
            com.google.android.gms.dynamic.IObjectWrapper r4 = r3.zzvc()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.dynamic.IObjectWrapper r4 = r3.zzvc()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x008c:
            r22 = r6
            com.google.android.gms.dynamic.IObjectWrapper r23 = r3.zzsd()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r24 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzakq r3 = r1.zzdnb     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r3.zzdlk     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzbhn r4 = r25.zzadl()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.ads.internal.zzat r5 = new com.google.android.gms.ads.internal.zzat     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.zza((com.google.android.gms.internal.ads.zzbho) r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0102
        L_0x00a9:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0121
            if (r4 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.zzabu r2 = new com.google.android.gms.internal.ads.zzabu     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r10 = r4.getHeadline()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.util.List r11 = r4.getImages()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r12 = r4.getBody()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzadb r13 = r4.zzsf()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r14 = r4.getCallToAction()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r15 = r4.getAdvertiser()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r16 = 0
            android.os.Bundle r17 = r4.getExtras()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r18 = 0
            com.google.android.gms.dynamic.IObjectWrapper r3 = r4.zzvc()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.dynamic.IObjectWrapper r3 = r4.zzvc()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x00e6:
            r19 = r6
            com.google.android.gms.dynamic.IObjectWrapper r20 = r4.zzsd()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r21 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzakq r3 = r1.zzdnb     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r3.zzdlk     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzbhn r4 = r25.zzadl()     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.ads.internal.zzau r5 = new com.google.android.gms.ads.internal.zzau     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            r4.zza((com.google.android.gms.internal.ads.zzbho) r5)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x0102:
            com.google.android.gms.internal.ads.zzakq r2 = r1.zzdnb     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r3 = r2.zzdli     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            com.google.android.gms.internal.ads.zzakq r1 = r1.zzdnb     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            java.lang.String r2 = r1.zzdlj     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            if (r2 == 0) goto L_0x0117
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1 = r25
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x011e
        L_0x0117:
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            r0.loadData(r3, r1, r2)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
        L_0x011e:
            r0 = 1
            r8 = 1
            goto L_0x0138
        L_0x0121:
            java.lang.String r0 = "No matching template id and mapper"
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x0127:
            java.lang.String r0 = "No template ids present in mediation response"
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)     // Catch:{ RemoteException -> 0x0132, RuntimeException -> 0x012d }
            goto L_0x0138
        L_0x012d:
            r0 = move-exception
            r27.countDown()
            throw r0
        L_0x0132:
            r0 = move-exception
            java.lang.String r1 = "Unable to invoke load assets"
            com.google.android.gms.internal.ads.zzaxz.zzc(r1, r0)
        L_0x0138:
            if (r8 != 0) goto L_0x013d
            r27.countDown()
        L_0x013d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzas.zza(com.google.android.gms.internal.ads.zzbgg, com.google.android.gms.internal.ads.zzakx, java.util.concurrent.CountDownLatch):boolean");
    }

    public static boolean zzf(@Nullable zzaxf zzaxf) {
        return (zzaxf == null || !zzaxf.zzdyd || zzaxf.zzdnb == null || zzaxf.zzdnb.zzdli == null) ? false : true;
    }

    @VisibleForTesting
    static zzu<zzbgg> zza(@Nullable zzals zzals, @Nullable zzalv zzalv, zzab zzab) {
        return new zzax(zzals, zzab, zzalv);
    }

    /* access modifiers changed from: private */
    public static void zzd(zzbgg zzbgg) {
        View.OnClickListener onClickListener = zzbgg.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(zzbgg.getView());
        }
    }

    private static JSONObject zza(@Nullable Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bundle.containsKey(next)) {
                if ("image".equals(jSONObject2.getString(next))) {
                    Object obj = bundle.get(next);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(next, zza((Bitmap) obj));
                    } else {
                        zzaxz.zzeo("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(next) instanceof Bitmap) {
                    zzaxz.zzeo("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(next, String.valueOf(bundle.get(next)));
                }
            }
        }
        return jSONObject;
    }

    @VisibleForTesting
    private static String zza(@Nullable zzadb zzadb) {
        if (zzadb == null) {
            zzaxz.zzeo("Image is null. Returning empty string");
            return BuildConfig.FLAVOR;
        }
        try {
            Uri uri = zzadb.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException unused) {
            zzaxz.zzeo("Unable to get image uri. Trying data uri next");
        }
        return zzb(zzadb);
    }

    private static String zzb(zzadb zzadb) {
        try {
            IObjectWrapper zzsa = zzadb.zzsa();
            if (zzsa == null) {
                zzaxz.zzeo("Drawable is null. Returning empty string");
                return BuildConfig.FLAVOR;
            }
            Drawable drawable = (Drawable) ObjectWrapper.unwrap(zzsa);
            if (drawable instanceof BitmapDrawable) {
                return zza(((BitmapDrawable) drawable).getBitmap());
            }
            zzaxz.zzeo("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return BuildConfig.FLAVOR;
        } catch (RemoteException unused) {
            zzaxz.zzeo("Unable to get drawable. Returning empty string");
            return BuildConfig.FLAVOR;
        }
    }

    private static String zza(@Nullable Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzaxz.zzeo("Bitmap is null. Returning empty string");
            return BuildConfig.FLAVOR;
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Nullable
    private static zzadb zzg(Object obj) {
        if (obj instanceof IBinder) {
            return zzadc.zzj((IBinder) obj);
        }
        return null;
    }

    static final /* synthetic */ void zza(zzabu zzabu, String str, zzbgg zzbgg, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", zzabu.getHeadline());
            jSONObject.put("body", zzabu.getBody());
            jSONObject.put("call_to_action", zzabu.getCallToAction());
            jSONObject.put("advertiser", zzabu.getAdvertiser());
            jSONObject.put("logo", zza(zzabu.zzsf()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = zzabu.getImages();
            if (images != null) {
                for (Object zzg : images) {
                    jSONArray.put(zza(zzg(zzg)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(zzabu.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            zzbgg.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzaxz.zzc("Exception occurred when loading assets", e);
        }
    }

    static final /* synthetic */ void zza(zzabs zzabs, String str, zzbgg zzbgg, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", zzabs.getHeadline());
            jSONObject.put("body", zzabs.getBody());
            jSONObject.put("call_to_action", zzabs.getCallToAction());
            jSONObject.put("price", zzabs.getPrice());
            jSONObject.put("star_rating", String.valueOf(zzabs.getStarRating()));
            jSONObject.put("store", zzabs.getStore());
            jSONObject.put("icon", zza(zzabs.zzsb()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = zzabs.getImages();
            if (images != null) {
                for (Object zzg : images) {
                    jSONArray.put(zza(zzg(zzg)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(zzabs.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            zzbgg.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzaxz.zzc("Exception occurred when loading assets", e);
        }
    }
}
