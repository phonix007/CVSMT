/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.ValueAnimator
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.webkit.WebView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.PopupWindow
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  androidx.cardview.widget.CardView
 *  androidx.core.widget.PopupWindowCompat
 *  java.lang.Double
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.onesignal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.core.widget.PopupWindowCompat;
import com.onesignal.DraggableRelativeLayout;
import com.onesignal.InAppMessageView;
import com.onesignal.OSUtils;
import com.onesignal.OSViewUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalAnimate;
import com.onesignal.OneSignalBounceInterpolator;
import com.onesignal.WebViewManager;

class InAppMessageView {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int DRAG_THRESHOLD_PX_SIZE = 0;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private static final int MARGIN_PX_SIZE;
    private Activity currentActivity;
    private boolean disableDragDismiss = false;
    private double dismissDuration;
    private WebViewManager.Position displayLocation;
    private DraggableRelativeLayout draggableRelativeLayout;
    private final Handler handler = new Handler();
    private boolean hasBackground;
    private boolean isDragging = false;
    private InAppMessageViewListener messageController;
    private int pageHeight;
    private int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private Runnable scheduleDismissRunnable;
    private boolean shouldDismissWhenActive = false;
    private WebView webView;

    static {
        ACTIVITY_BACKGROUND_COLOR_EMPTY = Color.parseColor((String)"#00000000");
        ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor((String)"#BB000000");
        MARGIN_PX_SIZE = OSViewUtils.dpToPx(24);
        DRAG_THRESHOLD_PX_SIZE = OSViewUtils.dpToPx(4);
    }

    InAppMessageView(WebView webView, WebViewManager.Position position, int n, double d, boolean bl) {
        this.webView = webView;
        this.displayLocation = position;
        this.pageHeight = n;
        this.pageWidth = -1;
        if (Double.isNaN((double)d)) {
            d = 0.0;
        }
        this.dismissDuration = d;
        this.hasBackground = true ^ position.isBanner();
        this.disableDragDismiss = bl;
    }

    static /* synthetic */ void access$1300(InAppMessageView inAppMessageView, WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        inAppMessageView.finishAfterDelay(oneSignalGenericCallback);
    }

    static /* synthetic */ boolean access$1402(InAppMessageView inAppMessageView, boolean bl) {
        inAppMessageView.isDragging = bl;
        return bl;
    }

    private void animateAndDismissLayout(View view, final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter(){

            public void onAnimationEnd(Animator animator) {
                InAppMessageView.this.cleanupViewsAfterDismiss();
                WebViewManager.OneSignalGenericCallback oneSignalGenericCallback2 = oneSignalGenericCallback;
                if (oneSignalGenericCallback2 != null) {
                    oneSignalGenericCallback2.onComplete();
                }
            }
        };
        this.animateBackgroundColor(view, 400, ACTIVITY_BACKGROUND_COLOR_FULL, ACTIVITY_BACKGROUND_COLOR_EMPTY, (Animator.AnimatorListener)animatorListenerAdapter).start();
    }

    private ValueAnimator animateBackgroundColor(View view, int n, int n2, int n3, Animator.AnimatorListener animatorListener) {
        return OneSignalAnimate.animateViewColor(view, n, n2, n3, animatorListener);
    }

    private void animateBottom(View view, int n, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation(view, n + MARGIN_PX_SIZE, 0.0f, 1000, new OneSignalBounceInterpolator(0.1, 8.0), animationListener).start();
    }

