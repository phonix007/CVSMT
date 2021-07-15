package com.google.android.gms.internal.ads;

import android.location.Location;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzark
public final class zzatv {
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0838 A[Catch:{ JSONException -> 0x0975 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x083b A[Catch:{ JSONException -> 0x0975 }] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject zza(android.content.Context r22, com.google.android.gms.internal.ads.zzato r23) {
        /*
            r1 = r23
            com.google.android.gms.internal.ads.zzasi r2 = r1.zzeag
            android.location.Location r3 = r1.zzcjj
            com.google.android.gms.internal.ads.zzatz r4 = r1.zzeah
            android.os.Bundle r5 = r1.zzdwm
            org.json.JSONObject r6 = r1.zzeai
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x0975 }
            r8.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "extra_caps"
            com.google.android.gms.internal.ads.zzaac<java.lang.String> r10 = com.google.android.gms.internal.ads.zzaan.zzcty     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r11 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r10 = r11.zzd(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            java.util.List<java.lang.String> r9 = r1.zzdwt     // Catch:{ JSONException -> 0x0975 }
            int r9 = r9.size()     // Catch:{ JSONException -> 0x0975 }
            if (r9 <= 0) goto L_0x0035
            java.lang.String r9 = "eid"
            java.lang.String r10 = ","
            java.util.List<java.lang.String> r11 = r1.zzdwt     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = android.text.TextUtils.join(r10, r11)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0035:
            android.os.Bundle r9 = r2.zzdwf     // Catch:{ JSONException -> 0x0975 }
            if (r9 == 0) goto L_0x0040
            java.lang.String r9 = "ad_pos"
            android.os.Bundle r10 = r2.zzdwf     // Catch:{ JSONException -> 0x0975 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0040:
            com.google.android.gms.internal.ads.zzwb r9 = r2.zzdwg     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaxu.zzyy()     // Catch:{ JSONException -> 0x0975 }
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "yyyyMMdd"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ JSONException -> 0x0975 }
            r10.<init>(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            long r11 = r9.zzcjb     // Catch:{ JSONException -> 0x0975 }
            r13 = -1
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0066
            java.lang.String r11 = "cust_age"
            java.util.Date r12 = new java.util.Date     // Catch:{ JSONException -> 0x0975 }
            long r13 = r9.zzcjb     // Catch:{ JSONException -> 0x0975 }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = r10.format(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0066:
            android.os.Bundle r10 = r9.extras     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x0071
            java.lang.String r10 = "extras"
            android.os.Bundle r11 = r9.extras     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x0975 }
        L_0x0071:
            int r10 = r9.zzcjc     // Catch:{ JSONException -> 0x0975 }
            r11 = -1
            if (r10 == r11) goto L_0x0081
            java.lang.String r10 = "cust_gender"
            int r12 = r9.zzcjc     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x0975 }
        L_0x0081:
            java.util.List<java.lang.String> r10 = r9.zzcjd     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x008c
            java.lang.String r10 = "kw"
            java.util.List<java.lang.String> r12 = r9.zzcjd     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x0975 }
        L_0x008c:
            int r10 = r9.zzcjf     // Catch:{ JSONException -> 0x0975 }
            if (r10 == r11) goto L_0x009b
            java.lang.String r10 = "tag_for_child_directed_treatment"
            int r12 = r9.zzcjf     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x0975 }
        L_0x009b:
            boolean r10 = r9.zzcje     // Catch:{ JSONException -> 0x0975 }
            r12 = 1
            if (r10 == 0) goto L_0x00a9
            java.lang.String r10 = "test_request"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r13)     // Catch:{ JSONException -> 0x0975 }
        L_0x00a9:
            int r10 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r13 = 2
            if (r10 < r13) goto L_0x00ca
            boolean r10 = r9.zzcjg     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x00bb
            java.lang.String r10 = "d_imp_hdr"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x0975 }
        L_0x00bb:
            java.lang.String r10 = r9.zzcjh     // Catch:{ JSONException -> 0x0975 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ JSONException -> 0x0975 }
            if (r10 != 0) goto L_0x00ca
            java.lang.String r10 = "ppid"
            java.lang.String r14 = r9.zzcjh     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x0975 }
        L_0x00ca:
            int r10 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r14 = 3
            if (r10 < r14) goto L_0x00da
            java.lang.String r10 = r9.zzcjk     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x00da
            java.lang.String r10 = "url"
            java.lang.String r14 = r9.zzcjk     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x0975 }
        L_0x00da:
            int r10 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r14 = 5
            if (r10 < r14) goto L_0x0100
            android.os.Bundle r10 = r9.zzcjm     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x00ea
            java.lang.String r10 = "custom_targeting"
            android.os.Bundle r15 = r9.zzcjm     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x0975 }
        L_0x00ea:
            java.util.List<java.lang.String> r10 = r9.zzcjn     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x00f5
            java.lang.String r10 = "category_exclusions"
            java.util.List<java.lang.String> r15 = r9.zzcjn     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x0975 }
        L_0x00f5:
            java.lang.String r10 = r9.zzcjo     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x0100
            java.lang.String r10 = "request_agent"
            java.lang.String r15 = r9.zzcjo     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x0975 }
        L_0x0100:
            int r10 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r15 = 6
            if (r10 < r15) goto L_0x0110
            java.lang.String r10 = r9.zzcjp     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x0110
            java.lang.String r10 = "request_pkg"
            java.lang.String r7 = r9.zzcjp     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x0110:
            int r7 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r10 = 7
            if (r7 < r10) goto L_0x0120
            java.lang.String r7 = "is_designed_for_families"
            boolean r10 = r9.zzcjq     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0120:
            int r7 = r9.versionCode     // Catch:{ JSONException -> 0x0975 }
            r10 = 8
            if (r7 < r10) goto L_0x0140
            int r7 = r9.zzcjs     // Catch:{ JSONException -> 0x0975 }
            if (r7 == r11) goto L_0x0135
            java.lang.String r7 = "tag_for_under_age_of_consent"
            int r10 = r9.zzcjs     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0135:
            java.lang.String r7 = r9.zzcjt     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x0140
            java.lang.String r7 = "max_ad_content_rating"
            java.lang.String r9 = r9.zzcjt     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x0975 }
        L_0x0140:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf[] r7 = r7.zzckm     // Catch:{ JSONException -> 0x0975 }
            if (r7 != 0) goto L_0x015d
            java.lang.String r7 = "format"
            com.google.android.gms.internal.ads.zzwf r10 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = r10.zzckk     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            boolean r7 = r7.zzcko     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x0193
            java.lang.String r7 = "fluid"
            java.lang.String r10 = "height"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0193
        L_0x015d:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf[] r7 = r7.zzckm     // Catch:{ JSONException -> 0x0975 }
            int r10 = r7.length     // Catch:{ JSONException -> 0x0975 }
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x0167:
            if (r15 >= r10) goto L_0x0193
            r14 = r7[r15]     // Catch:{ JSONException -> 0x0975 }
            boolean r12 = r14.zzcko     // Catch:{ JSONException -> 0x0975 }
            if (r12 != 0) goto L_0x017a
            if (r17 != 0) goto L_0x017a
            java.lang.String r12 = "format"
            java.lang.String r13 = r14.zzckk     // Catch:{ JSONException -> 0x0975 }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            r17 = 1
        L_0x017a:
            boolean r12 = r14.zzcko     // Catch:{ JSONException -> 0x0975 }
            if (r12 == 0) goto L_0x0189
            if (r18 != 0) goto L_0x0189
            java.lang.String r12 = "fluid"
            java.lang.String r13 = "height"
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            r18 = 1
        L_0x0189:
            if (r17 == 0) goto L_0x018d
            if (r18 != 0) goto L_0x0193
        L_0x018d:
            int r15 = r15 + 1
            r12 = 1
            r13 = 2
            r14 = 5
            goto L_0x0167
        L_0x0193:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            int r7 = r7.width     // Catch:{ JSONException -> 0x0975 }
            if (r7 != r11) goto L_0x01a0
            java.lang.String r7 = "smart_w"
            java.lang.String r10 = "full"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x01a0:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            int r7 = r7.height     // Catch:{ JSONException -> 0x0975 }
            r10 = -2
            if (r7 != r10) goto L_0x01ae
            java.lang.String r7 = "smart_h"
            java.lang.String r12 = "auto"
            r8.put(r7, r12)     // Catch:{ JSONException -> 0x0975 }
        L_0x01ae:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf[] r7 = r7.zzckm     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x021c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0975 }
            r7.<init>()     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf r12 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzwf[] r12 = r12.zzckm     // Catch:{ JSONException -> 0x0975 }
            int r13 = r12.length     // Catch:{ JSONException -> 0x0975 }
            r14 = 0
            r15 = 0
        L_0x01c0:
            if (r14 >= r13) goto L_0x0202
            r9 = r12[r14]     // Catch:{ JSONException -> 0x0975 }
            boolean r10 = r9.zzcko     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x01ca
            r15 = 1
            goto L_0x01fd
        L_0x01ca:
            int r10 = r7.length()     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x01d5
            java.lang.String r10 = "|"
            r7.append(r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x01d5:
            int r10 = r9.width     // Catch:{ JSONException -> 0x0975 }
            if (r10 != r11) goto L_0x01e1
            int r10 = r9.widthPixels     // Catch:{ JSONException -> 0x0975 }
            float r10 = (float) r10     // Catch:{ JSONException -> 0x0975 }
            float r11 = r4.zzbwv     // Catch:{ JSONException -> 0x0975 }
            float r10 = r10 / r11
            int r10 = (int) r10     // Catch:{ JSONException -> 0x0975 }
            goto L_0x01e3
        L_0x01e1:
            int r10 = r9.width     // Catch:{ JSONException -> 0x0975 }
        L_0x01e3:
            r7.append(r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ JSONException -> 0x0975 }
            int r10 = r9.height     // Catch:{ JSONException -> 0x0975 }
            r11 = -2
            if (r10 != r11) goto L_0x01f8
            int r9 = r9.heightPixels     // Catch:{ JSONException -> 0x0975 }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x0975 }
            float r10 = r4.zzbwv     // Catch:{ JSONException -> 0x0975 }
            float r9 = r9 / r10
            int r9 = (int) r9     // Catch:{ JSONException -> 0x0975 }
            goto L_0x01fa
        L_0x01f8:
            int r9 = r9.height     // Catch:{ JSONException -> 0x0975 }
        L_0x01fa:
            r7.append(r9)     // Catch:{ JSONException -> 0x0975 }
        L_0x01fd:
            int r14 = r14 + 1
            r10 = -2
            r11 = -1
            goto L_0x01c0
        L_0x0202:
            if (r15 == 0) goto L_0x0217
            int r9 = r7.length()     // Catch:{ JSONException -> 0x0975 }
            if (r9 == 0) goto L_0x0211
            java.lang.String r9 = "|"
            r10 = 0
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0212
        L_0x0211:
            r10 = 0
        L_0x0212:
            java.lang.String r9 = "320x50"
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x0975 }
        L_0x0217:
            java.lang.String r9 = "sz"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x021c:
            int r7 = r2.zzdwl     // Catch:{ JSONException -> 0x0975 }
            r9 = 24
            if (r7 == 0) goto L_0x029e
            java.lang.String r7 = "native_version"
            int r10 = r2.zzdwl     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "native_templates"
            java.util.List<java.lang.String> r10 = r2.zzbtt     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "native_image_orientation"
            com.google.android.gms.internal.ads.zzacp r10 = r2.zzbti     // Catch:{ JSONException -> 0x0975 }
            if (r10 != 0) goto L_0x023d
            java.lang.String r10 = "any"
            goto L_0x024d
        L_0x023d:
            int r10 = r10.zzdct     // Catch:{ JSONException -> 0x0975 }
            switch(r10) {
                case 0: goto L_0x024b;
                case 1: goto L_0x0248;
                case 2: goto L_0x0245;
                default: goto L_0x0242;
            }     // Catch:{ JSONException -> 0x0975 }
        L_0x0242:
            java.lang.String r10 = "not_set"
            goto L_0x024d
        L_0x0245:
            java.lang.String r10 = "landscape"
            goto L_0x024d
        L_0x0248:
            java.lang.String r10 = "portrait"
            goto L_0x024d
        L_0x024b:
            java.lang.String r10 = "any"
        L_0x024d:
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "native_multiple_images"
            com.google.android.gms.internal.ads.zzacp r10 = r2.zzbti     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x025c
            boolean r10 = r10.zzdcu     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x025c
            r10 = 1
            goto L_0x025d
        L_0x025c:
            r10 = 0
        L_0x025d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.util.List<java.lang.String> r7 = r2.zzdwu     // Catch:{ JSONException -> 0x0975 }
            boolean r7 = r7.isEmpty()     // Catch:{ JSONException -> 0x0975 }
            if (r7 != 0) goto L_0x0273
            java.lang.String r7 = "native_custom_templates"
            java.util.List<java.lang.String> r10 = r2.zzdwu     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0273:
            int r7 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            if (r7 < r9) goto L_0x0282
            java.lang.String r7 = "max_num_ads"
            int r10 = r2.zzdxq     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x0282:
            java.lang.String r7 = r2.zzdxo     // Catch:{ JSONException -> 0x0975 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0975 }
            if (r7 != 0) goto L_0x029e
            java.lang.String r7 = "native_advanced_settings"
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0297 }
            java.lang.String r11 = r2.zzdxo     // Catch:{ JSONException -> 0x0297 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x0297 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0297 }
            goto L_0x029e
        L_0x0297:
            r0 = move-exception
            r7 = r0
            java.lang.String r10 = "Problem creating json from native advanced settings"
            com.google.android.gms.internal.ads.zzaxz.zzc(r10, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x029e:
            java.util.List<java.lang.Integer> r7 = r2.zzbtn     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x02df
            java.util.List<java.lang.Integer> r7 = r2.zzbtn     // Catch:{ JSONException -> 0x0975 }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x0975 }
            if (r7 <= 0) goto L_0x02df
            java.util.List<java.lang.Integer> r7 = r2.zzbtn     // Catch:{ JSONException -> 0x0975 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x0975 }
        L_0x02b0:
            boolean r10 = r7.hasNext()     // Catch:{ JSONException -> 0x0975 }
            if (r10 == 0) goto L_0x02df
            java.lang.Object r10 = r7.next()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ JSONException -> 0x0975 }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x0975 }
            r12 = 2
            if (r11 != r12) goto L_0x02ce
            java.lang.String r10 = "iba"
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x02b0
        L_0x02ce:
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x0975 }
            r11 = 1
            if (r10 != r11) goto L_0x02b0
            java.lang.String r10 = "ina"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x02b0
        L_0x02df:
            com.google.android.gms.internal.ads.zzwf r7 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            boolean r7 = r7.zzckp     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x02ef
            java.lang.String r7 = "ene"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x0975 }
        L_0x02ef:
            com.google.android.gms.internal.ads.zzyv r7 = r2.zzbtl     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x030a
            java.lang.String r7 = "is_icon_ad"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "icon_ad_expansion_behavior"
            com.google.android.gms.internal.ads.zzyv r10 = r2.zzbtl     // Catch:{ JSONException -> 0x0975 }
            int r10 = r10.zzcly     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x030a:
            com.google.android.gms.internal.ads.zzafz r7 = r2.zzbtk     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x034a
            java.lang.String r7 = "ia_var"
            com.google.android.gms.internal.ads.zzafz r10 = r2.zzbtk     // Catch:{ JSONException -> 0x0975 }
            int r11 = r10.zzdgp     // Catch:{ JSONException -> 0x0975 }
            switch(r11) {
                case 1: goto L_0x031d;
                case 2: goto L_0x031a;
                default: goto L_0x0317;
            }     // Catch:{ JSONException -> 0x0975 }
        L_0x0317:
            int r10 = r10.zzdgp     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0320
        L_0x031a:
            java.lang.String r10 = "p"
            goto L_0x033d
        L_0x031d:
            java.lang.String r10 = "l"
            goto L_0x033d
        L_0x0320:
            r11 = 52
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0975 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "Instream ad video aspect ratio "
            r12.append(r11)     // Catch:{ JSONException -> 0x0975 }
            r12.append(r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = " is wrong."
            r12.append(r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = r12.toString()     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzbbd.m31e(r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "l"
        L_0x033d:
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "instr"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x0975 }
        L_0x034a:
            java.lang.String r7 = "slotname"
            java.lang.String r10 = r2.zzbsn     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "pn"
            android.content.pm.ApplicationInfo r10 = r2.applicationInfo     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = r10.packageName     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            android.content.pm.PackageInfo r7 = r2.zzdwh     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x036b
            java.lang.String r7 = "vc"
            android.content.pm.PackageInfo r10 = r2.zzdwh     // Catch:{ JSONException -> 0x0975 }
            int r10 = r10.versionCode     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x036b:
            java.lang.String r7 = "ms"
            java.lang.String r10 = r1.zzdwi     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "seq_num"
            java.lang.String r10 = r2.zzdwj     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "session_id"
            java.lang.String r10 = r2.zzclm     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "js"
            com.google.android.gms.internal.ads.zzbbi r10 = r2.zzbsp     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = r10.zzdp     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r7 = r2.zzdxg     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r10 = r1.zzeac     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "am"
            int r12 = r4.zzecp     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "cog"
            boolean r12 = r4.zzecq     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r12 = zzag(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "coh"
            boolean r12 = r4.zzecr     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r12 = zzag(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = r4.zzecs     // Catch:{ JSONException -> 0x0975 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x0975 }
            if (r11 != 0) goto L_0x03bd
            java.lang.String r11 = "carrier"
            java.lang.String r12 = r4.zzecs     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
        L_0x03bd:
            java.lang.String r11 = "gl"
            java.lang.String r12 = r4.zzect     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            boolean r11 = r4.zzecu     // Catch:{ JSONException -> 0x0975 }
            if (r11 == 0) goto L_0x03d2
            java.lang.String r11 = "simulator"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
        L_0x03d2:
            java.lang.String r11 = "is_latchsky"
            boolean r12 = r4.zzecv     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x0975 }
            boolean r11 = r4.zzecw     // Catch:{ JSONException -> 0x0975 }
            if (r11 == 0) goto L_0x03ec
            java.lang.String r11 = "is_sidewinder"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x03ed
        L_0x03ec:
            r12 = 1
        L_0x03ed:
            java.lang.String r11 = "ma"
            boolean r13 = r4.zzecx     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = zzag(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "sp"
            boolean r13 = r4.zzecy     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = zzag(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "hl"
            java.lang.String r13 = r4.zzecz     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = r4.zzeda     // Catch:{ JSONException -> 0x0975 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x0975 }
            if (r11 != 0) goto L_0x0419
            java.lang.String r11 = "mv"
            java.lang.String r13 = r4.zzeda     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
        L_0x0419:
            java.lang.String r11 = "muv"
            int r13 = r4.zzedc     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            int r11 = r4.zzedd     // Catch:{ JSONException -> 0x0975 }
            r13 = -2
            if (r11 == r13) goto L_0x0434
            java.lang.String r11 = "cnt"
            int r13 = r4.zzedd     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
        L_0x0434:
            java.lang.String r11 = "gnt"
            int r13 = r4.zzede     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "pt"
            int r13 = r4.zzedf     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "rm"
            int r13 = r4.zzedg     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r11 = "riv"
            int r13 = r4.zzedh     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r11.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = "build_build"
            java.lang.String r14 = r4.zzedm     // Catch:{ JSONException -> 0x0975 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = "build_device"
            java.lang.String r14 = r4.zzedn     // Catch:{ JSONException -> 0x0975 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r13.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r14 = "is_charging"
            boolean r15 = r4.zzedj     // Catch:{ JSONException -> 0x0975 }
            r13.putBoolean(r14, r15)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r14 = "battery_level"
            r19 = r10
            double r9 = r4.zzedi     // Catch:{ JSONException -> 0x0975 }
            r13.putDouble(r14, r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "battery"
            r11.putBundle(r9, r13)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r9.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "active_network_state"
            int r13 = r4.zzedl     // Catch:{ JSONException -> 0x0975 }
            r9.putInt(r10, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "active_network_metered"
            boolean r13 = r4.zzedk     // Catch:{ JSONException -> 0x0975 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "network"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r9.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "is_browser_custom_tabs_capable"
            boolean r13 = r4.zzedo     // Catch:{ JSONException -> 0x0975 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "browser"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x0573
            java.lang.String r9 = "android_mem_info"
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r10.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = "runtime_free"
            java.lang.String r14 = "runtime_free_memory"
            r21 = r13
            r12 = -1
            long r14 = r7.getLong(r14, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ JSONException -> 0x0975 }
            r15 = r21
            r10.putString(r15, r14)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r14 = "runtime_max"
            java.lang.String r15 = "runtime_max_memory"
            long r15 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r15 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r14, r15)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r14 = "runtime_total"
            java.lang.String r15 = "runtime_total_memory"
            long r12 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = java.lang.Long.toString(r12)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r14, r12)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "web_view_count"
            java.lang.String r13 = "web_view_count"
            r14 = 0
            int r13 = r7.getInt(r13, r14)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_memory_info"
            android.os.Parcelable r7 = r7.getParcelable(r12)     // Catch:{ JSONException -> 0x0975 }
            android.os.Debug$MemoryInfo r7 = (android.os.Debug.MemoryInfo) r7     // Catch:{ JSONException -> 0x0975 }
            if (r7 == 0) goto L_0x056f
            java.lang.String r12 = "debug_info_dalvik_private_dirty"
            int r13 = r7.dalvikPrivateDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_dalvik_pss"
            int r13 = r7.dalvikPss     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_dalvik_shared_dirty"
            int r13 = r7.dalvikSharedDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_native_private_dirty"
            int r13 = r7.nativePrivateDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_native_pss"
            int r13 = r7.nativePss     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_native_shared_dirty"
            int r13 = r7.nativeSharedDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_other_private_dirty"
            int r13 = r7.otherPrivateDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_other_pss"
            int r13 = r7.otherPss     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r12 = "debug_info_other_shared_dirty"
            int r7 = r7.otherSharedDirty     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ JSONException -> 0x0975 }
            r10.putString(r12, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x056f:
            r11.putBundle(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0574
        L_0x0573:
            r14 = 0
        L_0x0574:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r7.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "parental_controls"
            r10 = r19
            r7.putBundle(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = r4.zzedb     // Catch:{ JSONException -> 0x0975 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x0975 }
            if (r9 != 0) goto L_0x058f
            java.lang.String r9 = "package_version"
            java.lang.String r10 = r4.zzedb     // Catch:{ JSONException -> 0x0975 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x058f:
            java.lang.String r9 = "play_store"
            r11.putBundle(r9, r7)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "device"
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r7.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "doritos"
            java.lang.String r10 = r1.zzead     // Catch:{ JSONException -> 0x0975 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "doritos_v2"
            java.lang.String r10 = r1.zzeae     // Catch:{ JSONException -> 0x0975 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.zzaan.zzcro     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r10 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r9 = r10.zzd(r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ JSONException -> 0x0975 }
            boolean r9 = r9.booleanValue()     // Catch:{ JSONException -> 0x0975 }
            if (r9 == 0) goto L_0x05fc
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = r1.zzeaf     // Catch:{ JSONException -> 0x0975 }
            if (r9 == 0) goto L_0x05cf
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = r1.zzeaf     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = r9.getId()     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r10 = r1.zzeaf     // Catch:{ JSONException -> 0x0975 }
            boolean r10 = r10.isLimitAdTrackingEnabled()     // Catch:{ JSONException -> 0x0975 }
            goto L_0x05d1
        L_0x05cf:
            r9 = 0
            r10 = 0
        L_0x05d1:
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x0975 }
            if (r11 != 0) goto L_0x05e9
            java.lang.String r11 = "rdid"
            r7.putString(r11, r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "is_lat"
            r7.putBoolean(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "idtype"
            java.lang.String r10 = "adid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x05fc
        L_0x05e9:
            com.google.android.gms.internal.ads.zzwu.zzpv()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = com.google.android.gms.internal.ads.zzbat.zzbg(r22)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "pdid"
            r7.putString(r10, r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "pdidtype"
            java.lang.String r10 = "ssaid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
        L_0x05fc:
            java.lang.String r9 = "pii"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "platform"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r7 = "submodel"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0975 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x0975 }
            if (r3 == 0) goto L_0x0615
            zza((java.util.HashMap<java.lang.String, java.lang.Object>) r8, (android.location.Location) r3)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0629
        L_0x0615:
            com.google.android.gms.internal.ads.zzwb r3 = r2.zzdwg     // Catch:{ JSONException -> 0x0975 }
            int r3 = r3.versionCode     // Catch:{ JSONException -> 0x0975 }
            r7 = 2
            if (r3 < r7) goto L_0x0629
            com.google.android.gms.internal.ads.zzwb r3 = r2.zzdwg     // Catch:{ JSONException -> 0x0975 }
            android.location.Location r3 = r3.zzcjj     // Catch:{ JSONException -> 0x0975 }
            if (r3 == 0) goto L_0x0629
            com.google.android.gms.internal.ads.zzwb r3 = r2.zzdwg     // Catch:{ JSONException -> 0x0975 }
            android.location.Location r3 = r3.zzcjj     // Catch:{ JSONException -> 0x0975 }
            zza((java.util.HashMap<java.lang.String, java.lang.Object>) r8, (android.location.Location) r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0629:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r7 = 2
            if (r3 < r7) goto L_0x0635
            java.lang.String r3 = "quality_signals"
            android.os.Bundle r7 = r2.zzdwk     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x0635:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r7 = 4
            if (r3 < r7) goto L_0x0649
            boolean r3 = r2.zzdwn     // Catch:{ JSONException -> 0x0975 }
            if (r3 == 0) goto L_0x0649
            java.lang.String r3 = "forceHttps"
            boolean r7 = r2.zzdwn     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x0975 }
        L_0x0649:
            if (r5 == 0) goto L_0x0650
            java.lang.String r3 = "content_info"
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x0650:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r5 = 5
            if (r3 < r5) goto L_0x0677
            java.lang.String r3 = "u_sd"
            float r4 = r2.zzbwv     // Catch:{ JSONException -> 0x0975 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "sh"
            int r4 = r2.zzdwp     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "sw"
            int r4 = r2.zzdwo     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0698
        L_0x0677:
            java.lang.String r3 = "u_sd"
            float r5 = r4.zzbwv     // Catch:{ JSONException -> 0x0975 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "sh"
            int r5 = r4.zzdwp     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "sw"
            int r4 = r4.zzdwo     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x0698:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r4 = 6
            if (r3 < r4) goto L_0x06c4
            java.lang.String r3 = r2.zzdwq     // Catch:{ JSONException -> 0x0975 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r3 != 0) goto L_0x06b9
            java.lang.String r3 = "view_hierarchy"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x06b2 }
            java.lang.String r5 = r2.zzdwq     // Catch:{ JSONException -> 0x06b2 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x06b2 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x06b2 }
            goto L_0x06b9
        L_0x06b2:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "Problem serializing view hierarchy to JSON"
            com.google.android.gms.internal.ads.zzaxz.zzc(r4, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x06b9:
            java.lang.String r3 = "correlation_id"
            long r4 = r2.zzdwr     // Catch:{ JSONException -> 0x0975 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x06c4:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r4 = 7
            if (r3 < r4) goto L_0x06d0
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r2.zzdws     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x06d0:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r4 = 12
            if (r3 < r4) goto L_0x06e5
            java.lang.String r3 = r2.zzdww     // Catch:{ JSONException -> 0x0975 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r3 != 0) goto L_0x06e5
            java.lang.String r3 = "anchor"
            java.lang.String r4 = r2.zzdww     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x06e5:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r4 = 13
            if (r3 < r4) goto L_0x06f6
            java.lang.String r3 = "android_app_volume"
            float r4 = r2.zzdwx     // Catch:{ JSONException -> 0x0975 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x06f6:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r4 = 18
            if (r3 < r4) goto L_0x0707
            java.lang.String r3 = "android_app_muted"
            boolean r5 = r2.zzdxd     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x0707:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r5 = 14
            if (r3 < r5) goto L_0x071c
            int r3 = r2.zzdwy     // Catch:{ JSONException -> 0x0975 }
            if (r3 <= 0) goto L_0x071c
            java.lang.String r3 = "target_api"
            int r5 = r2.zzdwy     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x071c:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r5 = 15
            if (r3 < r5) goto L_0x0734
            java.lang.String r3 = "scroll_index"
            int r5 = r2.zzdwz     // Catch:{ JSONException -> 0x0975 }
            r7 = -1
            if (r5 != r7) goto L_0x072a
            goto L_0x072d
        L_0x072a:
            int r11 = r2.zzdwz     // Catch:{ JSONException -> 0x0975 }
            r7 = r11
        L_0x072d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x0734:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r5 = 16
            if (r3 < r5) goto L_0x0745
            java.lang.String r3 = "_activity_context"
            boolean r5 = r2.zzdxa     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x0745:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            if (r3 < r4) goto L_0x0770
            java.lang.String r3 = r2.zzdxe     // Catch:{ JSONException -> 0x0975 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r3 != 0) goto L_0x0765
            java.lang.String r3 = "app_settings"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x075e }
            java.lang.String r7 = r2.zzdxe     // Catch:{ JSONException -> 0x075e }
            r5.<init>(r7)     // Catch:{ JSONException -> 0x075e }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x075e }
            goto L_0x0765
        L_0x075e:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Problem creating json from app settings"
            com.google.android.gms.internal.ads.zzaxz.zzc(r5, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0765:
            java.lang.String r3 = "render_in_browser"
            boolean r5 = r2.zzdlv     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0975 }
        L_0x0770:
            int r3 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            if (r3 < r4) goto L_0x077f
            java.lang.String r3 = "android_num_video_cache_tasks"
            int r4 = r2.zzdxf     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0975 }
        L_0x077f:
            com.google.android.gms.internal.ads.zzbbi r3 = r2.zzbsp     // Catch:{ JSONException -> 0x0975 }
            boolean r4 = r2.zzdxr     // Catch:{ JSONException -> 0x0975 }
            boolean r1 = r1.zzeaj     // Catch:{ JSONException -> 0x0975 }
            boolean r5 = r2.zzdxt     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r7.<init>()     // Catch:{ JSONException -> 0x0975 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r9.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "cl"
            java.lang.String r11 = "220701481"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "rapid_rc"
            java.lang.String r11 = "dev"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "rapid_rollup"
            java.lang.String r11 = "HEAD"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = "build_meta"
            r7.putBundle(r10, r9)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "mf"
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.zzaan.zzcua     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r11 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r10 = r11.zzd(r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ JSONException -> 0x0975 }
            boolean r10 = r10.booleanValue()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r10 = java.lang.Boolean.toString(r10)     // Catch:{ JSONException -> 0x0975 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r9 = "instant_app"
            r7.putBoolean(r9, r4)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r4 = "lite"
            boolean r3 = r3.zzeox     // Catch:{ JSONException -> 0x0975 }
            r7.putBoolean(r4, r3)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "local_service"
            r7.putBoolean(r3, r1)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = "is_privileged_process"
            r7.putBoolean(r1, r5)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = "container_version"
            r3 = 12451009(0xbdfcc1, float:1.744758E-38)
            r7.putInt(r1, r3)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = "sdk_env"
            r8.put(r1, r7)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = "cache_state"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x0975 }
            int r1 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r3 = 19
            if (r1 < r3) goto L_0x07f9
            java.lang.String r1 = "gct"
            java.lang.String r3 = r2.zzdxh     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x07f9:
            int r1 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r3 = 21
            if (r1 < r3) goto L_0x080a
            boolean r1 = r2.zzdxi     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x080a
            java.lang.String r1 = "de"
            java.lang.String r3 = "1"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x080a:
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaan.zzcrz     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r3 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r1 = r3.zzd(r1)     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x0975 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0850
            com.google.android.gms.internal.ads.zzwf r1 = r2.zzbst     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = r1.zzckk     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "interstitial_mb"
            boolean r3 = r1.equals(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r3 != 0) goto L_0x0833
            java.lang.String r3 = "reward_mb"
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0831
            goto L_0x0833
        L_0x0831:
            r1 = 0
            goto L_0x0834
        L_0x0833:
            r1 = 1
        L_0x0834:
            android.os.Bundle r3 = r2.zzdxj     // Catch:{ JSONException -> 0x0975 }
            if (r3 == 0) goto L_0x083b
            r20 = 1
            goto L_0x083d
        L_0x083b:
            r20 = 0
        L_0x083d:
            if (r1 == 0) goto L_0x0850
            if (r20 == 0) goto L_0x0850
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x0975 }
            r1.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r4 = "interstitial_pool"
            r1.putBundle(r4, r3)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r3 = "counters"
            r8.put(r3, r1)     // Catch:{ JSONException -> 0x0975 }
        L_0x0850:
            java.lang.String r1 = r2.zzdxk     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x085b
            java.lang.String r1 = "gmp_app_id"
            java.lang.String r3 = r2.zzdxk     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x085b:
            java.lang.String r1 = r2.zzdxl     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0881
            java.lang.String r1 = "TIME_OUT"
            java.lang.String r3 = r2.zzdxl     // Catch:{ JSONException -> 0x0975 }
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0879
            java.lang.String r1 = "sai_timeout"
            com.google.android.gms.internal.ads.zzaac<java.lang.Long> r3 = com.google.android.gms.internal.ads.zzaan.zzcqu     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r4 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r3 = r4.zzd(r3)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0888
        L_0x0879:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = r2.zzdxl     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0888
        L_0x0881:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = ""
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0888:
            java.lang.String r1 = r2.zzdxm     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0893
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r3 = r2.zzdxm     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0893:
            java.lang.String r1 = r2.zzdxw     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x089e
            java.lang.String r1 = "apm_id_origin"
            java.lang.String r3 = r2.zzdxw     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x089e:
            int r1 = r2.versionCode     // Catch:{ JSONException -> 0x0975 }
            r3 = 24
            if (r1 < r3) goto L_0x08af
            java.lang.String r1 = "disable_ml"
            boolean r3 = r2.zzdxs     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x08af:
            com.google.android.gms.internal.ads.zzaac<java.lang.String> r1 = com.google.android.gms.internal.ads.zzaan.zzcpj     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r3 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r1 = r3.zzd(r1)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x08f6
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x0975 }
            if (r3 != 0) goto L_0x08f6
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r4 = com.google.android.gms.internal.ads.zzaan.zzcpk     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r5 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r4 = r5.zzd(r4)     // Catch:{ JSONException -> 0x0975 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ JSONException -> 0x0975 }
            int r4 = r4.intValue()     // Catch:{ JSONException -> 0x0975 }
            if (r3 < r4) goto L_0x08f6
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x0975 }
            r3.<init>()     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ JSONException -> 0x0975 }
            int r4 = r1.length     // Catch:{ JSONException -> 0x0975 }
        L_0x08e3:
            if (r14 >= r4) goto L_0x08f1
            r5 = r1[r14]     // Catch:{ JSONException -> 0x0975 }
            java.util.List r6 = com.google.android.gms.internal.ads.zzbar.zzeh(r5)     // Catch:{ JSONException -> 0x0975 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0975 }
            int r14 = r14 + 1
            goto L_0x08e3
        L_0x08f1:
            java.lang.String r1 = "video_decoders"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x08f6:
            com.google.android.gms.internal.ads.zzaac<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzaan.zzcwy     // Catch:{ JSONException -> 0x0975 }
            com.google.android.gms.internal.ads.zzaak r3 = com.google.android.gms.internal.ads.zzwu.zzpz()     // Catch:{ JSONException -> 0x0975 }
            java.lang.Object r1 = r3.zzd(r1)     // Catch:{ JSONException -> 0x0975 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x0975 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0917
            java.lang.String r1 = "omid_v"
            com.google.android.gms.internal.ads.zzaom r3 = com.google.android.gms.ads.internal.zzbv.zzlw()     // Catch:{ JSONException -> 0x0975 }
            r4 = r22
            java.lang.String r3 = r3.getVersion(r4)     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0917:
            java.util.ArrayList<java.lang.String> r1 = r2.zzdxu     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x092a
            java.util.ArrayList<java.lang.String> r1 = r2.zzdxu     // Catch:{ JSONException -> 0x0975 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x0975 }
            if (r1 != 0) goto L_0x092a
            java.lang.String r1 = "android_permissions"
            java.util.ArrayList<java.lang.String> r3 = r2.zzdxu     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x092a:
            java.lang.String r1 = r2.zzdxv     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0935
            java.lang.String r1 = "consent_string"
            java.lang.String r3 = r2.zzdxv     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0975 }
        L_0x0935:
            java.lang.String r1 = r2.zzdxv     // Catch:{ JSONException -> 0x0975 }
            if (r1 == 0) goto L_0x0940
            java.lang.String r1 = "iab_consent_info"
            android.os.Bundle r2 = r2.zzdxx     // Catch:{ JSONException -> 0x0975 }
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x0975 }
        L_0x0940:
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.zzaxz.isLoggable(r1)     // Catch:{ JSONException -> 0x0975 }
            if (r2 == 0) goto L_0x096c
            com.google.android.gms.internal.ads.zzayh r2 = com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ JSONException -> 0x0975 }
            org.json.JSONObject r2 = r2.zzn(r8)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ JSONException -> 0x0975 }
            java.lang.String r2 = "Ad Request JSON: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x0975 }
            int r3 = r1.length()     // Catch:{ JSONException -> 0x0975 }
            if (r3 == 0) goto L_0x0964
            java.lang.String r1 = r2.concat(r1)     // Catch:{ JSONException -> 0x0975 }
            goto L_0x0969
        L_0x0964:
            java.lang.String r1 = new java.lang.String     // Catch:{ JSONException -> 0x0975 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0975 }
        L_0x0969:
            com.google.android.gms.internal.ads.zzaxz.m30v(r1)     // Catch:{ JSONException -> 0x0975 }
        L_0x096c:
            com.google.android.gms.internal.ads.zzayh r1 = com.google.android.gms.ads.internal.zzbv.zzlf()     // Catch:{ JSONException -> 0x0975 }
            org.json.JSONObject r1 = r1.zzn(r8)     // Catch:{ JSONException -> 0x0975 }
            return r1
        L_0x0975:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Problem serializing ad request to JSON: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x098c
            java.lang.String r1 = r2.concat(r1)
            goto L_0x0991
        L_0x098c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x0991:
            com.google.android.gms.internal.ads.zzaxz.zzeo(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatv.zza(android.content.Context, com.google.android.gms.internal.ads.zzato):org.json.JSONObject");
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static Integer zzag(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7 A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167 A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0235 A[Catch:{ JSONException -> 0x0288 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0238 A[Catch:{ JSONException -> 0x0288 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzasm zza(android.content.Context r56, com.google.android.gms.internal.ads.zzasi r57, java.lang.String r58) {
        /*
            r0 = r57
            r15 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0288 }
            r1 = r58
            r10.<init>(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "ad_base_url"
            r11 = 0
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r2 = "ad_url"
            java.lang.String r4 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r2 = "ad_size"
            java.lang.String r13 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r2 = "ad_slot_size"
            java.lang.String r40 = r10.optString(r2, r13)     // Catch:{ JSONException -> 0x0288 }
            r12 = 1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.zzdwl     // Catch:{ JSONException -> 0x0288 }
            if (r2 == 0) goto L_0x002d
            r24 = 1
            goto L_0x002f
        L_0x002d:
            r24 = 0
        L_0x002f:
            java.lang.String r2 = "ad_json"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x0288 }
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = "ad_html"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x0288 }
        L_0x003d:
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "body"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x0288 }
        L_0x0045:
            if (r2 != 0) goto L_0x0053
            java.lang.String r3 = "ads"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x0288 }
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = r10.toString()     // Catch:{ JSONException -> 0x0288 }
        L_0x0053:
            java.lang.String r3 = "debug_dialog"
            java.lang.String r19 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r3 = "debug_signals"
            java.lang.String r42 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r3 = "interstitial_timeout"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x0288 }
            r8 = -1
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = "interstitial_timeout"
            double r5 = r10.getDouble(r3)     // Catch:{ JSONException -> 0x0288 }
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r16
            long r5 = (long) r5     // Catch:{ JSONException -> 0x0288 }
            r16 = r5
            goto L_0x007c
        L_0x007a:
            r16 = r8
        L_0x007c:
            java.lang.String r3 = "orientation"
            java.lang.String r3 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r5 = "portrait"
            boolean r5 = r5.equals(r3)     // Catch:{ JSONException -> 0x0288 }
            r14 = -1
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzayp r3 = com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ JSONException -> 0x0288 }
            int r3 = r3.zzzx()     // Catch:{ JSONException -> 0x0288 }
        L_0x0093:
            r18 = r3
            goto L_0x00a9
        L_0x0096:
            java.lang.String r5 = "landscape"
            boolean r3 = r5.equals(r3)     // Catch:{ JSONException -> 0x0288 }
            if (r3 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzayp r3 = com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ JSONException -> 0x0288 }
            int r3 = r3.zzzw()     // Catch:{ JSONException -> 0x0288 }
            goto L_0x0093
        L_0x00a7:
            r18 = -1
        L_0x00a9:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r3 == 0) goto L_0x00d7
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0288 }
            if (r3 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzbbi r1 = r0.zzbsp     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r3 = r1.zzdp     // Catch:{ JSONException -> 0x0288 }
            r5 = 0
            r6 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r1 = r57
            r2 = r56
            r8 = r20
            r9 = r21
            com.google.android.gms.internal.ads.zzasm r1 = com.google.android.gms.internal.ads.zzatq.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r2 = r1.zzbde     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r3 = r1.zzdyb     // Catch:{ JSONException -> 0x0288 }
            long r4 = r1.zzdyh     // Catch:{ JSONException -> 0x0288 }
            r20 = r4
            r4 = r3
            r3 = r2
            goto L_0x00dc
        L_0x00d7:
            r3 = r1
            r4 = r2
            r1 = r11
            r20 = -1
        L_0x00dc:
            if (r4 != 0) goto L_0x00e4
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ JSONException -> 0x0288 }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x0288 }
            return r0
        L_0x00e4:
            java.lang.String r2 = "click_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r1 != 0) goto L_0x00ee
            r5 = r11
            goto L_0x00f0
        L_0x00ee:
            java.util.List<java.lang.String> r5 = r1.zzdlq     // Catch:{ JSONException -> 0x0288 }
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            java.util.List r2 = zza((org.json.JSONArray) r2, (java.util.List<java.lang.String>) r5)     // Catch:{ JSONException -> 0x0288 }
            r5 = r2
        L_0x00f7:
            java.lang.String r2 = "impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r1 != 0) goto L_0x0101
            r6 = r11
            goto L_0x0103
        L_0x0101:
            java.util.List<java.lang.String> r6 = r1.zzdlr     // Catch:{ JSONException -> 0x0288 }
        L_0x0103:
            if (r2 == 0) goto L_0x010a
            java.util.List r2 = zza((org.json.JSONArray) r2, (java.util.List<java.lang.String>) r6)     // Catch:{ JSONException -> 0x0288 }
            r6 = r2
        L_0x010a:
            java.lang.String r2 = "downloaded_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r1 != 0) goto L_0x0114
            r7 = r11
            goto L_0x0116
        L_0x0114:
            java.util.List<java.lang.String> r7 = r1.zzdls     // Catch:{ JSONException -> 0x0288 }
        L_0x0116:
            if (r2 == 0) goto L_0x011f
            java.util.List r2 = zza((org.json.JSONArray) r2, (java.util.List<java.lang.String>) r7)     // Catch:{ JSONException -> 0x0288 }
            r48 = r2
            goto L_0x0121
        L_0x011f:
            r48 = r7
        L_0x0121:
            java.lang.String r2 = "manual_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r1 != 0) goto L_0x012b
            r7 = r11
            goto L_0x012d
        L_0x012b:
            java.util.List<java.lang.String> r7 = r1.zzdyf     // Catch:{ JSONException -> 0x0288 }
        L_0x012d:
            if (r2 == 0) goto L_0x0136
            java.util.List r2 = zza((org.json.JSONArray) r2, (java.util.List<java.lang.String>) r7)     // Catch:{ JSONException -> 0x0288 }
            r22 = r2
            goto L_0x0138
        L_0x0136:
            r22 = r7
        L_0x0138:
            if (r1 == 0) goto L_0x014e
            int r2 = r1.orientation     // Catch:{ JSONException -> 0x0288 }
            if (r2 == r14) goto L_0x0142
            int r2 = r1.orientation     // Catch:{ JSONException -> 0x0288 }
            r18 = r2
        L_0x0142:
            long r7 = r1.zzdyc     // Catch:{ JSONException -> 0x0288 }
            r25 = 0
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x014e
            long r1 = r1.zzdyc     // Catch:{ JSONException -> 0x0288 }
            r7 = r1
            goto L_0x0150
        L_0x014e:
            r7 = r16
        L_0x0150:
            java.lang.String r1 = "active_view"
            java.lang.String r23 = r10.optString(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "ad_is_javascript"
            boolean r25 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            if (r25 == 0) goto L_0x0167
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x0288 }
            r26 = r1
            goto L_0x0169
        L_0x0167:
            r26 = r11
        L_0x0169:
            java.lang.String r1 = "mediation"
            boolean r9 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "custom_render_allowed"
            boolean r27 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "content_url_opted_out"
            boolean r28 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r43 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "prefetch"
            boolean r29 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "refresh_interval_milliseconds"
            r55 = r13
            r12 = -1
            long r16 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r12 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "gws_query_id"
            java.lang.String r2 = ""
            java.lang.String r30 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "height"
            java.lang.String r2 = "fluid"
            java.lang.String r14 = ""
            java.lang.String r2 = r10.optString(r2, r14)     // Catch:{ JSONException -> 0x0288 }
            boolean r31 = r1.equals(r2)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "native_express"
            boolean r32 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "video_start_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x0288 }
            java.util.List r33 = zza((org.json.JSONArray) r1, (java.util.List<java.lang.String>) r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "video_complete_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x0288 }
            java.util.List r34 = zza((org.json.JSONArray) r1, (java.util.List<java.lang.String>) r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "rewards"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x0288 }
            com.google.android.gms.internal.ads.zzawd r35 = com.google.android.gms.internal.ads.zzawd.zza(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "use_displayed_impression"
            boolean r36 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "auto_protection_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x0288 }
            com.google.android.gms.internal.ads.zzaso r37 = com.google.android.gms.internal.ads.zzaso.zzl(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "set_cookie"
            java.lang.String r2 = ""
            java.lang.String r38 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "remote_ping_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x0288 }
            java.util.List r39 = zza((org.json.JSONArray) r1, (java.util.List<java.lang.String>) r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "safe_browsing"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x0288 }
            com.google.android.gms.internal.ads.zzawo r41 = com.google.android.gms.internal.ads.zzawo.zzo(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r0.zzdlv     // Catch:{ JSONException -> 0x0288 }
            boolean r44 = r10.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "custom_close_blocked"
            boolean r45 = r10.optBoolean(r1)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "enable_omid"
            boolean r47 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "omid_settings"
            java.lang.String r50 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x0288 }
            java.lang.String r1 = "disable_closable_area"
            boolean r49 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0288 }
            com.google.android.gms.internal.ads.zzwb r1 = r0.zzdwg     // Catch:{ JSONException -> 0x0288 }
            android.os.Bundle r1 = r1.zzcjl     // Catch:{ JSONException -> 0x0288 }
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()     // Catch:{ JSONException -> 0x0288 }
            android.os.Bundle r1 = r1.getBundle(r2)     // Catch:{ JSONException -> 0x0288 }
            if (r1 == 0) goto L_0x0238
            java.lang.String r2 = "is_analytics_logging_enabled"
            boolean r1 = r1.getBoolean(r2, r15)     // Catch:{ JSONException -> 0x0288 }
            if (r1 == 0) goto L_0x0238
            r52 = 1
            goto L_0x023a
        L_0x0238:
            r52 = 0
        L_0x023a:
            com.google.android.gms.internal.ads.zzasm r53 = new com.google.android.gms.internal.ads.zzasm     // Catch:{ JSONException -> 0x0288 }
            boolean r14 = r0.zzdwn     // Catch:{ JSONException -> 0x0288 }
            boolean r10 = r0.zzdxb     // Catch:{ JSONException -> 0x0288 }
            boolean r11 = r0.zzdxn     // Catch:{ JSONException -> 0x0288 }
            r46 = 0
            java.lang.String r51 = ""
            r1 = r53
            r2 = r57
            r0 = r10
            r54 = r11
            r10 = r12
            r12 = r22
            r22 = r55
            r55 = r14
            r13 = r16
            r15 = r18
            r16 = r22
            r17 = r20
            r20 = r25
            r21 = r26
            r22 = r23
            r23 = r27
            r25 = r55
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r35
            r32 = r33
            r33 = r34
            r34 = r36
            r35 = r37
            r36 = r0
            r37 = r38
            r38 = r39
            r39 = r44
            r44 = r54
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)     // Catch:{ JSONException -> 0x0288 }
            return r53
        L_0x0288:
            r0 = move-exception
            java.lang.String r1 = "Could not parse the inline ad response: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x029e
            java.lang.String r0 = r1.concat(r0)
            goto L_0x02a3
        L_0x029e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x02a3:
            com.google.android.gms.internal.ads.zzaxz.zzeo(r0)
            com.google.android.gms.internal.ads.zzasm r0 = new com.google.android.gms.internal.ads.zzasm
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatv.zza(android.content.Context, com.google.android.gms.internal.ads.zzasi, java.lang.String):com.google.android.gms.internal.ads.zzasm");
    }

    @Nullable
    private static List<String> zza(@Nullable JSONArray jSONArray, @Nullable List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    public static JSONObject zzb(zzasm zzasm) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (zzasm.zzbde != null) {
            jSONObject.put("ad_base_url", zzasm.zzbde);
        }
        if (zzasm.zzdyg != null) {
            jSONObject.put("ad_size", zzasm.zzdyg);
        }
        jSONObject.put("native", zzasm.zzckn);
        if (zzasm.zzckn) {
            jSONObject.put("ad_json", zzasm.zzdyb);
        } else {
            jSONObject.put("ad_html", zzasm.zzdyb);
        }
        if (zzasm.zzdyi != null) {
            jSONObject.put("debug_dialog", zzasm.zzdyi);
        }
        if (zzasm.zzdyy != null) {
            jSONObject.put("debug_signals", zzasm.zzdyy);
        }
        if (zzasm.zzdyc != -1) {
            double d = (double) zzasm.zzdyc;
            Double.isNaN(d);
            jSONObject.put("interstitial_timeout", d / 1000.0d);
        }
        if (zzasm.orientation == zzbv.zzlh().zzzx()) {
            jSONObject.put("orientation", "portrait");
        } else if (zzasm.orientation == zzbv.zzlh().zzzw()) {
            jSONObject.put("orientation", "landscape");
        }
        if (zzasm.zzdlq != null) {
            jSONObject.put("click_urls", zzm(zzasm.zzdlq));
        }
        if (zzasm.zzdlr != null) {
            jSONObject.put("impression_urls", zzm(zzasm.zzdlr));
        }
        if (zzasm.zzdls != null) {
            jSONObject.put("downloaded_impression_urls", zzm(zzasm.zzdls));
        }
        if (zzasm.zzdyf != null) {
            jSONObject.put("manual_impression_urls", zzm(zzasm.zzdyf));
        }
        if (zzasm.zzdyl != null) {
            jSONObject.put("active_view", zzasm.zzdyl);
        }
        jSONObject.put("ad_is_javascript", zzasm.zzdyj);
        if (zzasm.zzdyk != null) {
            jSONObject.put("ad_passback_url", zzasm.zzdyk);
        }
        jSONObject.put("mediation", zzasm.zzdyd);
        jSONObject.put("custom_render_allowed", zzasm.zzdym);
        jSONObject.put("content_url_opted_out", zzasm.zzdyn);
        jSONObject.put("content_vertical_opted_out", zzasm.zzdyz);
        jSONObject.put("prefetch", zzasm.zzdyo);
        if (zzasm.zzdlx != -1) {
            jSONObject.put("refresh_interval_milliseconds", zzasm.zzdlx);
        }
        if (zzasm.zzdye != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", zzasm.zzdye);
        }
        if (!TextUtils.isEmpty(zzasm.zzcgx)) {
            jSONObject.put("gws_query_id", zzasm.zzcgx);
        }
        jSONObject.put("fluid", zzasm.zzcko ? "height" : BuildConfig.FLAVOR);
        jSONObject.put("native_express", zzasm.zzckp);
        if (zzasm.zzdys != null) {
            jSONObject.put("video_start_urls", zzm(zzasm.zzdys));
        }
        if (zzasm.zzdyt != null) {
            jSONObject.put("video_complete_urls", zzm(zzasm.zzdyt));
        }
        if (zzasm.zzdyr != null) {
            zzawd zzawd = zzasm.zzdyr;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", zzawd.type);
            jSONObject2.put("rb_amount", zzawd.zzefo);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", zzasm.zzdyu);
        jSONObject.put("auto_protection_configuration", zzasm.zzdyv);
        jSONObject.put("render_in_browser", zzasm.zzdlv);
        jSONObject.put("disable_closable_area", zzasm.zzbpi);
        return jSONObject;
    }

    @Nullable
    private static JSONArray zzm(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
