package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzbvy implements zzbd, Closeable, Iterator<zzbc> {
    private static zzbwg zzco = zzbwg.zzk(zzbvy.class);
    private static final zzbc zzgco = new zzbvz("eof ");
    long zzaop = 0;
    long zzayz = 0;
    protected zzbwa zzgcl;
    protected zzaz zzgcp;
    private zzbc zzgcq = null;
    long zzgcr = 0;
    private List<zzbc> zzgcs = new ArrayList();

    public final List<zzbc> zzaqh() {
        if (this.zzgcl == null || this.zzgcq == zzgco) {
            return this.zzgcs;
        }
        return new zzbwe(this.zzgcs, this);
    }

    public void zza(zzbwa zzbwa, long j, zzaz zzaz) throws IOException {
        this.zzgcl = zzbwa;
        long position = zzbwa.position();
        this.zzayz = position;
        this.zzgcr = position;
        zzbwa.zzaw(zzbwa.position() + j);
        this.zzaop = zzbwa.position();
        this.zzgcp = zzaz;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.zzgcq == zzgco) {
            return false;
        }
        if (this.zzgcq != null) {
            return true;
        }
        try {
            this.zzgcq = (zzbc) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzgcq = zzgco;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzaqi */
    public final zzbc next() {
        zzbc zza;
        if (this.zzgcq != null && this.zzgcq != zzgco) {
            zzbc zzbc = this.zzgcq;
            this.zzgcq = null;
            return zzbc;
        } else if (this.zzgcl == null || this.zzgcr >= this.zzaop) {
            this.zzgcq = zzgco;
            throw new NoSuchElementException();
        } else {
            try {
                synchronized (this.zzgcl) {
                    this.zzgcl.zzaw(this.zzgcr);
                    zza = this.zzgcp.zza(this.zzgcl, this);
                    this.zzgcr = this.zzgcl.position();
                }
                return zza;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzgcs.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zzgcs.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zzgcl.close();
    }
}
