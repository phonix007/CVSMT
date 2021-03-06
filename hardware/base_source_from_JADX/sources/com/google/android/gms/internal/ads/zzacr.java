package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzacr extends zzadg implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzacw {
    @VisibleForTesting
    private static final String[] zzdcy = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private final Object mLock = new Object();
    @Nullable
    @VisibleForTesting
    private FrameLayout zzbld;
    @Nullable
    @VisibleForTesting
    private zzacd zzdbj;
    private final FrameLayout zzdcz;
    private View zzdda;
    @VisibleForTesting
    private Map<String, WeakReference<View>> zzddb = Collections.synchronizedMap(new HashMap());
    @Nullable
    @VisibleForTesting
    private View zzddc;
    @VisibleForTesting
    private boolean zzddd = false;
    @VisibleForTesting
    private Point zzdde = new Point();
    @VisibleForTesting
    private Point zzddf = new Point();
    @VisibleForTesting
    private WeakReference<zzsc> zzddg = new WeakReference<>((Object) null);

    @TargetApi(21)
    public zzacr(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzdcz = frameLayout;
        this.zzbld = frameLayout2;
        zzbv.zzme();
        zzbct.zza((View) this.zzdcz, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzbv.zzme();
        zzbct.zza((View) this.zzdcz, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzdcz.setOnTouchListener(this);
        this.zzdcz.setOnClickListener(this);
        if (frameLayout2 != null && PlatformVersion.isAtLeastLollipop()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zzaan.initialize(this.zzdcz.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.zzddb     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000f:
            if (r5 != 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r3.zzddb     // Catch:{ all -> 0x0040 }
            r5.remove(r4)     // Catch:{ all -> 0x0040 }
            goto L_0x003c
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.zzddb     // Catch:{ all -> 0x0040 }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0040 }
            r2.<init>(r5)     // Catch:{ all -> 0x0040 }
            r1.put(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "1098"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "3011"
            boolean r4 = r1.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0032
            goto L_0x003e
        L_0x0032:
            r5.setOnTouchListener(r3)     // Catch:{ all -> 0x0040 }
            r4 = 1
            r5.setClickable(r4)     // Catch:{ all -> 0x0040 }
            r5.setOnClickListener(r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.zzb(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.dynamic.IObjectWrapper zzbm(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.zzddb     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r2
        L_0x000a:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = r3.zzddb     // Catch:{ all -> 0x0022 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0022 }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x0022 }
            if (r4 != 0) goto L_0x0015
            goto L_0x001c
        L_0x0015:
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0022 }
            r2 = r4
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0022 }
        L_0x001c:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.zzbm(java.lang.String):com.google.android.gms.dynamic.IObjectWrapper");
    }

    private final void zzm(@Nullable View view) {
        zzacd zzacd;
        if (this.zzdbj != null) {
            if (this.zzdbj instanceof zzacc) {
                zzacd = ((zzacc) this.zzdbj).zzso();
            } else {
                zzacd = this.zzdbj;
            }
            if (zzacd != null) {
                zzacd.zzm(view);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012a A[Catch:{ Exception -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b A[Catch:{ Exception -> 0x0157 }] */
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.mLock
            monitor-enter(r0)
            r1 = 0
            r11.zzm(r1)     // Catch:{ all -> 0x021a }
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r12)     // Catch:{ all -> 0x021a }
            boolean r2 = r12 instanceof com.google.android.gms.internal.ads.zzach     // Catch:{ all -> 0x021a }
            if (r2 != 0) goto L_0x0016
            java.lang.String r12 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.zzaxz.zzeo(r12)     // Catch:{ all -> 0x021a }
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x0016:
            r2 = 1
            r11.zzddd = r2     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzach r12 = (com.google.android.gms.internal.ads.zzach) r12     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r4 = r11.zzdcz     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.zzddb     // Catch:{ all -> 0x021a }
            r3.zzb(r4, r5)     // Catch:{ all -> 0x021a }
        L_0x0028:
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzach     // Catch:{ all -> 0x021a }
            r9 = 0
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzach r3 = (com.google.android.gms.internal.ads.zzach) r3     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0063
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzaww r4 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r5 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.content.Context r5 = r5.getContext()     // Catch:{ all -> 0x021a }
            boolean r4 = r4.zzv(r5)     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzawv r3 = r3.zzsu()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0054
            r3.zzai(r9)     // Catch:{ all -> 0x021a }
        L_0x0054:
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzsc> r4 = r11.zzddg     // Catch:{ all -> 0x021a }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzsc r4 = (com.google.android.gms.internal.ads.zzsc) r4     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x0063
            if (r3 == 0) goto L_0x0063
            r4.zzb(r3)     // Catch:{ all -> 0x021a }
        L_0x0063:
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.zzacc     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacc r3 = (com.google.android.gms.internal.ads.zzacc) r3     // Catch:{ all -> 0x021a }
            boolean r3 = r3.zzsn()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzacd r3 = r11.zzdbj     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacc r3 = (com.google.android.gms.internal.ads.zzacc) r3     // Catch:{ all -> 0x021a }
            r3.zzc(r12)     // Catch:{ all -> 0x021a }
            goto L_0x0087
        L_0x007b:
            r11.zzdbj = r12     // Catch:{ all -> 0x021a }
            boolean r3 = r12 instanceof com.google.android.gms.internal.ads.zzacc     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0087
            r3 = r12
            com.google.android.gms.internal.ads.zzacc r3 = (com.google.android.gms.internal.ads.zzacc) r3     // Catch:{ all -> 0x021a }
            r3.zzc(r1)     // Catch:{ all -> 0x021a }
        L_0x0087:
            android.widget.FrameLayout r3 = r11.zzbld     // Catch:{ all -> 0x021a }
            if (r3 != 0) goto L_0x008d
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x008d:
            android.widget.FrameLayout r3 = r11.zzbld     // Catch:{ all -> 0x021a }
            r3.setClickable(r9)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.zzbld     // Catch:{ all -> 0x021a }
            r3.removeAllViews()     // Catch:{ all -> 0x021a }
            boolean r3 = r12.zzsj()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x00cd
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r11.zzddb     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x00c5
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "1098"
            r5[r9] = r6     // Catch:{ all -> 0x021a }
            java.lang.String r6 = "3011"
            r5[r2] = r6     // Catch:{ all -> 0x021a }
            r6 = 0
        L_0x00ad:
            if (r6 >= r4) goto L_0x00c5
            r7 = r5[r6]     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = r11.zzddb     // Catch:{ all -> 0x021a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x021a }
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch:{ all -> 0x021a }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object r4 = r7.get()     // Catch:{ all -> 0x021a }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x021a }
            goto L_0x00c6
        L_0x00c2:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00c5:
            r4 = r1
        L_0x00c6:
            boolean r5 = r4 instanceof android.view.ViewGroup     // Catch:{ all -> 0x021a }
            if (r5 == 0) goto L_0x00cd
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x021a }
            goto L_0x00ce
        L_0x00cd:
            r4 = r1
        L_0x00ce:
            if (r3 == 0) goto L_0x00d3
            if (r4 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            android.view.View r3 = r12.zza((android.view.View.OnClickListener) r11, (boolean) r2)     // Catch:{ all -> 0x021a }
            r11.zzddc = r3     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.zzddc     // Catch:{ all -> 0x021a }
            r10 = -1
            if (r3 == 0) goto L_0x011b
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.zzddb     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x00f1
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.zzddb     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "1007"
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x021a }
            android.view.View r7 = r11.zzddc     // Catch:{ all -> 0x021a }
            r6.<init>(r7)     // Catch:{ all -> 0x021a }
            r3.put(r5, r6)     // Catch:{ all -> 0x021a }
        L_0x00f1:
            if (r2 == 0) goto L_0x00fc
            r4.removeAllViews()     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.zzddc     // Catch:{ all -> 0x021a }
            r4.addView(r2)     // Catch:{ all -> 0x021a }
            goto L_0x011b
        L_0x00fc:
            android.content.Context r2 = r12.getContext()     // Catch:{ all -> 0x021a }
            com.google.android.gms.ads.formats.AdChoicesView r3 = new com.google.android.gms.ads.formats.AdChoicesView     // Catch:{ all -> 0x021a }
            r3.<init>(r2)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x021a }
            r2.<init>(r10, r10)     // Catch:{ all -> 0x021a }
            r3.setLayoutParams(r2)     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.zzddc     // Catch:{ all -> 0x021a }
            r3.addView(r2)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.zzbld     // Catch:{ all -> 0x021a }
            if (r2 == 0) goto L_0x011b
            android.widget.FrameLayout r2 = r11.zzbld     // Catch:{ all -> 0x021a }
            r2.addView(r3)     // Catch:{ all -> 0x021a }
        L_0x011b:
            android.widget.FrameLayout r4 = r11.zzdcz     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5 = r11.zzddb     // Catch:{ all -> 0x021a }
            r6 = 0
            r3 = r12
            r7 = r11
            r8 = r11
            r3.zza((android.view.View) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r6, (android.view.View.OnTouchListener) r7, (android.view.View.OnClickListener) r8)     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.zzdda     // Catch:{ all -> 0x021a }
            if (r2 != 0) goto L_0x0141
            android.view.View r2 = new android.view.View     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x021a }
            r2.<init>(r3)     // Catch:{ all -> 0x021a }
            r11.zzdda = r2     // Catch:{ all -> 0x021a }
            android.view.View r2 = r11.zzdda     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x021a }
            r3.<init>(r10, r9)     // Catch:{ all -> 0x021a }
            r2.setLayoutParams(r3)     // Catch:{ all -> 0x021a }
        L_0x0141:
            android.widget.FrameLayout r2 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.zzdda     // Catch:{ all -> 0x021a }
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x021a }
            if (r2 == r3) goto L_0x0152
            android.widget.FrameLayout r2 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.view.View r3 = r11.zzdda     // Catch:{ all -> 0x021a }
            r2.addView(r3)     // Catch:{ all -> 0x021a }
        L_0x0152:
            com.google.android.gms.internal.ads.zzbgg r2 = r12.zzsp()     // Catch:{ Exception -> 0x0157 }
            goto L_0x016d
        L_0x0157:
            r2 = move-exception
            com.google.android.gms.ads.internal.zzbv.zzlh()     // Catch:{ all -> 0x021a }
            boolean r3 = com.google.android.gms.internal.ads.zzayp.zzaaa()     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x0167
            java.lang.String r2 = "Privileged processes cannot create HTML overlays."
            com.google.android.gms.internal.ads.zzaxz.zzeo(r2)     // Catch:{ all -> 0x021a }
            goto L_0x016c
        L_0x0167:
            java.lang.String r3 = "Error obtaining overlay."
            com.google.android.gms.internal.ads.zzaxz.zzb(r3, r2)     // Catch:{ all -> 0x021a }
        L_0x016c:
            r2 = r1
        L_0x016d:
            if (r2 == 0) goto L_0x017c
            android.widget.FrameLayout r3 = r11.zzbld     // Catch:{ all -> 0x021a }
            if (r3 == 0) goto L_0x017c
            android.widget.FrameLayout r3 = r11.zzbld     // Catch:{ all -> 0x021a }
            android.view.View r2 = r2.getView()     // Catch:{ all -> 0x021a }
            r3.addView(r2)     // Catch:{ all -> 0x021a }
        L_0x017c:
            java.lang.Object r2 = r11.mLock     // Catch:{ all -> 0x021a }
            monitor-enter(r2)     // Catch:{ all -> 0x021a }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.zzddb     // Catch:{ all -> 0x0217 }
            r12.zzf(r3)     // Catch:{ all -> 0x0217 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r11.zzddb     // Catch:{ all -> 0x0217 }
            if (r3 == 0) goto L_0x01a3
            java.lang.String[] r3 = zzdcy     // Catch:{ all -> 0x0217 }
            int r4 = r3.length     // Catch:{ all -> 0x0217 }
        L_0x018b:
            if (r9 >= r4) goto L_0x01a3
            r5 = r3[r9]     // Catch:{ all -> 0x0217 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r11.zzddb     // Catch:{ all -> 0x0217 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0217 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ all -> 0x0217 }
            if (r5 == 0) goto L_0x01a0
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x0217 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0217 }
            goto L_0x01a3
        L_0x01a0:
            int r9 = r9 + 1
            goto L_0x018b
        L_0x01a3:
            boolean r3 = r1 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0217 }
            if (r3 != 0) goto L_0x01a9
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
            goto L_0x01ba
        L_0x01a9:
            com.google.android.gms.internal.ads.zzacs r3 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ all -> 0x0217 }
            r3.<init>(r11, r1)     // Catch:{ all -> 0x0217 }
            boolean r4 = r12 instanceof com.google.android.gms.internal.ads.zzacc     // Catch:{ all -> 0x0217 }
            if (r4 == 0) goto L_0x01b6
            r12.zzb((android.view.View) r1, (com.google.android.gms.internal.ads.zzacb) r3)     // Catch:{ all -> 0x0217 }
            goto L_0x01b9
        L_0x01b6:
            r12.zza((android.view.View) r1, (com.google.android.gms.internal.ads.zzacb) r3)     // Catch:{ all -> 0x0217 }
        L_0x01b9:
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
        L_0x01ba:
            r12.zza((com.google.android.gms.internal.ads.zzacw) r11)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r1 = r11.zzdcz     // Catch:{ all -> 0x021a }
            r12.zzi(r1)     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r12 = r11.zzdcz     // Catch:{ all -> 0x021a }
            r11.zzm(r12)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacd r12 = r11.zzdbj     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r1 = r11.zzdcz     // Catch:{ all -> 0x021a }
            r12.zzj(r1)     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzacd r12 = r11.zzdbj     // Catch:{ all -> 0x021a }
            boolean r12 = r12 instanceof com.google.android.gms.internal.ads.zzach     // Catch:{ all -> 0x021a }
            if (r12 == 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzacd r12 = r11.zzdbj     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzach r12 = (com.google.android.gms.internal.ads.zzach) r12     // Catch:{ all -> 0x021a }
            if (r12 == 0) goto L_0x0215
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x021a }
            if (r1 == 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzaww r1 = com.google.android.gms.ads.internal.zzbv.zzmf()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x021a }
            boolean r1 = r1.zzv(r2)     // Catch:{ all -> 0x021a }
            if (r1 == 0) goto L_0x0215
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.zzsc> r1 = r11.zzddg     // Catch:{ all -> 0x021a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x021a }
            com.google.android.gms.internal.ads.zzsc r1 = (com.google.android.gms.internal.ads.zzsc) r1     // Catch:{ all -> 0x021a }
            if (r1 != 0) goto L_0x020e
            com.google.android.gms.internal.ads.zzsc r1 = new com.google.android.gms.internal.ads.zzsc     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r2 = r11.zzdcz     // Catch:{ all -> 0x021a }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x021a }
            android.widget.FrameLayout r3 = r11.zzdcz     // Catch:{ all -> 0x021a }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x021a }
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x021a }
            r2.<init>(r1)     // Catch:{ all -> 0x021a }
            r11.zzddg = r2     // Catch:{ all -> 0x021a }
        L_0x020e:
            com.google.android.gms.internal.ads.zzawv r12 = r12.zzsu()     // Catch:{ all -> 0x021a }
            r1.zza((com.google.android.gms.internal.ads.zzsg) r12)     // Catch:{ all -> 0x021a }
        L_0x0215:
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            return
        L_0x0217:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0217 }
            throw r12     // Catch:{ all -> 0x021a }
        L_0x021a:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x021a }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.mLock
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            r1.cancelUnconfirmedClick()     // Catch:{ all -> 0x0094 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "x"
            android.graphics.Point r2 = r9.zzdde     // Catch:{ all -> 0x0094 }
            int r2 = r2.x     // Catch:{ all -> 0x0094 }
            int r2 = r9.zzck(r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "y"
            android.graphics.Point r2 = r9.zzdde     // Catch:{ all -> 0x0094 }
            int r2 = r2.y     // Catch:{ all -> 0x0094 }
            int r2 = r9.zzck(r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "start_x"
            android.graphics.Point r2 = r9.zzddf     // Catch:{ all -> 0x0094 }
            int r2 = r2.x     // Catch:{ all -> 0x0094 }
            int r2 = r9.zzck(r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "start_y"
            android.graphics.Point r2 = r9.zzddf     // Catch:{ all -> 0x0094 }
            int r2 = r2.y     // Catch:{ all -> 0x0094 }
            int r2 = r9.zzck(r2)     // Catch:{ all -> 0x0094 }
            float r2 = (float) r2     // Catch:{ all -> 0x0094 }
            r5.putFloat(r1, r2)     // Catch:{ all -> 0x0094 }
            android.view.View r1 = r9.zzddc     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0089
            android.view.View r1 = r9.zzddc     // Catch:{ all -> 0x0094 }
            boolean r1 = r1.equals(r10)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            boolean r1 = r1 instanceof com.google.android.gms.internal.ads.zzacc     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.zzacc r1 = (com.google.android.gms.internal.ads.zzacc) r1     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.zzacd r1 = r1.zzso()     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0092
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.zzacc r1 = (com.google.android.gms.internal.ads.zzacc) r1     // Catch:{ all -> 0x0094 }
            com.google.android.gms.internal.ads.zzacd r2 = r1.zzso()     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.zzddb     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r7 = r9.zzdcz     // Catch:{ all -> 0x0094 }
            r8 = 0
            r3 = r10
            r2.zza(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x007b:
            com.google.android.gms.internal.ads.zzacd r2 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "1007"
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r6 = r9.zzddb     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r7 = r9.zzdcz     // Catch:{ all -> 0x0094 }
            r8 = 0
            r3 = r10
            r2.zza(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0089:
            com.google.android.gms.internal.ads.zzacd r1 = r9.zzdbj     // Catch:{ all -> 0x0094 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r2 = r9.zzddb     // Catch:{ all -> 0x0094 }
            android.widget.FrameLayout r3 = r9.zzdcz     // Catch:{ all -> 0x0094 }
            r1.zza(r10, r2, r5, r3)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            return
        L_0x0094:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            if (this.zzdbj != null) {
                this.zzdbj.zzc(this.zzdcz, this.zzddb);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzdbj != null) {
                this.zzdbj.zzc(this.zzdcz, this.zzddb);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzdbj == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.zzdcz.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.zzdde = point;
            if (motionEvent.getAction() == 0) {
                this.zzddf = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) point.x, (float) point.y);
            this.zzdbj.zzd(obtain);
            obtain.recycle();
            return false;
        }
    }

    public final void destroy() {
        synchronized (this.mLock) {
            if (this.zzbld != null) {
                this.zzbld.removeAllViews();
            }
            this.zzbld = null;
            this.zzddb = null;
            this.zzddc = null;
            this.zzdbj = null;
            this.zzdde = null;
            this.zzddf = null;
            this.zzddg = null;
            this.zzdda = null;
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        zzsc zzsc;
        if (zzbv.zzmf().zzv(this.zzdcz.getContext()) && this.zzddg != null && (zzsc = (zzsc) this.zzddg.get()) != null) {
            zzsc.zznh();
        }
    }

    public final void zzc(IObjectWrapper iObjectWrapper) {
        this.zzdbj.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized Map<String, WeakReference<View>> zzsv() {
        return this.zzddb;
    }

    public final View zzsw() {
        return this.zzdcz;
    }

    @VisibleForTesting
    private final int zzck(int i) {
        zzwu.zzpv();
        return zzbat.zzb(this.zzdbj.getContext(), i);
    }
}
