/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.amazon.device.iap.PurchasingListener
 *  com.amazon.device.iap.PurchasingService
 *  com.amazon.device.iap.model.Product
 *  com.amazon.device.iap.model.ProductDataResponse
 *  com.amazon.device.iap.model.ProductDataResponse$RequestStatus
 *  com.amazon.device.iap.model.PurchaseResponse
 *  com.amazon.device.iap.model.PurchaseResponse$RequestStatus
 *  com.amazon.device.iap.model.PurchaseUpdatesResponse
 *  com.amazon.device.iap.model.Receipt
 *  com.amazon.device.iap.model.RequestId
 *  com.amazon.device.iap.model.UserData
 *  com.amazon.device.iap.model.UserDataResponse
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.onesignal.OneSignal;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class TrackAmazonPurchase {
    private boolean canTrack = false;
    private Context context;
    private Field listenerHandlerField;
    private Object listenerHandlerObject;
    private OSPurchasingListener osPurchasingListener;

    TrackAmazonPurchase(Context context) {
        this.context = context;
        try {
            OSPurchasingListener oSPurchasingListener;
            Field field;
            Class class_ = Class.forName((String)"com.amazon.device.iap.internal.d");
            this.listenerHandlerObject = class_.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            this.listenerHandlerField = field = class_.getDeclaredField("f");
            field.setAccessible(true);
            this.osPurchasingListener = oSPurchasingListener = new OSPurchasingListener();
            oSPurchasingListener.orgPurchasingListener = (PurchasingListener)this.listenerHandlerField.get(this.listenerHandlerObject);
            this.canTrack = true;
            this.setListener();
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)noSuchFieldException);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)noSuchMethodException);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)invocationTargetException);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)illegalAccessException);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            TrackAmazonPurchase.logAmazonIAPListenerError((Exception)classNotFoundException);
            return;
        }
    }

    private static void logAmazonIAPListenerError(Exception exception) {
        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error adding Amazon IAP listener.", (Throwable)exception);
        exception.printStackTrace();
    }

    private void setListener() {
        PurchasingService.registerListener((Context)this.context, (PurchasingListener)this.osPurchasingListener);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void checkListener() {
        if (!this.canTrack) {
            return;
        }
        PurchasingListener purchasingListener = (PurchasingListener)this.listenerHandlerField.get(this.listenerHandlerObject);
        OSPurchasingListener oSPurchasingListener = this.osPurchasingListener;
        if (purchasingListener == oSPurchasingListener) return;
        try {
            oSPurchasingListener.orgPurchasingListener = purchasingListener;
            this.setListener();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
    }

    private class OSPurchasingListener
    implements PurchasingListener {
        private String currentMarket;
        private RequestId lastRequestId;
        PurchasingListener orgPurchasingListener;

        private OSPurchasingListener() {
        }

        private String marketToCurrencyCode(String string2) {
            string2.hashCode();
            int n = string2.hashCode();
            int n2 = -1;
            switch (n) {
                default: {
                    break;
                }
                case 2718: {
                    if (!string2.equals((Object)"US")) break;
                    n2 = 9;
                    break;
                }
                case 2374: {
                    if (!string2.equals((Object)"JP")) break;
                    n2 = 8;
                    break;
                }
                case 2347: {
                    if (!string2.equals((Object)"IT")) break;
                    n2 = 7;
                    break;
                }
                case 2267: {
                    if (!string2.equals((Object)"GB")) break;
                    n2 = 6;
                    break;
                }
                case 2252: {
                    if (!string2.equals((Object)"FR")) break;
                    n2 = 5;
                    break;
                }
                case 2222: {
                    if (!string2.equals((Object)"ES")) break;
                    n2 = 4;
                    break;
                }
                case 2177: {
                    if (!string2.equals((Object)"DE")) break;
                    n2 = 3;
                    break;
                }
                case 2142: {
                    if (!string2.equals((Object)"CA")) break;
                    n2 = 2;
                    break;
                }
                case 2128: {
                    if (!string2.equals((Object)"BR")) break;
                    n2 = 1;
                    break;
                }
                case 2100: {
                    if (!string2.equals((Object)"AU")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    return "";
                }
                case 9: {
                    return "USD";
                }
                case 8: {
                    return "JPY";
                }
                case 6: {
                    return "GBP";
                }
                case 3: 
                case 4: 
                case 5: 
                case 7: {
                    return "EUR";
                }
                case 2: {
                    return "CDN";
                }
                case 1: {
                    return "BRL";
                }
                case 0: 
            }
            return "AUD";
        }

        public void onProductDataResponse(ProductDataResponse productDataResponse) {
            RequestId requestId = this.lastRequestId;
            if (requestId != null && requestId.toString().equals((Object)productDataResponse.getRequestId().toString())) {
                try {
                    if (1.$SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[productDataResponse.getRequestStatus().ordinal()] != 1) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    Map map = productDataResponse.getProductData();
                    Iterator iterator = map.keySet().iterator();
                    while (iterator.hasNext()) {
                        Product product = (Product)map.get((Object)((String)iterator.next()));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sku", (Object)product.getSku());
                        jSONObject.put("iso", (Object)this.marketToCurrencyCode(this.currentMarket));
                        String string2 = product.getPrice();
                        if (!string2.matches("^[0-9]")) {
                            string2 = string2.substring(1);
                        }
                        jSONObject.put("amount", (Object)string2);
                        jSONArray.put((Object)jSONObject);
                    }
                    OneSignal.sendPurchases(jSONArray, false, null);
                    return;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                purchasingListener.onProductDataResponse(productDataResponse);
            }
        }

        public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
            PurchasingListener purchasingListener;
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.currentMarket = purchaseResponse.getUserData().getMarketplace();
                HashSet hashSet = new HashSet();
                hashSet.add((Object)purchaseResponse.getReceipt().getSku());
                this.lastRequestId = PurchasingService.getProductData((Set)hashSet);
            }
            if ((purchasingListener = this.orgPurchasingListener) != null) {
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void onUserDataResponse(UserDataResponse userDataResponse) {
            PurchasingListener purchasingListener = this.orgPurchasingListener;
            if (purchasingListener != null) {
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }
    }

}

