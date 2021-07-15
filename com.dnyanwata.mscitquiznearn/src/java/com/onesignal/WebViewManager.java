/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Paint
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Base64
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  com.onesignal.ActivityLifecycleHandler$ActivityAvailableListener
 *  com.onesignal.ActivityLifecycleListener
 *  com.onesignal.InAppMessageView
 *  com.onesignal.InAppMessageView$InAppMessageViewListener
 *  com.onesignal.OSInAppMessage
 *  com.onesignal.OSUtils
 *  com.onesignal.OSViewUtils
 *  com.onesignal.OSWebView
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.WebViewManager$2
 *  com.onesignal.WebViewManager$3
 *  com.onesignal.WebViewManager$4
 *  com.onesignal.WebViewManager$5
 *  com.onesignal.WebViewManager$OSJavaScriptInterface
 *  com.onesignal.WebViewManager$OneSignalGenericCallback
 *  com.onesignal.WebViewManager$Position
 *  java.io.UnsupportedEncodingException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.InAppMessageView;
import com.onesignal.OSInAppMessage;
import com.onesignal.OSUtils;
import com.onesignal.OSViewUtils;
import com.onesignal.OSWebView;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Exception performing whole class analysis.
 */
class WebViewManager
extends ActivityLifecycleHandler.ActivityAvailableListener {
    private static final int IN_APP_MESSAGE_INIT_DELAY = 200;
    private static final int MARGIN_PX_SIZE = 0;
    private static final String TAG = "com.onesignal.WebViewManager";
    protected static WebViewManager lastInstance;
    private Activity activity;
    private String currentActivityName;
    private Integer lastPageHeight;
    private OSInAppMessage message;
    private InAppMessageView messageView;
    private OSWebView webView;

    static {
        MARGIN_PX_SIZE = OSViewUtils.dpToPx((int)24);
        lastInstance = null;
    }

    protected WebViewManager(OSInAppMessage oSInAppMessage, Activity activity) {
        this.currentActivityName = null;
        this.lastPageHeight = null;
        this.message = oSInAppMessage;
        this.activity = activity;
    }

    static /* synthetic */ void access$100(WebViewManager webViewManager, Activity activity, String string2) {
        webViewManager.setupWebView(activity, string2);
    }

    static /* synthetic */ InAppMessageView access$200(WebViewManager webViewManager) {
        return webViewManager.messageView;
    }

    static /* synthetic */ void access$300(WebViewManager webViewManager, Position position, int n, boolean bl) {
        webViewManager.createNewInAppMessageView(position, n, bl);
    }

    static /* synthetic */ Activity access$400(WebViewManager webViewManager) {
        return webViewManager.activity;
    }

    static /* synthetic */ int access$500(Activity activity, JSONObject jSONObject) {
        return WebViewManager.pageRectToViewHeight(activity, jSONObject);
    }

    static /* synthetic */ void access$700(WebViewManager webViewManager, Activity activity) {
        webViewManager.setWebViewToMaxSize(activity);
    }

    static /* synthetic */ void access$800(WebViewManager webViewManager, Integer n) {
        webViewManager.showMessageView(n);
    }

    static /* synthetic */ OSWebView access$900(WebViewManager webViewManager) {
        return webViewManager.webView;
    }

    private void blurryRenderingWebViewForKitKatWorkAround(WebView webView) {
        if (Build.VERSION.SDK_INT == 19) {
            webView.setLayerType(1, null);
        }
    }

    private void calculateHeightAndShowWebViewAfterNewActivity() {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView == null) {
            return;
        }
        if (inAppMessageView.getDisplayPosition() == Position.FULL_SCREEN) {
            this.showMessageView(null);
            return;
        }
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"In app message new activity, calculate height and show ");
        OSViewUtils.decorViewReady((Activity)this.activity, (Runnable)new 4(this));
    }

    private void createNewInAppMessageView(Position position, int n, boolean bl) {
        InAppMessageView inAppMessageView;
        this.lastPageHeight = n;
        this.messageView = inAppMessageView = new InAppMessageView((WebView)this.webView, position, n, this.message.getDisplayDuration(), bl);
        inAppMessageView.setMessageController(new InAppMessageView.InAppMessageViewListener(){

            public void onMessageWasDismissed() {
                OneSignal.getInAppMessageController().messageWasDismissed(WebViewManager.this.message);
                WebViewManager.this.removeActivityListener();
            }

            public void onMessageWasShown() {
                OneSignal.getInAppMessageController().onMessageWasShown(WebViewManager.this.message);
            }
        });
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(TAG);
            stringBuilder.append(this.message.messageId);
            activityLifecycleHandler.addActivityAvailableListener(stringBuilder.toString(), this);
        }
    }

    static void dismissCurrentInAppMessage() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ");
        stringBuilder.append((Object)lastInstance);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        WebViewManager webViewManager = lastInstance;
        if (webViewManager != null) {
            webViewManager.dismissAndAwaitNextMessage(null);
        }
    }

    private static void enableWebViewRemoteDebugging() {
        if (Build.VERSION.SDK_INT >= 19 && OneSignal.atLogLevel((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled((boolean)true);
        }
    }

    private static int getWebViewMaxSizeX(Activity activity) {
        return OSViewUtils.getWindowWidth((Activity)activity) - 2 * MARGIN_PX_SIZE;
    }

    private static int getWebViewMaxSizeY(Activity activity) {
        return OSViewUtils.getWindowHeight((Activity)activity) - 2 * MARGIN_PX_SIZE;
    }

    private static void initInAppMessage(Activity activity, OSInAppMessage oSInAppMessage, String string2) {
        try {
            WebViewManager webViewManager;
            String string3 = Base64.encodeToString((byte[])string2.getBytes("UTF-8"), (int)2);
            lastInstance = webViewManager = new WebViewManager(oSInAppMessage, activity);
            OSUtils.runOnMainUIThread((Runnable)new 3(webViewManager, activity, string3));
            return;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"Catch on initInAppMessage: ", (Throwable)unsupportedEncodingException);
            unsupportedEncodingException.printStackTrace();
            return;
        }
    }

    private static int pageRectToViewHeight(Activity activity, JSONObject jSONObject) {
        int n;
        block3 : {
            int n2;
            try {
                n = OSViewUtils.dpToPx((int)jSONObject.getJSONObject("rect").getInt("height"));
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getPageHeightData:pxHeight: ");
                stringBuilder.append(n);
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                n2 = WebViewManager.getWebViewMaxSizeY(activity);
                if (n <= n2) break block3;
            }
            catch (JSONException jSONException) {
                OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"pageRectToViewHeight could not get page height", (Throwable)jSONException);
                return -1;
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getPageHeightData:pxHeight is over screen max: ");
            stringBuilder.append(n2);
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            n = n2;
        }
        return n;
    }

    private void removeActivityListener() {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(TAG);
            stringBuilder.append(this.message.messageId);
            activityLifecycleHandler.removeActivityAvailableListener(stringBuilder.toString());
        }
    }

    private void setWebViewToMaxSize(Activity activity) {
        this.webView.layout(0, 0, WebViewManager.getWebViewMaxSizeX(activity), WebViewManager.getWebViewMaxSizeY(activity));
    }

    private void setupWebView(Activity activity, String string2) {
        OSWebView oSWebView;
        WebViewManager.enableWebViewRemoteDebugging();
        this.webView = oSWebView = new OSWebView((Context)activity);
        oSWebView.setOverScrollMode(2);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.addJavascriptInterface((Object)new /* Unavailable Anonymous Inner Class!! */, "OSAndroid");
        this.blurryRenderingWebViewForKitKatWorkAround((WebView)this.webView);
        OSViewUtils.decorViewReady((Activity)activity, (Runnable)new 5(this, activity, string2));
    }

    static void showHTMLString(final OSInAppMessage oSInAppMessage, final String string2) {
        final Activity activity = OneSignal.getCurrentActivity();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in app message showHTMLString on currentActivity: ");
        stringBuilder.append((Object)activity);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (activity != null) {
            if (lastInstance != null && oSInAppMessage.isPreview) {
                lastInstance.dismissAndAwaitNextMessage(new OneSignalGenericCallback(){

                    public void onComplete() {
                        WebViewManager.lastInstance = null;
                        WebViewManager.initInAppMessage(activity, oSInAppMessage, string2);
                    }
                });
                return;
            }
            WebViewManager.initInAppMessage(activity, oSInAppMessage, string2);
            return;
        }
        Looper.prepare();
        new Handler().postDelayed((Runnable)new 2(oSInAppMessage, string2), 200L);
    }

    private void showMessageView(Integer n) {
        if (this.messageView == null) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.WARN, (String)"No messageView found to update a with a new height.");
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In app message, showing first one with height: ");
        stringBuilder.append((Object)n);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.messageView.setWebView((WebView)this.webView);
        if (n != null) {
            this.lastPageHeight = n;
            this.messageView.updateHeight(n.intValue());
        }
        this.messageView.showView(this.activity);
        this.messageView.checkIfShouldDismiss();
    }

    void available(Activity activity) {
        String string2 = this.currentActivityName;
        this.activity = activity;
        this.currentActivityName = activity.getLocalClassName();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In app message activity available currentActivityName: ");
        stringBuilder.append(this.currentActivityName);
        stringBuilder.append(" lastActivityName: ");
        stringBuilder.append(string2);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (string2 == null) {
            this.showMessageView(null);
            return;
        }
        if (!string2.equals((Object)this.currentActivityName)) {
            InAppMessageView inAppMessageView = this.messageView;
            if (inAppMessageView != null) {
                inAppMessageView.removeAllViews();
            }
            this.showMessageView(this.lastPageHeight);
            return;
        }
        this.calculateHeightAndShowWebViewAfterNewActivity();
    }

    protected void dismissAndAwaitNextMessage(final OneSignalGenericCallback oneSignalGenericCallback) {
        InAppMessageView inAppMessageView = this.messageView;
        if (inAppMessageView == null) {
            if (oneSignalGenericCallback != null) {
                oneSignalGenericCallback.onComplete();
            }
            return;
        }
        inAppMessageView.dismissAndAwaitNextMessage(new OneSignalGenericCallback(){

            public void onComplete() {
                WebViewManager.this.messageView = null;
                OneSignalGenericCallback oneSignalGenericCallback2 = oneSignalGenericCallback;
                if (oneSignalGenericCallback2 != null) {
                    oneSignalGenericCallback2.onComplete();
                }
            }
        });
    }

    void lostFocus() {
        OneSignal.getInAppMessageController().messageWasDismissedByBackPress(this.message);
        this.removeActivityListener();
        this.messageView = null;
    }

    void stopped(Activity activity) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In app message activity stopped, cleaning views, currentActivityName: ");
        stringBuilder.append(this.currentActivityName);
        stringBuilder.append("\nactivity: ");
        stringBuilder.append((Object)this.activity);
        stringBuilder.append("\nmessageView: ");
        stringBuilder.append((Object)this.messageView);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (this.messageView != null && activity.getLocalClassName().equals((Object)this.currentActivityName)) {
            this.messageView.removeAllViews();
        }
    }

}

