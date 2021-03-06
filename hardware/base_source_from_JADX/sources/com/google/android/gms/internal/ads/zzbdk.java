package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.p000v4.app.NotificationCompat;
import android.support.p000v4.internal.view.SupportMenu;
import android.support.p000v4.view.InputDeviceCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@ParametersAreNonnullByDefault
public final class zzbdk extends FrameLayout implements zzbdh {
    private final zzbdz zzerc;
    private final FrameLayout zzerd;
    private final zzaba zzere;
    private final zzbeb zzerf;
    private final long zzerg;
    @Nullable
    private zzbdi zzerh;
    private boolean zzeri;
    private boolean zzerj;
    private boolean zzerk;
    private boolean zzerl;
    private long zzerm;
    private long zzern;
    private String zzero;
    private Bitmap zzerp;
    private ImageView zzerq;
    private boolean zzerr;

    public static void zzb(zzbdz zzbdz) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzbdz.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void zza(zzbdz zzbdz, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbdz.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void zza(zzbdz zzbdz, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzbdz.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbdk(Context context, zzbdz zzbdz, int i, boolean z, zzaba zzaba, zzbdy zzbdy) {
        super(context);
        Context context2 = context;
        zzbdz zzbdz2 = zzbdz;
        this.zzerc = zzbdz2;
        zzaba zzaba2 = zzaba;
        this.zzere = zzaba2;
        this.zzerd = new FrameLayout(context);
        addView(this.zzerd, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzbdz.zzid());
        this.zzerh = zzbdz.zzid().zzbmt.zza(context, zzbdz2, i, z, zzaba2, zzbdy);
        if (this.zzerh != null) {
            this.zzerd.addView(this.zzerh, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcpc)).booleanValue()) {
                zzabl();
            }
        }
        this.zzerq = new ImageView(context);
        this.zzerg = ((Long) zzwu.zzpz().zzd(zzaan.zzcpg)).longValue();
        this.zzerl = ((Boolean) zzwu.zzpz().zzd(zzaan.zzcpe)).booleanValue();
        if (this.zzere != null) {
            this.zzere.zzg("spinner_used", this.zzerl ? "1" : "0");
        }
        this.zzerf = new zzbeb(this);
        if (this.zzerh != null) {
            this.zzerh.zza(this);
        }
        if (this.zzerh == null) {
            zzi("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzerd.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzer(String str) {
        this.zzero = str;
    }

    public final void zza(float f, float f2) {
        if (this.zzerh != null) {
            this.zzerh.zza(f, f2);
        }
    }

    public final void zzff() {
        if (this.zzerh != null) {
            if (!TextUtils.isEmpty(this.zzero)) {
                this.zzerh.setVideoPath(this.zzero);
            } else {
                zzb("no_src", new String[0]);
            }
        }
    }

    public final void pause() {
        if (this.zzerh != null) {
            this.zzerh.pause();
        }
    }

    public final void play() {
        if (this.zzerh != null) {
            this.zzerh.play();
        }
    }

    public final void seekTo(int i) {
        if (this.zzerh != null) {
            this.zzerh.seekTo(i);
        }
    }

    public final void zzabj() {
        if (this.zzerh != null) {
            zzbdi zzbdi = this.zzerh;
            zzbdi.zzerb.setMuted(true);
            zzbdi.zzabd();
        }
    }

    public final void zzabk() {
        if (this.zzerh != null) {
            zzbdi zzbdi = this.zzerh;
            zzbdi.zzerb.setMuted(false);
            zzbdi.zzabd();
        }
    }

    public final void setVolume(float f) {
        if (this.zzerh != null) {
            zzbdi zzbdi = this.zzerh;
            zzbdi.zzerb.setVolume(f);
            zzbdi.zzabd();
        }
    }

    public final void zzcz(int i) {
        this.zzerh.zzcz(i);
    }

    public final void zzda(int i) {
        this.zzerh.zzda(i);
    }

    public final void zzdb(int i) {
        this.zzerh.zzdb(i);
    }

    public final void zzdc(int i) {
        this.zzerh.zzdc(i);
    }

    @TargetApi(14)
    public final void zzf(MotionEvent motionEvent) {
        if (this.zzerh != null) {
            this.zzerh.dispatchTouchEvent(motionEvent);
        }
    }

    @TargetApi(14)
    public final void zzabl() {
        if (this.zzerh != null) {
            TextView textView = new TextView(this.zzerh.getContext());
            String valueOf = String.valueOf(this.zzerh.zzaaz());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.zzerd.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzerd.bringChildToFront(textView);
        }
    }

    public final void zzabe() {
        this.zzerf.resume();
        zzayh.zzelc.post(new zzbdn(this));
    }

    public final void zzcg() {
        if (this.zzerh != null && this.zzern == 0) {
            zzb("canplaythrough", "duration", String.valueOf(((float) this.zzerh.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.zzerh.getVideoWidth()), "videoHeight", String.valueOf(this.zzerh.getVideoHeight()));
        }
    }

    public final void zzabf() {
        if (this.zzerc.zzabw() != null && !this.zzerj) {
            this.zzerk = (this.zzerc.zzabw().getWindow().getAttributes().flags & 128) != 0;
            if (!this.zzerk) {
                this.zzerc.zzabw().getWindow().addFlags(128);
                this.zzerj = true;
            }
        }
        this.zzeri = true;
    }

    public final void onPaused() {
        zzb("pause", new String[0]);
        zzabo();
        this.zzeri = false;
    }

    public final void zzabg() {
        zzb("ended", new String[0]);
        zzabo();
    }

    public final void zzi(String str, @Nullable String str2) {
        zzb("error", "what", str, "extra", str2);
    }

    public final void zzabh() {
        if (this.zzerr && this.zzerp != null && !zzabn()) {
            this.zzerq.setImageBitmap(this.zzerp);
            this.zzerq.invalidate();
            this.zzerd.addView(this.zzerq, new FrameLayout.LayoutParams(-1, -1));
            this.zzerd.bringChildToFront(this.zzerq);
        }
        this.zzerf.pause();
        this.zzern = this.zzerm;
        zzayh.zzelc.post(new zzbdo(this));
    }

    public final void destroy() {
        this.zzerf.pause();
        if (this.zzerh != null) {
            this.zzerh.stop();
        }
        zzabo();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzerf.pause();
            if (this.zzerh != null) {
                zzbdi zzbdi = this.zzerh;
                Executor executor = zzbcg.zzepo;
                zzbdi.getClass();
                executor.execute(zzbdl.zza(zzbdi));
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzabm() {
        if (this.zzerh != null) {
            long currentPosition = (long) this.zzerh.getCurrentPosition();
            if (this.zzerm != currentPosition && currentPosition > 0) {
                zzb("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.zzerm = currentPosition;
            }
        }
    }

    public final void zzabi() {
        if (this.zzeri && zzabn()) {
            this.zzerd.removeView(this.zzerq);
        }
        if (this.zzerp != null) {
            long elapsedRealtime = zzbv.zzlm().elapsedRealtime();
            if (this.zzerh.getBitmap(this.zzerp) != null) {
                this.zzerr = true;
            }
            long elapsedRealtime2 = zzbv.zzlm().elapsedRealtime() - elapsedRealtime;
            if (zzaxz.zzza()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzaxz.m30v(sb.toString());
            }
            if (elapsedRealtime2 > this.zzerg) {
                zzaxz.zzeo("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzerl = false;
                this.zzerp = null;
                if (this.zzere != null) {
                    this.zzere.zzg("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzm(int i, int i2) {
        if (this.zzerl) {
            int max = Math.max(i / ((Integer) zzwu.zzpz().zzd(zzaan.zzcpf)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzwu.zzpz().zzd(zzaan.zzcpf)).intValue(), 1);
            if (this.zzerp == null || this.zzerp.getWidth() != max || this.zzerp.getHeight() != max2) {
                this.zzerp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzerr = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzerf.resume();
        } else {
            this.zzerf.pause();
            this.zzern = this.zzerm;
        }
        zzayh.zzelc.post(new zzbdm(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzerf.resume();
            z = true;
        } else {
            this.zzerf.pause();
            this.zzern = this.zzerm;
            z = false;
        }
        zzayh.zzelc.post(new zzbdp(this, z));
    }

    private final boolean zzabn() {
        return this.zzerq.getParent() != null;
    }

    /* access modifiers changed from: private */
    public final void zzb(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzerc.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    private final void zzabo() {
        if (this.zzerc.zzabw() != null && this.zzerj && !this.zzerk) {
            this.zzerc.zzabw().getWindow().clearFlags(128);
            this.zzerj = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzas(boolean z) {
        zzb("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
