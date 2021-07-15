/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSReceiveReceiptRepository;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;

class OSReceiveReceiptController {
    private static OSReceiveReceiptController sInstance;
    private final OSReceiveReceiptRepository repository = new OSReceiveReceiptRepository();

    private OSReceiveReceiptController() {
    }

    public static OSReceiveReceiptController getInstance() {
        Class<OSReceiveReceiptController> class_ = OSReceiveReceiptController.class;
        synchronized (OSReceiveReceiptController.class) {
            if (sInstance == null) {
                sInstance = new OSReceiveReceiptController();
            }
            OSReceiveReceiptController oSReceiveReceiptController = sInstance;
            // ** MonitorExit[var2] (shouldn't be in output)
            return oSReceiveReceiptController;
        }
    }

    private boolean isReceiveReceiptEnabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    void sendReceiveReceipt(String string2) {
        String string3 = OneSignal.appId != null && !OneSignal.appId.isEmpty() ? OneSignal.appId : OneSignal.getSavedAppId();
        String string4 = OneSignal.getUserId();
        if (!this.isReceiveReceiptEnabled()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "sendReceiveReceipt disable");
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sendReceiveReceipt appId: ");
        stringBuilder.append(string3);
        stringBuilder.append(" playerId: ");
        stringBuilder.append(string4);
        stringBuilder.append(" notificationId: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        this.repository.sendReceiveReceipt(string3, string4, string2, new OneSignalRestClient.ResponseHandler(this, string2){
            final /* synthetic */ OSReceiveReceiptController this$0;
            final /* synthetic */ String val$notificationId;
            {
                this.this$0 = oSReceiveReceiptController;
                this.val$notificationId = string2;
            }

            void onFailure(int n, String string2, java.lang.Throwable throwable) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Receive receipt failed with statusCode: ");
                stringBuilder.append(n);
                stringBuilder.append(" response: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            }

            void onSuccess(String string2) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Receive receipt sent for notificationID: ");
                stringBuilder.append(this.val$notificationId);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            }
        });
    }
}

