/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import com.onesignal.TrackGooglePurchase;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackGooglePurchase {
    private static Class<?> IInAppBillingServiceClass;
    private static int iapEnabled = -99;
    private Context appContext;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest = false;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting = true;
    private ArrayList<String> purchaseTokens;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    TrackGooglePurchase(Context context) {
        this.appContext = context;
        this.purchaseTokens = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(OneSignalPrefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i = 0; i < jSONArray.length(); ++i) {
                this.purchaseTokens.add((Object)jSONArray.get(i).toString());
            }
            int n = jSONArray.length();
            boolean bl = false;
            if (n == 0) {
                bl = true;
            }
            this.newAsExisting = bl;
            if (bl) {
                this.newAsExisting = OneSignalPrefs.getBool("GTPlayerPurchases", "ExistingPurchases", true);
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        this.trackIAP();
    }

    static boolean CanTrack(Context context) {
        if (iapEnabled == -99) {
            iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (iapEnabled == 0) {
                IInAppBillingServiceClass = Class.forName((String)"com.android.vending.billing.IInAppBillingService");
            }
            int n = iapEnabled;
            boolean bl = false;
            if (n == 0) {
                bl = true;
            }
            return bl;
        }
        catch (Throwable throwable) {
            iapEnabled = 0;
            return false;
        }
    }

    private void QueryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new Runnable(){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void run() {
                TrackGooglePurchase.access$402(TrackGooglePurchase.this, true);
                try {
                    if (TrackGooglePurchase.access$500(TrackGooglePurchase.this) == null) {
                        TrackGooglePurchase.access$502(TrackGooglePurchase.this, TrackGooglePurchase.access$700(TrackGooglePurchase.access$600()));
                        TrackGooglePurchase.access$500(TrackGooglePurchase.this).setAccessible(true);
                    }
                    var4_1 = TrackGooglePurchase.access$500(TrackGooglePurchase.this);
                    var5_2 = TrackGooglePurchase.access$100(TrackGooglePurchase.this);
                    var6_3 = new Object[]{3, TrackGooglePurchase.access$800(TrackGooglePurchase.this).getPackageName(), "inapp", null};
                    var7_4 = (Bundle)var4_1.invoke(var5_2, var6_3);
                    if (var7_4.getInt("RESPONSE_CODE") == 0) {
                        var8_5 = new ArrayList();
                        var9_6 = new ArrayList();
                        var10_7 = var7_4.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        var11_8 = var7_4.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        var12_9 = 0;
                    }
                    ** GOTO lbl36
                }
                catch (Throwable var2_13) {
                    var2_13.printStackTrace();
                    ** GOTO lbl36
                }
                do {
                    if (var12_9 < var11_8.size()) {
                        var14_10 = (String)var11_8.get(var12_9);
                        var15_11 = (String)var10_7.get(var12_9);
                        var16_12 = new JSONObject(var14_10).getString("purchaseToken");
                        if (!TrackGooglePurchase.access$900(TrackGooglePurchase.this).contains((Object)var16_12) && !var9_6.contains((Object)var16_12)) {
                            var9_6.add((Object)var16_12);
                            var8_5.add((Object)var15_11);
                        }
                    } else {
                        if (var8_5.size() > 0) {
                            TrackGooglePurchase.access$1000(TrackGooglePurchase.this, var8_5, var9_6);
                        } else if (var11_8.size() == 0) {
                            TrackGooglePurchase.access$1102(TrackGooglePurchase.this, false);
                            OneSignalPrefs.saveBool("GTPlayerPurchases", "ExistingPurchases", false);
                        }
lbl36: // 6 sources:
                        TrackGooglePurchase.access$402(TrackGooglePurchase.this, false);
                        return;
                    }
                    ++var12_9;
                } while (true);
            }
        }).start();
    }

    static /* synthetic */ Object access$100(TrackGooglePurchase trackGooglePurchase) {
        return trackGooglePurchase.mIInAppBillingService;
    }

    static /* synthetic */ void access$1000(TrackGooglePurchase trackGooglePurchase, ArrayList arrayList, ArrayList arrayList2) {
        trackGooglePurchase.sendPurchases((ArrayList<String>)arrayList, (ArrayList<String>)arrayList2);
    }

    static /* synthetic */ boolean access$1102(TrackGooglePurchase trackGooglePurchase, boolean bl) {
        trackGooglePurchase.newAsExisting = bl;
        return bl;
    }

    static /* synthetic */ boolean access$402(TrackGooglePurchase trackGooglePurchase, boolean bl) {
        trackGooglePurchase.isWaitingForPurchasesRequest = bl;
        return bl;
    }

    static /* synthetic */ Method access$500(TrackGooglePurchase trackGooglePurchase) {
        return trackGooglePurchase.getPurchasesMethod;
    }

    static /* synthetic */ Method access$502(TrackGooglePurchase trackGooglePurchase, Method method) {
        trackGooglePurchase.getPurchasesMethod = method;
        return method;
    }

    static /* synthetic */ Class access$600() {
        return IInAppBillingServiceClass;
    }

    static /* synthetic */ Method access$700(Class class_) {
        return TrackGooglePurchase.getGetPurchasesMethod(class_);
    }

    static /* synthetic */ Context access$800(TrackGooglePurchase trackGooglePurchase) {
        return trackGooglePurchase.appContext;
    }

    static /* synthetic */ ArrayList access$900(TrackGooglePurchase trackGooglePurchase) {
        return trackGooglePurchase.purchaseTokens;
    }

    private static Method getAsInterfaceMethod(Class class_) {
        for (Method method : class_.getMethods()) {
            Class[] arrclass = method.getParameterTypes();
            if (arrclass.length != 1 || arrclass[0] != IBinder.class) continue;
            return method;
        }
        return null;
    }

    private static Method getGetPurchasesMethod(Class class_) {
        for (Method method : class_.getMethods()) {
            Class[] arrclass = method.getParameterTypes();
            if (arrclass.length != 4 || arrclass[0] != Integer.TYPE || arrclass[1] != String.class || arrclass[2] != String.class || arrclass[3] != String.class) continue;
            return method;
        }
        return null;
    }

    private static Method getGetSkuDetailsMethod(Class class_) {
        for (Method method : class_.getMethods()) {
            Class[] arrclass = method.getParameterTypes();
            Class class_2 = method.getReturnType();
            if (arrclass.length != 4 || arrclass[0] != Integer.TYPE || arrclass[1] != String.class || arrclass[2] != String.class || arrclass[3] != Bundle.class || class_2 != Bundle.class) continue;
            return method;
        }
        return null;
    }

    private void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method method;
                this.getSkuDetailsMethod = method = TrackGooglePurchase.getGetSkuDetailsMethod(IInAppBillingServiceClass);
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            Object object = this.mIInAppBillingService;
            Object[] arrobject = new Object[]{3, this.appContext.getPackageName(), "inapp", bundle};
            Bundle bundle2 = (Bundle)method.invoke(object, arrobject);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList3 = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator iterator = arrayList3.iterator();
                while (iterator.hasNext()) {
                    JSONObject jSONObject = new JSONObject((String)iterator.next());
                    String string2 = jSONObject.getString("productId");
                    BigDecimal bigDecimal = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", (Object)string2);
                    jSONObject2.put("iso", (Object)jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", (Object)bigDecimal.toString());
                    hashMap.put((Object)string2, (Object)jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                for (String string3 : arrayList) {
                    if (!hashMap.containsKey((Object)string3)) continue;
                    jSONArray.put(hashMap.get((Object)string3));
                }
                if (jSONArray.length() > 0) {
                    OneSignalRestClient.ResponseHandler responseHandler = new OneSignalRestClient.ResponseHandler(this, arrayList2){
                        final /* synthetic */ TrackGooglePurchase this$0;
                        final /* synthetic */ ArrayList val$newPurchaseTokens;
                        {
                            this.this$0 = trackGooglePurchase;
                            this.val$newPurchaseTokens = arrayList;
                        }

                        public void onFailure(int n, JSONObject jSONObject, Throwable throwable) {
                            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "HTTP sendPurchases failed to send.", throwable);
                            TrackGooglePurchase.access$402(this.this$0, false);
                        }

                        public void onSuccess(String string2) {
                            TrackGooglePurchase.access$900(this.this$0).addAll((java.util.Collection)this.val$newPurchaseTokens);
                            OneSignalPrefs.saveString("GTPlayerPurchases", "purchaseTokens", TrackGooglePurchase.access$900(this.this$0).toString());
                            OneSignalPrefs.saveBool("GTPlayerPurchases", "ExistingPurchases", true);
                            TrackGooglePurchase.access$1102(this.this$0, false);
                            TrackGooglePurchase.access$402(this.this$0, false);
                        }
                    };
                    OneSignal.sendPurchases(jSONArray, this.newAsExisting, responseHandler);
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Failed to track IAP purchases", throwable);
        }
    }

    void trackIAP() {
        if (this.mServiceConn == null) {
            this.mServiceConn = new ServiceConnection(){

                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
                        Method method = TrackGooglePurchase.getAsInterfaceMethod(Class.forName((String)"com.android.vending.billing.IInAppBillingService$Stub"));
                        method.setAccessible(true);
                        TrackGooglePurchase.this.mIInAppBillingService = method.invoke(null, new Object[]{iBinder});
                        TrackGooglePurchase.this.QueryBoughtItems();
                        return;
                    }
                    catch (Throwable throwable) {
                        throwable.printStackTrace();
                        return;
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    iapEnabled = -99;
                    TrackGooglePurchase.this.mIInAppBillingService = null;
                }
            };
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.appContext.bindService(intent, this.mServiceConn, 1);
            return;
        }
        if (this.mIInAppBillingService != null) {
            this.QueryBoughtItems();
        }
    }

}

