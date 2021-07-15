package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
public final class zzapw implements Callable<zzaxf> {
    @VisibleForTesting
    private static long zzdtd = 10;
    private final Context mContext;
    private int mErrorCode;
    private final Object mLock = new Object();
    private final zzaba zzbln;
    private final zzaqp zzbqa;
    private final zzcu zzdcf;
    private final zzaxg zzdsk;
    private final zzazs zzdte;
    /* access modifiers changed from: private */
    public final zzbb zzdtf;
    private boolean zzdtg;
    private List<String> zzdth;
    private JSONObject zzdti;
    private String zzdtj;
    @Nullable
    private String zzdtk;

    public zzapw(Context context, zzbb zzbb, zzazs zzazs, zzcu zzcu, zzaxg zzaxg, zzaba zzaba) {
        this.mContext = context;
        this.zzdtf = zzbb;
        this.zzdte = zzazs;
        this.zzdsk = zzaxg;
        this.zzdcf = zzcu;
        this.zzbln = zzaba;
        this.zzbqa = zzbb.zzkn();
        this.zzdtg = false;
        this.mErrorCode = -2;
        this.zzdth = null;
        this.zzdtj = null;
        this.zzdtk = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r3.length() != 0) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0178 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ec A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
    /* renamed from: zzwd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaxf call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.zzbb r2 = r15.zzdtf     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r11 = r2.getUuid()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r2 = r15.zzwe()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r2 != 0) goto L_0x006e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r3 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasm r3 = r3.zzehy     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = r3.zzdyb     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r4 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasm r4 = r4.zzehy     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = r4.zzdyb     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x0040
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x0037
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0038
        L_0x0037:
            r3 = r1
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x0044
        L_0x0040:
            r3 = 3
            r15.zzcs(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x0044:
            com.google.android.gms.internal.ads.zzaqp r3 = r15.zzbqa     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbcb r2 = r3.zzh(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            long r3 = zzdtd     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r8 = r2
            goto L_0x006f
        L_0x006e:
            r8 = r1
        L_0x006f:
            if (r8 == 0) goto L_0x0078
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbbq.zzm(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x007f:
            r12 = r3
            goto L_0x00af
        L_0x0081:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbbq.zzm(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x008e:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.internal.ads.zzbca r3 = com.google.android.gms.internal.ads.zzbbq.zzm(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x009f:
            com.google.android.gms.internal.ads.zzbca r4 = com.google.android.gms.internal.ads.zzbbq.zzm(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzapx r5 = new com.google.android.gms.internal.ads.zzapx     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r5.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.ads.zzbcg.zzepo     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbcb r3 = com.google.android.gms.internal.ads.zzbbq.zza(r4, r5, (java.util.concurrent.Executor) r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x007f
        L_0x00af:
            boolean r3 = r15.zzwe()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 != 0) goto L_0x016d
            if (r8 != 0) goto L_0x00b9
            goto L_0x016d
        L_0x00b9:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "instream"
            java.lang.String r5 = "type"
            java.lang.String r5 = r8.optString(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.equals(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r5 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r5 = r5.zzeag     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r5 = r5.zzbti     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 == 0) goto L_0x00dc
            com.google.android.gms.internal.ads.zzaxg r5 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r5 = r5.zzeag     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r5 = r5.zzbti     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r5 = r5.zzdcs     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x00dd
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            com.google.android.gms.internal.ads.zzaxg r6 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r6 = r6.zzeag     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r6 = r6.zzbti     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r6 == 0) goto L_0x00ee
            com.google.android.gms.internal.ads.zzaxg r6 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r6 = r6.zzeag     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacp r6 = r6.zzbti     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r6 = r6.zzdcu     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            if (r4 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzapv r3 = new com.google.android.gms.internal.ads.zzapv     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x00f8:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.zzaqq r3 = new com.google.android.gms.internal.ads.zzaqq     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r4 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.zzehx     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x010a:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.zzaqr r3 = new com.google.android.gms.internal.ads.zzaqr     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r4 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            boolean r4 = r4.zzehx     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x011c:
            java.lang.String r4 = "3"
            boolean r3 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x016a
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbcl r4 = new com.google.android.gms.internal.ads.zzbcl     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            android.os.Handler r6 = com.google.android.gms.internal.ads.zzayh.zzelc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzapz r7 = new com.google.android.gms.internal.ads.zzapz     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r7.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            long r6 = zzdtd     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.Object r3 = r4.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x0149
            com.google.android.gms.internal.ads.zzaqs r3 = new com.google.android.gms.internal.ads.zzaqs     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.<init>(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016e
        L_0x0149:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 == 0) goto L_0x0160
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x0166
        L_0x0160:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3 = r4
        L_0x0166:
            com.google.android.gms.internal.ads.zzaxz.m31e(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x016d
        L_0x016a:
            r15.zzcs(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x016d:
            r3 = r1
        L_0x016e:
            boolean r4 = r15.zzwe()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r4 != 0) goto L_0x01e7
            if (r3 == 0) goto L_0x01e7
            if (r8 != 0) goto L_0x017a
            goto L_0x01e7
        L_0x017a:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r5 != 0) goto L_0x018a
            r6 = r1
            goto L_0x01a0
        L_0x018a:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r7 = 0
        L_0x0191:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r7 >= r9) goto L_0x01a0
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            int r7 = r7 + 1
            goto L_0x0191
        L_0x01a0:
            if (r6 != 0) goto L_0x01a4
            r5 = r1
            goto L_0x01a8
        L_0x01a4:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x01a8:
            r15.zzdth = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.zzdti = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.zzdtj = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r15.zzdtk = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzacf r13 = r3.zza(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r13 != 0) goto L_0x01ce
            java.lang.String r3 = "Failed to retrieve ad assets."
            com.google.android.gms.internal.ads.zzaxz.m31e(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x01e7
        L_0x01ce:
            com.google.android.gms.internal.ads.zzach r14 = new com.google.android.gms.internal.ads.zzach     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            android.content.Context r4 = r15.mContext     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.ads.internal.zzbb r5 = r15.zzdtf     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaqp r6 = r15.zzbqa     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzcu r7 = r15.zzdcf     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaxg r3 = r15.zzdsk     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzasi r3 = r3.zzeag     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbbi r10 = r3.zzbsp     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r13.zzb(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            goto L_0x01e8
        L_0x01e7:
            r13 = r1
        L_0x01e8:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.zzabw     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            if (r3 == 0) goto L_0x01fb
            r3 = r13
            com.google.android.gms.internal.ads.zzabw r3 = (com.google.android.gms.internal.ads.zzabw) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaqa r4 = new com.google.android.gms.internal.ads.zzaqa     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzaqp r3 = r15.zzbqa     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.zza((java.lang.String) r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
        L_0x01fb:
            com.google.android.gms.internal.ads.zzaxf r2 = r15.zza((com.google.android.gms.internal.ads.zzacf) r13, (boolean) r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.ads.internal.zzbb r3 = r15.zzdtf     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            com.google.android.gms.internal.ads.zzbgg r4 = zzb(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            r3.zzg(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0217, TimeoutException -> 0x0210, Exception -> 0x0209 }
            return r2
        L_0x0209:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            com.google.android.gms.internal.ads.zzaxz.zzc(r3, r2)
            goto L_0x021d
        L_0x0210:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            com.google.android.gms.internal.ads.zzaxz.zzc(r3, r2)
            goto L_0x021d
        L_0x0217:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
            com.google.android.gms.internal.ads.zzaxz.zzc(r3, r2)
        L_0x021d:
            boolean r2 = r15.zzdtg
            if (r2 != 0) goto L_0x0224
            r15.zzcs(r0)
        L_0x0224:
            com.google.android.gms.internal.ads.zzaxf r0 = r15.zza((com.google.android.gms.internal.ads.zzacf) r1, (boolean) r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapw.call():com.google.android.gms.internal.ads.zzaxf");
    }

    private static zzbgg zzb(zzbcb<zzbgg> zzbcb) {
        try {
            return (zzbgg) zzbcb.get((long) ((Integer) zzwu.zzpz().zzd(zzaan.zzcui)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzbbd.zzc(BuildConfig.FLAVOR, e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            zzbbd.zzc(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzc(zzadx zzadx, String str) {
        try {
            zzaeh zzar = this.zzdtf.zzar(zzadx.getCustomTemplateId());
            if (zzar != null) {
                zzar.zzb(zzadx, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzaxz.zzc(sb.toString(), e);
        }
    }

    private final zzaxf zza(zzacf zzacf, boolean z) {
        int i;
        synchronized (this.mLock) {
            i = (zzacf == null && this.mErrorCode == -2) ? 0 : this.mErrorCode;
        }
        return new zzaxf(this.zzdsk.zzeag.zzdwg, (zzbgg) null, this.zzdsk.zzehy.zzdlq, i, this.zzdsk.zzehy.zzdlr, this.zzdth, this.zzdsk.zzehy.orientation, this.zzdsk.zzehy.zzdlx, this.zzdsk.zzeag.zzdwj, false, (zzakq) null, (zzalj) null, (String) null, (zzakr) null, (zzakt) null, 0, this.zzdsk.zzbst, this.zzdsk.zzehy.zzdyc, this.zzdsk.zzehn, this.zzdsk.zzeho, this.zzdsk.zzehy.zzdyi, this.zzdti, i != -2 ? null : zzacf, (zzawd) null, (List<String>) null, (List<String>) null, this.zzdsk.zzehy.zzdyu, this.zzdsk.zzehy.zzdyv, (String) null, this.zzdsk.zzehy.zzdlu, this.zzdtj, this.zzdsk.zzehw, this.zzdsk.zzehy.zzbph, this.zzdsk.zzehx, z, this.zzdsk.zzehy.zzdls, this.zzdsk.zzehy.zzbpi, this.zzdtk, this.zzdsk.zzehy.zzdzf);
    }

    public final zzbcb<zzabm> zzg(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzbbq.zzm(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.zzdsk.zzeag.zzbti == null || this.zzdsk.zzeag.zzbti.versionCode < 2) ? 1 : this.zzdsk.zzeag.zzbti.zzdcv;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<zzbcb> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        zzbcl zzbcl = new zzbcl();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (zzbcb zza : arrayList) {
            zza.zza(new zzaqd(atomicInteger, size, zzbcl, arrayList), zzayf.zzeky);
            arrayList = arrayList;
        }
        return zzbbq.zza(zzbcl, new zzaqb(this, optString, zzb2, zzb, optInt, optInt3, optInt2, i, optBoolean), (Executor) zzayf.zzeky);
    }

    private static Integer zzb(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final Future<zzabr> zza(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, optBoolean, z);
    }

    public final zzbcb<zzabr> zza(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, z, z2);
    }

    public final List<zzbcb<zzabr>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            zzh(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, false, z2));
        }
        return arrayList;
    }

    private final zzbcb<zzabr> zza(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String str;
        if (z) {
            str = jSONObject.getString(ImagesContract.URL);
        } else {
            str = jSONObject.optString(ImagesContract.URL);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(str)) {
            zzh(0, z);
            return zzbbq.zzm(null);
        } else if (z2) {
            return zzbbq.zzm(new zzabr((Drawable) null, Uri.parse(str), optDouble));
        } else {
            return this.zzdte.zza(str, new zzaqc(this, z, optDouble, optBoolean, str));
        }
    }

    public final zzbcb<zzbgg> zzc(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzbbq.zzm(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            zzaxz.zzeo("Required field 'vast_xml' is missing");
            return zzbbq.zzm(null);
        }
        zzaqf zza = zza(this.mContext, this.zzdcf, this.zzdsk, this.zzbln, this.zzdtf);
        boolean equals = "instream".equals(jSONObject.optString("type"));
        zzbcl zzbcl = new zzbcl();
        zzbcg.zzepo.execute(new zzaqg(zza, equals, optJSONObject, zzbcl));
        return zzbcl;
    }

    public final zzbcb<zzbgg> zza(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return zzbbq.zzm(null);
        }
        zzaqf zza = zza(this.mContext, this.zzdcf, this.zzdsk, this.zzbln, this.zzdtf);
        zzbcl zzbcl = new zzbcl();
        zzbcg.zzepo.execute(new zzaqh(zza, true, zzbcl, str, str2));
        return zzbcl;
    }

    private final boolean zzwe() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzdtg;
        }
        return z;
    }

    private final void zzcs(int i) {
        synchronized (this.mLock) {
            this.zzdtg = true;
            this.mErrorCode = i;
        }
    }

    public final void zzh(int i, boolean z) {
        if (z) {
            zzcs(i);
        }
    }

    static zzbgg zzc(zzbcb<zzbgg> zzbcb) {
        try {
            return (zzbgg) zzbcb.get((long) ((Integer) zzwu.zzpz().zzd(zzaan.zzcuh)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zzaxz.zzc("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            zzaxz.zzc("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static <V> List<V> zzk(List<zzbcb<V>> list) throws ExecutionException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        for (zzbcb<V> zzbcb : list) {
            Object obj = zzbcb.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    private static zzaqf zza(Context context, zzcu zzcu, zzaxg zzaxg, zzaba zzaba, zzbb zzbb) {
        return new zzaqf(context, zzcu, zzaxg, zzaba, zzbb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbcb zza(String str, Object obj) throws Exception {
        zzbv.zzlg();
        zzbgg zza = zzbgm.zza(this.mContext, zzbht.zzaey(), "native-omid", false, false, this.zzdcf, this.zzdsk.zzeag.zzbsp, this.zzbln, (zzbo) null, this.zzdtf.zzid(), this.zzdsk.zzehw);
        zzbck zzn = zzbck.zzn(zza);
        zza.zzadl().zza((zzbho) new zzapy(zzn));
        zza.loadData(str, "text/html", "UTF-8");
        return zzn;
    }
}
