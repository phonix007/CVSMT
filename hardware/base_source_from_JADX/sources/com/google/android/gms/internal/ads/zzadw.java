package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzark
public final class zzadw extends NativeContentAd {
    private final VideoController zzcml = new VideoController();
    private final List<NativeAd.Image> zzddt = new ArrayList();
    private final NativeAd.AdChoicesInfo zzddv;
    private final zzadt zzddw;
    private final zzade zzddx;

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzadw(com.google.android.gms.internal.ads.zzadt r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zzddt = r0
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r4.zzcml = r0
            r4.zzddw = r5
            r5 = 0
            com.google.android.gms.internal.ads.zzadt r0 = r4.zzddw     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.getImages()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzadb     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.zzadb r1 = (com.google.android.gms.internal.ads.zzadb) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.zzadd r2 = new com.google.android.gms.internal.ads.zzadd     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r4.zzddt     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.zzade r3 = new com.google.android.gms.internal.ads.zzade     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.zzbbd.zzb(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.zzadt r0 = r4.zzddw     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.zzadb r0 = r0.zzsf()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzade r1 = new com.google.android.gms.internal.ads.zzade     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.zzbbd.zzb(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.zzddx = r1
            com.google.android.gms.internal.ads.zzadt r0 = r4.zzddw     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.zzacx r0 = r0.zzse()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.zzada r0 = new com.google.android.gms.internal.ads.zzada     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.zzadt r1 = r4.zzddw     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.zzacx r1 = r1.zzse()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.zzbbd.zzb(r1, r0)
        L_0x008d:
            r4.zzddv = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadw.<init>(com.google.android.gms.internal.ads.zzadt):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: zzsc */
    public final IObjectWrapper zzhy() {
        try {
            return this.zzddw.zzsc();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzddw.performClick(bundle);
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzddw.recordImpression(bundle);
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzddw.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzddw.getHeadline();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzddt;
    }

    public final CharSequence getBody() {
        try {
            return this.zzddw.getBody();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final NativeAd.Image getLogo() {
        return this.zzddx;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzddw.getCallToAction();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.zzddw.getAdvertiser();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzddw.getVideoController() != null) {
                this.zzcml.zza(this.zzddw.getVideoController());
            }
        } catch (RemoteException e) {
            zzbbd.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzcml;
    }

    public final Bundle getExtras() {
        try {
            return this.zzddw.getExtras();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzddv;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzddw.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzddw.destroy();
        } catch (RemoteException e) {
            zzbbd.zzb(BuildConfig.FLAVOR, e);
        }
    }
}
