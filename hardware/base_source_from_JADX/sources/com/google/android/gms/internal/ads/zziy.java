package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzki;
import java.util.ArrayList;
import java.util.List;

final class zziy {
    private static final int zzaob = zzqe.zzam("meta");
    private static final int zzaot = zzqe.zzam("vide");
    private static final int zzaou = zzqe.zzam("soun");
    private static final int zzaov = zzqe.zzam("text");
    private static final int zzaow = zzqe.zzam("sbtl");
    private static final int zzaox = zzqe.zzam("subt");
    private static final int zzaoy = zzqe.zzam("clcp");
    private static final int zzaoz = zzqe.zzam("cenc");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v21, resolved type: byte[]} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0541: MOVE  (r2v69 java.lang.String) = (r41v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x071e  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x07eb  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x07f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b6  */
    public static com.google.android.gms.internal.ads.zzjs zza(com.google.android.gms.internal.ads.zziw r49, com.google.android.gms.internal.ads.zzix r50, long r51, com.google.android.gms.internal.ads.zzhp r53, boolean r54) throws com.google.android.gms.internal.ads.zzfx {
        /*
            r0 = r49
            r15 = r53
            int r1 = com.google.android.gms.internal.ads.zziv.zzame
            com.google.android.gms.internal.ads.zziw r1 = r0.zzaj(r1)
            int r2 = com.google.android.gms.internal.ads.zziv.zzams
            com.google.android.gms.internal.ads.zzix r2 = r1.zzai(r2)
            com.google.android.gms.internal.ads.zzpx r2 = r2.zzaos
            r14 = 16
            r2.setPosition(r14)
            int r2 = r2.readInt()
            int r3 = zzaou
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = zzaot
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = zzaov
            if (r2 == r3) goto L_0x0042
            int r3 = zzaow
            if (r2 == r3) goto L_0x0042
            int r3 = zzaox
            if (r2 == r3) goto L_0x0042
            int r3 = zzaoy
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = zzaob
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.zziv.zzamo
            com.google.android.gms.internal.ads.zzix r2 = r0.zzai(r2)
            com.google.android.gms.internal.ads.zzpx r2 = r2.zzaos
            r7 = 8
            r2.setPosition(r7)
            int r3 = r2.readInt()
            int r3 = com.google.android.gms.internal.ads.zziv.zzaf(r3)
            if (r3 != 0) goto L_0x0061
            r5 = 8
            goto L_0x0063
        L_0x0061:
            r5 = 16
        L_0x0063:
            r2.zzbl(r5)
            int r5 = r2.readInt()
            r2.zzbl(r4)
            int r6 = r2.getPosition()
            if (r3 != 0) goto L_0x0075
            r12 = 4
            goto L_0x0077
        L_0x0075:
            r12 = 8
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 >= r12) goto L_0x0088
            byte[] r8 = r2.data
            int r17 = r6 + r9
            byte r8 = r8[r17]
            if (r8 == r11) goto L_0x0084
            r6 = 0
            goto L_0x0089
        L_0x0084:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x0078
        L_0x0088:
            r6 = 1
        L_0x0089:
            r17 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == 0) goto L_0x0097
            r2.zzbl(r12)
        L_0x0095:
            r11 = r8
            goto L_0x00a9
        L_0x0097:
            if (r3 != 0) goto L_0x009e
            long r19 = r2.zzhd()
            goto L_0x00a2
        L_0x009e:
            long r19 = r2.zzhh()
        L_0x00a2:
            int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r3 != 0) goto L_0x00a7
            goto L_0x0095
        L_0x00a7:
            r11 = r19
        L_0x00a9:
            r2.zzbl(r14)
            int r3 = r2.readInt()
            int r6 = r2.readInt()
            r2.zzbl(r4)
            int r4 = r2.readInt()
            int r2 = r2.readInt()
            r14 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00ce
            if (r6 != r14) goto L_0x00ce
            if (r4 != r13) goto L_0x00ce
            if (r2 != 0) goto L_0x00ce
            r2 = 90
            goto L_0x00e5
        L_0x00ce:
            if (r3 != 0) goto L_0x00d9
            if (r6 != r13) goto L_0x00d9
            if (r4 != r14) goto L_0x00d9
            if (r2 != 0) goto L_0x00d9
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00e5
        L_0x00d9:
            if (r3 != r13) goto L_0x00e4
            if (r6 != 0) goto L_0x00e4
            if (r4 != 0) goto L_0x00e4
            if (r2 != r13) goto L_0x00e4
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            com.google.android.gms.internal.ads.zzje r14 = new com.google.android.gms.internal.ads.zzje
            r14.<init>(r5, r11, r2)
            int r4 = (r51 > r8 ? 1 : (r51 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00f7
            long r2 = r14.zzcs
            r19 = r2
            r2 = r50
            goto L_0x00fb
        L_0x00f7:
            r2 = r50
            r19 = r51
        L_0x00fb:
            com.google.android.gms.internal.ads.zzpx r2 = r2.zzaos
            r2.setPosition(r7)
            int r3 = r2.readInt()
            int r3 = com.google.android.gms.internal.ads.zziv.zzaf(r3)
            if (r3 != 0) goto L_0x010d
            r3 = 8
            goto L_0x010f
        L_0x010d:
            r3 = 16
        L_0x010f:
            r2.zzbl(r3)
            long r25 = r2.zzhd()
            int r2 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x011d
            r22 = r8
            goto L_0x0128
        L_0x011d:
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r25
            long r2 = com.google.android.gms.internal.ads.zzqe.zza((long) r19, (long) r21, (long) r23)
            r22 = r2
        L_0x0128:
            int r2 = com.google.android.gms.internal.ads.zziv.zzamf
            com.google.android.gms.internal.ads.zziw r2 = r1.zzaj(r2)
            int r3 = com.google.android.gms.internal.ads.zziv.zzamg
            com.google.android.gms.internal.ads.zziw r2 = r2.zzaj(r3)
            int r3 = com.google.android.gms.internal.ads.zziv.zzamr
            com.google.android.gms.internal.ads.zzix r1 = r1.zzai(r3)
            com.google.android.gms.internal.ads.zzpx r1 = r1.zzaos
            r1.setPosition(r7)
            int r3 = r1.readInt()
            int r3 = com.google.android.gms.internal.ads.zziv.zzaf(r3)
            if (r3 != 0) goto L_0x014c
            r4 = 8
            goto L_0x014e
        L_0x014c:
            r4 = 16
        L_0x014e:
            r1.zzbl(r4)
            long r4 = r1.zzhd()
            if (r3 != 0) goto L_0x0159
            r3 = 4
            goto L_0x015b
        L_0x0159:
            r3 = 8
        L_0x015b:
            r1.zzbl(r3)
            int r1 = r1.readUnsignedShort()
            int r3 = r1 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 3
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            android.util.Pair r13 = android.util.Pair.create(r3, r1)
            int r1 = com.google.android.gms.internal.ads.zziv.zzamt
            com.google.android.gms.internal.ads.zzix r1 = r2.zzai(r1)
            com.google.android.gms.internal.ads.zzpx r12 = r1.zzaos
            int r19 = r14.f47id
            int r20 = r14.zzzo
            java.lang.Object r1 = r13.second
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 12
            r12.setPosition(r1)
            int r9 = r12.readInt()
            com.google.android.gms.internal.ads.zzjb r8 = new com.google.android.gms.internal.ads.zzjb
            r8.<init>(r9)
            r6 = 0
        L_0x01b4:
            if (r6 >= r9) goto L_0x077d
            int r5 = r12.getPosition()
            int r4 = r12.readInt()
            if (r4 <= 0) goto L_0x01c2
            r1 = 1
            goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzpo.checkArgument(r1, r2)
            int r1 = r12.readInt()
            int r2 = com.google.android.gms.internal.ads.zziv.zzalb
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzalc
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzamz
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzanl
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzald
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzale
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzalf
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzaok
            if (r1 == r2) goto L_0x058b
            int r2 = com.google.android.gms.internal.ads.zziv.zzaol
            if (r1 != r2) goto L_0x01f2
            goto L_0x058b
        L_0x01f2:
            int r2 = com.google.android.gms.internal.ads.zziv.zzali
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzana
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzaln
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalp
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalr
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalu
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzals
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalt
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzany
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzanz
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzall
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalm
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzalj
            if (r1 == r2) goto L_0x0313
            int r2 = com.google.android.gms.internal.ads.zziv.zzaoo
            if (r1 != r2) goto L_0x022c
            goto L_0x0313
        L_0x022c:
            int r2 = com.google.android.gms.internal.ads.zziv.zzanj
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.zziv.zzanu
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.zziv.zzanv
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.zziv.zzanw
            if (r1 == r2) goto L_0x0268
            int r2 = com.google.android.gms.internal.ads.zziv.zzanx
            if (r1 != r2) goto L_0x0241
            goto L_0x0268
        L_0x0241:
            int r2 = com.google.android.gms.internal.ads.zziv.zzaon
            if (r1 != r2) goto L_0x0253
            java.lang.String r1 = java.lang.Integer.toString(r19)
            java.lang.String r2 = "application/x-camera-motion"
            r3 = 0
            r7 = -1
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza(r1, r2, r3, r7, r15)
            r8.zzaad = r1
        L_0x0253:
            r32 = r4
            r29 = r5
            r33 = r6
            r0 = r8
            r31 = r9
            r21 = r10
            r45 = r11
            r48 = r12
            r47 = r13
            r28 = r14
            goto L_0x0371
        L_0x0268:
            r3 = 0
            r7 = -1
            int r2 = r5 + 8
            r21 = 8
            int r2 = r2 + 8
            r12.setPosition(r2)
            r27 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = com.google.android.gms.internal.ads.zziv.zzanj
            if (r1 != r2) goto L_0x0286
            java.lang.String r1 = "application/ttml+xml"
            r2 = r1
            r24 = r3
            r3 = 1
            r7 = 0
            r21 = 8
            goto L_0x02c4
        L_0x0286:
            int r2 = com.google.android.gms.internal.ads.zziv.zzanu
            if (r1 != r2) goto L_0x02a1
            java.lang.String r1 = "application/x-quicktime-tx3g"
            int r2 = r4 + -8
            r21 = 8
            int r2 = r2 + -8
            byte[] r3 = new byte[r2]
            r7 = 0
            r12.zze(r3, r7, r2)
            java.util.List r2 = java.util.Collections.singletonList(r3)
            r24 = r2
            r3 = 1
            r2 = r1
            goto L_0x02c4
        L_0x02a1:
            r7 = 0
            r21 = 8
            int r2 = com.google.android.gms.internal.ads.zziv.zzanv
            if (r1 != r2) goto L_0x02af
            java.lang.String r1 = "application/x-mp4-vtt"
            r2 = r1
        L_0x02ab:
            r3 = 1
        L_0x02ac:
            r24 = 0
            goto L_0x02c4
        L_0x02af:
            int r2 = com.google.android.gms.internal.ads.zziv.zzanw
            if (r1 != r2) goto L_0x02b9
            java.lang.String r1 = "application/ttml+xml"
            r2 = r1
            r27 = r17
            goto L_0x02ab
        L_0x02b9:
            int r2 = com.google.android.gms.internal.ads.zziv.zzanx
            if (r1 != r2) goto L_0x030d
            java.lang.String r1 = "application/x-mp4-cea-608"
            r3 = 1
            r8.zzapi = r3
            r2 = r1
            goto L_0x02ac
        L_0x02c4:
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r29 = 0
            r31 = -1
            r32 = 0
            r33 = -1
            r34 = 1
            r35 = 0
            r3 = r29
            r36 = r14
            r14 = r4
            r4 = r31
            r37 = r5
            r5 = r32
            r38 = r6
            r6 = r11
            r21 = 0
            r29 = -1
            r7 = r33
            r39 = r8
            r8 = r53
            r31 = r9
            r21 = r10
            r9 = r27
            r0 = r11
            r40 = r13
            r13 = -1
            r11 = r24
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (int) r4, (int) r5, (java.lang.String) r6, (int) r7, (com.google.android.gms.internal.ads.zzhp) r8, (long) r9, (java.util.List<byte[]>) r11)
            r11 = r39
            r11.zzaad = r1
            r45 = r0
            r0 = r11
            r48 = r12
            r32 = r14
            r28 = r36
            r29 = r37
            goto L_0x036d
        L_0x030d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0313:
            r37 = r5
            r38 = r6
            r31 = r9
            r21 = r10
            r0 = r11
            r40 = r13
            r36 = r14
            r13 = -1
            r14 = r4
            r11 = r8
            r10 = r37
            int r5 = r10 + 8
            r9 = 8
            int r5 = r5 + r9
            r12.setPosition(r5)
            if (r54 == 0) goto L_0x0338
            int r2 = r12.readUnsignedShort()
            r3 = 6
            r12.zzbl(r3)
            goto L_0x033c
        L_0x0338:
            r12.zzbl(r9)
            r2 = 0
        L_0x033c:
            if (r2 == 0) goto L_0x037b
            r8 = 1
            if (r2 != r8) goto L_0x0343
            r7 = 2
            goto L_0x037d
        L_0x0343:
            r7 = 2
            if (r2 != r7) goto L_0x0362
            r2 = 16
            r12.zzbl(r2)
            long r2 = r12.readLong()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            int r3 = r12.zzhg()
            r4 = 20
            r12.zzbl(r4)
            goto L_0x0391
        L_0x0362:
            r45 = r0
            r29 = r10
            r0 = r11
            r48 = r12
            r32 = r14
            r28 = r36
        L_0x036d:
            r33 = r38
            r47 = r40
        L_0x0371:
            r24 = -1
            r27 = 0
        L_0x0375:
            r30 = 3
            r34 = 16
            goto L_0x0760
        L_0x037b:
            r7 = 2
            r8 = 1
        L_0x037d:
            int r3 = r12.readUnsignedShort()
            r4 = 6
            r12.zzbl(r4)
            int r4 = r12.zzhf()
            if (r2 != r8) goto L_0x0390
            r2 = 16
            r12.zzbl(r2)
        L_0x0390:
            r2 = r4
        L_0x0391:
            int r4 = r12.getPosition()
            int r5 = com.google.android.gms.internal.ads.zziv.zzana
            if (r1 != r5) goto L_0x03a3
            r6 = r38
            int r1 = zza((com.google.android.gms.internal.ads.zzpx) r12, (int) r10, (int) r14, (com.google.android.gms.internal.ads.zzjb) r11, (int) r6)
            r12.setPosition(r4)
            goto L_0x03a5
        L_0x03a3:
            r6 = r38
        L_0x03a5:
            int r5 = com.google.android.gms.internal.ads.zziv.zzaln
            if (r1 != r5) goto L_0x03ac
            java.lang.String r1 = "audio/ac3"
            goto L_0x03f6
        L_0x03ac:
            int r5 = com.google.android.gms.internal.ads.zziv.zzalp
            if (r1 != r5) goto L_0x03b3
            java.lang.String r1 = "audio/eac3"
            goto L_0x03f6
        L_0x03b3:
            int r5 = com.google.android.gms.internal.ads.zziv.zzalr
            if (r1 != r5) goto L_0x03ba
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03f6
        L_0x03ba:
            int r5 = com.google.android.gms.internal.ads.zziv.zzals
            if (r1 == r5) goto L_0x03f4
            int r5 = com.google.android.gms.internal.ads.zziv.zzalt
            if (r1 != r5) goto L_0x03c3
            goto L_0x03f4
        L_0x03c3:
            int r5 = com.google.android.gms.internal.ads.zziv.zzalu
            if (r1 != r5) goto L_0x03ca
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03f6
        L_0x03ca:
            int r5 = com.google.android.gms.internal.ads.zziv.zzany
            if (r1 != r5) goto L_0x03d1
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03f6
        L_0x03d1:
            int r5 = com.google.android.gms.internal.ads.zziv.zzanz
            if (r1 != r5) goto L_0x03d8
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03f6
        L_0x03d8:
            int r5 = com.google.android.gms.internal.ads.zziv.zzall
            if (r1 == r5) goto L_0x03f1
            int r5 = com.google.android.gms.internal.ads.zziv.zzalm
            if (r1 != r5) goto L_0x03e1
            goto L_0x03f1
        L_0x03e1:
            int r5 = com.google.android.gms.internal.ads.zziv.zzalj
            if (r1 != r5) goto L_0x03e8
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03f6
        L_0x03e8:
            int r5 = com.google.android.gms.internal.ads.zziv.zzaoo
            if (r1 != r5) goto L_0x03ef
            java.lang.String r1 = "audio/alac"
            goto L_0x03f6
        L_0x03ef:
            r1 = 0
            goto L_0x03f6
        L_0x03f1:
            java.lang.String r1 = "audio/raw"
            goto L_0x03f6
        L_0x03f4:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03f6:
            r27 = r2
            r24 = r3
            r5 = r4
            r28 = 0
            r4 = r1
        L_0x03fe:
            int r1 = r5 - r10
            if (r1 >= r14) goto L_0x0532
            r12.setPosition(r5)
            int r3 = r12.readInt()
            if (r3 <= 0) goto L_0x040d
            r1 = 1
            goto L_0x040e
        L_0x040d:
            r1 = 0
        L_0x040e:
            java.lang.String r2 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzpo.checkArgument(r1, r2)
            int r1 = r12.readInt()
            int r2 = com.google.android.gms.internal.ads.zziv.zzamj
            if (r1 == r2) goto L_0x04b2
            if (r54 == 0) goto L_0x0423
            int r2 = com.google.android.gms.internal.ads.zziv.zzalk
            if (r1 != r2) goto L_0x0423
            goto L_0x04b2
        L_0x0423:
            int r2 = com.google.android.gms.internal.ads.zziv.zzalo
            if (r1 != r2) goto L_0x0444
            int r1 = r5 + 8
            r12.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r19)
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzgg.zza(r12, r1, r0, r15)
            r11.zzaad = r1
        L_0x0436:
            r13 = r3
            r41 = r4
            r4 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r11 = 0
            r29 = 2
            goto L_0x04af
        L_0x0444:
            int r2 = com.google.android.gms.internal.ads.zziv.zzalq
            if (r1 != r2) goto L_0x0458
            int r1 = r5 + 8
            r12.setPosition(r1)
            java.lang.String r1 = java.lang.Integer.toString(r19)
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzgg.zzb(r12, r1, r0, r15)
            r11.zzaad = r1
            goto L_0x0436
        L_0x0458:
            int r2 = com.google.android.gms.internal.ads.zziv.zzalv
            if (r1 != r2) goto L_0x0492
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r29 = 0
            r30 = -1
            r32 = -1
            r33 = 0
            r34 = 0
            r2 = r4
            r13 = r3
            r3 = r29
            r41 = r4
            r4 = r30
            r42 = r5
            r5 = r32
            r43 = r6
            r6 = r24
            r29 = 2
            r7 = r27
            r8 = r33
            r9 = r53
            r44 = r10
            r10 = r34
            r15 = r11
            r11 = r0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.zzaad = r1
        L_0x048e:
            r4 = r42
            r11 = 0
            goto L_0x04af
        L_0x0492:
            r13 = r3
            r41 = r4
            r42 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r29 = 2
            int r2 = com.google.android.gms.internal.ads.zziv.zzaoo
            if (r1 != r2) goto L_0x048e
            byte[] r1 = new byte[r13]
            r4 = r42
            r12.setPosition(r4)
            r11 = 0
            r12.zze(r1, r11, r13)
            r28 = r1
        L_0x04af:
            r10 = -1
            goto L_0x0520
        L_0x04b2:
            r13 = r3
            r41 = r4
            r4 = r5
            r43 = r6
            r44 = r10
            r15 = r11
            r11 = 0
            r29 = 2
            int r2 = com.google.android.gms.internal.ads.zziv.zzamj
            if (r1 != r2) goto L_0x04c5
            r1 = r4
        L_0x04c3:
            r10 = -1
            goto L_0x04eb
        L_0x04c5:
            int r1 = r12.getPosition()
        L_0x04c9:
            int r2 = r1 - r4
            if (r2 >= r13) goto L_0x04e9
            r12.setPosition(r1)
            int r2 = r12.readInt()
            if (r2 <= 0) goto L_0x04d8
            r3 = 1
            goto L_0x04d9
        L_0x04d8:
            r3 = 0
        L_0x04d9:
            java.lang.String r5 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzpo.checkArgument(r3, r5)
            int r3 = r12.readInt()
            int r5 = com.google.android.gms.internal.ads.zziv.zzamj
            if (r3 != r5) goto L_0x04e7
            goto L_0x04c3
        L_0x04e7:
            int r1 = r1 + r2
            goto L_0x04c9
        L_0x04e9:
            r1 = -1
            goto L_0x04c3
        L_0x04eb:
            if (r1 == r10) goto L_0x051c
            android.util.Pair r1 = zzb(r12, r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r28 = r1
            byte[] r28 = (byte[]) r28
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x051e
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzpp.zzf(r28)
            java.lang.Object r3 = r1.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r24 = r1
            r27 = r3
            goto L_0x051e
        L_0x051c:
            r2 = r41
        L_0x051e:
            r41 = r2
        L_0x0520:
            int r5 = r4 + r13
            r11 = r15
            r4 = r41
            r6 = r43
            r10 = r44
            r7 = 2
            r8 = 1
            r9 = 8
            r13 = -1
            r15 = r53
            goto L_0x03fe
        L_0x0532:
            r41 = r4
            r43 = r6
            r44 = r10
            r15 = r11
            r10 = -1
            r11 = 0
            r29 = 2
            com.google.android.gms.internal.ads.zzfs r1 = r15.zzaad
            if (r1 != 0) goto L_0x0575
            r2 = r41
            if (r2 == 0) goto L_0x0575
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x054f
            r8 = 2
            goto L_0x0550
        L_0x054f:
            r8 = -1
        L_0x0550:
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r3 = 0
            r4 = -1
            r5 = -1
            if (r28 != 0) goto L_0x055b
            r9 = 0
            goto L_0x0560
        L_0x055b:
            java.util.List r6 = java.util.Collections.singletonList(r28)
            r9 = r6
        L_0x0560:
            r13 = 0
            r6 = r24
            r7 = r27
            r24 = -1
            r10 = r53
            r27 = 0
            r11 = r13
            r13 = r12
            r12 = r0
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r15.zzaad = r1
            goto L_0x057a
        L_0x0575:
            r13 = r12
            r24 = -1
            r27 = 0
        L_0x057a:
            r45 = r0
            r48 = r13
            r32 = r14
            r0 = r15
            r28 = r36
            r47 = r40
            r33 = r43
            r29 = r44
            goto L_0x0375
        L_0x058b:
            r44 = r5
            r43 = r6
            r15 = r8
            r31 = r9
            r21 = r10
            r0 = r11
            r40 = r13
            r36 = r14
            r24 = -1
            r27 = 0
            r14 = r4
            r13 = r12
            r12 = r44
            int r5 = r12 + 8
            r11 = 8
            int r5 = r5 + r11
            r13.setPosition(r5)
            r10 = 16
            r13.zzbl(r10)
            int r6 = r13.readUnsignedShort()
            int r7 = r13.readUnsignedShort()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r13.zzbl(r3)
            int r3 = r13.getPosition()
            int r4 = com.google.android.gms.internal.ads.zziv.zzamz
            if (r1 != r4) goto L_0x05cf
            r9 = r43
            int r1 = zza((com.google.android.gms.internal.ads.zzpx) r13, (int) r12, (int) r14, (com.google.android.gms.internal.ads.zzjb) r15, (int) r9)
            r13.setPosition(r3)
            goto L_0x05d1
        L_0x05cf:
            r9 = r43
        L_0x05d1:
            r2 = 0
            r4 = 0
            r28 = 0
            r29 = 1065353216(0x3f800000, float:1.0)
            r30 = 0
            r32 = -1
        L_0x05db:
            int r5 = r3 - r12
            if (r5 >= r14) goto L_0x0719
            r13.setPosition(r3)
            int r5 = r13.getPosition()
            int r8 = r13.readInt()
            if (r8 != 0) goto L_0x05f4
            int r33 = r13.getPosition()
            int r10 = r33 - r12
            if (r10 == r14) goto L_0x0719
        L_0x05f4:
            if (r8 <= 0) goto L_0x05f8
            r10 = 1
            goto L_0x05f9
        L_0x05f8:
            r10 = 0
        L_0x05f9:
            java.lang.String r11 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzpo.checkArgument(r10, r11)
            int r10 = r13.readInt()
            int r11 = com.google.android.gms.internal.ads.zziv.zzamh
            if (r10 != r11) goto L_0x062e
            if (r2 != 0) goto L_0x060a
            r2 = 1
            goto L_0x060b
        L_0x060a:
            r2 = 0
        L_0x060b:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            java.lang.String r2 = "video/avc"
            int r5 = r5 + 8
            r13.setPosition(r5)
            com.google.android.gms.internal.ads.zzqh r5 = com.google.android.gms.internal.ads.zzqh.zzg(r13)
            java.util.List<byte[]> r10 = r5.zzzl
            int r11 = r5.zzakx
            r15.zzakx = r11
            if (r4 != 0) goto L_0x0625
            float r5 = r5.zzbhq
            r29 = r5
        L_0x0625:
            r45 = r0
            r46 = r1
            r28 = r10
        L_0x062b:
            r11 = 3
            goto L_0x070e
        L_0x062e:
            int r11 = com.google.android.gms.internal.ads.zziv.zzami
            if (r10 != r11) goto L_0x064c
            if (r2 != 0) goto L_0x0636
            r2 = 1
            goto L_0x0637
        L_0x0636:
            r2 = 0
        L_0x0637:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            java.lang.String r2 = "video/hevc"
            int r5 = r5 + 8
            r13.setPosition(r5)
            com.google.android.gms.internal.ads.zzqn r5 = com.google.android.gms.internal.ads.zzqn.zzi(r13)
            java.util.List<byte[]> r10 = r5.zzzl
            int r5 = r5.zzakx
            r15.zzakx = r5
            goto L_0x0625
        L_0x064c:
            int r11 = com.google.android.gms.internal.ads.zziv.zzaom
            if (r10 != r11) goto L_0x0662
            if (r2 != 0) goto L_0x0654
            r2 = 1
            goto L_0x0655
        L_0x0654:
            r2 = 0
        L_0x0655:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            int r2 = com.google.android.gms.internal.ads.zziv.zzaok
            if (r1 != r2) goto L_0x065f
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            goto L_0x0670
        L_0x065f:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            goto L_0x0670
        L_0x0662:
            int r11 = com.google.android.gms.internal.ads.zziv.zzalg
            if (r10 != r11) goto L_0x0675
            if (r2 != 0) goto L_0x066a
            r2 = 1
            goto L_0x066b
        L_0x066a:
            r2 = 0
        L_0x066b:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            java.lang.String r2 = "video/3gpp"
        L_0x0670:
            r45 = r0
            r46 = r1
            goto L_0x062b
        L_0x0675:
            int r11 = com.google.android.gms.internal.ads.zziv.zzamj
            if (r10 != r11) goto L_0x0697
            if (r2 != 0) goto L_0x067d
            r2 = 1
            goto L_0x067e
        L_0x067d:
            r2 = 0
        L_0x067e:
            com.google.android.gms.internal.ads.zzpo.checkState(r2)
            android.util.Pair r2 = zzb(r13, r5)
            java.lang.Object r5 = r2.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            java.util.List r28 = java.util.Collections.singletonList(r2)
            r45 = r0
            r46 = r1
            r2 = r5
            goto L_0x062b
        L_0x0697:
            int r11 = com.google.android.gms.internal.ads.zziv.zzani
            if (r10 != r11) goto L_0x06b3
            int r5 = r5 + 8
            r13.setPosition(r5)
            int r4 = r13.zzhg()
            int r5 = r13.zzhg()
            float r4 = (float) r4
            float r5 = (float) r5
            float r29 = r4 / r5
            r45 = r0
            r46 = r1
            r4 = 1
            goto L_0x062b
        L_0x06b3:
            int r11 = com.google.android.gms.internal.ads.zziv.zzaoi
            if (r10 != r11) goto L_0x06e9
            int r10 = r5 + 8
        L_0x06b9:
            int r11 = r10 - r5
            if (r11 >= r8) goto L_0x06e1
            r13.setPosition(r10)
            int r11 = r13.readInt()
            r45 = r0
            int r0 = r13.readInt()
            r46 = r1
            int r1 = com.google.android.gms.internal.ads.zziv.zzaoj
            if (r0 != r1) goto L_0x06db
            byte[] r0 = r13.data
            int r11 = r11 + r10
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r10, r11)
            r30 = r0
            goto L_0x062b
        L_0x06db:
            int r10 = r10 + r11
            r0 = r45
            r1 = r46
            goto L_0x06b9
        L_0x06e1:
            r45 = r0
            r46 = r1
            r30 = 0
            goto L_0x062b
        L_0x06e9:
            r45 = r0
            r46 = r1
            int r0 = com.google.android.gms.internal.ads.zziv.zzaoh
            if (r10 != r0) goto L_0x062b
            int r0 = r13.readUnsignedByte()
            r11 = 3
            r13.zzbl(r11)
            if (r0 != 0) goto L_0x070e
            int r0 = r13.readUnsignedByte()
            switch(r0) {
                case 0: goto L_0x070c;
                case 1: goto L_0x0709;
                case 2: goto L_0x0706;
                case 3: goto L_0x0703;
                default: goto L_0x0702;
            }
        L_0x0702:
            goto L_0x070e
        L_0x0703:
            r32 = 3
            goto L_0x070e
        L_0x0706:
            r32 = 2
            goto L_0x070e
        L_0x0709:
            r32 = 1
            goto L_0x070e
        L_0x070c:
            r32 = 0
        L_0x070e:
            int r3 = r3 + r8
            r0 = r45
            r1 = r46
            r10 = 16
            r11 = 8
            goto L_0x05db
        L_0x0719:
            r45 = r0
            r11 = 3
            if (r2 == 0) goto L_0x0751
            java.lang.String r1 = java.lang.Integer.toString(r19)
            r3 = 0
            r4 = -1
            r5 = -1
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 0
            r33 = r9
            r9 = r28
            r28 = 16
            r10 = r20
            r34 = 3
            r11 = r29
            r29 = r12
            r12 = r30
            r48 = r13
            r47 = r40
            r30 = 3
            r13 = r32
            r32 = r14
            r28 = r36
            r34 = 16
            r14 = r0
            r0 = r15
            r15 = r53
            com.google.android.gms.internal.ads.zzfs r1 = com.google.android.gms.internal.ads.zzfs.zza(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.zzaad = r1
            goto L_0x0760
        L_0x0751:
            r33 = r9
            r29 = r12
            r48 = r13
            r32 = r14
            r0 = r15
            r28 = r36
            r47 = r40
            goto L_0x0375
        L_0x0760:
            int r5 = r29 + r32
            r1 = r48
            r1.setPosition(r5)
            int r6 = r33 + 1
            r15 = r53
            r8 = r0
            r12 = r1
            r10 = r21
            r14 = r28
            r9 = r31
            r11 = r45
            r13 = r47
            r0 = r49
            r7 = 8
            goto L_0x01b4
        L_0x077d:
            r0 = r8
            r21 = r10
            r47 = r13
            r28 = r14
            r27 = 0
            int r1 = com.google.android.gms.internal.ads.zziv.zzamp
            r2 = r49
            com.google.android.gms.internal.ads.zziw r1 = r2.zzaj(r1)
            if (r1 == 0) goto L_0x07eb
            int r2 = com.google.android.gms.internal.ads.zziv.zzamq
            com.google.android.gms.internal.ads.zzix r1 = r1.zzai(r2)
            if (r1 != 0) goto L_0x0799
            goto L_0x07eb
        L_0x0799:
            com.google.android.gms.internal.ads.zzpx r1 = r1.zzaos
            r2 = 8
            r1.setPosition(r2)
            int r2 = r1.readInt()
            int r2 = com.google.android.gms.internal.ads.zziv.zzaf(r2)
            int r3 = r1.zzhg()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r6 = 0
        L_0x07b1:
            if (r6 >= r3) goto L_0x07e4
            r7 = 1
            if (r2 != r7) goto L_0x07bb
            long r8 = r1.zzhh()
            goto L_0x07bf
        L_0x07bb:
            long r8 = r1.zzhd()
        L_0x07bf:
            r4[r6] = r8
            if (r2 != r7) goto L_0x07c8
            long r8 = r1.readLong()
            goto L_0x07cd
        L_0x07c8:
            int r8 = r1.readInt()
            long r8 = (long) r8
        L_0x07cd:
            r5[r6] = r8
            short r8 = r1.readShort()
            if (r8 != r7) goto L_0x07dc
            r8 = 2
            r1.zzbl(r8)
            int r6 = r6 + 1
            goto L_0x07b1
        L_0x07dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x07e4:
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            r2 = r1
            r1 = 0
            goto L_0x07f0
        L_0x07eb:
            r1 = 0
            android.util.Pair r2 = android.util.Pair.create(r1, r1)
        L_0x07f0:
            com.google.android.gms.internal.ads.zzfs r3 = r0.zzaad
            if (r3 != 0) goto L_0x07f5
            return r1
        L_0x07f5:
            com.google.android.gms.internal.ads.zzjs r1 = new com.google.android.gms.internal.ads.zzjs
            int r16 = r28.f47id
            r3 = r47
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r18 = r3.longValue()
            com.google.android.gms.internal.ads.zzfs r3 = r0.zzaad
            int r4 = r0.zzapi
            com.google.android.gms.internal.ads.zzjt[] r5 = r0.zzaph
            int r0 = r0.zzakx
            java.lang.Object r6 = r2.first
            r28 = r6
            long[] r28 = (long[]) r28
            java.lang.Object r2 = r2.second
            r29 = r2
            long[] r29 = (long[]) r29
            r15 = r1
            r17 = r21
            r20 = r25
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziy.zza(com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzix, long, com.google.android.gms.internal.ads.zzhp, boolean):com.google.android.gms.internal.ads.zzjs");
    }

    public static zzjv zza(zzjs zzjs, zziw zziw, zzid zzid) throws zzfx {
        zzja zzja;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        int[] iArr3;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        int i5;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i6;
        zzja zzja2;
        zzjs zzjs2 = zzjs;
        zziw zziw2 = zziw;
        zzid zzid2 = zzid;
        zzix zzai = zziw2.zzai(zziv.zzanq);
        if (zzai != null) {
            zzja = new zzjc(zzai);
        } else {
            zzix zzai2 = zziw2.zzai(zziv.zzanr);
            if (zzai2 != null) {
                zzja = new zzjd(zzai2);
            } else {
                throw new zzfx("Track has no sample table size information");
            }
        }
        int zzef = zzja.zzef();
        if (zzef == 0) {
            return new zzjv(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzix zzai3 = zziw2.zzai(zziv.zzans);
        if (zzai3 == null) {
            zzai3 = zziw2.zzai(zziv.zzant);
            z = true;
        } else {
            z = false;
        }
        zzpx zzpx = zzai3.zzaos;
        zzpx zzpx2 = zziw2.zzai(zziv.zzanp).zzaos;
        zzpx zzpx3 = zziw2.zzai(zziv.zzanm).zzaos;
        zzix zzai4 = zziw2.zzai(zziv.zzann);
        zzpx zzpx4 = zzai4 != null ? zzai4.zzaos : null;
        zzix zzai5 = zziw2.zzai(zziv.zzano);
        zzpx zzpx5 = zzai5 != null ? zzai5.zzaos : null;
        zziz zziz = new zziz(zzpx2, zzpx, z);
        zzpx3.setPosition(12);
        int zzhg = zzpx3.zzhg() - 1;
        int zzhg2 = zzpx3.zzhg();
        int zzhg3 = zzpx3.zzhg();
        if (zzpx5 != null) {
            zzpx5.setPosition(12);
            i = zzpx5.zzhg();
        } else {
            i = 0;
        }
        int i7 = -1;
        if (zzpx4 != null) {
            zzpx4.setPosition(12);
            i2 = zzpx4.zzhg();
            if (i2 > 0) {
                i7 = zzpx4.zzhg() - 1;
            } else {
                zzpx4 = null;
            }
        } else {
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzja.zzeh() && "audio/raw".equals(zzjs2.zzaad.zzzj) && zzhg == 0 && i == 0 && i2 == 0)) {
            jArr2 = new long[zzef];
            iArr = new int[zzef];
            jArr = new long[zzef];
            int i8 = i2;
            iArr2 = new int[zzef];
            zzpx zzpx6 = zzpx3;
            int i9 = i;
            int i10 = i7;
            long j3 = 0;
            int i11 = i8;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = zzhg;
            long j4 = 0;
            int i17 = 0;
            int i18 = zzhg3;
            int i19 = zzhg2;
            int i20 = i18;
            while (i17 < zzef) {
                while (i14 == 0) {
                    zzpo.checkState(zziz.zzee());
                    long j5 = zziz.zzapb;
                    i14 = zziz.zzapa;
                    i20 = i20;
                    i16 = i16;
                    j4 = j5;
                }
                int i21 = i20;
                int i22 = i16;
                if (zzpx5 != null) {
                    while (i15 == 0 && i9 > 0) {
                        i15 = zzpx5.zzhg();
                        i13 = zzpx5.readInt();
                        i9--;
                    }
                    i15--;
                }
                int i23 = i13;
                jArr2[i17] = j4;
                iArr[i17] = zzja.zzeg();
                if (iArr[i17] > i12) {
                    i6 = zzef;
                    zzja2 = zzja;
                    i12 = iArr[i17];
                } else {
                    i6 = zzef;
                    zzja2 = zzja;
                }
                jArr[i17] = j3 + ((long) i23);
                iArr2[i17] = zzpx4 == null ? 1 : 0;
                if (i17 == i10) {
                    iArr2[i17] = 1;
                    i11--;
                    if (i11 > 0) {
                        i10 = zzpx4.zzhg() - 1;
                    }
                }
                int i24 = i11;
                int i25 = i10;
                int i26 = i21;
                j3 += (long) i26;
                i19--;
                if (i19 != 0 || i22 <= 0) {
                    i16 = i22;
                } else {
                    i16 = i22 - 1;
                    i19 = zzpx6.zzhg();
                    i26 = zzpx6.zzhg();
                }
                j4 += (long) iArr[i17];
                i14--;
                i17++;
                i13 = i23;
                zzja = zzja2;
                zzef = i6;
                i10 = i25;
                i20 = i26;
                i11 = i24;
            }
            i3 = zzef;
            int i27 = i16;
            zzpo.checkArgument(i15 == 0);
            while (i9 > 0) {
                zzpo.checkArgument(zzpx5.zzhg() == 0);
                zzpx5.readInt();
                i9--;
            }
            if (i11 == 0 && i19 == 0 && i14 == 0 && i27 == 0) {
                zzjs2 = zzjs;
            } else {
                int i28 = i11;
                zzjs2 = zzjs;
                int i29 = zzjs2.f48id;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i29);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i28);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i19);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i14);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i27);
                Log.w("AtomParsers", sb.toString());
            }
            j = j3;
            i4 = i12;
        } else {
            i3 = zzef;
            zzja zzja3 = zzja;
            long[] jArr6 = new long[zziz.length];
            int[] iArr7 = new int[zziz.length];
            while (zziz.zzee()) {
                jArr6[zziz.index] = zziz.zzapb;
                iArr7[zziz.index] = zziz.zzapa;
            }
            int zzeg = zzja3.zzeg();
            long j6 = (long) zzhg3;
            int i30 = 8192 / zzeg;
            int i31 = 0;
            for (int zzf : iArr7) {
                i31 += zzqe.zzf(zzf, i30);
            }
            long[] jArr7 = new long[i31];
            int[] iArr8 = new int[i31];
            long[] jArr8 = new long[i31];
            int[] iArr9 = new int[i31];
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            for (int i35 = 0; i35 < iArr7.length; i35++) {
                int i36 = iArr7[i35];
                long j7 = jArr6[i35];
                while (i36 > 0) {
                    int min = Math.min(i30, i36);
                    jArr7[i33] = j7;
                    iArr8[i33] = zzeg * min;
                    i34 = Math.max(i34, iArr8[i33]);
                    jArr8[i33] = ((long) i32) * j6;
                    iArr9[i33] = 1;
                    j7 += (long) iArr8[i33];
                    i32 += min;
                    i36 -= min;
                    i33++;
                    jArr6 = jArr6;
                    iArr7 = iArr7;
                }
                long[] jArr9 = jArr6;
                int[] iArr10 = iArr7;
            }
            zzjh zzjh = new zzjh(jArr7, iArr8, i34, jArr8, iArr9);
            jArr2 = zzjh.zzagu;
            iArr = zzjh.zzagt;
            int i37 = zzjh.zzapp;
            jArr = zzjh.zzapq;
            iArr2 = zzjh.zzapr;
            i4 = i37;
            j = 0;
        }
        if (zzjs2.zzaso == null || zzid.zzea()) {
            zzqe.zza(jArr, 1000000, zzjs2.zzcr);
            return new zzjv(jArr2, iArr, i4, jArr, iArr2);
        }
        if (zzjs2.zzaso.length == 1 && zzjs2.type == 1 && jArr.length >= 2) {
            long j8 = zzjs2.zzasp[0];
            long zza = zzqe.zza(zzjs2.zzaso[0], zzjs2.zzcr, zzjs2.zzasl) + j8;
            if (jArr[0] <= j8 && j8 < jArr[1] && jArr[jArr.length - 1] < zza && zza <= j) {
                long j9 = j - zza;
                long zza2 = zzqe.zza(j8 - jArr[0], (long) zzjs2.zzaad.zzzu, zzjs2.zzcr);
                long zza3 = zzqe.zza(j9, (long) zzjs2.zzaad.zzzu, zzjs2.zzcr);
                if (!(zza2 == 0 && zza3 == 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    zzid zzid3 = zzid;
                    zzid3.zzzw = (int) zza2;
                    zzid3.zzzx = (int) zza3;
                    zzqe.zza(jArr, 1000000, zzjs2.zzcr);
                    return new zzjv(jArr2, iArr, i4, jArr, iArr2);
                }
            }
        }
        if (zzjs2.zzaso.length == 1) {
            char c = 0;
            if (zzjs2.zzaso[0] == 0) {
                int i38 = 0;
                while (i38 < jArr.length) {
                    jArr[i38] = zzqe.zza(jArr[i38] - zzjs2.zzasp[c], 1000000, zzjs2.zzcr);
                    i38++;
                    c = 0;
                }
                return new zzjv(jArr2, iArr, i4, jArr, iArr2);
            }
        }
        boolean z3 = zzjs2.type == 1;
        int i39 = 0;
        boolean z4 = false;
        int i40 = 0;
        int i41 = 0;
        while (i39 < zzjs2.zzaso.length) {
            long j10 = zzjs2.zzasp[i39];
            if (j10 != -1) {
                iArr6 = iArr;
                long zza4 = zzqe.zza(zzjs2.zzaso[i39], zzjs2.zzcr, zzjs2.zzasl);
                int zzb = zzqe.zzb(jArr, j10, true, true);
                int zzb2 = zzqe.zzb(jArr, j10 + zza4, z3, false);
                i40 += zzb2 - zzb;
                z4 |= i41 != zzb;
                i41 = zzb2;
            } else {
                iArr6 = iArr;
            }
            i39++;
            iArr = iArr6;
        }
        int[] iArr11 = iArr;
        boolean z5 = (i40 != i3) | z4;
        long[] jArr10 = z5 ? new long[i40] : jArr2;
        int[] iArr12 = z5 ? new int[i40] : iArr11;
        if (z5) {
            i4 = 0;
        }
        int[] iArr13 = z5 ? new int[i40] : iArr2;
        long[] jArr11 = new long[i40];
        int i42 = i4;
        int i43 = 0;
        int i44 = 0;
        while (i43 < zzjs2.zzaso.length) {
            long j11 = zzjs2.zzasp[i43];
            long j12 = zzjs2.zzaso[i43];
            if (j11 != -1) {
                int[] iArr14 = iArr13;
                i5 = i43;
                long j13 = zzjs2.zzcr;
                long[] jArr12 = jArr10;
                jArr4 = jArr11;
                int zzb3 = zzqe.zzb(jArr, j11, true, true);
                int zzb4 = zzqe.zzb(jArr, zzqe.zza(j12, j13, zzjs2.zzasl) + j11, z3, false);
                if (z5) {
                    int i45 = zzb4 - zzb3;
                    jArr5 = jArr12;
                    System.arraycopy(jArr2, zzb3, jArr5, i44, i45);
                    iArr4 = iArr11;
                    System.arraycopy(iArr4, zzb3, iArr12, i44, i45);
                    z2 = z3;
                    iArr5 = iArr14;
                    System.arraycopy(iArr2, zzb3, iArr5, i44, i45);
                } else {
                    z2 = z3;
                    iArr4 = iArr11;
                    iArr5 = iArr14;
                    jArr5 = jArr12;
                }
                int i46 = i42;
                while (zzb3 < zzb4) {
                    long[] jArr13 = jArr2;
                    int[] iArr15 = iArr2;
                    long j14 = j11;
                    jArr4[i44] = zzqe.zza(j2, 1000000, zzjs2.zzasl) + zzqe.zza(jArr[zzb3] - j11, 1000000, zzjs2.zzcr);
                    if (z5 && iArr12[i44] > i46) {
                        i46 = iArr4[zzb3];
                    }
                    i44++;
                    zzb3++;
                    jArr2 = jArr13;
                    iArr2 = iArr15;
                    j11 = j14;
                }
                jArr3 = jArr2;
                iArr3 = iArr2;
                i42 = i46;
            } else {
                z2 = z3;
                jArr5 = jArr10;
                jArr4 = jArr11;
                jArr3 = jArr2;
                iArr3 = iArr2;
                iArr5 = iArr13;
                i5 = i43;
                iArr4 = iArr11;
            }
            j2 += j12;
            i43 = i5 + 1;
            iArr11 = iArr4;
            jArr10 = jArr5;
            jArr11 = jArr4;
            jArr2 = jArr3;
            iArr2 = iArr3;
            iArr13 = iArr5;
            z3 = z2;
        }
        long[] jArr14 = jArr10;
        long[] jArr15 = jArr11;
        int[] iArr16 = iArr13;
        boolean z6 = false;
        for (int i47 = 0; i47 < iArr16.length && !z6; i47++) {
            z6 |= (iArr16[i47] & 1) != 0;
        }
        if (z6) {
            return new zzjv(jArr14, iArr12, i42, jArr15, iArr16);
        }
        throw new zzfx("The edited sample sequence does not contain a sync sample.");
    }

    public static zzki zza(zzix zzix, boolean z) {
        if (z) {
            return null;
        }
        zzpx zzpx = zzix.zzaos;
        zzpx.setPosition(8);
        while (zzpx.zzhb() >= 8) {
            int position = zzpx.getPosition();
            int readInt = zzpx.readInt();
            if (zzpx.readInt() == zziv.zzaob) {
                zzpx.setPosition(position);
                int i = position + readInt;
                zzpx.zzbl(12);
                while (true) {
                    if (zzpx.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzpx.getPosition();
                    int readInt2 = zzpx.readInt();
                    if (zzpx.readInt() == zziv.zzaoc) {
                        zzpx.setPosition(position2);
                        int i2 = position2 + readInt2;
                        zzpx.zzbl(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzpx.getPosition() < i2) {
                            zzki.zza zzd = zzjm.zzd(zzpx);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzki((List<? extends zzki.zza>) arrayList);
                        }
                    } else {
                        zzpx.zzbl(readInt2 - 8);
                    }
                }
                return null;
            }
            zzpx.zzbl(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzpx zzpx, int i) {
        zzpx.setPosition(i + 8 + 4);
        zzpx.zzbl(1);
        zzc(zzpx);
        zzpx.zzbl(2);
        int readUnsignedByte = zzpx.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzpx.zzbl(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzpx.zzbl(zzpx.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzpx.zzbl(2);
        }
        zzpx.zzbl(1);
        zzc(zzpx);
        String str = null;
        switch (zzpx.readUnsignedByte()) {
            case 32:
                str = "video/mp4v-es";
                break;
            case 33:
                str = "video/avc";
                break;
            case 35:
                str = "video/hevc";
                break;
            case 64:
            case 102:
            case 103:
            case 104:
                str = "audio/mp4a-latm";
                break;
            case 107:
                return Pair.create("audio/mpeg", (Object) null);
            case 165:
                str = "audio/ac3";
                break;
            case 166:
                str = "audio/eac3";
                break;
            case 169:
            case 172:
                return Pair.create("audio/vnd.dts", (Object) null);
            case 170:
            case 171:
                return Pair.create("audio/vnd.dts.hd", (Object) null);
        }
        zzpx.zzbl(12);
        zzpx.zzbl(1);
        int zzc = zzc(zzpx);
        byte[] bArr = new byte[zzc];
        zzpx.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzpx zzpx, int i, int i2, zzjb zzjb, int i3) {
        zzjt zzjt;
        zzpx zzpx2 = zzpx;
        int position = zzpx.getPosition();
        while (true) {
            boolean z = false;
            if (position - i >= i2) {
                return 0;
            }
            zzpx2.setPosition(position);
            int readInt = zzpx.readInt();
            zzpo.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzpx.readInt() == zziv.zzamv) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzjt zzjt2 = null;
                boolean z2 = false;
                while (i4 - position < readInt) {
                    zzpx2.setPosition(i4);
                    int readInt2 = zzpx.readInt();
                    int readInt3 = zzpx.readInt();
                    if (readInt3 == zziv.zzanb) {
                        num = Integer.valueOf(zzpx.readInt());
                    } else if (readInt3 == zziv.zzamw) {
                        zzpx2.zzbl(4);
                        z2 = zzpx.readInt() == zzaoz;
                    } else if (readInt3 == zziv.zzamx) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzjt = null;
                                break;
                            }
                            zzpx2.setPosition(i5);
                            int readInt4 = zzpx.readInt();
                            if (zzpx.readInt() == zziv.zzamy) {
                                zzpx2.zzbl(6);
                                boolean z3 = zzpx.readUnsignedByte() == 1;
                                int readUnsignedByte = zzpx.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzpx2.zze(bArr, 0, 16);
                                zzjt = new zzjt(z3, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                        zzjt2 = zzjt;
                    }
                    i4 += readInt2;
                }
                if (z2) {
                    zzpo.checkArgument(num != null, "frma atom is mandatory");
                    if (zzjt2 != null) {
                        z = true;
                    }
                    zzpo.checkArgument(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzjt2);
                }
                if (pair != null) {
                    zzjb.zzaph[i3] = (zzjt) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzjb zzjb2 = zzjb;
            position += readInt;
        }
    }

    private static int zzc(zzpx zzpx) {
        int readUnsignedByte = zzpx.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzpx.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
