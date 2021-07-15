package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzhp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class zzip implements zzhz {
    private static final zzic zzahq = new zziq();
    private static final byte[] zzahr = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzahs = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID zzaht = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaan;
    private final zziu zzahk;
    private final zzin zzahu;
    private final SparseArray<zzis> zzahv;
    private final boolean zzahw;
    private final zzpx zzahx;
    private final zzpx zzahy;
    private final zzpx zzahz;
    private final zzpx zzaia;
    private final zzpx zzaib;
    private final zzpx zzaic;
    private final zzpx zzaid;
    private final zzpx zzaie;
    private final zzpx zzaif;
    private ByteBuffer zzaig;
    private long zzaih;
    private long zzaii;
    private long zzaij;
    private long zzaik;
    private zzis zzail;
    private boolean zzaim;
    private int zzain;
    private long zzaio;
    private boolean zzaip;
    private long zzaiq;
    private long zzair;
    private long zzais;
    private zzpr zzait;
    private zzpr zzaiu;
    private boolean zzaiv;
    private int zzaiw;
    private long zzaix;
    private long zzaiy;
    private int zzaiz;
    private int zzaja;
    private int[] zzajb;
    private int zzajc;
    private int zzajd;
    private int zzaje;
    private int zzajf;
    private boolean zzajg;
    private boolean zzajh;
    private boolean zzaji;
    private boolean zzajj;
    private byte zzajk;
    private int zzajl;
    private int zzajm;
    private int zzajn;
    private boolean zzajo;
    private boolean zzajp;
    private zzib zzajq;

    public zzip() {
        this(0);
    }

    static int zzab(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static boolean zzac(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public final void release() {
    }

    public zzip(int i) {
        this(new zzik(), i);
    }

    private zzip(zzin zzin, int i) {
        this.zzaii = -1;
        this.zzaij = -9223372036854775807L;
        this.zzaik = -9223372036854775807L;
        this.zzaan = -9223372036854775807L;
        this.zzaiq = -1;
        this.zzair = -1;
        this.zzais = -9223372036854775807L;
        this.zzahu = zzin;
        this.zzahu.zza(new zzir(this, (zziq) null));
        this.zzahw = (i & 1) != 0 ? false : true;
        this.zzahk = new zziu();
        this.zzahv = new SparseArray<>();
        this.zzahz = new zzpx(4);
        this.zzaia = new zzpx(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzaib = new zzpx(4);
        this.zzahx = new zzpx(zzpu.zzbhi);
        this.zzahy = new zzpx(4);
        this.zzaic = new zzpx();
        this.zzaid = new zzpx();
        this.zzaie = new zzpx(8);
        this.zzaif = new zzpx();
    }

    public final boolean zza(zzia zzia) throws IOException, InterruptedException {
        return new zzit().zza(zzia);
    }

    public final void zza(zzib zzib) {
        this.zzajq = zzib;
    }

    public final void zzc(long j, long j2) {
        this.zzais = -9223372036854775807L;
        this.zzaiw = 0;
        this.zzahu.reset();
        this.zzahk.reset();
        zzeb();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzia r9, com.google.android.gms.internal.ads.zzif r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzajo = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.zzajo
            if (r3 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzin r2 = r8.zzahu
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.zzaip
            if (r5 == 0) goto L_0x0025
            r8.zzair = r3
            long r3 = r8.zzaiq
            r10.zzaha = r3
            r8.zzaip = r0
        L_0x0023:
            r3 = 1
            goto L_0x0039
        L_0x0025:
            boolean r3 = r8.zzaim
            if (r3 == 0) goto L_0x0038
            long r3 = r8.zzair
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            long r3 = r8.zzair
            r10.zzaha = r3
            r8.zzair = r5
            goto L_0x0023
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            return r0
        L_0x003f:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzip.zza(com.google.android.gms.internal.ads.zzia, com.google.android.gms.internal.ads.zzif):int");
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzfx {
        if (i == 160) {
            this.zzajp = false;
        } else if (i == 174) {
            this.zzail = new zzis((zziq) null);
        } else if (i == 187) {
            this.zzaiv = false;
        } else if (i == 19899) {
            this.zzain = -1;
            this.zzaio = -1;
        } else if (i == 20533) {
            this.zzail.zzaju = true;
        } else if (i == 21968) {
            this.zzail.zzakb = true;
        } else if (i == 25152) {
        } else {
            if (i != 408125543) {
                if (i == 475249515) {
                    this.zzait = new zzpr();
                    this.zzaiu = new zzpr();
                } else if (i != 524531317 || this.zzaim) {
                } else {
                    if (!this.zzahw || this.zzaiq == -1) {
                        this.zzajq.zza(new zzih(this.zzaan));
                        this.zzaim = true;
                        return;
                    }
                    this.zzaip = true;
                }
            } else if (this.zzaii == -1 || this.zzaii == j) {
                this.zzaii = j;
                this.zzaih = j2;
            } else {
                throw new zzfx("Multiple Segment elements not supported");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzad(int i) throws zzfx {
        zzig zzig;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.zzail.zzajs;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    this.zzail.zza(this.zzajq, this.zzail.number);
                    this.zzahv.put(this.zzail.number, this.zzail);
                }
                this.zzail = null;
            } else if (i != 19899) {
                if (i != 25152) {
                    if (i != 28032) {
                        if (i == 357149030) {
                            if (this.zzaij == -9223372036854775807L) {
                                this.zzaij = 1000000;
                            }
                            if (this.zzaik != -9223372036854775807L) {
                                this.zzaan = zzs(this.zzaik);
                            }
                        } else if (i != 374648427) {
                            if (i == 475249515 && !this.zzaim) {
                                zzib zzib = this.zzajq;
                                if (this.zzaii == -1 || this.zzaan == -9223372036854775807L || this.zzait == null || this.zzait.size() == 0 || this.zzaiu == null || this.zzaiu.size() != this.zzait.size()) {
                                    this.zzait = null;
                                    this.zzaiu = null;
                                    zzig = new zzih(this.zzaan);
                                } else {
                                    int size = this.zzait.size();
                                    int[] iArr = new int[size];
                                    long[] jArr = new long[size];
                                    long[] jArr2 = new long[size];
                                    long[] jArr3 = new long[size];
                                    for (int i4 = 0; i4 < size; i4++) {
                                        jArr3[i4] = this.zzait.get(i4);
                                        jArr[i4] = this.zzaii + this.zzaiu.get(i4);
                                    }
                                    while (true) {
                                        i2 = size - 1;
                                        if (i3 >= i2) {
                                            break;
                                        }
                                        int i5 = i3 + 1;
                                        iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                                        jArr2[i3] = jArr3[i5] - jArr3[i3];
                                        i3 = i5;
                                    }
                                    iArr[i2] = (int) ((this.zzaii + this.zzaih) - jArr[i2]);
                                    jArr2[i2] = this.zzaan - jArr3[i2];
                                    this.zzait = null;
                                    this.zzaiu = null;
                                    zzig = new zzhw(iArr, jArr, jArr2, jArr3);
                                }
                                zzib.zza(zzig);
                                this.zzaim = true;
                            }
                        } else if (this.zzahv.size() != 0) {
                            this.zzajq.zzdy();
                        } else {
                            throw new zzfx("No valid tracks were found");
                        }
                    } else if (this.zzail.zzaju && this.zzail.zzajv != null) {
                        throw new zzfx("Combining encryption and compression is not supported");
                    }
                } else if (!this.zzail.zzaju) {
                } else {
                    if (this.zzail.zzajw != null) {
                        this.zzail.zzzm = new zzhp(new zzhp.zza(zzfe.zzwm, "video/webm", this.zzail.zzajw.zzahh));
                        return;
                    }
                    throw new zzfx("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (this.zzain == -1 || this.zzaio == -1) {
                throw new zzfx("Mandatory element SeekID or SeekPosition not found");
            } else if (this.zzain == 475249515) {
                this.zzaiq = this.zzaio;
            }
        } else if (this.zzaiw == 2) {
            if (!this.zzajp) {
                this.zzaje |= 1;
            }
            zza(this.zzahv.get(this.zzajc), this.zzaix);
            this.zzaiw = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzfx {
        boolean z = false;
        switch (i) {
            case 131:
                this.zzail.type = (int) j;
                return;
            case 136:
                zzis zzis = this.zzail;
                if (j == 1) {
                    z = true;
                }
                zzis.zzaku = z;
                return;
            case 155:
                this.zzaiy = zzs(j);
                return;
            case 159:
                this.zzail.zzzt = (int) j;
                return;
            case 176:
                this.zzail.width = (int) j;
                return;
            case 179:
                this.zzait.add(zzs(j));
                return;
            case 186:
                this.zzail.height = (int) j;
                return;
            case 215:
                this.zzail.number = (int) j;
                return;
            case 231:
                this.zzais = zzs(j);
                return;
            case 241:
                if (!this.zzaiv) {
                    this.zzaiu.add(j);
                    this.zzaiv = true;
                    return;
                }
                return;
            case 251:
                this.zzajp = true;
                return;
            case 16980:
                if (j != 3) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("ContentCompAlgo ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new zzfx(sb.toString());
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("DocTypeReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new zzfx(sb2.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("EBMLReadVersion ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzfx(sb3.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb4 = new StringBuilder(49);
                    sb4.append("ContentEncAlgo ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new zzfx(sb4.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb5 = new StringBuilder(56);
                    sb5.append("AESSettingsCipherMode ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzfx(sb5.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingOrder ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzfx(sb6.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(55);
                    sb7.append("ContentEncodingScope ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzfx(sb7.toString());
                }
                return;
            case 21420:
                this.zzaio = j + this.zzaii;
                return;
            case 21432:
                int i2 = (int) j;
                if (i2 == 3) {
                    this.zzail.zzzq = 1;
                    return;
                } else if (i2 != 15) {
                    switch (i2) {
                        case 0:
                            this.zzail.zzzq = 0;
                            return;
                        case 1:
                            this.zzail.zzzq = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.zzail.zzzq = 3;
                    return;
                }
            case 21680:
                this.zzail.zzajy = (int) j;
                return;
            case 21682:
                this.zzail.zzaka = (int) j;
                return;
            case 21690:
                this.zzail.zzajz = (int) j;
                return;
            case 21930:
                zzis zzis2 = this.zzail;
                if (j == 1) {
                    z = true;
                }
                zzis2.zzakv = z;
                return;
            case 21945:
                switch ((int) j) {
                    case 1:
                        this.zzail.zzake = 2;
                        return;
                    case 2:
                        this.zzail.zzake = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                int i3 = (int) j;
                if (i3 != 1) {
                    if (i3 == 16) {
                        this.zzail.zzakd = 6;
                        return;
                    } else if (i3 != 18) {
                        switch (i3) {
                            case 6:
                            case 7:
                                break;
                            default:
                                return;
                        }
                    } else {
                        this.zzail.zzakd = 7;
                        return;
                    }
                }
                this.zzail.zzakd = 3;
                return;
            case 21947:
                this.zzail.zzakb = true;
                int i4 = (int) j;
                if (i4 == 1) {
                    this.zzail.zzakc = 1;
                    return;
                } else if (i4 != 9) {
                    switch (i4) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.zzail.zzakc = 2;
                            return;
                        default:
                            return;
                    }
                } else {
                    this.zzail.zzakc = 6;
                    return;
                }
            case 21948:
                this.zzail.zzakf = (int) j;
                return;
            case 21949:
                this.zzail.zzakg = (int) j;
                return;
            case 22186:
                this.zzail.zzaks = j;
                return;
            case 22203:
                this.zzail.zzakt = j;
                return;
            case 25188:
                this.zzail.zzakr = (int) j;
                return;
            case 2352003:
                this.zzail.zzajt = (int) j;
                return;
            case 2807729:
                this.zzaij = j;
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzail.zzzu = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.zzail.zzakh = (float) d;
                    return;
                case 21970:
                    this.zzail.zzaki = (float) d;
                    return;
                case 21971:
                    this.zzail.zzakj = (float) d;
                    return;
                case 21972:
                    this.zzail.zzakk = (float) d;
                    return;
                case 21973:
                    this.zzail.zzakl = (float) d;
                    return;
                case 21974:
                    this.zzail.zzakm = (float) d;
                    return;
                case 21975:
                    this.zzail.zzakn = (float) d;
                    return;
                case 21976:
                    this.zzail.zzako = (float) d;
                    return;
                case 21977:
                    this.zzail.zzakp = (float) d;
                    return;
                case 21978:
                    this.zzail.zzakq = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.zzaik = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzfx {
        if (i == 134) {
            this.zzail.zzajs = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.zzail.zzaaa = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzfx(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, int i2, zzia zzia) throws IOException, InterruptedException {
        byte b;
        int i3 = i;
        int i4 = i2;
        zzia zzia2 = zzia;
        int i5 = 0;
        int i6 = 1;
        if (i3 == 161 || i3 == 163) {
            if (this.zzaiw == 0) {
                this.zzajc = (int) this.zzahk.zza(zzia2, false, true, 8);
                this.zzajd = this.zzahk.zzed();
                this.zzaiy = -9223372036854775807L;
                this.zzaiw = 1;
                this.zzahz.reset();
            }
            zzis zzis = this.zzahv.get(this.zzajc);
            if (zzis == null) {
                zzia2.zzw(i4 - this.zzajd);
                this.zzaiw = 0;
                return;
            }
            if (this.zzaiw == 1) {
                zzb(zzia2, 3);
                int i7 = (this.zzahz.data[2] & 6) >> 1;
                byte b2 = 255;
                if (i7 == 0) {
                    this.zzaja = 1;
                    this.zzajb = zza(this.zzajb, 1);
                    this.zzajb[0] = (i4 - this.zzajd) - 3;
                } else if (i3 == 163) {
                    zzb(zzia2, 4);
                    this.zzaja = (this.zzahz.data[3] & 255) + 1;
                    this.zzajb = zza(this.zzajb, this.zzaja);
                    if (i7 == 2) {
                        Arrays.fill(this.zzajb, 0, this.zzaja, ((i4 - this.zzajd) - 4) / this.zzaja);
                    } else if (i7 == 1) {
                        int i8 = 4;
                        int i9 = 0;
                        for (int i10 = 0; i10 < this.zzaja - 1; i10++) {
                            this.zzajb[i10] = 0;
                            do {
                                i8++;
                                zzb(zzia2, i8);
                                b = this.zzahz.data[i8 - 1] & 255;
                                int[] iArr = this.zzajb;
                                iArr[i10] = iArr[i10] + b;
                            } while (b == 255);
                            i9 += this.zzajb[i10];
                        }
                        this.zzajb[this.zzaja - 1] = ((i4 - this.zzajd) - i8) - i9;
                    } else if (i7 == 3) {
                        int i11 = 0;
                        int i12 = 4;
                        int i13 = 0;
                        while (i11 < this.zzaja - i6) {
                            this.zzajb[i11] = i5;
                            i12++;
                            zzb(zzia2, i12);
                            int i14 = i12 - 1;
                            if (this.zzahz.data[i14] != 0) {
                                long j = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 8) {
                                        break;
                                    }
                                    int i16 = i6 << (7 - i15);
                                    if ((this.zzahz.data[i14] & i16) != 0) {
                                        i12 += i15;
                                        zzb(zzia2, i12);
                                        long j2 = (long) (this.zzahz.data[i14] & b2 & (i16 ^ -1));
                                        int i17 = i14 + 1;
                                        while (true) {
                                            j = j2;
                                            if (i17 >= i12) {
                                                break;
                                            }
                                            j2 = (j << 8) | ((long) (this.zzahz.data[i17] & b2));
                                            i17++;
                                            b2 = 255;
                                        }
                                        if (i11 > 0) {
                                            j -= (1 << ((i15 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i15++;
                                        i6 = 1;
                                        b2 = 255;
                                    }
                                }
                                long j3 = j;
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    throw new zzfx("EBML lacing sample size out of range.");
                                }
                                int i18 = (int) j3;
                                int[] iArr2 = this.zzajb;
                                if (i11 != 0) {
                                    i18 += this.zzajb[i11 - 1];
                                }
                                iArr2[i11] = i18;
                                i13 += this.zzajb[i11];
                                i11++;
                                i5 = 0;
                                i6 = 1;
                                b2 = 255;
                            } else {
                                throw new zzfx("No valid varint length mask found");
                            }
                        }
                        this.zzajb[this.zzaja - 1] = ((i4 - this.zzajd) - i12) - i13;
                    } else {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Unexpected lacing value: ");
                        sb.append(i7);
                        throw new zzfx(sb.toString());
                    }
                } else {
                    throw new zzfx("Lacing only supported in SimpleBlocks.");
                }
                this.zzaix = this.zzais + zzs((long) ((this.zzahz.data[0] << 8) | (this.zzahz.data[1] & 255)));
                this.zzaje = ((zzis.type == 2 || (i3 == 163 && (this.zzahz.data[2] & 128) == 128)) ? 1 : 0) | ((this.zzahz.data[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                this.zzaiw = 2;
                this.zzaiz = 0;
            }
            if (i3 == 163) {
                while (this.zzaiz < this.zzaja) {
                    zza(zzia2, zzis, this.zzajb[this.zzaiz]);
                    zza(zzis, this.zzaix + ((long) ((this.zzaiz * zzis.zzajt) / 1000)));
                    this.zzaiz++;
                }
                this.zzaiw = 0;
                return;
            }
            zza(zzia2, zzis, this.zzajb[0]);
        } else if (i3 == 16981) {
            this.zzail.zzajv = new byte[i4];
            zzia2.readFully(this.zzail.zzajv, 0, i4);
        } else if (i3 == 18402) {
            byte[] bArr = new byte[i4];
            zzia2.readFully(bArr, 0, i4);
            this.zzail.zzajw = new zzij(1, bArr);
        } else if (i3 == 21419) {
            Arrays.fill(this.zzaib.data, (byte) 0);
            zzia2.readFully(this.zzaib.data, 4 - i4, i4);
            this.zzaib.setPosition(0);
            this.zzain = (int) this.zzaib.zzhd();
        } else if (i3 == 25506) {
            this.zzail.zzajx = new byte[i4];
            zzia2.readFully(this.zzail.zzajx, 0, i4);
        } else if (i3 == 30322) {
            this.zzail.zzzr = new byte[i4];
            zzia2.readFully(this.zzail.zzzr, 0, i4);
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unexpected id: ");
            sb2.append(i3);
            throw new zzfx(sb2.toString());
        }
    }

    private final void zza(zzis zzis, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(zzis.zzajs)) {
            byte[] bArr2 = this.zzaid.data;
            long j2 = this.zzaiy;
            if (j2 == -9223372036854775807L) {
                bArr = zzahs;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzqe.zzaj(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zzis.zzakw.zza(this.zzaid, this.zzaid.limit());
            this.zzajn += this.zzaid.limit();
        }
        zzis.zzakw.zza(j, this.zzaje, this.zzajn, 0, zzis.zzajw);
        this.zzajo = true;
        zzeb();
    }

    private final void zzeb() {
        this.zzajf = 0;
        this.zzajn = 0;
        this.zzajm = 0;
        this.zzajg = false;
        this.zzajh = false;
        this.zzajj = false;
        this.zzajl = 0;
        this.zzajk = 0;
        this.zzaji = false;
        this.zzaic.reset();
    }

    private final void zzb(zzia zzia, int i) throws IOException, InterruptedException {
        if (this.zzahz.limit() < i) {
            if (this.zzahz.capacity() < i) {
                this.zzahz.zzc(Arrays.copyOf(this.zzahz.data, Math.max(this.zzahz.data.length << 1, i)), this.zzahz.limit());
            }
            zzia.readFully(this.zzahz.data, this.zzahz.limit(), i - this.zzahz.limit());
            this.zzahz.zzbk(i);
        }
    }

    private final void zza(zzia zzia, zzis zzis, int i) throws IOException, InterruptedException {
        if ("S_TEXT/UTF8".equals(zzis.zzajs)) {
            int length = zzahr.length + i;
            if (this.zzaid.capacity() < length) {
                this.zzaid.data = Arrays.copyOf(zzahr, length + i);
            }
            zzia.readFully(this.zzaid.data, zzahr.length, i);
            this.zzaid.setPosition(0);
            this.zzaid.zzbk(length);
            return;
        }
        zzii zzii = zzis.zzakw;
        if (!this.zzajg) {
            if (zzis.zzaju) {
                this.zzaje &= -1073741825;
                int i2 = 128;
                if (!this.zzajh) {
                    zzia.readFully(this.zzahz.data, 0, 1);
                    this.zzajf++;
                    if ((this.zzahz.data[0] & 128) != 128) {
                        this.zzajk = this.zzahz.data[0];
                        this.zzajh = true;
                    } else {
                        throw new zzfx("Extension bit is set in signal byte");
                    }
                }
                if ((this.zzajk & 1) == 1) {
                    boolean z = (this.zzajk & 2) == 2;
                    this.zzaje |= 1073741824;
                    if (!this.zzaji) {
                        zzia.readFully(this.zzaie.data, 0, 8);
                        this.zzajf += 8;
                        this.zzaji = true;
                        byte[] bArr = this.zzahz.data;
                        if (!z) {
                            i2 = 0;
                        }
                        bArr[0] = (byte) (i2 | 8);
                        this.zzahz.setPosition(0);
                        zzii.zza(this.zzahz, 1);
                        this.zzajn++;
                        this.zzaie.setPosition(0);
                        zzii.zza(this.zzaie, 8);
                        this.zzajn += 8;
                    }
                    if (z) {
                        if (!this.zzajj) {
                            zzia.readFully(this.zzahz.data, 0, 1);
                            this.zzajf++;
                            this.zzahz.setPosition(0);
                            this.zzajl = this.zzahz.readUnsignedByte();
                            this.zzajj = true;
                        }
                        int i3 = this.zzajl << 2;
                        this.zzahz.reset(i3);
                        zzia.readFully(this.zzahz.data, 0, i3);
                        this.zzajf += i3;
                        short s = (short) ((this.zzajl / 2) + 1);
                        int i4 = (s * 6) + 2;
                        if (this.zzaig == null || this.zzaig.capacity() < i4) {
                            this.zzaig = ByteBuffer.allocate(i4);
                        }
                        this.zzaig.position(0);
                        this.zzaig.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.zzajl) {
                            int zzhg = this.zzahz.zzhg();
                            if (i5 % 2 == 0) {
                                this.zzaig.putShort((short) (zzhg - i6));
                            } else {
                                this.zzaig.putInt(zzhg - i6);
                            }
                            i5++;
                            i6 = zzhg;
                        }
                        int i7 = (i - this.zzajf) - i6;
                        if (this.zzajl % 2 == 1) {
                            this.zzaig.putInt(i7);
                        } else {
                            this.zzaig.putShort((short) i7);
                            this.zzaig.putInt(0);
                        }
                        this.zzaif.zzc(this.zzaig.array(), i4);
                        zzii.zza(this.zzaif, i4);
                        this.zzajn += i4;
                    }
                }
            } else if (zzis.zzajv != null) {
                this.zzaic.zzc(zzis.zzajv, zzis.zzajv.length);
            }
            this.zzajg = true;
        }
        int limit = i + this.zzaic.limit();
        if ("V_MPEG4/ISO/AVC".equals(zzis.zzajs) || "V_MPEGH/ISO/HEVC".equals(zzis.zzajs)) {
            byte[] bArr2 = this.zzahy.data;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i8 = zzis.zzakx;
            int i9 = 4 - zzis.zzakx;
            while (this.zzajf < limit) {
                if (this.zzajm == 0) {
                    int min = Math.min(i8, this.zzaic.zzhb());
                    zzia.readFully(bArr2, i9 + min, i8 - min);
                    if (min > 0) {
                        this.zzaic.zze(bArr2, i9, min);
                    }
                    this.zzajf += i8;
                    this.zzahy.setPosition(0);
                    this.zzajm = this.zzahy.zzhg();
                    this.zzahx.setPosition(0);
                    zzii.zza(this.zzahx, 4);
                    this.zzajn += 4;
                } else {
                    this.zzajm -= zza(zzia, zzii, this.zzajm);
                }
            }
        } else {
            while (this.zzajf < limit) {
                zza(zzia, zzii, limit - this.zzajf);
            }
        }
        if ("A_VORBIS".equals(zzis.zzajs)) {
            this.zzaia.setPosition(0);
            zzii.zza(this.zzaia, 4);
            this.zzajn += 4;
        }
    }

    private final int zza(zzia zzia, zzii zzii, int i) throws IOException, InterruptedException {
        int i2;
        int zzhb = this.zzaic.zzhb();
        if (zzhb > 0) {
            i2 = Math.min(i, zzhb);
            zzii.zza(this.zzaic, i2);
        } else {
            i2 = zzii.zza(zzia, i, false);
        }
        this.zzajf += i2;
        this.zzajn += i2;
        return i2;
    }

    private final long zzs(long j) throws zzfx {
        if (this.zzaij != -9223372036854775807L) {
            return zzqe.zza(j, this.zzaij, 1000);
        }
        throw new zzfx("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
