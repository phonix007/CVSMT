package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvx;
import com.google.android.gms.internal.measurement.zzvx.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzvx<MessageType extends zzvx<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzug<MessageType, BuilderType> {
    private static Map<Object, zzvx<?, ?>> zzbzj = new ConcurrentHashMap();
    protected zzyn zzbzh = zzyn.zzys();
    private int zzbzi = -1;

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzvx<MessageType, BuilderType> implements zzxg {
        protected zzvo<Object> zzbzn = zzvo.zzwd();
    }

    public static class zzd<ContainingType extends zzxe, Type> extends zzvi<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    public static final class zze {
        public static final int zzbzo = 1;
        public static final int zzbzp = 2;
        public static final int zzbzq = 3;
        public static final int zzbzr = 4;
        public static final int zzbzs = 5;
        public static final int zzbzt = 6;
        public static final int zzbzu = 7;
        private static final /* synthetic */ int[] zzbzv = {zzbzo, zzbzp, zzbzq, zzbzr, zzbzs, zzbzt, zzbzu};
        public static final int zzbzw = 1;
        public static final int zzbzx = 2;
        private static final /* synthetic */ int[] zzbzy = {zzbzw, zzbzx};
        public static final int zzbzz = 1;
        public static final int zzcaa = 2;
        private static final /* synthetic */ int[] zzcab = {zzbzz, zzcaa};

        public static int[] zzww() {
            return (int[]) zzbzv.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static class zzb<T extends zzvx<T, ?>> extends zzui<T> {
        private final T zzbzk;

        public zzb(T t) {
            this.zzbzk = t;
        }

        public final /* synthetic */ Object zza(zzuz zzuz, zzvk zzvk) throws zzwe {
            return zzvx.zza(this.zzbzk, zzuz, zzvk);
        }
    }

    public String toString() {
        return zzxh.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbum != 0) {
            return this.zzbum;
        }
        this.zzbum = zzxq.zzya().zzak(this).hashCode(this);
        return this.zzbum;
    }

    public static abstract class zza<MessageType extends zzvx<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzuh<MessageType, BuilderType> {
        private final MessageType zzbzk;
        protected MessageType zzbzl;
        private boolean zzbzm = false;

        protected zza(MessageType messagetype) {
            this.zzbzk = messagetype;
            this.zzbzl = (zzvx) messagetype.zza(zze.zzbzr, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public final void zzwr() {
            if (this.zzbzm) {
                MessageType messagetype = (zzvx) this.zzbzl.zza(zze.zzbzr, (Object) null, (Object) null);
                zza(messagetype, this.zzbzl);
                this.zzbzl = messagetype;
                this.zzbzm = false;
            }
        }

        public final boolean isInitialized() {
            return zzvx.zza(this.zzbzl, false);
        }

        /* renamed from: zzws */
        public MessageType zzwu() {
            if (this.zzbzm) {
                return this.zzbzl;
            }
            MessageType messagetype = this.zzbzl;
            zzxq.zzya().zzak(messagetype).zzy(messagetype);
            this.zzbzm = true;
            return this.zzbzl;
        }

        /* renamed from: zzwt */
        public final MessageType zzwv() {
            MessageType messagetype = (zzvx) zzwu();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.zza(zze.zzbzo, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzxq.zzya().zzak(messagetype).zzaj(messagetype);
                    if (booleanValue) {
                        messagetype.zza(zze.zzbzp, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzyl(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzwr();
            zza(this.zzbzl, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzxq.zzya().zzak(messagetype).zzd(messagetype, messagetype2);
        }

        public final /* synthetic */ zzuh zzuf() {
            return (zza) clone();
        }

        public final /* synthetic */ zzxe zzwq() {
            return this.zzbzk;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) ((zzvx) this.zzbzk).zza(zze.zzbzs, (Object) null, (Object) null);
            zza.zza((zzvx) zzwu());
            return zza;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzvx) zza(zze.zzbzt, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzxq.zzya().zzak(this).equals(this, (zzvx) obj);
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zza(zze.zzbzo, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaj = zzxq.zzya().zzak(this).zzaj(this);
        if (booleanValue) {
            zza(zze.zzbzp, (Object) zzaj ? this : null, (Object) null);
        }
        return zzaj;
    }

    public final BuilderType zzwm() {
        BuilderType buildertype = (zza) zza(zze.zzbzs, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    public final int zzue() {
        return this.zzbzi;
    }

    /* access modifiers changed from: package-private */
    public final void zzah(int i) {
        this.zzbzi = i;
    }

    public final void zzb(zzve zzve) throws IOException {
        zzxq.zzya().zzi(getClass()).zza(this, zzvg.zza(zzve));
    }

    public final int zzwe() {
        if (this.zzbzi == -1) {
            this.zzbzi = zzxq.zzya().zzak(this).zzai(this);
        }
        return this.zzbzi;
    }

    static <T extends zzvx<?, ?>> T zzg(Class<T> cls) {
        T t = (zzvx) zzbzj.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzvx) zzbzj.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzvx) ((zzvx) zzys.zzk(cls)).zza(zze.zzbzt, (Object) null, (Object) null);
            if (t != null) {
                zzbzj.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzvx<?, ?>> void zza(Class<T> cls, T t) {
        zzbzj.put(cls, t);
    }

    protected static Object zza(zzxe zzxe, String str, Object[] objArr) {
        return new zzxs(zzxe, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzvx<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzbzo, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return zzxq.zzya().zzak(t).zzaj(t);
    }

    protected static <E> zzwd<E> zzwn() {
        return zzxr.zzyb();
    }

    static <T extends zzvx<T, ?>> T zza(T t, zzuz zzuz, zzvk zzvk) throws zzwe {
        T t2 = (zzvx) t.zza(zze.zzbzr, (Object) null, (Object) null);
        try {
            zzxq.zzya().zzak(t2).zza(t2, zzvc.zza(zzuz), zzvk);
            zzxq.zzya().zzak(t2).zzy(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzwe) {
                throw ((zzwe) e.getCause());
            }
            throw new zzwe(e.getMessage()).zzg(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzwe) {
                throw ((zzwe) e2.getCause());
            }
            throw e2;
        }
    }

    public final /* synthetic */ zzxf zzwo() {
        zza zza2 = (zza) zza(zze.zzbzs, (Object) null, (Object) null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzxf zzwp() {
        return (zza) zza(zze.zzbzs, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzxe zzwq() {
        return (zzvx) zza(zze.zzbzt, (Object) null, (Object) null);
    }
}
