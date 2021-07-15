package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.apps.saiinfo.computerhardware.BuildConfig;
import com.google.android.gms.ads.internal.zzbv;
import java.nio.ByteBuffer;

@zzark
@TargetApi(16)
public final class zzbee extends zzbdi implements TextureView.SurfaceTextureListener, zzbez {
    private Surface zzbjb;
    private final zzbdz zzerw;
    private final zzbea zzeum;
    private final boolean zzeun;
    private final zzbdy zzeuo;
    private zzbdh zzeup;
    private zzbes zzeuq;
    private String zzeur;
    private boolean zzeus;
    private int zzeut = 1;
    private zzbdx zzeuu;
    private final boolean zzeuv;
    private boolean zzeuw;
    private boolean zzeux;
    private int zzeuy;
    private int zzeuz;
    private int zzeva;
    private int zzevb;
    private float zzevc;

    public zzbee(Context context, zzbea zzbea, zzbdz zzbdz, boolean z, boolean z2, zzbdy zzbdy) {
        super(context);
        this.zzeun = z2;
        this.zzerw = zzbdz;
        this.zzeum = zzbea;
        this.zzeuv = z;
        this.zzeuo = zzbdy;
        setSurfaceTextureListener(this);
        this.zzeum.zzb(this);
    }

    private final zzbes zzach() {
        return new zzbes(this.zzerw.getContext(), this.zzeuo);
    }

    private final String zzaci() {
        return zzbv.zzlf().zzo(this.zzerw.getContext(), this.zzerw.zzabz().zzdp);
    }

    private final boolean zzacj() {
        return this.zzeuq != null && !this.zzeus;
    }

    private final boolean zzack() {
        return zzacj() && this.zzeut != 1;
    }

