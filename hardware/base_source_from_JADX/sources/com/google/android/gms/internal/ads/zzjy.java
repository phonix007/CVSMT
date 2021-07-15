package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class zzjy extends zzfd {
    private static final byte[] zzatt = zzqe.zzan("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzfs zzaad;
    private ByteBuffer[] zzadk;
    private final zzka zzatu;
    private final zzhu<Object> zzatv;
    private final boolean zzatw;
    private final zzho zzatx;
    private final zzho zzaty;
    private final zzfu zzatz;
    private final List<Long> zzaua;
    private final MediaCodec.BufferInfo zzaub;
    private zzhs<Object> zzauc;
    private zzhs<Object> zzaud;
    private MediaCodec zzaue;
    private zzjx zzauf;
    private boolean zzaug;
    private boolean zzauh;
    private boolean zzaui;
    private boolean zzauj;
    private boolean zzauk;
    private boolean zzaul;
    private boolean zzaum;
    private boolean zzaun;
    private boolean zzauo;
    private ByteBuffer[] zzaup;
    private long zzauq;
    private int zzaur;
    private int zzaus;
    private boolean zzaut;
    private boolean zzauu;
    private int zzauv;
    private int zzauw;
    private boolean zzaux;
    private boolean zzauy;
    private boolean zzauz;
    private boolean zzava;
    private boolean zzavb;
    private boolean zzavc;
    protected zzhn zzavd;

    public zzjy(int i, zzka zzka, zzhu<Object> zzhu, boolean z) {
        super(i);
        zzpo.checkState(zzqe.SDK_INT >= 16);
        this.zzatu = (zzka) zzpo.checkNotNull(zzka);
        this.zzatv = zzhu;
        this.zzatw = z;
        this.zzatx = new zzho(0);
        this.zzaty = new zzho(0);
        this.zzatz = new zzfu();
        this.zzaua = new ArrayList();
        this.zzaub = new MediaCodec.BufferInfo();
        this.zzauv = 0;
        this.zzauw = 0;
    }

    /* access modifiers changed from: protected */
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzff {
    }

    /* access modifiers changed from: protected */
    public void onStarted() {
    }

    /* access modifiers changed from: protected */
    public void onStopped() {
    }

    /* access modifiers changed from: protected */
    public abstract int zza(zzka zzka, zzfs zzfs) throws zzke;

    /* access modifiers changed from: protected */
    public void zza(zzho zzho) {
    }

    /* access modifiers changed from: protected */
    public abstract void zza(zzjx zzjx, MediaCodec mediaCodec, zzfs zzfs, MediaCrypto mediaCrypto) throws zzke;

    /* access modifiers changed from: protected */
    public abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzff;

    /* access modifiers changed from: protected */
    public boolean zza(MediaCodec mediaCodec, boolean z, zzfs zzfs, zzfs zzfs2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zza(zzjx zzjx) {
        return true;
    }

    public final int zzbl() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void zzc(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public void zzdj() throws zzff {
    }

    public final int zzb(zzfs zzfs) throws zzff {
        try {
            return zza(this.zzatu, zzfs);
        } catch (zzke e) {
            throw zzff.zza(e, getIndex());
        }
    }

    /* access modifiers changed from: protected */
    public zzjx zza(zzka zzka, zzfs zzfs, boolean z) throws zzke {
        return zzka.zzb(zzfs.zzzj, z);
    }

    /* access modifiers changed from: protected */
    public final void zzek() throws zzff {
        if (this.zzaue == null && this.zzaad != null) {
            this.zzauc = this.zzaud;
            String str = this.zzaad.zzzj;
            if (this.zzauc != null) {
                int state = this.zzauc.getState();
                if (state == 0) {
                    throw zzff.zza(this.zzauc.zzdv(), getIndex());
                } else if (state == 3 || state == 4) {
                    this.zzauc.zzdu();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.zzauf == null) {
                    try {
                        this.zzauf = zza(this.zzatu, this.zzaad, false);
                    } catch (zzke e) {
                        zza(new zzjz(this.zzaad, (Throwable) e, false, -49998));
                    }
                    if (this.zzauf == null) {
                        zza(new zzjz(this.zzaad, (Throwable) null, false, -49999));
                    }
                }
                if (zza(this.zzauf)) {
                    String str2 = this.zzauf.name;
                    this.zzaug = zzqe.SDK_INT < 21 && this.zzaad.zzzl.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    this.zzauh = zzqe.SDK_INT < 18 || (zzqe.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzqe.SDK_INT == 19 && zzqe.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.zzaui = zzqe.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzqe.DEVICE) || "flounder_lte".equals(zzqe.DEVICE) || "grouper".equals(zzqe.DEVICE) || "tilapia".equals(zzqe.DEVICE));
                    this.zzauj = zzqe.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.zzauk = (zzqe.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzqe.SDK_INT <= 19 && "hb2000".equals(zzqe.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.zzaul = zzqe.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.zzaum = zzqe.SDK_INT <= 18 && this.zzaad.zzzt == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzqc.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.zzaue = MediaCodec.createByCodecName(str2);
                        zzqc.endSection();
                        zzqc.beginSection("configureCodec");
                        zza(this.zzauf, this.zzaue, this.zzaad, (MediaCrypto) null);
                        zzqc.endSection();
                        zzqc.beginSection("startCodec");
                        this.zzaue.start();
                        zzqc.endSection();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.zzaup = this.zzaue.getInputBuffers();
                        this.zzadk = this.zzaue.getOutputBuffers();
                    } catch (Exception e2) {
                        zza(new zzjz(this.zzaad, (Throwable) e2, false, str2));
                    }
                    this.zzauq = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzaur = -1;
                    this.zzaus = -1;
                    this.zzavc = true;
                    this.zzavd.zzagg++;
                }
            }
        }
    }

    private final void zza(zzjz zzjz) throws zzff {
        throw zzff.zza(zzjz, getIndex());
    }

    /* access modifiers changed from: protected */
    public final MediaCodec zzel() {
        return this.zzaue;
    }

    /* access modifiers changed from: protected */
    public final zzjx zzem() {
        return this.zzauf;
    }

    /* access modifiers changed from: protected */
    public void zzb(boolean z) throws zzff {
        this.zzavd = new zzhn();
    }

    /* access modifiers changed from: protected */
    public void zza(long j, boolean z) throws zzff {
        this.zzauz = false;
        this.zzava = false;
        if (this.zzaue != null) {
            this.zzauq = -9223372036854775807L;
            this.zzaur = -1;
            this.zzaus = -1;
            this.zzavc = true;
            this.zzavb = false;
            this.zzaut = false;
            this.zzaua.clear();
            this.zzaun = false;
            this.zzauo = false;
            if (this.zzauh || (this.zzauk && this.zzauy)) {
                zzen();
                zzek();
            } else if (this.zzauw != 0) {
                zzen();
                zzek();
            } else {
                this.zzaue.flush();
                this.zzaux = false;
            }
            if (this.zzauu && this.zzaad != null) {
                this.zzauv = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzbm() {
        this.zzaad = null;
        try {
            zzen();
            try {
                if (this.zzauc != null) {
                    this.zzatv.zza(this.zzauc);
                }
                try {
                    if (!(this.zzaud == null || this.zzaud == this.zzauc)) {
                        this.zzatv.zza(this.zzaud);
                    }
                } finally {
                    this.zzauc = null;
                    this.zzaud = null;
                }
            } catch (Throwable th) {
                if (!(this.zzaud == null || this.zzaud == this.zzauc)) {
                    this.zzatv.zza(this.zzaud);
                }
                throw th;
            } finally {
                this.zzauc = null;
                this.zzaud = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.zzaud == null || this.zzaud == this.zzauc)) {
                    this.zzatv.zza(this.zzaud);
                }
                throw th2;
            } finally {
                this.zzauc = null;
                this.zzaud = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    public void zzen() {
        this.zzauq = -9223372036854775807L;
        this.zzaur = -1;
        this.zzaus = -1;
        this.zzavb = false;
        this.zzaut = false;
        this.zzaua.clear();
        this.zzaup = null;
        this.zzadk = null;
        this.zzauf = null;
        this.zzauu = false;
        this.zzaux = false;
        this.zzaug = false;
        this.zzauh = false;
        this.zzaui = false;
        this.zzauj = false;
        this.zzauk = false;
        this.zzaum = false;
        this.zzaun = false;
        this.zzauo = false;
        this.zzauy = false;
        this.zzauv = 0;
        this.zzauw = 0;
        this.zzatx.zzdd = null;
        if (this.zzaue != null) {
            this.zzavd.zzagh++;
            try {
                this.zzaue.stop();
                try {
                    this.zzaue.release();
                    this.zzaue = null;
                    if (this.zzauc != null && this.zzaud != this.zzauc) {
                        try {
                            this.zzatv.zza(this.zzauc);
                        } finally {
                            this.zzauc = null;
                        }
                    }
                } catch (Throwable th) {
                    this.zzaue = null;
                    if (!(this.zzauc == null || this.zzaud == this.zzauc)) {
                        this.zzatv.zza(this.zzauc);
                    }
                    throw th;
                } finally {
                    this.zzauc = null;
                }
            } catch (Throwable th2) {
                this.zzaue = null;
                if (!(this.zzauc == null || this.zzaud == this.zzauc)) {
                    try {
                        this.zzatv.zza(this.zzauc);
                    } finally {
                        this.zzauc = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    public final void zzb(long j, long j2) throws zzff {
        if (this.zzava) {
            zzdj();
            return;
        }
        if (this.zzaad == null) {
            this.zzaty.clear();
            int zza = zza(this.zzatz, this.zzaty, true);
            if (zza == -5) {
                zze(this.zzatz.zzaad);
            } else if (zza == -4) {
                zzpo.checkState(this.zzaty.zzdp());
                this.zzauz = true;
                zzep();
                return;
            } else {
                return;
            }
        }
        zzek();
        if (this.zzaue != null) {
            zzqc.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzeo());
            zzqc.endSection();
        } else {
            zze(j);
            this.zzaty.clear();
            int zza2 = zza(this.zzatz, this.zzaty, false);
            if (zza2 == -5) {
                zze(this.zzatz.zzaad);
            } else if (zza2 == -4) {
                zzpo.checkState(this.zzaty.zzdp());
                this.zzauz = true;
                zzep();
            }
        }
        this.zzavd.zzds();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzeo() throws com.google.android.gms.internal.ads.zzff {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.zzaue
            r1 = 0
            if (r0 == 0) goto L_0x01de
            int r0 = r14.zzauw
            r2 = 2
            if (r0 == r2) goto L_0x01de
            boolean r0 = r14.zzauz
            if (r0 == 0) goto L_0x0010
            goto L_0x01de
        L_0x0010:
            int r0 = r14.zzaur
            if (r0 >= 0) goto L_0x0032
            android.media.MediaCodec r0 = r14.zzaue
            r3 = 0
            int r0 = r0.dequeueInputBuffer(r3)
            r14.zzaur = r0
            int r0 = r14.zzaur
            if (r0 >= 0) goto L_0x0023
            return r1
        L_0x0023:
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            java.nio.ByteBuffer[] r3 = r14.zzaup
            int r4 = r14.zzaur
            r3 = r3[r4]
            r0.zzdd = r3
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            r0.clear()
        L_0x0032:
            int r0 = r14.zzauw
            r3 = -1
            r4 = 1
            if (r0 != r4) goto L_0x004f
            boolean r0 = r14.zzauj
            if (r0 != 0) goto L_0x004c
            r14.zzauy = r4
            android.media.MediaCodec r5 = r14.zzaue
            int r6 = r14.zzaur
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzaur = r3
        L_0x004c:
            r14.zzauw = r2
            return r1
        L_0x004f:
            boolean r0 = r14.zzaun
            if (r0 == 0) goto L_0x0071
            r14.zzaun = r1
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            java.nio.ByteBuffer r0 = r0.zzdd
            byte[] r1 = zzatt
            r0.put(r1)
            android.media.MediaCodec r5 = r14.zzaue
            int r6 = r14.zzaur
            r7 = 0
            byte[] r0 = zzatt
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.zzaur = r3
            r14.zzaux = r4
            return r4
        L_0x0071:
            boolean r0 = r14.zzavb
            if (r0 == 0) goto L_0x0078
            r0 = -4
            r5 = 0
            goto L_0x00b0
        L_0x0078:
            int r0 = r14.zzauv
            if (r0 != r4) goto L_0x009d
            r0 = 0
        L_0x007d:
            com.google.android.gms.internal.ads.zzfs r5 = r14.zzaad
            java.util.List<byte[]> r5 = r5.zzzl
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x009b
            com.google.android.gms.internal.ads.zzfs r5 = r14.zzaad
            java.util.List<byte[]> r5 = r5.zzzl
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zzho r6 = r14.zzatx
            java.nio.ByteBuffer r6 = r6.zzdd
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x007d
        L_0x009b:
            r14.zzauv = r2
        L_0x009d:
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            java.nio.ByteBuffer r0 = r0.zzdd
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzfu r5 = r14.zzatz
            com.google.android.gms.internal.ads.zzho r6 = r14.zzatx
            int r5 = r14.zza((com.google.android.gms.internal.ads.zzfu) r5, (com.google.android.gms.internal.ads.zzho) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00b0:
            r6 = -3
            if (r0 != r6) goto L_0x00b4
            return r1
        L_0x00b4:
            r6 = -5
            if (r0 != r6) goto L_0x00ca
            int r0 = r14.zzauv
            if (r0 != r2) goto L_0x00c2
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            r0.clear()
            r14.zzauv = r4
        L_0x00c2:
            com.google.android.gms.internal.ads.zzfu r0 = r14.zzatz
            com.google.android.gms.internal.ads.zzfs r0 = r0.zzaad
            r14.zze(r0)
            return r4
        L_0x00ca:
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            boolean r0 = r0.zzdp()
            if (r0 == 0) goto L_0x0106
            int r0 = r14.zzauv
            if (r0 != r2) goto L_0x00dd
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            r0.clear()
            r14.zzauv = r4
        L_0x00dd:
            r14.zzauz = r4
            boolean r0 = r14.zzaux
            if (r0 != 0) goto L_0x00e7
            r14.zzep()
            return r1
        L_0x00e7:
            boolean r0 = r14.zzauj     // Catch:{ CryptoException -> 0x00fc }
            if (r0 != 0) goto L_0x00fb
            r14.zzauy = r4     // Catch:{ CryptoException -> 0x00fc }
            android.media.MediaCodec r5 = r14.zzaue     // Catch:{ CryptoException -> 0x00fc }
            int r6 = r14.zzaur     // Catch:{ CryptoException -> 0x00fc }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00fc }
            r14.zzaur = r3     // Catch:{ CryptoException -> 0x00fc }
        L_0x00fb:
            return r1
        L_0x00fc:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzff r0 = com.google.android.gms.internal.ads.zzff.zza(r0, r1)
            throw r0
        L_0x0106:
            boolean r0 = r14.zzavc
            if (r0 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            boolean r0 = r0.zzdq()
            if (r0 != 0) goto L_0x011e
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            r0.clear()
            int r0 = r14.zzauv
            if (r0 != r2) goto L_0x011d
            r14.zzauv = r4
        L_0x011d:
            return r4
        L_0x011e:
            r14.zzavc = r1
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx
            boolean r0 = r0.zzdt()
            com.google.android.gms.internal.ads.zzhs<java.lang.Object> r2 = r14.zzauc
            if (r2 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzhs<java.lang.Object> r2 = r14.zzauc
            int r2 = r2.getState()
            if (r2 == 0) goto L_0x013d
            r6 = 4
            if (r2 == r6) goto L_0x014c
            if (r0 != 0) goto L_0x013b
            boolean r2 = r14.zzatw
            if (r2 != 0) goto L_0x014c
        L_0x013b:
            r2 = 1
            goto L_0x014d
        L_0x013d:
            com.google.android.gms.internal.ads.zzhs<java.lang.Object> r0 = r14.zzauc
            com.google.android.gms.internal.ads.zzht r0 = r0.zzdv()
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzff r0 = com.google.android.gms.internal.ads.zzff.zza(r0, r1)
            throw r0
        L_0x014c:
            r2 = 0
        L_0x014d:
            r14.zzavb = r2
            boolean r2 = r14.zzavb
            if (r2 == 0) goto L_0x0154
            return r1
        L_0x0154:
            boolean r2 = r14.zzaug
            if (r2 == 0) goto L_0x016e
            if (r0 != 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx
            java.nio.ByteBuffer r2 = r2.zzdd
            com.google.android.gms.internal.ads.zzpu.zzk(r2)
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx
            java.nio.ByteBuffer r2 = r2.zzdd
            int r2 = r2.position()
            if (r2 != 0) goto L_0x016c
            return r4
        L_0x016c:
            r14.zzaug = r1
        L_0x016e:
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            long r10 = r2.zzago     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            boolean r2 = r2.zzdo()     // Catch:{ CryptoException -> 0x01d4 }
            if (r2 == 0) goto L_0x0183
            java.util.List<java.lang.Long> r2 = r14.zzaua     // Catch:{ CryptoException -> 0x01d4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01d4 }
            r2.add(r6)     // Catch:{ CryptoException -> 0x01d4 }
        L_0x0183:
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            java.nio.ByteBuffer r2 = r2.zzdd     // Catch:{ CryptoException -> 0x01d4 }
            r2.flip()     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.zzho r2 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            r14.zza((com.google.android.gms.internal.ads.zzho) r2)     // Catch:{ CryptoException -> 0x01d4 }
            if (r0 == 0) goto L_0x01b5
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.zzhk r0 = r0.zzagn     // Catch:{ CryptoException -> 0x01d4 }
            android.media.MediaCodec$CryptoInfo r9 = r0.zzdr()     // Catch:{ CryptoException -> 0x01d4 }
            if (r5 != 0) goto L_0x019c
            goto L_0x01ab
        L_0x019c:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d4 }
            if (r0 != 0) goto L_0x01a4
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01d4 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01a4:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01d4 }
            r2 = r0[r1]     // Catch:{ CryptoException -> 0x01d4 }
            int r2 = r2 + r5
            r0[r1] = r2     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01ab:
            android.media.MediaCodec r6 = r14.zzaue     // Catch:{ CryptoException -> 0x01d4 }
            int r7 = r14.zzaur     // Catch:{ CryptoException -> 0x01d4 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d4 }
            goto L_0x01c6
        L_0x01b5:
            android.media.MediaCodec r6 = r14.zzaue     // Catch:{ CryptoException -> 0x01d4 }
            int r7 = r14.zzaur     // Catch:{ CryptoException -> 0x01d4 }
            r8 = 0
            com.google.android.gms.internal.ads.zzho r0 = r14.zzatx     // Catch:{ CryptoException -> 0x01d4 }
            java.nio.ByteBuffer r0 = r0.zzdd     // Catch:{ CryptoException -> 0x01d4 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01d4 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01d4 }
        L_0x01c6:
            r14.zzaur = r3     // Catch:{ CryptoException -> 0x01d4 }
            r14.zzaux = r4     // Catch:{ CryptoException -> 0x01d4 }
            r14.zzauv = r1     // Catch:{ CryptoException -> 0x01d4 }
            com.google.android.gms.internal.ads.zzhn r0 = r14.zzavd     // Catch:{ CryptoException -> 0x01d4 }
            int r1 = r0.zzagi     // Catch:{ CryptoException -> 0x01d4 }
            int r1 = r1 + r4
            r0.zzagi = r1     // Catch:{ CryptoException -> 0x01d4 }
            return r4
        L_0x01d4:
            r0 = move-exception
            int r1 = r14.getIndex()
            com.google.android.gms.internal.ads.zzff r0 = com.google.android.gms.internal.ads.zzff.zza(r0, r1)
            throw r0
        L_0x01de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjy.zzeo():boolean");
    }

    /* access modifiers changed from: protected */
    public void zze(zzfs zzfs) throws zzff {
        zzhp zzhp;
        zzfs zzfs2 = this.zzaad;
        this.zzaad = zzfs;
        zzhp zzhp2 = this.zzaad.zzzm;
        if (zzfs2 == null) {
            zzhp = null;
        } else {
            zzhp = zzfs2.zzzm;
        }
        boolean zza = zzqe.zza((Object) zzhp2, (Object) zzhp);
        boolean z = true;
        if (!zza) {
            if (this.zzaad.zzzm == null) {
                this.zzaud = null;
            } else if (this.zzatv != null) {
                this.zzaud = this.zzatv.zza(Looper.myLooper(), this.zzaad.zzzm);
                if (this.zzaud == this.zzauc) {
                    this.zzatv.zza(this.zzaud);
                }
            } else {
                throw zzff.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
            }
        }
        if (this.zzaud == this.zzauc && this.zzaue != null && zza(this.zzaue, this.zzauf.zzatq, zzfs2, this.zzaad)) {
            this.zzauu = true;
            this.zzauv = 1;
            if (!(this.zzaui && this.zzaad.width == zzfs2.width && this.zzaad.height == zzfs2.height)) {
                z = false;
            }
            this.zzaun = z;
        } else if (this.zzaux) {
            this.zzauw = 1;
        } else {
            zzen();
            zzek();
        }
    }

    public boolean zzcj() {
        return this.zzava;
    }

    public boolean isReady() {
        if (this.zzaad == null || this.zzavb) {
            return false;
        }
        if (zzbo() || this.zzaus >= 0) {
            return true;
        }
        return this.zzauq != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzauq;
    }

    private final boolean zzd(long j, long j2) throws zzff {
        boolean z;
        boolean z2;
        if (this.zzaus < 0) {
            if (!this.zzaul || !this.zzauy) {
                this.zzaus = this.zzaue.dequeueOutputBuffer(this.zzaub, 0);
            } else {
                try {
                    this.zzaus = this.zzaue.dequeueOutputBuffer(this.zzaub, 0);
                } catch (IllegalStateException unused) {
                    zzep();
                    if (this.zzava) {
                        zzen();
                    }
                    return false;
                }
            }
            if (this.zzaus >= 0) {
                if (this.zzauo) {
                    this.zzauo = false;
                    this.zzaue.releaseOutputBuffer(this.zzaus, false);
                    this.zzaus = -1;
                    return true;
                } else if ((this.zzaub.flags & 4) != 0) {
                    zzep();
                    this.zzaus = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.zzadk[this.zzaus];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.zzaub.offset);
                        byteBuffer.limit(this.zzaub.offset + this.zzaub.size);
                    }
                    long j3 = this.zzaub.presentationTimeUs;
                    int size = this.zzaua.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z2 = false;
                            break;
                        } else if (this.zzaua.get(i).longValue() == j3) {
                            this.zzaua.remove(i);
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.zzaut = z2;
                }
            } else if (this.zzaus == -2) {
                MediaFormat outputFormat = this.zzaue.getOutputFormat();
                if (this.zzaui && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzauo = true;
                } else {
                    if (this.zzaum) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzaue, outputFormat);
                }
                return true;
            } else if (this.zzaus == -3) {
                this.zzadk = this.zzaue.getOutputBuffers();
                return true;
            } else {
                if (this.zzauj && (this.zzauz || this.zzauw == 2)) {
                    zzep();
                }
                return false;
            }
        }
        if (!this.zzaul || !this.zzauy) {
            z = zza(j, j2, this.zzaue, this.zzadk[this.zzaus], this.zzaus, this.zzaub.flags, this.zzaub.presentationTimeUs, this.zzaut);
        } else {
            try {
                z = zza(j, j2, this.zzaue, this.zzadk[this.zzaus], this.zzaus, this.zzaub.flags, this.zzaub.presentationTimeUs, this.zzaut);
            } catch (IllegalStateException unused2) {
                zzep();
                if (this.zzava) {
                    zzen();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.zzaub.presentationTimeUs;
        this.zzaus = -1;
        return true;
    }

    private final void zzep() throws zzff {
        if (this.zzauw == 2) {
            zzen();
            zzek();
            return;
        }
        this.zzava = true;
        zzdj();
    }
}
