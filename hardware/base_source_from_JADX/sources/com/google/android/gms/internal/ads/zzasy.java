package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@zzark
@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
public final class zzasy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasy> CREATOR = new zzata();
    @SafeParcelable.Field(mo8233id = 2)
    private ParcelFileDescriptor zzdzi;
    private Parcelable zzdzj;
    private boolean zzdzk;

    @SafeParcelable.Constructor
    public zzasy(@SafeParcelable.Param(mo8236id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zzdzi = parcelFileDescriptor;
        this.zzdzj = null;
        this.zzdzk = true;
    }

    public zzasy(SafeParcelable safeParcelable) {
        this.zzdzi = null;
        this.zzdzj = safeParcelable;
        this.zzdzk = false;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends SafeParcelable> T zza(Parcelable.Creator<T> creator) {
        if (this.zzdzk) {
            if (this.zzdzi == null) {
                zzaxz.m31e("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zzdzi));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                IOUtils.closeQuietly((Closeable) dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.zzdzj = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.zzdzk = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                zzaxz.zzb("Could not read from parcel file descriptor", e);
                IOUtils.closeQuietly((Closeable) dataInputStream);
                return null;
            } catch (Throwable th2) {
                IOUtils.closeQuietly((Closeable) dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzdzj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzwl();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor zzwl() {
        if (this.zzdzi == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzdzj.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.zzdzi = zzh(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.zzdzi;
    }

    private final <T> ParcelFileDescriptor zzh(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new zzasz(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                zzaxz.zzb("Error transporting the ad response", e);
                zzbv.zzlj().zza(e, "LargeParcelTeleporter.pipeData.2");
                IOUtils.closeQuietly((Closeable) autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            zzaxz.zzb("Error transporting the ad response", e);
            zzbv.zzlj().zza(e, "LargeParcelTeleporter.pipeData.2");
            IOUtils.closeQuietly((Closeable) autoCloseOutputStream);
            return null;
        }
    }
}
