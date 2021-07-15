package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.p000v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzgs {
    private static boolean zzabu = false;
    private static boolean zzabv = false;
    private int streamType;
    private final zzgh zzabw = null;
    private final zzhb zzabx;
    private final zzhi zzaby;
    private final zzgi[] zzabz;
    private final zzgy zzaca;
    /* access modifiers changed from: private */
    public final ConditionVariable zzacb;
    private final long[] zzacc;
    private final zzgu zzacd;
    private final LinkedList<zzgz> zzace;
    private AudioTrack zzacf;
    private int zzacg;
    private int zzach;
    private int zzaci;
    private boolean zzacj;
    private int zzack;
    private long zzacl;
    private zzfy zzacm;
    private long zzacn;
    private long zzaco;
    private ByteBuffer zzacp;
    private int zzacq;
    private int zzacr;
    private int zzacs;
    private long zzact;
    private long zzacu;
    private boolean zzacv;
    private long zzacw;
    private Method zzacx;
    private int zzacy;
    private long zzacz;
    private long zzada;
    private int zzadb;
    private long zzadc;
    private long zzadd;
    private int zzade;
    private int zzadf;
    private long zzadg;
    private long zzadh;
    private long zzadi;
    private zzgi[] zzadj;
    private ByteBuffer[] zzadk;
    private ByteBuffer zzadl;
    private ByteBuffer zzadm;
    private byte[] zzadn;
    private int zzado;
    private int zzadp;
    private boolean zzadq;
    private boolean zzadr;
    private int zzads;
    private boolean zzadt;
    private boolean zzadu;
    private long zzadv;
    private float zzcu;
    private zzfy zzxm;
    private int zzzu;

    public zzgs(zzgh zzgh, zzgi[] zzgiArr, zzgy zzgy) {
        this.zzaca = zzgy;
        this.zzacb = new ConditionVariable(true);
        if (zzqe.SDK_INT >= 18) {
            try {
                this.zzacx = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzqe.SDK_INT >= 19) {
            this.zzacd = new zzgv();
        } else {
            this.zzacd = new zzgu((zzgt) null);
        }
        this.zzabx = new zzhb();
        this.zzaby = new zzhi();
        this.zzabz = new zzgi[(zzgiArr.length + 3)];
        this.zzabz[0] = new zzhg();
        this.zzabz[1] = this.zzabx;
        System.arraycopy(zzgiArr, 0, this.zzabz, 2, zzgiArr.length);
        this.zzabz[zzgiArr.length + 2] = this.zzaby;
        this.zzacc = new long[10];
        this.zzcu = 1.0f;
        this.zzadf = 0;
        this.streamType = 3;
        this.zzads = 0;
        this.zzxm = zzfy.zzaaf;
        this.zzadp = -1;
        this.zzadj = new zzgi[0];
        this.zzadk = new ByteBuffer[0];
        this.zzace = new LinkedList<>();
    }

    public final boolean zzq(String str) {
        return this.zzabw != null && this.zzabw.zzk(zzr(str));
    }

    public final long zzg(boolean z) {
        long j;
        long j2;
        long j3;
        if (!(isInitialized() && this.zzadf != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.zzacf.getPlayState() == 3) {
            long zzde = this.zzacd.zzde();
            if (zzde != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzacu >= 30000) {
                    this.zzacc[this.zzacr] = zzde - nanoTime;
                    this.zzacr = (this.zzacr + 1) % 10;
                    if (this.zzacs < 10) {
                        this.zzacs++;
                    }
                    this.zzacu = nanoTime;
                    this.zzact = 0;
                    for (int i = 0; i < this.zzacs; i++) {
                        this.zzact += this.zzacc[i] / ((long) this.zzacs);
                    }
                }
                if (!zzdc() && nanoTime - this.zzacw >= 500000) {
                    this.zzacv = this.zzacd.zzdf();
                    if (this.zzacv) {
                        long zzdg = this.zzacd.zzdg() / 1000;
                        long zzdh = this.zzacd.zzdh();
                        if (zzdg < this.zzadh) {
                            this.zzacv = false;
                        } else if (Math.abs(zzdg - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzdh);
                            sb.append(", ");
                            sb.append(zzdg);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zzde);
                            Log.w("AudioTrack", sb.toString());
                            this.zzacv = false;
                        } else if (Math.abs(zzn(zzdh) - zzde) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzdh);
                            sb2.append(", ");
                            sb2.append(zzdg);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zzde);
                            Log.w("AudioTrack", sb2.toString());
                            this.zzacv = false;
                        }
                    }
                    if (this.zzacx != null && !this.zzacj) {
                        try {
                            this.zzadi = (((long) ((Integer) this.zzacx.invoke(this.zzacf, (Object[]) null)).intValue()) * 1000) - this.zzacl;
                            this.zzadi = Math.max(this.zzadi, 0);
                            if (this.zzadi > 5000000) {
                                long j4 = this.zzadi;
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(j4);
                                Log.w("AudioTrack", sb3.toString());
                                this.zzadi = 0;
                            }
                        } catch (Exception unused) {
                            this.zzacx = null;
                        }
                    }
                    this.zzacw = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzacv) {
            j = zzn(this.zzacd.zzdh() + zzo(nanoTime2 - (this.zzacd.zzdg() / 1000)));
        } else {
            if (this.zzacs == 0) {
                j3 = this.zzacd.zzde();
            } else {
                j3 = nanoTime2 + this.zzact;
            }
            j = j3;
            if (!z) {
                j -= this.zzadi;
            }
        }
        long j5 = this.zzadg;
        while (!this.zzace.isEmpty() && j >= this.zzace.getFirst().zzyz) {
            zzgz remove = this.zzace.remove();
            this.zzxm = remove.zzxm;
            this.zzaco = remove.zzyz;
            this.zzacn = remove.zzaek - this.zzadg;
        }
        if (this.zzxm.zzaag == 1.0f) {
            j2 = (j + this.zzacn) - this.zzaco;
        } else if (!this.zzace.isEmpty() || this.zzaby.zzdn() < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j6 = this.zzacn;
            double d = (double) this.zzxm.zzaag;
            double d2 = (double) (j - this.zzaco);
            Double.isNaN(d);
            Double.isNaN(d2);
            j2 = ((long) (d * d2)) + j6;
        } else {
            j2 = zzqe.zza(j - this.zzaco, this.zzaby.zzdm(), this.zzaby.zzdn()) + this.zzacn;
        }
        return j5 + j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzgw {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = zzr(r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004f
            int r11 = com.google.android.gms.internal.ads.zzqe.zzg((int) r11, (int) r9)
            r7.zzacy = r11
            com.google.android.gms.internal.ads.zzhb r11 = r7.zzabx
            r11.zzb(r13)
            com.google.android.gms.internal.ads.zzgi[] r11 = r7.zzabz
            int r13 = r11.length
            r3 = r8
            r2 = r9
            r8 = 0
            r9 = 0
        L_0x0025:
            if (r8 >= r13) goto L_0x0046
            r4 = r11[r8]
            boolean r5 = r4.zzb(r10, r2, r3)     // Catch:{ zzgj -> 0x003f }
            r9 = r9 | r5
            boolean r5 = r4.isActive()
            if (r5 == 0) goto L_0x003c
            int r2 = r4.zzco()
            int r3 = r4.zzcp()
        L_0x003c:
            int r8 = r8 + 1
            goto L_0x0025
        L_0x003f:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzgw r9 = new com.google.android.gms.internal.ads.zzgw
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0046:
            if (r9 == 0) goto L_0x004b
            r7.zzcs()
        L_0x004b:
            r11 = r9
            r9 = r2
            r8 = r3
            goto L_0x0050
        L_0x004f:
            r11 = 0
        L_0x0050:
            r13 = 252(0xfc, float:3.53E-43)
            r2 = 12
            switch(r9) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0082;
                case 3: goto L_0x007f;
                case 4: goto L_0x007c;
                case 5: goto L_0x0079;
                case 6: goto L_0x0076;
                case 7: goto L_0x0073;
                case 8: goto L_0x0070;
                default: goto L_0x0057;
            }
        L_0x0057:
            com.google.android.gms.internal.ads.zzgw r8 = new com.google.android.gms.internal.ads.zzgw
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x0070:
            int r3 = com.google.android.gms.internal.ads.zzfe.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x0086
        L_0x0073:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0086
        L_0x0076:
            r3 = 252(0xfc, float:3.53E-43)
            goto L_0x0086
        L_0x0079:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x0086
        L_0x007c:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x0086
        L_0x007f:
            r3 = 28
            goto L_0x0086
        L_0x0082:
            r3 = 12
            goto L_0x0086
        L_0x0085:
            r3 = 4
        L_0x0086:
            int r4 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00ad
            java.lang.String r4 = "foster"
            java.lang.String r5 = com.google.android.gms.internal.ads.zzqe.DEVICE
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = "NVIDIA"
            java.lang.String r5 = com.google.android.gms.internal.ads.zzqe.MANUFACTURER
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ad
            r4 = 3
            if (r9 == r4) goto L_0x00ae
            if (r9 == r6) goto L_0x00ae
            r13 = 7
            if (r9 == r13) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            int r13 = com.google.android.gms.internal.ads.zzfe.CHANNEL_OUT_7POINT1_SURROUND
            goto L_0x00ae
        L_0x00ad:
            r13 = r3
        L_0x00ae:
            int r3 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            r4 = 25
            if (r3 > r4) goto L_0x00c4
            java.lang.String r3 = "fugu"
            java.lang.String r4 = com.google.android.gms.internal.ads.zzqe.DEVICE
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c4
            if (r12 == 0) goto L_0x00c4
            if (r9 != r0) goto L_0x00c4
            r13 = 12
        L_0x00c4:
            if (r11 != 0) goto L_0x00d9
            boolean r11 = r7.isInitialized()
            if (r11 == 0) goto L_0x00d9
            int r11 = r7.zzach
            if (r11 != r8) goto L_0x00d9
            int r11 = r7.zzzu
            if (r11 != r10) goto L_0x00d9
            int r11 = r7.zzacg
            if (r11 != r13) goto L_0x00d9
            return
        L_0x00d9:
            r7.reset()
            r7.zzach = r8
            r7.zzacj = r12
            r7.zzzu = r10
            r7.zzacg = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r8 = 2
        L_0x00e9:
            r7.zzaci = r8
            int r8 = com.google.android.gms.internal.ads.zzqe.zzg((int) r11, (int) r9)
            r7.zzadb = r8
            if (r12 == 0) goto L_0x0104
            int r8 = r7.zzaci
            if (r8 == r6) goto L_0x0101
            int r8 = r7.zzaci
            r9 = 6
            if (r8 != r9) goto L_0x00fd
            goto L_0x0101
        L_0x00fd:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x013a
        L_0x0101:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x013a
        L_0x0104:
            int r8 = r7.zzaci
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r0 = 0
        L_0x010f:
            com.google.android.gms.internal.ads.zzpo.checkState(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.zzo(r10)
            int r10 = (int) r10
            int r11 = r7.zzadb
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.zzo(r2)
            int r8 = r7.zzadb
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x0136
            r8 = r10
            goto L_0x013a
        L_0x0136:
            if (r9 <= r8) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r8 = r9
        L_0x013a:
            r7.zzack = r8
            if (r12 == 0) goto L_0x0144
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x014e
        L_0x0144:
            int r8 = r7.zzack
            int r9 = r7.zzadb
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.zzn((long) r8)
        L_0x014e:
            r7.zzacl = r8
            com.google.android.gms.internal.ads.zzfy r8 = r7.zzxm
            r7.zzb(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzcs() {
        ArrayList arrayList = new ArrayList();
        for (zzgi zzgi : this.zzabz) {
            if (zzgi.isActive()) {
                arrayList.add(zzgi);
            } else {
                zzgi.flush();
            }
        }
        int size = arrayList.size();
        this.zzadj = (zzgi[]) arrayList.toArray(new zzgi[size]);
        this.zzadk = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzgi zzgi2 = this.zzadj[i];
            zzgi2.flush();
            this.zzadk[i] = zzgi2.zzcr();
        }
    }

    public final void play() {
        this.zzadr = true;
        if (isInitialized()) {
            this.zzadh = System.nanoTime() / 1000;
            this.zzacf.play();
        }
    }

    public final void zzct() {
        if (this.zzadf == 1) {
            this.zzadf = 2;
        }
    }

    public final boolean zza(ByteBuffer byteBuffer, long j) throws zzgx, zzha {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        zzpo.checkArgument(this.zzadl == null || byteBuffer2 == this.zzadl);
        if (!isInitialized()) {
            this.zzacb.block();
            if (this.zzadt) {
                this.zzacf = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzacg).setEncoding(this.zzaci).setSampleRate(this.zzzu).build(), this.zzack, 1, this.zzads);
            } else if (this.zzads == 0) {
                this.zzacf = new AudioTrack(this.streamType, this.zzzu, this.zzacg, this.zzaci, this.zzack, 1);
            } else {
                this.zzacf = new AudioTrack(this.streamType, this.zzzu, this.zzacg, this.zzaci, this.zzack, 1, this.zzads);
            }
            int state = this.zzacf.getState();
            if (state == 1) {
                int audioSessionId = this.zzacf.getAudioSessionId();
                if (this.zzads != audioSessionId) {
                    this.zzads = audioSessionId;
                    this.zzaca.zzl(audioSessionId);
                }
                this.zzacd.zza(this.zzacf, zzdc());
                zzcz();
                this.zzadu = false;
                if (this.zzadr) {
                    play();
                }
            } else {
                try {
                    this.zzacf.release();
                } catch (Exception unused) {
                } finally {
                    this.zzacf = null;
                }
                throw new zzgx(state, this.zzzu, this.zzacg, this.zzack);
            }
        }
        if (zzdc()) {
            if (this.zzacf.getPlayState() == 2) {
                this.zzadu = false;
                return false;
            } else if (this.zzacf.getPlayState() == 1 && this.zzacd.zzdd() != 0) {
                return false;
            }
        }
        boolean z = this.zzadu;
        this.zzadu = zzcw();
        if (z && !this.zzadu && this.zzacf.getPlayState() != 1) {
            this.zzaca.zzc(this.zzack, zzfe.zzf(this.zzacl), SystemClock.elapsedRealtime() - this.zzadv);
        }
        if (this.zzadl == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzacj && this.zzade == 0) {
                int i3 = this.zzaci;
                if (i3 == 7 || i3 == 8) {
                    i2 = zzhc.zzj(byteBuffer);
                } else if (i3 == 5) {
                    i2 = zzgg.zzcn();
                } else if (i3 == 6) {
                    i2 = zzgg.zzh(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzade = i2;
            }
            if (this.zzacm != null) {
                if (!zzcv()) {
                    return false;
                }
                LinkedList<zzgz> linkedList = this.zzace;
                zzgz zzgz = r11;
                zzgz zzgz2 = new zzgz(this.zzacm, Math.max(0, j2), zzn(zzda()), (zzgt) null);
                linkedList.add(zzgz);
                this.zzacm = null;
                zzcs();
            }
            if (this.zzadf == 0) {
                this.zzadg = Math.max(0, j2);
                this.zzadf = 1;
            } else {
                long zzn = this.zzadg + zzn(this.zzacj ? this.zzada : this.zzacz / ((long) this.zzacy));
                if (this.zzadf != 1 || Math.abs(zzn - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzn);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzadf = 2;
                }
                if (this.zzadf == i) {
                    this.zzadg += j2 - zzn;
                    this.zzadf = 1;
                    this.zzaca.zzbs();
                }
            }
            if (this.zzacj) {
                this.zzada += (long) this.zzade;
            } else {
                this.zzacz += (long) byteBuffer.remaining();
            }
            this.zzadl = byteBuffer2;
        }
        if (this.zzacj) {
            zzb(this.zzadl, j2);
        } else {
            zzm(j2);
        }
        if (this.zzadl.hasRemaining()) {
            return false;
        }
        this.zzadl = null;
        return true;
    }

    private final void zzm(long j) throws zzha {
        ByteBuffer byteBuffer;
        int length = this.zzadj.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzadk[i - 1];
            } else {
                byteBuffer = this.zzadl != null ? this.zzadl : zzgi.zzabh;
            }
            if (i == length) {
                zzb(byteBuffer, j);
            } else {
                zzgi zzgi = this.zzadj[i];
                zzgi.zzi(byteBuffer);
                ByteBuffer zzcr = zzgi.zzcr();
                this.zzadk[i] = zzcr;
                if (zzcr.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        if (r11 < r10) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzha {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.zzadm
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.nio.ByteBuffer r0 = r8.zzadm
            if (r0 != r9) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.zzpo.checkArgument(r0)
            goto L_0x003f
        L_0x001a:
            r8.zzadm = r9
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            if (r0 >= r2) goto L_0x003f
            int r0 = r9.remaining()
            byte[] r4 = r8.zzadn
            if (r4 == 0) goto L_0x002d
            byte[] r4 = r8.zzadn
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0031
        L_0x002d:
            byte[] r4 = new byte[r0]
            r8.zzadn = r4
        L_0x0031:
            int r4 = r9.position()
            byte[] r5 = r8.zzadn
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.zzado = r3
        L_0x003f:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            if (r4 >= r2) goto L_0x007d
            long r10 = r8.zzadc
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzacd
            long r4 = r2.zzdd()
            int r2 = r8.zzadb
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.zzack
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x007a
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.zzacf
            byte[] r2 = r8.zzadn
            int r4 = r8.zzado
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f6
            int r11 = r8.zzado
            int r11 = r11 + r10
            r8.zzado = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f6
        L_0x007a:
            r10 = 0
            goto L_0x00f6
        L_0x007d:
            boolean r2 = r8.zzadt
            if (r2 == 0) goto L_0x00f0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x008c
            r2 = 1
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            android.media.AudioTrack r2 = r8.zzacf
            java.nio.ByteBuffer r4 = r8.zzacp
            if (r4 != 0) goto L_0x00ad
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.zzacp = r4
            java.nio.ByteBuffer r4 = r8.zzacp
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.zzacp
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00ad:
            int r4 = r8.zzacq
            if (r4 != 0) goto L_0x00c9
            java.nio.ByteBuffer r4 = r8.zzacp
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.zzacp
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.zzacp
            r10.position(r3)
            r8.zzacq = r0
        L_0x00c9:
            java.nio.ByteBuffer r10 = r8.zzacp
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00e0
            java.nio.ByteBuffer r11 = r8.zzacp
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00dd
            r8.zzacq = r3
            r10 = r11
            goto L_0x00f6
        L_0x00dd:
            if (r11 >= r10) goto L_0x00e0
            goto L_0x007a
        L_0x00e0:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e9
            r8.zzacq = r3
            goto L_0x00ee
        L_0x00e9:
            int r10 = r8.zzacq
            int r10 = r10 - r9
            r8.zzacq = r10
        L_0x00ee:
            r10 = r9
            goto L_0x00f6
        L_0x00f0:
            android.media.AudioTrack r10 = r8.zzacf
            int r10 = r10.write(r9, r0, r1)
        L_0x00f6:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.zzadv = r4
            if (r10 < 0) goto L_0x011b
            boolean r9 = r8.zzacj
            if (r9 != 0) goto L_0x0108
            long r4 = r8.zzadc
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.zzadc = r4
        L_0x0108:
            if (r10 != r0) goto L_0x011a
            boolean r9 = r8.zzacj
            if (r9 == 0) goto L_0x0116
            long r9 = r8.zzadd
            int r11 = r8.zzade
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.zzadd = r9
        L_0x0116:
            r9 = 0
            r8.zzadm = r9
            return r1
        L_0x011a:
            return r3
        L_0x011b:
            com.google.android.gms.internal.ads.zzha r9 = new com.google.android.gms.internal.ads.zzha
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.zzb(java.nio.ByteBuffer, long):boolean");
    }

    public final void zzcu() throws zzha {
        if (!this.zzadq && isInitialized() && zzcv()) {
            this.zzacd.zzp(zzda());
            this.zzacq = 0;
            this.zzadq = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzcv() throws com.google.android.gms.internal.ads.zzha {
        /*
            r8 = this;
            int r0 = r8.zzadp
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r8.zzacj
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzgi[] r0 = r8.zzadj
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.zzadp = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r8.zzadp
            com.google.android.gms.internal.ads.zzgi[] r5 = r8.zzadj
            int r5 = r5.length
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L_0x003c
            com.google.android.gms.internal.ads.zzgi[] r4 = r8.zzadj
            int r5 = r8.zzadp
            r4 = r4[r5]
            if (r0 == 0) goto L_0x002c
            r4.zzcq()
        L_0x002c:
            r8.zzm(r6)
            boolean r0 = r4.zzcj()
            if (r0 != 0) goto L_0x0036
            return r3
        L_0x0036:
            int r0 = r8.zzadp
            int r0 = r0 + r2
            r8.zzadp = r0
            goto L_0x0012
        L_0x003c:
            java.nio.ByteBuffer r0 = r8.zzadm
            if (r0 == 0) goto L_0x004a
            java.nio.ByteBuffer r0 = r8.zzadm
            r8.zzb(r0, r6)
            java.nio.ByteBuffer r0 = r8.zzadm
            if (r0 == 0) goto L_0x004a
            return r3
        L_0x004a:
            r8.zzadp = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.zzcv():boolean");
    }

    public final boolean zzcj() {
        if (isInitialized()) {
            return this.zzadq && !zzcw();
        }
        return true;
    }

    public final boolean zzcw() {
        if (isInitialized()) {
            if (zzda() <= this.zzacd.zzdd()) {
                if (zzdc() && this.zzacf.getPlayState() == 2 && this.zzacf.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final zzfy zzb(zzfy zzfy) {
        zzfy zzfy2;
        if (this.zzacj) {
            this.zzxm = zzfy.zzaaf;
            return this.zzxm;
        }
        zzfy zzfy3 = new zzfy(this.zzaby.zzb(zzfy.zzaag), this.zzaby.zzc(zzfy.zzaah));
        if (this.zzacm != null) {
            zzfy2 = this.zzacm;
        } else if (!this.zzace.isEmpty()) {
            zzfy2 = this.zzace.getLast().zzxm;
        } else {
            zzfy2 = this.zzxm;
        }
        if (!zzfy3.equals(zzfy2)) {
            if (isInitialized()) {
                this.zzacm = zzfy3;
            } else {
                this.zzxm = zzfy3;
            }
        }
        return this.zzxm;
    }

    public final zzfy zzcx() {
        return this.zzxm;
    }

    public final void setStreamType(int i) {
        if (this.streamType != i) {
            this.streamType = i;
            if (!this.zzadt) {
                reset();
                this.zzads = 0;
            }
        }
    }

    public final void zzn(int i) {
        zzpo.checkState(zzqe.SDK_INT >= 21);
        if (!this.zzadt || this.zzads != i) {
            this.zzadt = true;
            this.zzads = i;
            reset();
        }
    }

    public final void zzcy() {
        if (this.zzadt) {
            this.zzadt = false;
            this.zzads = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzcu != f) {
            this.zzcu = f;
            zzcz();
        }
    }

    private final void zzcz() {
        if (!isInitialized()) {
            return;
        }
        if (zzqe.SDK_INT >= 21) {
            this.zzacf.setVolume(this.zzcu);
            return;
        }
        AudioTrack audioTrack = this.zzacf;
        float f = this.zzcu;
        audioTrack.setStereoVolume(f, f);
    }

    public final void pause() {
        this.zzadr = false;
        if (isInitialized()) {
            zzdb();
            this.zzacd.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzacz = 0;
            this.zzada = 0;
            this.zzadc = 0;
            this.zzadd = 0;
            this.zzade = 0;
            if (this.zzacm != null) {
                this.zzxm = this.zzacm;
                this.zzacm = null;
            } else if (!this.zzace.isEmpty()) {
                this.zzxm = this.zzace.getLast().zzxm;
            }
            this.zzace.clear();
            this.zzacn = 0;
            this.zzaco = 0;
            this.zzadl = null;
            this.zzadm = null;
            for (int i = 0; i < this.zzadj.length; i++) {
                zzgi zzgi = this.zzadj[i];
                zzgi.flush();
                this.zzadk[i] = zzgi.zzcr();
            }
            this.zzadq = false;
            this.zzadp = -1;
            this.zzacp = null;
            this.zzacq = 0;
            this.zzadf = 0;
            this.zzadi = 0;
            zzdb();
            if (this.zzacf.getPlayState() == 3) {
                this.zzacf.pause();
            }
            AudioTrack audioTrack = this.zzacf;
            this.zzacf = null;
            this.zzacd.zza((AudioTrack) null, false);
            this.zzacb.close();
            new zzgt(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzgi reset : this.zzabz) {
            reset.reset();
        }
        this.zzads = 0;
        this.zzadr = false;
    }

    private final boolean isInitialized() {
        return this.zzacf != null;
    }

    private final long zzn(long j) {
        return (j * 1000000) / ((long) this.zzzu);
    }

    private final long zzo(long j) {
        return (j * ((long) this.zzzu)) / 1000000;
    }

    private final long zzda() {
        return this.zzacj ? this.zzadd : this.zzadc / ((long) this.zzadb);
    }

    private final void zzdb() {
        this.zzact = 0;
        this.zzacs = 0;
        this.zzacr = 0;
        this.zzacu = 0;
        this.zzacv = false;
        this.zzacw = 0;
    }

    private final boolean zzdc() {
        if (zzqe.SDK_INT < 23) {
            return this.zzaci == 5 || this.zzaci == 6;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzr(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1095064472(0xffffffffbebaa468, float:-0.36453557)
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r1 = 187078296(0xb269698, float:3.208373E-32)
            if (r0 == r1) goto L_0x002e
            r1 = 1504578661(0x59ae0c65, float:6.1237842E15)
            if (r0 == r1) goto L_0x0024
            r1 = 1505942594(0x59c2dc42, float:6.8560402E15)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "audio/eac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "audio/ac3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0043
        L_0x0042:
            r3 = -1
        L_0x0043:
            switch(r3) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004c;
                case 2: goto L_0x004a;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r2
        L_0x0047:
            r3 = 8
            return r3
        L_0x004a:
            r3 = 7
            return r3
        L_0x004c:
            r3 = 6
            return r3
        L_0x004e:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.zzr(java.lang.String):int");
    }
}
