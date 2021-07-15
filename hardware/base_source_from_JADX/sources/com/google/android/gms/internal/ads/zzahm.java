package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzahm {
    private final Map<zzahn, zzaho> zzdhe = new HashMap();
    private final LinkedList<zzahn> zzdhf = new LinkedList<>();
    @Nullable
    private zzagi zzdhg;

    /* access modifiers changed from: package-private */
    public final void zza(zzagi zzagi) {
        if (this.zzdhg == null) {
            this.zzdhg = zzagi.zztg();
            if (this.zzdhg != null) {
                SharedPreferences sharedPreferences = this.zzdhg.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.zzdhf.size() > 0) {
                    zzahn remove = this.zzdhf.remove();
                    zzaho zzaho = this.zzdhe.get(remove);
                    zza("Flushing interstitial queue for %s.", remove);
                    while (zzaho.size() > 0) {
                        zzaho.zzl((zzwb) null).zzdhl.zzke();
                    }
                    this.zzdhe.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
                        if (!((String) next.getKey()).equals("PoolKeys")) {
                            zzahs zzcc = zzahs.zzcc((String) next.getValue());
                            zzahn zzahn = new zzahn(zzcc.zzbqo, zzcc.zzboa, zzcc.zzdhj);
                            if (!this.zzdhe.containsKey(zzahn)) {
                                this.zzdhe.put(zzahn, new zzaho(zzcc.zzbqo, zzcc.zzboa, zzcc.zzdhj));
                                hashMap.put(zzahn.toString(), zzahn);
                                zza("Restored interstitial queue for %s.", zzahn);
                            }
                        }
                    }
                    for (String str : zzbz(sharedPreferences.getString("PoolKeys", BuildConfig.FLAVOR))) {
                        zzahn zzahn2 = (zzahn) hashMap.get(str);
                        if (this.zzdhe.containsKey(zzahn2)) {
                            this.zzdhf.add(zzahn2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    zzbv.zzlj().zza(e, "InterstitialAdPool.restore");
                    zzaxz.zzc("Malformed preferences value for InterstitialAdPool.", e);
                    this.zzdhe.clear();
                    this.zzdhf.clear();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final zzahp zza(zzwb zzwb, String str) {
        if (zzca(str)) {
            return null;
        }
        int i = new zzaua(this.zzdhg.getApplicationContext()).zzwx().zzedd;
        zzwb zzj = zzj(zzwb);
        String zzcb = zzcb(str);
        zzahn zzahn = new zzahn(zzj, zzcb, i);
        zzaho zzaho = this.zzdhe.get(zzahn);
        if (zzaho == null) {
            zza("Interstitial pool created at %s.", zzahn);
            zzaho = new zzaho(zzj, zzcb, i);
            this.zzdhe.put(zzahn, zzaho);
        }
        this.zzdhf.remove(zzahn);
        this.zzdhf.add(zzahn);
        zzaho.zztm();
        while (true) {
            if (this.zzdhf.size() <= ((Integer) zzwu.zzpz().zzd(zzaan.zzcsd)).intValue()) {
                break;
            }
            zzahn remove = this.zzdhf.remove();
            zzaho zzaho2 = this.zzdhe.get(remove);
            zza("Evicting interstitial queue for %s.", remove);
            while (zzaho2.size() > 0) {
                zzahp zzl = zzaho2.zzl((zzwb) null);
                if (zzl.zzblw) {
                    zzahq.zzto().zztq();
                }
                zzl.zzdhl.zzke();
            }
            this.zzdhe.remove(remove);
        }
        while (zzaho.size() > 0) {
            zzahp zzl2 = zzaho.zzl(zzj);
            if (zzl2.zzblw) {
                if (zzbv.zzlm().currentTimeMillis() - zzl2.zzdho > ((long) ((Integer) zzwu.zzpz().zzd(zzaan.zzcsf)).intValue()) * 1000) {
                    zza("Expired interstitial at %s.", zzahn);
                    zzahq.zzto().zztp();
                }
            }
            String str2 = zzl2.zzdhm != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            zza(sb.toString(), zzahn);
            return zzl2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzwb zzwb, String str) {
        if (this.zzdhg != null) {
            int i = new zzaua(this.zzdhg.getApplicationContext()).zzwx().zzedd;
            zzwb zzj = zzj(zzwb);
            String zzcb = zzcb(str);
            zzahn zzahn = new zzahn(zzj, zzcb, i);
            zzaho zzaho = this.zzdhe.get(zzahn);
            if (zzaho == null) {
                zza("Interstitial pool created at %s.", zzahn);
                zzaho = new zzaho(zzj, zzcb, i);
                this.zzdhe.put(zzahn, zzaho);
            }
            zzaho.zza(this.zzdhg, zzwb);
            zzaho.zztm();
            zza("Inline entry added to the queue at %s.", zzahn);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r5 = r1.size();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzth() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzagi r0 = r9.zzdhg
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Map<com.google.android.gms.internal.ads.zzahn, com.google.android.gms.internal.ads.zzaho> r0 = r9.zzdhe
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            com.google.android.gms.internal.ads.zzahn r3 = (com.google.android.gms.internal.ads.zzahn) r3
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.ads.zzaho r1 = (com.google.android.gms.internal.ads.zzaho) r1
            r4 = 2
            boolean r5 = com.google.android.gms.internal.ads.zzaxz.isLoggable(r4)
            if (r5 == 0) goto L_0x0056
            int r5 = r1.size()
            int r6 = r1.zztk()
            if (r6 >= r5) goto L_0x0056
            java.lang.String r7 = "Loading %s/%s pooled interstitials for %s."
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r6 = r5 - r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r2] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r8[r6] = r5
            r8[r4] = r3
            java.lang.String r4 = java.lang.String.format(r7, r8)
            com.google.android.gms.internal.ads.zzaxz.m30v(r4)
        L_0x0056:
            int r4 = r1.zztl()
            int r4 = r4 + r2
        L_0x005b:
            int r2 = r1.size()
            com.google.android.gms.internal.ads.zzaac<java.lang.Integer> r5 = com.google.android.gms.internal.ads.zzaan.zzcse
            com.google.android.gms.internal.ads.zzaak r6 = com.google.android.gms.internal.ads.zzwu.zzpz()
            java.lang.Object r5 = r6.zzd(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 >= r5) goto L_0x0081
            java.lang.String r2 = "Pooling and loading one new interstitial for %s."
            zza((java.lang.String) r2, (com.google.android.gms.internal.ads.zzahn) r3)
            com.google.android.gms.internal.ads.zzagi r2 = r9.zzdhg
            boolean r2 = r1.zzb((com.google.android.gms.internal.ads.zzagi) r2)
            if (r2 == 0) goto L_0x005b
            int r4 = r4 + 1
            goto L_0x005b
        L_0x0081:
            com.google.android.gms.internal.ads.zzahq r1 = com.google.android.gms.internal.ads.zzahq.zzto()
            r1.zzcn(r4)
            goto L_0x000f
        L_0x0089:
            com.google.android.gms.internal.ads.zzagi r0 = r9.zzdhg
            if (r0 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzagi r0 = r9.zzdhg
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.clear()
            java.util.Map<com.google.android.gms.internal.ads.zzahn, com.google.android.gms.internal.ads.zzaho> r1 = r9.zzdhe
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.ads.zzahn r3 = (com.google.android.gms.internal.ads.zzahn) r3
            java.lang.Object r2 = r2.getValue()
            com.google.android.gms.internal.ads.zzaho r2 = (com.google.android.gms.internal.ads.zzaho) r2
            boolean r4 = r2.zztn()
            if (r4 == 0) goto L_0x00aa
            com.google.android.gms.internal.ads.zzahs r4 = new com.google.android.gms.internal.ads.zzahs
            r4.<init>(r2)
            java.lang.String r2 = r4.zzty()
            java.lang.String r4 = r3.toString()
            r0.putString(r4, r2)
            java.lang.String r2 = "Saved interstitial queue for %s."
            zza((java.lang.String) r2, (com.google.android.gms.internal.ads.zzahn) r3)
            goto L_0x00aa
        L_0x00de:
            java.lang.String r1 = "PoolKeys"
            java.lang.String r2 = r9.zzti()
            r0.putString(r1, r2)
            r0.apply()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzth():void");
    }

    private final String zzti() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.zzdhf.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((zzahn) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    private static String[] zzbz(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    private static boolean zzca(String str) {
        try {
            return Pattern.matches((String) zzwu.zzpz().zzd(zzaan.zzcsg), str);
        } catch (RuntimeException e) {
            zzbv.zzlj().zza(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    static Set<String> zzh(zzwb zzwb) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzwb.extras.keySet());
        Bundle bundle = zzwb.zzcjl.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    static zzwb zzi(zzwb zzwb) {
        zzwb zzk = zzk(zzwb);
        Bundle bundle = zzk.zzcjl.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        zzk.extras.putBoolean("_skipMediation", true);
        return zzk;
    }

    @VisibleForTesting
    private static zzwb zzj(zzwb zzwb) {
        zzwb zzk = zzk(zzwb);
        for (String str : ((String) zzwu.zzpz().zzd(zzaan.zzcsc)).split(",")) {
            zzb(zzk.zzcjl, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                zzb(zzk.extras, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", BuildConfig.FLAVOR));
            }
        }
        return zzk;
    }

    @VisibleForTesting
    private static String zzcb(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    @VisibleForTesting
    private static zzwb zzk(zzwb zzwb) {
        Parcel obtain = Parcel.obtain();
        zzwb.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        return zzwb.CREATOR.createFromParcel(obtain).zzpm();
    }

    private static void zzb(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static void zza(String str, zzahn zzahn) {
        if (zzaxz.isLoggable(2)) {
            zzaxz.m30v(String.format(str, new Object[]{zzahn}));
        }
    }
}