    private void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animation = OneSignalAnimate.animateViewSmallToLarge(view, 1000, new OneSignalBounceInterpolator(0.1, 8.0), animationListener);
        ValueAnimator valueAnimator = this.animateBackgroundColor(view2, 400, ACTIVITY_BACKGROUND_COLOR_EMPTY, ACTIVITY_BACKGROUND_COLOR_FULL, animatorListener);
        animation.start();
        valueAnimator.start();
    }

    private void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        CardView cardView = (CardView)view.findViewWithTag((Object)IN_APP_MESSAGE_CARD_VIEW_TAG);
        Animation.AnimationListener animationListener = Build.VERSION.SDK_INT == 23 ? this.createAnimationListenerForAndroidApi23Elevation(cardView) : null;
        int n = 9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    return;
                }
                this.animateCenter(view, view2, animationListener, null);
                return;
            }
            this.animateBottom((View)cardView, this.webView.getHeight(), animationListener);
            return;
        }
        this.animateTop((View)cardView, this.webView.getHeight(), animationListener);
    }

    private void animateTop(View view, int n, Animation.AnimationListener animationListener) {
        OneSignalAnimate.animateViewByTranslation(view, -n - MARGIN_PX_SIZE, 0.0f, 1000, new OneSignalBounceInterpolator(0.1, 8.0), animationListener).start();
    }

    private void cleanupViewsAfterDismiss() {
        this.removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    private Animation.AnimationListener createAnimationListenerForAndroidApi23Elevation(final CardView cardView) {
        return new Animation.AnimationListener(){

            public void onAnimationEnd(Animation animation) {
                cardView.setCardElevation((float)OSViewUtils.dpToPx(5));
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
    }

    private CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        int n = this.displayLocation == WebViewManager.Position.FULL_SCREEN ? -1 : -2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, n);
        layoutParams.addRule(13);
        cardView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation((float)OSViewUtils.dpToPx(5));
        }
        cardView.setRadius((float)OSViewUtils.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        return cardView;
    }

    private DraggableRelativeLayout.Params createDraggableLayoutParams(int n, WebViewManager.Position position, boolean bl) {
        int n2;
        DraggableRelativeLayout.Params params;
        block6 : {
            int n3;
            block3 : {
                block4 : {
                    block5 : {
                        params = new DraggableRelativeLayout.Params();
                        params.maxXPos = n3 = MARGIN_PX_SIZE;
                        params.maxYPos = n3;
                        params.draggingDisabled = bl;
                        params.messageHeight = n;
                        params.height = this.getDisplayYSize();
                        int n4 = 9.$SwitchMap$com$onesignal$WebViewManager$Position[position.ordinal()];
                        if (n4 == (n2 = 1)) break block3;
                        if (n4 == 2) break block4;
                        if (n4 == 3) break block5;
                        if (n4 != 4) break block6;
                        params.messageHeight = n = this.getDisplayYSize() - n3 * 2;
                    }
                    int n5 = this.getDisplayYSize() / 2 - n / 2;
                    params.dragThresholdY = n5 + DRAG_THRESHOLD_PX_SIZE;
                    params.maxYPos = n5;
                    params.posY = n5;
                    break block6;
                }
                params.posY = this.getDisplayYSize() - n;
                params.dragThresholdY = n3 + DRAG_THRESHOLD_PX_SIZE;
                break block6;
            }
            params.dragThresholdY = n3 - DRAG_THRESHOLD_PX_SIZE;
        }
        if (position == WebViewManager.Position.TOP_BANNER) {
            n2 = 0;
        }
        params.dragDirection = n2;
        return params;
    }

    private LinearLayout.LayoutParams createParentLinearLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.pageWidth, -1);
        int n = 9.$SwitchMap$com$onesignal$WebViewManager$Position[this.displayLocation.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    return layoutParams;
                }
                layoutParams.gravity = 17;
                return layoutParams;
            }
            layoutParams.gravity = 81;
            return layoutParams;
        }
        layoutParams.gravity = 49;
        return layoutParams;
    }

    private void createPopupWindow(RelativeLayout relativeLayout) {
        int n;
        block3 : {
            block1 : {
                block2 : {
                    PopupWindow popupWindow;
                    boolean bl = this.hasBackground;
                    int n2 = -1;
                    int n3 = bl ? -1 : this.pageWidth;
                    if (!bl) {
                        n2 = -2;
                    }
                    this.popupWindow = popupWindow = new PopupWindow((View)relativeLayout, n3, n2);
                    popupWindow.setBackgroundDrawable((Drawable)new ColorDrawable(0));
                    this.popupWindow.setTouchable(true);
                    if (this.hasBackground) break block1;
                    int n4 = 9.$SwitchMap$com$onesignal$WebViewManager$Position[this.displayLocation.ordinal()];
                    if (n4 == 1) break block2;
                    if (n4 != 2) break block1;
                    n = 81;
                    break block3;
                }
                n = 49;
                break block3;
            }
            n = 0;
        }
        PopupWindowCompat.setWindowLayoutType((PopupWindow)this.popupWindow, (int)1003);
        this.popupWindow.showAtLocation(this.currentActivity.getWindow().getDecorView().getRootView(), n, 0, 0);
    }

    private void delayShowUntilAvailable(final Activity activity) {
        if (OSViewUtils.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
            this.showInAppMessageView(activity);
            return;
        }
        new Handler().postDelayed(new Runnable(){

            public void run() {
                InAppMessageView.this.delayShowUntilAvailable(activity);
            }
        }, 200L);
    }

    private void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    private void finishAfterDelay(final WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        OSUtils.runOnMainThreadDelayed(new Runnable(){

            public void run() {
                if (InAppMessageView.this.hasBackground && InAppMessageView.this.parentRelativeLayout != null) {
                    InAppMessageView inAppMessageView = InAppMessageView.this;
                    inAppMessageView.animateAndDismissLayout((View)inAppMessageView.parentRelativeLayout, oneSignalGenericCallback);
                    return;
                }
                InAppMessageView.this.cleanupViewsAfterDismiss();
                WebViewManager.OneSignalGenericCallback oneSignalGenericCallback2 = oneSignalGenericCallback;
                if (oneSignalGenericCallback2 != null) {
                    oneSignalGenericCallback2.onComplete();
                }
            }
        }, 600);
    }

    private int getDisplayYSize() {
        return OSViewUtils.getWindowHeight(this.currentActivity);
    }

    private void setUpDraggableLayout(Context context, LinearLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout;
        this.draggableRelativeLayout = draggableRelativeLayout = new DraggableRelativeLayout(context);
        if (layoutParams != null) {
            draggableRelativeLayout.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        this.draggableRelativeLayout.setParams(params);
        this.draggableRelativeLayout.setListener(new DraggableRelativeLayout.DraggableListener(this){
            final /* synthetic */ InAppMessageView this$0;
            {
                this.this$0 = inAppMessageView;
            }

            public void onDismiss() {
                InAppMessageView.access$1300(this.this$0, null);
            }

            public void onDragEnd() {
                InAppMessageView.access$1402(this.this$0, false);
            }

            public void onDragStart() {
                InAppMessageView.access$1402(this.this$0, true);
            }
        });
        if (this.webView.getParent() != null) {
            ((ViewGroup)this.webView.getParent()).removeAllViews();
        }
        CardView cardView = this.createCardView(context);
        cardView.setTag((Object)IN_APP_MESSAGE_CARD_VIEW_TAG);
        cardView.addView((View)this.webView);
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        int n = MARGIN_PX_SIZE;
        draggableRelativeLayout2.setPadding(n, n, n, n);
        this.draggableRelativeLayout.setClipChildren(false);
        this.draggableRelativeLayout.setClipToPadding(false);
        this.draggableRelativeLayout.addView((View)cardView);
    }

    private void setUpParentLinearLayout(Context context) {
        RelativeLayout relativeLayout;
        this.parentRelativeLayout = relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        this.parentRelativeLayout.setClipChildren(false);
        this.parentRelativeLayout.setClipToPadding(false);
        this.parentRelativeLayout.addView((View)this.draggableRelativeLayout);
    }

    private void showDraggableView(final WebViewManager.Position position, final RelativeLayout.LayoutParams layoutParams, final LinearLayout.LayoutParams layoutParams2, final DraggableRelativeLayout.Params params) {
        Runnable runnable = new Runnable(){

            public void run() {
                if (InAppMessageView.this.webView == null) {
                    return;
                }
                InAppMessageView.this.webView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                Context context = InAppMessageView.this.currentActivity.getApplicationContext();
                InAppMessageView.this.setUpDraggableLayout(context, layoutParams2, params);
                InAppMessageView.this.setUpParentLinearLayout(context);
                InAppMessageView inAppMessageView = InAppMessageView.this;
                inAppMessageView.createPopupWindow(inAppMessageView.parentRelativeLayout);
                if (InAppMessageView.this.messageController != null) {
                    InAppMessageView inAppMessageView2 = InAppMessageView.this;
                    inAppMessageView2.animateInAppMessage(position, (View)inAppMessageView2.draggableRelativeLayout, (View)InAppMessageView.this.parentRelativeLayout);
                    InAppMessageView.this.messageController.onMessageWasShown();
                }
                InAppMessageView.this.startDismissTimerIfNeeded();
            }
        };
        OSUtils.runOnMainUIThread(runnable);
    }

    private void startDismissTimerIfNeeded() {
        Runnable runnable;
        if (this.dismissDuration <= 0.0) {
            return;
        }
        if (this.scheduleDismissRunnable != null) {
            return;
        }
        this.scheduleDismissRunnable = runnable = new Runnable(){

            public void run() {
                if (InAppMessageView.this.currentActivity != null) {
                    InAppMessageView.this.dismissAndAwaitNextMessage(null);
                    InAppMessageView.this.scheduleDismissRunnable = null;
                    return;
                }
                InAppMessageView.this.shouldDismissWhenActive = true;
            }
        };
        this.handler.postDelayed(runnable, 1000L * (long)this.dismissDuration);
    }

    void checkIfShouldDismiss() {
        if (this.shouldDismissWhenActive) {
            this.shouldDismissWhenActive = false;
            this.finishAfterDelay(null);
        }
    }

    void dismissAndAwaitNextMessage(WebViewManager.OneSignalGenericCallback oneSignalGenericCallback) {
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout == null) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            this.dereferenceViews();
            if (oneSignalGenericCallback != null) {
                oneSignalGenericCallback.onComplete();
            }
            return;
        }
        draggableRelativeLayout.dismiss();
        this.finishAfterDelay(oneSignalGenericCallback);
    }

    WebViewManager.Position getDisplayPosition() {
        return this.displayLocation;
    }

    boolean isDragging() {
        return this.isDragging;
    }

    void removeAllViews() {
        PopupWindow popupWindow;
        DraggableRelativeLayout draggableRelativeLayout;
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.scheduleDismissRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.scheduleDismissRunnable = null;
        }
        if ((draggableRelativeLayout = this.draggableRelativeLayout) != null) {
            draggableRelativeLayout.removeAllViews();
        }
        if ((popupWindow = this.popupWindow) != null) {
            popupWindow.dismiss();
        }
        this.dereferenceViews();
    }

    void setMessageController(InAppMessageViewListener inAppMessageViewListener) {
        this.messageController = inAppMessageViewListener;
    }

    void setWebView(WebView webView) {
        this.webView = webView;
    }

    void showInAppMessageView(Activity activity) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        LinearLayout.LayoutParams layoutParams2 = this.hasBackground ? this.createParentLinearLayoutParams() : null;
        WebViewManager.Position position = this.displayLocation;
        this.showDraggableView(position, layoutParams, layoutParams2, this.createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss));
    }

    void showView(Activity activity) {
        this.delayShowUntilAvailable(activity);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InAppMessageView{currentActivity=");
        stringBuilder.append((Object)this.currentActivity);
        stringBuilder.append(", pageWidth=");
        stringBuilder.append(this.pageWidth);
        stringBuilder.append(", pageHeight=");
        stringBuilder.append(this.pageHeight);
        stringBuilder.append(", dismissDuration=");
        stringBuilder.append(this.dismissDuration);
        stringBuilder.append(", hasBackground=");
        stringBuilder.append(this.hasBackground);
        stringBuilder.append(", shouldDismissWhenActive=");
        stringBuilder.append(this.shouldDismissWhenActive);
        stringBuilder.append(", isDragging=");
        stringBuilder.append(this.isDragging);
        stringBuilder.append(", disableDragDismiss=");
        stringBuilder.append(this.disableDragDismiss);
        stringBuilder.append(", displayLocation=");
        stringBuilder.append((Object)this.displayLocation);
        stringBuilder.append(", webView=");
        stringBuilder.append((Object)this.webView);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    void updateHeight(final int n) {
        this.pageHeight = n;
        OSUtils.runOnMainUIThread(new Runnable(){

            public void run() {
                if (InAppMessageView.this.webView == null) {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = InAppMessageView.this.webView.getLayoutParams();
                layoutParams.height = n;
                InAppMessageView.this.webView.setLayoutParams(layoutParams);
                if (InAppMessageView.this.draggableRelativeLayout != null) {
                    DraggableRelativeLayout draggableRelativeLayout = InAppMessageView.this.draggableRelativeLayout;
                    InAppMessageView inAppMessageView = InAppMessageView.this;
                    draggableRelativeLayout.setParams(inAppMessageView.createDraggableLayoutParams(n, inAppMessageView.displayLocation, InAppMessageView.this.disableDragDismiss));
                }
            }
        });
    }

    static interface InAppMessageViewListener {
        public void onMessageWasDismissed();

        public void onMessageWasShown();
    }

}

