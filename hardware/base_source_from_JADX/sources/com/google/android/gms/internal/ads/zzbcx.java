package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@zzark
@TargetApi(14)
public final class zzbcx extends zzbdi implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzeqe = new HashMap();
    private final zzbea zzeqf;
    private final boolean zzeqg;
    private int zzeqh = 0;
    private int zzeqi = 0;
    private MediaPlayer zzeqj;
    private Uri zzeqk;
    private int zzeql;
    private int zzeqm;
    private int zzeqn;
    private int zzeqo;
    private int zzeqp;
    private zzbdx zzeqq;
    private boolean zzeqr;
    private int zzeqs;
    /* access modifiers changed from: private */
    public zzbdh zzeqt;

    public zzbcx(Context context, boolean z, boolean z2, zzbdy zzbdy, zzbea zzbea) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzeqf = zzbea;
        this.zzeqr = z;
        this.zzeqg = z2;
        this.zzeqf.zzb(this);
    }

    public final String zzaaz() {
        String valueOf = String.valueOf(this.zzeqr ? " spherical" : BuildConfig.FLAVOR);
        return valueOf.length() != 0 ? "MediaPlayer".concat(valueOf) : new String("MediaPlayer");
    }

    public final void zza(zzbdh zzbdh) {
        this.zzeqt = zzbdh;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzty zzd = zzty.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.zzeqk = parse;
        this.zzeqs = 0;
        zzaba();
        requestLayout();
        invalidate();
    }

    public final void stop() {
        zzaxz.m30v("AdMediaPlayerView stop");
        if (this.zzeqj != null) {
            this.zzeqj.stop();
            this.zzeqj.release();
            this.zzeqj = null;
            zzcx(0);
            this.zzeqi = 0;
        }
        this.zzeqf.onStop();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzaxz.m30v(sb.toString());
        this.zzeql = mediaPlayer.getVideoWidth();
        this.zzeqm = mediaPlayer.getVideoHeight();
        if (this.zzeql != 0 && this.zzeqm != 0) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzaxz.m30v("AdMediaPlayerView prepared");
        zzcx(2);
        this.zzeqf.zzcg();
        zzayh.zzelc.post(new zzbcz(this));
        this.zzeql = mediaPlayer.getVideoWidth();
        this.zzeqm = mediaPlayer.getVideoHeight();
        if (this.zzeqs != 0) {
            seekTo(this.zzeqs);
        }
        zzabb();
        int i = this.zzeql;
        int i2 = this.zzeqm;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzaxz.zzen(sb.toString());
        if (this.zzeqi == 3) {
            play();
        }
        zzabd();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzaxz.m30v("AdMediaPlayerView completion");
        zzcx(5);
        this.zzeqi = 5;
        zzayh.zzelc.post(new zzbda(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeqe.get(Integer.valueOf(i));
        String str2 = zzeqe.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaxz.m30v(sb.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeqe.get(Integer.valueOf(i));
        String str2 = zzeqe.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaxz.zzeo(sb.toString());
        zzcx(-1);
        this.zzeqi = -1;
        zzayh.zzelc.post(new zzbdb(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzeqn = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaxz.m30v("AdMediaPlayerView surface created");
        zzaba();
        zzayh.zzelc.post(new zzbdc(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaxz.m30v("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.zzeqi == 3;
        if (this.zzeql == i && this.zzeqm == i2) {
            z = true;
        }
        if (this.zzeqj != null && z2 && z) {
            if (this.zzeqs != 0) {
                seekTo(this.zzeqs);
            }
            play();
        }
        if (this.zzeqq != null) {
            this.zzeqq.zzo(i, i2);
        }
        zzayh.zzelc.post(new zzbdd(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzaxz.m30v("AdMediaPlayerView surface destroyed");
        if (this.zzeqj != null && this.zzeqs == 0) {
            this.zzeqs = this.zzeqj.getCurrentPosition();
        }
        if (this.zzeqq != null) {
            this.zzeqq.zzabq();
        }
        zzayh.zzelc.post(new zzbde(this));
        zzar(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeqf.zzc(this);
        this.zzera.zza(surfaceTexture, this.zzeqt);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzaxz.m30v(sb.toString());
        zzayh.zzelc.post(new zzbcy(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r1 > r6) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzeql
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzeqm
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzeql
            if (r2 <= 0) goto L_0x0096
            int r2 = r5.zzeqm
            if (r2 <= 0) goto L_0x0096
            com.google.android.gms.internal.ads.zzbdx r2 = r5.zzeqq
            if (r2 != 0) goto L_0x0096
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0055
            if (r1 != r2) goto L_0x0055
            int r0 = r5.zzeql
            int r0 = r0 * r7
            int r1 = r5.zzeqm
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x0042
            int r6 = r5.zzeql
            int r6 = r6 * r7
            int r0 = r5.zzeqm
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0098
        L_0x0042:
            int r0 = r5.zzeql
            int r0 = r0 * r7
            int r1 = r5.zzeqm
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0098
            int r7 = r5.zzeqm
            int r7 = r7 * r6
            int r0 = r5.zzeql
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0055:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0067
            int r0 = r5.zzeqm
            int r0 = r0 * r6
            int r2 = r5.zzeql
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0065
            if (r0 <= r7) goto L_0x0065
            goto L_0x0098
        L_0x0065:
            r7 = r0
            goto L_0x0098
        L_0x0067:
            if (r1 != r2) goto L_0x0077
            int r1 = r5.zzeql
            int r1 = r1 * r7
            int r2 = r5.zzeqm
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            r6 = r1
            goto L_0x0098
        L_0x0077:
            int r2 = r5.zzeql
            int r4 = r5.zzeqm
            if (r1 != r3) goto L_0x0087
            if (r4 <= r7) goto L_0x0087
            int r1 = r5.zzeql
            int r1 = r1 * r7
            int r2 = r5.zzeqm
            int r1 = r1 / r2
            goto L_0x0089
        L_0x0087:
            r1 = r2
            r7 = r4
        L_0x0089:
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            int r7 = r5.zzeqm
            int r7 = r7 * r6
            int r0 = r5.zzeql
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            r7 = r1
        L_0x0098:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.zzbdx r0 = r5.zzeqq
            if (r0 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.zzbdx r0 = r5.zzeqq
            r0.zzo(r6, r7)
        L_0x00a4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00c1
            int r0 = r5.zzeqo
            if (r0 <= 0) goto L_0x00b2
            int r0 = r5.zzeqo
            if (r0 != r6) goto L_0x00ba
        L_0x00b2:
            int r0 = r5.zzeqp
            if (r0 <= 0) goto L_0x00bd
            int r0 = r5.zzeqp
            if (r0 == r7) goto L_0x00bd
        L_0x00ba:
            r5.zzabb()
        L_0x00bd:
            r5.zzeqo = r6
            r5.zzeqp = r7
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcx.onMeasure(int, int):void");
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzaba() {
        zzaxz.m30v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzeqk != null && surfaceTexture != null) {
            zzar(false);
            try {
                zzbv.zzlx();
                this.zzeqj = new MediaPlayer();
                this.zzeqj.setOnBufferingUpdateListener(this);
                this.zzeqj.setOnCompletionListener(this);
                this.zzeqj.setOnErrorListener(this);
                this.zzeqj.setOnInfoListener(this);
                this.zzeqj.setOnPreparedListener(this);
                this.zzeqj.setOnVideoSizeChangedListener(this);
                this.zzeqn = 0;
                if (this.zzeqr) {
                    this.zzeqq = new zzbdx(getContext());
                    this.zzeqq.zza(surfaceTexture, getWidth(), getHeight());
                    this.zzeqq.start();
                    SurfaceTexture zzabr = this.zzeqq.zzabr();
                    if (zzabr != null) {
                        surfaceTexture = zzabr;
                    } else {
                        this.zzeqq.zzabq();
                        this.zzeqq = null;
                    }
                }
                this.zzeqj.setDataSource(getContext(), this.zzeqk);
                zzbv.zzly();
                this.zzeqj.setSurface(new Surface(surfaceTexture));
                this.zzeqj.setAudioStreamType(3);
                this.zzeqj.setScreenOnWhilePlaying(true);
                this.zzeqj.prepareAsync();
                zzcx(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.zzeqk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                zzaxz.zzc(sb.toString(), e);
                onError(this.zzeqj, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzabb() {
        /*
            r8 = this;
            boolean r0 = r8.zzeqg
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.zzabc()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.zzeqj
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.zzeqi
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.zzaxz.m30v(r0)
            r0 = 0
            r8.zzd(r0)
            android.media.MediaPlayer r0 = r8.zzeqj
            r0.start()
            android.media.MediaPlayer r0 = r8.zzeqj
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r1 = r1.currentTimeMillis()
        L_0x0034:
            boolean r3 = r8.zzabc()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.zzeqj
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.zzeqj
            r0.pause()
            r8.zzabd()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcx.zzabb():void");
    }

    private final void zzar(boolean z) {
        zzaxz.m30v("AdMediaPlayerView release");
        if (this.zzeqq != null) {
            this.zzeqq.zzabq();
            this.zzeqq = null;
        }
        if (this.zzeqj != null) {
            this.zzeqj.reset();
            this.zzeqj.release();
            this.zzeqj = null;
            zzcx(0);
            if (z) {
                this.zzeqi = 0;
                this.zzeqi = 0;
            }
        }
    }

    public final void play() {
        zzaxz.m30v("AdMediaPlayerView play");
        if (zzabc()) {
            this.zzeqj.start();
            zzcx(3);
            this.zzera.zzabf();
            zzayh.zzelc.post(new zzbdf(this));
        }
        this.zzeqi = 3;
    }

    public final void pause() {
        zzaxz.m30v("AdMediaPlayerView pause");
        if (zzabc() && this.zzeqj.isPlaying()) {
            this.zzeqj.pause();
            zzcx(4);
            zzayh.zzelc.post(new zzbdg(this));
        }
        this.zzeqi = 4;
    }

    public final int getDuration() {
        if (zzabc()) {
            return this.zzeqj.getDuration();
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (zzabc()) {
            return this.zzeqj.getCurrentPosition();
        }
        return 0;
    }

    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzaxz.m30v(sb.toString());
        if (zzabc()) {
            this.zzeqj.seekTo(i);
            this.zzeqs = 0;
            return;
        }
        this.zzeqs = i;
    }

    private final boolean zzabc() {
        return (this.zzeqj == null || this.zzeqh == -1 || this.zzeqh == 0 || this.zzeqh == 1) ? false : true;
    }

    public final void zza(float f, float f2) {
        if (this.zzeqq != null) {
            this.zzeqq.zzb(f, f2);
        }
    }

    public final int getVideoWidth() {
        if (this.zzeqj != null) {
            return this.zzeqj.getVideoWidth();
        }
        return 0;
    }

    public final int getVideoHeight() {
        if (this.zzeqj != null) {
            return this.zzeqj.getVideoHeight();
        }
        return 0;
    }

    public final void zzabd() {
        zzd(this.zzerb.getVolume());
    }

    private final void zzd(float f) {
        if (this.zzeqj != null) {
            try {
                this.zzeqj.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzaxz.zzeo("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzcx(int i) {
        if (i == 3) {
            this.zzeqf.zzacd();
            this.zzerb.zzacd();
        } else if (this.zzeqh == 3) {
            this.zzeqf.zzace();
            this.zzerb.zzace();
        }
        this.zzeqh = i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzcy(int i) {
        if (this.zzeqt != null) {
            this.zzeqt.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzeqe.put(-1004, "MEDIA_ERROR_IO");
            zzeqe.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzeqe.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzeqe.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzeqe.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzeqe.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzeqe.put(1, "MEDIA_ERROR_UNKNOWN");
        zzeqe.put(1, "MEDIA_INFO_UNKNOWN");
        zzeqe.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzeqe.put(701, "MEDIA_INFO_BUFFERING_START");
        zzeqe.put(702, "MEDIA_INFO_BUFFERING_END");
        zzeqe.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzeqe.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzeqe.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzeqe.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzeqe.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
