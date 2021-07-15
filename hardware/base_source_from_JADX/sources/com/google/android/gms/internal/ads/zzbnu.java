package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzbnu implements zzbov {
    private final SecretKeySpec zzfil;
    private final int zzfim;
    private final int zzfin = zzbol.zzfjr.zzfu("AES/CTR/NoPadding").getBlockSize();

    public zzbnu(byte[] bArr, int i) throws GeneralSecurityException {
        zzbpd.zzeh(bArr.length);
        this.zzfil = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.zzfin) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzfim = i;
    }

    public final byte[] zzn(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.zzfim) {
            byte[] bArr2 = new byte[(this.zzfim + bArr.length)];
            byte[] zzeg = zzboy.zzeg(this.zzfim);
            System.arraycopy(zzeg, 0, bArr2, 0, this.zzfim);
            int length = bArr.length;
            int i = this.zzfim;
            Cipher zzfu = zzbol.zzfjr.zzfu("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.zzfin];
            System.arraycopy(zzeg, 0, bArr3, 0, this.zzfim);
            zzfu.init(1, this.zzfil, new IvParameterSpec(bArr3));
            if (zzfu.doFinal(bArr, 0, length, bArr2, i) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.zzfim;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i2);
        throw new GeneralSecurityException(sb.toString());
    }
}
