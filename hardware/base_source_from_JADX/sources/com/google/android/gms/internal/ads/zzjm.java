package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzki;

final class zzjm {
    private static final int zzarb = zzqe.zzam("nam");
    private static final int zzarc = zzqe.zzam("trk");
    private static final int zzard = zzqe.zzam("cmt");
    private static final int zzare = zzqe.zzam("day");
    private static final int zzarf = zzqe.zzam("ART");
    private static final int zzarg = zzqe.zzam("too");
    private static final int zzarh = zzqe.zzam("alb");
    private static final int zzari = zzqe.zzam("com");
    private static final int zzarj = zzqe.zzam("wrt");
    private static final int zzark = zzqe.zzam("lyr");
    private static final int zzarl = zzqe.zzam("gen");
    private static final int zzarm = zzqe.zzam("covr");
    private static final int zzarn = zzqe.zzam("gnre");
    private static final int zzaro = zzqe.zzam("grp");
    private static final int zzarp = zzqe.zzam("disk");
    private static final int zzarq = zzqe.zzam("trkn");
    private static final int zzarr = zzqe.zzam("tmpo");
    private static final int zzars = zzqe.zzam("cpil");
    private static final int zzart = zzqe.zzam("aART");
    private static final int zzaru = zzqe.zzam("sonm");
    private static final int zzarv = zzqe.zzam("soal");
    private static final int zzarw = zzqe.zzam("soar");
    private static final int zzarx = zzqe.zzam("soaa");
    private static final int zzary = zzqe.zzam("soco");
    private static final int zzarz = zzqe.zzam("rtng");
    private static final int zzasa = zzqe.zzam("pgap");
    private static final int zzasb = zzqe.zzam("sosn");
    private static final int zzasc = zzqe.zzam("tvsh");
    private static final int zzasd = zzqe.zzam("----");
    private static final String[] zzase = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static zzki.zza zzd(zzpx zzpx) {
        zzkq zzkq;
        int position = zzpx.getPosition() + zzpx.readInt();
        int readInt = zzpx.readInt();
        int i = readInt >>> 24;
        zzkp zzkp = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & readInt;
            if (i2 == zzard) {
                int readInt2 = zzpx.readInt();
                if (zzpx.readInt() == zziv.zzaof) {
                    zzpx.zzbl(8);
                    String zzbm = zzpx.zzbm(readInt2 - 16);
                    zzkp = new zzkm("und", zzbm, zzbm);
                } else {
                    String valueOf = String.valueOf(zziv.zzah(readInt));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                zzpx.setPosition(position);
                return zzkp;
            }
            if (i2 != zzarb) {
                if (i2 != zzarc) {
                    if (i2 != zzari) {
                        if (i2 != zzarj) {
                            if (i2 == zzare) {
                                zzkq zza = zza(readInt, "TDRC", zzpx);
                                zzpx.setPosition(position);
                                return zza;
                            } else if (i2 == zzarf) {
                                zzkq zza2 = zza(readInt, "TPE1", zzpx);
                                zzpx.setPosition(position);
                                return zza2;
                            } else if (i2 == zzarg) {
                                zzkq zza3 = zza(readInt, "TSSE", zzpx);
                                zzpx.setPosition(position);
                                return zza3;
                            } else if (i2 == zzarh) {
                                zzkq zza4 = zza(readInt, "TALB", zzpx);
                                zzpx.setPosition(position);
                                return zza4;
                            } else if (i2 == zzark) {
                                zzkq zza5 = zza(readInt, "USLT", zzpx);
                                zzpx.setPosition(position);
                                return zza5;
                            } else if (i2 == zzarl) {
                                zzkq zza6 = zza(readInt, "TCON", zzpx);
                                zzpx.setPosition(position);
                                return zza6;
                            } else if (i2 == zzaro) {
                                zzkq zza7 = zza(readInt, "TIT1", zzpx);
                                zzpx.setPosition(position);
                                return zza7;
                            }
                        }
                    }
                    zzkq zza8 = zza(readInt, "TCOM", zzpx);
                    zzpx.setPosition(position);
                    return zza8;
                }
            }
            zzkq zza9 = zza(readInt, "TIT2", zzpx);
            zzpx.setPosition(position);
            return zza9;
        }
        try {
            if (readInt == zzarn) {
                int zze = zze(zzpx);
                String str = (zze <= 0 || zze > zzase.length) ? null : zzase[zze - 1];
                if (str != null) {
                    zzkq = new zzkq("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                    zzkq = null;
                }
                return zzkq;
            } else if (readInt == zzarp) {
                zzkq zzb = zzb(readInt, "TPOS", zzpx);
                zzpx.setPosition(position);
                return zzb;
            } else if (readInt == zzarq) {
                zzkq zzb2 = zzb(readInt, "TRCK", zzpx);
                zzpx.setPosition(position);
                return zzb2;
            } else if (readInt == zzarr) {
                zzkp zza10 = zza(readInt, "TBPM", zzpx, true, false);
                zzpx.setPosition(position);
                return zza10;
            } else if (readInt == zzars) {
                zzkp zza11 = zza(readInt, "TCMP", zzpx, true, true);
                zzpx.setPosition(position);
                return zza11;
            } else if (readInt == zzarm) {
                int readInt3 = zzpx.readInt();
                if (zzpx.readInt() == zziv.zzaof) {
                    int zzag = zziv.zzag(zzpx.readInt());
                    String str2 = zzag == 13 ? "image/jpeg" : zzag == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(zzag);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzpx.zzbl(4);
                        byte[] bArr = new byte[(readInt3 - 16)];
                        zzpx.zze(bArr, 0, bArr.length);
                        zzkp = new zzkk(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                zzpx.setPosition(position);
                return zzkp;
            } else if (readInt == zzart) {
                zzkq zza12 = zza(readInt, "TPE2", zzpx);
                zzpx.setPosition(position);
                return zza12;
            } else if (readInt == zzaru) {
                zzkq zza13 = zza(readInt, "TSOT", zzpx);
                zzpx.setPosition(position);
                return zza13;
            } else if (readInt == zzarv) {
                zzkq zza14 = zza(readInt, "TSO2", zzpx);
                zzpx.setPosition(position);
                return zza14;
            } else if (readInt == zzarw) {
                zzkq zza15 = zza(readInt, "TSOA", zzpx);
                zzpx.setPosition(position);
                return zza15;
            } else if (readInt == zzarx) {
                zzkq zza16 = zza(readInt, "TSOP", zzpx);
                zzpx.setPosition(position);
                return zza16;
            } else if (readInt == zzary) {
                zzkq zza17 = zza(readInt, "TSOC", zzpx);
                zzpx.setPosition(position);
                return zza17;
            } else if (readInt == zzarz) {
                zzkp zza18 = zza(readInt, "ITUNESADVISORY", zzpx, false, false);
                zzpx.setPosition(position);
                return zza18;
            } else if (readInt == zzasa) {
                zzkp zza19 = zza(readInt, "ITUNESGAPLESS", zzpx, false, true);
                zzpx.setPosition(position);
                return zza19;
            } else if (readInt == zzasb) {
                zzkq zza20 = zza(readInt, "TVSHOWSORT", zzpx);
                zzpx.setPosition(position);
                return zza20;
            } else if (readInt == zzasc) {
                zzkq zza21 = zza(readInt, "TVSHOW", zzpx);
                zzpx.setPosition(position);
                return zza21;
            } else if (readInt == zzasd) {
                String str3 = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (zzpx.getPosition() < position) {
                    int position2 = zzpx.getPosition();
                    int readInt4 = zzpx.readInt();
                    int readInt5 = zzpx.readInt();
                    zzpx.zzbl(4);
                    if (readInt5 == zziv.zzaod) {
                        str3 = zzpx.zzbm(readInt4 - 12);
                    } else if (readInt5 == zziv.zzaoe) {
                        str4 = zzpx.zzbm(readInt4 - 12);
                    } else {
                        if (readInt5 == zziv.zzaof) {
                            i3 = position2;
                            i4 = readInt4;
                        }
                        zzpx.zzbl(readInt4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4)) {
                    if (i3 != -1) {
                        zzpx.setPosition(i3);
                        zzpx.zzbl(16);
                        zzkp = new zzkm("und", str4, zzpx.zzbm(i4 - 16));
                    }
                }
                zzpx.setPosition(position);
                return zzkp;
            }
        } finally {
            zzpx.setPosition(position);
        }
        String valueOf2 = String.valueOf(zziv.zzah(readInt));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        zzpx.setPosition(position);
        return null;
    }

    private static zzkq zza(int i, String str, zzpx zzpx) {
        int readInt = zzpx.readInt();
        if (zzpx.readInt() == zziv.zzaof) {
            zzpx.zzbl(8);
            return new zzkq(str, (String) null, zzpx.zzbm(readInt - 16));
        }
        String valueOf = String.valueOf(zziv.zzah(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static zzkp zza(int i, String str, zzpx zzpx, boolean z, boolean z2) {
        int zze = zze(zzpx);
        if (z2) {
            zze = Math.min(1, zze);
        }
        if (zze < 0) {
            String valueOf = String.valueOf(zziv.zzah(i));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new zzkq(str, (String) null, Integer.toString(zze));
        } else {
            return new zzkm("und", str, Integer.toString(zze));
        }
    }

    private static zzkq zzb(int i, String str, zzpx zzpx) {
        int readInt = zzpx.readInt();
        if (zzpx.readInt() == zziv.zzaof && readInt >= 22) {
            zzpx.zzbl(10);
            int readUnsignedShort = zzpx.readUnsignedShort();
            if (readUnsignedShort > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(readUnsignedShort);
                String sb2 = sb.toString();
                int readUnsignedShort2 = zzpx.readUnsignedShort();
                if (readUnsignedShort2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(readUnsignedShort2);
                    sb2 = sb3.toString();
                }
                return new zzkq(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(zziv.zzah(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static int zze(zzpx zzpx) {
        zzpx.zzbl(4);
        if (zzpx.readInt() == zziv.zzaof) {
            zzpx.zzbl(8);
            return zzpx.readUnsignedByte();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
