package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzhp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class zzji implements zzhz {
    private static final zzic zzahq = new zzjj();
    private static final int zzaps = zzqe.zzam("seig");
    private static final byte[] zzapt = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final int flags;
    private long zzaan;
    private final zzpx zzahx;
    private int zzajm;
    private int zzajn;
    private zzib zzajq;
    private final zzjs zzapu;
    private final SparseArray<zzjl> zzapv;
    private final zzpx zzapw;
    private final zzpx zzapx;
    private final zzpx zzapy;
    private final zzqb zzapz;
    private final zzpx zzaqa;
    private final byte[] zzaqb;
    private final Stack<zziw> zzaqc;
    private final LinkedList<zzjk> zzaqd;
    private int zzaqe;
    private int zzaqf;
    private long zzaqg;
    private int zzaqh;
    private zzpx zzaqi;
    private long zzaqj;
    private int zzaqk;
    private long zzaql;
    private zzjl zzaqm;
    private int zzaqn;
    private boolean zzaqo;
    private zzii zzaqp;
    private zzii[] zzaqq;
    private boolean zzaqr;

    public zzji() {
        this(0);
    }

    public final void release() {
    }

    public zzji(int i) {
        this(i, (zzqb) null);
    }

    private zzji(int i, zzqb zzqb) {
        this(i, (zzqb) null, (zzjs) null);
    }

    private zzji(int i, zzqb zzqb, zzjs zzjs) {
        this.flags = i;
        this.zzapz = null;
        this.zzapu = null;
        this.zzaqa = new zzpx(16);
        this.zzahx = new zzpx(zzpu.zzbhi);
        this.zzapw = new zzpx(5);
        this.zzapx = new zzpx();
        this.zzapy = new zzpx(1);
        this.zzaqb = new byte[16];
        this.zzaqc = new Stack<>();
        this.zzaqd = new LinkedList<>();
        this.zzapv = new SparseArray<>();
        this.zzaan = -9223372036854775807L;
        this.zzaql = -9223372036854775807L;
        zzei();
    }

    public final boolean zza(zzia zzia) throws IOException, InterruptedException {
        return zzjr.zzd(zzia);
    }

    public final void zza(zzib zzib) {
        this.zzajq = zzib;
    }

    public final void zzc(long j, long j2) {
        int size = this.zzapv.size();
        for (int i = 0; i < size; i++) {
            this.zzapv.valueAt(i).reset();
        }
        this.zzaqd.clear();
        this.zzaqk = 0;
        this.zzaqc.clear();
        zzei();
    }

    /* JADX WARNING: Removed duplicated region for block: B:254:0x0610 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0370 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0004 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzia r29, com.google.android.gms.internal.ads.zzif r30) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
        L_0x0004:
            int r2 = r0.zzaqe
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 8
            r11 = 0
            switch(r2) {
                case 0: goto L_0x01e1;
                case 1: goto L_0x007f;
                case 2: goto L_0x0028;
                default: goto L_0x0015;
            }
        L_0x0015:
            int r2 = r0.zzaqe
            if (r2 != r5) goto L_0x0469
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            if (r2 != 0) goto L_0x03de
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r7 = r2.size()
            r12 = r3
            r4 = r8
            r3 = 0
            goto L_0x0382
        L_0x0028:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r2 = r2.size()
            r6 = r3
            r3 = 0
        L_0x0030:
            if (r3 >= r2) goto L_0x0054
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r4 = r0.zzapv
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.zzjl r4 = (com.google.android.gms.internal.ads.zzjl) r4
            com.google.android.gms.internal.ads.zzju r4 = r4.zzaqt
            boolean r9 = r4.zzatj
            if (r9 == 0) goto L_0x0051
            long r9 = r4.zzasw
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x0051
            long r6 = r4.zzasw
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r4 = r0.zzapv
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.zzjl r4 = (com.google.android.gms.internal.ads.zzjl) r4
            r8 = r4
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0054:
            if (r8 != 0) goto L_0x0059
            r0.zzaqe = r5
            goto L_0x0004
        L_0x0059:
            long r2 = r29.getPosition()
            long r6 = r6 - r2
            int r2 = (int) r6
            if (r2 < 0) goto L_0x0077
            r1.zzw(r2)
            com.google.android.gms.internal.ads.zzju r2 = r8.zzaqt
            com.google.android.gms.internal.ads.zzpx r3 = r2.zzati
            byte[] r3 = r3.data
            int r4 = r2.zzath
            r1.readFully(r3, r11, r4)
            com.google.android.gms.internal.ads.zzpx r3 = r2.zzati
            r3.setPosition(r11)
            r2.zzatj = r11
            goto L_0x0004
        L_0x0077:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x007f:
            long r2 = r0.zzaqg
            int r2 = (int) r2
            int r3 = r0.zzaqh
            int r2 = r2 - r3
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqi
            if (r3 == 0) goto L_0x01d5
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqi
            byte[] r3 = r3.data
            r1.readFully(r3, r9, r2)
            com.google.android.gms.internal.ads.zzix r2 = new com.google.android.gms.internal.ads.zzix
            int r3 = r0.zzaqf
            com.google.android.gms.internal.ads.zzpx r4 = r0.zzaqi
            r2.<init>(r3, r4)
            long r3 = r29.getPosition()
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r5 = r0.zzaqc
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00b2
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r3 = r0.zzaqc
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zziw r3 = (com.google.android.gms.internal.ads.zziw) r3
            r3.zza((com.google.android.gms.internal.ads.zzix) r2)
            goto L_0x01d8
        L_0x00b2:
            int r5 = r2.type
            int r8 = com.google.android.gms.internal.ads.zziv.zzama
            if (r5 != r8) goto L_0x017b
            com.google.android.gms.internal.ads.zzpx r2 = r2.zzaos
            r2.setPosition(r9)
            int r5 = r2.readInt()
            int r5 = com.google.android.gms.internal.ads.zziv.zzaf(r5)
            r2.zzbl(r7)
            long r8 = r2.zzhd()
            if (r5 != 0) goto L_0x00db
            long r12 = r2.zzhd()
            long r14 = r2.zzhd()
            long r3 = r3 + r14
        L_0x00d7:
            r18 = r3
            r3 = r12
            goto L_0x00e5
        L_0x00db:
            long r12 = r2.zzhh()
            long r14 = r2.zzhh()
            long r3 = r3 + r14
            goto L_0x00d7
        L_0x00e5:
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r12 = r3
            r16 = r8
            long r20 = com.google.android.gms.internal.ads.zzqe.zza((long) r12, (long) r14, (long) r16)
            r2.zzbl(r6)
            int r5 = r2.readUnsignedShort()
            int[] r6 = new int[r5]
            long[] r14 = new long[r5]
            long[] r15 = new long[r5]
            long[] r12 = new long[r5]
            r16 = r3
            r3 = r20
        L_0x0102:
            if (r11 >= r5) goto L_0x0151
            int r13 = r2.readInt()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r13 & r22
            if (r22 != 0) goto L_0x0149
            long r22 = r2.zzhd()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r24
            r6[r11] = r13
            r14[r11] = r18
            r12[r11] = r3
            long r3 = r16 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            r12 = r3
            r26 = r14
            r7 = r15
            r14 = r16
            r16 = r8
            long r12 = com.google.android.gms.internal.ads.zzqe.zza((long) r12, (long) r14, (long) r16)
            r14 = r10[r11]
            long r14 = r12 - r14
            r7[r11] = r14
            r14 = 4
            r2.zzbl(r14)
            r14 = r6[r11]
            long r14 = (long) r14
            long r18 = r18 + r14
            int r11 = r11 + 1
            r16 = r3
            r15 = r7
            r3 = r12
            r14 = r26
            r7 = 4
            r12 = r10
            goto L_0x0102
        L_0x0149:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0151:
            r10 = r12
            r26 = r14
            r7 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.android.gms.internal.ads.zzhw r3 = new com.google.android.gms.internal.ads.zzhw
            r4 = r26
            r3.<init>(r6, r4, r7, r10)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.zzaql = r3
            com.google.android.gms.internal.ads.zzib r3 = r0.zzajq
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzig r2 = (com.google.android.gms.internal.ads.zzig) r2
            r3.zza(r2)
            r2 = 1
            r0.zzaqr = r2
            goto L_0x01d8
        L_0x017b:
            int r3 = r2.type
            int r4 = com.google.android.gms.internal.ads.zziv.zzaog
            if (r3 != r4) goto L_0x01d8
            com.google.android.gms.internal.ads.zzpx r2 = r2.zzaos
            com.google.android.gms.internal.ads.zzii r3 = r0.zzaqp
            if (r3 == 0) goto L_0x01d8
            r3 = 12
            r2.setPosition(r3)
            r2.zzhi()
            r2.zzhi()
            long r8 = r2.zzhd()
            long r4 = r2.zzhd()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = com.google.android.gms.internal.ads.zzqe.zza((long) r4, (long) r6, (long) r8)
            r2.setPosition(r3)
            int r10 = r2.zzhb()
            com.google.android.gms.internal.ads.zzii r3 = r0.zzaqp
            r3.zza(r2, r10)
            long r2 = r0.zzaql
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.zzii r6 = r0.zzaqp
            long r2 = r0.zzaql
            long r7 = r2 + r4
            r9 = 1
            r11 = 0
            r12 = 0
            r6.zza(r7, r9, r10, r11, r12)
            goto L_0x01d8
        L_0x01c5:
            java.util.LinkedList<com.google.android.gms.internal.ads.zzjk> r2 = r0.zzaqd
            com.google.android.gms.internal.ads.zzjk r3 = new com.google.android.gms.internal.ads.zzjk
            r3.<init>(r4, r10)
            r2.addLast(r3)
            int r2 = r0.zzaqk
            int r2 = r2 + r10
            r0.zzaqk = r2
            goto L_0x01d8
        L_0x01d5:
            r1.zzw(r2)
        L_0x01d8:
            long r2 = r29.getPosition()
            r0.zzt(r2)
            goto L_0x0004
        L_0x01e1:
            int r2 = r0.zzaqh
            if (r2 != 0) goto L_0x020b
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            byte[] r2 = r2.data
            r3 = 1
            boolean r2 = r1.zza(r2, r11, r9, r3)
            if (r2 != 0) goto L_0x01f4
            r25 = 0
            goto L_0x036e
        L_0x01f4:
            r0.zzaqh = r9
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            r2.setPosition(r11)
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            long r2 = r2.zzhd()
            r0.zzaqg = r2
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            int r2 = r2.readInt()
            r0.zzaqf = r2
        L_0x020b:
            long r2 = r0.zzaqg
            r4 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0227
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            byte[] r2 = r2.data
            r1.readFully(r2, r9, r9)
            int r2 = r0.zzaqh
            int r2 = r2 + r9
            r0.zzaqh = r2
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            long r2 = r2.zzhh()
            r0.zzaqg = r2
        L_0x0227:
            long r2 = r0.zzaqg
            int r4 = r0.zzaqh
            long r4 = (long) r4
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x037a
            long r2 = r29.getPosition()
            int r4 = r0.zzaqh
            long r4 = (long) r4
            long r2 = r2 - r4
            int r4 = r0.zzaqf
            int r5 = com.google.android.gms.internal.ads.zziv.zzamk
            if (r4 != r5) goto L_0x025a
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r4 = r0.zzapv
            int r4 = r4.size()
            r5 = 0
        L_0x0245:
            if (r5 >= r4) goto L_0x025a
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r7 = r0.zzapv
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.zzjl r7 = (com.google.android.gms.internal.ads.zzjl) r7
            com.google.android.gms.internal.ads.zzju r7 = r7.zzaqt
            r7.zzasu = r2
            r7.zzasw = r2
            r7.zzasv = r2
            int r5 = r5 + 1
            goto L_0x0245
        L_0x025a:
            int r4 = r0.zzaqf
            int r5 = com.google.android.gms.internal.ads.zziv.zzalh
            if (r4 != r5) goto L_0x027e
            r0.zzaqm = r8
            long r4 = r0.zzaqg
            long r2 = r2 + r4
            r0.zzaqj = r2
            boolean r2 = r0.zzaqr
            if (r2 != 0) goto L_0x027a
            com.google.android.gms.internal.ads.zzib r2 = r0.zzajq
            com.google.android.gms.internal.ads.zzih r3 = new com.google.android.gms.internal.ads.zzih
            long r4 = r0.zzaan
            r3.<init>(r4)
            r2.zza(r3)
            r2 = 1
            r0.zzaqr = r2
        L_0x027a:
            r0.zzaqe = r6
            goto L_0x036c
        L_0x027e:
            int r2 = r0.zzaqf
            int r3 = com.google.android.gms.internal.ads.zziv.zzamb
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamd
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzame
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamf
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamg
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamk
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzaml
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamm
            if (r2 == r3) goto L_0x02a7
            int r3 = com.google.android.gms.internal.ads.zziv.zzamp
            if (r2 != r3) goto L_0x02a5
            goto L_0x02a7
        L_0x02a5:
            r2 = 0
            goto L_0x02a8
        L_0x02a7:
            r2 = 1
        L_0x02a8:
            if (r2 == 0) goto L_0x02d3
            long r2 = r29.getPosition()
            long r4 = r0.zzaqg
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r4 = r0.zzaqc
            com.google.android.gms.internal.ads.zziw r5 = new com.google.android.gms.internal.ads.zziw
            int r6 = r0.zzaqf
            r5.<init>(r6, r2)
            r4.add(r5)
            long r4 = r0.zzaqg
            int r6 = r0.zzaqh
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x02ce
            r0.zzt(r2)
            goto L_0x036c
        L_0x02ce:
            r28.zzei()
            goto L_0x036c
        L_0x02d3:
            int r2 = r0.zzaqf
            int r3 = com.google.android.gms.internal.ads.zziv.zzams
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamr
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamc
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzama
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamt
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzalw
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzalx
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamo
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzaly
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzalz
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamu
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzanc
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzand
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzanh
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzang
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzane
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzanf
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamq
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzamn
            if (r2 == r3) goto L_0x0328
            int r3 = com.google.android.gms.internal.ads.zziv.zzaog
            if (r2 != r3) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            r2 = 0
            goto L_0x0329
        L_0x0328:
            r2 = 1
        L_0x0329:
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == 0) goto L_0x0361
            int r2 = r0.zzaqh
            if (r2 != r9) goto L_0x0359
            long r5 = r0.zzaqg
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0351
            com.google.android.gms.internal.ads.zzpx r2 = new com.google.android.gms.internal.ads.zzpx
            long r3 = r0.zzaqg
            int r3 = (int) r3
            r2.<init>((int) r3)
            r0.zzaqi = r2
            com.google.android.gms.internal.ads.zzpx r2 = r0.zzaqa
            byte[] r2 = r2.data
            com.google.android.gms.internal.ads.zzpx r3 = r0.zzaqi
            byte[] r3 = r3.data
            java.lang.System.arraycopy(r2, r11, r3, r11, r9)
            r2 = 1
            r0.zzaqe = r2
            goto L_0x036c
        L_0x0351:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0359:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0361:
            long r5 = r0.zzaqg
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0372
            r0.zzaqi = r8
            r2 = 1
            r0.zzaqe = r2
        L_0x036c:
            r25 = 1
        L_0x036e:
            if (r25 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x0372:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x037a:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0382:
            if (r3 >= r7) goto L_0x03a3
            java.lang.Object r10 = r2.valueAt(r3)
            com.google.android.gms.internal.ads.zzjl r10 = (com.google.android.gms.internal.ads.zzjl) r10
            int r14 = r10.zzaqy
            com.google.android.gms.internal.ads.zzju r15 = r10.zzaqt
            int r15 = r15.zzasx
            if (r14 == r15) goto L_0x03a0
            com.google.android.gms.internal.ads.zzju r14 = r10.zzaqt
            long[] r14 = r14.zzasy
            int r15 = r10.zzaqy
            r15 = r14[r15]
            int r14 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x03a0
            r4 = r10
            r12 = r15
        L_0x03a0:
            int r3 = r3 + 1
            goto L_0x0382
        L_0x03a3:
            if (r4 != 0) goto L_0x03c1
            long r2 = r0.zzaqj
            long r4 = r29.getPosition()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x03b9
            r1.zzw(r2)
            r28.zzei()
            r3 = 0
            r5 = 0
            goto L_0x060e
        L_0x03b9:
            com.google.android.gms.internal.ads.zzfx r1 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03c1:
            com.google.android.gms.internal.ads.zzju r2 = r4.zzaqt
            long[] r2 = r2.zzasy
            int r3 = r4.zzaqy
            r12 = r2[r3]
            long r2 = r29.getPosition()
            long r12 = r12 - r2
            int r2 = (int) r12
            if (r2 >= 0) goto L_0x03d9
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r3)
            r2 = 0
        L_0x03d9:
            r1.zzw(r2)
            r0.zzaqm = r4
        L_0x03de:
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            com.google.android.gms.internal.ads.zzju r2 = r2.zzaqt
            int[] r2 = r2.zzata
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            int r3 = r3.zzaqw
            r2 = r2[r3]
            r0.zzaqn = r2
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            com.google.android.gms.internal.ads.zzju r2 = r2.zzaqt
            boolean r2 = r2.zzate
            if (r2 == 0) goto L_0x0451
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            com.google.android.gms.internal.ads.zzju r3 = r2.zzaqt
            com.google.android.gms.internal.ads.zzpx r4 = r3.zzati
            com.google.android.gms.internal.ads.zzjf r7 = r3.zzast
            int r7 = r7.zzapo
            com.google.android.gms.internal.ads.zzjt r10 = r3.zzatg
            if (r10 == 0) goto L_0x0405
            com.google.android.gms.internal.ads.zzjt r7 = r3.zzatg
            goto L_0x040b
        L_0x0405:
            com.google.android.gms.internal.ads.zzjs r10 = r2.zzaqu
            com.google.android.gms.internal.ads.zzjt[] r10 = r10.zzasn
            r7 = r10[r7]
        L_0x040b:
            int r7 = r7.zzasr
            boolean[] r3 = r3.zzatf
            int r10 = r2.zzaqw
            boolean r3 = r3[r10]
            com.google.android.gms.internal.ads.zzpx r10 = r0.zzapy
            byte[] r10 = r10.data
            if (r3 == 0) goto L_0x041c
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x041d
        L_0x041c:
            r12 = 0
        L_0x041d:
            r12 = r12 | r7
            byte r12 = (byte) r12
            r10[r11] = r12
            com.google.android.gms.internal.ads.zzpx r10 = r0.zzapy
            r10.setPosition(r11)
            com.google.android.gms.internal.ads.zzii r2 = r2.zzakw
            com.google.android.gms.internal.ads.zzpx r10 = r0.zzapy
            r12 = 1
            r2.zza(r10, r12)
            r2.zza(r4, r7)
            if (r3 != 0) goto L_0x0436
            int r7 = r7 + 1
            goto L_0x0447
        L_0x0436:
            int r3 = r4.readUnsignedShort()
            r10 = -2
            r4.zzbl(r10)
            int r3 = r3 * 6
            int r3 = r3 + r6
            r2.zza(r4, r3)
            int r7 = r7 + 1
            int r7 = r7 + r3
        L_0x0447:
            r0.zzajn = r7
            int r2 = r0.zzaqn
            int r3 = r0.zzajn
            int r2 = r2 + r3
            r0.zzaqn = r2
            goto L_0x0453
        L_0x0451:
            r0.zzajn = r11
        L_0x0453:
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            com.google.android.gms.internal.ads.zzjs r2 = r2.zzaqu
            int r2 = r2.zzasm
            r3 = 1
            if (r2 != r3) goto L_0x0464
            int r2 = r0.zzaqn
            int r2 = r2 - r9
            r0.zzaqn = r2
            r1.zzw(r9)
        L_0x0464:
            r2 = 4
            r0.zzaqe = r2
            r0.zzajm = r11
        L_0x0469:
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            com.google.android.gms.internal.ads.zzju r2 = r2.zzaqt
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            com.google.android.gms.internal.ads.zzjs r3 = r3.zzaqu
            com.google.android.gms.internal.ads.zzjl r4 = r0.zzaqm
            com.google.android.gms.internal.ads.zzii r12 = r4.zzakw
            com.google.android.gms.internal.ads.zzjl r4 = r0.zzaqm
            int r4 = r4.zzaqw
            int r7 = r3.zzakx
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x054a
            com.google.android.gms.internal.ads.zzpx r7 = r0.zzapw
            byte[] r7 = r7.data
            r7[r11] = r11
            r13 = 1
            r7[r13] = r11
            r7[r6] = r11
            int r6 = r3.zzakx
            int r6 = r6 + r13
            int r13 = r3.zzakx
            r14 = 4
            int r13 = 4 - r13
        L_0x0492:
            int r14 = r0.zzajn
            int r15 = r0.zzaqn
            if (r14 >= r15) goto L_0x0560
            int r14 = r0.zzajm
            if (r14 != 0) goto L_0x04e0
            r1.readFully(r7, r13, r6)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapw
            r14.setPosition(r11)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapw
            int r14 = r14.zzhg()
            r15 = 1
            int r14 = r14 - r15
            r0.zzajm = r14
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzahx
            r14.setPosition(r11)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzahx
            r5 = 4
            r12.zza(r14, r5)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapw
            r12.zza(r14, r15)
            com.google.android.gms.internal.ads.zzii[] r14 = r0.zzaqq
            if (r14 == 0) goto L_0x04d0
            com.google.android.gms.internal.ads.zzfs r14 = r3.zzaad
            java.lang.String r14 = r14.zzzj
            byte r15 = r7[r5]
            boolean r14 = com.google.android.gms.internal.ads.zzpu.zza(r14, r15)
            if (r14 == 0) goto L_0x04d0
            r14 = 1
            goto L_0x04d1
        L_0x04d0:
            r14 = 0
        L_0x04d1:
            r0.zzaqo = r14
            int r14 = r0.zzajn
            int r14 = r14 + 5
            r0.zzajn = r14
            int r14 = r0.zzaqn
            int r14 = r14 + r13
            r0.zzaqn = r14
            r5 = 3
            goto L_0x0492
        L_0x04e0:
            r5 = 4
            boolean r14 = r0.zzaqo
            if (r14 == 0) goto L_0x0530
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapx
            int r15 = r0.zzajm
            r14.reset(r15)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapx
            byte[] r14 = r14.data
            int r15 = r0.zzajm
            r1.readFully(r14, r11, r15)
            com.google.android.gms.internal.ads.zzpx r14 = r0.zzapx
            int r15 = r0.zzajm
            r12.zza(r14, r15)
            int r14 = r0.zzajm
            com.google.android.gms.internal.ads.zzpx r15 = r0.zzapx
            byte[] r15 = r15.data
            com.google.android.gms.internal.ads.zzpx r5 = r0.zzapx
            int r5 = r5.limit()
            int r5 = com.google.android.gms.internal.ads.zzpu.zzb(r15, r5)
            com.google.android.gms.internal.ads.zzpx r15 = r0.zzapx
            java.lang.String r8 = "video/hevc"
            com.google.android.gms.internal.ads.zzfs r11 = r3.zzaad
            java.lang.String r11 = r11.zzzj
            boolean r8 = r8.equals(r11)
            r15.setPosition(r8)
            com.google.android.gms.internal.ads.zzpx r8 = r0.zzapx
            r8.zzbk(r5)
            long r15 = r2.zzal(r4)
            r27 = r6
            long r5 = r15 * r9
            com.google.android.gms.internal.ads.zzpx r8 = r0.zzapx
            com.google.android.gms.internal.ads.zzii[] r11 = r0.zzaqq
            com.google.android.gms.internal.ads.zzoc.zza(r5, r8, r11)
            goto L_0x0539
        L_0x0530:
            r27 = r6
            int r5 = r0.zzajm
            r6 = 0
            int r14 = r12.zza(r1, r5, r6)
        L_0x0539:
            int r5 = r0.zzajn
            int r5 = r5 + r14
            r0.zzajn = r5
            int r5 = r0.zzajm
            int r5 = r5 - r14
            r0.zzajm = r5
            r6 = r27
            r5 = 3
            r8 = 0
            r11 = 0
            goto L_0x0492
        L_0x054a:
            int r5 = r0.zzajn
            int r6 = r0.zzaqn
            if (r5 >= r6) goto L_0x0560
            int r5 = r0.zzaqn
            int r6 = r0.zzajn
            int r5 = r5 - r6
            r6 = 0
            int r5 = r12.zza(r1, r5, r6)
            int r6 = r0.zzajn
            int r6 = r6 + r5
            r0.zzajn = r6
            goto L_0x054a
        L_0x0560:
            long r5 = r2.zzal(r4)
            long r5 = r5 * r9
            com.google.android.gms.internal.ads.zzqb r7 = r0.zzapz
            if (r7 != 0) goto L_0x0611
            boolean r7 = r2.zzate
            if (r7 == 0) goto L_0x0571
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0572
        L_0x0571:
            r11 = 0
        L_0x0572:
            boolean[] r7 = r2.zzatd
            boolean r4 = r7[r4]
            r15 = r11 | r4
            boolean r4 = r2.zzate
            if (r4 == 0) goto L_0x05a1
            com.google.android.gms.internal.ads.zzjt r4 = r2.zzatg
            if (r4 == 0) goto L_0x0584
            com.google.android.gms.internal.ads.zzjt r3 = r2.zzatg
        L_0x0582:
            r8 = r3
            goto L_0x058d
        L_0x0584:
            com.google.android.gms.internal.ads.zzjt[] r3 = r3.zzasn
            com.google.android.gms.internal.ads.zzjf r4 = r2.zzast
            int r4 = r4.zzapo
            r3 = r3[r4]
            goto L_0x0582
        L_0x058d:
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            com.google.android.gms.internal.ads.zzjt r3 = r3.zzara
            if (r8 == r3) goto L_0x059c
            com.google.android.gms.internal.ads.zzij r3 = new com.google.android.gms.internal.ads.zzij
            byte[] r4 = r8.zzass
            r7 = 1
            r3.<init>(r7, r4)
            goto L_0x05a3
        L_0x059c:
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            com.google.android.gms.internal.ads.zzij r3 = r3.zzaqz
            goto L_0x05a3
        L_0x05a1:
            r3 = 0
            r8 = 0
        L_0x05a3:
            com.google.android.gms.internal.ads.zzjl r4 = r0.zzaqm
            r4.zzaqz = r3
            com.google.android.gms.internal.ads.zzjl r4 = r0.zzaqm
            r4.zzara = r8
            int r4 = r0.zzaqn
            r17 = 0
            r13 = r5
            r16 = r4
            r18 = r3
            r12.zza(r13, r15, r16, r17, r18)
        L_0x05b7:
            java.util.LinkedList<com.google.android.gms.internal.ads.zzjk> r3 = r0.zzaqd
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x05dd
            java.util.LinkedList<com.google.android.gms.internal.ads.zzjk> r3 = r0.zzaqd
            java.lang.Object r3 = r3.removeFirst()
            com.google.android.gms.internal.ads.zzjk r3 = (com.google.android.gms.internal.ads.zzjk) r3
            int r4 = r0.zzaqk
            int r7 = r3.size
            int r4 = r4 - r7
            r0.zzaqk = r4
            com.google.android.gms.internal.ads.zzii r7 = r0.zzaqp
            long r8 = r3.zzaqs
            long r8 = r8 + r5
            r10 = 1
            int r11 = r3.size
            int r12 = r0.zzaqk
            r13 = 0
            r7.zza(r8, r10, r11, r12, r13)
            goto L_0x05b7
        L_0x05dd:
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            int r4 = r3.zzaqw
            r5 = 1
            int r4 = r4 + r5
            r3.zzaqw = r4
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            int r4 = r3.zzaqx
            int r4 = r4 + r5
            r3.zzaqx = r4
            com.google.android.gms.internal.ads.zzjl r3 = r0.zzaqm
            int r3 = r3.zzaqx
            int[] r2 = r2.zzasz
            com.google.android.gms.internal.ads.zzjl r4 = r0.zzaqm
            int r4 = r4.zzaqy
            r2 = r2[r4]
            if (r3 != r2) goto L_0x060a
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            int r3 = r2.zzaqy
            int r3 = r3 + r5
            r2.zzaqy = r3
            com.google.android.gms.internal.ads.zzjl r2 = r0.zzaqm
            r3 = 0
            r2.zzaqx = r3
            r2 = 0
            r0.zzaqm = r2
            goto L_0x060b
        L_0x060a:
            r3 = 0
        L_0x060b:
            r2 = 3
            r0.zzaqe = r2
        L_0x060e:
            if (r5 == 0) goto L_0x0004
            return r3
        L_0x0611:
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzji.zza(com.google.android.gms.internal.ads.zzia, com.google.android.gms.internal.ads.zzif):int");
    }

    private final void zzei() {
        this.zzaqe = 0;
        this.zzaqh = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x065a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzt(long r55) throws com.google.android.gms.internal.ads.zzfx {
        /*
            r54 = this;
            r0 = r54
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r1 = r0.zzaqc
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0701
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r1 = r0.zzaqc
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zziw r1 = (com.google.android.gms.internal.ads.zziw) r1
            long r1 = r1.zzaop
            int r5 = (r1 > r55 ? 1 : (r1 == r55 ? 0 : -1))
            if (r5 != 0) goto L_0x0701
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r1 = r0.zzaqc
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.zziw r1 = (com.google.android.gms.internal.ads.zziw) r1
            int r2 = r1.type
            int r5 = com.google.android.gms.internal.ads.zziv.zzamb
            r7 = 12
            r9 = 8
            r11 = 1
            if (r2 != r5) goto L_0x01ca
            java.lang.String r2 = "Unexpected moov box."
            com.google.android.gms.internal.ads.zzpo.checkState(r11, r2)
            java.util.List<com.google.android.gms.internal.ads.zzix> r2 = r1.zzaoq
            com.google.android.gms.internal.ads.zzhp r2 = zzb(r2)
            int r5 = com.google.android.gms.internal.ads.zziv.zzamm
            com.google.android.gms.internal.ads.zziw r5 = r1.zzaj(r5)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.gms.internal.ads.zzix> r15 = r5.zzaoq
            int r15 = r15.size()
            r18 = r12
            r12 = 0
        L_0x004f:
            if (r12 >= r15) goto L_0x00bd
            java.util.List<com.google.android.gms.internal.ads.zzix> r13 = r5.zzaoq
            java.lang.Object r13 = r13.get(r12)
            com.google.android.gms.internal.ads.zzix r13 = (com.google.android.gms.internal.ads.zzix) r13
            int r10 = r13.type
            int r6 = com.google.android.gms.internal.ads.zziv.zzaly
            if (r10 != r6) goto L_0x0096
            com.google.android.gms.internal.ads.zzpx r6 = r13.zzaos
            r6.setPosition(r7)
            int r10 = r6.readInt()
            int r13 = r6.zzhg()
            int r13 = r13 - r11
            int r7 = r6.zzhg()
            int r11 = r6.zzhg()
            int r6 = r6.readInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.gms.internal.ads.zzjf r8 = new com.google.android.gms.internal.ads.zzjf
            r8.<init>(r13, r7, r11, r6)
            android.util.Pair r6 = android.util.Pair.create(r10, r8)
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.zzjf r6 = (com.google.android.gms.internal.ads.zzjf) r6
            r14.put(r7, r6)
            goto L_0x00b7
        L_0x0096:
            int r6 = r13.type
            int r7 = com.google.android.gms.internal.ads.zziv.zzamn
            if (r6 != r7) goto L_0x00b7
            com.google.android.gms.internal.ads.zzpx r6 = r13.zzaos
            r6.setPosition(r9)
            int r7 = r6.readInt()
            int r7 = com.google.android.gms.internal.ads.zziv.zzaf(r7)
            if (r7 != 0) goto L_0x00b2
            long r6 = r6.zzhd()
        L_0x00af:
            r18 = r6
            goto L_0x00b7
        L_0x00b2:
            long r6 = r6.zzhh()
            goto L_0x00af
        L_0x00b7:
            int r12 = r12 + 1
            r7 = 12
            r11 = 1
            goto L_0x004f
        L_0x00bd:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            java.util.List<com.google.android.gms.internal.ads.zziw> r6 = r1.zzaor
            int r6 = r6.size()
            r7 = 0
        L_0x00c9:
            if (r7 >= r6) goto L_0x00f8
            java.util.List<com.google.android.gms.internal.ads.zziw> r8 = r1.zzaor
            java.lang.Object r8 = r8.get(r7)
            r12 = r8
            com.google.android.gms.internal.ads.zziw r12 = (com.google.android.gms.internal.ads.zziw) r12
            int r8 = r12.type
            int r10 = com.google.android.gms.internal.ads.zziv.zzamd
            if (r8 != r10) goto L_0x00f3
            int r8 = com.google.android.gms.internal.ads.zziv.zzamc
            com.google.android.gms.internal.ads.zzix r13 = r1.zzai(r8)
            r17 = 0
            r8 = r14
            r14 = r18
            r16 = r2
            com.google.android.gms.internal.ads.zzjs r10 = com.google.android.gms.internal.ads.zziy.zza((com.google.android.gms.internal.ads.zziw) r12, (com.google.android.gms.internal.ads.zzix) r13, (long) r14, (com.google.android.gms.internal.ads.zzhp) r16, (boolean) r17)
            if (r10 == 0) goto L_0x00f4
            int r11 = r10.f48id
            r5.put(r11, r10)
            goto L_0x00f4
        L_0x00f3:
            r8 = r14
        L_0x00f4:
            int r7 = r7 + 1
            r14 = r8
            goto L_0x00c9
        L_0x00f8:
            r8 = r14
            int r1 = r5.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0199
            r2 = 0
        L_0x0106:
            if (r2 >= r1) goto L_0x013a
            java.lang.Object r6 = r5.valueAt(r2)
            com.google.android.gms.internal.ads.zzjs r6 = (com.google.android.gms.internal.ads.zzjs) r6
            com.google.android.gms.internal.ads.zzjl r7 = new com.google.android.gms.internal.ads.zzjl
            com.google.android.gms.internal.ads.zzib r10 = r0.zzajq
            int r11 = r6.type
            com.google.android.gms.internal.ads.zzii r10 = r10.zzb(r2, r11)
            r7.<init>(r10)
            int r10 = r6.f48id
            java.lang.Object r10 = r8.get(r10)
            com.google.android.gms.internal.ads.zzjf r10 = (com.google.android.gms.internal.ads.zzjf) r10
            r7.zza(r6, r10)
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r10 = r0.zzapv
            int r11 = r6.f48id
            r10.put(r11, r7)
            long r10 = r0.zzaan
            long r6 = r6.zzaan
            long r6 = java.lang.Math.max(r10, r6)
            r0.zzaan = r6
            int r2 = r2 + 1
            goto L_0x0106
        L_0x013a:
            int r1 = r0.flags
            r2 = 4
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzii r1 = r0.zzaqp
            if (r1 != 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzib r1 = r0.zzajq
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r5 = r0.zzapv
            int r5 = r5.size()
            com.google.android.gms.internal.ads.zzii r1 = r1.zzb(r5, r2)
            r0.zzaqp = r1
            com.google.android.gms.internal.ads.zzii r1 = r0.zzaqp
            java.lang.String r2 = "application/x-emsg"
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.zza((java.lang.String) r7, (java.lang.String) r2, (long) r5)
            r1.zzf(r2)
        L_0x0163:
            int r1 = r0.flags
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0192
            com.google.android.gms.internal.ads.zzii[] r1 = r0.zzaqq
            if (r1 != 0) goto L_0x0192
            com.google.android.gms.internal.ads.zzib r1 = r0.zzajq
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r2 = r2.size()
            r5 = 1
            int r2 = r2 + r5
            r5 = 3
            com.google.android.gms.internal.ads.zzii r1 = r1.zzb(r2, r5)
            r5 = 0
            java.lang.String r6 = "application/cea-608"
            r7 = 0
            r8 = -1
            r9 = 0
            r10 = 0
            r11 = 0
            com.google.android.gms.internal.ads.zzfs r2 = com.google.android.gms.internal.ads.zzfs.zza((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (int) r8, (int) r9, (java.lang.String) r10, (com.google.android.gms.internal.ads.zzhp) r11)
            r1.zzf(r2)
            r2 = 1
            com.google.android.gms.internal.ads.zzii[] r2 = new com.google.android.gms.internal.ads.zzii[r2]
            r5 = 0
            r2[r5] = r1
            r0.zzaqq = r2
        L_0x0192:
            com.google.android.gms.internal.ads.zzib r1 = r0.zzajq
            r1.zzdy()
            goto L_0x0002
        L_0x0199:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r2 = r2.size()
            if (r2 != r1) goto L_0x01a4
            r20 = 1
            goto L_0x01a6
        L_0x01a4:
            r20 = 0
        L_0x01a6:
            com.google.android.gms.internal.ads.zzpo.checkState(r20)
            r2 = 0
        L_0x01aa:
            if (r2 >= r1) goto L_0x0002
            java.lang.Object r6 = r5.valueAt(r2)
            com.google.android.gms.internal.ads.zzjs r6 = (com.google.android.gms.internal.ads.zzjs) r6
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r7 = r0.zzapv
            int r9 = r6.f48id
            java.lang.Object r7 = r7.get(r9)
            com.google.android.gms.internal.ads.zzjl r7 = (com.google.android.gms.internal.ads.zzjl) r7
            int r9 = r6.f48id
            java.lang.Object r9 = r8.get(r9)
            com.google.android.gms.internal.ads.zzjf r9 = (com.google.android.gms.internal.ads.zzjf) r9
            r7.zza(r6, r9)
            int r2 = r2 + 1
            goto L_0x01aa
        L_0x01ca:
            r7 = 0
            int r2 = r1.type
            int r5 = com.google.android.gms.internal.ads.zziv.zzamk
            if (r2 != r5) goto L_0x06ea
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r2 = r0.zzapv
            int r5 = r0.flags
            byte[] r6 = r0.zzaqb
            java.util.List<com.google.android.gms.internal.ads.zziw> r8 = r1.zzaor
            int r8 = r8.size()
            r10 = 0
        L_0x01de:
            if (r10 >= r8) goto L_0x06bc
            java.util.List<com.google.android.gms.internal.ads.zziw> r11 = r1.zzaor
            java.lang.Object r11 = r11.get(r10)
            com.google.android.gms.internal.ads.zziw r11 = (com.google.android.gms.internal.ads.zziw) r11
            int r12 = r11.type
            int r13 = com.google.android.gms.internal.ads.zziv.zzaml
            if (r12 != r13) goto L_0x069a
            int r12 = com.google.android.gms.internal.ads.zziv.zzalx
            com.google.android.gms.internal.ads.zzix r12 = r11.zzai(r12)
            com.google.android.gms.internal.ads.zzpx r12 = r12.zzaos
            r12.setPosition(r9)
            int r13 = r12.readInt()
            int r13 = com.google.android.gms.internal.ads.zziv.zzag(r13)
            int r14 = r12.readInt()
            r15 = r5 & 16
            if (r15 != 0) goto L_0x020a
            goto L_0x020b
        L_0x020a:
            r14 = 0
        L_0x020b:
            java.lang.Object r14 = r2.get(r14)
            com.google.android.gms.internal.ads.zzjl r14 = (com.google.android.gms.internal.ads.zzjl) r14
            if (r14 != 0) goto L_0x0217
            r14 = r7
            r21 = r8
            goto L_0x0267
        L_0x0217:
            r15 = r13 & 1
            if (r15 == 0) goto L_0x022a
            r21 = r8
            long r7 = r12.zzhh()
            com.google.android.gms.internal.ads.zzju r15 = r14.zzaqt
            r15.zzasv = r7
            com.google.android.gms.internal.ads.zzju r15 = r14.zzaqt
            r15.zzasw = r7
            goto L_0x022c
        L_0x022a:
            r21 = r8
        L_0x022c:
            com.google.android.gms.internal.ads.zzjf r7 = r14.zzaqv
            r8 = r13 & 2
            if (r8 == 0) goto L_0x0239
            int r8 = r12.zzhg()
            r15 = 1
            int r8 = r8 - r15
            goto L_0x023b
        L_0x0239:
            int r8 = r7.zzapo
        L_0x023b:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x0244
            int r15 = r12.zzhg()
            goto L_0x0246
        L_0x0244:
            int r15 = r7.duration
        L_0x0246:
            r16 = r13 & 16
            if (r16 == 0) goto L_0x0251
            int r16 = r12.zzhg()
            r9 = r16
            goto L_0x0253
        L_0x0251:
            int r9 = r7.size
        L_0x0253:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x025c
            int r7 = r12.zzhg()
            goto L_0x025e
        L_0x025c:
            int r7 = r7.flags
        L_0x025e:
            com.google.android.gms.internal.ads.zzju r12 = r14.zzaqt
            com.google.android.gms.internal.ads.zzjf r13 = new com.google.android.gms.internal.ads.zzjf
            r13.<init>(r8, r15, r9, r7)
            r12.zzast = r13
        L_0x0267:
            if (r14 == 0) goto L_0x0692
            com.google.android.gms.internal.ads.zzju r7 = r14.zzaqt
            long r8 = r7.zzatk
            r14.reset()
            int r12 = com.google.android.gms.internal.ads.zziv.zzalw
            com.google.android.gms.internal.ads.zzix r12 = r11.zzai(r12)
            if (r12 == 0) goto L_0x029d
            r12 = r5 & 2
            if (r12 != 0) goto L_0x029d
            int r8 = com.google.android.gms.internal.ads.zziv.zzalw
            com.google.android.gms.internal.ads.zzix r8 = r11.zzai(r8)
            com.google.android.gms.internal.ads.zzpx r8 = r8.zzaos
            r9 = 8
            r8.setPosition(r9)
            int r9 = r8.readInt()
            int r9 = com.google.android.gms.internal.ads.zziv.zzaf(r9)
            r12 = 1
            if (r9 != r12) goto L_0x0299
            long r8 = r8.zzhh()
            goto L_0x029d
        L_0x0299:
            long r8 = r8.zzhd()
        L_0x029d:
            java.util.List<com.google.android.gms.internal.ads.zzix> r12 = r11.zzaoq
            int r13 = r12.size()
            r22 = r2
            r2 = 0
            r3 = 0
            r15 = 0
        L_0x02a8:
            if (r15 >= r13) goto L_0x02d0
            java.lang.Object r4 = r12.get(r15)
            com.google.android.gms.internal.ads.zzix r4 = (com.google.android.gms.internal.ads.zzix) r4
            r23 = r8
            int r8 = r4.type
            int r9 = com.google.android.gms.internal.ads.zziv.zzalz
            if (r8 != r9) goto L_0x02c9
            com.google.android.gms.internal.ads.zzpx r4 = r4.zzaos
            r8 = 12
            r4.setPosition(r8)
            int r4 = r4.zzhg()
            if (r4 <= 0) goto L_0x02cb
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x02c9:
            r8 = 12
        L_0x02cb:
            int r15 = r15 + 1
            r8 = r23
            goto L_0x02a8
        L_0x02d0:
            r23 = r8
            r4 = 0
            r8 = 12
            r14.zzaqy = r4
            r14.zzaqx = r4
            r14.zzaqw = r4
            com.google.android.gms.internal.ads.zzju r4 = r14.zzaqt
            r4.zzasx = r2
            r4.zzapk = r3
            int[] r9 = r4.zzasz
            if (r9 == 0) goto L_0x02ea
            int[] r9 = r4.zzasz
            int r9 = r9.length
            if (r9 >= r2) goto L_0x02f2
        L_0x02ea:
            long[] r9 = new long[r2]
            r4.zzasy = r9
            int[] r2 = new int[r2]
            r4.zzasz = r2
        L_0x02f2:
            int[] r2 = r4.zzata
            if (r2 == 0) goto L_0x02fb
            int[] r2 = r4.zzata
            int r2 = r2.length
            if (r2 >= r3) goto L_0x0313
        L_0x02fb:
            int r3 = r3 * 125
            int r3 = r3 / 100
            int[] r2 = new int[r3]
            r4.zzata = r2
            int[] r2 = new int[r3]
            r4.zzatb = r2
            long[] r2 = new long[r3]
            r4.zzatc = r2
            boolean[] r2 = new boolean[r3]
            r4.zzatd = r2
            boolean[] r2 = new boolean[r3]
            r4.zzatf = r2
        L_0x0313:
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0316:
            if (r2 >= r13) goto L_0x04b0
            java.lang.Object r17 = r12.get(r2)
            r8 = r17
            com.google.android.gms.internal.ads.zzix r8 = (com.google.android.gms.internal.ads.zzix) r8
            int r9 = r8.type
            int r15 = com.google.android.gms.internal.ads.zziv.zzalz
            if (r9 != r15) goto L_0x0480
            int r9 = r3 + 1
            com.google.android.gms.internal.ads.zzpx r8 = r8.zzaos
            r15 = 8
            r8.setPosition(r15)
            int r15 = r8.readInt()
            int r15 = com.google.android.gms.internal.ads.zziv.zzag(r15)
            r25 = r9
            com.google.android.gms.internal.ads.zzjs r9 = r14.zzaqu
            r26 = r12
            com.google.android.gms.internal.ads.zzju r12 = r14.zzaqt
            r27 = r13
            com.google.android.gms.internal.ads.zzjf r13 = r12.zzast
            int[] r0 = r12.zzasz
            int r16 = r8.zzhg()
            r0[r3] = r16
            long[] r0 = r12.zzasy
            r28 = r6
            r29 = r7
            long r6 = r12.zzasv
            r0[r3] = r6
            r0 = r15 & 1
            if (r0 == 0) goto L_0x036c
            long[] r0 = r12.zzasy
            r6 = r0[r3]
            r30 = r1
            int r1 = r8.readInt()
            r31 = r10
            r32 = r11
            long r10 = (long) r1
            long r6 = r6 + r10
            r0[r3] = r6
            goto L_0x0372
        L_0x036c:
            r30 = r1
            r31 = r10
            r32 = r11
        L_0x0372:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0378
            r0 = 1
            goto L_0x0379
        L_0x0378:
            r0 = 0
        L_0x0379:
            int r1 = r13.flags
            if (r0 == 0) goto L_0x0381
            int r1 = r8.zzhg()
        L_0x0381:
            r6 = r15 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0387
            r6 = 1
            goto L_0x0388
        L_0x0387:
            r6 = 0
        L_0x0388:
            r7 = r15 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x038e
            r7 = 1
            goto L_0x038f
        L_0x038e:
            r7 = 0
        L_0x038f:
            r10 = r15 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x0395
            r10 = 1
            goto L_0x0396
        L_0x0395:
            r10 = 0
        L_0x0396:
            r11 = r15 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x039c
            r11 = 1
            goto L_0x039d
        L_0x039c:
            r11 = 0
        L_0x039d:
            long[] r15 = r9.zzaso
            if (r15 == 0) goto L_0x03c5
            long[] r15 = r9.zzaso
            int r15 = r15.length
            r33 = r1
            r1 = 1
            if (r15 != r1) goto L_0x03c7
            long[] r1 = r9.zzaso
            r15 = 0
            r16 = r1[r15]
            r18 = 0
            int r1 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            long[] r1 = r9.zzasp
            r34 = r1[r15]
            r36 = 1000(0x3e8, double:4.94E-321)
            r40 = r14
            long r14 = r9.zzcr
            r38 = r14
            long r15 = com.google.android.gms.internal.ads.zzqe.zza((long) r34, (long) r36, (long) r38)
            goto L_0x03cb
        L_0x03c5:
            r33 = r1
        L_0x03c7:
            r40 = r14
            r15 = 0
        L_0x03cb:
            int[] r1 = r12.zzata
            int[] r14 = r12.zzatb
            r41 = r2
            long[] r2 = r12.zzatc
            r42 = r1
            boolean[] r1 = r12.zzatd
            r43 = r1
            int r1 = r9.type
            r44 = r2
            r2 = 2
            if (r1 != r2) goto L_0x03e6
            r1 = r5 & 1
            if (r1 == 0) goto L_0x03e6
            r1 = 1
            goto L_0x03e7
        L_0x03e6:
            r1 = 0
        L_0x03e7:
            int[] r2 = r12.zzasz
            r2 = r2[r3]
            int r2 = r2 + r4
            r46 = r4
            r45 = r5
            long r4 = r9.zzcr
            if (r3 <= 0) goto L_0x03fb
            r49 = r14
            r47 = r15
            long r14 = r12.zzatk
            goto L_0x0401
        L_0x03fb:
            r49 = r14
            r47 = r15
            r14 = r23
        L_0x0401:
            r3 = r46
        L_0x0403:
            if (r3 >= r2) goto L_0x0477
            if (r6 == 0) goto L_0x040c
            int r9 = r8.zzhg()
            goto L_0x040e
        L_0x040c:
            int r9 = r13.duration
        L_0x040e:
            if (r7 == 0) goto L_0x0417
            int r16 = r8.zzhg()
            r50 = r2
            goto L_0x041d
        L_0x0417:
            r50 = r2
            int r2 = r13.size
            r16 = r2
        L_0x041d:
            if (r3 != 0) goto L_0x0424
            if (r0 == 0) goto L_0x0424
            r2 = r33
            goto L_0x042d
        L_0x0424:
            if (r10 == 0) goto L_0x042b
            int r2 = r8.readInt()
            goto L_0x042d
        L_0x042b:
            int r2 = r13.flags
        L_0x042d:
            if (r11 == 0) goto L_0x0441
            r51 = r0
            int r0 = r8.readInt()
            int r0 = r0 * 1000
            r52 = r6
            r53 = r7
            long r6 = (long) r0
            long r6 = r6 / r4
            int r0 = (int) r6
            r49[r3] = r0
            goto L_0x044a
        L_0x0441:
            r51 = r0
            r52 = r6
            r53 = r7
            r0 = 0
            r49[r3] = r0
        L_0x044a:
            r36 = 1000(0x3e8, double:4.94E-321)
            r34 = r14
            r38 = r4
            long r6 = com.google.android.gms.internal.ads.zzqe.zza((long) r34, (long) r36, (long) r38)
            long r6 = r6 - r47
            r44[r3] = r6
            r42[r3] = r16
            r0 = 16
            int r2 = r2 >> r0
            r0 = 1
            r2 = r2 & r0
            if (r2 != 0) goto L_0x0467
            if (r1 == 0) goto L_0x0465
            if (r3 != 0) goto L_0x0467
        L_0x0465:
            r0 = 1
            goto L_0x0468
        L_0x0467:
            r0 = 0
        L_0x0468:
            r43[r3] = r0
            long r6 = (long) r9
            long r14 = r14 + r6
            int r3 = r3 + 1
            r2 = r50
            r0 = r51
            r6 = r52
            r7 = r53
            goto L_0x0403
        L_0x0477:
            r50 = r2
            r12.zzatk = r14
            r3 = r25
            r4 = r50
            goto L_0x0496
        L_0x0480:
            r30 = r1
            r41 = r2
            r46 = r4
            r45 = r5
            r28 = r6
            r29 = r7
            r31 = r10
            r32 = r11
            r26 = r12
            r27 = r13
            r40 = r14
        L_0x0496:
            int r2 = r41 + 1
            r12 = r26
            r13 = r27
            r6 = r28
            r7 = r29
            r1 = r30
            r10 = r31
            r11 = r32
            r14 = r40
            r5 = r45
            r0 = r54
            r8 = 12
            goto L_0x0316
        L_0x04b0:
            r30 = r1
            r45 = r5
            r28 = r6
            r29 = r7
            r31 = r10
            r32 = r11
            r40 = r14
            int r0 = com.google.android.gms.internal.ads.zziv.zzanc
            com.google.android.gms.internal.ads.zzix r0 = r11.zzai(r0)
            if (r0 == 0) goto L_0x0545
            r14 = r40
            com.google.android.gms.internal.ads.zzjs r1 = r14.zzaqu
            com.google.android.gms.internal.ads.zzjt[] r1 = r1.zzasn
            r2 = r29
            com.google.android.gms.internal.ads.zzjf r3 = r2.zzast
            int r3 = r3.zzapo
            r1 = r1[r3]
            com.google.android.gms.internal.ads.zzpx r0 = r0.zzaos
            int r1 = r1.zzasr
            r3 = 8
            r0.setPosition(r3)
            int r4 = r0.readInt()
            int r4 = com.google.android.gms.internal.ads.zziv.zzag(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04ec
            r0.zzbl(r3)
        L_0x04ec:
            int r3 = r0.readUnsignedByte()
            int r4 = r0.zzhg()
            int r5 = r2.zzapk
            if (r4 != r5) goto L_0x0522
            if (r3 != 0) goto L_0x050f
            boolean[] r3 = r2.zzatf
            r5 = 0
            r6 = 0
        L_0x04fe:
            if (r5 >= r4) goto L_0x051e
            int r7 = r0.readUnsignedByte()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0509
            r7 = 1
            goto L_0x050a
        L_0x0509:
            r7 = 0
        L_0x050a:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x04fe
        L_0x050f:
            if (r3 <= r1) goto L_0x0513
            r0 = 1
            goto L_0x0514
        L_0x0513:
            r0 = 0
        L_0x0514:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.zzatf
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x051e:
            r2.zzak(r6)
            goto L_0x0547
        L_0x0522:
            com.google.android.gms.internal.ads.zzfx r0 = new com.google.android.gms.internal.ads.zzfx
            int r1 = r2.zzapk
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0545:
            r2 = r29
        L_0x0547:
            int r0 = com.google.android.gms.internal.ads.zziv.zzand
            com.google.android.gms.internal.ads.zzix r0 = r11.zzai(r0)
            if (r0 == 0) goto L_0x059a
            com.google.android.gms.internal.ads.zzpx r0 = r0.zzaos
            r1 = 8
            r0.setPosition(r1)
            int r3 = r0.readInt()
            int r4 = com.google.android.gms.internal.ads.zziv.zzag(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0565
            r0.zzbl(r1)
        L_0x0565:
            int r1 = r0.zzhg()
            if (r1 != r5) goto L_0x0581
            int r1 = com.google.android.gms.internal.ads.zziv.zzaf(r3)
            long r3 = r2.zzasw
            if (r1 != 0) goto L_0x0578
            long r0 = r0.zzhd()
            goto L_0x057c
        L_0x0578:
            long r0 = r0.zzhh()
        L_0x057c:
            r5 = 0
            long r3 = r3 + r0
            r2.zzasw = r3
            goto L_0x059a
        L_0x0581:
            com.google.android.gms.internal.ads.zzfx r0 = new com.google.android.gms.internal.ads.zzfx
            r2 = 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected saio entry count: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x059a:
            int r0 = com.google.android.gms.internal.ads.zziv.zzanh
            com.google.android.gms.internal.ads.zzix r0 = r11.zzai(r0)
            if (r0 == 0) goto L_0x05a8
            com.google.android.gms.internal.ads.zzpx r0 = r0.zzaos
            r1 = 0
            zza(r0, r1, r2)
        L_0x05a8:
            int r0 = com.google.android.gms.internal.ads.zziv.zzane
            com.google.android.gms.internal.ads.zzix r0 = r11.zzai(r0)
            int r1 = com.google.android.gms.internal.ads.zziv.zzanf
            com.google.android.gms.internal.ads.zzix r1 = r11.zzai(r1)
            if (r0 == 0) goto L_0x064f
            if (r1 == 0) goto L_0x064f
            com.google.android.gms.internal.ads.zzpx r0 = r0.zzaos
            com.google.android.gms.internal.ads.zzpx r1 = r1.zzaos
            r3 = 8
            r0.setPosition(r3)
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            int r5 = zzaps
            if (r4 != r5) goto L_0x064f
            int r3 = com.google.android.gms.internal.ads.zziv.zzaf(r3)
            r4 = 1
            if (r3 != r4) goto L_0x05d8
            r3 = 4
            r0.zzbl(r3)
        L_0x05d8:
            int r0 = r0.readInt()
            if (r0 != r4) goto L_0x0647
            r0 = 8
            r1.setPosition(r0)
            int r0 = r1.readInt()
            int r3 = r1.readInt()
            int r5 = zzaps
            if (r3 != r5) goto L_0x0645
            int r0 = com.google.android.gms.internal.ads.zziv.zzaf(r0)
            if (r0 != r4) goto L_0x060a
            long r3 = r1.zzhd()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0602
            r0 = 4
            r3 = 2
            goto L_0x0613
        L_0x0602:
            com.google.android.gms.internal.ads.zzfx r0 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x060a:
            r3 = 2
            if (r0 < r3) goto L_0x0612
            r0 = 4
            r1.zzbl(r0)
            goto L_0x0613
        L_0x0612:
            r0 = 4
        L_0x0613:
            long r4 = r1.zzhd()
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x063d
            r1.zzbl(r3)
            int r3 = r1.readUnsignedByte()
            r4 = 1
            if (r3 != r4) goto L_0x0651
            int r3 = r1.readUnsignedByte()
            r5 = 16
            byte[] r6 = new byte[r5]
            r7 = 0
            r1.zze(r6, r7, r5)
            r2.zzate = r4
            com.google.android.gms.internal.ads.zzjt r1 = new com.google.android.gms.internal.ads.zzjt
            r1.<init>(r4, r3, r6)
            r2.zzatg = r1
            goto L_0x0651
        L_0x063d:
            com.google.android.gms.internal.ads.zzfx r0 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0645:
            r0 = 4
            goto L_0x0651
        L_0x0647:
            com.google.android.gms.internal.ads.zzfx r0 = new com.google.android.gms.internal.ads.zzfx
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x064f:
            r0 = 4
            r4 = 1
        L_0x0651:
            java.util.List<com.google.android.gms.internal.ads.zzix> r1 = r11.zzaoq
            int r1 = r1.size()
            r3 = 0
        L_0x0658:
            if (r3 >= r1) goto L_0x068f
            java.util.List<com.google.android.gms.internal.ads.zzix> r5 = r11.zzaoq
            java.lang.Object r5 = r5.get(r3)
            com.google.android.gms.internal.ads.zzix r5 = (com.google.android.gms.internal.ads.zzix) r5
            int r6 = r5.type
            int r7 = com.google.android.gms.internal.ads.zziv.zzang
            if (r6 != r7) goto L_0x0683
            com.google.android.gms.internal.ads.zzpx r5 = r5.zzaos
            r6 = 8
            r5.setPosition(r6)
            r7 = r28
            r8 = 0
            r9 = 16
            r5.zze(r7, r8, r9)
            byte[] r10 = zzapt
            boolean r10 = java.util.Arrays.equals(r7, r10)
            if (r10 == 0) goto L_0x068a
            zza(r5, r9, r2)
            goto L_0x068a
        L_0x0683:
            r7 = r28
            r6 = 8
            r8 = 0
            r9 = 16
        L_0x068a:
            int r3 = r3 + 1
            r28 = r7
            goto L_0x0658
        L_0x068f:
            r7 = r28
            goto L_0x06a7
        L_0x0692:
            r30 = r1
            r22 = r2
            r45 = r5
            r7 = r6
            goto L_0x06a3
        L_0x069a:
            r30 = r1
            r22 = r2
            r45 = r5
            r7 = r6
            r21 = r8
        L_0x06a3:
            r31 = r10
            r0 = 4
            r4 = 1
        L_0x06a7:
            r6 = 8
            r8 = 0
            int r10 = r31 + 1
            r6 = r7
            r8 = r21
            r2 = r22
            r1 = r30
            r5 = r45
            r0 = r54
            r7 = 0
            r9 = 8
            goto L_0x01de
        L_0x06bc:
            r8 = 0
            java.util.List<com.google.android.gms.internal.ads.zzix> r0 = r1.zzaoq
            com.google.android.gms.internal.ads.zzhp r0 = zzb(r0)
            if (r0 == 0) goto L_0x06e7
            r2 = r54
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r1 = r2.zzapv
            int r1 = r1.size()
        L_0x06cd:
            if (r8 >= r1) goto L_0x06fe
            android.util.SparseArray<com.google.android.gms.internal.ads.zzjl> r3 = r2.zzapv
            java.lang.Object r3 = r3.valueAt(r8)
            com.google.android.gms.internal.ads.zzjl r3 = (com.google.android.gms.internal.ads.zzjl) r3
            com.google.android.gms.internal.ads.zzii r4 = r3.zzakw
            com.google.android.gms.internal.ads.zzjs r3 = r3.zzaqu
            com.google.android.gms.internal.ads.zzfs r3 = r3.zzaad
            com.google.android.gms.internal.ads.zzfs r3 = r3.zza((com.google.android.gms.internal.ads.zzhp) r0)
            r4.zzf(r3)
            int r8 = r8 + 1
            goto L_0x06cd
        L_0x06e7:
            r2 = r54
            goto L_0x06fe
        L_0x06ea:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r0 = r2.zzaqc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06fe
            java.util.Stack<com.google.android.gms.internal.ads.zziw> r0 = r2.zzaqc
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zziw r0 = (com.google.android.gms.internal.ads.zziw) r0
            r0.zza((com.google.android.gms.internal.ads.zziw) r1)
        L_0x06fe:
            r0 = r2
            goto L_0x0002
        L_0x0701:
            r2 = r0
            r54.zzei()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzji.zzt(long):void");
    }

    private static void zza(zzpx zzpx, int i, zzju zzju) throws zzfx {
        zzpx.setPosition(i + 8);
        int zzag = zziv.zzag(zzpx.readInt());
        if ((zzag & 1) == 0) {
            boolean z = (zzag & 2) != 0;
            int zzhg = zzpx.zzhg();
            if (zzhg == zzju.zzapk) {
                Arrays.fill(zzju.zzatf, 0, zzhg, z);
                zzju.zzak(zzpx.zzhb());
                zzpx.zze(zzju.zzati.data, 0, zzju.zzath);
                zzju.zzati.setPosition(0);
                zzju.zzatj = false;
                return;
            }
            int i2 = zzju.zzapk;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(zzhg);
            sb.append(", ");
            sb.append(i2);
            throw new zzfx(sb.toString());
        }
        throw new zzfx("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static zzhp zzb(List<zzix> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzix zzix = list.get(i);
            if (zzix.type == zziv.zzamu) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzix.zzaos.data;
                UUID zze = zzjq.zze(bArr);
                if (zze == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzhp.zza(zze, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzhp((List<zzhp.zza>) arrayList);
    }
}
