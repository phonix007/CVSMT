package com.google.android.gms.internal.measurement;

final class zzyi {
    static String zzd(zzun zzun) {
        zzyj zzyj = new zzyj(zzun);
        StringBuilder sb = new StringBuilder(zzyj.size());
        for (int i = 0; i < zzyj.size(); i++) {
            byte zzal = zzyj.zzal(i);
            if (zzal == 34) {
                sb.append("\\\"");
            } else if (zzal == 39) {
                sb.append("\\'");
            } else if (zzal != 92) {
                switch (zzal) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzal >= 32 && zzal <= 126) {
                            sb.append((char) zzal);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzal >>> 6) & 3) + 48));
                            sb.append((char) (((zzal >>> 3) & 7) + 48));
                            sb.append((char) ((zzal & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
