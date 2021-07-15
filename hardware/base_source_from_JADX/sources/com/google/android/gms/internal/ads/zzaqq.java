package com.google.android.gms.internal.ads;

@zzark
public final class zzaqq implements zzaqe<zzabs> {
    private final boolean zzdmt;
    private final boolean zzdut;
    private final boolean zzduu;

    public zzaqq(boolean z, boolean z2, boolean z3) {
        this.zzdut = z;
        this.zzduu = z2;
        this.zzdmt = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacf zza(com.google.android.gms.internal.ads.zzapw r22, org.json.JSONObject r23) throws org.json.JSONException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            r8 = r23
            java.lang.String r3 = "images"
            boolean r5 = r0.zzdut
            boolean r6 = r0.zzduu
            r4 = 0
            r1 = r22
            r2 = r23
            java.util.List r1 = r1.zza((org.json.JSONObject) r2, (java.lang.String) r3, (boolean) r4, (boolean) r5, (boolean) r6)
            java.lang.String r2 = "app_icon"
            boolean r3 = r0.zzdut
            r4 = 1
            com.google.android.gms.internal.ads.zzbcb r2 = r7.zza(r8, r2, r4, r3)
            java.lang.String r3 = "video"
            com.google.android.gms.internal.ads.zzbcb r3 = r7.zzc((org.json.JSONObject) r8, (java.lang.String) r3)
            com.google.android.gms.internal.ads.zzbcb r4 = r22.zzg(r23)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.zzbcb r5 = (com.google.android.gms.internal.ads.zzbcb) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.zzabr r5 = (com.google.android.gms.internal.ads.zzabr) r5
            r7.add(r5)
            goto L_0x0031
        L_0x0047:
            com.google.android.gms.internal.ads.zzbgg r1 = com.google.android.gms.internal.ads.zzapw.zzc(r3)
            com.google.android.gms.internal.ads.zzabs r3 = new com.google.android.gms.internal.ads.zzabs
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.zzdmt
            if (r6 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzaxk r6 = com.google.android.gms.ads.internal.zzbv.zzlj()
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0068
            int r9 = com.google.android.gms.ads.impl.C0523R.string.f39s7
            java.lang.String r6 = r6.getString(r9)
            goto L_0x006a
        L_0x0068:
            java.lang.String r6 = "Test Ad"
        L_0x006a:
            if (r5 == 0) goto L_0x0094
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r9 = r9.length()
            int r9 = r9 + 3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r6 = " : "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x0093:
            r6 = r5
        L_0x0094:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.zzadb r2 = (com.google.android.gms.internal.ads.zzadb) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "rating"
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r11 = r8.optDouble(r5, r11)
            java.lang.String r5 = "store"
            java.lang.String r13 = r8.optString(r5)
            java.lang.String r5 = "price"
            java.lang.String r14 = r8.optString(r5)
            java.lang.Object r4 = r4.get()
            r15 = r4
            com.google.android.gms.internal.ads.zzabm r15 = (com.google.android.gms.internal.ads.zzabm) r15
            android.os.Bundle r16 = new android.os.Bundle
            r16.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzbgw r5 = r1.zzabu()
            r17 = r5
            goto L_0x00d2
        L_0x00d0:
            r17 = r4
        L_0x00d2:
            if (r1 == 0) goto L_0x00db
            android.view.View r1 = r1.getView()
            r18 = r1
            goto L_0x00dd
        L_0x00db:
            r18 = r4
        L_0x00dd:
            r19 = 0
            r20 = 0
            r5 = r3
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqq.zza(com.google.android.gms.internal.ads.zzapw, org.json.JSONObject):com.google.android.gms.internal.ads.zzacf");
    }
}