    private final void zzacl() {
        if (this.zzeuq == null && this.zzeur != null && this.zzbjb != null) {
            if (this.zzeur.startsWith("cache:")) {
                zzbfk zzet = this.zzerw.zzet(this.zzeur);
                if (zzet instanceof zzbfw) {
                    this.zzeuq = ((zzbfw) zzet).zzadd();
                } else if (zzet instanceof zzbfv) {
                    zzbfv zzbfv = (zzbfv) zzet;
                    String zzaci = zzaci();
                    ByteBuffer byteBuffer = zzbfv.getByteBuffer();
                    boolean zzadc = zzbfv.zzadc();
                    String url = zzbfv.getUrl();
                    if (url == null) {
                        zzaxz.zzeo("Stream cache URL is null.");
                        return;
                    } else {
                        this.zzeuq = zzach();
                        this.zzeuq.zza(Uri.parse(url), zzaci, byteBuffer, zzadc);
                    }
                } else {
                    String valueOf = String.valueOf(this.zzeur);
                    zzaxz.zzeo(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.zzeuq = zzach();
                this.zzeuq.zza(Uri.parse(this.zzeur), zzaci());
            }
            this.zzeuq.zza((zzbez) this);
            zza(this.zzbjb, false);
            this.zzeut = this.zzeuq.zzacw().getPlaybackState();
            if (this.zzeut == 3) {
                zzacm();
            }
        }
    }

    private final void zza(Surface surface, boolean z) {
        if (this.zzeuq != null) {
            this.zzeuq.zza(surface, z);
        } else {
            zzaxz.zzeo("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        if (this.zzeuq != null) {
            this.zzeuq.zzb(f, z);
        } else {
            zzaxz.zzeo("Trying to set volume before player is initalized.");
        }
    }

    public final void zzabd() {
        zza(this.zzerb.getVolume(), false);
    }

    private final void zzacm() {
        if (!this.zzeuw) {
            this.zzeuw = true;
            zzayh.zzelc.post(new zzbef(this));
            zzabd();
            this.zzeum.zzcg();
            if (this.zzeux) {
                play();
            }
        }
    }

    public final String zzaaz() {
        String valueOf = String.valueOf("ExoPlayer/3");
        String valueOf2 = String.valueOf(this.zzeuv ? " spherical" : BuildConfig.FLAVOR);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final void zza(zzbdh zzbdh) {
        this.zzeup = zzbdh;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzeur = str;
            zzacl();
        }
    }

    public final void play() {
        if (zzack()) {
            if (this.zzeuo.zzetk) {
                zzaco();
            }
            this.zzeuq.zzacw().zzc(true);
            this.zzeum.zzacd();
            this.zzerb.zzacd();
            this.zzera.zzabf();
            zzayh.zzelc.post(new zzbei(this));
            return;
        }
        this.zzeux = true;
    }

    public final void stop() {
        if (zzacj()) {
            this.zzeuq.zzacw().stop();
            if (this.zzeuq != null) {
                zza((Surface) null, true);
                if (this.zzeuq != null) {
                    this.zzeuq.zza((zzbez) null);
                    this.zzeuq.release();
                    this.zzeuq = null;
                }
                this.zzeut = 1;
                this.zzeus = false;
                this.zzeuw = false;
                this.zzeux = false;
            }
        }
        this.zzeum.zzace();
        this.zzerb.zzace();
        this.zzeum.onStop();
    }

    public final void pause() {
        if (zzack()) {
            if (this.zzeuo.zzetk) {
                zzacp();
            }
            this.zzeuq.zzacw().zzc(false);
            this.zzeum.zzace();
            this.zzerb.zzace();
            zzayh.zzelc.post(new zzbej(this));
        }
    }

    public final void seekTo(int i) {
        if (zzack()) {
            this.zzeuq.zzacw().seekTo((long) i);
        }
    }

    public final void zzcz(int i) {
        if (this.zzeuq != null) {
            this.zzeuq.zzacz().zzdf(i);
        }
    }

    public final void zzda(int i) {
        if (this.zzeuq != null) {
            this.zzeuq.zzacz().zzdg(i);
        }
    }

    public final void zzdb(int i) {
        if (this.zzeuq != null) {
            this.zzeuq.zzacz().zzdb(i);
        }
    }

    public final void zzdc(int i) {
        if (this.zzeuq != null) {
            this.zzeuq.zzacz().zzdc(i);
        }
    }

    public final void zza(float f, float f2) {
        if (this.zzeuu != null) {
            this.zzeuu.zzb(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (zzack()) {
            return (int) this.zzeuq.zzacw().zzbr();
        }
        return 0;
    }

    public final int getDuration() {
        if (zzack()) {
            return (int) this.zzeuq.zzacw().getDuration();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.zzeuy;
    }

    public final int getVideoHeight() {
        return this.zzeuz;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[LOOP:0: B:32:0x0086->B:37:0x00a1, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.zzevc
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.zzbdx r0 = r10.zzeuu
            if (r0 != 0) goto L_0x0030
            float r0 = (float) r11
            float r2 = (float) r12
            float r2 = r0 / r2
            float r3 = r10.zzevc
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0024
            float r12 = r10.zzevc
            float r0 = r0 / r12
            int r12 = (int) r0
        L_0x0024:
            float r0 = r10.zzevc
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
            float r11 = (float) r12
            float r0 = r10.zzevc
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x0030:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.zzbdx r0 = r10.zzeuu
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzbdx r0 = r10.zzeuu
            r0.zzo(r11, r12)
        L_0x003c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00ae
            int r0 = r10.zzeva
            if (r0 <= 0) goto L_0x004a
            int r0 = r10.zzeva
            if (r0 != r11) goto L_0x0052
        L_0x004a:
            int r0 = r10.zzevb
            if (r0 <= 0) goto L_0x00aa
            int r0 = r10.zzevb
            if (r0 == r12) goto L_0x00aa
        L_0x0052:
            boolean r0 = r10.zzeun
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r10.zzacj()
            if (r0 == 0) goto L_0x00aa
            com.google.android.gms.internal.ads.zzbes r0 = r10.zzeuq
            com.google.android.gms.internal.ads.zzfg r0 = r0.zzacw()
            long r2 = r0.zzbr()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00aa
            boolean r2 = r0.zzbp()
            if (r2 == 0) goto L_0x0073
            goto L_0x00aa
        L_0x0073:
            r2 = 1
            r10.zza((float) r1, (boolean) r2)
            r0.zzc(r2)
            long r1 = r0.zzbr()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r3 = r3.currentTimeMillis()
        L_0x0086:
            boolean r5 = r10.zzacj()
            if (r5 == 0) goto L_0x00a3
            long r5 = r0.zzbr()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzbv.zzlm()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0086
        L_0x00a3:
            r1 = 0
            r0.zzc(r1)
            r10.zzabd()
        L_0x00aa:
            r10.zzeva = r11
            r10.zzevb = r12
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeuv) {
            this.zzeuu = new zzbdx(getContext());
            this.zzeuu.zza(surfaceTexture, i, i2);
            this.zzeuu.start();
            SurfaceTexture zzabr = this.zzeuu.zzabr();
            if (zzabr != null) {
                surfaceTexture = zzabr;
            } else {
                this.zzeuu.zzabq();
                this.zzeuu = null;
            }
        }
        this.zzbjb = new Surface(surfaceTexture);
        if (this.zzeuq == null) {
            zzacl();
        } else {
            zza(this.zzbjb, true);
            if (!this.zzeuo.zzetk) {
                zzaco();
            }
        }
        zzacn();
        zzayh.zzelc.post(new zzbek(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeuu != null) {
            this.zzeuu.zzo(i, i2);
        }
        zzayh.zzelc.post(new zzbel(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeum.zzc(this);
        this.zzera.zza(surfaceTexture, this.zzeup);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        if (this.zzeuu != null) {
            this.zzeuu.zzabq();
            this.zzeuu = null;
        }
        if (this.zzeuq != null) {
            zzacp();
            if (this.zzbjb != null) {
                this.zzbjb.release();
            }
            this.zzbjb = null;
            zza((Surface) null, true);
        }
        zzayh.zzelc.post(new zzbem(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzaxz.m30v(sb.toString());
        zzayh.zzelc.post(new zzben(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzb(boolean z, long j) {
        if (this.zzerw != null) {
            zzbcg.zzepo.execute(new zzbeo(this, z, j));
        }
    }

    public final void zzdd(int i) {
        if (this.zzeut != i) {
            this.zzeut = i;
            switch (i) {
                case 3:
                    zzacm();
                    return;
                case 4:
                    if (this.zzeuo.zzetk) {
                        zzacp();
                    }
                    this.zzeum.zzace();
                    this.zzerb.zzace();
                    zzayh.zzelc.post(new zzbeg(this));
                    return;
                default:
                    return;
            }
        }
    }

    public final void zzp(int i, int i2) {
        this.zzeuy = i;
        this.zzeuz = i2;
        zzacn();
    }

    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzaxz.zzeo(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzeus = true;
        if (this.zzeuo.zzetk) {
            zzacp();
        }
        zzayh.zzelc.post(new zzbeh(this, sb2));
    }

    private final void zzacn() {
        float f = this.zzeuz > 0 ? ((float) this.zzeuy) / ((float) this.zzeuz) : 1.0f;
        if (this.zzevc != f) {
            this.zzevc = f;
            requestLayout();
        }
    }

    private final void zzaco() {
        if (this.zzeuq != null) {
            this.zzeuq.zzau(true);
        }
    }

    private final void zzacp() {
        if (this.zzeuq != null) {
            this.zzeuq.zzau(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzerw.zza(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzde(int i) {
        if (this.zzeup != null) {
            this.zzeup.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacq() {
        if (this.zzeup != null) {
            this.zzeup.zzabh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i, int i2) {
        if (this.zzeup != null) {
            this.zzeup.zzm(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacr() {
        if (this.zzeup != null) {
            this.zzeup.zzabe();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacs() {
        if (this.zzeup != null) {
            this.zzeup.onPaused();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzact() {
        if (this.zzeup != null) {
            this.zzeup.zzabf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzeu(String str) {
        if (this.zzeup != null) {
            this.zzeup.zzi("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacu() {
        if (this.zzeup != null) {
            this.zzeup.zzabg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzacv() {
        if (this.zzeup != null) {
            this.zzeup.zzcg();
        }
    }
}
