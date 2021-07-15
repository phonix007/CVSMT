package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzed extends zzr implements zzec {
    public zzed() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzec asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzec) {
            return (zzec) queryLocalInterface;
        }
        return new zzee(iBinder);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v26, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v39, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v44, types: [com.google.android.gms.internal.measurement.zzel] */
    /* JADX WARNING: type inference failed for: r1v49, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v54, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v59, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v64, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v83, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v88, types: [com.google.android.gms.internal.measurement.zzef] */
    /* JADX WARNING: type inference failed for: r1v94, types: [com.google.android.gms.internal.measurement.zzei] */
    /* JADX WARNING: type inference failed for: r1v99, types: [com.google.android.gms.internal.measurement.zzei] */
    /* JADX WARNING: type inference failed for: r1v104, types: [com.google.android.gms.internal.measurement.zzei] */
    /* JADX WARNING: type inference failed for: r1v109 */
    /* JADX WARNING: type inference failed for: r1v110 */
    /* JADX WARNING: type inference failed for: r1v111 */
    /* JADX WARNING: type inference failed for: r1v112 */
    /* JADX WARNING: type inference failed for: r1v113 */
    /* JADX WARNING: type inference failed for: r1v114 */
    /* JADX WARNING: type inference failed for: r1v115 */
    /* JADX WARNING: type inference failed for: r1v116 */
    /* JADX WARNING: type inference failed for: r1v117 */
    /* JADX WARNING: type inference failed for: r1v118 */
    /* JADX WARNING: type inference failed for: r1v119 */
    /* JADX WARNING: type inference failed for: r1v120 */
    /* JADX WARNING: type inference failed for: r1v121 */
    /* JADX WARNING: type inference failed for: r1v122 */
    /* JADX WARNING: type inference failed for: r1v123 */
    /* JADX WARNING: type inference failed for: r1v124 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: type inference failed for: r1v126 */
    /* JADX WARNING: type inference failed for: r1v127 */
    /* JADX WARNING: type inference failed for: r1v128 */
    /* JADX WARNING: type inference failed for: r1v129 */
    /* JADX WARNING: type inference failed for: r1v130 */
    /* JADX WARNING: type inference failed for: r1v131 */
    /* JADX WARNING: type inference failed for: r1v132 */
    /* JADX WARNING: type inference failed for: r1v133 */
    /* JADX WARNING: type inference failed for: r1v134 */
    /* JADX WARNING: type inference failed for: r1v135 */
    /* JADX WARNING: type inference failed for: r1v136 */
    /* JADX WARNING: type inference failed for: r1v137 */
    /* JADX WARNING: type inference failed for: r1v138 */
    /* JADX WARNING: type inference failed for: r1v139 */
    /* JADX WARNING: type inference failed for: r1v140 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) throws android.os.RemoteException {
        /*
            r8 = this;
            r1 = 0
            switch(r9) {
                case 1: goto L_0x039c;
                case 2: goto L_0x037b;
                case 3: goto L_0x0342;
                case 4: goto L_0x0324;
                case 5: goto L_0x02fa;
                case 6: goto L_0x02d8;
                case 7: goto L_0x02cb;
                case 8: goto L_0x02ba;
                case 9: goto L_0x02a5;
                case 10: goto L_0x027f;
                case 11: goto L_0x0272;
                case 12: goto L_0x0269;
                case 13: goto L_0x0260;
                case 14: goto L_0x0257;
                case 15: goto L_0x023d;
                case 16: goto L_0x021f;
                case 17: goto L_0x0201;
                case 18: goto L_0x01e3;
                case 19: goto L_0x01c5;
                case 20: goto L_0x01a7;
                case 21: goto L_0x0189;
                case 22: goto L_0x016b;
                case 23: goto L_0x015e;
                case 24: goto L_0x0151;
                case 25: goto L_0x0140;
                case 26: goto L_0x012f;
                case 27: goto L_0x0116;
                case 28: goto L_0x0105;
                case 29: goto L_0x00f4;
                case 30: goto L_0x00e3;
                case 31: goto L_0x00b9;
                case 32: goto L_0x008f;
                case 33: goto L_0x0069;
                case 34: goto L_0x004b;
                case 35: goto L_0x002d;
                case 36: goto L_0x000f;
                case 37: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r0 = 0
            return r0
        L_0x0006:
            java.util.HashMap r0 = com.google.android.gms.internal.measurement.zzs.zzb(r10)
            r8.initForTests(r0)
            goto L_0x03b3
        L_0x000f:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0016
            goto L_0x0028
        L_0x0016:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzei
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.internal.measurement.zzei r1 = (com.google.android.gms.internal.measurement.zzei) r1
            goto L_0x0028
        L_0x0023:
            com.google.android.gms.internal.measurement.zzek r1 = new com.google.android.gms.internal.measurement.zzek
            r1.<init>(r0)
        L_0x0028:
            r8.unregisterOnMeasurementEventListener(r1)
            goto L_0x03b3
        L_0x002d:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0034
            goto L_0x0046
        L_0x0034:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzei
            if (r2 == 0) goto L_0x0041
            com.google.android.gms.internal.measurement.zzei r1 = (com.google.android.gms.internal.measurement.zzei) r1
            goto L_0x0046
        L_0x0041:
            com.google.android.gms.internal.measurement.zzek r1 = new com.google.android.gms.internal.measurement.zzek
            r1.<init>(r0)
        L_0x0046:
            r8.registerOnMeasurementEventListener(r1)
            goto L_0x03b3
        L_0x004b:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzei
            if (r2 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.zzei r1 = (com.google.android.gms.internal.measurement.zzei) r1
            goto L_0x0064
        L_0x005f:
            com.google.android.gms.internal.measurement.zzek r1 = new com.google.android.gms.internal.measurement.zzek
            r1.<init>(r0)
        L_0x0064:
            r8.setEventInterceptor(r1)
            goto L_0x03b3
        L_0x0069:
            int r1 = r10.readInt()
            java.lang.String r2 = r10.readString()
            android.os.IBinder r3 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            android.os.IBinder r4 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r0 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            r0 = r8
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x03b3
        L_0x008f:
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            android.os.IBinder r3 = r10.readStrongBinder()
            if (r3 != 0) goto L_0x009e
            goto L_0x00b0
        L_0x009e:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r4 == 0) goto L_0x00ab
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x00b0
        L_0x00ab:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r3)
        L_0x00b0:
            long r3 = r10.readLong()
            r8.performAction(r2, r1, r3)
            goto L_0x03b3
        L_0x00b9:
            android.os.IBinder r2 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            android.os.IBinder r3 = r10.readStrongBinder()
            if (r3 != 0) goto L_0x00c8
            goto L_0x00da
        L_0x00c8:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r4 == 0) goto L_0x00d5
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x00da
        L_0x00d5:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r3)
        L_0x00da:
            long r3 = r10.readLong()
            r8.onActivitySaveInstanceState(r2, r1, r3)
            goto L_0x03b3
        L_0x00e3:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r10.readLong()
            r8.onActivityResumed(r1, r2)
            goto L_0x03b3
        L_0x00f4:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r10.readLong()
            r8.onActivityPaused(r1, r2)
            goto L_0x03b3
        L_0x0105:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r10.readLong()
            r8.onActivityDestroyed(r1, r2)
            goto L_0x03b3
        L_0x0116:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r10.readLong()
            r8.onActivityCreated(r1, r2, r3)
            goto L_0x03b3
        L_0x012f:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r10.readLong()
            r8.onActivityStopped(r1, r2)
            goto L_0x03b3
        L_0x0140:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            long r2 = r10.readLong()
            r8.onActivityStarted(r1, r2)
            goto L_0x03b3
        L_0x0151:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.endAdUnitExposure(r1, r2)
            goto L_0x03b3
        L_0x015e:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.beginAdUnitExposure(r1, r2)
            goto L_0x03b3
        L_0x016b:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0172
            goto L_0x0184
        L_0x0172:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x017f
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x0184
        L_0x017f:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x0184:
            r8.generateEventId(r1)
            goto L_0x03b3
        L_0x0189:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0190
            goto L_0x01a2
        L_0x0190:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x019d
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x01a2
        L_0x019d:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x01a2:
            r8.getGmpAppId(r1)
            goto L_0x03b3
        L_0x01a7:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01ae
            goto L_0x01c0
        L_0x01ae:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x01bb
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x01c0
        L_0x01bb:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x01c0:
            r8.getAppInstanceId(r1)
            goto L_0x03b3
        L_0x01c5:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01cc
            goto L_0x01de
        L_0x01cc:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x01d9
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x01de
        L_0x01d9:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x01de:
            r8.getCachedAppInstanceId(r1)
            goto L_0x03b3
        L_0x01e3:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x01ea
            goto L_0x01fc
        L_0x01ea:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzel
            if (r2 == 0) goto L_0x01f7
            com.google.android.gms.internal.measurement.zzel r1 = (com.google.android.gms.internal.measurement.zzel) r1
            goto L_0x01fc
        L_0x01f7:
            com.google.android.gms.internal.measurement.zzem r1 = new com.google.android.gms.internal.measurement.zzem
            r1.<init>(r0)
        L_0x01fc:
            r8.setInstanceIdProvider(r1)
            goto L_0x03b3
        L_0x0201:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0208
            goto L_0x021a
        L_0x0208:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x0215
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x021a
        L_0x0215:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x021a:
            r8.getCurrentScreenClass(r1)
            goto L_0x03b3
        L_0x021f:
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x0226
            goto L_0x0238
        L_0x0226:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r2 == 0) goto L_0x0233
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x0238
        L_0x0233:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x0238:
            r8.getCurrentScreenName(r1)
            goto L_0x03b3
        L_0x023d:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            long r4 = r10.readLong()
            r0 = r8
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x03b3
        L_0x0257:
            long r0 = r10.readLong()
            r8.setSessionTimeoutDuration(r0)
            goto L_0x03b3
        L_0x0260:
            long r0 = r10.readLong()
            r8.setMinimumSessionDuration(r0)
            goto L_0x03b3
        L_0x0269:
            long r0 = r10.readLong()
            r8.resetAnalyticsData(r0)
            goto L_0x03b3
        L_0x0272:
            boolean r1 = com.google.android.gms.internal.measurement.zzs.zza(r10)
            long r2 = r10.readLong()
            r8.setMeasurementEnabled(r1, r2)
            goto L_0x03b3
        L_0x027f:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x028e
            goto L_0x02a0
        L_0x028e:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r4 == 0) goto L_0x029b
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x02a0
        L_0x029b:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x02a0:
            r8.getConditionalUserProperties(r2, r3, r1)
            goto L_0x03b3
        L_0x02a5:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r8.clearConditionalUserProperty(r1, r2, r0)
            goto L_0x03b3
        L_0x02ba:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r10.readLong()
            r8.setConditionalUserProperty(r1, r2)
            goto L_0x03b3
        L_0x02cb:
            java.lang.String r1 = r10.readString()
            long r2 = r10.readLong()
            r8.setUserId(r1, r2)
            goto L_0x03b3
        L_0x02d8:
            java.lang.String r2 = r10.readString()
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x02e3
            goto L_0x02f5
        L_0x02e3:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r3 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r3 == 0) goto L_0x02f0
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x02f5
        L_0x02f0:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x02f5:
            r8.getMaxUserProperties(r2, r1)
            goto L_0x03b3
        L_0x02fa:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            boolean r4 = com.google.android.gms.internal.measurement.zzs.zza(r10)
            android.os.IBinder r0 = r10.readStrongBinder()
            if (r0 != 0) goto L_0x030d
            goto L_0x031f
        L_0x030d:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r5 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r5 == 0) goto L_0x031a
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x031f
        L_0x031a:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r0)
        L_0x031f:
            r8.getUserProperties(r2, r3, r4, r1)
            goto L_0x03b3
        L_0x0324:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.IBinder r3 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r3)
            boolean r4 = com.google.android.gms.internal.measurement.zzs.zza(r10)
            long r5 = r10.readLong()
            r0 = r8
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x03b3
        L_0x0342:
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r10.readStrongBinder()
            if (r5 != 0) goto L_0x035a
        L_0x0358:
            r5 = r1
            goto L_0x036d
        L_0x035a:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzef
            if (r6 == 0) goto L_0x0367
            com.google.android.gms.internal.measurement.zzef r1 = (com.google.android.gms.internal.measurement.zzef) r1
            goto L_0x0358
        L_0x0367:
            com.google.android.gms.internal.measurement.zzeh r1 = new com.google.android.gms.internal.measurement.zzeh
            r1.<init>(r5)
            goto L_0x0358
        L_0x036d:
            long r6 = r10.readLong()
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x03b3
        L_0x037b:
            java.lang.String r1 = r10.readString()
            java.lang.String r2 = r10.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            boolean r4 = com.google.android.gms.internal.measurement.zzs.zza(r10)
            boolean r5 = com.google.android.gms.internal.measurement.zzs.zza(r10)
            long r6 = r10.readLong()
            r0 = r8
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x03b3
        L_0x039c:
            android.os.IBinder r1 = r10.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            android.os.Parcelable$Creator<com.google.android.gms.internal.measurement.zzen> r2 = com.google.android.gms.internal.measurement.zzen.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.measurement.zzs.zza((android.os.Parcel) r10, r2)
            com.google.android.gms.internal.measurement.zzen r2 = (com.google.android.gms.internal.measurement.zzen) r2
            long r3 = r10.readLong()
            r8.initialize(r1, r2, r3)
        L_0x03b3:
            r11.writeNoException()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzed.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
